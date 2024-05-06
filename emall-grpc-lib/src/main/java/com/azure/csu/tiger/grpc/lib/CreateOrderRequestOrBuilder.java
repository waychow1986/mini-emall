// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: order.proto

package com.azure.csu.tiger.grpc.lib;

public interface CreateOrderRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:CreateOrderRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 userId = 1;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>int64 addressId = 2;</code>
   * @return The addressId.
   */
  long getAddressId();

  /**
   * <code>int32 sourceType = 3;</code>
   * @return The sourceType.
   */
  int getSourceType();

  /**
   * <code>int64 totalAmount = 4;</code>
   * @return The totalAmount.
   */
  long getTotalAmount();

  /**
   * <code>int64 couponAmount = 5;</code>
   * @return The couponAmount.
   */
  long getCouponAmount();

  /**
   * <code>int64 shippingAmount = 6;</code>
   * @return The shippingAmount.
   */
  long getShippingAmount();

  /**
   * <code>int64 payAmount = 7;</code>
   * @return The payAmount.
   */
  long getPayAmount();

  /**
   * <code>string comment = 8;</code>
   * @return The comment.
   */
  java.lang.String getComment();
  /**
   * <code>string comment = 8;</code>
   * @return The bytes for comment.
   */
  com.google.protobuf.ByteString
      getCommentBytes();

  /**
   * <code>repeated .OrderItemSku skuData = 9;</code>
   */
  java.util.List<com.azure.csu.tiger.grpc.lib.OrderItemSku> 
      getSkuDataList();
  /**
   * <code>repeated .OrderItemSku skuData = 9;</code>
   */
  com.azure.csu.tiger.grpc.lib.OrderItemSku getSkuData(int index);
  /**
   * <code>repeated .OrderItemSku skuData = 9;</code>
   */
  int getSkuDataCount();
  /**
   * <code>repeated .OrderItemSku skuData = 9;</code>
   */
  java.util.List<? extends com.azure.csu.tiger.grpc.lib.OrderItemSkuOrBuilder> 
      getSkuDataOrBuilderList();
  /**
   * <code>repeated .OrderItemSku skuData = 9;</code>
   */
  com.azure.csu.tiger.grpc.lib.OrderItemSkuOrBuilder getSkuDataOrBuilder(
      int index);
}