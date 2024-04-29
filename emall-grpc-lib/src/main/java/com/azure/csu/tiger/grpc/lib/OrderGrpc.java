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
 * The Order service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.27.1)",
    comments = "Source: order.proto")
public final class OrderGrpc {

  private OrderGrpc() {}

  public static final String SERVICE_NAME = "Order";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.CreateOrderRequest,
      com.azure.csu.tiger.grpc.lib.CreateOrderResponse> getCreateOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createOrder",
      requestType = com.azure.csu.tiger.grpc.lib.CreateOrderRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.CreateOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.CreateOrderRequest,
      com.azure.csu.tiger.grpc.lib.CreateOrderResponse> getCreateOrderMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.CreateOrderRequest, com.azure.csu.tiger.grpc.lib.CreateOrderResponse> getCreateOrderMethod;
    if ((getCreateOrderMethod = OrderGrpc.getCreateOrderMethod) == null) {
      synchronized (OrderGrpc.class) {
        if ((getCreateOrderMethod = OrderGrpc.getCreateOrderMethod) == null) {
          OrderGrpc.getCreateOrderMethod = getCreateOrderMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.CreateOrderRequest, com.azure.csu.tiger.grpc.lib.CreateOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.CreateOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.CreateOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderMethodDescriptorSupplier("createOrder"))
              .build();
        }
      }
    }
    return getCreateOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListOrderRequest,
      com.azure.csu.tiger.grpc.lib.ListOrderResponse> getListOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listOrder",
      requestType = com.azure.csu.tiger.grpc.lib.ListOrderRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.ListOrderResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListOrderRequest,
      com.azure.csu.tiger.grpc.lib.ListOrderResponse> getListOrderMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListOrderRequest, com.azure.csu.tiger.grpc.lib.ListOrderResponse> getListOrderMethod;
    if ((getListOrderMethod = OrderGrpc.getListOrderMethod) == null) {
      synchronized (OrderGrpc.class) {
        if ((getListOrderMethod = OrderGrpc.getListOrderMethod) == null) {
          OrderGrpc.getListOrderMethod = getListOrderMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.ListOrderRequest, com.azure.csu.tiger.grpc.lib.ListOrderResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listOrder"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListOrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListOrderResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OrderMethodDescriptorSupplier("listOrder"))
              .build();
        }
      }
    }
    return getListOrderMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OrderStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderStub>() {
        @java.lang.Override
        public OrderStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderStub(channel, callOptions);
        }
      };
    return OrderStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OrderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderBlockingStub>() {
        @java.lang.Override
        public OrderBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderBlockingStub(channel, callOptions);
        }
      };
    return OrderBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OrderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OrderFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OrderFutureStub>() {
        @java.lang.Override
        public OrderFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OrderFutureStub(channel, callOptions);
        }
      };
    return OrderFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Order service definition.
   * </pre>
   */
  public static abstract class OrderImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * create order
     * </pre>
     */
    public void createOrder(com.azure.csu.tiger.grpc.lib.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.CreateOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateOrderMethod(), responseObserver);
    }

    /**
     * <pre>
     * list order
     * </pre>
     */
    public void listOrder(com.azure.csu.tiger.grpc.lib.ListOrderRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListOrderResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListOrderMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.CreateOrderRequest,
                com.azure.csu.tiger.grpc.lib.CreateOrderResponse>(
                  this, METHODID_CREATE_ORDER)))
          .addMethod(
            getListOrderMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.ListOrderRequest,
                com.azure.csu.tiger.grpc.lib.ListOrderResponse>(
                  this, METHODID_LIST_ORDER)))
          .build();
    }
  }

  /**
   * <pre>
   * The Order service definition.
   * </pre>
   */
  public static final class OrderStub extends io.grpc.stub.AbstractAsyncStub<OrderStub> {
    private OrderStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderStub(channel, callOptions);
    }

    /**
     * <pre>
     * create order
     * </pre>
     */
    public void createOrder(com.azure.csu.tiger.grpc.lib.CreateOrderRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.CreateOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list order
     * </pre>
     */
    public void listOrder(com.azure.csu.tiger.grpc.lib.ListOrderRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListOrderResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListOrderMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Order service definition.
   * </pre>
   */
  public static final class OrderBlockingStub extends io.grpc.stub.AbstractBlockingStub<OrderBlockingStub> {
    private OrderBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * create order
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.CreateOrderResponse createOrder(com.azure.csu.tiger.grpc.lib.CreateOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateOrderMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list order
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.ListOrderResponse listOrder(com.azure.csu.tiger.grpc.lib.ListOrderRequest request) {
      return blockingUnaryCall(
          getChannel(), getListOrderMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Order service definition.
   * </pre>
   */
  public static final class OrderFutureStub extends io.grpc.stub.AbstractFutureStub<OrderFutureStub> {
    private OrderFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OrderFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OrderFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * create order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.CreateOrderResponse> createOrder(
        com.azure.csu.tiger.grpc.lib.CreateOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateOrderMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list order
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.ListOrderResponse> listOrder(
        com.azure.csu.tiger.grpc.lib.ListOrderRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListOrderMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ORDER = 0;
  private static final int METHODID_LIST_ORDER = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OrderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OrderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ORDER:
          serviceImpl.createOrder((com.azure.csu.tiger.grpc.lib.CreateOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.CreateOrderResponse>) responseObserver);
          break;
        case METHODID_LIST_ORDER:
          serviceImpl.listOrder((com.azure.csu.tiger.grpc.lib.ListOrderRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListOrderResponse>) responseObserver);
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

  private static abstract class OrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OrderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.azure.csu.tiger.grpc.lib.OrderProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Order");
    }
  }

  private static final class OrderFileDescriptorSupplier
      extends OrderBaseDescriptorSupplier {
    OrderFileDescriptorSupplier() {}
  }

  private static final class OrderMethodDescriptorSupplier
      extends OrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OrderMethodDescriptorSupplier(String methodName) {
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
      synchronized (OrderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OrderFileDescriptorSupplier())
              .addMethod(getCreateOrderMethod())
              .addMethod(getListOrderMethod())
              .build();
        }
      }
    }
    return result;
  }
}
