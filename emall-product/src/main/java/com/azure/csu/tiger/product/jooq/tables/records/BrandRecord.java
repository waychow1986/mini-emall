/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq.tables.records;


import com.azure.csu.tiger.product.jooq.tables.Brand;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 品牌表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BrandRecord extends UpdatableRecordImpl<BrandRecord> implements Record9<Long, String, String, String, Byte, LocalDateTime, LocalDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>product_center.brand.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>product_center.brand.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>product_center.brand.name</code>. 品牌名称
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>product_center.brand.name</code>. 品牌名称
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>product_center.brand.logo_url</code>. logo地址
     */
    public void setLogoUrl(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>product_center.brand.logo_url</code>. logo地址
     */
    public String getLogoUrl() {
        return (String) get(2);
    }

    /**
     * Setter for <code>product_center.brand.first_letter</code>. 首字母
     */
    public void setFirstLetter(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>product_center.brand.first_letter</code>. 首字母
     */
    public String getFirstLetter() {
        return (String) get(3);
    }

    /**
     * Setter for <code>product_center.brand.is_deleted</code>. 是否删除 0-否，1-是
     */
    public void setIsDeleted(Byte value) {
        set(4, value);
    }

    /**
     * Getter for <code>product_center.brand.is_deleted</code>. 是否删除 0-否，1-是
     */
    public Byte getIsDeleted() {
        return (Byte) get(4);
    }

    /**
     * Setter for <code>product_center.brand.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>product_center.brand.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(5);
    }

    /**
     * Setter for <code>product_center.brand.modify_time</code>.
     */
    public void setModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>product_center.brand.modify_time</code>.
     */
    public LocalDateTime getModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>product_center.brand.create_user_id</code>.
     */
    public void setCreateUserId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>product_center.brand.create_user_id</code>.
     */
    public Long getCreateUserId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>product_center.brand.modify_user_id</code>.
     */
    public void setModifyUserId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>product_center.brand.modify_user_id</code>.
     */
    public Long getModifyUserId() {
        return (Long) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, Byte, LocalDateTime, LocalDateTime, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, Byte, LocalDateTime, LocalDateTime, Long, Long> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Brand.BRAND.ID;
    }

    @Override
    public Field<String> field2() {
        return Brand.BRAND.NAME;
    }

    @Override
    public Field<String> field3() {
        return Brand.BRAND.LOGO_URL;
    }

    @Override
    public Field<String> field4() {
        return Brand.BRAND.FIRST_LETTER;
    }

    @Override
    public Field<Byte> field5() {
        return Brand.BRAND.IS_DELETED;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return Brand.BRAND.CREATE_TIME;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Brand.BRAND.MODIFY_TIME;
    }

    @Override
    public Field<Long> field8() {
        return Brand.BRAND.CREATE_USER_ID;
    }

    @Override
    public Field<Long> field9() {
        return Brand.BRAND.MODIFY_USER_ID;
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
    public String component3() {
        return getLogoUrl();
    }

    @Override
    public String component4() {
        return getFirstLetter();
    }

    @Override
    public Byte component5() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime component6() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime component7() {
        return getModifyTime();
    }

    @Override
    public Long component8() {
        return getCreateUserId();
    }

    @Override
    public Long component9() {
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
    public String value3() {
        return getLogoUrl();
    }

    @Override
    public String value4() {
        return getFirstLetter();
    }

    @Override
    public Byte value5() {
        return getIsDeleted();
    }

    @Override
    public LocalDateTime value6() {
        return getCreateTime();
    }

    @Override
    public LocalDateTime value7() {
        return getModifyTime();
    }

    @Override
    public Long value8() {
        return getCreateUserId();
    }

    @Override
    public Long value9() {
        return getModifyUserId();
    }

    @Override
    public BrandRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public BrandRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public BrandRecord value3(String value) {
        setLogoUrl(value);
        return this;
    }

    @Override
    public BrandRecord value4(String value) {
        setFirstLetter(value);
        return this;
    }

    @Override
    public BrandRecord value5(Byte value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public BrandRecord value6(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public BrandRecord value7(LocalDateTime value) {
        setModifyTime(value);
        return this;
    }

    @Override
    public BrandRecord value8(Long value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public BrandRecord value9(Long value) {
        setModifyUserId(value);
        return this;
    }

    @Override
    public BrandRecord values(Long value1, String value2, String value3, String value4, Byte value5, LocalDateTime value6, LocalDateTime value7, Long value8, Long value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BrandRecord
     */
    public BrandRecord() {
        super(Brand.BRAND);
    }

    /**
     * Create a detached, initialised BrandRecord
     */
    public BrandRecord(Long id, String name, String logoUrl, String firstLetter, Byte isDeleted, LocalDateTime createTime, LocalDateTime modifyTime, Long createUserId, Long modifyUserId) {
        super(Brand.BRAND);

        setId(id);
        setName(name);
        setLogoUrl(logoUrl);
        setFirstLetter(firstLetter);
        setIsDeleted(isDeleted);
        setCreateTime(createTime);
        setModifyTime(modifyTime);
        setCreateUserId(createUserId);
        setModifyUserId(modifyUserId);
    }
}
