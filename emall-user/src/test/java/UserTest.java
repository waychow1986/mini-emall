import com.azure.csu.tiger.user.EmallUserApplication;
import com.azure.csu.tiger.user.dao.UserDao;
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
public class UserTest {

    @Autowired
    private UserDao userDao;

    @Value("${test.mock.data}")
    private boolean mockData;

    @Test
    public void test(){
        if (mockData) {
            System.out.println(mockData);
        }
    }

    @Test
    public void createUsers() {
        if (mockData) {
            List<UserRecord> users = Lists.newArrayList();
            for (int i = 0; i < 100000; i++) {
                UserRecord record = new UserRecord();
                int suffix = i + 1;
                record.setLoginName("user-" + suffix);
                record.setNickName(record.getNickName());
                record.setPassword("Q1w2e3r4t5y6");
                record.setPhoneNumber("18611111111");
                record.setEmail("123@qq.com");
                record.setSex((byte) 0);
                record.setStatus((byte) 0);
                users.add(record);
                if (users.size() == 5000) {
                    userDao.createUsers(users);
                    users = Lists.newArrayList();
                }
            }
            userDao.createUsers(users);
        }
    }

}
