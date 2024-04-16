package com.azure.csu.tiger.user.dao;

import com.azure.csu.tiger.user.jooq.tables.records.UserAddressRecord;

import java.util.Collection;
import java.util.List;

public interface UserAddressDao {

    void createUserAddresses(Collection<UserAddressRecord> addresses);

    List<UserAddressRecord> listUserAddresses(Collection<Long> ids);

    List<UserAddressRecord> listUserAddressesByUids(Collection<Long> uids);
}
