package com.azure.csu.tiger.user.dao;

import com.azure.csu.tiger.user.jooq.tables.records.UserRecord;

import java.util.Collection;
import java.util.List;

public interface UserDao {

    void createUsers(Collection<UserRecord> users);

    List<UserRecord> listUsers(Collection<Long> ids);

    List<UserRecord> listAllUsers(int offset, int limit);

    UserRecord findUser(String name, String password);
}
