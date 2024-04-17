package com.azure.csu.tiger.user.service;

import com.azure.csu.tiger.user.dto.CartDetailDTO;

import java.util.Collection;
import java.util.List;

public interface CartDetailService {

    boolean addCart(Long uid, Collection<Long> skuId);

    List<CartDetailDTO> getCartDetail(Long uid);
}
