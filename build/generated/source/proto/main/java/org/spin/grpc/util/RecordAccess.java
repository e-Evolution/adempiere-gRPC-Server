// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access.proto

package org.spin.grpc.util;

/**
 * <pre>
 * Access for Record
 * </pre>
 *
 * Protobuf type {@code access.RecordAccess}
 */
public  final class RecordAccess extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:access.RecordAccess)
    RecordAccessOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RecordAccess.newBuilder() to construct.
  private RecordAccess(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RecordAccess() {
    tableName_ = "";
    recordId_ = 0;
    recordUuid_ = "";
    isExclude_ = false;
    isReadOnly_ = false;
    isDependentEntities_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RecordAccess(
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

            tableName_ = s;
            break;
          }
          case 16: {

            recordId_ = input.readInt32();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            recordUuid_ = s;
            break;
          }
          case 32: {

            isExclude_ = input.readBool();
            break;
          }
          case 40: {

            isReadOnly_ = input.readBool();
            break;
          }
          case 48: {

            isDependentEntities_ = input.readBool();
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
    return org.spin.grpc.util.ADempiereAccess.internal_static_access_RecordAccess_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.spin.grpc.util.ADempiereAccess.internal_static_access_RecordAccess_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.spin.grpc.util.RecordAccess.class, org.spin.grpc.util.RecordAccess.Builder.class);
  }

  public static final int TABLENAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object tableName_;
  /**
   * <code>string tableName = 1;</code>
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
   * <code>string tableName = 1;</code>
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

  public static final int RECORDID_FIELD_NUMBER = 2;
  private int recordId_;
  /**
   * <code>int32 recordId = 2;</code>
   */
  public int getRecordId() {
    return recordId_;
  }

  public static final int RECORDUUID_FIELD_NUMBER = 3;
  private volatile java.lang.Object recordUuid_;
  /**
   * <code>string recordUuid = 3;</code>
   */
  public java.lang.String getRecordUuid() {
    java.lang.Object ref = recordUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      recordUuid_ = s;
      return s;
    }
  }
  /**
   * <code>string recordUuid = 3;</code>
   */
  public com.google.protobuf.ByteString
      getRecordUuidBytes() {
    java.lang.Object ref = recordUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      recordUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ISEXCLUDE_FIELD_NUMBER = 4;
  private boolean isExclude_;
  /**
   * <code>bool isExclude = 4;</code>
   */
  public boolean getIsExclude() {
    return isExclude_;
  }

  public static final int ISREADONLY_FIELD_NUMBER = 5;
  private boolean isReadOnly_;
  /**
   * <code>bool isReadOnly = 5;</code>
   */
  public boolean getIsReadOnly() {
    return isReadOnly_;
  }

  public static final int ISDEPENDENTENTITIES_FIELD_NUMBER = 6;
  private boolean isDependentEntities_;
  /**
   * <code>bool isDependentEntities = 6;</code>
   */
  public boolean getIsDependentEntities() {
    return isDependentEntities_;
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
    if (!getTableNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    if (recordId_ != 0) {
      output.writeInt32(2, recordId_);
    }
    if (!getRecordUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, recordUuid_);
    }
    if (isExclude_ != false) {
      output.writeBool(4, isExclude_);
    }
    if (isReadOnly_ != false) {
      output.writeBool(5, isReadOnly_);
    }
    if (isDependentEntities_ != false) {
      output.writeBool(6, isDependentEntities_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTableNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
    }
    if (recordId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, recordId_);
    }
    if (!getRecordUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, recordUuid_);
    }
    if (isExclude_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isExclude_);
    }
    if (isReadOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isReadOnly_);
    }
    if (isDependentEntities_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isDependentEntities_);
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
    if (!(obj instanceof org.spin.grpc.util.RecordAccess)) {
      return super.equals(obj);
    }
    org.spin.grpc.util.RecordAccess other = (org.spin.grpc.util.RecordAccess) obj;

    boolean result = true;
    result = result && getTableName()
        .equals(other.getTableName());
    result = result && (getRecordId()
        == other.getRecordId());
    result = result && getRecordUuid()
        .equals(other.getRecordUuid());
    result = result && (getIsExclude()
        == other.getIsExclude());
    result = result && (getIsReadOnly()
        == other.getIsReadOnly());
    result = result && (getIsDependentEntities()
        == other.getIsDependentEntities());
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
    hash = (37 * hash) + TABLENAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    hash = (37 * hash) + RECORDID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordId();
    hash = (37 * hash) + RECORDUUID_FIELD_NUMBER;
    hash = (53 * hash) + getRecordUuid().hashCode();
    hash = (37 * hash) + ISEXCLUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsExclude());
    hash = (37 * hash) + ISREADONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsReadOnly());
    hash = (37 * hash) + ISDEPENDENTENTITIES_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDependentEntities());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.spin.grpc.util.RecordAccess parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.RecordAccess parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.RecordAccess parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.spin.grpc.util.RecordAccess parseFrom(
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
  public static Builder newBuilder(org.spin.grpc.util.RecordAccess prototype) {
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
   * Access for Record
   * </pre>
   *
   * Protobuf type {@code access.RecordAccess}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:access.RecordAccess)
      org.spin.grpc.util.RecordAccessOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.spin.grpc.util.ADempiereAccess.internal_static_access_RecordAccess_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.spin.grpc.util.ADempiereAccess.internal_static_access_RecordAccess_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.spin.grpc.util.RecordAccess.class, org.spin.grpc.util.RecordAccess.Builder.class);
    }

    // Construct using org.spin.grpc.util.RecordAccess.newBuilder()
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
      tableName_ = "";

      recordId_ = 0;

      recordUuid_ = "";

      isExclude_ = false;

      isReadOnly_ = false;

      isDependentEntities_ = false;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.spin.grpc.util.ADempiereAccess.internal_static_access_RecordAccess_descriptor;
    }

    public org.spin.grpc.util.RecordAccess getDefaultInstanceForType() {
      return org.spin.grpc.util.RecordAccess.getDefaultInstance();
    }

    public org.spin.grpc.util.RecordAccess build() {
      org.spin.grpc.util.RecordAccess result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public org.spin.grpc.util.RecordAccess buildPartial() {
      org.spin.grpc.util.RecordAccess result = new org.spin.grpc.util.RecordAccess(this);
      result.tableName_ = tableName_;
      result.recordId_ = recordId_;
      result.recordUuid_ = recordUuid_;
      result.isExclude_ = isExclude_;
      result.isReadOnly_ = isReadOnly_;
      result.isDependentEntities_ = isDependentEntities_;
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
      if (other instanceof org.spin.grpc.util.RecordAccess) {
        return mergeFrom((org.spin.grpc.util.RecordAccess)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.spin.grpc.util.RecordAccess other) {
      if (other == org.spin.grpc.util.RecordAccess.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        onChanged();
      }
      if (other.getRecordId() != 0) {
        setRecordId(other.getRecordId());
      }
      if (!other.getRecordUuid().isEmpty()) {
        recordUuid_ = other.recordUuid_;
        onChanged();
      }
      if (other.getIsExclude() != false) {
        setIsExclude(other.getIsExclude());
      }
      if (other.getIsReadOnly() != false) {
        setIsReadOnly(other.getIsReadOnly());
      }
      if (other.getIsDependentEntities() != false) {
        setIsDependentEntities(other.getIsDependentEntities());
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
      org.spin.grpc.util.RecordAccess parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.spin.grpc.util.RecordAccess) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object tableName_ = "";
    /**
     * <code>string tableName = 1;</code>
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
     * <code>string tableName = 1;</code>
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
     * <code>string tableName = 1;</code>
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
     * <code>string tableName = 1;</code>
     */
    public Builder clearTableName() {
      
      tableName_ = getDefaultInstance().getTableName();
      onChanged();
      return this;
    }
    /**
     * <code>string tableName = 1;</code>
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

    private int recordId_ ;
    /**
     * <code>int32 recordId = 2;</code>
     */
    public int getRecordId() {
      return recordId_;
    }
    /**
     * <code>int32 recordId = 2;</code>
     */
    public Builder setRecordId(int value) {
      
      recordId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 recordId = 2;</code>
     */
    public Builder clearRecordId() {
      
      recordId_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object recordUuid_ = "";
    /**
     * <code>string recordUuid = 3;</code>
     */
    public java.lang.String getRecordUuid() {
      java.lang.Object ref = recordUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        recordUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string recordUuid = 3;</code>
     */
    public com.google.protobuf.ByteString
        getRecordUuidBytes() {
      java.lang.Object ref = recordUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        recordUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string recordUuid = 3;</code>
     */
    public Builder setRecordUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      recordUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string recordUuid = 3;</code>
     */
    public Builder clearRecordUuid() {
      
      recordUuid_ = getDefaultInstance().getRecordUuid();
      onChanged();
      return this;
    }
    /**
     * <code>string recordUuid = 3;</code>
     */
    public Builder setRecordUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      recordUuid_ = value;
      onChanged();
      return this;
    }

    private boolean isExclude_ ;
    /**
     * <code>bool isExclude = 4;</code>
     */
    public boolean getIsExclude() {
      return isExclude_;
    }
    /**
     * <code>bool isExclude = 4;</code>
     */
    public Builder setIsExclude(boolean value) {
      
      isExclude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isExclude = 4;</code>
     */
    public Builder clearIsExclude() {
      
      isExclude_ = false;
      onChanged();
      return this;
    }

    private boolean isReadOnly_ ;
    /**
     * <code>bool isReadOnly = 5;</code>
     */
    public boolean getIsReadOnly() {
      return isReadOnly_;
    }
    /**
     * <code>bool isReadOnly = 5;</code>
     */
    public Builder setIsReadOnly(boolean value) {
      
      isReadOnly_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isReadOnly = 5;</code>
     */
    public Builder clearIsReadOnly() {
      
      isReadOnly_ = false;
      onChanged();
      return this;
    }

    private boolean isDependentEntities_ ;
    /**
     * <code>bool isDependentEntities = 6;</code>
     */
    public boolean getIsDependentEntities() {
      return isDependentEntities_;
    }
    /**
     * <code>bool isDependentEntities = 6;</code>
     */
    public Builder setIsDependentEntities(boolean value) {
      
      isDependentEntities_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool isDependentEntities = 6;</code>
     */
    public Builder clearIsDependentEntities() {
      
      isDependentEntities_ = false;
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


    // @@protoc_insertion_point(builder_scope:access.RecordAccess)
  }

  // @@protoc_insertion_point(class_scope:access.RecordAccess)
  private static final org.spin.grpc.util.RecordAccess DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.spin.grpc.util.RecordAccess();
  }

  public static org.spin.grpc.util.RecordAccess getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RecordAccess>
      PARSER = new com.google.protobuf.AbstractParser<RecordAccess>() {
    public RecordAccess parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RecordAccess(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RecordAccess> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RecordAccess> getParserForType() {
    return PARSER;
  }

  public org.spin.grpc.util.RecordAccess getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

