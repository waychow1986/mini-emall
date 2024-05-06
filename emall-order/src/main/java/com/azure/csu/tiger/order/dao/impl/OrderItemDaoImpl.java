package com.azure.csu.tiger.order.dao.impl;

import com.azure.csu.tiger.order.dao.OrderItemDao;
import com.azure.csu.tiger.order.jooq.tables.records.OrderItemRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep3;
import org.jooq.InsertValuesStep7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.order.jooq.Tables.ORDER_ITEM;

@Repository
public class OrderItemDaoImpl implements OrderItemDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createOrderItem(List<OrderItemRecord> items) {
        InsertValuesStep7<OrderItemRecord, Long, Long, Long, Integer, Long, Long, Long> valuesStep7 = context.insertInto(ORDER_ITEM)
                .columns(ORDER_ITEM.ORDER_ID, ORDER_ITEM.SKU_ID, ORDER_ITEM.SKU_PRICE, ORDER_ITEM.SKU_NUM, ORDER_ITEM.SPLIT_COUPON_AMOUNT, ORDER_ITEM.CREATE_USER_ID, ORDER_ITEM.MODIFY_USER_ID);
        items.stream().forEach(r -> valuesStep7.values(r.getOrderId(), r.getSkuId(), r.getSkuPrice(), r.getSkuNum(), r.getSplitCouponAmount(), r.getCreateUserId(), r.getModifyUserId()));

        valuesStep7.execute();
    }

    @Override
    public List<OrderItemRecord> listOrderItems(Long orderId) {
        if (orderId == null) {
            return Collections.emptyList();
        }

        return context.select().from(ORDER_ITEM).where(ORDER_ITEM.ORDER_ID.eq(orderId)).fetchInto(OrderItemRecord.class);
    }
}
