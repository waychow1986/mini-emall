package com.azure.csu.tiger.web.vo;

import com.azure.csu.tiger.grpc.lib.CartItem;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartDetailVO {

    private Long userId;

    private Long skuId;

    private Long skuNum;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 商品名称
     */
    private String name;

    public static CartDetailVO from(CartItem item) {
        CartDetailVO dto = new CartDetailVO();
        dto.setUserId(item.getUid());
        dto.setSkuId(item.getSkuId());
        dto.setSkuNum(item.getSkuNum());
        dto.setName(item.getName());
        dto.setPrice(item.getPrice());
        return dto;
    }

}
