// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graph_transfer_info.proto

package org.tensorflow.framework;

public final class GraphTransferInfoProto {
  private GraphTransferInfoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_NodeInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_NodeInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_NodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_NodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_ConstNodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_ConstNodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_NodeInputInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_NodeInputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_NodeOutputInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_NodeOutputInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_GraphInputNodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_GraphInputNodeInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphTransferInfo_GraphOutputNodeInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_GraphTransferInfo_GraphOutputNodeInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031graph_transfer_info.proto\022\ntensorflow\032" +
      "\013types.proto\"\253\t\n\021GraphTransferInfo\0229\n\tno" +
      "de_info\030\001 \003(\0132&.tensorflow.GraphTransfer" +
      "Info.NodeInfo\022D\n\017const_node_info\030\002 \003(\0132+" +
      ".tensorflow.GraphTransferInfo.ConstNodeI" +
      "nfo\022D\n\017node_input_info\030\003 \003(\0132+.tensorflo" +
      "w.GraphTransferInfo.NodeInputInfo\022F\n\020nod" +
      "e_output_info\030\004 \003(\0132,.tensorflow.GraphTr" +
      "ansferInfo.NodeOutputInfo\022O\n\025graph_input" +
      "_node_info\030\005 \003(\01320.tensorflow.GraphTrans",
      "ferInfo.GraphInputNodeInfo\022Q\n\026graph_outp" +
      "ut_node_info\030\006 \003(\01321.tensorflow.GraphTra" +
      "nsferInfo.GraphOutputNodeInfo\022>\n\013destina" +
      "tion\030\007 \001(\0162).tensorflow.GraphTransferInf" +
      "o.Destination\0321\n\tNodeInput\022\017\n\007node_id\030\001 " +
      "\001(\005\022\023\n\013output_port\030\002 \001(\005\032\216\001\n\010NodeInfo\022\014\n" +
      "\004name\030\001 \001(\t\022\017\n\007node_id\030\002 \001(\005\022\021\n\ttype_nam" +
      "e\030\003 \001(\t\022\021\n\tsoc_op_id\030\004 \001(\005\022\022\n\npadding_id" +
      "\030\005 \001(\005\022\023\n\013input_count\030\006 \001(\005\022\024\n\014output_co" +
      "unt\030\007 \001(\005\032p\n\rConstNodeInfo\022\014\n\004name\030\001 \001(\t",
      "\022\017\n\007node_id\030\002 \001(\005\022\r\n\005shape\030\003 \003(\003\022\014\n\004data" +
      "\030\004 \001(\014\022#\n\005dtype\030\005 \001(\0162\024.tensorflow.DataT" +
      "ype\032]\n\rNodeInputInfo\022\017\n\007node_id\030\001 \001(\005\022;\n" +
      "\nnode_input\030\002 \003(\0132\'.tensorflow.GraphTran" +
      "sferInfo.NodeInput\0328\n\016NodeOutputInfo\022\017\n\007" +
      "node_id\030\001 \001(\005\022\025\n\rmax_byte_size\030\002 \003(\005\032V\n\022" +
      "GraphInputNodeInfo\022\014\n\004name\030\001 \001(\t\022\r\n\005shap" +
      "e\030\002 \003(\003\022#\n\005dtype\030\003 \001(\0162\024.tensorflow.Data" +
      "Type\032W\n\023GraphOutputNodeInfo\022\014\n\004name\030\001 \001(" +
      "\t\022\r\n\005shape\030\002 \003(\003\022#\n\005dtype\030\003 \001(\0162\024.tensor",
      "flow.DataType\"#\n\013Destination\022\007\n\003NOP\020\000\022\013\n" +
      "\007HEXAGON\020\001B7\n\030org.tensorflow.frameworkB\026" +
      "GraphTransferInfoProtoP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.TypesProtos.getDescriptor(),
        }, assigner);
    internal_static_tensorflow_GraphTransferInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_GraphTransferInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_descriptor,
        new java.lang.String[] { "NodeInfo", "ConstNodeInfo", "NodeInputInfo", "NodeOutputInfo", "GraphInputNodeInfo", "GraphOutputNodeInfo", "Destination", });
    internal_static_tensorflow_GraphTransferInfo_NodeInput_descriptor =
      internal_static_tensorflow_GraphTransferInfo_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_GraphTransferInfo_NodeInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_NodeInput_descriptor,
        new java.lang.String[] { "NodeId", "OutputPort", });
    internal_static_tensorflow_GraphTransferInfo_NodeInfo_descriptor =
      internal_static_tensorflow_GraphTransferInfo_descriptor.getNestedTypes().get(1);
    internal_static_tensorflow_GraphTransferInfo_NodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_NodeInfo_descriptor,
        new java.lang.String[] { "Name", "NodeId", "TypeName", "SocOpId", "PaddingId", "InputCount", "OutputCount", });
    internal_static_tensorflow_GraphTransferInfo_ConstNodeInfo_descriptor =
      internal_static_tensorflow_GraphTransferInfo_descriptor.getNestedTypes().get(2);
    internal_static_tensorflow_GraphTransferInfo_ConstNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_ConstNodeInfo_descriptor,
        new java.lang.String[] { "Name", "NodeId", "Shape", "Data", "Dtype", });
    internal_static_tensorflow_GraphTransferInfo_NodeInputInfo_descriptor =
      internal_static_tensorflow_GraphTransferInfo_descriptor.getNestedTypes().get(3);
    internal_static_tensorflow_GraphTransferInfo_NodeInputInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_NodeInputInfo_descriptor,
        new java.lang.String[] { "NodeId", "NodeInput", });
    internal_static_tensorflow_GraphTransferInfo_NodeOutputInfo_descriptor =
      internal_static_tensorflow_GraphTransferInfo_descriptor.getNestedTypes().get(4);
    internal_static_tensorflow_GraphTransferInfo_NodeOutputInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_NodeOutputInfo_descriptor,
        new java.lang.String[] { "NodeId", "MaxByteSize", });
    internal_static_tensorflow_GraphTransferInfo_GraphInputNodeInfo_descriptor =
      internal_static_tensorflow_GraphTransferInfo_descriptor.getNestedTypes().get(5);
    internal_static_tensorflow_GraphTransferInfo_GraphInputNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_GraphInputNodeInfo_descriptor,
        new java.lang.String[] { "Name", "Shape", "Dtype", });
    internal_static_tensorflow_GraphTransferInfo_GraphOutputNodeInfo_descriptor =
      internal_static_tensorflow_GraphTransferInfo_descriptor.getNestedTypes().get(6);
    internal_static_tensorflow_GraphTransferInfo_GraphOutputNodeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_GraphTransferInfo_GraphOutputNodeInfo_descriptor,
        new java.lang.String[] { "Name", "Shape", "Dtype", });
    org.tensorflow.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
