package com.azure.csu.tiger.product.service;

import com.azure.csu.tiger.product.cache.bo.SkuItemBo;

import java.util.Collection;
import java.util.List;

public interface SkuService {

    List<SkuItemBo> findSkuInfoFromCache(Collection<Long> skuIds);
}
