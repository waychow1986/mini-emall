package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.SkuRecord;

import java.util.Collection;
import java.util.List;

public interface SkuDao {

    void createSkus(Collection<SkuRecord> records);

    List<SkuRecord> listSku(Collection<Long> ids);

    List<SkuRecord> listAllSku(int offset, int limit);
}
