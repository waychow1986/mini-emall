package com.azure.csu.tiger.user.dao.impl;

import com.azure.csu.tiger.user.dao.UserAddressDao;
import com.azure.csu.tiger.user.jooq.Tables;
import com.azure.csu.tiger.user.jooq.tables.UserAddress;
import com.azure.csu.tiger.user.jooq.tables.records.UserAddressRecord;
import com.azure.csu.tiger.user.jooq.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep10;
import org.jooq.InsertValuesStep7;
import org.jooq.InsertValuesStep8;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.user.jooq.Tables.USER_ADDRESS;

@Repository
public class UserAddressDaoImpl implements UserAddressDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createUserAddresses(Collection<UserAddressRecord> addresses) {
        InsertValuesStep10<UserAddressRecord, Long, String, String, String, String, String, String, Byte, Long, Long> valuesStep10 = context.insertInto(USER_ADDRESS)
                .columns(USER_ADDRESS.USER_ID, USER_ADDRESS.NAME, USER_ADDRESS.PHONE_NUMBER, USER_ADDRESS.PROVINCE, USER_ADDRESS.CITY,
                        USER_ADDRESS.REGION, USER_ADDRESS.DETAIL_ADDRESS, USER_ADDRESS.IS_DEFAULT, USER_ADDRESS.CREATE_USER_ID, USER_ADDRESS.MODIFY_USER_ID);
        addresses.stream().forEach(address -> valuesStep10.values(address.getUserId(), address.getName(), address.getPhoneNumber(), address.getProvince(),
                address.getCity(), address.getRegion(), address.getDetailAddress(), address.getIsDefault(), address.getCreateUserId(), address.getModifyUserId()));

        valuesStep10.execute();
    }

    @Override
    public List<UserAddressRecord> listUserAddresses(Collection<Long> ids) {
        if (CollectionUtils.isEmpty(ids)) {
            return Collections.emptyList();
        }
        return context.select().from(USER_ADDRESS).where(USER_ADDRESS.ID.in(ids)).fetchInto(UserAddressRecord.class);
    }

    @Override
    public List<UserAddressRecord> listUserAddressesByUids(Collection<Long> uids) {
        if (CollectionUtils.isEmpty(uids)) {
            return Collections.emptyList();
        }
        return context.select().from(USER_ADDRESS).where(USER_ADDRESS.USER_ID.in(uids)).fetchInto(UserAddressRecord.class);
    }
}
