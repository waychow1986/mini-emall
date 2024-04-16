import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import com.azure.csu.tiger.product.service.CategoryService;
import com.azure.csu.tiger.product.service.impl.CategoryServiceImpl;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collections;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class CategoryTest {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void createCategorys() {
        List<CategoryRecord> datas = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            CategoryRecord record = new CategoryRecord();
            int suffix = i + 1;
            record.setName("类目-"+suffix);
            record.setParentId(-1L);
            record.setIsLeaf((byte)0);
            record.setSort(suffix);
            record.setIsDeleted((byte)0);
            record.setCreateUserId(1L);
            record.setModifyUserId(1L);
            datas.add(record);
        }
        categoryDao.createCategorys(datas);

        datas = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            long suffix_1 = i + 1;
            for (int j = 0; j < 100; j++) {
                CategoryRecord record = new CategoryRecord();
                long suffix_2 = j + 1;
                record.setName("类目-" + suffix_1 + "-" + suffix_2);
                record.setParentId(suffix_1);
                record.setIsLeaf((byte) 0);
                record.setSort((int)suffix_2);
                record.setIsDeleted((byte) 0);
                record.setCreateUserId(1L);
                record.setModifyUserId(1L);
                datas.add(record);
                if (datas.size() == 5000) {
                    categoryDao.createCategorys(datas);
                    datas = Lists.newArrayList();
                }
            }
        }
        categoryDao.createCategorys(datas);

        datas = Lists.newArrayList();
        for (int i = 0; i < 100; i++) {
            long suffix_1 = i + 1;
            for (int j = 0; j < 100; j++) {
                long suffix_2 = j + 1;
                for (int k = 0; k < 1000; k++) {
                    CategoryRecord record = new CategoryRecord();
                    long suffix_3 = k + 1;
                    record.setName("类目-" + suffix_1 + "-" + suffix_2 + "-" + suffix_3);
                    record.setParentId(suffix_1 * 100 + suffix_2);
                    record.setIsLeaf((byte) 0);
                    record.setSort((int) suffix_3);
                    record.setIsDeleted((byte) 0);
                    record.setCreateUserId(1L);
                    record.setModifyUserId(1L);
                    datas.add(record);
                    if (datas.size() == 5000) {
                        categoryDao.createCategorys(datas);
                        datas = Lists.newArrayList();
                    }
                }
            }
        }
        categoryDao.createCategorys(datas);
    }

    @Test
    public void selectRecord() {
        CategoryRecord record = categoryDao.findCategory(1L);
        System.out.println(record.getName());
    }

    @Test
    public void getCategoryNameFromCache() {
        String value = categoryService.getCategoryNameFromCache(1L);
        System.out.println(value);
    }

    @Test
    public void batchGetCategoryNameFromCache() {
        categoryService.batchGetCategoryNameFromCache(
                Lists.newArrayList(1L, 2L,3L)
        );
    }
}
