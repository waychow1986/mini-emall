/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables.records;


import com.azure.csu.tiger.product.jooq.tables.Category;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 类目表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryRecord extends UpdatableRecordImpl<CategoryRecord> implements Record10<Long, String, Long, Byte, Integer, Byte, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>product_center.category.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>product_center.category.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>product_center.category.name</code>. 类目名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>product_center.category.name</code>. 类目名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>product_center.category.parent_id</code>. 父类目id
     */
    public void setParentId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>product_center.category.parent_id</code>. 父类目id
     */
    public Long getParentId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>product_center.category.is_leaf</code>. 是否叶子节点 0-否，1-是
     */
    public void setIsLeaf(Byte value) {
        set(3, value);
    }

    /**
     * Getter for <code>product_center.category.is_leaf</code>. 是否叶子节点 0-否，1-是
     */
    public Byte getIsLeaf() {
        return (Byte) get(3);
    }

    /**
     * Setter for <code>product_center.category.sort</code>. 同级别排序
     */
    public void setSort(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>product_center.category.sort</code>. 同级别排序
     */
    public Integer getSort() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>product_center.category.is_deleted</code>. 是否删除 0-否，1-是
     */
    public void setIsDeleted(Byte value) {
        set(5, value);
    }

    /**
     * Getter for <code>product_center.category.is_deleted</code>. 是否删除 0-否，1-是
     */
    public Byte getIsDeleted() {
        return (Byte) get(5);
    }

    /**
     * Setter for <code>product_center.category.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>product_center.category.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>product_center.category.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>product_center.category.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for <code>product_center.category.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>product_center.category.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>product_center.category.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>product_center.category.modify_user_id</code>.
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
    public Row10<Long, String, Long, Byte, Integer, Byte, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, String, Long, Byte, Integer, Byte, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Category.CATEGORY.ID;
    }

    @Override
    public Field<String> field2() {
        return Category.CATEGORY.NAME;
    }

    @Override
    public Field<Long> field3() {
        return Category.CATEGORY.PARENT_ID;
    }

    @Override
    public Field<Byte> field4() {
        return Category.CATEGORY.IS_LEAF;
    }

    @Override
    public Field<Integer> field5() {
        return Category.CATEGORY.SORT;
    }

    @Override
    public Field<Byte> field6() {
        return Category.CATEGORY.IS_DELETED;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Category.CATEGORY.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return Category.CATEGORY.MODIFY_TIME;
    }

    @Override
    public Field<Long> field9() {
        return Category.CATEGORY.CREATE_USER_ID;
    }

    @Override
    public Field<Long> field10() {
        return Category.CATEGORY.MODIFY_USER_ID;
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
        return getParentId();
    }

    @Override
    public Byte component4() {
        return getIsLeaf();
    }

    @Override
    public Integer component5() {
        return getSort();
    }

    @Override
    public Byte component6() {
        return getIsDeleted();
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
    public String value2() {
        return getName();
    }

    @Override
    public Long value3() {
        return getParentId();
    }

    @Override
    public Byte value4() {
        return getIsLeaf();
    }

    @Override
    public Integer value5() {
        return getSort();
    }

    @Override
    public Byte value6() {
        return getIsDeleted();
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
    public CategoryRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CategoryRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public CategoryRecord value3(Long value) {
        setParentId(value);
        return this;
    }

    @Override
    public CategoryRecord value4(Byte value) {
        setIsLeaf(value);
        return this;
    }

    @Override
    public CategoryRecord value5(Integer value) {
        setSort(value);
        return this;
    }

    @Override
    public CategoryRecord value6(Byte value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public CategoryRecord value7(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public CategoryRecord value8(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public CategoryRecord value9(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public CategoryRecord value10(Long value) {
        setModifyUserId(value);
        return this;
    }

    @Override
    public CategoryRecord values(Long value1, String value2, Long value3, Byte value4, Integer value5, Byte value6, LocalDateTime value7, LocalDateTime value8, Long value9, Long value10) {
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
     * Create a detached CategoryRecord
     */
    public CategoryRecord() {
        super(Category.CATEGORY);
    }

    /**
     * Create a detached, initialised CategoryRecord
     */
    public CategoryRecord(Long id, String name, Long parentId, Byte isLeaf, Integer sort, Byte isDeleted, LocalDateTime createTime, LocalDateTime modifyTime, Long createUserId, Long modifyUserId) {
        super(Category.CATEGORY);

        setId(id);
        setName(name);
        setParentId(parentId);
        setIsLeaf(isLeaf);
        setSort(sort);
        setIsDeleted(isDeleted);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}
