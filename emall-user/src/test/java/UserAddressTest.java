import com.azure.csu.tiger.user.EmallUserApplication;
import com.azure.csu.tiger.user.dao.UserAddressDao;
import com.azure.csu.tiger.user.dao.UserDao;
import com.azure.csu.tiger.user.jooq.tables.User;
import com.azure.csu.tiger.user.jooq.tables.records.UserAddressRecord;
import com.azure.csu.tiger.user.jooq.tables.records.UserRecord;
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
public class UserAddressTest {

    @Autowired
    private UserAddressDao userAddressDao;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void createUserAddresses() {
        if (mockData) {
            List<UserAddressRecord> datas = Lists.newArrayList();
            for (int i = 0; i < 100000; i++) {
                UserAddressRecord record = new UserAddressRecord();
                long suffix = i + 1;
                record.setUserId(suffix);
                record.setName("user-" + suffix + "-contact");
                record.setPhoneNumber("18611111111");
                record.setProvince("江苏省");
                record.setCity("南京市");
                record.setRegion("雨花区");
                record.setDetailAddress("天朔创新园东门");
                record.setIsDefault((byte) 1);
                record.setCreateUserId(suffix);
                record.setModifyUserId(suffix);
                datas.add(record);
                if (datas.size() == 5000) {
                    userAddressDao.createUserAddresses(datas);
                    datas = Lists.newArrayList();
                }
            }
            userAddressDao.createUserAddresses(datas);
        }
    }

}
