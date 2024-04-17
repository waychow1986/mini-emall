import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.AttributeDao;
import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import com.azure.csu.tiger.product.service.CategoryService;
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
public class AttributeTest {

    @Autowired
    private AttributeDao attributeDao;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createAttributes() {
        if (mockData) {
            List<AttributeRecord> datas = Lists.newArrayList();
            for (int i = 0; i < 5; i++) {
                AttributeRecord record = new AttributeRecord();
                int suffix = i + 1;
                record.setName("属性-generic-" + suffix);
                record.setValueType((byte) 0);
                record.setFillType((byte) 2);
                record.setAttrType((byte) 0);
                record.setCreateUserId(1L);
                record.setModifyUserId(1L);
                datas.add(record);
            }
            attributeDao.createAttributes(datas);

            datas = Lists.newArrayList();
            for (int i = 0; i < 5; i++) {
                AttributeRecord record = new AttributeRecord();
                int suffix = i + 1;
                record.setName("属性-sales-" + suffix);
                record.setValueType((byte) 0);
                record.setFillType((byte) 2);
                record.setAttrType((byte) 1);
                record.setCreateUserId(1L);
                record.setModifyUserId(1L);
                datas.add(record);
            }
            attributeDao.createAttributes(datas);
        }
    }

}
