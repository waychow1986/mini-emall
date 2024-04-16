/*
 * This file is generated by jOOQ.
 */
package com.azure.csu.tiger.product.jooq;


import com.azure.csu.tiger.product.jooq.tables.Attribute;
import com.azure.csu.tiger.product.jooq.tables.AttributeCategory;
import com.azure.csu.tiger.product.jooq.tables.AttributeEnum;
import com.azure.csu.tiger.product.jooq.tables.Brand;
import com.azure.csu.tiger.product.jooq.tables.Category;
import com.azure.csu.tiger.product.jooq.tables.CategoryBrand;
import com.azure.csu.tiger.product.jooq.tables.Coupon;
import com.azure.csu.tiger.product.jooq.tables.CouponRange;
import com.azure.csu.tiger.product.jooq.tables.CouponTaken;
import com.azure.csu.tiger.product.jooq.tables.CouponUsed;
import com.azure.csu.tiger.product.jooq.tables.Sku;
import com.azure.csu.tiger.product.jooq.tables.SkuAttributeValue;
import com.azure.csu.tiger.product.jooq.tables.SkuComment;
import com.azure.csu.tiger.product.jooq.tables.SkuImage;
import com.azure.csu.tiger.product.jooq.tables.Spu;
import com.azure.csu.tiger.product.jooq.tables.SpuAttributeValue;


/**
 * Convenience access to all tables in product_center.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * 属性表
     */
    public static final Attribute ATTRIBUTE = Attribute.ATTRIBUTE;

    /**
     * 类目属性关联表
     */
    public static final AttributeCategory ATTRIBUTE_CATEGORY = AttributeCategory.ATTRIBUTE_CATEGORY;

    /**
     * 属性枚举值表
     */
    public static final AttributeEnum ATTRIBUTE_ENUM = AttributeEnum.ATTRIBUTE_ENUM;

    /**
     * 品牌表
     */
    public static final Brand BRAND = Brand.BRAND;

    /**
     * 类目表
     */
    public static final Category CATEGORY = Category.CATEGORY;

    /**
     * 类目品牌关联表
     */
    public static final CategoryBrand CATEGORY_BRAND = CategoryBrand.CATEGORY_BRAND;

    /**
     * 优惠券表
     */
    public static final Coupon COUPON = Coupon.COUPON;

    /**
     * 优惠券适用范围表
     */
    public static final CouponRange COUPON_RANGE = CouponRange.COUPON_RANGE;

    /**
     * 优惠券领用表
     */
    public static final CouponTaken COUPON_TAKEN = CouponTaken.COUPON_TAKEN;

    /**
     * 优惠券使用记录表
     */
    public static final CouponUsed COUPON_USED = CouponUsed.COUPON_USED;

    /**
     * SKU表
     */
    public static final Sku SKU = Sku.SKU;

    /**
     * SKU属性值表
     */
    public static final SkuAttributeValue SKU_ATTRIBUTE_VALUE = SkuAttributeValue.SKU_ATTRIBUTE_VALUE;

    /**
     * 商品评论表
     */
    public static final SkuComment SKU_COMMENT = SkuComment.SKU_COMMENT;

    /**
     * 商品图片表
     */
    public static final SkuImage SKU_IMAGE = SkuImage.SKU_IMAGE;

    /**
     * SPU表
     */
    public static final Spu SPU = Spu.SPU;

    /**
     * SPU属性值表
     */
    public static final SpuAttributeValue SPU_ATTRIBUTE_VALUE = SpuAttributeValue.SPU_ATTRIBUTE_VALUE;
}
