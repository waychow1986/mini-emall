package com.azure.csu.tiger.web.vo;

import com.azure.csu.tiger.grpc.lib.SkuInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SkuListVO {

    /**
     * sku id
     */
    private Long skuId;

    /**
     * sku名称
     */
    private String skuName;

    /**
     * 商品价格
     */
    private Long price;

    /**
     * 商品库存
     */
    private Long stock;

    public static SkuListVO from(SkuInfo item) {
        SkuListVO dto = new SkuListVO();
        dto.setSkuId(item.getSkuId());
        dto.setSkuName(item.getName());
        dto.setPrice(item.getPrice());
        dto.setStock(item.getStock());
        return dto;
    }

}
