package com.azure.csu.tiger.product.dao.impl;

import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import io.micrometer.core.instrument.util.StringUtils;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep7;
import org.jooq.Record;
import org.jooq.SelectConditionStep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.product.jooq.Tables.CATEGORY;

@Repository
public class CategoryDaoImpl implements CategoryDao {

    @Autowired
    private DSLContext context;

    @Override
    public Long createCategory(CategoryRecord record) {
        return context.insertInto(CATEGORY).set(record).returning(CATEGORY.ID).fetchOne().getId();
    }

    @Override
    public void createCategorys(Collection<CategoryRecord> records) {
        InsertValuesStep7<CategoryRecord, String, Long, Byte, Integer, Byte, Long, Long> valuesStep7 = context.insertInto(CATEGORY)
                .columns(CATEGORY.NAME, CATEGORY.PARENT_ID, CATEGORY.IS_LEAF, CATEGORY.SORT, CATEGORY.IS_DELETED, CATEGORY.CREATE_USER_ID, CATEGORY.MODIFY_USER_ID);
        records.stream().forEach(r -> valuesStep7.values(r.getName(), r.getParentId(), r.getIsLeaf(), r.getSort(), r.getIsDeleted(), r.getCreateUserId(), r.getModifyUserId()));

        valuesStep7.execute();
    }

    @Override
    public CategoryRecord findCategory(Long id) {
        return context.select().from(CATEGORY).where(CATEGORY.ID.eq(id)).and(CATEGORY.IS_DELETED.eq((byte)0)).fetchSingleInto(CategoryRecord.class);
    }

    @Override
    public List<CategoryRecord> listCategory(String name, Long parentId) {
        SelectConditionStep<Record> where = context.select().from(CATEGORY).where(CATEGORY.IS_DELETED.eq((byte)0));
        if (StringUtils.isNotBlank(name)) {
            where = where.and(CATEGORY.NAME.like(name));
        }
        if (parentId != null && parentId > 0) {
            where = where.and(CATEGORY.PARENT_ID.eq(parentId));
        }

        return where.fetch(r -> r.into(CategoryRecord.class));
    }

    @Override
    public List<CategoryRecord> listCategory(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(CATEGORY).where(CATEGORY.ID.in(ids)).fetchInto(CategoryRecord.class);
    }
}
