package com.azure.csu.tiger.product.dao;

import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;

import java.util.Collection;
import java.util.List;

public interface CategoryDao {

    /**
     * 创建新的类目
     * @param record
     * @return
     */
    Long createCategory(CategoryRecord record);

    void createCategorys(Collection<CategoryRecord> records);


    /**
     * 根据类目id查询
     * @param id
     * @return
     */
    CategoryRecord findCategory(Long id);

    /**
     * 批量查询
     * @param name 类目名称，模糊查询
     * @param parentId 父类目id
     * @return
     */
    List<CategoryRecord> listCategory(String name, Long parentId);

    List<CategoryRecord> listCategory(Collection<Long> ids);
}
