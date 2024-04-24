import com.azure.csu.tiger.common.utils.Constant;
import com.azure.csu.tiger.common.utils.JsonUtil;
import com.azure.csu.tiger.user.EmallUserApplication;
import com.azure.csu.tiger.user.dao.UserAddressDao;
import com.azure.csu.tiger.user.dto.CartDetailDTO;
import com.azure.csu.tiger.user.jooq.tables.records.UserAddressRecord;
import com.azure.csu.tiger.user.service.CartDetailService;
import com.google.common.collect.Lists;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallUserApplication.class)
public class CartDetailTest {

    @Autowired
    private CartDetailService cartDetailService;

    private RedisTemplate<String, String> redisTemplate;

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
        List<String> keys = Lists.newArrayList();
        Cursor<String> cursor = redisTemplate.scan(ScanOptions.scanOptions().match(Constant.REDIS_CART_PREFIX).build());
        while (cursor.hasNext()) {
            keys.add(new String(cursor.next()));
            if (keys.size() >= 1000) {
                redisTemplate.delete(keys);
                keys = Lists.newArrayList();
            }
        }
        cursor.close();
        redisTemplate.delete(keys);
    }
}
