// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto

package com.azure.csu.tiger.grpc.lib;

public interface OrderInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OrderInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 userId = 1;</code>
   * @return The userId.
   */
  long getUserId();

  /**
   * <code>string address = 2;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 2;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>string sourceType = 3;</code>
   * @return The sourceType.
   */
  java.lang.String getSourceType();
  /**
   * <code>string sourceType = 3;</code>
   * @return The bytes for sourceType.
   */
  com.google.protobuf.ByteString
      getSourceTypeBytes();

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
   * <code>string shipping_no = 9;</code>
   * @return The shippingNo.
   */
  java.lang.String getShippingNo();
  /**
   * <code>string shipping_no = 9;</code>
   * @return The bytes for shippingNo.
   */
  com.google.protobuf.ByteString
      getShippingNoBytes();

  /**
   * <code>string status = 10;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 10;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <code>string order_sn = 11;</code>
   * @return The orderSn.
   */
  java.lang.String getOrderSn();
  /**
   * <code>string order_sn = 11;</code>
   * @return The bytes for orderSn.
   */
  com.google.protobuf.ByteString
      getOrderSnBytes();

  /**
   * <code>string createTime = 12;</code>
   * @return The createTime.
   */
  java.lang.String getCreateTime();
  /**
   * <code>string createTime = 12;</code>
   * @return The bytes for createTime.
   */
  com.google.protobuf.ByteString
      getCreateTimeBytes();

  /**
   * <code>string sendTime = 13;</code>
   * @return The sendTime.
   */
  java.lang.String getSendTime();
  /**
   * <code>string sendTime = 13;</code>
   * @return The bytes for sendTime.
   */
  com.google.protobuf.ByteString
      getSendTimeBytes();

  /**
   * <code>string finishTime = 14;</code>
   * @return The finishTime.
   */
  java.lang.String getFinishTime();
  /**
   * <code>string finishTime = 14;</code>
   * @return The bytes for finishTime.
   */
  com.google.protobuf.ByteString
      getFinishTimeBytes();

  /**
   * <code>repeated .OrderItemSku skuData = 15;</code>
   */
  java.util.List<com.azure.csu.tiger.grpc.lib.OrderItemSku> 
      getSkuDataList();
  /**
   * <code>repeated .OrderItemSku skuData = 15;</code>
   */
  com.azure.csu.tiger.grpc.lib.OrderItemSku getSkuData(int index);
  /**
   * <code>repeated .OrderItemSku skuData = 15;</code>
   */
  int getSkuDataCount();
  /**
   * <code>repeated .OrderItemSku skuData = 15;</code>
   */
  java.util.List<? extends com.azure.csu.tiger.grpc.lib.OrderItemSkuOrBuilder> 
      getSkuDataOrBuilderList();
  /**
   * <code>repeated .OrderItemSku skuData = 15;</code>
   */
  com.azure.csu.tiger.grpc.lib.OrderItemSkuOrBuilder getSkuDataOrBuilder(
      int index);
}