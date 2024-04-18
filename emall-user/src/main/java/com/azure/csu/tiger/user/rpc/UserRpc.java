package com.azure.csu.tiger.user.rpc;

import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.user.dto.CartDetailDTO;
import com.azure.csu.tiger.user.service.CartDetailService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class UserRpc extends UserGrpc.UserImplBase {

    @Autowired
    private CartDetailService cartDetailService;

    @Override
    public void addCart(AddCartRequest request, StreamObserver<AddCartResponse> responseObserver) {
        Long uid = request.getUid();
        Long skuId = request.getSkuId();

        cartDetailService.addCart(uid, skuId);

        AddCartResponse response = AddCartResponse.newBuilder().setSuccess(true).setCode(Constant.SUCCESS).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listCart(ListCartRequest request, StreamObserver<ListCartResponse> responseObserver) {
        Long uid = request.getUid();

        List<CartDetailDTO> detailDTOS = cartDetailService.getCartDetail(uid);
        List<CartItem> cartItemList = detailDTOS.stream().map(dto -> dto.toGrpcCartItem()).collect(Collectors.toList());

        ListCartResponse response = ListCartResponse.newBuilder().setSuccess(true).setCode(Constant.SUCCESS).addAllDatas(cartItemList).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
