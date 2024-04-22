package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.SkuDao;
import com.azure.csu.tiger.product.dao.SpuDao;
import com.azure.csu.tiger.product.jooq.tables.records.SkuRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;
import org.jooq.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.product.jooq.Tables.SKU;
import static com.azure.csu.tiger.product.jooq.Tables.SPU;

@Repository
public class SkuDaoImpl implements SkuDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createSkus(Collection<SkuRecord> records) {
        InsertValuesStep8<SkuRecord, Long, Long, String, Long, Long, Byte, Long, Long> valuesStep8 = context.insertInto(SKU)
                .columns(SKU.SPU_ID, SKU.CATEGORY_ID, SKU.NAME, SKU.PRICE, SKU.STOCK, SKU.IS_ENABLE, SPU.CREATE_USER_ID, SPU.MODIFY_USER_ID);
        records.stream().forEach(r -> valuesStep8.values(r.getSpuId(), r.getCategoryId(), r.getName(), r.getPrice(), r.getStock(),
                r.getIsEnable(), r.getCreateUserId(), r.getModifyUserId()));

        valuesStep8.execute();
    }

    @Override
    public List<SkuRecord> listSku(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(SKU).where(SKU.ID.in(ids)).fetchInto(SkuRecord.class);
    }

    @Override
    public List<SkuRecord> listSku(int offset, int limit) {
        if (offset < 0 || limit < 0) {
            return Collections.emptyList();
        }
        return context.select().from(SKU).offset(offset).limit(limit).fetchInto(SkuRecord.class);
    }

    @Override
    public List<SkuRecord> listSku(SkuRecord record, int offset, int limit) {
        if (record == null) {
            return Collections.emptyList();
        }
        SelectConditionStep<Record> where = context.select().from(SKU).where(SKU.IS_DELETED.eq((byte) 0));
        if (StringUtils.hasLength(record.getName())) {
            where.and(SKU.NAME.like("%"+record.getName()+"%"));
        }
        if (record.getCategoryId() != null && record.getCategoryId() > 0) {
            where.and(SKU.CATEGORY_ID.eq(record.getCategoryId()));
        }
        if (limit >= 0) {
            if (offset >= 0) {
                where.offset(offset);
            }
            where.limit(limit);
        }
        return where.fetchInto(SkuRecord.class);
    }
}
