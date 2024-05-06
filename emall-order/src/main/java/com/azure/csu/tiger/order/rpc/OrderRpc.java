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

import java.util.List;
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
    public void getOrder(GetOrderRequest request, StreamObserver<GetOrderResponse> responseObserver) {
        OrderInfo orderInfo = orderService.getOrderInfo(request.getOrderId());
        List<OrderItemSku> orderItems = orderService.getOrderItems(request.getOrderId());
        orderInfo.getSkuDataList().addAll(orderItems);

        GetOrderResponse response = GetOrderResponse.newBuilder().setSuccess(true).setCode(Constant.SUCCESS).setData(orderInfo).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

}
