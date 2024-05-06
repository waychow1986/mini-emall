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
    comments = "Source: user.proto")
public final class UserGrpc {

  private UserGrpc() {}

  public static final String SERVICE_NAME = "User";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.AddCartRequest,
      com.azure.csu.tiger.grpc.lib.AddCartResponse> getAddCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCart",
      requestType = com.azure.csu.tiger.grpc.lib.AddCartRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.AddCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.AddCartRequest,
      com.azure.csu.tiger.grpc.lib.AddCartResponse> getAddCartMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.AddCartRequest, com.azure.csu.tiger.grpc.lib.AddCartResponse> getAddCartMethod;
    if ((getAddCartMethod = UserGrpc.getAddCartMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getAddCartMethod = UserGrpc.getAddCartMethod) == null) {
          UserGrpc.getAddCartMethod = getAddCartMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.AddCartRequest, com.azure.csu.tiger.grpc.lib.AddCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.AddCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.AddCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("addCart"))
              .build();
        }
      }
    }
    return getAddCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListCartRequest,
      com.azure.csu.tiger.grpc.lib.ListCartResponse> getListCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCart",
      requestType = com.azure.csu.tiger.grpc.lib.ListCartRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.ListCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListCartRequest,
      com.azure.csu.tiger.grpc.lib.ListCartResponse> getListCartMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ListCartRequest, com.azure.csu.tiger.grpc.lib.ListCartResponse> getListCartMethod;
    if ((getListCartMethod = UserGrpc.getListCartMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getListCartMethod = UserGrpc.getListCartMethod) == null) {
          UserGrpc.getListCartMethod = getListCartMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.ListCartRequest, com.azure.csu.tiger.grpc.lib.ListCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ListCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("listCart"))
              .build();
        }
      }
    }
    return getListCartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ClearCartRequest,
      com.azure.csu.tiger.grpc.lib.ClearCartResponse> getClearCartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clearCart",
      requestType = com.azure.csu.tiger.grpc.lib.ClearCartRequest.class,
      responseType = com.azure.csu.tiger.grpc.lib.ClearCartResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ClearCartRequest,
      com.azure.csu.tiger.grpc.lib.ClearCartResponse> getClearCartMethod() {
    io.grpc.MethodDescriptor<com.azure.csu.tiger.grpc.lib.ClearCartRequest, com.azure.csu.tiger.grpc.lib.ClearCartResponse> getClearCartMethod;
    if ((getClearCartMethod = UserGrpc.getClearCartMethod) == null) {
      synchronized (UserGrpc.class) {
        if ((getClearCartMethod = UserGrpc.getClearCartMethod) == null) {
          UserGrpc.getClearCartMethod = getClearCartMethod =
              io.grpc.MethodDescriptor.<com.azure.csu.tiger.grpc.lib.ClearCartRequest, com.azure.csu.tiger.grpc.lib.ClearCartResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clearCart"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ClearCartRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.azure.csu.tiger.grpc.lib.ClearCartResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserMethodDescriptorSupplier("clearCart"))
              .build();
        }
      }
    }
    return getClearCartMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserStub>() {
        @java.lang.Override
        public UserStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserStub(channel, callOptions);
        }
      };
    return UserStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserBlockingStub>() {
        @java.lang.Override
        public UserBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserBlockingStub(channel, callOptions);
        }
      };
    return UserBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserFutureStub>() {
        @java.lang.Override
        public UserFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserFutureStub(channel, callOptions);
        }
      };
    return UserFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static abstract class UserImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * add cart
     * </pre>
     */
    public void addCart(com.azure.csu.tiger.grpc.lib.AddCartRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.AddCartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAddCartMethod(), responseObserver);
    }

    /**
     * <pre>
     * list cart
     * </pre>
     */
    public void listCart(com.azure.csu.tiger.grpc.lib.ListCartRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListCartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCartMethod(), responseObserver);
    }

    /**
     * <pre>
     * clear cart
     * </pre>
     */
    public void clearCart(com.azure.csu.tiger.grpc.lib.ClearCartRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ClearCartResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getClearCartMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAddCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.AddCartRequest,
                com.azure.csu.tiger.grpc.lib.AddCartResponse>(
                  this, METHODID_ADD_CART)))
          .addMethod(
            getListCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.ListCartRequest,
                com.azure.csu.tiger.grpc.lib.ListCartResponse>(
                  this, METHODID_LIST_CART)))
          .addMethod(
            getClearCartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.azure.csu.tiger.grpc.lib.ClearCartRequest,
                com.azure.csu.tiger.grpc.lib.ClearCartResponse>(
                  this, METHODID_CLEAR_CART)))
          .build();
    }
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static final class UserStub extends io.grpc.stub.AbstractAsyncStub<UserStub> {
    private UserStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserStub(channel, callOptions);
    }

    /**
     * <pre>
     * add cart
     * </pre>
     */
    public void addCart(com.azure.csu.tiger.grpc.lib.AddCartRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.AddCartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAddCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * list cart
     * </pre>
     */
    public void listCart(com.azure.csu.tiger.grpc.lib.ListCartRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListCartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * clear cart
     * </pre>
     */
    public void clearCart(com.azure.csu.tiger.grpc.lib.ClearCartRequest request,
        io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ClearCartResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getClearCartMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static final class UserBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserBlockingStub> {
    private UserBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * add cart
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.AddCartResponse addCart(com.azure.csu.tiger.grpc.lib.AddCartRequest request) {
      return blockingUnaryCall(
          getChannel(), getAddCartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * list cart
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.ListCartResponse listCart(com.azure.csu.tiger.grpc.lib.ListCartRequest request) {
      return blockingUnaryCall(
          getChannel(), getListCartMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * clear cart
     * </pre>
     */
    public com.azure.csu.tiger.grpc.lib.ClearCartResponse clearCart(com.azure.csu.tiger.grpc.lib.ClearCartRequest request) {
      return blockingUnaryCall(
          getChannel(), getClearCartMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The Product service definition.
   * </pre>
   */
  public static final class UserFutureStub extends io.grpc.stub.AbstractFutureStub<UserFutureStub> {
    private UserFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * add cart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.AddCartResponse> addCart(
        com.azure.csu.tiger.grpc.lib.AddCartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAddCartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * list cart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.ListCartResponse> listCart(
        com.azure.csu.tiger.grpc.lib.ListCartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListCartMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * clear cart
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.azure.csu.tiger.grpc.lib.ClearCartResponse> clearCart(
        com.azure.csu.tiger.grpc.lib.ClearCartRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getClearCartMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ADD_CART = 0;
  private static final int METHODID_LIST_CART = 1;
  private static final int METHODID_CLEAR_CART = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ADD_CART:
          serviceImpl.addCart((com.azure.csu.tiger.grpc.lib.AddCartRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.AddCartResponse>) responseObserver);
          break;
        case METHODID_LIST_CART:
          serviceImpl.listCart((com.azure.csu.tiger.grpc.lib.ListCartRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ListCartResponse>) responseObserver);
          break;
        case METHODID_CLEAR_CART:
          serviceImpl.clearCart((com.azure.csu.tiger.grpc.lib.ClearCartRequest) request,
              (io.grpc.stub.StreamObserver<com.azure.csu.tiger.grpc.lib.ClearCartResponse>) responseObserver);
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

  private static abstract class UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.azure.csu.tiger.grpc.lib.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("User");
    }
  }

  private static final class UserFileDescriptorSupplier
      extends UserBaseDescriptorSupplier {
    UserFileDescriptorSupplier() {}
  }

  private static final class UserMethodDescriptorSupplier
      extends UserBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserFileDescriptorSupplier())
              .addMethod(getAddCartMethod())
              .addMethod(getListCartMethod())
              .addMethod(getClearCartMethod())
              .build();
        }
      }
    }
    return result;
  }
}
