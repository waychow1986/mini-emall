/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.order.jooq.tables.records;


import com.azure.csu.tiger.order.jooq.tables.OrderInfo;

import java.time.LocalDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 订单表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderInfoRecord extends UpdatableRecordImpl<OrderInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>order_center.order_info.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>order_center.order_info.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>order_center.order_info.parent_order_id</code>. 父订单id
     */
    public void setParentOrderId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>order_center.order_info.parent_order_id</code>. 父订单id
     */
    public Long getParentOrderId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>order_center.order_info.order_sn</code>. 订单编号
     */
    public void setOrderSn(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>order_center.order_info.order_sn</code>. 订单编号
     */
    public String getOrderSn() {
        return (String) get(2);
    }

    /**
     * Setter for <code>order_center.order_info.user_id</code>. 用户id
     */
    public void setUserId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>order_center.order_info.user_id</code>. 用户id
     */
    public Long getUserId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>order_center.order_info.address_id</code>. 地址id
     */
    public void setAddressId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>order_center.order_info.address_id</code>. 地址id
     */
    public Long getAddressId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>order_center.order_info.status</code>. 待支付-0，待发货-1，待收货-2，已完成-3，已取消-4
     */
    public void setStatus(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>order_center.order_info.status</code>. 待支付-0，待发货-1，待收货-2，已完成-3，已取消-4
     */
    public Byte getStatus() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>order_center.order_info.source_type</code>. 订单来源 PC-0，Android-1，iOS-2，WeChat-3
     */
    public void setSourceType(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>order_center.order_info.source_type</code>. 订单来源 PC-0，Android-1，iOS-2，WeChat-3
     */
    public Byte getSourceType() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>order_center.order_info.total_amount</code>. 订单总金额
     */
    public void setTotalAmount(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>order_center.order_info.total_amount</code>. 订单总金额
     */
    public Long getTotalAmount() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>order_center.order_info.coupon_amount</code>. 优惠券总金额
     */
    public void setCouponAmount(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>order_center.order_info.coupon_amount</code>. 优惠券总金额
     */
    public Long getCouponAmount() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>order_center.order_info.shipping_amount</code>. 运费金额
     */
    public void setShippingAmount(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>order_center.order_info.shipping_amount</code>. 运费金额
     */
    public Long getShippingAmount() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>order_center.order_info.pay_amount</code>. 实付金额
     */
    public void setPayAmount(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>order_center.order_info.pay_amount</code>. 实付金额
     */
    public Long getPayAmount() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>order_center.order_info.shipping_no</code>. 物流单号
     */
    public void setShippingNo(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>order_center.order_info.shipping_no</code>. 物流单号
     */
    public String getShippingNo() {
        return (String) get(11);
    }

    /**
     * Setter for <code>order_center.order_info.payment_type</code>. 支付宝-0，微信-1，银联-2
     */
    public void setPaymentType(Byte value) {
        set(12, value);
    }

    /**
     * Getter for <code>order_center.order_info.payment_type</code>. 支付宝-0，微信-1，银联-2
     */
    public Byte getPaymentType() {
        return (Byte) get(12);
    }

    /**
     * Setter for <code>order_center.order_info.payment_time</code>. 支付时间
     */
    public void setPaymentTime(LocalDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>order_center.order_info.payment_time</code>. 支付时间
     */
    public LocalDateTime getPaymentTime() {
        return (LocalDateTime) get(13);
    }

    /**
     * Setter for <code>order_center.order_info.send_time</code>. 发货时间
     */
    public void setSendTime(LocalDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>order_center.order_info.send_time</code>. 发货时间
     */
    public LocalDateTime getSendTime() {
        return (LocalDateTime) get(14);
    }

    /**
     * Setter for <code>order_center.order_info.receive_time</code>. 收货时间
     */
    public void setReceiveTime(LocalDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>order_center.order_info.receive_time</code>. 收货时间
     */
    public LocalDateTime getReceiveTime() {
        return (LocalDateTime) get(15);
    }

    /**
     * Setter for <code>order_center.order_info.finish_time</code>. 完成时间
     */
    public void setFinishTime(LocalDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>order_center.order_info.finish_time</code>. 完成时间
     */
    public LocalDateTime getFinishTime() {
        return (LocalDateTime) get(16);
    }

    /**
     * Setter for <code>order_center.order_info.cancel_time</code>. 取消时间
     */
    public void setCancelTime(LocalDateTime value) {
        set(17, value);
    }

    /**
     * Getter for <code>order_center.order_info.cancel_time</code>. 取消时间
     */
    public LocalDateTime getCancelTime() {
        return (LocalDateTime) get(17);
    }

    /**
     * Setter for <code>order_center.order_info.create_time</code>. 下单时间
     */
    public void setCreateTime(LocalDateTime value) {
        set(18, value);
    }

    /**
     * Getter for <code>order_center.order_info.create_time</code>. 下单时间
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(18);
    }

    /**
     * Setter for <code>order_center.order_info.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(19, value);
    }

    /**
     * Getter for <code>order_center.order_info.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(19);
    }

    /**
     * Setter for <code>order_center.order_info.comment</code>. 订单备注
     */
    public void setComment(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>order_center.order_info.comment</code>. 订单备注
     */
    public String getComment() {
        return (String) get(20);
    }

    /**
     * Setter for <code>order_center.order_info.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(21, value);
    }

    /**
     * Getter for <code>order_center.order_info.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(21);
    }

    /**
     * Setter for <code>order_center.order_info.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>order_center.order_info.modify_user_id</code>.
     */
    public Long getModifyUserId() {
        return (Long) get(22);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached OrderInfoRecord
     */
    public OrderInfoRecord() {
        super(OrderInfo.ORDER_INFO);
    }

    /**
     * Create a detached, initialised OrderInfoRecord
     */
    public OrderInfoRecord(Long id, Long parentOrderId, String orderSn, Long userId, Long addressId, Byte status, Byte sourceType, Long totalAmount, Long couponAmount, Long shippingAmount, Long payAmount, String shippingNo, Byte paymentType, LocalDateTime paymentTime, LocalDateTime sendTime, LocalDateTime receiveTime, LocalDateTime finishTime, LocalDateTime cancelTime, LocalDateTime createTime, LocalDateTime modifyTime, String comment, Long createUserId, Long modifyUserId) {
        super(OrderInfo.ORDER_INFO);

        setId(id);
        setParentOrderId(parentOrderId);
        setOrderSn(orderSn);
        setUserId(userId);
        setAddressId(addressId);
        setStatus(status);
        setSourceType(sourceType);
        setTotalAmount(totalAmount);
        setCouponAmount(couponAmount);
        setShippingAmount(shippingAmount);
        setPayAmount(payAmount);
        setShippingNo(shippingNo);
        setPaymentType(paymentType);
        setPaymentTime(paymentTime);
        setSendTime(sendTime);
        setReceiveTime(receiveTime);
        setFinishTime(finishTime);
        setCancelTime(cancelTime);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setComment(comment);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}
