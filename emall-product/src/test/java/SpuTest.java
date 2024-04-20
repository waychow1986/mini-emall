import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.AttributeDao;
import com.azure.csu.tiger.product.dao.SpuDao;
import com.azure.csu.tiger.product.jooq.tables.records.AttributeRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Map;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class SpuTest {

    @Autowired
    private SpuDao spuDao;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

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

    @Test
    public void flushToRedis() {

        if(mockData) {
            Map<String, String> datas = Maps.newHashMap();
            long skuId = 0;
            for (int i = 10101; i < 10010101; i++) {
                long suffix = i - 10100;
                JsonObject o1 = new JsonObject();

                o1.addProperty("spuId", suffix);
                o1.addProperty("name", "SPU-" + suffix);
                o1.addProperty("categoryId", i);
                o1.addProperty("description", "随机产品: " + o1.get("name") + ", 归属类目: " + o1.get("categoryId"));

                JsonArray a1 = new JsonArray();
                a1.add(++skuId);
                a1.add(++skuId);
                o1.add("skuIds", a1);

                JsonObject ao = new JsonObject();
                ao.addProperty("属性-generic-1", "基础属性值-1-" + suffix);
                ao.addProperty("属性-generic-2", "基础属性值-2-" + suffix);
                o1.add("attr", ao);

                datas.put("PRODUCT:SPU:" + suffix, o1.toString());

                if (datas.size() >= 1000) {
                    redisTemplate.opsForValue().multiSet(datas);
                    datas = Maps.newHashMap();
                }
            }
            redisTemplate.opsForValue().multiSet(datas);
        }

    }

    private long getRandomCategoryId() {
        Random random = new Random();
        return (long)random.nextInt(10000000) + 10101;
    }

}
