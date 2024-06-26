// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: product.proto

package com.azure.csu.tiger.grpc.lib;

/**
 * Protobuf type {@code GetSkuDetailRequest}
 */
public final class GetSkuDetailRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GetSkuDetailRequest)
    GetSkuDetailRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetSkuDetailRequest.newBuilder() to construct.
  private GetSkuDetailRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetSkuDetailRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetSkuDetailRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetSkuDetailRequest(
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
    return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_GetSkuDetailRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_GetSkuDetailRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.class, com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.Builder.class);
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
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest)) {
      return super.equals(obj);
    }
    com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest other = (com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest) obj;

    if (getSkuId()
        != other.getSkuId()) return false;
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
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parseFrom(
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
  public static Builder newBuilder(com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest prototype) {
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
   * Protobuf type {@code GetSkuDetailRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GetSkuDetailRequest)
      com.azure.csu.tiger.grpc.lib.GetSkuDetailRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_GetSkuDetailRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_GetSkuDetailRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.class, com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.Builder.class);
    }

    // Construct using com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.newBuilder()
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

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.azure.csu.tiger.grpc.lib.ProductProto.internal_static_GetSkuDetailRequest_descriptor;
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest getDefaultInstanceForType() {
      return com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest build() {
      com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest buildPartial() {
      com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest result = new com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest(this);
      result.skuId_ = skuId_;
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
      if (other instanceof com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest) {
        return mergeFrom((com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest other) {
      if (other == com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.getDefaultInstance()) return this;
      if (other.getSkuId() != 0L) {
        setSkuId(other.getSkuId());
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
      com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest) e.getUnfinishedMessage();
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


    // @@protoc_insertion_point(builder_scope:GetSkuDetailRequest)
  }

  // @@protoc_insertion_point(class_scope:GetSkuDetailRequest)
  private static final com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest();
  }

  public static com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetSkuDetailRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetSkuDetailRequest>() {
    @java.lang.Override
    public GetSkuDetailRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetSkuDetailRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetSkuDetailRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetSkuDetailRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

