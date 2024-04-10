/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables.records;


import com.azure.csu.tiger.product.jooq.tables.Attribute;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 属性表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AttributeRecord extends UpdatableRecordImpl<AttributeRecord> implements Record13<Long, String, Byte, Byte, Byte, String, Byte, String, Byte, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>product_center.attribute.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>product_center.attribute.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>product_center.attribute.name</code>. 属性名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>product_center.attribute.name</code>. 属性名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>product_center.attribute.value_type</code>. 字符串-0、数字-1
     */
    public void setValueType(Byte value) {
        set(2, value);
    }

    /**
     * Getter for <code>product_center.attribute.value_type</code>. 字符串-0、数字-1
     */
    public Byte getValueType() {
        return (Byte) get(2);
    }

    /**
     * Setter for <code>product_center.attribute.fill_type</code>. 单选-0, 多选-0, 输入框-1
     */
    public void setFillType(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>product_center.attribute.fill_type</code>. 单选-0, 多选-0, 输入框-1
     */
    public Byte getFillType() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>product_center.attribute.attr_type</code>. 基础属性-0, 销售属性-1
     */
    public void setAttrType(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>product_center.attribute.attr_type</code>. 基础属性-0, 销售属性-1
     */
    public Byte getAttrType() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>product_center.attribute.unit</code>. 数字类型属性的单位，非数字类型可为空
     */
    public void setUnit(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>product_center.attribute.unit</code>. 数字类型属性的单位，非数字类型可为空
     */
    public String getUnit() {
        return (String) get(5);
    }

    /**
     * Setter for <code>product_center.attribute.is_search</code>. 是否用于搜索筛选 0-否，1-是
     */
    public void setIsSearch(Byte value) {
        set(6, value);
    }

    /**
     * Getter for <code>product_center.attribute.is_search</code>. 是否用于搜索筛选 0-否，1-是
     */
    public Byte getIsSearch() {
        return (Byte) get(6);
    }

    /**
     * Setter for <code>product_center.attribute.search_enums</code>. 非枚举属性，列出筛选区间段
     */
    public void setSearchEnums(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>product_center.attribute.search_enums</code>. 非枚举属性，列出筛选区间段
     */
    public String getSearchEnums() {
        return (String) get(7);
    }

    /**
     * Setter for <code>product_center.attribute.is_deleted</code>. 是否删除 0-否，1-是
     */
    public void setIsDeleted(Byte value) {
        set(8, value);
    }

    /**
     * Getter for <code>product_center.attribute.is_deleted</code>. 是否删除 0-否，1-是
     */
    public Byte getIsDeleted() {
        return (Byte) get(8);
    }

    /**
     * Setter for <code>product_center.attribute.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(9, value);
    }

    /**
     * Getter for <code>product_center.attribute.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(9);
    }

    /**
     * Setter for <code>product_center.attribute.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>product_center.attribute.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(10);
    }

    /**
     * Setter for <code>product_center.attribute.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>product_center.attribute.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>product_center.attribute.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>product_center.attribute.modify_user_id</code>.
     */
    public Long getModifyUserId() {
        return (Long) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, String, Byte, Byte, Byte, String, Byte, String, Byte, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, String, Byte, Byte, Byte, String, Byte, String, Byte, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Attribute.ATTRIBUTE.ID;
    }

    @Override
    public Field<String> field2() {
        return Attribute.ATTRIBUTE.NAME;
    }

    @Override
    public Field<Byte> field3() {
        return Attribute.ATTRIBUTE.VALUE_TYPE;
    }

    @Override
    public Field<Byte> field4() {
        return Attribute.ATTRIBUTE.FILL_TYPE;
    }

    @Override
    public Field<Byte> field5() {
        return Attribute.ATTRIBUTE.ATTR_TYPE;
    }

    @Override
    public Field<String> field6() {
        return Attribute.ATTRIBUTE.UNIT;
    }

    @Override
    public Field<Byte> field7() {
        return Attribute.ATTRIBUTE.IS_SEARCH;
    }

    @Override
    public Field<String> field8() {
        return Attribute.ATTRIBUTE.SEARCH_ENUMS;
    }

    @Override
    public Field<Byte> field9() {
        return Attribute.ATTRIBUTE.IS_DELETED;
    }

    @Override
    public Field<LocalDateTime> field10() {
        return Attribute.ATTRIBUTE.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field11() {
        return Attribute.ATTRIBUTE.MODIFY_TIME;
    }

    @Override
    public Field<Long> field12() {
        return Attribute.ATTRIBUTE.CREATE_USER_ID;
    }

    @Override
    public Field<Long> field13() {
        return Attribute.ATTRIBUTE.MODIFY_USER_ID;
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
    public Byte component3() {
        return getValueType();
    }

    @Override
    public Byte component4() {
        return getFillType();
    }

    @Override
    public Byte component5() {
        return getAttrType();
    }

    @Override
    public String component6() {
        return getUnit();
    }

    @Override
    public Byte component7() {
        return getIsSearch();
    }

    @Override
    public String component8() {
        return getSearchEnums();
    }

    @Override
    public Byte component9() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime component10() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component11() {
        return getModifyTime();
    }

    @Override
    public Long component12() {
        return getCreateUserId();
    }

    @Override
    public Long component13() {
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
    public Byte value3() {
        return getValueType();
    }

    @Override
    public Byte value4() {
        return getFillType();
    }

    @Override
    public Byte value5() {
        return getAttrType();
    }

    @Override
    public String value6() {
        return getUnit();
    }

    @Override
    public Byte value7() {
        return getIsSearch();
    }

    @Override
    public String value8() {
        return getSearchEnums();
    }

    @Override
    public Byte value9() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime value10() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value11() {
        return getModifyTime();
    }

    @Override
    public Long value12() {
        return getCreateUserId();
    }

    @Override
    public Long value13() {
        return getModifyUserId();
    }

    @Override
    public AttributeRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AttributeRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public AttributeRecord value3(Byte value) {
        setValueType(value);
        return this;
    }

    @Override
    public AttributeRecord value4(Byte value) {
        setFillType(value);
        return this;
    }

    @Override
    public AttributeRecord value5(Byte value) {
        setAttrType(value);
        return this;
    }

    @Override
    public AttributeRecord value6(String value) {
        setUnit(value);
        return this;
    }

    @Override
    public AttributeRecord value7(Byte value) {
        setIsSearch(value);
        return this;
    }

    @Override
    public AttributeRecord value8(String value) {
        setSearchEnums(value);
        return this;
    }

    @Override
    public AttributeRecord value9(Byte value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public AttributeRecord value10(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public AttributeRecord value11(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public AttributeRecord value12(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public AttributeRecord value13(Long value) {
        setModifyUserId(value);
        return this;
    }

    @Override
    public AttributeRecord values(Long value1, String value2, Byte value3, Byte value4, Byte value5, String value6, Byte value7, String value8, Byte value9, LocalDateTime value10, LocalDateTime value11, Long value12, Long value13) {
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
        value12(value12);
        value13(value13);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AttributeRecord
     */
    public AttributeRecord() {
        super(Attribute.ATTRIBUTE);
    }

    /**
     * Create a detached, initialised AttributeRecord
     */
    public AttributeRecord(Long id, String name, Byte valueType, Byte fillType, Byte attrType, String unit, Byte isSearch, String searchEnums, Byte isDeleted, LocalDateTime createTime, LocalDateTime modifyTime, Long createUserId, Long modifyUserId) {
        super(Attribute.ATTRIBUTE);

        setId(id);
        setName(name);
        setValueType(valueType);
        setFillType(fillType);
        setAttrType(attrType);
        setUnit(unit);
        setIsSearch(isSearch);
        setSearchEnums(searchEnums);
        setIsDeleted(isDeleted);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}
