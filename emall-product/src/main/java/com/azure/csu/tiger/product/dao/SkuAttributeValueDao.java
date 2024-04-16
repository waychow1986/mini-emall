package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.SkuAttributeValueRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuAttributeValueRecord;

import java.util.Collection;
import java.util.List;

public interface SkuAttributeValueDao {

    void createAttributeValues(Collection<SkuAttributeValueRecord> records);

    List<SkuAttributeValueRecord> listAttributeValues(Collection<Long> ids);

    List<SkuAttributeValueRecord> listAttributeValues(int offset, int limit);
}
