package com.azure.csu.tiger.product.cache.bo;

import com.azure.csu.tiger.grpc.lib.SkuInfo;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class SpuItemBo {

    private Long spuId;

    private String name;

    private Long categoryId;

    private String description;

    private List<Long> stock;

    private Map<String, String> attr;

}
