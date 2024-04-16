package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;

import java.util.Collection;
import java.util.List;

public interface AttributeDao {

    void createAttributes(Collection<AttributeRecord> records);

    List<AttributeRecord> listAttribute(Collection<Long> ids);

    List<AttributeRecord> listAllAttribute(int offset, int limit);
}
