import com.azure.csu.tiger.common.utils.JsonUtil;
import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.cache.bo.SkuItemBo;
import com.azure.csu.tiger.product.dao.SkuDao;
import com.azure.csu.tiger.product.dao.SpuDao;
import com.azure.csu.tiger.product.dto.SkuDetailDTO;
import com.azure.csu.tiger.product.jooq.tables.records.SkuRecord;
import com.azure.csu.tiger.product.jooq.tables.records.SpuRecord;
import com.azure.csu.tiger.product.service.SkuService;
import com.fasterxml.jackson.databind.util.JSONPObject;
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
public class SkuTest {

    @Autowired
    private SkuDao skuDao;

    @Autowired
    private SkuService skuService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createSkus() {
        if (mockData) {
            List<SkuRecord> datas = Lists.newArrayList();
            for (int i = 10101; i < 10010101; i++) {
                SkuRecord record1 = new SkuRecord();
                SkuRecord record2 = new SkuRecord();

                long suffix = i - 10100;

                record1.setSpuId(suffix);
                record1.setCategoryId((long) i);
                record1.setName("SKU-" + suffix + "-1");
                record1.setPrice(10000L);
                record1.setStock(100000L);
                record1.setIsEnable((byte) 1);
                record1.setCreateUserId(1L);
                record1.setModifyUserId(1L);
                datas.add(record1);

                record2.setSpuId(suffix);
                record2.setCategoryId((long) i);
                record2.setName("SKU-" + suffix + "-2");
                record2.setPrice(10000L);
                record2.setStock(100000L);
                record2.setIsEnable((byte) 1);
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
    }

    @Test
    public void flushToRedis() {

        if(mockData) {
            Map<String, String> datas = Maps.newHashMap();
            long skuId = 0;
            for (int i = 10101; i < 10010101; i++) {
                long suffix = i - 10100;
                JsonObject o1 = new JsonObject();
                JsonObject o2 = new JsonObject();

                o1.addProperty("name", "SKU-" + suffix + "-1");
                o1.addProperty("categoryId", i);
                o1.addProperty("price", 10000);
                o1.addProperty("stock", 100000);
                o1.addProperty("spuId", suffix);
                skuId++;
                o1.addProperty("skuId", skuId);
                JsonObject ao1 = new JsonObject();
                ao1.addProperty("属性-sales-6", "销售属性值-6-" + skuId);
                o1.add("attr", ao1);
                datas.put("PRODUCT:SKU:" + skuId, o1.toString());

                o2.addProperty("name", "SKU-" + suffix + "-2");
                o2.addProperty("categoryId", i);
                o2.addProperty("price", 10000);
                o2.addProperty("stock", 100000);
                o2.addProperty("spuId", suffix);
                skuId++;
                o2.addProperty("skuId", skuId);
                JsonObject ao2 = new JsonObject();
                ao2.addProperty("属性-sales-6", "销售属性值-6-" + skuId);
                o2.add("attr", ao2);
                datas.put("PRODUCT:SKU:" + skuId, o2.toString());

                if (datas.size() >= 1000) {
                    redisTemplate.opsForValue().multiSet(datas);
                    datas = Maps.newHashMap();
                }
            }
            redisTemplate.opsForValue().multiSet(datas);
        }

    }

    @Test
    public void findSkuInfo() {
        List<Long> skuIds = Lists.newArrayList(1L,2L,100L,10100L,10000000L);

        List<SkuItemBo> skuInfoFromCache = skuService.findSkuInfoFromCache(skuIds);

        System.out.println(JsonUtil.obj2String(skuInfoFromCache));
    }

    @Test
    public void getSkuDetailInfo() {
        SkuDetailDTO skuDetailInfo = skuService.getSkuDetailInfo(4L);
        System.out.println(JsonUtil.obj2String(skuDetailInfo));
    }

    @Test
    public void testJson() {
        JsonObject o1 = new JsonObject();
        o1.addProperty("name", "eric");
        o1.addProperty("age", "18");
        JsonArray a1 = new JsonArray();
        a1.add(1);
        a1.add(2);
        o1.add("skuIds", a1);
        System.out.println(o1.toString());
    }

    private long getRandomCategoryId() {
        Random random = new Random();
        return (long)random.nextInt(10000000) + 10101;
    }

}
