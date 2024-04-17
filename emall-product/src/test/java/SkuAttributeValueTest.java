import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.SkuAttributeValueDao;
import com.azure.csu.tiger.product.dao.SpuAttributeValueDao;
import com.azure.csu.tiger.product.jooq.tables.records.SkuAttributeValueRecord;
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
public class SkuAttributeValueTest {

    @Autowired
    private SkuAttributeValueDao skuAttributeValueDao;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createValues() {
        if (mockData) {
            List<SkuAttributeValueRecord> datas = Lists.newArrayList();
            for (int i = 0; i < 20000000; i++) {
                SkuAttributeValueRecord record1 = new SkuAttributeValueRecord();
                long skuId = i + 1;
                record1.setSkuId(skuId);
                record1.setAttributeId(6L);
                record1.setValue("销售属性值-6-" + skuId);
                record1.setCreateUserId(1L);
                record1.setModifyUserId(1L);
                datas.add(record1);

                if (datas.size() >= 5000) {
                    skuAttributeValueDao.createAttributeValues(datas);
                    datas = Lists.newArrayList();
                }
            }
            skuAttributeValueDao.createAttributeValues(datas);
        }
    }

}
