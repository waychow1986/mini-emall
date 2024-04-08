package com.azure.csu.tiger.product.service;

import com.azure.csu.tiger.product.dto.CategoryDTO;

import java.util.List;

public interface CategoryService {

    CategoryDTO findCategory(Long id);

    List<CategoryDTO> listCategory(String name, Long parentId);
}
