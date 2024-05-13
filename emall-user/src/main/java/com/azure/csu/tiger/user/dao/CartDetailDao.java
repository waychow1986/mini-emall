package com.azure.csu.tiger.user.dao;

import com.azure.csu.tiger.user.jooq.tables.records.CartDetailRecord;

import java.util.Collection;
import java.util.List;

public interface CartDetailDao {

    /**
     * 添加购物车明细
     * @param userid
     * @param skuId
     * @param skuNum
     */
    void createCartDetail(Long userid, Long skuId, Long skuNum);

    /**
     * 批量添加购物车
     * @param records
     */
    void createCartDetails(Collection<CartDetailRecord> records);

    /**
     * 根据id删除明细
     * @param id
     */
    boolean removeCartDetail(Long id);

    /**
     * 根据uid删除清空购物车
     * @param uid
     */
    boolean clearCart(Long uid);

    /**
     * 根据id查询明细
     * @param id
     * @return
     */
    CartDetailRecord findCartDetail(Long id);

    /**
     * 根据uid查询全部购物车明细
     * @param uid
     * @return
     */
    List<CartDetailRecord> listCart(Long uid);

    /**
     * 根据uid、skuId查询购物车明细
     * @param uid
     * @param skuId
     * @return
     */
    CartDetailRecord findCartDetail(Long uid, Long skuId);

    /**
     * 设定指定uid、skuId的skuNum
     * @param uid
     * @param skuId
     * @param skuNum
     */
    boolean setCartDetailNum(Long uid, Long skuId, Long skuNum);
}
