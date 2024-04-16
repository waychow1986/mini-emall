import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.SkuDao;
import com.azure.csu.tiger.product.dao.SpuDao;
import com.azure.csu.tiger.product.jooq.tables.records.SkuRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class SkuTest {

    @Autowired
    private SkuDao skuDao;

    @Test
    public void createSkus() {
        List<SkuRecord> datas = Lists.newArrayList();
        for (int i = 10101; i < 10010101; i++) {
            SkuRecord record1 = new SkuRecord();
            SkuRecord record2 = new SkuRecord();

            long suffix = i - 10100;

            record1.setSpuId(suffix);
            record1.setCategoryId((long)i);
            record1.setName("SKU-"+suffix+"-1");
            record1.setPrice(10000L);
            record1.setStock(100000L);
            record1.setIsEnable((byte)1);
            record1.setCreateUserId(1L);
            record1.setModifyUserId(1L);
            datas.add(record1);

            record2.setSpuId(suffix);
            record2.setCategoryId((long)i);
            record2.setName("SKU-"+suffix+"-2");
            record2.setPrice(10000L);
            record2.setStock(100000L);
            record2.setIsEnable((byte)1);
            record2.setCreateUserId(1L);
            record2.setModifyUserId(1L);
            datas.add(record2);

            if (datas.size() >= 5000) {
                skuDao.createSkus(datas);
                datas = Lists.newArrayList();
            }
        }
        skuDao.createSkus(datas);

    }

    private long getRandomCategoryId() {
        Random random = new Random();
        return (long)random.nextInt(10000000) + 10101;
    }

}
