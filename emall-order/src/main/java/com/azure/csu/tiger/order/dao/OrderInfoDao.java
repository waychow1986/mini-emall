package com.azure.csu.tiger.order.dao;

import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;

import java.util.List;

public interface OrderInfoDao {

    Long createOrderInfo(OrderInfoRecord record);

    OrderInfoRecord findOrderInfo(Long id);
}
