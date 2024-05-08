package com.azure.csu.tiger.order.dao.impl;

import com.azure.csu.tiger.order.dao.OrderInfoDao;
import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public OrderInfoRecord findOrderInfo(Long id) {
        if (id == null) {
            return null;
        }

        List<OrderInfoRecord> orderInfoRecords = context.select().from(ORDER_INFO).where(ORDER_INFO.ID.eq(id)).fetchInto(OrderInfoRecord.class);
        if (orderInfoRecords.isEmpty()) {
            return null;
        }
        return orderInfoRecords.get(0);
//        return context.select().from(ORDER_INFO).where(ORDER_INFO.ID.eq(id)).fetchSingleInto(OrderInfoRecord.class);
    }
}
