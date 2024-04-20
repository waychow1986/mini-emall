package com.azure.csu.tiger.product.cache.bo;

import com.azure.csu.tiger.grpc.lib.SkuInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class SkuItemBo {

    private Long skuId;

    private Long spuId;

    private String name;

    private Long categoryId;

    private Long price;

    private Long stock;

    private Map<String, String> attr;

    public SkuInfo toGrpcSkuInfo() {
        SkuInfo info = SkuInfo.newBuilder()
                .setSkuId(skuId)
                .setSpuId(spuId)
                .setCategoryId(categoryId)
                .setName(name)
                .setPrice(price)
                .setStock(stock)
                .putAllAttr(attr)
                .build();
        return info;
    }
}
