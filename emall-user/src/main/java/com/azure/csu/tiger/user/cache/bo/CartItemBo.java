package com.azure.csu.tiger.user.cache.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartItemBo {

    /**
     * 商品id
     */
    private Long skuId;

    /**
     * 商品数量
     */
    private Long skuNum;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 商品名称
     */
    private String skuName;

}
