package com.azure.csu.tiger.user.service.impl;

import com.azure.csu.tiger.user.dto.CartDetailDTO;
import com.azure.csu.tiger.user.service.CartDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class CartDetailServiceImpl implements CartDetailService {

    @Autowired
    private CartDetailService cartDetailService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Transactional
    @Override
    public boolean addCart(Long uid, Collection<Long> skuId) {

        return false;
    }

    @Override
    public List<CartDetailDTO> getCartDetail(Long uid) {
        return Collections.emptyList();
    }
}
