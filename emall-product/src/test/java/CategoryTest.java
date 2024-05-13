import com.azure.csu.tiger.product.EmallProductApplication;
import com.azure.csu.tiger.product.dao.CategoryDao;
import com.azure.csu.tiger.product.jooq.tables.records.CategoryRecord;
import com.azure.csu.tiger.product.service.CategoryService;
import com.azure.csu.tiger.product.service.impl.CategoryServiceImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallProductApplication.class)
public class CategoryTest {

    @Autowired
    private CategoryDao categoryDao;

    @Autowired
    private CategoryService categoryService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createCategorys() {
        if (mockData) {
            List<CategoryRecord> datas = Lists.newArrayList();
            for (int i = 0; i < 100; i++) {
                CategoryRecord record = new CategoryRecord();
                int suffix = i + 1;
                long id = suffix;
                long parentId = -1L;
                record.setName("类目-" + id+"-"+parentId);
                record.setParentId(-1L);
                record.setIsLeaf((byte) 0);
                record.setSort(suffix);
                record.setIsDeleted((byte) 0);
                record.setCreateUserId(1L);
                record.setModifyUserId(1L);
                datas.add(record);
            }
            categoryDao.createCategorys(datas);

            datas = Lists.newArrayList();
            for (int i = 0; i < 100; i++) {
                long suffix_1 = i + 1;
                for (int j = 0; j < 100; j++) {
                    CategoryRecord record = new CategoryRecord();
                    long suffix_2 = j + 1;
                    long id = 100+i*100+suffix_2;
                    long parentId = suffix_1;
                    record.setName("类目-" + id+"-"+parentId);
                    record.setParentId(parentId);
                    record.setIsLeaf((byte) 0);
                    record.setSort((int) suffix_2);
                    record.setIsDeleted((byte) 0);
                    record.setCreateUserId(1L);
                    record.setModifyUserId(1L);
                    datas.add(record);
                    if (datas.size() == 5000) {
                        categoryDao.createCategorys(datas);
                        datas = Lists.newArrayList();
                    }
                }
            }
            categoryDao.createCategorys(datas);

            datas = Lists.newArrayList();
            for (int i = 0; i < 100; i++) {
                long suffix_1 = i + 1;
                for (int j = 0; j < 100; j++) {
                    long suffix_2 = j + 1;
                    for (int k = 0; k < 1000; k++) {
                        CategoryRecord record = new CategoryRecord();
                        long suffix_3 = k + 1;
                        long id = 10100+i*100*1000+j*1000+suffix_3;
                        long parentId = 100+i*100+suffix_2;
                        record.setName("类目-" + id+"-"+parentId);
                        record.setParentId(parentId);
                        record.setIsLeaf((byte) 1);
                        record.setSort((int) suffix_3);
                        record.setIsDeleted((byte) 0);
                        record.setCreateUserId(1L);
                        record.setModifyUserId(1L);
                        datas.add(record);
                        if (datas.size() == 5000) {
                            categoryDao.createCategorys(datas);
                            datas = Lists.newArrayList();
                        }
                    }
                }
            }
            categoryDao.createCategorys(datas);
        }
    }

    @Test
    public void flushToRedis() {
        if (mockData) {
            Map<String, String> datas = Maps.newHashMap();
            for (int i = 0; i < 100; i++) {
                int suffix = i + 1;
                long id = suffix;
                long parentId = -1L;
                JsonObject o = new JsonObject();
                o.addProperty("name", "类目-" + id+"-"+parentId);
                o.addProperty("parentId", parentId);
                datas.put("PRODUCT:CATEGORY:"+id, o.toString());
            }
            redisTemplate.opsForValue().multiSet(datas);
            datas = Maps.newHashMap();
            for (int i = 0; i < 100; i++) {
                long suffix_1 = i + 1;
                for (int j = 0; j < 100; j++) {
                    CategoryRecord record = new CategoryRecord();
                    long suffix_2 = j + 1;
                    long id = 100+i*100+suffix_2;
                    long parentId = suffix_1;
                    JsonObject o = new JsonObject();
                    o.addProperty("name", "类目-" + id+"-"+parentId);
                    o.addProperty("parentId", parentId);
                    datas.put("PRODUCT:CATEGORY:"+id, o.toString());
                    if (datas.size() >= 1000) {
                        redisTemplate.opsForValue().multiSet(datas);
                        datas = Maps.newHashMap();
                    }
                }
            }
            redisTemplate.opsForValue().multiSet(datas);
            datas = Maps.newHashMap();
            for (int i = 0; i < 100; i++) {
                long suffix_1 = i + 1;
                for (int j = 0; j < 100; j++) {
                    long suffix_2 = j + 1;
                    for (int k = 0; k < 1000; k++) {
                        CategoryRecord record = new CategoryRecord();
                        long suffix_3 = k + 1;
                        long id = 10100+i*100*1000+j*1000+suffix_3;
                        long parentId = 100+i*100+suffix_2;
                        JsonObject o = new JsonObject();
                        o.addProperty("name", "类目-" + id+"-"+parentId);
                        o.addProperty("parentId", parentId);
                        datas.put("PRODUCT:CATEGORY:"+id, o.toString());
                        if (datas.size() >= 1000) {
                            redisTemplate.opsForValue().multiSet(datas);
                            datas = Maps.newHashMap();
                        }
                    }
                }
            }
            redisTemplate.opsForValue().multiSet(datas);
        }
    }


    @Test
    public void generateCategoryIdCsv() {
        String csvFile = "C:\\Users\\azureuser\\Desktop\\category_id.csv";
        try {
            FileWriter writer = new FileWriter(csvFile);
            Random rand = new Random();
            for (int i = 10101; i < 10010101; i++) {
                writer.append(Integer.toString(i));
                writer.append("\n");
            }
            writer.flush();
            writer.close();
            System.out.println("CSV 文件已生成！");
        } catch (IOException e) {
            e.printStackTrace();
        }

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
