package com.azure.csu.tiger.grpc.lib;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * The Product service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.1)",
    comments = "Source: product.proto")
public final class ProductGrpc {

  private ProductGrpc() {}

  public static final String SERVICE_NAME = "Product";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.FindCategoryRequest,
      com.azure.csu.tiger.grpc.lib.CategoryListResponse> getListCategoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCategory",
      requestType = com.azure.csu.tiger.grpc.lib.FindCategoryRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.CategoryListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.FindCategoryRequest,
      com.azure.csu.tiger.grpc.lib.CategoryListResponse> getListCategoryMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.FindCategoryRequest, com.azure.csu.tiger.grpc.lib.CategoryListResponse> getListCategoryMethod;
    if ((getListCategoryMethod = ProductGrpc.getListCategoryMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getListCategoryMethod = ProductGrpc.getListCategoryMethod) == null) {
          ProductGrpc.getListCategoryMethod = getListCategoryMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.FindCategoryRequest, com.azure.csu.tiger.grpc.lib.CategoryListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCategory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.FindCategoryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.CategoryListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("listCategory"))
              .build();
        }
      }
    }
    return getListCategoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListSkuRequest,
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> getListSkuInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listSkuInfo",
      requestType = com.azure.csu.tiger.grpc.lib.ListSkuRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListSkuRequest,
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> getListSkuInfoMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListSkuRequest, com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> getListSkuInfoMethod;
    if ((getListSkuInfoMethod = ProductGrpc.getListSkuInfoMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getListSkuInfoMethod = ProductGrpc.getListSkuInfoMethod) == null) {
          ProductGrpc.getListSkuInfoMethod = getListSkuInfoMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.ListSkuRequest, com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listSkuInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListSkuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("listSkuInfo"))
              .build();
        }
      }
    }
    return getListSkuInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListSkuRequest2,
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> getSearchSkuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchSku",
      requestType = com.azure.csu.tiger.grpc.lib.ListSkuRequest2.class,
      responseType = com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListSkuRequest2,
      com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> getSearchSkuMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListSkuRequest2, com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> getSearchSkuMethod;
    if ((getSearchSkuMethod = ProductGrpc.getSearchSkuMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getSearchSkuMethod = ProductGrpc.getSearchSkuMethod) == null) {
          ProductGrpc.getSearchSkuMethod = getSearchSkuMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.ListSkuRequest2, com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchSku"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListSkuRequest2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("searchSku"))
              .build();
        }
      }
    }
    return getSearchSkuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest,
      com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse> getGetSkuDetailInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSkuDetailInfo",
      requestType = com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest,
      com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse> getGetSkuDetailInfoMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest, com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse> getGetSkuDetailInfoMethod;
    if ((getGetSkuDetailInfoMethod = ProductGrpc.getGetSkuDetailInfoMethod) == null) {
      synchronized (ProductGrpc.class) {
        if ((getGetSkuDetailInfoMethod = ProductGrpc.getGetSkuDetailInfoMethod) == null) {
          ProductGrpc.getGetSkuDetailInfoMethod = getGetSkuDetailInfoMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest, com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSkuDetailInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductMethodDescriptorSupplier("getSkuDetailInfo"))
              .build();
        }
      }
    }
    return getGetSkuDetailInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductStub>() {
        @java.lang.Override
        public ProductStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductStub(channel, callOptions);
        }
      };
    return ProductStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductBlockingStub>() {
        @java.lang.Override
        public ProductBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductBlockingStub(channel, callOptions);
        }
      };
    return ProductBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductFutureStub>() {
        @java.lang.Override
        public ProductFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductFutureStub(channel, callOptions);
        }
      };
    return ProductFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static abstract class ProductImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * list Category
     * </pre>
     */
    public void listCategory(com.azure.csu.tiger.grpc.lib.FindCategoryRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.CategoryListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCategoryMethod(), responseObserver);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public void listSkuInfo(com.azure.csu.tiger.grpc.lib.ListSkuRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListSkuInfoMethod(), responseObserver);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public void searchSku(com.azure.csu.tiger.grpc.lib.ListSkuRequest2 request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchSkuMethod(), responseObserver);
    }

    /**
     * <pre>
     * get sku detail
     * </pre>
     */
    public void getSkuDetailInfo(com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSkuDetailInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListCategoryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.FindCategoryRequest,
                com.azure.csu.tiger.grpc.lib.CategoryListResponse>(
                  this, METHODID_LIST_CATEGORY)))
          .addMethod(
            getListSkuInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.ListSkuRequest,
                com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse>(
                  this, METHODID_LIST_SKU_INFO)))
          .addMethod(
            getSearchSkuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.ListSkuRequest2,
                com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse>(
                  this, METHODID_SEARCH_SKU)))
          .addMethod(
            getGetSkuDetailInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest,
                com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse>(
                  this, METHODID_GET_SKU_DETAIL_INFO)))
          .build();
    }
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static final class ProductStub extends io.grpc.stub.AbstractAsyncStub<ProductStub> {
    private ProductStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductStub(channel, callOptions);
    }

    /**
     * <pre>
     * list Category
     * </pre>
     */
    public void listCategory(com.azure.csu.tiger.grpc.lib.FindCategoryRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.CategoryListResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCategoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public void listSkuInfo(com.azure.csu.tiger.grpc.lib.ListSkuRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListSkuInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public void searchSku(com.azure.csu.tiger.grpc.lib.ListSkuRequest2 request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchSkuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * get sku detail
     * </pre>
     */
    public void getSkuDetailInfo(com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSkuDetailInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static final class ProductBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductBlockingStub> {
    private ProductBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * list Category
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.CategoryListResponse listCategory(com.azure.csu.tiger.grpc.lib.FindCategoryRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCategoryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse listSkuInfo(com.azure.csu.tiger.grpc.lib.ListSkuRequest request) {
      return blockingUnaryCall(
          getChannel(), getListSkuInfoMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse searchSku(com.azure.csu.tiger.grpc.lib.ListSkuRequest2 request) {
      return blockingUnaryCall(
          getChannel(), getSearchSkuMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * get sku detail
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse getSkuDetailInfo(com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSkuDetailInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static final class ProductFutureStub extends io.grpc.stub.AbstractFutureStub<ProductFutureStub> {
    private ProductFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * list Category
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.CategoryListResponse> listCategory(
        com.azure.csu.tiger.grpc.lib.FindCategoryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCategoryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> listSkuInfo(
        com.azure.csu.tiger.grpc.lib.ListSkuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListSkuInfoMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list sku info
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse> searchSku(
        com.azure.csu.tiger.grpc.lib.ListSkuRequest2 request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchSkuMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * get sku detail
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse> getSkuDetailInfo(
        com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSkuDetailInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_CATEGORY = 0;
  private static final int METHODID_LIST_SKU_INFO = 1;
  private static final int METHODID_SEARCH_SKU = 2;
  private static final int METHODID_GET_SKU_DETAIL_INFO = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_CATEGORY:
          serviceImpl.listCategory((com.azure.csu.tiger.grpc.lib.FindCategoryRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.CategoryListResponse>) responseObserver);
          break;
        case METHODID_LIST_SKU_INFO:
          serviceImpl.listSkuInfo((com.azure.csu.tiger.grpc.lib.ListSkuRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse>) responseObserver);
          break;
        case METHODID_SEARCH_SKU:
          serviceImpl.searchSku((com.azure.csu.tiger.grpc.lib.ListSkuRequest2) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListSkuInfoResponse>) responseObserver);
          break;
        case METHODID_GET_SKU_DETAIL_INFO:
          serviceImpl.getSkuDetailInfo((com.azure.csu.tiger.grpc.lib.GetSkuDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.GetSkuDetailResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.azure.csu.tiger.grpc.lib.ProductProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Product");
    }
  }

  private static final class ProductFileDescriptorSupplier
      extends ProductBaseDescriptorSupplier {
    ProductFileDescriptorSupplier() {}
  }

  private static final class ProductMethodDescriptorSupplier
      extends ProductBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProductGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductFileDescriptorSupplier())
              .addMethod(getListCategoryMethod())
              .addMethod(getListSkuInfoMethod())
              .addMethod(getSearchSkuMethod())
              .addMethod(getGetSkuDetailInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
