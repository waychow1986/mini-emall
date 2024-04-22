package com.azure.csu.tiger.product.cache.bo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
public class CategoryBo {

    private Long categoryId;

    private String name;

    private Long parentId;

}
