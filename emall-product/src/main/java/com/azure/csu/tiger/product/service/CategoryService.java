package com.azure.csu.tiger.product.service;

import com.azure.csu.tiger.product.dto.CategoryDTO;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface CategoryService {

    CategoryDTO findCategory(Long id);

    List<CategoryDTO> listCategory(String name, Long parentId);

    String getCategoryNameFromCache(Long id);

    Map<Long, String> batchGetCategoryNameFromCache(Collection<Long> ids);
}
