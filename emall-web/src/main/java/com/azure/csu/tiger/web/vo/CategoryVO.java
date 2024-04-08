package com.azure.csu.tiger.web.vo;

import com.azure.csu.tiger.grpc.lib.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryVO {

    private Long id;

    private String name;

    private Long  parentId;

    private boolean isLeaf;

    private Integer sort;

    public static CategoryVO newCategoryFrom(Category category) {
        CategoryVO dto = new CategoryVO();
        dto.setId(category.getId());
        dto.setName(category.getName());
        dto.setParentId(category.getParentId());
        dto.setSort(category.getSort());
        dto.setLeaf(category.getIsLeaf());
        return dto;
    }

    public Category toGrpcCategory() {
        Category category = Category.newBuilder()
                .setId(this.id)
                .setName(this.name)
                .setIsLeaf(this.isLeaf)
                .setId(this.sort)
                .build();
        return category;
    }
}
