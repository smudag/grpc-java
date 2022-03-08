package io.grpc.examples.p4p.p4p.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: users.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UserSGrpc {

  private UserSGrpc() {}

  public static final String SERVICE_NAME = "p4p.p4p.user.p4p.UserS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.UserSRequest,
      io.grpc.examples.p4p.p4p.user.UserSReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = io.grpc.examples.p4p.p4p.user.UserSRequest.class,
      responseType = io.grpc.examples.p4p.p4p.user.UserSReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.UserSRequest,
      io.grpc.examples.p4p.p4p.user.UserSReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.UserSRequest, io.grpc.examples.p4p.p4p.user.UserSReply> getSayHelloMethod;
    if ((getSayHelloMethod = UserSGrpc.getSayHelloMethod) == null) {
      synchronized (UserSGrpc.class) {
        if ((getSayHelloMethod = UserSGrpc.getSayHelloMethod) == null) {
          UserSGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.user.UserSRequest, io.grpc.examples.p4p.p4p.user.UserSReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.user.UserSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.user.UserSReply.getDefaultInstance()))
              .setSchemaDescriptor(new UserSMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.BytesDataSRequest,
      io.grpc.examples.p4p.p4p.user.UserSReply> getSayDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayData",
      requestType = io.grpc.examples.p4p.p4p.user.BytesDataSRequest.class,
      responseType = io.grpc.examples.p4p.p4p.user.UserSReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.BytesDataSRequest,
      io.grpc.examples.p4p.p4p.user.UserSReply> getSayDataMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.BytesDataSRequest, io.grpc.examples.p4p.p4p.user.UserSReply> getSayDataMethod;
    if ((getSayDataMethod = UserSGrpc.getSayDataMethod) == null) {
      synchronized (UserSGrpc.class) {
        if ((getSayDataMethod = UserSGrpc.getSayDataMethod) == null) {
          UserSGrpc.getSayDataMethod = getSayDataMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.user.BytesDataSRequest, io.grpc.examples.p4p.p4p.user.UserSReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.user.BytesDataSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.user.UserSReply.getDefaultInstance()))
              .setSchemaDescriptor(new UserSMethodDescriptorSupplier("SayData"))
              .build();
        }
      }
    }
    return getSayDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.UserSRequest,
      io.grpc.examples.p4p.p4p.user.UserSReply> getSayHelloAgainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloAgain",
      requestType = io.grpc.examples.p4p.p4p.user.UserSRequest.class,
      responseType = io.grpc.examples.p4p.p4p.user.UserSReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.UserSRequest,
      io.grpc.examples.p4p.p4p.user.UserSReply> getSayHelloAgainMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.user.UserSRequest, io.grpc.examples.p4p.p4p.user.UserSReply> getSayHelloAgainMethod;
    if ((getSayHelloAgainMethod = UserSGrpc.getSayHelloAgainMethod) == null) {
      synchronized (UserSGrpc.class) {
        if ((getSayHelloAgainMethod = UserSGrpc.getSayHelloAgainMethod) == null) {
          UserSGrpc.getSayHelloAgainMethod = getSayHelloAgainMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.user.UserSRequest, io.grpc.examples.p4p.p4p.user.UserSReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.user.UserSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.user.UserSReply.getDefaultInstance()))
              .setSchemaDescriptor(new UserSMethodDescriptorSupplier("SayHelloAgain"))
              .build();
        }
      }
    }
    return getSayHelloAgainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserSStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSStub>() {
        @java.lang.Override
        public UserSStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSStub(channel, callOptions);
        }
      };
    return UserSStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSBlockingStub>() {
        @java.lang.Override
        public UserSBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSBlockingStub(channel, callOptions);
        }
      };
    return UserSBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserSFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserSFutureStub>() {
        @java.lang.Override
        public UserSFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserSFutureStub(channel, callOptions);
        }
      };
    return UserSFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class UserSImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.p4p.p4p.user.UserSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     */
    public void sayData(io.grpc.examples.p4p.p4p.user.BytesDataSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayDataMethod(), responseObserver);
    }

    /**
     */
    public void sayHelloAgain(io.grpc.examples.p4p.p4p.user.UserSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloAgainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.user.UserSRequest,
                io.grpc.examples.p4p.p4p.user.UserSReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.user.BytesDataSRequest,
                io.grpc.examples.p4p.p4p.user.UserSReply>(
                  this, METHODID_SAY_DATA)))
          .addMethod(
            getSayHelloAgainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.user.UserSRequest,
                io.grpc.examples.p4p.p4p.user.UserSReply>(
                  this, METHODID_SAY_HELLO_AGAIN)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserSStub extends io.grpc.stub.AbstractAsyncStub<UserSStub> {
    private UserSStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.p4p.p4p.user.UserSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayData(io.grpc.examples.p4p.p4p.user.BytesDataSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sayHelloAgain(io.grpc.examples.p4p.p4p.user.UserSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserSBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserSBlockingStub> {
    private UserSBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.examples.p4p.p4p.user.UserSReply sayHello(io.grpc.examples.p4p.p4p.user.UserSRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.p4p.p4p.user.UserSReply sayData(io.grpc.examples.p4p.p4p.user.BytesDataSRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public io.grpc.examples.p4p.p4p.user.UserSReply sayHelloAgain(io.grpc.examples.p4p.p4p.user.UserSRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloAgainMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class UserSFutureStub extends io.grpc.stub.AbstractFutureStub<UserSFutureStub> {
    private UserSFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserSFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserSFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.user.UserSReply> sayHello(
        io.grpc.examples.p4p.p4p.user.UserSRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.user.UserSReply> sayData(
        io.grpc.examples.p4p.p4p.user.BytesDataSRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.user.UserSReply> sayHelloAgain(
        io.grpc.examples.p4p.p4p.user.UserSRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_DATA = 1;
  private static final int METHODID_SAY_HELLO_AGAIN = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.examples.p4p.p4p.user.UserSRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply>) responseObserver);
          break;
        case METHODID_SAY_DATA:
          serviceImpl.sayData((io.grpc.examples.p4p.p4p.user.BytesDataSRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((io.grpc.examples.p4p.p4p.user.UserSRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.user.UserSReply>) responseObserver);
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

  private static abstract class UserSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.p4p.p4p.user.UserSProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserS");
    }
  }

  private static final class UserSFileDescriptorSupplier
      extends UserSBaseDescriptorSupplier {
    UserSFileDescriptorSupplier() {}
  }

  private static final class UserSMethodDescriptorSupplier
      extends UserSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserSMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserSFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayDataMethod())
              .addMethod(getSayHelloAgainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
