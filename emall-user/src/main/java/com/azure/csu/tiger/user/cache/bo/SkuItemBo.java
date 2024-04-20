package com.azure.csu.tiger.user.cache.bo;

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

    public static SkuItemBo fromGrpcSkuInfo(SkuInfo info) {
        SkuItemBo sku = new SkuItemBo();
        sku.setSkuId(info.getSkuId());
        sku.setSpuId(info.getSpuId());
        sku.setName(info.getName());
        sku.setCategoryId(info.getCategoryId());
        sku.setPrice(info.getPrice());
        sku.setStock(info.getStock());
        sku.setAttr(info.getAttrMap());

        return sku;
    }
}
