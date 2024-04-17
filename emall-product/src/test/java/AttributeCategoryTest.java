import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.AttributeCategoryDao;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeCategoryRecord;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class AttributeCategoryTest {

    @Autowired
    private AttributeCategoryDao attributeCategoryDao;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createAttributeCategorys() {
        if (mockData) {
            List<AttributeCategoryRecord> datas = Lists.newArrayList();
            for (int j = 1; j <= 10; j++) {
                for (int i = 10101; i <= 10010100; i++) {
                    AttributeCategoryRecord record = new AttributeCategoryRecord();
                    record.setAttributeId((long) j);
                    record.setCategoryId((long) i);
                    record.setCreateUserId(1L);
                    record.setModifyUserId(1L);
                    datas.add(record);
                    if (datas.size() == 5000) {
                        attributeCategoryDao.createAttributeCategory(datas);
                        datas = Lists.newArrayList();
                    }
                }
            }
            attributeCategoryDao.createAttributeCategory(datas);
        }
    }

}
