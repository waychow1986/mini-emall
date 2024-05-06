/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.order.jooq.tables.records;


import com.azure.csu.tiger.order.jooq.tables.OrderItem;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 订单条目表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderItemRecord extends UpdatableRecordImpl<OrderItemRecord> implements Record10<Long, Long, Long, Long, Integer, Long, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>order_center.order_item.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>order_center.order_item.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>order_center.order_item.order_id</code>. 订单id
     */
    public void setOrderId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>order_center.order_item.order_id</code>. 订单id
     */
    public Long getOrderId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>order_center.order_item.sku_id</code>. 商品id
     */
    public void setSkuId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>order_center.order_item.sku_id</code>. 商品id
     */
    public Long getSkuId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>order_center.order_item.sku_price</code>. 购买时商品价格
     */
    public void setSkuPrice(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>order_center.order_item.sku_price</code>. 购买时商品价格
     */
    public Long getSkuPrice() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>order_center.order_item.sku_num</code>. 购买数量
     */
    public void setSkuNum(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>order_center.order_item.sku_num</code>. 购买数量
     */
    public Integer getSkuNum() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>order_center.order_item.split_coupon_amount</code>. 优惠券平摊金额
     */
    public void setSplitCouponAmount(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>order_center.order_item.split_coupon_amount</code>. 优惠券平摊金额
     */
    public Long getSplitCouponAmount() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>order_center.order_item.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>order_center.order_item.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>order_center.order_item.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>order_center.order_item.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>order_center.order_item.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>order_center.order_item.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>order_center.order_item.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>order_center.order_item.modify_user_id</code>.
     */
    public Long getModifyUserId() {
        return (Long) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, Long, Integer, Long, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Long, Long, Long, Integer, Long, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return OrderItem.ORDER_ITEM.ID;
    }

    @Override
    public Field<Long> field2() {
        return OrderItem.ORDER_ITEM.ORDER_ID;
    }

    @Override
    public Field<Long> field3() {
        return OrderItem.ORDER_ITEM.SKU_ID;
    }

    @Override
    public Field<Long> field4() {
        return OrderItem.ORDER_ITEM.SKU_PRICE;
    }

    @Override
    public Field<Integer> field5() {
        return OrderItem.ORDER_ITEM.SKU_NUM;
    }

    @Override
    public Field<Long> field6() {
        return OrderItem.ORDER_ITEM.SPLIT_COUPON_AMOUNT;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return OrderItem.ORDER_ITEM.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return OrderItem.ORDER_ITEM.MODIFY_TIME;
    }

    @Override
    public Field<Long> field9() {
        return OrderItem.ORDER_ITEM.CREATE_USER_ID;
    }

    @Override
    public Field<Long> field10() {
        return OrderItem.ORDER_ITEM.MODIFY_USER_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getOrderId();
    }

    @Override
    public Long component3() {
        return getSkuId();
    }

    @Override
    public Long component4() {
        return getSkuPrice();
    }

    @Override
    public Integer component5() {
        return getSkuNum();
    }

    @Override
    public Long component6() {
        return getSplitCouponAmount();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component8() {
        return getModifyTime();
    }

    @Override
    public Long component9() {
        return getCreateUserId();
    }

    @Override
    public Long component10() {
        return getModifyUserId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getOrderId();
    }

    @Override
    public Long value3() {
        return getSkuId();
    }

    @Override
    public Long value4() {
        return getSkuPrice();
    }

    @Override
    public Integer value5() {
        return getSkuNum();
    }

    @Override
    public Long value6() {
        return getSplitCouponAmount();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value8() {
        return getModifyTime();
    }

    @Override
    public Long value9() {
        return getCreateUserId();
    }

    @Override
    public Long value10() {
        return getModifyUserId();
    }

    @Override
    public OrderItemRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public OrderItemRecord value2(Long value) {
        setOrderId(value);
        return this;
    }

    @Override
    public OrderItemRecord value3(Long value) {
        setSkuId(value);
        return this;
    }

    @Override
    public OrderItemRecord value4(Long value) {
        setSkuPrice(value);
        return this;
    }

    @Override
    public OrderItemRecord value5(Integer value) {
        setSkuNum(value);
        return this;
    }

    @Override
    public OrderItemRecord value6(Long value) {
        setSplitCouponAmount(value);
        return this;
    }

    @Override
    public OrderItemRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public OrderItemRecord value8(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public OrderItemRecord value9(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public OrderItemRecord value10(Long value) {
        setModifyUserId(value);
        return this;
    }

    @Override
    public OrderItemRecord values(Long value1, Long value2, Long value3, Long value4, Integer value5, Long value6, LocalDateTime value7, LocalDateTime value8, Long value9, Long value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderItemRecord
     */
    public OrderItemRecord() {
        super(OrderItem.ORDER_ITEM);
    }

    /**
     * Create a detached, initialised OrderItemRecord
     */
    public OrderItemRecord(Long id, Long orderId, Long skuId, Long skuPrice, Integer skuNum, Long splitCouponAmount, LocalDateTime createTime, LocalDateTime modifyTime, Long createUserId, Long modifyUserId) {
        super(OrderItem.ORDER_ITEM);

        setId(id);
        setOrderId(orderId);
        setSkuId(skuId);
        setSkuPrice(skuPrice);
        setSkuNum(skuNum);
        setSplitCouponAmount(splitCouponAmount);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}