package com.azure.csu.tiger.web.controller;

import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.web.vo.CartDetailVO;
import com.azure.csu.tiger.web.vo.CategoryVO;
import com.google.common.collect.Lists;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@RefreshScope
@Controller
public class CartController {

    @GrpcClient("emall-user")
    private UserGrpc.UserBlockingStub userStub;

    @GrpcClient("emall-product")
    private ProductGrpc.ProductBlockingStub productStub;

    @RequestMapping("/cart/add")
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

    @RequestMapping("/cart/list")
    public ResponseEntity<List<CartDetailVO>> listCart(@RequestParam(required = true) Long uid) throws ExecutionException, InterruptedException {

        if (uid == null) {
            return ResponseEntity.badRequest().build();
        }

        ListCartResponse listCartResponse = userStub.listCart(ListCartRequest.newBuilder().setUid(uid).build());

        if (listCartResponse.getSuccess()) {
            return ResponseEntity.ok(listCartResponse.getDatasList().stream().map( data -> CartDetailVO.from(data)).collect(Collectors.toList()));
        }

        return ResponseEntity.badRequest().build();
    }
}
