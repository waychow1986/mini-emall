package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;

public interface CategoryDao {

    Long createCategory(CategoryRecord record);

    CategoryRecord findCategory(Long id);
}
