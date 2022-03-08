package io.grpc.examples.p4p.p4p.peer;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The greeting service definition.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: p4ppeer.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class P4PPeerGrpc {

  private P4PPeerGrpc() {}

  public static final String SERVICE_NAME = "p4p.p4p.peer.P4PPeer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest,
      io.grpc.examples.p4p.p4p.peer.P4PPeerReply> getSayHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHello",
      requestType = io.grpc.examples.p4p.p4p.peer.P4PPeerRequest.class,
      responseType = io.grpc.examples.p4p.p4p.peer.P4PPeerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest,
      io.grpc.examples.p4p.p4p.peer.P4PPeerReply> getSayHelloMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest, io.grpc.examples.p4p.p4p.peer.P4PPeerReply> getSayHelloMethod;
    if ((getSayHelloMethod = P4PPeerGrpc.getSayHelloMethod) == null) {
      synchronized (P4PPeerGrpc.class) {
        if ((getSayHelloMethod = P4PPeerGrpc.getSayHelloMethod) == null) {
          P4PPeerGrpc.getSayHelloMethod = getSayHelloMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest, io.grpc.examples.p4p.p4p.peer.P4PPeerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.peer.P4PPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.peer.P4PPeerReply.getDefaultInstance()))
              .setSchemaDescriptor(new P4PPeerMethodDescriptorSupplier("SayHello"))
              .build();
        }
      }
    }
    return getSayHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest,
      io.grpc.examples.p4p.p4p.peer.P4PPeerReply> getSayHelloAgainMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SayHelloAgain",
      requestType = io.grpc.examples.p4p.p4p.peer.P4PPeerRequest.class,
      responseType = io.grpc.examples.p4p.p4p.peer.P4PPeerReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest,
      io.grpc.examples.p4p.p4p.peer.P4PPeerReply> getSayHelloAgainMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest, io.grpc.examples.p4p.p4p.peer.P4PPeerReply> getSayHelloAgainMethod;
    if ((getSayHelloAgainMethod = P4PPeerGrpc.getSayHelloAgainMethod) == null) {
      synchronized (P4PPeerGrpc.class) {
        if ((getSayHelloAgainMethod = P4PPeerGrpc.getSayHelloAgainMethod) == null) {
          P4PPeerGrpc.getSayHelloAgainMethod = getSayHelloAgainMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.peer.P4PPeerRequest, io.grpc.examples.p4p.p4p.peer.P4PPeerReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SayHelloAgain"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.peer.P4PPeerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.peer.P4PPeerReply.getDefaultInstance()))
              .setSchemaDescriptor(new P4PPeerMethodDescriptorSupplier("SayHelloAgain"))
              .build();
        }
      }
    }
    return getSayHelloAgainMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static P4PPeerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PPeerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PPeerStub>() {
        @java.lang.Override
        public P4PPeerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PPeerStub(channel, callOptions);
        }
      };
    return P4PPeerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static P4PPeerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PPeerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PPeerBlockingStub>() {
        @java.lang.Override
        public P4PPeerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PPeerBlockingStub(channel, callOptions);
        }
      };
    return P4PPeerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static P4PPeerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PPeerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PPeerFutureStub>() {
        @java.lang.Override
        public P4PPeerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PPeerFutureStub(channel, callOptions);
        }
      };
    return P4PPeerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static abstract class P4PPeerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.peer.P4PPeerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.peer.P4PPeerReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloAgainMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSayHelloMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.peer.P4PPeerRequest,
                io.grpc.examples.p4p.p4p.peer.P4PPeerReply>(
                  this, METHODID_SAY_HELLO)))
          .addMethod(
            getSayHelloAgainMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.peer.P4PPeerRequest,
                io.grpc.examples.p4p.p4p.peer.P4PPeerReply>(
                  this, METHODID_SAY_HELLO_AGAIN)))
          .build();
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class P4PPeerStub extends io.grpc.stub.AbstractAsyncStub<P4PPeerStub> {
    private P4PPeerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PPeerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PPeerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public void sayHello(io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.peer.P4PPeerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public void sayHelloAgain(io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.peer.P4PPeerReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSayHelloAgainMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class P4PPeerBlockingStub extends io.grpc.stub.AbstractBlockingStub<P4PPeerBlockingStub> {
    private P4PPeerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PPeerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PPeerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public io.grpc.examples.p4p.p4p.peer.P4PPeerReply sayHello(io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public io.grpc.examples.p4p.p4p.peer.P4PPeerReply sayHelloAgain(io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSayHelloAgainMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * The greeting service definition.
   * </pre>
   */
  public static final class P4PPeerFutureStub extends io.grpc.stub.AbstractFutureStub<P4PPeerFutureStub> {
    private P4PPeerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PPeerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PPeerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.peer.P4PPeerReply> sayHello(
        io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSayHelloMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sends another greeting
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.peer.P4PPeerReply> sayHelloAgain(
        io.grpc.examples.p4p.p4p.peer.P4PPeerRequest request) {
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
    private final P4PPeerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(P4PPeerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO:
          serviceImpl.sayHello((io.grpc.examples.p4p.p4p.peer.P4PPeerRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.peer.P4PPeerReply>) responseObserver);
          break;
        case METHODID_SAY_HELLO_AGAIN:
          serviceImpl.sayHelloAgain((io.grpc.examples.p4p.p4p.peer.P4PPeerRequest) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.peer.P4PPeerReply>) responseObserver);
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

  private static abstract class P4PPeerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    P4PPeerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.p4p.p4p.peer.P4PPeerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("P4PPeer");
    }
  }

  private static final class P4PPeerFileDescriptorSupplier
      extends P4PPeerBaseDescriptorSupplier {
    P4PPeerFileDescriptorSupplier() {}
  }

  private static final class P4PPeerMethodDescriptorSupplier
      extends P4PPeerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    P4PPeerMethodDescriptorSupplier(String methodName) {
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
      synchronized (P4PPeerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new P4PPeerFileDescriptorSupplier())
              .addMethod(getSayHelloMethod())
              .addMethod(getSayHelloAgainMethod())
              .build();
        }
      }
    }
    return result;
  }
}
