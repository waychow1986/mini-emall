package com.azure.csu.tiger.order.service;

import com.azure.csu.tiger.grpc.lib.OrderInfo;
import com.azure.csu.tiger.grpc.lib.OrderItemSku;
import com.azure.csu.tiger.order.dto.OrderInfoDto;
import com.azure.csu.tiger.order.dto.OrderItemDto;

import java.util.List;

public interface OrderService {

    Long createOrder(OrderInfoDto dto, List<OrderItemDto> items);

    OrderInfo getOrderInfo(Long id);

    List<OrderItemSku> getOrderItems(Long orderId);
}
