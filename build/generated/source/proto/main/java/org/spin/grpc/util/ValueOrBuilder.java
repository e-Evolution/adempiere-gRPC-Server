// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

public interface ValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:data.Value)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 intValue = 1;</code>
   */
  int getIntValue();

  /**
   * <code>int64 longValue = 2;</code>
   */
  long getLongValue();

  /**
   * <code>double doubleValue = 3;</code>
   */
  double getDoubleValue();

  /**
   * <code>bool booleanValue = 4;</code>
   */
  boolean getBooleanValue();

  /**
   * <code>string stringValue = 5;</code>
   */
  java.lang.String getStringValue();
  /**
   * <code>string stringValue = 5;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>.data.Value.ValueType valueType = 6;</code>
   */
  int getValueTypeValue();
  /**
   * <code>.data.Value.ValueType valueType = 6;</code>
   */
  org.spin.grpc.util.Value.ValueType getValueType();
}
