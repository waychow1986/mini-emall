/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables.records;


import com.azure.csu.tiger.product.jooq.tables.SpuAttributeValue;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * SPU属性值表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpuAttributeValueRecord extends UpdatableRecordImpl<SpuAttributeValueRecord> implements Record8<Long, Long, Long, String, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>product_center.spu_attribute_value.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>product_center.spu_attribute_value.spu_id</code>. SPU id
     */
    public void setSpuId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.spu_id</code>. SPU id
     */
    public Long getSpuId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>product_center.spu_attribute_value.attribute_id</code>. 属性id
     */
    public void setAttributeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.attribute_id</code>. 属性id
     */
    public Long getAttributeId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>product_center.spu_attribute_value.value</code>. 属性值
     */
    public void setValue(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.value</code>. 属性值
     */
    public String getValue() {
        return (String) get(3);
    }

    /**
     * Setter for <code>product_center.spu_attribute_value.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>product_center.spu_attribute_value.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>product_center.spu_attribute_value.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>product_center.spu_attribute_value.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>product_center.spu_attribute_value.modify_user_id</code>.
     */
    public Long getModifyUserId() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, String, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, Long, String, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.ID;
    }

    @Override
    public Field<Long> field2() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.SPU_ID;
    }

    @Override
    public Field<Long> field3() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.ATTRIBUTE_ID;
    }

    @Override
    public Field<String> field4() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.VALUE;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.MODIFY_TIME;
    }

    @Override
    public Field<Long> field7() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.CREATE_USER_ID;
    }

    @Override
    public Field<Long> field8() {
        return SpuAttributeValue.SPU_ATTRIBUTE_VALUE.MODIFY_USER_ID;
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
    public Long component3() {
        return getAttributeId();
    }

    @Override
    public String component4() {
        return getValue();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component6() {
        return getModifyTime();
    }

    @Override
    public Long component7() {
        return getCreateUserId();
    }

    @Override
    public Long component8() {
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
    public Long value3() {
        return getAttributeId();
    }

    @Override
    public String value4() {
        return getValue();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value6() {
        return getModifyTime();
    }

    @Override
    public Long value7() {
        return getCreateUserId();
    }

    @Override
    public Long value8() {
        return getModifyUserId();
    }

    @Override
    public SpuAttributeValueRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord value2(Long value) {
        setSpuId(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord value3(Long value) {
        setAttributeId(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord value4(String value) {
        setValue(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord value6(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord value7(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord value8(Long value) {
        setModifyUserId(value);
        return this;
    }

    @Override
    public SpuAttributeValueRecord values(Long value1, Long value2, Long value3, String value4, LocalDateTime value5, LocalDateTime value6, Long value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached SpuAttributeValueRecord
     */
    public SpuAttributeValueRecord() {
        super(SpuAttributeValue.SPU_ATTRIBUTE_VALUE);
    }

    /**
     * Create a detached, initialised SpuAttributeValueRecord
     */
    public SpuAttributeValueRecord(Long id, Long spuId, Long attributeId, String value, LocalDateTime createTime, LocalDateTime modifyTime, Long createUserId, Long modifyUserId) {
        super(SpuAttributeValue.SPU_ATTRIBUTE_VALUE);

        setId(id);
        setSpuId(spuId);
        setAttributeId(attributeId);
        setValue(value);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}
