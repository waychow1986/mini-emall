package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.AttributeDao;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep6;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.product.jooq.Tables.ATTRIBUTE;

@Repository
public class AttributeDaoImpl implements AttributeDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createAttributes(Collection<AttributeRecord> records) {
        InsertValuesStep6<AttributeRecord, String, Byte, Byte, Byte, Long, Long> valuesStep6 = context.insertInto(ATTRIBUTE)
                .columns(ATTRIBUTE.NAME, ATTRIBUTE.VALUE_TYPE, ATTRIBUTE.FILL_TYPE, ATTRIBUTE.ATTR_TYPE, ATTRIBUTE.CREATE_USER_ID
                        , ATTRIBUTE.MODIFY_USER_ID);
        records.stream().forEach(r -> valuesStep6.values(r.getName(), r.getValueType(), r.getFillType(), r.getAttrType(), r.getCreateUserId(), r.getModifyUserId()));

        valuesStep6.execute();
    }

    @Override
    public List<AttributeRecord> listAttribute(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(ATTRIBUTE).where(ATTRIBUTE.ID.in(ids)).fetchInto(AttributeRecord.class);
    }

    @Override
    public List<AttributeRecord> listAllAttribute(int offset, int limit) {
        if (offset < 0 || limit < 0) {
            return Collections.emptyList();
        }
        return context.select().from(ATTRIBUTE).offset(offset).limit(limit).fetchInto(AttributeRecord.class);
    }
}
