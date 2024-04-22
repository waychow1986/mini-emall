package com.azure.csu.tiger.product.dto;

import com.azure.csu.tiger.grpc.lib.Category;
import com.azure.csu.tiger.grpc.lib.SkuDetailInfo;
import com.azure.csu.tiger.product.cache.bo.CategoryBo;
import com.azure.csu.tiger.product.cache.bo.SkuItemBo;
import com.azure.csu.tiger.product.cache.bo.SpuItemBo;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class SkuDetailDTO {

    private Long skuId;

    private String skuName;

    private String spuName;

    private Long categoryId1;

    private Long categoryId2;

    private Long categoryId3;

    private String categoryName1;

    private String categoryName2;

    private String categoryName3;

    private String description;

    private Long price;

    private Long stock;

    private Map<String, String> attr;

    public static SkuDetailDTO from(SkuItemBo sku, SpuItemBo spu, CategoryBo c1, CategoryBo c2, CategoryBo c3) {
        SkuDetailDTO dto = new SkuDetailDTO();
        dto.setSkuId(sku.getSkuId());
        dto.setSkuName(sku.getName());
        dto.setSpuName(spu.getName());
        dto.setCategoryId1(c1.getCategoryId());
        dto.setCategoryId2(c2.getCategoryId());
        dto.setCategoryId3(c3.getCategoryId());
        dto.setCategoryName1(c1.getName());
        dto.setCategoryName2(c2.getName());
        dto.setCategoryName3(c3.getName());
        dto.setDescription(spu.getDescription());
        dto.setPrice(sku.getPrice());
        dto.setStock(sku.getStock());
        dto.setAttr(sku.getAttr());
        dto.getAttr().putAll(spu.getAttr());
        return dto;
    }

    public SkuDetailInfo toGrpcSkuDetailInfo() {
        SkuDetailInfo info = SkuDetailInfo.newBuilder()
                .setSkuId(skuId)
                .setSkuName(skuName)
                .setSpuName(spuName)
                .setCategoryId1(categoryId1)
                .setCategoryId2(categoryId2)
                .setCategoryId3(categoryId3)
                .setCategoryName1(categoryName1)
                .setCategoryName2(categoryName2)
                .setCategoryName3(categoryName3)
                .setDescription(description)
                .setPrice(price)
                .setStock(stock)
                .putAllAttr(attr)
                .build();
        return info;
    }
}
