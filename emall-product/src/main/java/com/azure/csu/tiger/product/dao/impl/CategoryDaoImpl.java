package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.jooq.Tables;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import com.google.common.primitives.Bytes;
import io.micrometer.core.instrument.util.StringUtils;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.SelectConditionStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private DSLContext context;

    @Override
    public Long createCategory(CategoryRecord record) {
        return context.insertInto(Tables.CATEGORY).set(record).returning(Tables.CATEGORY.ID).fetchOne().getId();
    }

    @Override
    public CategoryRecord findCategory(Long id) {
        return context.select().from(Tables.CATEGORY).where(Tables.CATEGORY.ID.eq(id)).and(Tables.CATEGORY.IS_DELETED.eq((byte)0)).fetchSingleInto(CategoryRecord.class);
    }

    @Override
    public List<CategoryRecord> listCategory(String name, Long parentId) {
        SelectConditionStep<Record> where = context.select().from(Tables.CATEGORY).where(Tables.CATEGORY.IS_DELETED.eq((byte)0));
        if (StringUtils.isNotBlank(name)) {
            where = where.and(Tables.CATEGORY.NAME.like(name));
        }
        if (parentId != null && parentId > 0) {
            where = where.and(Tables.CATEGORY.PARENT_ID.eq(parentId));
        }

        return where.fetch(r -> r.into(CategoryRecord.class));
    }
}
