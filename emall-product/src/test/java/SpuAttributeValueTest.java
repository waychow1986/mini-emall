import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.AttributeDao;
import com.azure.csu.tiger.product.dao.SpuAttributeValueDao;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuAttributeValueRecord;
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
public class SpuAttributeValueTest {

    @Autowired
    private SpuAttributeValueDao spuAttributeValueDao;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createValues() {
        if (mockData) {
            List<SpuAttributeValueRecord> datas = Lists.newArrayList();
            for (int i = 0; i < 10000000; i++) {
                SpuAttributeValueRecord record1 = new SpuAttributeValueRecord();
                long spuId = i + 1;
                record1.setSpuId(spuId);
                record1.setAttributeId(1L);
                record1.setValue("基础属性值-1-" + spuId);
                record1.setCreateUserId(1L);
                record1.setModifyUserId(1L);
                datas.add(record1);

                SpuAttributeValueRecord record2 = new SpuAttributeValueRecord();
                record2.setSpuId(spuId);
                record2.setAttributeId(2L);
                record2.setValue("基础属性值-2-" + spuId);
                record2.setCreateUserId(1L);
                record2.setModifyUserId(1L);
                datas.add(record2);

                if (datas.size() >= 5000) {
                    spuAttributeValueDao.createAttributeValues(datas);
                    datas = Lists.newArrayList();
                }
            }
            spuAttributeValueDao.createAttributeValues(datas);
        }
    }

}
