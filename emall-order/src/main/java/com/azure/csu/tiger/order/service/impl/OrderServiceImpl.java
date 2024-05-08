package com.azure.csu.tiger.order.service.impl;

import com.azure.csu.tiger.common.utils.OrderNoGenerator;
import com.azure.csu.tiger.common.utils.OrderStatus;
import com.azure.csu.tiger.grpc.lib.OrderInfo;
import com.azure.csu.tiger.grpc.lib.OrderItemSku;
import com.azure.csu.tiger.order.dao.OrderInfoDao;
import com.azure.csu.tiger.order.dao.OrderItemDao;
import com.azure.csu.tiger.order.dto.OrderInfoDto;
import com.azure.csu.tiger.order.dto.OrderItemDto;
import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;
import com.azure.csu.tiger.order.jooq.tables.records.OrderItemRecord;
import com.azure.csu.tiger.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderInfoDao orderInfoDao;

    @Autowired
    private OrderItemDao orderItemDao;

    @Override
    public Long createOrder(OrderInfoDto dto, List<OrderItemDto> items) {
        if (dto == null || CollectionUtils.isEmpty(items)) {
            return null;
        }
        dto.setStatus(OrderStatus.PRE_PAY.getType());
        dto.setOrderSn(OrderNoGenerator.generateOrder());
        Long id = orderInfoDao.createOrderInfo(dto.toRecord());
        List<OrderItemRecord> itemRecordList = items.stream().map(i -> {
            OrderItemRecord orderItemRecord = i.toRecord(id);
            orderItemRecord.setCreateUserId(dto.getUserId());
            orderItemRecord.setModifyUserId(dto.getUserId());
            return orderItemRecord;
        }).collect(Collectors.toList());
        orderItemDao.createOrderItem(itemRecordList);
        return id;
    }

    @Override
    public OrderInfo getOrderInfo(Long id) {
        if (id == null) {
            return null;
        }
        OrderInfoRecord orderInfoRecord = orderInfoDao.findOrderInfo(id);
        List<OrderItemRecord> orderItemRecords = orderItemDao.listOrderItems(id);

        List<OrderItemSku> orderItemSkus = orderItemRecords.stream().map(i -> OrderItemDto.transformRecordToGrpc(i)).collect(Collectors.toList());
        OrderInfo orderInfo = OrderInfoDto.transformRecordToGrpc(orderInfoRecord, orderItemSkus);

        return orderInfo;
    }

}
