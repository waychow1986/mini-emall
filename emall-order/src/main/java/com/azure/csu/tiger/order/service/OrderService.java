package com.azure.csu.tiger.order.service;

import com.azure.csu.tiger.order.dto.OrderInfoDto;
import com.azure.csu.tiger.order.dto.OrderItemDto;

import java.util.List;

public interface OrderService {

    Long createOrder(OrderInfoDto dto, List<OrderItemDto> items);
}
