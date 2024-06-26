/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables;


import com.azure.csu.tiger.product.jooq.Keys;
import com.azure.csu.tiger.product.jooq.ProductCenter;
import com.azure.csu.tiger.product.jooq.tables.records.CouponTakenRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * 优惠券领用表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CouponTaken extends TableImpl<CouponTakenRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>product_center.coupon_taken</code>
     */
    public static final CouponTaken COUPON_TAKEN = new CouponTaken();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CouponTakenRecord> getRecordType() {
        return CouponTakenRecord.class;
    }

    /**
     * The column <code>product_center.coupon_taken.id</code>.
     */
    public final TableField<CouponTakenRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>product_center.coupon_taken.coupon_id</code>. 优惠券id
     */
    public final TableField<CouponTakenRecord, Long> COUPON_ID = createField(DSL.name("coupon_id"), SQLDataType.BIGINT.nullable(false), this, "优惠券id");

    /**
     * The column <code>product_center.coupon_taken.user_id</code>. 用户id
     */
    public final TableField<CouponTakenRecord, Long> USER_ID = createField(DSL.name("user_id"), SQLDataType.BIGINT.nullable(false), this, "用户id");

    /**
     * The column <code>product_center.coupon_taken.taken_num</code>. 领用次数
     */
    public final TableField<CouponTakenRecord, Long> TAKEN_NUM = createField(DSL.name("taken_num"), SQLDataType.BIGINT.nullable(false), this, "领用次数");

    /**
     * The column <code>product_center.coupon_taken.ramained_num</code>. 剩余次数
     */
    public final TableField<CouponTakenRecord, Long> RAMAINED_NUM = createField(DSL.name("ramained_num"), SQLDataType.BIGINT.nullable(false), this, "剩余次数");

    /**
     * The column <code>product_center.coupon_taken.create_time</code>.
     */
    public final TableField<CouponTakenRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>product_center.coupon_taken.modify_time</code>.
     */
    public final TableField<CouponTakenRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    private CouponTaken(Name alias, Table<CouponTakenRecord> aliased) {
        this(alias, aliased, null);
    }

    private CouponTaken(Name alias, Table<CouponTakenRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("优惠券领用表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>product_center.coupon_taken</code> table reference
     */
    public CouponTaken(String alias) {
        this(DSL.name(alias), COUPON_TAKEN);
    }

    /**
     * Create an aliased <code>product_center.coupon_taken</code> table reference
     */
    public CouponTaken(Name alias) {
        this(alias, COUPON_TAKEN);
    }

    /**
     * Create a <code>product_center.coupon_taken</code> table reference
     */
    public CouponTaken() {
        this(DSL.name("coupon_taken"), null);
    }

    public <O extends Record> CouponTaken(Table<O> child, ForeignKey<O, CouponTakenRecord> key) {
        super(child, key, COUPON_TAKEN);
    }

    @Override
    public Schema getSchema() {
        return ProductCenter.PRODUCT_CENTER;
    }

    @Override
    public Identity<CouponTakenRecord, Long> getIdentity() {
        return (Identity<CouponTakenRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CouponTakenRecord> getPrimaryKey() {
        return Keys.KEY_COUPON_TAKEN_PRIMARY;
    }

    @Override
    public List<UniqueKey<CouponTakenRecord>> getKeys() {
        return Arrays.<UniqueKey<CouponTakenRecord>>asList(Keys.KEY_COUPON_TAKEN_PRIMARY);
    }

    @Override
    public CouponTaken as(String alias) {
        return new CouponTaken(DSL.name(alias), this);
    }

    @Override
    public CouponTaken as(Name alias) {
        return new CouponTaken(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CouponTaken rename(String name) {
        return new CouponTaken(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CouponTaken rename(Name name) {
        return new CouponTaken(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Long, Long, Long, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
