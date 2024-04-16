package com.azure.csu.tiger.user.dao.impl;

import com.azure.csu.tiger.user.dao.UserDao;
import com.azure.csu.tiger.user.jooq.Tables;
import com.azure.csu.tiger.user.jooq.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.InsertSetStep;
import org.jooq.InsertValuesStep2;
import org.jooq.InsertValuesStep7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createUsers(Collection<UserRecord> users) {
        InsertValuesStep7<UserRecord, String, String, String, String, String, Byte, Byte> valuesStep7 = context.insertInto(Tables.USER)
                .columns(Tables.USER.LOGIN_NAME, Tables.USER.NICK_NAME, Tables.USER.PASSWORD, Tables.USER.PHONE_NUMBER, Tables.USER.EMAIL, Tables.USER.SEX,
                        Tables.USER.STATUS);
        users.stream().forEach(user -> valuesStep7.values(user.getLoginName(), user.getNickName(), user.getPassword(), user.getPhoneNumber(), user.getEmail(),
                user.getSex(), user.getStatus()));

        valuesStep7.execute();
    }

    @Override
    public List<UserRecord> listUsers(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(Tables.USER).where(Tables.USER.ID.in(ids)).fetchInto(UserRecord.class);
    }

    @Override
    public List<UserRecord> listAllUsers(int offset, int limit) {
        if (offset < 0 || limit < 0) {
            return Collections.emptyList();
        }
        return context.select().from(Tables.USER).offset(offset).limit(limit).fetchInto(UserRecord.class);
    }

    @Override
    public UserRecord findUser(String name, String password) {
        if (!StringUtils.hasText(name) || !StringUtils.hasText(password)) {
            return null;
        }
        return context.select().from(Tables.USER).where(Tables.USER.LOGIN_NAME.eq(name)).and(Tables.USER.PASSWORD.eq(password)).fetchSingleInto(UserRecord.class);
    }
}
