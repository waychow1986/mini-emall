package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.AttributeCategoryRecord;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;

import java.util.Collection;
import java.util.List;

public interface AttributeCategoryDao {

    void createAttributeCategory(Collection<AttributeCategoryRecord> records);

}
