// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.azure.csu.tiger.grpc.lib;

public interface CategoryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Category)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>int64 parentId = 3;</code>
   * @return The parentId.
   */
  long getParentId();

  /**
   * <code>bool isLeaf = 4;</code>
   * @return The isLeaf.
   */
  boolean getIsLeaf();

  /**
   * <code>int32 sort = 5;</code>
   * @return The sort.
   */
  int getSort();
}
