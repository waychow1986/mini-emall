/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables.records;


import com.azure.csu.tiger.product.jooq.tables.Spu;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * SPU表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpuRecord extends UpdatableRecordImpl<SpuRecord> implements Record11<Long, String, Long, Long, Byte, String, Byte, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>product_center.spu.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>product_center.spu.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>product_center.spu.name</code>. SPU名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>product_center.spu.name</code>. SPU名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>product_center.spu.category_id</code>. 类目id
     */
    public void setCategoryId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>product_center.spu.category_id</code>. 类目id
     */
    public Long getCategoryId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>product_center.spu.brand_id</code>. 品牌id
     */
    public void setBrandId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>product_center.spu.brand_id</code>. 品牌id
     */
    public Long getBrandId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>product_center.spu.is_sale</code>. 是否上架 0-否，1-是
     */
    public void setIsSale(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>product_center.spu.is_sale</code>. 是否上架 0-否，1-是
     */
    public Byte getIsSale() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>product_center.spu.description</code>. 商品信息描述
     */
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>product_center.spu.description</code>. 商品信息描述
     */
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>product_center.spu.is_deleted</code>. 是否删除 0-否，1-是
     */
    public void setIsDeleted(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>product_center.spu.is_deleted</code>. 是否删除 0-否，1-是
     */
    public Byte getIsDeleted() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>product_center.spu.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>product_center.spu.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>product_center.spu.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(8, value);
    }

    /**
     * Getter for <code>product_center.spu.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(8);
    }

    /**
     * Setter for <code>product_center.spu.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>product_center.spu.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>product_center.spu.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(10, value);
    }

    /**
     * Getter for <code>product_center.spu.modify_user_id</code>.
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
    public Row11<Long, String, Long, Long, Byte, String, Byte, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, Long, Long, Byte, String, Byte, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Spu.SPU.ID;
    }

    @Override
    public Field<String> field2() {
        return Spu.SPU.NAME;
    }

    @Override
    public Field<Long> field3() {
        return Spu.SPU.CATEGORY_ID;
    }

    @Override
    public Field<Long> field4() {
        return Spu.SPU.BRAND_ID;
    }

    @Override
    public Field<Byte> field5() {
        return Spu.SPU.IS_SALE;
    }

    @Override
    public Field<String> field6() {
        return Spu.SPU.DESCRIPTION;
    }

    @Override
    public Field<Byte> field7() {
        return Spu.SPU.IS_DELETED;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Spu.SPU.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field9() {
        return Spu.SPU.MODIFY_TIME;
    }

    @Override
    public Field<Long> field10() {
        return Spu.SPU.CREATE_USER_ID;
    }

    @Override
    public Field<Long> field11() {
        return Spu.SPU.MODIFY_USER_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Long component3() {
        return getCategoryId();
    }

    @Override
    public Long component4() {
        return getBrandId();
    }

    @Override
    public Byte component5() {
        return getIsSale();
    }

    @Override
    public String component6() {
        return getDescription();
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
    public String value2() {
        return getName();
    }

    @Override
    public Long value3() {
        return getCategoryId();
    }

    @Override
    public Long value4() {
        return getBrandId();
    }

    @Override
    public Byte value5() {
        return getIsSale();
    }

    @Override
    public String value6() {
        return getDescription();
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
    public SpuRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SpuRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public SpuRecord value3(Long value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public SpuRecord value4(Long value) {
        setBrandId(value);
        return this;
    }

    @Override
    public SpuRecord value5(Byte value) {
        setIsSale(value);
        return this;
    }

    @Override
    public SpuRecord value6(String value) {
        setDescription(value);
        return this;
    }

    @Override
    public SpuRecord value7(Byte value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public SpuRecord value8(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SpuRecord value9(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public SpuRecord value10(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public SpuRecord value11(Long value) {
        setModifyUserId(value);
        return this;
    }

    @Override
    public SpuRecord values(Long value1, String value2, Long value3, Long value4, Byte value5, String value6, Byte value7, LocalDateTime value8, LocalDateTime value9, Long value10, Long value11) {
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
     * Create a detached SpuRecord
     */
    public SpuRecord() {
        super(Spu.SPU);
    }

    /**
     * Create a detached, initialised SpuRecord
     */
    public SpuRecord(Long id, String name, Long categoryId, Long brandId, Byte isSale, String description, Byte isDeleted, LocalDateTime createTime, LocalDateTime modifyTime, Long createUserId, Long modifyUserId) {
        super(Spu.SPU);

        setId(id);
        setName(name);
        setCategoryId(categoryId);
        setBrandId(brandId);
        setIsSale(isSale);
        setDescription(description);
        setIsDeleted(isDeleted);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}
