package com.azure.csu.tiger.product.service.impl;

import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.common.utils.JsonUtil;
import com.azure.csu.tiger.product.cache.bo.SkuItemBo;
import com.azure.csu.tiger.product.service.SkuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    private RedisTemplate<String, String> redisTemplate;


    @Override
    public List<SkuItemBo> findSkuInfoFromCache(Collection<Long> skuIds) {
        if (CollectionUtils.isEmpty(skuIds)) {
            return Collections.emptyList();
        }
        List<String> skuList = redisTemplate.opsForValue().multiGet(skuIds.stream().filter(skuId -> skuId != null).map(skuId -> Constant.REDIS_SKU_PREFIX+skuId).collect(Collectors.toList()));

        List<SkuItemBo> skuItemBoList = skuList.stream().map(sku -> JsonUtil.string2Obj(sku, SkuItemBo.class)).collect(Collectors.toList());
        return skuItemBoList;
    }
}
