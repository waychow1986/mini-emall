package com.azure.csu.tiger.user.dao.impl;

import com.azure.csu.tiger.user.dao.CartDetailDao;
import com.azure.csu.tiger.user.jooq.Tables;
import com.azure.csu.tiger.user.jooq.tables.records.CartDetailRecord;
import com.azure.csu.tiger.user.jooq.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.jooq.InsertValuesStep3;
import org.jooq.InsertValuesStep7;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static com.azure.csu.tiger.user.jooq.Tables.CART_DETAIL;

@Repository
public class CartDetailDaoImpl implements CartDetailDao {

    @Autowired
    private DSLContext context;

    @Override
    public void createCartDetail(Long userid, Long skuId, Long skuNum) {
        if (userid == null || skuId == null || skuNum == null) {
            return;
        }
        InsertValuesStep3<CartDetailRecord, Long, Long, Long> valuesStep3 = context.insertInto(CART_DETAIL)
                .columns(CART_DETAIL.USER_ID, CART_DETAIL.SKU_ID, CART_DETAIL.SKU_NUM);
        valuesStep3.values(userid, skuId, skuNum);

        valuesStep3.execute();

//        CartDetailRecord record = new CartDetailRecord();
//        record.setUserId(userid);
//        record.setSkuId(skuId);
//        record.setSkuNum(skuNum);
//        return context.insertInto(CART_DETAIL).set(record).returning(CART_DETAIL.ID).fetchOne().getId();
    }

    @Override
    public void createCartDetails(Collection<CartDetailRecord> records) {
        InsertValuesStep3<CartDetailRecord, Long, Long, Long> valuesStep3 = context.insertInto(CART_DETAIL)
                .columns(CART_DETAIL.USER_ID, CART_DETAIL.SKU_ID, CART_DETAIL.SKU_NUM);
        records.stream().forEach(r -> valuesStep3.values(r.getUserId(), r.getSkuId(), r.getSkuNum()));

        valuesStep3.execute();
    }

    @Override
    public boolean removeCartDetail(Long id) {
        if (id == null) {
            return false;
        }
        CartDetailRecord record = context.newRecord(CART_DETAIL);
        record.setId(id);
        record.delete();
        return true;
    }

    @Override
    public boolean clearCart(Long uid) {
        if (uid == null) {
            return false;
        }
        context.delete(CART_DETAIL).where(CART_DETAIL.USER_ID.eq(uid)).execute();
        return true;
    }

    @Override
    public CartDetailRecord findCartDetail(Long id) {
        if (id == null) {
            return null;
        }
        CartDetailRecord record = context.select().from(CART_DETAIL).where(CART_DETAIL.ID.eq(id)).fetchSingleInto(CartDetailRecord.class);
        return record;
    }

    @Override
    public List<CartDetailRecord> listCart(Long uid) {
        if (uid == null) {
            return Collections.emptyList();
        }
        return context.select().from(CART_DETAIL).where(CART_DETAIL.USER_ID.eq(uid)).fetchInto(CartDetailRecord.class);
    }

    @Override
    public CartDetailRecord findCartDetail(Long uid, Long skuId) {
        if (uid == null || skuId == null) {
            return null;
        }
        return context.select().from(CART_DETAIL).where(CART_DETAIL.USER_ID.eq(uid))
                .and(CART_DETAIL.SKU_ID.eq(skuId)).fetchSingleInto(CartDetailRecord.class);
    }

    @Override
    public boolean setCartDetailNum(Long uid, Long skuId, Long skuNum) {
        if (uid == null || skuId == null || skuNum == null) {
            return false;
        }
        context.update(CART_DETAIL).set(CART_DETAIL.SKU_NUM, skuNum).where(CART_DETAIL.USER_ID.eq(uid)).execute();
//        CartDetailRecord record = context.select().from(CART_DETAIL).where(CART_DETAIL.USER_ID.eq(uid))
//                .and(CART_DETAIL.SKU_ID.eq(skuId)).fetchSingleInto(CartDetailRecord.class);
//        record.setSkuNum(skuNum);
//        record.update(CART_DETAIL.SKU_NUM);
        return true;
    }
}
