// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: businessdata.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Create Entity Request
 * </pre>
 *
 * Protobuf type {@code data.CreateEntityRequest}
 */
public  final class CreateEntityRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:data.CreateEntityRequest)
    CreateEntityRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateEntityRequest.newBuilder() to construct.
  private CreateEntityRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateEntityRequest() {
    tableName_ = "";
    attributes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateEntityRequest(
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
            org.spin.grpc.util.ClientRequest.Builder subBuilder = null;
            if (clientRequest_ != null) {
              subBuilder = clientRequest_.toBuilder();
            }
            clientRequest_ = input.readMessage(org.spin.grpc.util.ClientRequest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(clientRequest_);
              clientRequest_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            tableName_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              attributes_ = new java.util.ArrayList<org.spin.grpc.util.KeyValue>();
              mutable_bitField0_ |= 0x00000004;
            }
            attributes_.add(
                input.readMessage(org.spin.grpc.util.KeyValue.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        attributes_ = java.util.Collections.unmodifiableList(attributes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_CreateEntityRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereData.internal_static_data_CreateEntityRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.CreateEntityRequest.class, org.spin.grpc.util.CreateEntityRequest.Builder.class);
  }

  private int bitField0_;
  public static final int CLIENTREQUEST_FIELD_NUMBER = 1;
  private org.spin.grpc.util.ClientRequest clientRequest_;
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  public boolean hasClientRequest() {
    return clientRequest_ != null;
  }
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  public org.spin.grpc.util.ClientRequest getClientRequest() {
    return clientRequest_ == null ? org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
  }
  /**
   * <code>.data.ClientRequest clientRequest = 1;</code>
   */
  public org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder() {
    return getClientRequest();
  }

  public static final int TABLENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object tableName_;
  /**
   * <code>string tableName = 2;</code>
   */
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <code>string tableName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 3;
  private java.util.List<org.spin.grpc.util.KeyValue> attributes_;
  /**
   * <code>repeated .data.KeyValue attributes = 3;</code>
   */
  public java.util.List<org.spin.grpc.util.KeyValue> getAttributesList() {
    return attributes_;
  }
  /**
   * <code>repeated .data.KeyValue attributes = 3;</code>
   */
  public java.util.List<? extends org.spin.grpc.util.KeyValueOrBuilder> 
      getAttributesOrBuilderList() {
    return attributes_;
  }
  /**
   * <code>repeated .data.KeyValue attributes = 3;</code>
   */
  public int getAttributesCount() {
    return attributes_.size();
  }
  /**
   * <code>repeated .data.KeyValue attributes = 3;</code>
   */
  public org.spin.grpc.util.KeyValue getAttributes(int index) {
    return attributes_.get(index);
  }
  /**
   * <code>repeated .data.KeyValue attributes = 3;</code>
   */
  public org.spin.grpc.util.KeyValueOrBuilder getAttributesOrBuilder(
      int index) {
    return attributes_.get(index);
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
    if (clientRequest_ != null) {
      output.writeMessage(1, getClientRequest());
    }
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tableName_);
    }
    for (int i = 0; i < attributes_.size(); i++) {
      output.writeMessage(3, attributes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (clientRequest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getClientRequest());
    }
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tableName_);
    }
    for (int i = 0; i < attributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, attributes_.get(i));
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
    if (!(obj instanceof org.spin.grpc.util.CreateEntityRequest)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.CreateEntityRequest other = (org.spin.grpc.util.CreateEntityRequest) obj;

    boolean result = true;
    result = result && (hasClientRequest() == other.hasClientRequest());
    if (hasClientRequest()) {
      result = result && getClientRequest()
          .equals(other.getClientRequest());
    }
    result = result && getTableName()
        .equals(other.getTableName());
    result = result && getAttributesList()
        .equals(other.getAttributesList());
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
    if (hasClientRequest()) {
      hash = (37 * hash) + CLIENTREQUEST_FIELD_NUMBER;
      hash = (53 * hash) + getClientRequest().hashCode();
    }
    hash = (37 * hash) + TABLENAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    if (getAttributesCount() > 0) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.CreateEntityRequest parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.CreateEntityRequest prototype) {
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
   * Create Entity Request
   * </pre>
   *
   * Protobuf type {@code data.CreateEntityRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:data.CreateEntityRequest)
      org.spin.grpc.util.CreateEntityRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_CreateEntityRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_CreateEntityRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.CreateEntityRequest.class, org.spin.grpc.util.CreateEntityRequest.Builder.class);
    }

    // Construct using org.spin.grpc.util.CreateEntityRequest.newBuilder()
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
        getAttributesFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (clientRequestBuilder_ == null) {
        clientRequest_ = null;
      } else {
        clientRequest_ = null;
        clientRequestBuilder_ = null;
      }
      tableName_ = "";

      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        attributesBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereData.internal_static_data_CreateEntityRequest_descriptor;
    }

    public org.spin.grpc.util.CreateEntityRequest getDefaultInstanceForType() {
      return org.spin.grpc.util.CreateEntityRequest.getDefaultInstance();
    }

    public org.spin.grpc.util.CreateEntityRequest build() {
      org.spin.grpc.util.CreateEntityRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.CreateEntityRequest buildPartial() {
      org.spin.grpc.util.CreateEntityRequest result = new org.spin.grpc.util.CreateEntityRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (clientRequestBuilder_ == null) {
        result.clientRequest_ = clientRequest_;
      } else {
        result.clientRequest_ = clientRequestBuilder_.build();
      }
      result.tableName_ = tableName_;
      if (attributesBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          attributes_ = java.util.Collections.unmodifiableList(attributes_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof org.spin.grpc.util.CreateEntityRequest) {
        return mergeFrom((org.spin.grpc.util.CreateEntityRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.CreateEntityRequest other) {
      if (other == org.spin.grpc.util.CreateEntityRequest.getDefaultInstance()) return this;
      if (other.hasClientRequest()) {
        mergeClientRequest(other.getClientRequest());
      }
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (attributesBuilder_ == null) {
        if (!other.attributes_.isEmpty()) {
          if (attributes_.isEmpty()) {
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureAttributesIsMutable();
            attributes_.addAll(other.attributes_);
          }
          onChanged();
        }
      } else {
        if (!other.attributes_.isEmpty()) {
          if (attributesBuilder_.isEmpty()) {
            attributesBuilder_.dispose();
            attributesBuilder_ = null;
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000004);
            attributesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttributesFieldBuilder() : null;
          } else {
            attributesBuilder_.addAllMessages(other.attributes_);
          }
        }
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
      org.spin.grpc.util.CreateEntityRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.CreateEntityRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private org.spin.grpc.util.ClientRequest clientRequest_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder> clientRequestBuilder_;
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public boolean hasClientRequest() {
      return clientRequestBuilder_ != null || clientRequest_ != null;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public org.spin.grpc.util.ClientRequest getClientRequest() {
      if (clientRequestBuilder_ == null) {
        return clientRequest_ == null ? org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
      } else {
        return clientRequestBuilder_.getMessage();
      }
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder setClientRequest(org.spin.grpc.util.ClientRequest value) {
      if (clientRequestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientRequest_ = value;
        onChanged();
      } else {
        clientRequestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder setClientRequest(
        org.spin.grpc.util.ClientRequest.Builder builderForValue) {
      if (clientRequestBuilder_ == null) {
        clientRequest_ = builderForValue.build();
        onChanged();
      } else {
        clientRequestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder mergeClientRequest(org.spin.grpc.util.ClientRequest value) {
      if (clientRequestBuilder_ == null) {
        if (clientRequest_ != null) {
          clientRequest_ =
            org.spin.grpc.util.ClientRequest.newBuilder(clientRequest_).mergeFrom(value).buildPartial();
        } else {
          clientRequest_ = value;
        }
        onChanged();
      } else {
        clientRequestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public Builder clearClientRequest() {
      if (clientRequestBuilder_ == null) {
        clientRequest_ = null;
        onChanged();
      } else {
        clientRequest_ = null;
        clientRequestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public org.spin.grpc.util.ClientRequest.Builder getClientRequestBuilder() {
      
      onChanged();
      return getClientRequestFieldBuilder().getBuilder();
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    public org.spin.grpc.util.ClientRequestOrBuilder getClientRequestOrBuilder() {
      if (clientRequestBuilder_ != null) {
        return clientRequestBuilder_.getMessageOrBuilder();
      } else {
        return clientRequest_ == null ?
            org.spin.grpc.util.ClientRequest.getDefaultInstance() : clientRequest_;
      }
    }
    /**
     * <code>.data.ClientRequest clientRequest = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder> 
        getClientRequestFieldBuilder() {
      if (clientRequestBuilder_ == null) {
        clientRequestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.spin.grpc.util.ClientRequest, org.spin.grpc.util.ClientRequest.Builder, org.spin.grpc.util.ClientRequestOrBuilder>(
                getClientRequest(),
                getParentForChildren(),
                isClean());
        clientRequest_ = null;
      }
      return clientRequestBuilder_;
    }

    private java.lang.Object tableName_ = "";
    /**
     * <code>string tableName = 2;</code>
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string tableName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string tableName = 2;</code>
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      tableName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string tableName = 2;</code>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>string tableName = 2;</code>
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      tableName_ = value;
      onChanged();
      return this;
    }

    private java.util.List<org.spin.grpc.util.KeyValue> attributes_ =
      java.util.Collections.emptyList();
    private void ensureAttributesIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        attributes_ = new java.util.ArrayList<org.spin.grpc.util.KeyValue>(attributes_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.KeyValue, org.spin.grpc.util.KeyValue.Builder, org.spin.grpc.util.KeyValueOrBuilder> attributesBuilder_;

    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public java.util.List<org.spin.grpc.util.KeyValue> getAttributesList() {
      if (attributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attributes_);
      } else {
        return attributesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public int getAttributesCount() {
      if (attributesBuilder_ == null) {
        return attributes_.size();
      } else {
        return attributesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public org.spin.grpc.util.KeyValue getAttributes(int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);
      } else {
        return attributesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder setAttributes(
        int index, org.spin.grpc.util.KeyValue value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.set(index, value);
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder setAttributes(
        int index, org.spin.grpc.util.KeyValue.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder addAttributes(org.spin.grpc.util.KeyValue value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder addAttributes(
        int index, org.spin.grpc.util.KeyValue value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(index, value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder addAttributes(
        org.spin.grpc.util.KeyValue.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder addAttributes(
        int index, org.spin.grpc.util.KeyValue.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder addAllAttributes(
        java.lang.Iterable<? extends org.spin.grpc.util.KeyValue> values) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attributes_);
        onChanged();
      } else {
        attributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder clearAttributes() {
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        attributesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public Builder removeAttributes(int index) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.remove(index);
        onChanged();
      } else {
        attributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public org.spin.grpc.util.KeyValue.Builder getAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public org.spin.grpc.util.KeyValueOrBuilder getAttributesOrBuilder(
        int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);  } else {
        return attributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public java.util.List<? extends org.spin.grpc.util.KeyValueOrBuilder> 
         getAttributesOrBuilderList() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attributes_);
      }
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public org.spin.grpc.util.KeyValue.Builder addAttributesBuilder() {
      return getAttributesFieldBuilder().addBuilder(
          org.spin.grpc.util.KeyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public org.spin.grpc.util.KeyValue.Builder addAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().addBuilder(
          index, org.spin.grpc.util.KeyValue.getDefaultInstance());
    }
    /**
     * <code>repeated .data.KeyValue attributes = 3;</code>
     */
    public java.util.List<org.spin.grpc.util.KeyValue.Builder> 
         getAttributesBuilderList() {
      return getAttributesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.spin.grpc.util.KeyValue, org.spin.grpc.util.KeyValue.Builder, org.spin.grpc.util.KeyValueOrBuilder> 
        getAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.spin.grpc.util.KeyValue, org.spin.grpc.util.KeyValue.Builder, org.spin.grpc.util.KeyValueOrBuilder>(
                attributes_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:data.CreateEntityRequest)
  }

  // @@protoc_insertion_point(class_scope:data.CreateEntityRequest)
  private static final org.spin.grpc.util.CreateEntityRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.CreateEntityRequest();
  }

  public static org.spin.grpc.util.CreateEntityRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateEntityRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateEntityRequest>() {
    public CreateEntityRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateEntityRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateEntityRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateEntityRequest> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.CreateEntityRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

