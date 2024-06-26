/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables;


import com.azure.csu.tiger.product.jooq.Keys;
import com.azure.csu.tiger.product.jooq.ProductCenter;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row11;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * SPU表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Spu extends TableImpl<SpuRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>product_center.spu</code>
     */
    public static final Spu SPU = new Spu();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpuRecord> getRecordType() {
        return SpuRecord.class;
    }

    /**
     * The column <code>product_center.spu.id</code>.
     */
    public final TableField<SpuRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>product_center.spu.name</code>. SPU名称
     */
    public final TableField<SpuRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(255).nullable(false), this, "SPU名称");

    /**
     * The column <code>product_center.spu.category_id</code>. 类目id
     */
    public final TableField<SpuRecord, Long> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BIGINT.nullable(false), this, "类目id");

    /**
     * The column <code>product_center.spu.brand_id</code>. 品牌id
     */
    public final TableField<SpuRecord, Long> BRAND_ID = createField(DSL.name("brand_id"), SQLDataType.BIGINT, this, "品牌id");

    /**
     * The column <code>product_center.spu.is_sale</code>. 是否上架 0-否，1-是
     */
    public final TableField<SpuRecord, Byte> IS_SALE = createField(DSL.name("is_sale"), SQLDataType.TINYINT.defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "是否上架 0-否，1-是");

    /**
     * The column <code>product_center.spu.description</code>. 商品信息描述
     */
    public final TableField<SpuRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "商品信息描述");

    /**
     * The column <code>product_center.spu.is_deleted</code>. 是否删除 0-否，1-是
     */
    public final TableField<SpuRecord, Byte> IS_DELETED = createField(DSL.name("is_deleted"), SQLDataType.TINYINT.defaultValue(DSL.inline("0", SQLDataType.TINYINT)), this, "是否删除 0-否，1-是");

    /**
     * The column <code>product_center.spu.create_time</code>.
     */
    public final TableField<SpuRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>product_center.spu.modify_time</code>.
     */
    public final TableField<SpuRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>product_center.spu.create_user_id</code>.
     */
    public final TableField<SpuRecord, Long> CREATE_USER_ID = createField(DSL.name("create_user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>product_center.spu.modify_user_id</code>.
     */
    public final TableField<SpuRecord, Long> MODIFY_USER_ID = createField(DSL.name("modify_user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private Spu(Name alias, Table<SpuRecord> aliased) {
        this(alias, aliased, null);
    }

    private Spu(Name alias, Table<SpuRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("SPU表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>product_center.spu</code> table reference
     */
    public Spu(String alias) {
        this(DSL.name(alias), SPU);
    }

    /**
     * Create an aliased <code>product_center.spu</code> table reference
     */
    public Spu(Name alias) {
        this(alias, SPU);
    }

    /**
     * Create a <code>product_center.spu</code> table reference
     */
    public Spu() {
        this(DSL.name("spu"), null);
    }

    public <O extends Record> Spu(Table<O> child, ForeignKey<O, SpuRecord> key) {
        super(child, key, SPU);
    }

    @Override
    public Schema getSchema() {
        return ProductCenter.PRODUCT_CENTER;
    }

    @Override
    public Identity<SpuRecord, Long> getIdentity() {
        return (Identity<SpuRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SpuRecord> getPrimaryKey() {
        return Keys.KEY_SPU_PRIMARY;
    }

    @Override
    public List<UniqueKey<SpuRecord>> getKeys() {
        return Arrays.<UniqueKey<SpuRecord>>asList(Keys.KEY_SPU_PRIMARY);
    }

    @Override
    public Spu as(String alias) {
        return new Spu(DSL.name(alias), this);
    }

    @Override
    public Spu as(Name alias) {
        return new Spu(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Spu rename(String name) {
        return new Spu(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Spu rename(Name name) {
        return new Spu(name, null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, Long, Long, Byte, String, Byte, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }
}
