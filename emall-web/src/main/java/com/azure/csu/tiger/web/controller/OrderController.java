package com.azure.csu.tiger.web.controller;

import com.azure.csu.tiger.common.utils.SourceType;
import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.web.vo.CartDetailVO;
import com.azure.csu.tiger.web.vo.OrderInfoVO;
import com.azure.csu.tiger.web.vo.OrderItemVO;
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
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@Api(tags = "Order Rest API interface")
@RefreshScope
@Controller
public class OrderController {

    private static final Logger logger = LoggerFactory.getLogger(OrderController.class);

    @GrpcClient("emall-product")
    private ProductGrpc.ProductBlockingStub productStub;

    @GrpcClient("emall-order")
    private OrderGrpc.OrderBlockingStub orderStub;

    @ApiOperation(value = "订单详情查询", notes = "Mysql与Redis混合查询")
    @GetMapping("/order/detail")
    public ResponseEntity<OrderInfoVO> findOrderInfo(@RequestParam(required = true) Long orderId) {

        if (orderId == null) {
            return ResponseEntity.badRequest().build();
        }

        GetOrderResponse orderResponse = orderStub.getOrder(GetOrderRequest.newBuilder().setOrderId(orderId).build());

        List<Long> skuIds = orderResponse.getData().getSkuDataList().stream().map(OrderItemSku::getSkuId).collect(Collectors.toList());

        ListSkuInfoResponse skuInfoResponse = productStub.listSkuInfo(ListSkuRequest.newBuilder().addAllSkuId(skuIds).build());
        Map<Long, String> skuMap = skuInfoResponse.getDatasList().stream().collect(Collectors.toMap(i -> i.getSkuId(), i -> i.getName()));

        OrderInfoVO orderInfoVO = OrderInfoVO.from(orderResponse.getData());
        List<OrderItemVO> itemVOS = orderResponse.getData().getSkuDataList().stream().map(i -> {
            OrderItemVO orderItemVO = OrderItemVO.from(i);
            orderItemVO.setSkuName(skuMap.get(orderItemVO.getSkuId()));
            return orderItemVO;
        }).collect(Collectors.toList());
        orderInfoVO.setSkuItems(itemVOS);

        return ResponseEntity.ok(orderInfoVO);

    }

}
