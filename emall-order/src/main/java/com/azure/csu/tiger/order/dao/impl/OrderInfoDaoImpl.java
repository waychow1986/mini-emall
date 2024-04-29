package com.azure.csu.tiger.order.dao.impl;

import com.azure.csu.tiger.order.dao.OrderInfoDao;
import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static com.azure.csu.tiger.order.jooq.Tables.ORDER_INFO;

@Repository
public class OrderInfoDaoImpl implements OrderInfoDao {

    @Autowired
    private DSLContext context;

    @Override
    public Long createOrderInfo(OrderInfoRecord record) {
        if (record == null) {
            return null;
        }
        return context.insertInto(ORDER_INFO).set(record).returning(ORDER_INFO.ID).fetchOne().getId();
    }
}
