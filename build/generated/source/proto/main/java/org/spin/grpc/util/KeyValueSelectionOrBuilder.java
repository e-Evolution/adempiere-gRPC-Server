// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface KeyValueSelectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.KeyValueSelection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 selectionId = 1;</code>
   */
  int getSelectionId();

  /**
   * <code>repeated .data.KeyValue values = 2;</code>
   */
  java.util.List<org.spin.grpc.util.KeyValue> 
      getValuesList();
  /**
   * <code>repeated .data.KeyValue values = 2;</code>
   */
  org.spin.grpc.util.KeyValue getValues(int index);
  /**
   * <code>repeated .data.KeyValue values = 2;</code>
   */
  int getValuesCount();
  /**
   * <code>repeated .data.KeyValue values = 2;</code>
   */
  java.util.List<? extends org.spin.grpc.util.KeyValueOrBuilder> 
      getValuesOrBuilderList();
  /**
   * <code>repeated .data.KeyValue values = 2;</code>
   */
  org.spin.grpc.util.KeyValueOrBuilder getValuesOrBuilder(
      int index);
}
