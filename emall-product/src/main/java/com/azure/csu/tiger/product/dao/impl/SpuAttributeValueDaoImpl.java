package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.SpuAttributeValueDao;
import com.azure.csu.tiger.product.jooq.tables.records.SpuAttributeValueRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.product.jooq.Tables.ATTRIBUTE;
import static com.azure.csu.tiger.product.jooq.Tables.SPU_ATTRIBUTE_VALUE;

@Repository
public class SpuAttributeValueDaoImpl implements SpuAttributeValueDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createAttributeValues(Collection<SpuAttributeValueRecord> records) {
        InsertValuesStep5<SpuAttributeValueRecord, Long, Long, String, Long, Long> valuesStep5 = context.insertInto(SPU_ATTRIBUTE_VALUE)
                .columns(SPU_ATTRIBUTE_VALUE.SPU_ID, SPU_ATTRIBUTE_VALUE.ATTRIBUTE_ID, SPU_ATTRIBUTE_VALUE.VALUE, SPU_ATTRIBUTE_VALUE.CREATE_USER_ID, SPU_ATTRIBUTE_VALUE.MODIFY_USER_ID);
        records.stream().forEach(r -> valuesStep5.values(r.getSpuId(), r.getAttributeId(), r.getValue(), r.getCreateUserId(), r.getModifyUserId()));

        valuesStep5.execute();
    }

    @Override
    public List<SpuAttributeValueRecord> listAttributeValues(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(SPU_ATTRIBUTE_VALUE).where(ATTRIBUTE.ID.in(ids)).fetchInto(SpuAttributeValueRecord.class);
    }

    @Override
    public List<SpuAttributeValueRecord> listAttributeValues(int offset, int limit) {
        if (offset < 0 || limit < 0) {
            return Collections.emptyList();
        }
        return context.select().from(SPU_ATTRIBUTE_VALUE).offset(offset).limit(limit).fetchInto(SpuAttributeValueRecord.class);
    }
}
