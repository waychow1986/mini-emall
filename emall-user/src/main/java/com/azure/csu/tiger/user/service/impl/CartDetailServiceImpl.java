package com.azure.csu.tiger.user.service.impl;

import com.azure.csu.tiger.common.config.GrpcSleuthConfig;
import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.common.utils.JsonUtil;
import com.azure.csu.tiger.grpc.lib.SkuInfo;
import com.azure.csu.tiger.user.cache.bo.CartItemBo;
import com.azure.csu.tiger.user.cache.bo.SkuItemBo;
import com.azure.csu.tiger.user.dao.CartDetailDao;
import com.azure.csu.tiger.user.dto.CartDetailDTO;
import com.azure.csu.tiger.user.service.CartDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class CartDetailServiceImpl implements CartDetailService {

    private static final Logger logger = LoggerFactory.getLogger(CartDetailServiceImpl.class);

    @Autowired
    private CartDetailDao cartDetailDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Transactional
    @Override
    public boolean addCart(Long uid, Long skuId, SkuItemBo skuInfo) {
        String key =Constant.REDIS_CART_PREFIX + uid;
        BoundHashOperations<String, Object, Object> hashOperations = redisTemplate.boundHashOps(key);
        String jsonValue = (String) hashOperations.get(String.valueOf(skuId));
        CartItemBo cartItem = JsonUtil.string2Obj(jsonValue, CartItemBo.class);
        long skuNum = 1;
        if (cartItem != null) {
            skuNum = cartItem.getSkuNum() + skuNum;
            cartDetailDao.setCartDetailNum(uid, skuId, skuNum);
        } else {
            cartItem = new CartItemBo();
            cartDetailDao.createCartDetail(uid, skuId, skuNum);
        }

        cartItem.setSkuNum(skuNum);
        cartItem.setSkuId(skuId);
        cartItem.setSkuName(skuInfo.getName());
        cartItem.setPrice(skuInfo.getPrice());
        hashOperations.put(String.valueOf(skuId), JsonUtil.obj2String(cartItem));

        logger.info("success add cart, uid: {}, skuId: {}, skuName: {}, skuNum: {}, skuPrice: {}", uid, skuId, skuInfo.getName(), skuNum, skuInfo.getPrice());

        return true;
    }


    @Override
    public List<CartDetailDTO> getCartDetail(Long uid) {
        String key = Constant.REDIS_CART_PREFIX + uid;
        BoundHashOperations<String, Object, Object> hashOperations = redisTemplate.boundHashOps(key);
        List<CartDetailDTO> dtoList = hashOperations.entries().entrySet().stream().map(entry -> {
            CartDetailDTO dto = new CartDetailDTO();
            String skuId = (String) entry.getKey();
            CartItemBo item = JsonUtil.string2Obj((String) entry.getValue(), CartItemBo.class);
            return CartDetailDTO.fromCacheCart(item, uid);
        }).collect(Collectors.toList());
        return dtoList;
    }
}
