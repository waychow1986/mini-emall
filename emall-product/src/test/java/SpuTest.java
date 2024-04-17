import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.AttributeDao;
import com.azure.csu.tiger.product.dao.SpuDao;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class SpuTest {

    @Autowired
    private SpuDao spuDao;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createSpus() {
        if (mockData) {
            List<SpuRecord> datas = Lists.newArrayList();
            for (int i = 10101; i < 10010101; i++) {
                SpuRecord record = new SpuRecord();
                int suffix = i - 10100;
                record.setName("SPU-" + suffix);
                record.setCategoryId((long) i);
                record.setIsSale((byte) 1);
                record.setDescription("随机产品: " + record.getName() + ", 归属类目: " + record.getCategoryId());
                record.setCreateUserId(1L);
                record.setModifyUserId(1L);
                datas.add(record);
                if (datas.size() == 5000) {
                    spuDao.createSpus(datas);
                    datas = Lists.newArrayList();
                }
            }
            spuDao.createSpus(datas);
        }
    }

    private long getRandomCategoryId() {
        Random random = new Random();
        return (long)random.nextInt(10000000) + 10101;
    }

}
