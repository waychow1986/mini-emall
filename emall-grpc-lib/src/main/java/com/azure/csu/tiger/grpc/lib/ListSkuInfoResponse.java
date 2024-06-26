// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.azure.csu.tiger.grpc.lib;

/**
 * Protobuf type {@code ListSkuInfoResponse}
 */
public final class ListSkuInfoResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ListSkuInfoResponse)
    ListSkuInfoResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSkuInfoResponse.newBuilder() to construct.
  private ListSkuInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSkuInfoResponse() {
    datas_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSkuInfoResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSkuInfoResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            code_ = input.readInt32();
            break;
          }
          case 16: {

            success_ = input.readBool();
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              datas_ = new java.util.ArrayList<com.azure.csu.tiger.grpc.lib.SkuInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            datas_.add(
                input.readMessage(com.azure.csu.tiger.grpc.lib.SkuInfo.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        datas_ = java.util.Collections.unmodifiableList(datas_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_ListSkuInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_ListSkuInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.class, com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.Builder.class);
  }

  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>int32 code = 1;</code>
   * @return The code.
   */
  @java.lang.Override
  public int getCode() {
    return code_;
  }

  public static final int SUCCESS_FIELD_NUMBER = 2;
  private boolean success_;
  /**
   * <code>bool success = 2;</code>
   * @return The success.
   */
  @java.lang.Override
  public boolean getSuccess() {
    return success_;
  }

  public static final int DATAS_FIELD_NUMBER = 3;
  private java.util.List<com.azure.csu.tiger.grpc.lib.SkuInfo> datas_;
  /**
   * <code>repeated .SkuInfo datas = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.azure.csu.tiger.grpc.lib.SkuInfo> getDatasList() {
    return datas_;
  }
  /**
   * <code>repeated .SkuInfo datas = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.azure.csu.tiger.grpc.lib.SkuInfoOrBuilder> 
      getDatasOrBuilderList() {
    return datas_;
  }
  /**
   * <code>repeated .SkuInfo datas = 3;</code>
   */
  @java.lang.Override
  public int getDatasCount() {
    return datas_.size();
  }
  /**
   * <code>repeated .SkuInfo datas = 3;</code>
   */
  @java.lang.Override
  public com.azure.csu.tiger.grpc.lib.SkuInfo getDatas(int index) {
    return datas_.get(index);
  }
  /**
   * <code>repeated .SkuInfo datas = 3;</code>
   */
  @java.lang.Override
  public com.azure.csu.tiger.grpc.lib.SkuInfoOrBuilder getDatasOrBuilder(
      int index) {
    return datas_.get(index);
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
    if (code_ != 0) {
      output.writeInt32(1, code_);
    }
    if (success_ != false) {
      output.writeBool(2, success_);
    }
    for (int i = 0; i < datas_.size(); i++) {
      output.writeMessage(3, datas_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, code_);
    }
    if (success_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, success_);
    }
    for (int i = 0; i < datas_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, datas_.get(i));
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
    if (!(obj instanceof com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse)) {
      return super.equals(obj);
    }
    com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse other = (com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse) obj;

    if (getCode()
        != other.getCode()) return false;
    if (getSuccess()
        != other.getSuccess()) return false;
    if (!getDatasList()
        .equals(other.getDatasList())) return false;
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + SUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getSuccess());
    if (getDatasCount() > 0) {
      hash = (37 * hash) + DATAS_FIELD_NUMBER;
      hash = (53 * hash) + getDatasList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parseFrom(
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
  public static Builder newBuilder(com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse prototype) {
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
   * Protobuf type {@code ListSkuInfoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ListSkuInfoResponse)
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_ListSkuInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_ListSkuInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.class, com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.Builder.class);
    }

    // Construct using com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.newBuilder()
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
        getDatasFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      success_ = false;

      if (datasBuilder_ == null) {
        datas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        datasBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_ListSkuInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse getDefaultInstanceForType() {
      return com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse build() {
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse buildPartial() {
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse result = new com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse(this);
      int from_bitField0_ = bitField0_;
      result.code_ = code_;
      result.success_ = success_;
      if (datasBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          datas_ = java.util.Collections.unmodifiableList(datas_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.datas_ = datas_;
      } else {
        result.datas_ = datasBuilder_.build();
      }
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
      if (other instanceof com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse) {
        return mergeFrom((com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse other) {
      if (other == com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (other.getSuccess() != false) {
        setSuccess(other.getSuccess());
      }
      if (datasBuilder_ == null) {
        if (!other.datas_.isEmpty()) {
          if (datas_.isEmpty()) {
            datas_ = other.datas_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatasIsMutable();
            datas_.addAll(other.datas_);
          }
          onChanged();
        }
      } else {
        if (!other.datas_.isEmpty()) {
          if (datasBuilder_.isEmpty()) {
            datasBuilder_.dispose();
            datasBuilder_ = null;
            datas_ = other.datas_;
            bitField0_ = (bitField0_ & ~0x00000001);
            datasBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDatasFieldBuilder() : null;
          } else {
            datasBuilder_.addAllMessages(other.datas_);
          }
        }
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
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int code_ ;
    /**
     * <code>int32 code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public int getCode() {
      return code_;
    }
    /**
     * <code>int32 code = 1;</code>
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 code = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private boolean success_ ;
    /**
     * <code>bool success = 2;</code>
     * @return The success.
     */
    @java.lang.Override
    public boolean getSuccess() {
      return success_;
    }
    /**
     * <code>bool success = 2;</code>
     * @param value The success to set.
     * @return This builder for chaining.
     */
    public Builder setSuccess(boolean value) {
      
      success_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool success = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSuccess() {
      
      success_ = false;
      onChanged();
      return this;
    }

    private java.util.List<com.azure.csu.tiger.grpc.lib.SkuInfo> datas_ =
      java.util.Collections.emptyList();
    private void ensureDatasIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        datas_ = new java.util.ArrayList<com.azure.csu.tiger.grpc.lib.SkuInfo>(datas_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.azure.csu.tiger.grpc.lib.SkuInfo, com.azure.csu.tiger.grpc.lib.SkuInfo.Builder, com.azure.csu.tiger.grpc.lib.SkuInfoOrBuilder> datasBuilder_;

    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public java.util.List<com.azure.csu.tiger.grpc.lib.SkuInfo> getDatasList() {
      if (datasBuilder_ == null) {
        return java.util.Collections.unmodifiableList(datas_);
      } else {
        return datasBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public int getDatasCount() {
      if (datasBuilder_ == null) {
        return datas_.size();
      } else {
        return datasBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public com.azure.csu.tiger.grpc.lib.SkuInfo getDatas(int index) {
      if (datasBuilder_ == null) {
        return datas_.get(index);
      } else {
        return datasBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder setDatas(
        int index, com.azure.csu.tiger.grpc.lib.SkuInfo value) {
      if (datasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasIsMutable();
        datas_.set(index, value);
        onChanged();
      } else {
        datasBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder setDatas(
        int index, com.azure.csu.tiger.grpc.lib.SkuInfo.Builder builderForValue) {
      if (datasBuilder_ == null) {
        ensureDatasIsMutable();
        datas_.set(index, builderForValue.build());
        onChanged();
      } else {
        datasBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder addDatas(com.azure.csu.tiger.grpc.lib.SkuInfo value) {
      if (datasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasIsMutable();
        datas_.add(value);
        onChanged();
      } else {
        datasBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder addDatas(
        int index, com.azure.csu.tiger.grpc.lib.SkuInfo value) {
      if (datasBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatasIsMutable();
        datas_.add(index, value);
        onChanged();
      } else {
        datasBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder addDatas(
        com.azure.csu.tiger.grpc.lib.SkuInfo.Builder builderForValue) {
      if (datasBuilder_ == null) {
        ensureDatasIsMutable();
        datas_.add(builderForValue.build());
        onChanged();
      } else {
        datasBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder addDatas(
        int index, com.azure.csu.tiger.grpc.lib.SkuInfo.Builder builderForValue) {
      if (datasBuilder_ == null) {
        ensureDatasIsMutable();
        datas_.add(index, builderForValue.build());
        onChanged();
      } else {
        datasBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder addAllDatas(
        java.lang.Iterable<? extends com.azure.csu.tiger.grpc.lib.SkuInfo> values) {
      if (datasBuilder_ == null) {
        ensureDatasIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, datas_);
        onChanged();
      } else {
        datasBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder clearDatas() {
      if (datasBuilder_ == null) {
        datas_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        datasBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public Builder removeDatas(int index) {
      if (datasBuilder_ == null) {
        ensureDatasIsMutable();
        datas_.remove(index);
        onChanged();
      } else {
        datasBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public com.azure.csu.tiger.grpc.lib.SkuInfo.Builder getDatasBuilder(
        int index) {
      return getDatasFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public com.azure.csu.tiger.grpc.lib.SkuInfoOrBuilder getDatasOrBuilder(
        int index) {
      if (datasBuilder_ == null) {
        return datas_.get(index);  } else {
        return datasBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public java.util.List<? extends com.azure.csu.tiger.grpc.lib.SkuInfoOrBuilder> 
         getDatasOrBuilderList() {
      if (datasBuilder_ != null) {
        return datasBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(datas_);
      }
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public com.azure.csu.tiger.grpc.lib.SkuInfo.Builder addDatasBuilder() {
      return getDatasFieldBuilder().addBuilder(
          com.azure.csu.tiger.grpc.lib.SkuInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public com.azure.csu.tiger.grpc.lib.SkuInfo.Builder addDatasBuilder(
        int index) {
      return getDatasFieldBuilder().addBuilder(
          index, com.azure.csu.tiger.grpc.lib.SkuInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .SkuInfo datas = 3;</code>
     */
    public java.util.List<com.azure.csu.tiger.grpc.lib.SkuInfo.Builder> 
         getDatasBuilderList() {
      return getDatasFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.azure.csu.tiger.grpc.lib.SkuInfo, com.azure.csu.tiger.grpc.lib.SkuInfo.Builder, com.azure.csu.tiger.grpc.lib.SkuInfoOrBuilder> 
        getDatasFieldBuilder() {
      if (datasBuilder_ == null) {
        datasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.azure.csu.tiger.grpc.lib.SkuInfo, com.azure.csu.tiger.grpc.lib.SkuInfo.Builder, com.azure.csu.tiger.grpc.lib.SkuInfoOrBuilder>(
                datas_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        datas_ = null;
      }
      return datasBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ListSkuInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:ListSkuInfoResponse)
  private static final com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse();
  }

  public static com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSkuInfoResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSkuInfoResponse>() {
    @java.lang.Override
    public ListSkuInfoResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSkuInfoResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSkuInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSkuInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

