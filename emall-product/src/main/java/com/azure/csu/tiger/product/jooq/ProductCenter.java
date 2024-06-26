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

import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ProductCenter extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>product_center</code>
     */
    public static final ProductCenter PRODUCT_CENTER = new ProductCenter();

    /**
     * 属性表
     */
    public final Attribute ATTRIBUTE = Attribute.ATTRIBUTE;

    /**
     * 类目属性关联表
     */
    public final AttributeCategory ATTRIBUTE_CATEGORY = AttributeCategory.ATTRIBUTE_CATEGORY;

    /**
     * 属性枚举值表
     */
    public final AttributeEnum ATTRIBUTE_ENUM = AttributeEnum.ATTRIBUTE_ENUM;

    /**
     * 品牌表
     */
    public final Brand BRAND = Brand.BRAND;

    /**
     * 类目表
     */
    public final Category CATEGORY = Category.CATEGORY;

    /**
     * 类目品牌关联表
     */
    public final CategoryBrand CATEGORY_BRAND = CategoryBrand.CATEGORY_BRAND;

    /**
     * 优惠券表
     */
    public final Coupon COUPON = Coupon.COUPON;

    /**
     * 优惠券适用范围表
     */
    public final CouponRange COUPON_RANGE = CouponRange.COUPON_RANGE;

    /**
     * 优惠券领用表
     */
    public final CouponTaken COUPON_TAKEN = CouponTaken.COUPON_TAKEN;

    /**
     * 优惠券使用记录表
     */
    public final CouponUsed COUPON_USED = CouponUsed.COUPON_USED;

    /**
     * SKU表
     */
    public final Sku SKU = Sku.SKU;

    /**
     * SKU属性值表
     */
    public final SkuAttributeValue SKU_ATTRIBUTE_VALUE = SkuAttributeValue.SKU_ATTRIBUTE_VALUE;

    /**
     * 商品评论表
     */
    public final SkuComment SKU_COMMENT = SkuComment.SKU_COMMENT;

    /**
     * 商品图片表
     */
    public final SkuImage SKU_IMAGE = SkuImage.SKU_IMAGE;

    /**
     * SPU表
     */
    public final Spu SPU = Spu.SPU;

    /**
     * SPU属性值表
     */
    public final SpuAttributeValue SPU_ATTRIBUTE_VALUE = SpuAttributeValue.SPU_ATTRIBUTE_VALUE;

    /**
     * No further instances allowed
     */
    private ProductCenter() {
        super("product_center", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Attribute.ATTRIBUTE,
            AttributeCategory.ATTRIBUTE_CATEGORY,
            AttributeEnum.ATTRIBUTE_ENUM,
            Brand.BRAND,
            Category.CATEGORY,
            CategoryBrand.CATEGORY_BRAND,
            Coupon.COUPON,
            CouponRange.COUPON_RANGE,
            CouponTaken.COUPON_TAKEN,
            CouponUsed.COUPON_USED,
            Sku.SKU,
            SkuAttributeValue.SKU_ATTRIBUTE_VALUE,
            SkuComment.SKU_COMMENT,
            SkuImage.SKU_IMAGE,
            Spu.SPU,
            SpuAttributeValue.SPU_ATTRIBUTE_VALUE);
    }
}
