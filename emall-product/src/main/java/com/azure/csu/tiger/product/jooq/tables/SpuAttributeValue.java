/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables;


import com.azure.csu.tiger.product.jooq.Keys;
import com.azure.csu.tiger.product.jooq.ProductCenter;
import com.azure.csu.tiger.product.jooq.tables.records.SpuAttributeValueRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row8;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * SPU属性值表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpuAttributeValue extends TableImpl<SpuAttributeValueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>product_center.spu_attribute_value</code>
     */
    public static final SpuAttributeValue SPU_ATTRIBUTE_VALUE = new SpuAttributeValue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpuAttributeValueRecord> getRecordType() {
        return SpuAttributeValueRecord.class;
    }

    /**
     * The column <code>product_center.spu_attribute_value.id</code>.
     */
    public final TableField<SpuAttributeValueRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column <code>product_center.spu_attribute_value.spu_id</code>. SPU id
     */
    public final TableField<SpuAttributeValueRecord, Long> SPU_ID = createField(DSL.name("spu_id"), SQLDataType.BIGINT.nullable(false), this, "SPU id");

    /**
     * The column <code>product_center.spu_attribute_value.attribute_id</code>. 属性id
     */
    public final TableField<SpuAttributeValueRecord, Long> ATTRIBUTE_ID = createField(DSL.name("attribute_id"), SQLDataType.BIGINT.nullable(false), this, "属性id");

    /**
     * The column <code>product_center.spu_attribute_value.value</code>. 属性值
     */
    public final TableField<SpuAttributeValueRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(255).nullable(false), this, "属性值");

    /**
     * The column <code>product_center.spu_attribute_value.create_time</code>.
     */
    public final TableField<SpuAttributeValueRecord, LocalDateTime> CREATE_TIME = createField(DSL.name("create_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>product_center.spu_attribute_value.modify_time</code>.
     */
    public final TableField<SpuAttributeValueRecord, LocalDateTime> MODIFY_TIME = createField(DSL.name("modify_time"), SQLDataType.LOCALDATETIME(0).defaultValue(DSL.field("CURRENT_TIMESTAMP", SQLDataType.LOCALDATETIME)), this, "");

    /**
     * The column <code>product_center.spu_attribute_value.create_user_id</code>.
     */
    public final TableField<SpuAttributeValueRecord, Long> CREATE_USER_ID = createField(DSL.name("create_user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>product_center.spu_attribute_value.modify_user_id</code>.
     */
    public final TableField<SpuAttributeValueRecord, Long> MODIFY_USER_ID = createField(DSL.name("modify_user_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private SpuAttributeValue(Name alias, Table<SpuAttributeValueRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpuAttributeValue(Name alias, Table<SpuAttributeValueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("SPU属性值表"), TableOptions.table());
    }

    /**
     * Create an aliased <code>product_center.spu_attribute_value</code> table reference
     */
    public SpuAttributeValue(String alias) {
        this(DSL.name(alias), SPU_ATTRIBUTE_VALUE);
    }

    /**
     * Create an aliased <code>product_center.spu_attribute_value</code> table reference
     */
    public SpuAttributeValue(Name alias) {
        this(alias, SPU_ATTRIBUTE_VALUE);
    }

    /**
     * Create a <code>product_center.spu_attribute_value</code> table reference
     */
    public SpuAttributeValue() {
        this(DSL.name("spu_attribute_value"), null);
    }

    public <O extends Record> SpuAttributeValue(Table<O> child, ForeignKey<O, SpuAttributeValueRecord> key) {
        super(child, key, SPU_ATTRIBUTE_VALUE);
    }

    @Override
    public Schema getSchema() {
        return ProductCenter.PRODUCT_CENTER;
    }

    @Override
    public Identity<SpuAttributeValueRecord, Long> getIdentity() {
        return (Identity<SpuAttributeValueRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<SpuAttributeValueRecord> getPrimaryKey() {
        return Keys.KEY_SPU_ATTRIBUTE_VALUE_PRIMARY;
    }

    @Override
    public List<UniqueKey<SpuAttributeValueRecord>> getKeys() {
        return Arrays.<UniqueKey<SpuAttributeValueRecord>>asList(Keys.KEY_SPU_ATTRIBUTE_VALUE_PRIMARY);
    }

    @Override
    public SpuAttributeValue as(String alias) {
        return new SpuAttributeValue(DSL.name(alias), this);
    }

    @Override
    public SpuAttributeValue as(Name alias) {
        return new SpuAttributeValue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpuAttributeValue rename(String name) {
        return new SpuAttributeValue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpuAttributeValue rename(Name name) {
        return new SpuAttributeValue(name, null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, String, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }
}
