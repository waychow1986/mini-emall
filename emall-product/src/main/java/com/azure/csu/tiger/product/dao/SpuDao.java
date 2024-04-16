package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;

import java.util.Collection;
import java.util.List;

public interface SpuDao {

    void createSpus(Collection<SpuRecord> records);

    List<SpuRecord> listSpu(Collection<Long> ids);

    List<SpuRecord> listAllSpu(int offset, int limit);
}
