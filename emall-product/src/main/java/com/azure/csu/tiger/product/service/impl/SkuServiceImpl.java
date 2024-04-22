package com.azure.csu.tiger.product.service.impl;

import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.common.utils.JsonUtil;
import com.azure.csu.tiger.product.cache.bo.CategoryBo;
import com.azure.csu.tiger.product.cache.bo.SkuItemBo;
import com.azure.csu.tiger.product.cache.bo.SpuItemBo;
import com.azure.csu.tiger.product.dto.SkuDetailDTO;
import com.azure.csu.tiger.product.service.SkuService;
import com.google.common.collect.Lists;
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

    @Override
    public SkuDetailDTO getSkuDetailInfo(Long skuId) {
        if (skuId == null) {
            return new SkuDetailDTO();
        }
        String skuValue = redisTemplate.opsForValue().get(Constant.REDIS_SKU_PREFIX+skuId);
        SkuItemBo sku = JsonUtil.string2Obj(skuValue, SkuItemBo.class);
        List<String> valueList = redisTemplate.opsForValue().multiGet(Lists.newArrayList(Constant.REDIS_SPU_PREFIX+sku.getSpuId(), Constant.REDIS_CATEGORY_PREFIX+sku.getCategoryId()));
        SpuItemBo spu = JsonUtil.string2Obj(valueList.get(0), SpuItemBo.class);
        CategoryBo category3Bo = JsonUtil.string2Obj(valueList.get(1), CategoryBo.class);
        category3Bo.setCategoryId(sku.getCategoryId());
        CategoryBo category2Bo = JsonUtil.string2Obj(redisTemplate.opsForValue().get(Constant.REDIS_CATEGORY_PREFIX+category3Bo.getParentId()), CategoryBo.class);
        category2Bo.setCategoryId(category3Bo.getParentId());
        CategoryBo category1Bo = JsonUtil.string2Obj(redisTemplate.opsForValue().get(Constant.REDIS_CATEGORY_PREFIX+category2Bo.getParentId()), CategoryBo.class);
        category1Bo.setCategoryId(category2Bo.getParentId());

        return SkuDetailDTO.from(sku, spu, category1Bo, category2Bo, category3Bo);
    }
}
