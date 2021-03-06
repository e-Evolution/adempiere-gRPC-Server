// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Order By Property
 * </pre>
 *
 * Protobuf type {@code data.OrderByProperty}
 */
public  final class OrderByProperty extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.OrderByProperty)
    OrderByPropertyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderByProperty.newBuilder() to construct.
  private OrderByProperty(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderByProperty() {
    columnName_ = "";
    orderType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderByProperty(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            columnName_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            orderType_ = rawValue;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_OrderByProperty_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_OrderByProperty_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.OrderByProperty.class, org.spin.grpc.util.OrderByProperty.Builder.class);
  }

  /**
   * Protobuf enum {@code data.OrderByProperty.OrderType}
   */
  public enum OrderType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ASCENDING = 0;</code>
     */
    ASCENDING(0),
    /**
     * <code>DESCENDING = 1;</code>
     */
    DESCENDING(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>ASCENDING = 0;</code>
     */
    public static final int ASCENDING_VALUE = 0;
    /**
     * <code>DESCENDING = 1;</code>
     */
    public static final int DESCENDING_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OrderType valueOf(int value) {
      return forNumber(value);
    }

    public static OrderType forNumber(int value) {
      switch (value) {
        case 0: return ASCENDING;
        case 1: return DESCENDING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OrderType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        OrderType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<OrderType>() {
            public OrderType findValueByNumber(int number) {
              return OrderType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.spin.grpc.util.OrderByProperty.getDescriptor().getEnumTypes().get(0);
    }

    private static final OrderType[] VALUES = values();

    public static OrderType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OrderType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:data.OrderByProperty.OrderType)
  }

  public static final int COLUMNNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object columnName_;
  /**
   * <code>string columnName = 1;</code>
   */
  public java.lang.String getColumnName() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      columnName_ = s;
      return s;
    }
  }
  /**
   * <code>string columnName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getColumnNameBytes() {
    java.lang.Object ref = columnName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      columnName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ORDERTYPE_FIELD_NUMBER = 2;
  private int orderType_;
  /**
   * <pre>
   *	Operators
   * </pre>
   *
   * <code>.data.OrderByProperty.OrderType orderType = 2;</code>
   */
  public int getOrderTypeValue() {
    return orderType_;
  }
  /**
   * <pre>
   *	Operators
   * </pre>
   *
   * <code>.data.OrderByProperty.OrderType orderType = 2;</code>
   */
  public org.spin.grpc.util.OrderByProperty.OrderType getOrderType() {
    org.spin.grpc.util.OrderByProperty.OrderType result = org.spin.grpc.util.OrderByProperty.OrderType.valueOf(orderType_);
    return result == null ? org.spin.grpc.util.OrderByProperty.OrderType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getColumnNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, columnName_);
    }
    if (orderType_ != org.spin.grpc.util.OrderByProperty.OrderType.ASCENDING.getNumber()) {
      output.writeEnum(2, orderType_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getColumnNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, columnName_);
    }
    if (orderType_ != org.spin.grpc.util.OrderByProperty.OrderType.ASCENDING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, orderType_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.spin.grpc.util.OrderByProperty)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.OrderByProperty other = (org.spin.grpc.util.OrderByProperty) obj;

    boolean result = true;
    result = result && getColumnName()
        .equals(other.getColumnName());
    result = result && orderType_ == other.orderType_;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + COLUMNNAME_FIELD_NUMBER;
    hash = (53 * hash) + getColumnName().hashCode();
    hash = (37 * hash) + ORDERTYPE_FIELD_NUMBER;
    hash = (53 * hash) + orderType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.OrderByProperty parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.OrderByProperty parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.OrderByProperty parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.OrderByProperty parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.spin.grpc.util.OrderByProperty prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Order By Property
   * </pre>
   *
   * Protobuf type {@code data.OrderByProperty}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.OrderByProperty)
      org.spin.grpc.util.OrderByPropertyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_OrderByProperty_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_OrderByProperty_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.OrderByProperty.class, org.spin.grpc.util.OrderByProperty.Builder.class);
    }

    // Construct using org.spin.grpc.util.OrderByProperty.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      columnName_ = "";

      orderType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_OrderByProperty_descriptor;
    }

    public org.spin.grpc.util.OrderByProperty getDefaultInstanceForType() {
      return org.spin.grpc.util.OrderByProperty.getDefaultInstance();
    }

    public org.spin.grpc.util.OrderByProperty build() {
      org.spin.grpc.util.OrderByProperty result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.OrderByProperty buildPartial() {
      org.spin.grpc.util.OrderByProperty result = new org.spin.grpc.util.OrderByProperty(this);
      result.columnName_ = columnName_;
      result.orderType_ = orderType_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.spin.grpc.util.OrderByProperty) {
        return mergeFrom((org.spin.grpc.util.OrderByProperty)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.OrderByProperty other) {
      if (other == org.spin.grpc.util.OrderByProperty.getDefaultInstance()) return this;
      if (!other.getColumnName().isEmpty()) {
        columnName_ = other.columnName_;
        onChanged();
      }
      if (other.orderType_ != 0) {
        setOrderTypeValue(other.getOrderTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.spin.grpc.util.OrderByProperty parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.OrderByProperty) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object columnName_ = "";
    /**
     * <code>string columnName = 1;</code>
     */
    public java.lang.String getColumnName() {
      java.lang.Object ref = columnName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        columnName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string columnName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getColumnNameBytes() {
      java.lang.Object ref = columnName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        columnName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string columnName = 1;</code>
     */
    public Builder setColumnName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      columnName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string columnName = 1;</code>
     */
    public Builder clearColumnName() {
      
      columnName_ = getDefaultInstance().getColumnName();
      onChanged();
      return this;
    }
    /**
     * <code>string columnName = 1;</code>
     */
    public Builder setColumnNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      columnName_ = value;
      onChanged();
      return this;
    }

    private int orderType_ = 0;
    /**
     * <pre>
     *	Operators
     * </pre>
     *
     * <code>.data.OrderByProperty.OrderType orderType = 2;</code>
     */
    public int getOrderTypeValue() {
      return orderType_;
    }
    /**
     * <pre>
     *	Operators
     * </pre>
     *
     * <code>.data.OrderByProperty.OrderType orderType = 2;</code>
     */
    public Builder setOrderTypeValue(int value) {
      orderType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *	Operators
     * </pre>
     *
     * <code>.data.OrderByProperty.OrderType orderType = 2;</code>
     */
    public org.spin.grpc.util.OrderByProperty.OrderType getOrderType() {
      org.spin.grpc.util.OrderByProperty.OrderType result = org.spin.grpc.util.OrderByProperty.OrderType.valueOf(orderType_);
      return result == null ? org.spin.grpc.util.OrderByProperty.OrderType.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     *	Operators
     * </pre>
     *
     * <code>.data.OrderByProperty.OrderType orderType = 2;</code>
     */
    public Builder setOrderType(org.spin.grpc.util.OrderByProperty.OrderType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      orderType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *	Operators
     * </pre>
     *
     * <code>.data.OrderByProperty.OrderType orderType = 2;</code>
     */
    public Builder clearOrderType() {
      
      orderType_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:data.OrderByProperty)
  }

  // @@protoc_insertion_point(class_scope:data.OrderByProperty)
  private static final org.spin.grpc.util.OrderByProperty DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.OrderByProperty();
  }

  public static org.spin.grpc.util.OrderByProperty getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderByProperty>
      PARSER = new com.google.protobuf.AbstractParser<OrderByProperty>() {
    public OrderByProperty parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderByProperty(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderByProperty> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderByProperty> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.OrderByProperty getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

