import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.common.utils.JsonUtil;
import com.azure.csu.tiger.user.EmallUserApplication;
import com.azure.csu.tiger.user.dto.CartDetailDTO;
import com.azure.csu.tiger.user.service.CartDetailService;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallUserApplication.class)
public class CartDetailTest {

    @Autowired
    private CartDetailService cartDetailService;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void addCart() {
        Long uid = 2L;
        cartDetailService.addCart(uid, 2L, null);
    }

    @Test
    public void getCartDetail() {
        List<CartDetailDTO> detailDTOS = cartDetailService.getCartDetail(3L);
        System.out.println(JsonUtil.obj2String(detailDTOS));
    }

    @Test
    public void clearCart() {
        if (mockData) {
            List<String> keys = Lists.newArrayList();
            for(int i = 1; i <=100000; i++) {
                keys.add(Constant.REDIS_CART_PREFIX+i);
                if (keys.size() >= 1000) {
                    redisTemplate.delete(keys);
                    keys = Lists.newArrayList();
                }
            }
            redisTemplate.delete(keys);
        }
    }

    @Test
    public void generateAddCartCsv() {
        String csvFile = "C:\\Users\\azureuser\\Desktop\\add_cart.csv";
        try {
            FileWriter writer = new FileWriter(csvFile);
            Random rand = new Random();
            for (int i = 0; i < 1000000; i++) {
                int randomInt1 = rand.nextInt(100000) + 1;
                int randomInt2 = rand.nextInt(10000000) + 1;
                writer.append(Integer.toString(randomInt1));
                writer.append(",");
                writer.append(Integer.toString(randomInt2));
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
    public void generateClearCartCsv() {
        String csvFile = "C:\\Users\\azureuser\\Desktop\\clear_cart.csv";
        try {
            FileWriter writer = new FileWriter(csvFile);
            Random rand = new Random();
            for (int i = 0; i < 100000; i++) {
                int uid = i + 1;
                writer.append(Integer.toString(uid));
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
    public void generate10000000Csv() {
        String csvFile = "C:\\Users\\azureuser\\Desktop\\id-1k.csv";
        try {
            FileWriter writer = new FileWriter(csvFile);
            Random rand = new Random();
            for (int i = 0; i < 10000000; i++) {
                int uid = i + 1;
                writer.append(Integer.toString(uid));
                writer.append("\n");
            }
            writer.flush();
            writer.close();
            System.out.println("CSV 文件已生成！");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
