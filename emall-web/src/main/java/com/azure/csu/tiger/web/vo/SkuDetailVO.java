package com.azure.csu.tiger.web.vo;

import com.azure.csu.tiger.grpc.lib.SkuDetailInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
public class SkuDetailVO {

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

    public static SkuDetailVO from(SkuDetailInfo info) {
        SkuDetailVO vo = new SkuDetailVO();
        vo.setSkuId(info.getSkuId());
        vo.setSkuName(info.getSkuName());
        vo.setSpuName(info.getSpuName());
        vo.setCategoryId1(info.getCategoryId1());
        vo.setCategoryId2(info.getCategoryId2());
        vo.setCategoryId3(info.getCategoryId3());
        vo.setCategoryName1(info.getCategoryName1());
        vo.setCategoryName2(info.getCategoryName2());
        vo.setCategoryName3(info.getCategoryName3());
        vo.setDescription(info.getDescription());
        vo.setPrice(info.getPrice());
        vo.setStock(info.getStock());
        vo.setAttr(info.getAttr());
        return vo;
    }
}
