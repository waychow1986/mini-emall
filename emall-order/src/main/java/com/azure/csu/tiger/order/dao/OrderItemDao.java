package com.azure.csu.tiger.order.dao;

import com.azure.csu.tiger.order.jooq.tables.records.OrderItemRecord;

import java.util.List;

public interface OrderItemDao {

    void createOrderItem(List<OrderItemRecord> items);
}
