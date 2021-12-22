// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: p4p.proto

package io.grpc.examples.p4p.p4p.sim;

public final class P4PProto {
  private P4PProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_p4p_p4p_sim_Point_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_p4p_p4p_sim_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_p4p_p4p_sim_Rectangle_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_p4p_p4p_sim_Rectangle_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_p4p_p4p_sim_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_p4p_p4p_sim_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_p4p_p4p_sim_FeatureDatabase_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_p4p_p4p_sim_FeatureDatabase_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_p4p_p4p_sim_RouteNote_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_p4p_p4p_sim_RouteNote_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_p4p_p4p_sim_RouteSummary_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_p4p_p4p_sim_RouteSummary_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tp4p.proto\022\013p4p.p4p.sim\",\n\005Point\022\020\n\010lat" +
      "itude\030\001 \001(\005\022\021\n\tlongitude\030\002 \001(\005\"K\n\tRectan" +
      "gle\022\036\n\002lo\030\001 \001(\0132\022.p4p.p4p.sim.Point\022\036\n\002h" +
      "i\030\002 \001(\0132\022.p4p.p4p.sim.Point\"L\n\007Feature\022\014" +
      "\n\004name\030\001 \001(\t\022$\n\010location\030\002 \001(\0132\022.p4p.p4p" +
      ".sim.Point\022\r\n\005idstr\030\003 \001(\t\"8\n\017FeatureData" +
      "base\022%\n\007feature\030\001 \003(\0132\024.p4p.p4p.sim.Feat" +
      "ure\"B\n\tRouteNote\022$\n\010location\030\001 \001(\0132\022.p4p" +
      ".p4p.sim.Point\022\017\n\007message\030\002 \001(\t\"b\n\014Route" +
      "Summary\022\023\n\013point_count\030\001 \001(\005\022\025\n\rfeature_" +
      "count\030\002 \001(\005\022\020\n\010distance\030\003 \001(\005\022\024\n\014elapsed" +
      "_time\030\004 \001(\0052\215\002\n\nRouteGuide\0228\n\nGetFeature" +
      "\022\022.p4p.p4p.sim.Point\032\024.p4p.p4p.sim.Featu" +
      "re\"\000\022@\n\014ListFeatures\022\026.p4p.p4p.sim.Recta" +
      "ngle\032\024.p4p.p4p.sim.Feature\"\0000\001\022@\n\013Record" +
      "Route\022\022.p4p.p4p.sim.Point\032\031.p4p.p4p.sim." +
      "RouteSummary\"\000(\001\022A\n\tRouteChat\022\026.p4p.p4p." +
      "sim.RouteNote\032\026.p4p.p4p.sim.RouteNote\"\000(" +
      "\0010\001B0\n\034io.grpc.examples.p4p.p4p.simB\010P4P" +
      "ProtoP\001\242\002\003RTGb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_p4p_p4p_sim_Point_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_p4p_p4p_sim_Point_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_p4p_p4p_sim_Point_descriptor,
        new java.lang.String[] { "Latitude", "Longitude", });
    internal_static_p4p_p4p_sim_Rectangle_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_p4p_p4p_sim_Rectangle_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_p4p_p4p_sim_Rectangle_descriptor,
        new java.lang.String[] { "Lo", "Hi", });
    internal_static_p4p_p4p_sim_Feature_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_p4p_p4p_sim_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_p4p_p4p_sim_Feature_descriptor,
        new java.lang.String[] { "Name", "Location", "Idstr", });
    internal_static_p4p_p4p_sim_FeatureDatabase_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_p4p_p4p_sim_FeatureDatabase_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_p4p_p4p_sim_FeatureDatabase_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_p4p_p4p_sim_RouteNote_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_p4p_p4p_sim_RouteNote_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_p4p_p4p_sim_RouteNote_descriptor,
        new java.lang.String[] { "Location", "Message", });
    internal_static_p4p_p4p_sim_RouteSummary_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_p4p_p4p_sim_RouteSummary_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_p4p_p4p_sim_RouteSummary_descriptor,
        new java.lang.String[] { "PointCount", "FeatureCount", "Distance", "ElapsedTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
