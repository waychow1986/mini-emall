// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto

package com.azure.csu.tiger.grpc.lib;

public interface OrderItemSkuOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OrderItemSku)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 skuId = 1;</code>
   * @return The skuId.
   */
  long getSkuId();

  /**
   * <code>int64 skuPrice = 2;</code>
   * @return The skuPrice.
   */
  long getSkuPrice();

  /**
   * <code>int64 skuNum = 3;</code>
   * @return The skuNum.
   */
  long getSkuNum();

  /**
   * <code>int64 splitCouponAmount = 4;</code>
   * @return The splitCouponAmount.
   */
  long getSplitCouponAmount();

  /**
   * <code>string skuName = 5;</code>
   * @return The skuName.
   */
  java.lang.String getSkuName();
  /**
   * <code>string skuName = 5;</code>
   * @return The bytes for skuName.
   */
  com.google.protobuf.ByteString
      getSkuNameBytes();
}
