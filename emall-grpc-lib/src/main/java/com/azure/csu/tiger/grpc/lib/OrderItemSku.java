// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: base.proto

package com.azure.csu.tiger.grpc.lib;

/**
 * Protobuf type {@code OrderItemSku}
 */
public final class OrderItemSku extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderItemSku)
    OrderItemSkuOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderItemSku.newBuilder() to construct.
  private OrderItemSku(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderItemSku() {
    skuName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderItemSku();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderItemSku(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {

            skuId_ = input.readInt64();
            break;
          }
          case 16: {

            skuPrice_ = input.readInt64();
            break;
          }
          case 24: {

            skuNum_ = input.readInt64();
            break;
          }
          case 32: {

            splitCouponAmount_ = input.readInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            skuName_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.azure.csu.tiger.grpc.lib.BaseProto.internal_static_OrderItemSku_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.azure.csu.tiger.grpc.lib.BaseProto.internal_static_OrderItemSku_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.azure.csu.tiger.grpc.lib.OrderItemSku.class, com.azure.csu.tiger.grpc.lib.OrderItemSku.Builder.class);
  }

  public static final int SKUID_FIELD_NUMBER = 1;
  private long skuId_;
  /**
   * <code>int64 skuId = 1;</code>
   * @return The skuId.
   */
  @java.lang.Override
  public long getSkuId() {
    return skuId_;
  }

  public static final int SKUPRICE_FIELD_NUMBER = 2;
  private long skuPrice_;
  /**
   * <code>int64 skuPrice = 2;</code>
   * @return The skuPrice.
   */
  @java.lang.Override
  public long getSkuPrice() {
    return skuPrice_;
  }

  public static final int SKUNUM_FIELD_NUMBER = 3;
  private long skuNum_;
  /**
   * <code>int64 skuNum = 3;</code>
   * @return The skuNum.
   */
  @java.lang.Override
  public long getSkuNum() {
    return skuNum_;
  }

  public static final int SPLITCOUPONAMOUNT_FIELD_NUMBER = 4;
  private long splitCouponAmount_;
  /**
   * <code>int64 splitCouponAmount = 4;</code>
   * @return The splitCouponAmount.
   */
  @java.lang.Override
  public long getSplitCouponAmount() {
    return splitCouponAmount_;
  }

  public static final int SKUNAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object skuName_;
  /**
   * <code>string skuName = 5;</code>
   * @return The skuName.
   */
  @java.lang.Override
  public java.lang.String getSkuName() {
    java.lang.Object ref = skuName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuName_ = s;
      return s;
    }
  }
  /**
   * <code>string skuName = 5;</code>
   * @return The bytes for skuName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSkuNameBytes() {
    java.lang.Object ref = skuName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      skuName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (skuId_ != 0L) {
      output.writeInt64(1, skuId_);
    }
    if (skuPrice_ != 0L) {
      output.writeInt64(2, skuPrice_);
    }
    if (skuNum_ != 0L) {
      output.writeInt64(3, skuNum_);
    }
    if (splitCouponAmount_ != 0L) {
      output.writeInt64(4, splitCouponAmount_);
    }
    if (!getSkuNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, skuName_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skuId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, skuId_);
    }
    if (skuPrice_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, skuPrice_);
    }
    if (skuNum_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, skuNum_);
    }
    if (splitCouponAmount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, splitCouponAmount_);
    }
    if (!getSkuNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, skuName_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.azure.csu.tiger.grpc.lib.OrderItemSku)) {
      return super.equals(obj);
    }
    com.azure.csu.tiger.grpc.lib.OrderItemSku other = (com.azure.csu.tiger.grpc.lib.OrderItemSku) obj;

    if (getSkuId()
        != other.getSkuId()) return false;
    if (getSkuPrice()
        != other.getSkuPrice()) return false;
    if (getSkuNum()
        != other.getSkuNum()) return false;
    if (getSplitCouponAmount()
        != other.getSplitCouponAmount()) return false;
    if (!getSkuName()
        .equals(other.getSkuName())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SKUID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkuId());
    hash = (37 * hash) + SKUPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkuPrice());
    hash = (37 * hash) + SKUNUM_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSkuNum());
    hash = (37 * hash) + SPLITCOUPONAMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSplitCouponAmount());
    hash = (37 * hash) + SKUNAME_FIELD_NUMBER;
    hash = (53 * hash) + getSkuName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.OrderItemSku parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.azure.csu.tiger.grpc.lib.OrderItemSku prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code OrderItemSku}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OrderItemSku)
      com.azure.csu.tiger.grpc.lib.OrderItemSkuOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.azure.csu.tiger.grpc.lib.BaseProto.internal_static_OrderItemSku_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.azure.csu.tiger.grpc.lib.BaseProto.internal_static_OrderItemSku_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.azure.csu.tiger.grpc.lib.OrderItemSku.class, com.azure.csu.tiger.grpc.lib.OrderItemSku.Builder.class);
    }

    // Construct using com.azure.csu.tiger.grpc.lib.OrderItemSku.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      skuId_ = 0L;

      skuPrice_ = 0L;

      skuNum_ = 0L;

      splitCouponAmount_ = 0L;

      skuName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.azure.csu.tiger.grpc.lib.BaseProto.internal_static_OrderItemSku_descriptor;
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.OrderItemSku getDefaultInstanceForType() {
      return com.azure.csu.tiger.grpc.lib.OrderItemSku.getDefaultInstance();
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.OrderItemSku build() {
      com.azure.csu.tiger.grpc.lib.OrderItemSku result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.OrderItemSku buildPartial() {
      com.azure.csu.tiger.grpc.lib.OrderItemSku result = new com.azure.csu.tiger.grpc.lib.OrderItemSku(this);
      result.skuId_ = skuId_;
      result.skuPrice_ = skuPrice_;
      result.skuNum_ = skuNum_;
      result.splitCouponAmount_ = splitCouponAmount_;
      result.skuName_ = skuName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.azure.csu.tiger.grpc.lib.OrderItemSku) {
        return mergeFrom((com.azure.csu.tiger.grpc.lib.OrderItemSku)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.azure.csu.tiger.grpc.lib.OrderItemSku other) {
      if (other == com.azure.csu.tiger.grpc.lib.OrderItemSku.getDefaultInstance()) return this;
      if (other.getSkuId() != 0L) {
        setSkuId(other.getSkuId());
      }
      if (other.getSkuPrice() != 0L) {
        setSkuPrice(other.getSkuPrice());
      }
      if (other.getSkuNum() != 0L) {
        setSkuNum(other.getSkuNum());
      }
      if (other.getSplitCouponAmount() != 0L) {
        setSplitCouponAmount(other.getSplitCouponAmount());
      }
      if (!other.getSkuName().isEmpty()) {
        skuName_ = other.skuName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.azure.csu.tiger.grpc.lib.OrderItemSku parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.azure.csu.tiger.grpc.lib.OrderItemSku) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long skuId_ ;
    /**
     * <code>int64 skuId = 1;</code>
     * @return The skuId.
     */
    @java.lang.Override
    public long getSkuId() {
      return skuId_;
    }
    /**
     * <code>int64 skuId = 1;</code>
     * @param value The skuId to set.
     * @return This builder for chaining.
     */
    public Builder setSkuId(long value) {
      
      skuId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 skuId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuId() {
      
      skuId_ = 0L;
      onChanged();
      return this;
    }

    private long skuPrice_ ;
    /**
     * <code>int64 skuPrice = 2;</code>
     * @return The skuPrice.
     */
    @java.lang.Override
    public long getSkuPrice() {
      return skuPrice_;
    }
    /**
     * <code>int64 skuPrice = 2;</code>
     * @param value The skuPrice to set.
     * @return This builder for chaining.
     */
    public Builder setSkuPrice(long value) {
      
      skuPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 skuPrice = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuPrice() {
      
      skuPrice_ = 0L;
      onChanged();
      return this;
    }

    private long skuNum_ ;
    /**
     * <code>int64 skuNum = 3;</code>
     * @return The skuNum.
     */
    @java.lang.Override
    public long getSkuNum() {
      return skuNum_;
    }
    /**
     * <code>int64 skuNum = 3;</code>
     * @param value The skuNum to set.
     * @return This builder for chaining.
     */
    public Builder setSkuNum(long value) {
      
      skuNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 skuNum = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuNum() {
      
      skuNum_ = 0L;
      onChanged();
      return this;
    }

    private long splitCouponAmount_ ;
    /**
     * <code>int64 splitCouponAmount = 4;</code>
     * @return The splitCouponAmount.
     */
    @java.lang.Override
    public long getSplitCouponAmount() {
      return splitCouponAmount_;
    }
    /**
     * <code>int64 splitCouponAmount = 4;</code>
     * @param value The splitCouponAmount to set.
     * @return This builder for chaining.
     */
    public Builder setSplitCouponAmount(long value) {
      
      splitCouponAmount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 splitCouponAmount = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSplitCouponAmount() {
      
      splitCouponAmount_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object skuName_ = "";
    /**
     * <code>string skuName = 5;</code>
     * @return The skuName.
     */
    public java.lang.String getSkuName() {
      java.lang.Object ref = skuName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string skuName = 5;</code>
     * @return The bytes for skuName.
     */
    public com.google.protobuf.ByteString
        getSkuNameBytes() {
      java.lang.Object ref = skuName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        skuName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string skuName = 5;</code>
     * @param value The skuName to set.
     * @return This builder for chaining.
     */
    public Builder setSkuName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      skuName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string skuName = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSkuName() {
      
      skuName_ = getDefaultInstance().getSkuName();
      onChanged();
      return this;
    }
    /**
     * <code>string skuName = 5;</code>
     * @param value The bytes for skuName to set.
     * @return This builder for chaining.
     */
    public Builder setSkuNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      skuName_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:OrderItemSku)
  }

  // @@protoc_insertion_point(class_scope:OrderItemSku)
  private static final com.azure.csu.tiger.grpc.lib.OrderItemSku DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.azure.csu.tiger.grpc.lib.OrderItemSku();
  }

  public static com.azure.csu.tiger.grpc.lib.OrderItemSku getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderItemSku>
      PARSER = new com.google.protobuf.AbstractParser<OrderItemSku>() {
    @java.lang.Override
    public OrderItemSku parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderItemSku(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderItemSku> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderItemSku> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.azure.csu.tiger.grpc.lib.OrderItemSku getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

