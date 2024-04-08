import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class CategoryTest {

    @Autowired
    private CategoryDao categoryDao;

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
}
