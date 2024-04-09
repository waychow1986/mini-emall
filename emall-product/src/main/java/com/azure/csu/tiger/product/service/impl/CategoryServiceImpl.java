package com.azure.csu.tiger.product.service.impl;

import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.dto.CategoryDTO;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import com.azure.csu.tiger.product.service.CategoryService;
import io.grpc.internal.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

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

    @Override
    public String getCategoryNameFromCache(Long id) {
        String value = redisTemplate.opsForValue().get("category-id-"+id);
        return value;
    }

    @Override
    public Map<Long, String> batchGetCategoryNameFromCache(Collection<Long> ids) {
        List<String> values = redisTemplate.opsForValue().multiGet(ids.stream().map(id -> "category-id-"+id).collect(Collectors.toList()));
        System.out.println(values.toString());
        return Collections.emptyMap();
    }
}
