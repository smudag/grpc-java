package io.grpc.examples.p4p.p4p.server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: p4pserverss.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class P4PServerSSGrpc {

  private P4PServerSSGrpc() {}

  public static final String SERVICE_NAME = "p4p.p4p.server.P4PServerSS";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest,
      io.grpc.examples.p4p.p4p.server.P4PServerSSReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = io.grpc.examples.p4p.p4p.server.P4PServerSSRequest.class,
      responseType = io.grpc.examples.p4p.p4p.server.P4PServerSSReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest,
      io.grpc.examples.p4p.p4p.server.P4PServerSSReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest, io.grpc.examples.p4p.p4p.server.P4PServerSSReply> getSayHelloMethod;
    if ((getSayHelloMethod = P4PServerSSGrpc.getSayHelloMethod) == null) {
      synchronized (P4PServerSSGrpc.class) {
        if ((getSayHelloMethod = P4PServerSSGrpc.getSayHelloMethod) == null) {
          P4PServerSSGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest, io.grpc.examples.p4p.p4p.server.P4PServerSSReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.server.P4PServerSSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.server.P4PServerSSReply.getDefaultInstance()))
              .setSchemaDescriptor(new P4PServerSSMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest,
      io.grpc.examples.p4p.p4p.server.P4PServerSSReply> getSayHelloAgainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloAgain",
      requestType = io.grpc.examples.p4p.p4p.server.P4PServerSSRequest.class,
      responseType = io.grpc.examples.p4p.p4p.server.P4PServerSSReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest,
      io.grpc.examples.p4p.p4p.server.P4PServerSSReply> getSayHelloAgainMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest, io.grpc.examples.p4p.p4p.server.P4PServerSSReply> getSayHelloAgainMethod;
    if ((getSayHelloAgainMethod = P4PServerSSGrpc.getSayHelloAgainMethod) == null) {
      synchronized (P4PServerSSGrpc.class) {
        if ((getSayHelloAgainMethod = P4PServerSSGrpc.getSayHelloAgainMethod) == null) {
          P4PServerSSGrpc.getSayHelloAgainMethod = getSayHelloAgainMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.server.P4PServerSSRequest, io.grpc.examples.p4p.p4p.server.P4PServerSSReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.server.P4PServerSSRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.server.P4PServerSSReply.getDefaultInstance()))
              .setSchemaDescriptor(new P4PServerSSMethodDescriptorSupplier("SayHelloAgain"))
              .build();
        }
      }
    }
    return getSayHelloAgainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static P4PServerSSStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PServerSSStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PServerSSStub>() {
        @java.lang.Override
        public P4PServerSSStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PServerSSStub(channel, callOptions);
        }
      };
    return P4PServerSSStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static P4PServerSSBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PServerSSBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PServerSSBlockingStub>() {
        @java.lang.Override
        public P4PServerSSBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PServerSSBlockingStub(channel, callOptions);
        }
      };
    return P4PServerSSBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static P4PServerSSFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PServerSSFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PServerSSFutureStub>() {
        @java.lang.Override
        public P4PServerSSFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PServerSSFutureStub(channel, callOptions);
        }
      };
    return P4PServerSSFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class P4PServerSSImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.server.P4PServerSSReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.server.P4PServerSSReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloAgainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.server.P4PServerSSRequest,
                io.grpc.examples.p4p.p4p.server.P4PServerSSReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloAgainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.server.P4PServerSSRequest,
                io.grpc.examples.p4p.p4p.server.P4PServerSSReply>(
                  this, METHODID_SAY_HELLO_AGAIN)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class P4PServerSSStub extends io.grpc.stub.AbstractAsyncStub<P4PServerSSStub> {
    private P4PServerSSStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PServerSSStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PServerSSStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.server.P4PServerSSReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.server.P4PServerSSReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class P4PServerSSBlockingStub extends io.grpc.stub.AbstractBlockingStub<P4PServerSSBlockingStub> {
    private P4PServerSSBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PServerSSBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PServerSSBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.examples.p4p.p4p.server.P4PServerSSReply sayHello(io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public io.grpc.examples.p4p.p4p.server.P4PServerSSReply sayHelloAgain(io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloAgainMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class P4PServerSSFutureStub extends io.grpc.stub.AbstractFutureStub<P4PServerSSFutureStub> {
    private P4PServerSSFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PServerSSFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PServerSSFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.server.P4PServerSSReply> sayHello(
        io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.server.P4PServerSSReply> sayHelloAgain(
        io.grpc.examples.p4p.p4p.server.P4PServerSSRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO = 0;
  private static final int METHODID_SAY_HELLO_AGAIN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final P4PServerSSImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(P4PServerSSImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.examples.p4p.p4p.server.P4PServerSSRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.server.P4PServerSSReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((io.grpc.examples.p4p.p4p.server.P4PServerSSRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.server.P4PServerSSReply>) responseObserver);
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

  private static abstract class P4PServerSSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    P4PServerSSBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.p4p.p4p.server.P4PServerSSProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("P4PServerSS");
    }
  }

  private static final class P4PServerSSFileDescriptorSupplier
      extends P4PServerSSBaseDescriptorSupplier {
    P4PServerSSFileDescriptorSupplier() {}
  }

  private static final class P4PServerSSMethodDescriptorSupplier
      extends P4PServerSSBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    P4PServerSSMethodDescriptorSupplier(String methodName) {
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
      synchronized (P4PServerSSGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new P4PServerSSFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloAgainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
