package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.SkuAttributeValueDao;
import com.azure.csu.tiger.product.jooq.tables.records.SkuAttributeValueRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.product.jooq.Tables.ATTRIBUTE;
import static com.azure.csu.tiger.product.jooq.Tables.SKU_ATTRIBUTE_VALUE;

@Repository
public class SkuAttributeValueDaoImpl implements SkuAttributeValueDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createAttributeValues(Collection<SkuAttributeValueRecord> records) {
        InsertValuesStep5<SkuAttributeValueRecord, Long, Long, String, Long, Long> valuesStep5 = context.insertInto(SKU_ATTRIBUTE_VALUE)
                .columns(SKU_ATTRIBUTE_VALUE.SKU_ID, SKU_ATTRIBUTE_VALUE.ATTRIBUTE_ID, SKU_ATTRIBUTE_VALUE.VALUE, SKU_ATTRIBUTE_VALUE.CREATE_USER_ID, SKU_ATTRIBUTE_VALUE.MODIFY_USER_ID);
        records.stream().forEach(r -> valuesStep5.values(r.getSkuId(), r.getAttributeId(), r.getValue(), r.getCreateUserId(), r.getModifyUserId()));

        valuesStep5.execute();
    }

    @Override
    public List<SkuAttributeValueRecord> listAttributeValues(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(SKU_ATTRIBUTE_VALUE).where(ATTRIBUTE.ID.in(ids)).fetchInto(SkuAttributeValueRecord.class);
    }

    @Override
    public List<SkuAttributeValueRecord> listAttributeValues(int offset, int limit) {
        if (offset < 0 || limit < 0) {
            return Collections.emptyList();
        }
        return context.select().from(SKU_ATTRIBUTE_VALUE).offset(offset).limit(limit).fetchInto(SkuAttributeValueRecord.class);
    }
}
