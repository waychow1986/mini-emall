package com.azure.csu.tiger.user.service;

import com.azure.csu.tiger.grpc.lib.SkuInfo;
import com.azure.csu.tiger.user.cache.bo.SkuItemBo;
import com.azure.csu.tiger.user.dto.CartDetailDTO;

import java.util.Collection;
import java.util.List;

public interface CartDetailService {

    boolean addCart(Long uid, Long skuId, SkuItemBo skuInfo);

    List<CartDetailDTO> getCartDetail(Long uid);

    boolean clearCart(Long uid);
}
