package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.SkuRecord;

import java.util.Collection;
import java.util.List;

public interface SkuDao {

    void createSkus(Collection<SkuRecord> records);

    List<SkuRecord> listSku(Collection<Long> ids);

    List<SkuRecord> listSku(int offset, int limit);

    List<SkuRecord> listSku(SkuRecord record, int offset, int limit);
}
