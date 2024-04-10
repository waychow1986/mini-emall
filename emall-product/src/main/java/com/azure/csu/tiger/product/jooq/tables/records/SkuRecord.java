/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables.records;


import com.azure.csu.tiger.product.jooq.tables.Sku;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * SKU表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SkuRecord extends UpdatableRecordImpl<SkuRecord> implements Record11<Long, Long, String, Long, Long, Byte, Byte, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>product_center.sku.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>product_center.sku.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>product_center.sku.spu_id</code>. SPU id
     */
    public void setSpuId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>product_center.sku.spu_id</code>. SPU id
     */
    public Long getSpuId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>product_center.sku.name</code>. 商品名称或标题
     */
    public void setName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>product_center.sku.name</code>. 商品名称或标题
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>product_center.sku.price</code>. 价格，单位为分
     */
    public void setPrice(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>product_center.sku.price</code>. 价格，单位为分
     */
    public Long getPrice() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>product_center.sku.stock</code>. 库存数量
     */
    public void setStock(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>product_center.sku.stock</code>. 库存数量
     */
    public Long getStock() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>product_center.sku.is_enable</code>. 是否有效 0-否，1-是
     */
    public void setIsEnable(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>product_center.sku.is_enable</code>. 是否有效 0-否，1-是
     */
    public Byte getIsEnable() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>product_center.sku.is_deleted</code>. 是否删除 0-否，1-是
     */
    public void setIsDeleted(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>product_center.sku.is_deleted</code>. 是否删除 0-否，1-是
     */
    public Byte getIsDeleted() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>product_center.sku.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>product_center.sku.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>product_center.sku.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>product_center.sku.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>product_center.sku.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>product_center.sku.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>product_center.sku.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>product_center.sku.modify_user_id</code>.
     */
    public Long getModifyUserId() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, String, Long, Long, Byte, Byte, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, Long, String, Long, Long, Byte, Byte, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Sku.SKU.ID;
    }

    @Override
    public Field<Long> field2() {
        return Sku.SKU.SPU_ID;
    }

    @Override
    public Field<String> field3() {
        return Sku.SKU.NAME;
    }

    @Override
    public Field<Long> field4() {
        return Sku.SKU.PRICE;
    }

    @Override
    public Field<Long> field5() {
        return Sku.SKU.STOCK;
    }

    @Override
    public Field<Byte> field6() {
        return Sku.SKU.IS_ENABLE;
    }

    @Override
    public Field<Byte> field7() {
        return Sku.SKU.IS_DELETED;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Sku.SKU.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Sku.SKU.MODIFY_TIME;
    }

    @Override
    public Field<Long> field10() {
        return Sku.SKU.CREATE_USER_ID;
    }

    @Override
    public Field<Long> field11() {
        return Sku.SKU.MODIFY_USER_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getSpuId();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public Long component4() {
        return getPrice();
    }

    @Override
    public Long component5() {
        return getStock();
    }

    @Override
    public Byte component6() {
        return getIsEnable();
    }

    @Override
    public Byte component7() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime component8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component9() {
        return getModifyTime();
    }

    @Override
    public Long component10() {
        return getCreateUserId();
    }

    @Override
    public Long component11() {
        return getModifyUserId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getSpuId();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public Long value4() {
        return getPrice();
    }

    @Override
    public Long value5() {
        return getStock();
    }

    @Override
    public Byte value6() {
        return getIsEnable();
    }

    @Override
    public Byte value7() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime value8() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value9() {
        return getModifyTime();
    }

    @Override
    public Long value10() {
        return getCreateUserId();
    }

    @Override
    public Long value11() {
        return getModifyUserId();
    }

    @Override
    public SkuRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SkuRecord value2(Long value) {
        setSpuId(value);
        return this;
    }

    @Override
    public SkuRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public SkuRecord value4(Long value) {
        setPrice(value);
        return this;
    }

    @Override
    public SkuRecord value5(Long value) {
        setStock(value);
        return this;
    }

    @Override
    public SkuRecord value6(Byte value) {
        setIsEnable(value);
        return this;
    }

    @Override
    public SkuRecord value7(Byte value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public SkuRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SkuRecord value9(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public SkuRecord value10(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public SkuRecord value11(Long value) {
        setModifyUserId(value);
        return this;
    }

    @Override
    public SkuRecord values(Long value1, Long value2, String value3, Long value4, Long value5, Byte value6, Byte value7, LocalDateTime value8, LocalDateTime value9, Long value10, Long value11) {
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
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SkuRecord
     */
    public SkuRecord() {
        super(Sku.SKU);
    }

    /**
     * Create a detached, initialised SkuRecord
     */
    public SkuRecord(Long id, Long spuId, String name, Long price, Long stock, Byte isEnable, Byte isDeleted, LocalDateTime createTime, LocalDateTime modifyTime, Long createUserId, Long modifyUserId) {
        super(Sku.SKU);

        setId(id);
        setSpuId(spuId);
        setName(name);
        setPrice(price);
        setStock(stock);
        setIsEnable(isEnable);
        setIsDeleted(isDeleted);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}