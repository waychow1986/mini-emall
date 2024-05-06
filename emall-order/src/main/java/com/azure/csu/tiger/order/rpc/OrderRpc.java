package com.azure.csu.tiger.order.rpc;

import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.grpc.lib.*;
import com.azure.csu.tiger.order.dto.OrderInfoDto;
import com.azure.csu.tiger.order.dto.OrderItemDto;
import com.azure.csu.tiger.order.service.OrderService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

@GrpcService
public class OrderRpc extends OrderGrpc.OrderImplBase {

    private static final Logger logger = LoggerFactory.getLogger(OrderRpc.class);

    @Autowired
    private OrderService orderService;

    @Override
    public void createOrder(CreateOrderRequest request, StreamObserver<CreateOrderResponse> responseObserver) {

        orderService.createOrder(OrderInfoDto.from(request), request.getSkuDataList().stream().map(i -> OrderItemDto.fromGrpcOrderItem(i)).collect(Collectors.toList()));

        CreateOrderResponse response = CreateOrderResponse.newBuilder().setSuccess(true).setCode(Constant.SUCCESS).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void listOrder(ListOrderRequest request, StreamObserver<ListOrderResponse> responseObserver) {
        super.listOrder(request, responseObserver);
    }
}
