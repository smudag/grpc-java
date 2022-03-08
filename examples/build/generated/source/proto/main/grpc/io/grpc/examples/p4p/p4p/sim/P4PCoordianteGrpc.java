package io.grpc.examples.p4p.p4p.sim;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Interface exported by the server.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.42.1)",
    comments = "Source: p4p.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class P4PCoordianteGrpc {

  private P4PCoordianteGrpc() {}

  public static final String SERVICE_NAME = "p4p.p4p.sim.P4PCoordiante";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Point,
      io.grpc.examples.p4p.p4p.sim.Feature> getGetFeatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFeature",
      requestType = io.grpc.examples.p4p.p4p.sim.Point.class,
      responseType = io.grpc.examples.p4p.p4p.sim.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Point,
      io.grpc.examples.p4p.p4p.sim.Feature> getGetFeatureMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Point, io.grpc.examples.p4p.p4p.sim.Feature> getGetFeatureMethod;
    if ((getGetFeatureMethod = P4PCoordianteGrpc.getGetFeatureMethod) == null) {
      synchronized (P4PCoordianteGrpc.class) {
        if ((getGetFeatureMethod = P4PCoordianteGrpc.getGetFeatureMethod) == null) {
          P4PCoordianteGrpc.getGetFeatureMethod = getGetFeatureMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.sim.Point, io.grpc.examples.p4p.p4p.sim.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFeature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.Feature.getDefaultInstance()))
              .setSchemaDescriptor(new P4PCoordianteMethodDescriptorSupplier("GetFeature"))
              .build();
        }
      }
    }
    return getGetFeatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Rectangle,
      io.grpc.examples.p4p.p4p.sim.Feature> getListFeaturesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFeatures",
      requestType = io.grpc.examples.p4p.p4p.sim.Rectangle.class,
      responseType = io.grpc.examples.p4p.p4p.sim.Feature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Rectangle,
      io.grpc.examples.p4p.p4p.sim.Feature> getListFeaturesMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Rectangle, io.grpc.examples.p4p.p4p.sim.Feature> getListFeaturesMethod;
    if ((getListFeaturesMethod = P4PCoordianteGrpc.getListFeaturesMethod) == null) {
      synchronized (P4PCoordianteGrpc.class) {
        if ((getListFeaturesMethod = P4PCoordianteGrpc.getListFeaturesMethod) == null) {
          P4PCoordianteGrpc.getListFeaturesMethod = getListFeaturesMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.sim.Rectangle, io.grpc.examples.p4p.p4p.sim.Feature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFeatures"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.Rectangle.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.Feature.getDefaultInstance()))
              .setSchemaDescriptor(new P4PCoordianteMethodDescriptorSupplier("ListFeatures"))
              .build();
        }
      }
    }
    return getListFeaturesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Point,
      io.grpc.examples.p4p.p4p.sim.RouteSummary> getRecordRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordRoute",
      requestType = io.grpc.examples.p4p.p4p.sim.Point.class,
      responseType = io.grpc.examples.p4p.p4p.sim.RouteSummary.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Point,
      io.grpc.examples.p4p.p4p.sim.RouteSummary> getRecordRouteMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.Point, io.grpc.examples.p4p.p4p.sim.RouteSummary> getRecordRouteMethod;
    if ((getRecordRouteMethod = P4PCoordianteGrpc.getRecordRouteMethod) == null) {
      synchronized (P4PCoordianteGrpc.class) {
        if ((getRecordRouteMethod = P4PCoordianteGrpc.getRecordRouteMethod) == null) {
          P4PCoordianteGrpc.getRecordRouteMethod = getRecordRouteMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.sim.Point, io.grpc.examples.p4p.p4p.sim.RouteSummary>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.Point.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.RouteSummary.getDefaultInstance()))
              .setSchemaDescriptor(new P4PCoordianteMethodDescriptorSupplier("RecordRoute"))
              .build();
        }
      }
    }
    return getRecordRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.RouteNote,
      io.grpc.examples.p4p.p4p.sim.RouteNote> getRouteChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RouteChat",
      requestType = io.grpc.examples.p4p.p4p.sim.RouteNote.class,
      responseType = io.grpc.examples.p4p.p4p.sim.RouteNote.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.RouteNote,
      io.grpc.examples.p4p.p4p.sim.RouteNote> getRouteChatMethod() {
    io.grpc.MethodDescriptor<io.grpc.examples.p4p.p4p.sim.RouteNote, io.grpc.examples.p4p.p4p.sim.RouteNote> getRouteChatMethod;
    if ((getRouteChatMethod = P4PCoordianteGrpc.getRouteChatMethod) == null) {
      synchronized (P4PCoordianteGrpc.class) {
        if ((getRouteChatMethod = P4PCoordianteGrpc.getRouteChatMethod) == null) {
          P4PCoordianteGrpc.getRouteChatMethod = getRouteChatMethod =
              io.grpc.MethodDescriptor.<io.grpc.examples.p4p.p4p.sim.RouteNote, io.grpc.examples.p4p.p4p.sim.RouteNote>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RouteChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.RouteNote.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  io.grpc.examples.p4p.p4p.sim.RouteNote.getDefaultInstance()))
              .setSchemaDescriptor(new P4PCoordianteMethodDescriptorSupplier("RouteChat"))
              .build();
        }
      }
    }
    return getRouteChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static P4PCoordianteStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PCoordianteStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PCoordianteStub>() {
        @java.lang.Override
        public P4PCoordianteStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PCoordianteStub(channel, callOptions);
        }
      };
    return P4PCoordianteStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static P4PCoordianteBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PCoordianteBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PCoordianteBlockingStub>() {
        @java.lang.Override
        public P4PCoordianteBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PCoordianteBlockingStub(channel, callOptions);
        }
      };
    return P4PCoordianteBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static P4PCoordianteFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<P4PCoordianteFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<P4PCoordianteFutureStub>() {
        @java.lang.Override
        public P4PCoordianteFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new P4PCoordianteFutureStub(channel, callOptions);
        }
      };
    return P4PCoordianteFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static abstract class P4PCoordianteImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getFeature(io.grpc.examples.p4p.p4p.sim.Point request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Feature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFeatureMethod(), responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public void listFeatures(io.grpc.examples.p4p.p4p.sim.Rectangle request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Feature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFeaturesMethod(), responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * Accepts a stream of Points on a route being traversed, returning a
     * RouteSummary when traversal is completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Point> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteSummary> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRecordRouteMethod(), responseObserver);
    }

    /**
     * <pre>
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteNote> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getRouteChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetFeatureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.sim.Point,
                io.grpc.examples.p4p.p4p.sim.Feature>(
                  this, METHODID_GET_FEATURE)))
          .addMethod(
            getListFeaturesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.sim.Rectangle,
                io.grpc.examples.p4p.p4p.sim.Feature>(
                  this, METHODID_LIST_FEATURES)))
          .addMethod(
            getRecordRouteMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.sim.Point,
                io.grpc.examples.p4p.p4p.sim.RouteSummary>(
                  this, METHODID_RECORD_ROUTE)))
          .addMethod(
            getRouteChatMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                io.grpc.examples.p4p.p4p.sim.RouteNote,
                io.grpc.examples.p4p.p4p.sim.RouteNote>(
                  this, METHODID_ROUTE_CHAT)))
          .build();
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class P4PCoordianteStub extends io.grpc.stub.AbstractAsyncStub<P4PCoordianteStub> {
    private P4PCoordianteStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PCoordianteStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PCoordianteStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public void getFeature(io.grpc.examples.p4p.p4p.sim.Point request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Feature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public void listFeatures(io.grpc.examples.p4p.p4p.sim.Rectangle request,
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Feature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListFeaturesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * A client-to-server streaming RPC.
     * Accepts a stream of Points on a route being traversed, returning a
     * RouteSummary when traversal is completed.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Point> recordRoute(
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteSummary> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getRecordRouteMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Accepts a stream of RouteNotes sent while a route is being traversed,
     * while receiving other RouteNotes (e.g. from other users).
     * </pre>
     */
    public io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteNote> routeChat(
        io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteNote> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getRouteChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class P4PCoordianteBlockingStub extends io.grpc.stub.AbstractBlockingStub<P4PCoordianteBlockingStub> {
    private P4PCoordianteBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PCoordianteBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PCoordianteBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public io.grpc.examples.p4p.p4p.sim.Feature getFeature(io.grpc.examples.p4p.p4p.sim.Point request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFeatureMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * A server-to-client streaming RPC.
     * Obtains the Features available within the given Rectangle.  Results are
     * streamed rather than returned at once (e.g. in a response message with a
     * repeated field), as the rectangle may cover a large area and contain a
     * huge number of features.
     * </pre>
     */
    public java.util.Iterator<io.grpc.examples.p4p.p4p.sim.Feature> listFeatures(
        io.grpc.examples.p4p.p4p.sim.Rectangle request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListFeaturesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interface exported by the server.
   * </pre>
   */
  public static final class P4PCoordianteFutureStub extends io.grpc.stub.AbstractFutureStub<P4PCoordianteFutureStub> {
    private P4PCoordianteFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected P4PCoordianteFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new P4PCoordianteFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * A simple RPC.
     * Obtains the feature at a given position.
     * A feature with an empty name is returned if there's no feature at the given
     * position.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<io.grpc.examples.p4p.p4p.sim.Feature> getFeature(
        io.grpc.examples.p4p.p4p.sim.Point request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFeatureMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_FEATURE = 0;
  private static final int METHODID_LIST_FEATURES = 1;
  private static final int METHODID_RECORD_ROUTE = 2;
  private static final int METHODID_ROUTE_CHAT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final P4PCoordianteImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(P4PCoordianteImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_FEATURE:
          serviceImpl.getFeature((io.grpc.examples.p4p.p4p.sim.Point) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Feature>) responseObserver);
          break;
        case METHODID_LIST_FEATURES:
          serviceImpl.listFeatures((io.grpc.examples.p4p.p4p.sim.Rectangle) request,
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.Feature>) responseObserver);
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
        case METHODID_RECORD_ROUTE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.recordRoute(
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteSummary>) responseObserver);
        case METHODID_ROUTE_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.routeChat(
              (io.grpc.stub.StreamObserver<io.grpc.examples.p4p.p4p.sim.RouteNote>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class P4PCoordianteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    P4PCoordianteBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.grpc.examples.p4p.p4p.sim.P4PProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("P4PCoordiante");
    }
  }

  private static final class P4PCoordianteFileDescriptorSupplier
      extends P4PCoordianteBaseDescriptorSupplier {
    P4PCoordianteFileDescriptorSupplier() {}
  }

  private static final class P4PCoordianteMethodDescriptorSupplier
      extends P4PCoordianteBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    P4PCoordianteMethodDescriptorSupplier(String methodName) {
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
      synchronized (P4PCoordianteGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new P4PCoordianteFileDescriptorSupplier())
              .addMethod(getGetFeatureMethod())
              .addMethod(getListFeaturesMethod())
              .addMethod(getRecordRouteMethod())
              .addMethod(getRouteChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
