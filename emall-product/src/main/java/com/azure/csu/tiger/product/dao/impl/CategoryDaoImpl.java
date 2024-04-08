package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.jooq.Tables;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
        return context.select().from(Tables.CATEGORY).fetchSingleInto(CategoryRecord.class);
    }
}
