package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.SpuAttributeValueRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;

import java.util.Collection;
import java.util.List;

public interface SpuAttributeValueDao {

    void createAttributeValues(Collection<SpuAttributeValueRecord> records);

    List<SpuAttributeValueRecord> listAttributeValues(Collection<Long> ids);

    List<SpuAttributeValueRecord> listAttributeValues(int offset, int limit);
}
