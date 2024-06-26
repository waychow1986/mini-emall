package com.azure.csu.tiger.web.controller;

import com.azure.csu.tiger.common.utils.SourceType;
import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.web.vo.CartDetailVO;
import com.google.common.collect.Lists;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@Api(tags = "Cart Rest API interface")
@RefreshScope
@Controller
public class CartController {

    private static final Logger logger = LoggerFactory.getLogger(CartController.class);

    @GrpcClient("emall-user")
    private UserGrpc.UserBlockingStub userStub;

    @GrpcClient("emall-product")
    private ProductGrpc.ProductBlockingStub productStub;

    @GrpcClient("emall-order")
    private OrderGrpc.OrderBlockingStub orderStub;

    @ApiOperation(value = "添加购物车", notes = "Redis与Mysql双写")
    @GetMapping("/cart/add")
    public ResponseEntity<String> addCart(@RequestParam(required = true) Long uid, @RequestParam(required = true) Long skuId) throws ExecutionException, InterruptedException {

        if (uid == null || skuId == null) {
            return ResponseEntity.badRequest().build();
        }

        ListSkuInfoResponse listSkuInfoResponse = productStub.listSkuInfo(ListSkuRequest.newBuilder().addAllSkuId(Lists.newArrayList(skuId)).build());
        if (!listSkuInfoResponse.getSuccess()) {
            ResponseEntity.badRequest().build();
        }
        SkuInfo skuInfo = listSkuInfoResponse.getDatasList().get(0);
        if (skuInfo != null && skuInfo.getStock() > 0) {

            AddCartResponse addCartResponse = userStub.addCart(AddCartRequest.newBuilder().setUid(uid).setSkuId(skuId).setSkuInfo(skuInfo).build());

            if (addCartResponse.getSuccess()) {
                return ResponseEntity.ok().build();
            }
        }

        return ResponseEntity.badRequest().build();
    }

    @ApiOperation(value = "购物车查询", notes = "纯Redis查询")
    @GetMapping("/cart/list")
    public ResponseEntity<List<CartDetailVO>> listCart(@RequestParam(required = true) Long uid) {

        if (uid == null) {
            return ResponseEntity.badRequest().build();
        }

        ListCartResponse listCartResponse = userStub.listCart(ListCartRequest.newBuilder().setUid(uid).build());

        if (listCartResponse.getSuccess()) {
            return ResponseEntity.ok(listCartResponse.getDatasList().stream().map( data -> CartDetailVO.from(data)).collect(Collectors.toList()));
        }

        return ResponseEntity.badRequest().build();
    }

    @ApiOperation(value = "清空购物车", notes = "Redis读写, Mysql写")
    @GetMapping("/cart/clear")
    public ResponseEntity<String> clearCart(@RequestParam(required = true) Long uid) {

        if (uid == null) {
            return ResponseEntity.badRequest().build();
        }

        ListCartResponse listCartResponse = userStub.listCart(ListCartRequest.newBuilder().setUid(uid).build());

        if (!listCartResponse.getSuccess()) {
            return ResponseEntity.ok("no product in Cart");
        }

        List<CartItem> cartItems = listCartResponse.getDatasList();

        if(cartItems.isEmpty()) {
            return ResponseEntity.ok("no product in Cart");
        }

        List<OrderItemSku> orderItems = Lists.newArrayList();

        Long totalPrice = 0L;

        for (CartItem i : cartItems) {
            OrderItemSku orderItemSku = OrderItemSku.newBuilder().setSkuId(i.getSkuId()).setSkuName(i.getName()).setSkuNum(i.getSkuNum()).setSkuPrice(i.getPrice()).setSplitCouponAmount(0).build();
            orderItems.add(orderItemSku);
            totalPrice = totalPrice + i.getPrice() * i.getSkuNum();
        }

        CreateOrderRequest createOrderRequest = CreateOrderRequest.newBuilder().setUserId(uid).setAddressId(1).setComment("order test").setCouponAmount(0).setShippingAmount(0)
                .setSourceType(SourceType.PC.getType()).setTotalAmount(totalPrice).setPayAmount(totalPrice).addAllSkuData(orderItems).build();

        CreateOrderResponse orderResponse = orderStub.createOrder(createOrderRequest);

        ClearCartResponse clearCartResponse = userStub.clearCart(ClearCartRequest.newBuilder().setUid(uid).build());
        if (orderResponse.getSuccess() && clearCartResponse.getSuccess()) {
            return ResponseEntity.ok().build();
        }

        return ResponseEntity.badRequest().build();
    }
}
