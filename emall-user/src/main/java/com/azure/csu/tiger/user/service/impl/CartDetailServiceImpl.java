package com.azure.csu.tiger.user.service.impl;

import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.common.utils.JsonUtil;
import com.azure.csu.tiger.user.cache.bo.CartItem;
import com.azure.csu.tiger.user.dao.CartDetailDao;
import com.azure.csu.tiger.user.dto.CartDetailDTO;
import com.azure.csu.tiger.user.jooq.tables.records.CartDetailRecord;
import com.azure.csu.tiger.user.service.CartDetailService;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.bouncycastle.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CartDetailServiceImpl implements CartDetailService {

    @Autowired
    private CartDetailDao cartDetailDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Transactional
    @Override
    public boolean addCart(Long uid, Long skuId) {
        String key =Constant.REDIS_CART_PREFIX + uid;
        BoundHashOperations<String, Object, Object> hashOperations = redisTemplate.boundHashOps(key);
        String jsonValue = (String) hashOperations.get(String.valueOf(skuId));
        CartItem cartItem = JsonUtil.string2Obj(jsonValue, CartItem.class);
        long skuNum = 1;
        if (cartItem != null) {
            skuNum = cartItem.getSkuNum() + skuNum;
            cartDetailDao.setCartDetailNum(uid, skuId, cartItem.getSkuNum());
        } else {
            cartItem = new CartItem();
            cartDetailDao.createCartDetail(uid, skuId, skuNum);
        }

        cartItem.setSkuNum(skuNum);
        cartItem.setSkuId(skuId);
        hashOperations.put(String.valueOf(skuId), JsonUtil.obj2String(cartItem));

        return true;
    }


    @Override
    public List<CartDetailDTO> getCartDetail(Long uid) {
        String key = Constant.REDIS_CART_PREFIX + uid;
        BoundHashOperations<String, Object, Object> hashOperations = redisTemplate.boundHashOps(key);
        List<CartDetailDTO> dtoList = hashOperations.entries().entrySet().stream().map(entry -> {
            CartDetailDTO dto = new CartDetailDTO();
            String skuId = (String) entry.getKey();
            CartItem item = JsonUtil.string2Obj((String) entry.getValue(), CartItem.class);
            return CartDetailDTO.fromCacheCart(item, uid);
        }).collect(Collectors.toList());
        return dtoList;
    }
}
