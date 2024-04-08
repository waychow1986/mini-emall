package com.azure.csu.tiger.product.service.impl;

import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.dto.CategoryDTO;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import com.azure.csu.tiger.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public CategoryDTO findCategory(Long id) {
        if (id < 0) {
            return null;
        }
        CategoryRecord record = categoryDao.findCategory(id);
        return CategoryDTO.newCategoryFrom(record);
    }

    @Override
    public List<CategoryDTO> listCategory(String name, Long parentId) {
        return categoryDao.listCategory(name, parentId).stream().map(
                record -> CategoryDTO.newCategoryFrom(record)
        ).collect(Collectors.toList());
    }
}
