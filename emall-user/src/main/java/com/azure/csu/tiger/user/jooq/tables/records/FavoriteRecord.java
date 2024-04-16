/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.user.jooq.tables.records;


import com.azure.csu.tiger.user.jooq.tables.Favorite;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 收藏表
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FavoriteRecord extends UpdatableRecordImpl<FavoriteRecord> implements Record4<Long, Long, Long, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>user_center.favorite.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>user_center.favorite.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>user_center.favorite.user_id</code>. 用户id
     */
    public void setUserId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>user_center.favorite.user_id</code>. 用户id
     */
    public Long getUserId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>user_center.favorite.sku_id</code>. 商品id
     */
    public void setSkuId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>user_center.favorite.sku_id</code>. 商品id
     */
    public Long getSkuId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>user_center.favorite.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>user_center.favorite.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Long, Long, Long, LocalDateTime> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Long, Long, Long, LocalDateTime> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Favorite.FAVORITE.ID;
    }

    @Override
    public Field<Long> field2() {
        return Favorite.FAVORITE.USER_ID;
    }

    @Override
    public Field<Long> field3() {
        return Favorite.FAVORITE.SKU_ID;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return Favorite.FAVORITE.CREATE_TIME;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getUserId();
    }

    @Override
    public Long component3() {
        return getSkuId();
    }

    @Override
    public LocalDateTime component4() {
        return getCreateTime();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getUserId();
    }

    @Override
    public Long value3() {
        return getSkuId();
    }

    @Override
    public LocalDateTime value4() {
        return getCreateTime();
    }

    @Override
    public FavoriteRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FavoriteRecord value2(Long value) {
        setUserId(value);
        return this;
    }

    @Override
    public FavoriteRecord value3(Long value) {
        setSkuId(value);
        return this;
    }

    @Override
    public FavoriteRecord value4(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public FavoriteRecord values(Long value1, Long value2, Long value3, LocalDateTime value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FavoriteRecord
     */
    public FavoriteRecord() {
        super(Favorite.FAVORITE);
    }

    /**
     * Create a detached, initialised FavoriteRecord
     */
    public FavoriteRecord(Long id, Long userId, Long skuId, LocalDateTime createTime) {
        super(Favorite.FAVORITE);

        setId(id);
        setUserId(userId);
        setSkuId(skuId);
        setCreateTime(createTime);
    }
}
