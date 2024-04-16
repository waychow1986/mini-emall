package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.SpuDao;
import com.azure.csu.tiger.product.jooq.tables.Spu;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.product.jooq.Tables.ATTRIBUTE;
import static com.azure.csu.tiger.product.jooq.Tables.SPU;

@Repository
public class SpuDaoImpl implements SpuDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createSpus(Collection<SpuRecord> records) {
        InsertValuesStep6<SpuRecord, String, Long, Byte, String, Long, Long> valuesStep6 = context.insertInto(SPU)
                .columns(SPU.NAME, SPU.CATEGORY_ID, SPU.IS_SALE, SPU.DESCRIPTION, SPU.CREATE_USER_ID, SPU.MODIFY_USER_ID);
        records.stream().forEach(r -> valuesStep6.values(r.getName(), r.getCategoryId(), r.getIsSale(), r.getDescription(), r.getCreateUserId(), r.getModifyUserId()));

        valuesStep6.execute();
    }

    @Override
    public List<SpuRecord> listSpu(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(SPU).where(SPU.ID.in(ids)).fetchInto(SpuRecord.class);
    }

    @Override
    public List<SpuRecord> listAllSpu(int offset, int limit) {
        if (offset < 0 || limit < 0) {
            return Collections.emptyList();
        }
        return context.select().from(SPU).offset(offset).limit(limit).fetchInto(SpuRecord.class);
    }
}
