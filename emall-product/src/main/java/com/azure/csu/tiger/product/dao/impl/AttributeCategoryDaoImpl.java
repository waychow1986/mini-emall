package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.AttributeCategoryDao;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeCategoryRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;

import static com.azure.csu.tiger.product.jooq.Tables.ATTRIBUTE_CATEGORY;

@Repository
public class AttributeCategoryDaoImpl implements AttributeCategoryDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createAttributeCategory(Collection<AttributeCategoryRecord> records) {
        InsertValuesStep4<AttributeCategoryRecord, Long, Long, Long, Long> valuesStep4 = context.insertInto(ATTRIBUTE_CATEGORY)
                .columns(ATTRIBUTE_CATEGORY.CATEGORY_ID, ATTRIBUTE_CATEGORY.ATTRIBUTE_ID, ATTRIBUTE_CATEGORY.CREATE_USER_ID, ATTRIBUTE_CATEGORY.MODIFY_USER_ID);
        records.stream().forEach(r -> valuesStep4.values(r.getCategoryId(), r.getAttributeId(), r.getCreateUserId(), r.getModifyUserId()));
        valuesStep4.execute();
    }
}
