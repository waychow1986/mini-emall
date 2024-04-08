package com.azure.csu.tiger.product.dto;

import com.azure.csu.tiger.grpc.lib.Category;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CategoryDTO {

    private Long id;

    private String name;

    private Long  parentId;

    private boolean isLeaf;

    private Integer sort;

    public static CategoryDTO newCategoryFrom(CategoryRecord record) {
        CategoryDTO dto = new CategoryDTO();
        dto.setId(record.getId());
        dto.setName(record.getName());
        dto.setParentId(record.getParentId());
        dto.setSort(record.getSort());
        dto.setLeaf(record.getIsLeaf().intValue() == 1 ? true : false);
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
