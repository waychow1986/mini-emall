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

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class CategoryTest {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CategoryService categoryService;

    @Test
    public void createRecord() {
        CategoryRecord record = new CategoryRecord();
        record.setName("衣服");
        record.setCreateUserId(123L);
        record.setModifyUserId(123L);
        Long id = categoryDao.createCategory(record);
        System.out.println("id is: " + id);
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
