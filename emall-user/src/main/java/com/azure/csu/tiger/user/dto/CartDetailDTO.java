package com.azure.csu.tiger.user.dto;

import com.azure.csu.tiger.user.cache.bo.CartItemBo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CartDetailDTO {

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

    public static CartDetailDTO fromCacheCart(CartItemBo item, Long uid) {
        CartDetailDTO dto = new CartDetailDTO();
        dto.setUserId(uid);
        dto.setSkuId(item.getSkuId());
        dto.setSkuNum(item.getSkuNum());
        dto.setName(item.getSkuName());
        dto.setPrice(item.getPrice());
        return dto;
    }

    public com.azure.csu.tiger.grpc.lib.CartItem toGrpcCartItem() {
        return com.azure.csu.tiger.grpc.lib.CartItem.newBuilder()
                .setUid(userId)
                .setSkuId(skuId)
                .setSkuNum(skuNum)
                .setName(name == null ? "" : name)
                .setPrice(price == null ? 0 : price)
                .build();
    }
}
