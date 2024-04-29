/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.order.jooq.tables;


import com.azure.csu.tiger.order.jooq.Keys;
import com.azure.csu.tiger.order.jooq.OrderCenter;
import com.azure.csu.tiger.order.jooq.tables.records.OrderInfoRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 订单表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrderInfo extends TableImpl<OrderInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>order_center.order_info</code>
     */
    public static final OrderInfo ORDER_INFO = new OrderInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrderInfoRecord> getRecordType() {
        return OrderInfoRecord.class;
    }

    /**
     * The column <code>order_center.order_info.id</code>.
     */
    public final TableField<OrderInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>order_center.order_info.parent_order_id</code>. 父订单id
     */
    public final TableField<OrderInfoRecord, Long> PARENT_ORDER_ID = createField(DSL.name("parent_order_id"), SQLDataType.BIGINT.nullable(false), this, "父订单id");

    /**
     * The column <code>order_center.order_info.order_sn</code>. 订单编号
     */
    public final TableField<OrderInfoRecord, String> ORDER_SN = createField(DSL.name("order_sn"), SQLDataType.VARCHAR(255).nullable(false), this, "订单编号");

    /**
     * The column <code>order_center.order_info.user_id</code>. 用户id
     */
    public final TableField<OrderInfoRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "用户id");

    /**
     * The column <code>order_center.order_info.address_id</code>. 地址id
     */
    public final TableField<OrderInfoRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT.nullable(false), this, "地址id");

    /**
     * The column <code>order_center.order_info.status</code>. 待支付-0，待发货-1，待收货-2，已完成-3，已取消-4
     */
    public final TableField<OrderInfoRecord, Byte> STATUS = createField(DSL.name("status"), SQLDataType.TINYINT.nullable(false), this, "待支付-0，待发货-1，待收货-2，已完成-3，已取消-4");

    /**
     * The column <code>order_center.order_info.source_type</code>. 订单来源 PC-0，Android-1，iOS-2，WeChat-3
     */
    public final TableField<OrderInfoRecord, Byte> SOURCE_TYPE = createField(DSL.name("source_type"), SQLDataType.TINYINT.nullable(false), this, "订单来源 PC-0，Android-1，iOS-2，WeChat-3");

    /**
     * The column <code>order_center.order_info.total_amount</code>. 订单总金额
     */
    public final TableField<OrderInfoRecord, Long> TOTAL_AMOUNT = createField(DSL.name("total_amount"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "订单总金额");

    /**
     * The column <code>order_center.order_info.coupon_amount</code>. 优惠券总金额
     */
    public final TableField<OrderInfoRecord, Long> COUPON_AMOUNT = createField(DSL.name("coupon_amount"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "优惠券总金额");

    /**
     * The column <code>order_center.order_info.shipping_amount</code>. 运费金额
     */
    public final TableField<OrderInfoRecord, Long> SHIPPING_AMOUNT = createField(DSL.name("shipping_amount"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "运费金额");

    /**
     * The column <code>order_center.order_info.pay_amount</code>. 实付金额
     */
    public final TableField<OrderInfoRecord, Long> PAY_AMOUNT = createField(DSL.name("pay_amount"), SQLDataType.BIGINT.defaultValue(DSL.inline("0", SQLDataType.BIGINT)), this, "实付金额");

    /**
     * The column <code>order_center.order_info.shipping_no</code>. 物流单号
     */
    public final TableField<OrderInfoRecord, String> SHIPPING_NO = createField(DSL.name("shipping_no"), SQLDataType.VARCHAR(255), this, "物流单号");

    /**
     * The column <code>order_center.order_info.payment_type</code>. 支付宝-0，微信-1，银联-2
     */
    public final TableField<OrderInfoRecord, Byte> PAYMENT_TYPE = createField(DSL.name("payment_type"), SQLDataType.TINYINT, this, "支付宝-0，微信-1，银联-2");

    /**
     * The column <code>order_center.order_info.payment_time</code>. 支付时间
     */
    public final TableField<OrderInfoRecord, LocalDateTime> PAYMENT_TIME = createField(DSL.name("payment_time"), SQLDataType.LOCALDATETIME(0), this, "支付时间");

    /**
     * The column <code>order_center.order_info.send_time</code>. 发货时间
     */
    public final TableField<OrderInfoRecord, LocalDateTime> SEND_TIME = createField(DSL.name("send_time"), SQLDataType.LOCALDATETIME(0), this, "发货时间");

    /**
     * The column <code>order_center.order_info.receive_time</code>. 收货时间
     */
    public final TableField<OrderInfoRecord, LocalDateTime> RECEIVE_TIME = createField(DSL.name("receive_time"), SQLDataType.LOCALDATETIME(0), this, "收货时间");

    /**
     * The column <code>order_center.order_info.finish_time</code>. 完成时间
     */
    public final TableField<OrderInfoRecord, LocalDateTime> FINISH_TIME = createField(DSL.name("finish_time"), SQLDataType.LOCALDATETIME(0), this, "完成时间");

    /**
     * The column <code>order_center.order_info.cancel_time</code>. 取消时间
     */
    public final TableField<OrderInfoRecord, LocalDateTime> CANCEL_TIME = createField(DSL.name("cancel_time"), SQLDataType.LOCALDATETIME(0), this, "取消时间");

    /**
     * The column <code>order_center.order_info.create_time</code>. 下单时间
     */
    public final TableField<OrderInfoRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "下单时间");

    /**
     * The column <code>order_center.order_info.modify_time</code>.
     */
    public final TableField<OrderInfoRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>order_center.order_info.comment</code>. 订单备注
     */
    public final TableField<OrderInfoRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.CLOB, this, "订单备注");

    /**
     * The column <code>order_center.order_info.create_user_id</code>.
     */
    public final TableField<OrderInfoRecord, Long> CREATE_USER_ID = createField(DSL.name("create_user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>order_center.order_info.modify_user_id</code>.
     */
    public final TableField<OrderInfoRecord, Long> MODIFY_USER_ID = createField(DSL.name("modify_user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private OrderInfo(Name alias, Table<OrderInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrderInfo(Name alias, Table<OrderInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("订单表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>order_center.order_info</code> table reference
     */
    public OrderInfo(String alias) {
        this(DSL.name(alias), ORDER_INFO);
    }

    /**
     * Create an aliased <code>order_center.order_info</code> table reference
     */
    public OrderInfo(Name alias) {
        this(alias, ORDER_INFO);
    }

    /**
     * Create a <code>order_center.order_info</code> table reference
     */
    public OrderInfo() {
        this(DSL.name("order_info"), null);
    }

    public <O extends Record> OrderInfo(Table<O> child, ForeignKey<O, OrderInfoRecord> key) {
        super(child, key, ORDER_INFO);
    }

    @Override
    public Schema getSchema() {
        return OrderCenter.ORDER_CENTER;
    }

    @Override
    public Identity<OrderInfoRecord, Long> getIdentity() {
        return (Identity<OrderInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<OrderInfoRecord> getPrimaryKey() {
        return Keys.KEY_ORDER_INFO_PRIMARY;
    }

    @Override
    public List<UniqueKey<OrderInfoRecord>> getKeys() {
        return Arrays.<UniqueKey<OrderInfoRecord>>asList(Keys.KEY_ORDER_INFO_PRIMARY);
    }

    @Override
    public OrderInfo as(String alias) {
        return new OrderInfo(DSL.name(alias), this);
    }

    @Override
    public OrderInfo as(Name alias) {
        return new OrderInfo(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderInfo rename(String name) {
        return new OrderInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrderInfo rename(Name name) {
        return new OrderInfo(name, null);
    }
}
