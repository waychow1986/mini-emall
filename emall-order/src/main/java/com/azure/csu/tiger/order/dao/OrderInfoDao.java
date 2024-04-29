package com.azure.csu.tiger.order.dao;

import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;

public interface OrderInfoDao {

    Long createOrderInfo(OrderInfoRecord record);
}
