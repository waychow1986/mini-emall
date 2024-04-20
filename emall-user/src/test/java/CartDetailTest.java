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
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmallUserApplication.class)
public class CartDetailTest {

    @Autowired
    private CartDetailService cartDetailService;

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
}
