// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dictionary.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Message
 * </pre>
 *
 * Protobuf type {@code dictionary.MessageText}
 */
public  final class MessageText extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:dictionary.MessageText)
    MessageTextOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MessageText.newBuilder() to construct.
  private MessageText(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MessageText() {
    id_ = 0;
    uuid_ = "";
    value_ = "";
    msgType_ = "";
    msgText_ = "";
    msgTip_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MessageText(
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
          case 8: {

            id_ = input.readInt32();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            uuid_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            value_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            msgType_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            msgText_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            msgTip_ = s;
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
    return org.spin.grpc.util.ADempiereDictionary.internal_static_dictionary_MessageText_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereDictionary.internal_static_dictionary_MessageText_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.MessageText.class, org.spin.grpc.util.MessageText.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   */
  public int getId() {
    return id_;
  }

  public static final int UUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object uuid_;
  /**
   * <code>string uuid = 2;</code>
   */
  public java.lang.String getUuid() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uuid_ = s;
      return s;
    }
  }
  /**
   * <code>string uuid = 2;</code>
   */
  public com.google.protobuf.ByteString
      getUuidBytes() {
    java.lang.Object ref = uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_FIELD_NUMBER = 3;
  private volatile java.lang.Object value_;
  /**
   * <code>string value = 3;</code>
   */
  public java.lang.String getValue() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      value_ = s;
      return s;
    }
  }
  /**
   * <code>string value = 3;</code>
   */
  public com.google.protobuf.ByteString
      getValueBytes() {
    java.lang.Object ref = value_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      value_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSGTYPE_FIELD_NUMBER = 4;
  private volatile java.lang.Object msgType_;
  /**
   * <code>string msgType = 4;</code>
   */
  public java.lang.String getMsgType() {
    java.lang.Object ref = msgType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msgType_ = s;
      return s;
    }
  }
  /**
   * <code>string msgType = 4;</code>
   */
  public com.google.protobuf.ByteString
      getMsgTypeBytes() {
    java.lang.Object ref = msgType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msgType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSGTEXT_FIELD_NUMBER = 5;
  private volatile java.lang.Object msgText_;
  /**
   * <code>string msgText = 5;</code>
   */
  public java.lang.String getMsgText() {
    java.lang.Object ref = msgText_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msgText_ = s;
      return s;
    }
  }
  /**
   * <code>string msgText = 5;</code>
   */
  public com.google.protobuf.ByteString
      getMsgTextBytes() {
    java.lang.Object ref = msgText_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msgText_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MSGTIP_FIELD_NUMBER = 6;
  private volatile java.lang.Object msgTip_;
  /**
   * <code>string msgTip = 6;</code>
   */
  public java.lang.String getMsgTip() {
    java.lang.Object ref = msgTip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msgTip_ = s;
      return s;
    }
  }
  /**
   * <code>string msgTip = 6;</code>
   */
  public com.google.protobuf.ByteString
      getMsgTipBytes() {
    java.lang.Object ref = msgTip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msgTip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!getUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, uuid_);
    }
    if (!getValueBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, value_);
    }
    if (!getMsgTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, msgType_);
    }
    if (!getMsgTextBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, msgText_);
    }
    if (!getMsgTipBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, msgTip_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!getUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, uuid_);
    }
    if (!getValueBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, value_);
    }
    if (!getMsgTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, msgType_);
    }
    if (!getMsgTextBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, msgText_);
    }
    if (!getMsgTipBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, msgTip_);
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
    if (!(obj instanceof org.spin.grpc.util.MessageText)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.MessageText other = (org.spin.grpc.util.MessageText) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getUuid()
        .equals(other.getUuid());
    result = result && getValue()
        .equals(other.getValue());
    result = result && getMsgType()
        .equals(other.getMsgType());
    result = result && getMsgText()
        .equals(other.getMsgText());
    result = result && getMsgTip()
        .equals(other.getMsgTip());
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + UUID_FIELD_NUMBER;
    hash = (53 * hash) + getUuid().hashCode();
    hash = (37 * hash) + VALUE_FIELD_NUMBER;
    hash = (53 * hash) + getValue().hashCode();
    hash = (37 * hash) + MSGTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMsgType().hashCode();
    hash = (37 * hash) + MSGTEXT_FIELD_NUMBER;
    hash = (53 * hash) + getMsgText().hashCode();
    hash = (37 * hash) + MSGTIP_FIELD_NUMBER;
    hash = (53 * hash) + getMsgTip().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.MessageText parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.MessageText parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.MessageText parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.MessageText parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.MessageText parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.MessageText parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.MessageText parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.MessageText parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.MessageText parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.MessageText parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.MessageText parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.MessageText parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.MessageText prototype) {
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
   * Message
   * </pre>
   *
   * Protobuf type {@code dictionary.MessageText}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:dictionary.MessageText)
      org.spin.grpc.util.MessageTextOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereDictionary.internal_static_dictionary_MessageText_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereDictionary.internal_static_dictionary_MessageText_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.MessageText.class, org.spin.grpc.util.MessageText.Builder.class);
    }

    // Construct using org.spin.grpc.util.MessageText.newBuilder()
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
      id_ = 0;

      uuid_ = "";

      value_ = "";

      msgType_ = "";

      msgText_ = "";

      msgTip_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereDictionary.internal_static_dictionary_MessageText_descriptor;
    }

    public org.spin.grpc.util.MessageText getDefaultInstanceForType() {
      return org.spin.grpc.util.MessageText.getDefaultInstance();
    }

    public org.spin.grpc.util.MessageText build() {
      org.spin.grpc.util.MessageText result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.MessageText buildPartial() {
      org.spin.grpc.util.MessageText result = new org.spin.grpc.util.MessageText(this);
      result.id_ = id_;
      result.uuid_ = uuid_;
      result.value_ = value_;
      result.msgType_ = msgType_;
      result.msgText_ = msgText_;
      result.msgTip_ = msgTip_;
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
      if (other instanceof org.spin.grpc.util.MessageText) {
        return mergeFrom((org.spin.grpc.util.MessageText)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.MessageText other) {
      if (other == org.spin.grpc.util.MessageText.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getUuid().isEmpty()) {
        uuid_ = other.uuid_;
        onChanged();
      }
      if (!other.getValue().isEmpty()) {
        value_ = other.value_;
        onChanged();
      }
      if (!other.getMsgType().isEmpty()) {
        msgType_ = other.msgType_;
        onChanged();
      }
      if (!other.getMsgText().isEmpty()) {
        msgText_ = other.msgText_;
        onChanged();
      }
      if (!other.getMsgTip().isEmpty()) {
        msgTip_ = other.msgTip_;
        onChanged();
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
      org.spin.grpc.util.MessageText parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.MessageText) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     */
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object uuid_ = "";
    /**
     * <code>string uuid = 2;</code>
     */
    public java.lang.String getUuid() {
      java.lang.Object ref = uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string uuid = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUuidBytes() {
      java.lang.Object ref = uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string uuid = 2;</code>
     */
    public Builder setUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 2;</code>
     */
    public Builder clearUuid() {
      
      uuid_ = getDefaultInstance().getUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string uuid = 2;</code>
     */
    public Builder setUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      uuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object value_ = "";
    /**
     * <code>string value = 3;</code>
     */
    public java.lang.String getValue() {
      java.lang.Object ref = value_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        value_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string value = 3;</code>
     */
    public com.google.protobuf.ByteString
        getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string value = 3;</code>
     */
    public Builder setValue(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      value_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string value = 3;</code>
     */
    public Builder clearValue() {
      
      value_ = getDefaultInstance().getValue();
      onChanged();
      return this;
    }
    /**
     * <code>string value = 3;</code>
     */
    public Builder setValueBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      value_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msgType_ = "";
    /**
     * <code>string msgType = 4;</code>
     */
    public java.lang.String getMsgType() {
      java.lang.Object ref = msgType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msgType = 4;</code>
     */
    public com.google.protobuf.ByteString
        getMsgTypeBytes() {
      java.lang.Object ref = msgType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msgType = 4;</code>
     */
    public Builder setMsgType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msgType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msgType = 4;</code>
     */
    public Builder clearMsgType() {
      
      msgType_ = getDefaultInstance().getMsgType();
      onChanged();
      return this;
    }
    /**
     * <code>string msgType = 4;</code>
     */
    public Builder setMsgTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msgType_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msgText_ = "";
    /**
     * <code>string msgText = 5;</code>
     */
    public java.lang.String getMsgText() {
      java.lang.Object ref = msgText_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgText_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msgText = 5;</code>
     */
    public com.google.protobuf.ByteString
        getMsgTextBytes() {
      java.lang.Object ref = msgText_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgText_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msgText = 5;</code>
     */
    public Builder setMsgText(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msgText_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msgText = 5;</code>
     */
    public Builder clearMsgText() {
      
      msgText_ = getDefaultInstance().getMsgText();
      onChanged();
      return this;
    }
    /**
     * <code>string msgText = 5;</code>
     */
    public Builder setMsgTextBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msgText_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object msgTip_ = "";
    /**
     * <code>string msgTip = 6;</code>
     */
    public java.lang.String getMsgTip() {
      java.lang.Object ref = msgTip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msgTip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msgTip = 6;</code>
     */
    public com.google.protobuf.ByteString
        getMsgTipBytes() {
      java.lang.Object ref = msgTip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msgTip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msgTip = 6;</code>
     */
    public Builder setMsgTip(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msgTip_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msgTip = 6;</code>
     */
    public Builder clearMsgTip() {
      
      msgTip_ = getDefaultInstance().getMsgTip();
      onChanged();
      return this;
    }
    /**
     * <code>string msgTip = 6;</code>
     */
    public Builder setMsgTipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msgTip_ = value;
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


    // @@protoc_insertion_point(builder_scope:dictionary.MessageText)
  }

  // @@protoc_insertion_point(class_scope:dictionary.MessageText)
  private static final org.spin.grpc.util.MessageText DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.MessageText();
  }

  public static org.spin.grpc.util.MessageText getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageText>
      PARSER = new com.google.protobuf.AbstractParser<MessageText>() {
    public MessageText parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MessageText(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MessageText> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageText> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.MessageText getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
