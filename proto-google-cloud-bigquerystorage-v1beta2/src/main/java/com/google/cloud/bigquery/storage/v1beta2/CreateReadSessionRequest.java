/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/bigquery/storage/v1beta2/storage.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.storage.v1beta2;

/**
 *
 *
 * <pre>
 * Request message for `CreateReadSession`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest}
 */
public final class CreateReadSessionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest)
    CreateReadSessionRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateReadSessionRequest.newBuilder() to construct.
  private CreateReadSessionRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateReadSessionRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateReadSessionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_CreateReadSessionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_CreateReadSessionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest.class,
            com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";

  /**
   *
   *
   * <pre>
   * Required. The request project that owns the session, in the form of
   * `projects/{project_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The request project that owns the session, in the form of
   * `projects/{project_id}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int READ_SESSION_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.storage.v1beta2.ReadSession readSession_;

  /**
   *
   *
   * <pre>
   * Required. Session to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the readSession field is set.
   */
  @java.lang.Override
  public boolean hasReadSession() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Session to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The readSession.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.ReadSession getReadSession() {
    return readSession_ == null
        ? com.google.cloud.bigquery.storage.v1beta2.ReadSession.getDefaultInstance()
        : readSession_;
  }

  /**
   *
   *
   * <pre>
   * Required. Session to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.ReadSessionOrBuilder getReadSessionOrBuilder() {
    return readSession_ == null
        ? com.google.cloud.bigquery.storage.v1beta2.ReadSession.getDefaultInstance()
        : readSession_;
  }

  public static final int MAX_STREAM_COUNT_FIELD_NUMBER = 3;
  private int maxStreamCount_ = 0;

  /**
   *
   *
   * <pre>
   * Max initial number of streams. If unset or zero, the server will
   * provide a value of streams so as to produce reasonable throughput. Must be
   * non-negative. The number of streams may be lower than the requested number,
   * depending on the amount parallelism that is reasonable for the table. Error
   * will be returned if the max count is greater than the current system
   * max limit of 1,000.
   *
   * Streams must be read starting from offset 0.
   * </pre>
   *
   * <code>int32 max_stream_count = 3;</code>
   *
   * @return The maxStreamCount.
   */
  @java.lang.Override
  public int getMaxStreamCount() {
    return maxStreamCount_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getReadSession());
    }
    if (maxStreamCount_ != 0) {
      output.writeInt32(3, maxStreamCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getReadSession());
    }
    if (maxStreamCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, maxStreamCount_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest other =
        (com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasReadSession() != other.hasReadSession()) return false;
    if (hasReadSession()) {
      if (!getReadSession().equals(other.getReadSession())) return false;
    }
    if (getMaxStreamCount() != other.getMaxStreamCount()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasReadSession()) {
      hash = (37 * hash) + READ_SESSION_FIELD_NUMBER;
      hash = (53 * hash) + getReadSession().hashCode();
    }
    hash = (37 * hash) + MAX_STREAM_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getMaxStreamCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Request message for `CreateReadSession`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest)
      com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_CreateReadSessionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_CreateReadSessionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest.class,
              com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getReadSessionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      readSession_ = null;
      if (readSessionBuilder_ != null) {
        readSessionBuilder_.dispose();
        readSessionBuilder_ = null;
      }
      maxStreamCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_CreateReadSessionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest build() {
      com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest buildPartial() {
      com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest result =
          new com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.readSession_ =
            readSessionBuilder_ == null ? readSession_ : readSessionBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxStreamCount_ = maxStreamCount_;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest other) {
      if (other
          == com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasReadSession()) {
        mergeReadSession(other.getReadSession());
      }
      if (other.getMaxStreamCount() != 0) {
        setMaxStreamCount(other.getMaxStreamCount());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getReadSessionFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                maxStreamCount_ = input.readInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object parent_ = "";

    /**
     *
     *
     * <pre>
     * Required. The request project that owns the session, in the form of
     * `projects/{project_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The request project that owns the session, in the form of
     * `projects/{project_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The request project that owns the session, in the form of
     * `projects/{project_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The request project that owns the session, in the form of
     * `projects/{project_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The request project that owns the session, in the form of
     * `projects/{project_id}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.bigquery.storage.v1beta2.ReadSession readSession_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1beta2.ReadSession,
            com.google.cloud.bigquery.storage.v1beta2.ReadSession.Builder,
            com.google.cloud.bigquery.storage.v1beta2.ReadSessionOrBuilder>
        readSessionBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the readSession field is set.
     */
    public boolean hasReadSession() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The readSession.
     */
    public com.google.cloud.bigquery.storage.v1beta2.ReadSession getReadSession() {
      if (readSessionBuilder_ == null) {
        return readSession_ == null
            ? com.google.cloud.bigquery.storage.v1beta2.ReadSession.getDefaultInstance()
            : readSession_;
      } else {
        return readSessionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReadSession(com.google.cloud.bigquery.storage.v1beta2.ReadSession value) {
      if (readSessionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        readSession_ = value;
      } else {
        readSessionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setReadSession(
        com.google.cloud.bigquery.storage.v1beta2.ReadSession.Builder builderForValue) {
      if (readSessionBuilder_ == null) {
        readSession_ = builderForValue.build();
      } else {
        readSessionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeReadSession(com.google.cloud.bigquery.storage.v1beta2.ReadSession value) {
      if (readSessionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && readSession_ != null
            && readSession_
                != com.google.cloud.bigquery.storage.v1beta2.ReadSession.getDefaultInstance()) {
          getReadSessionBuilder().mergeFrom(value);
        } else {
          readSession_ = value;
        }
      } else {
        readSessionBuilder_.mergeFrom(value);
      }
      if (readSession_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearReadSession() {
      bitField0_ = (bitField0_ & ~0x00000002);
      readSession_ = null;
      if (readSessionBuilder_ != null) {
        readSessionBuilder_.dispose();
        readSessionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.storage.v1beta2.ReadSession.Builder getReadSessionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getReadSessionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.bigquery.storage.v1beta2.ReadSessionOrBuilder
        getReadSessionOrBuilder() {
      if (readSessionBuilder_ != null) {
        return readSessionBuilder_.getMessageOrBuilder();
      } else {
        return readSession_ == null
            ? com.google.cloud.bigquery.storage.v1beta2.ReadSession.getDefaultInstance()
            : readSession_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Session to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1beta2.ReadSession read_session = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.storage.v1beta2.ReadSession,
            com.google.cloud.bigquery.storage.v1beta2.ReadSession.Builder,
            com.google.cloud.bigquery.storage.v1beta2.ReadSessionOrBuilder>
        getReadSessionFieldBuilder() {
      if (readSessionBuilder_ == null) {
        readSessionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.storage.v1beta2.ReadSession,
                com.google.cloud.bigquery.storage.v1beta2.ReadSession.Builder,
                com.google.cloud.bigquery.storage.v1beta2.ReadSessionOrBuilder>(
                getReadSession(), getParentForChildren(), isClean());
        readSession_ = null;
      }
      return readSessionBuilder_;
    }

    private int maxStreamCount_;

    /**
     *
     *
     * <pre>
     * Max initial number of streams. If unset or zero, the server will
     * provide a value of streams so as to produce reasonable throughput. Must be
     * non-negative. The number of streams may be lower than the requested number,
     * depending on the amount parallelism that is reasonable for the table. Error
     * will be returned if the max count is greater than the current system
     * max limit of 1,000.
     *
     * Streams must be read starting from offset 0.
     * </pre>
     *
     * <code>int32 max_stream_count = 3;</code>
     *
     * @return The maxStreamCount.
     */
    @java.lang.Override
    public int getMaxStreamCount() {
      return maxStreamCount_;
    }

    /**
     *
     *
     * <pre>
     * Max initial number of streams. If unset or zero, the server will
     * provide a value of streams so as to produce reasonable throughput. Must be
     * non-negative. The number of streams may be lower than the requested number,
     * depending on the amount parallelism that is reasonable for the table. Error
     * will be returned if the max count is greater than the current system
     * max limit of 1,000.
     *
     * Streams must be read starting from offset 0.
     * </pre>
     *
     * <code>int32 max_stream_count = 3;</code>
     *
     * @param value The maxStreamCount to set.
     * @return This builder for chaining.
     */
    public Builder setMaxStreamCount(int value) {

      maxStreamCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Max initial number of streams. If unset or zero, the server will
     * provide a value of streams so as to produce reasonable throughput. Must be
     * non-negative. The number of streams may be lower than the requested number,
     * depending on the amount parallelism that is reasonable for the table. Error
     * will be returned if the max count is greater than the current system
     * max limit of 1,000.
     *
     * Streams must be read starting from offset 0.
     * </pre>
     *
     * <code>int32 max_stream_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxStreamCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxStreamCount_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest)
  private static final com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest();
  }

  public static com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateReadSessionRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateReadSessionRequest>() {
        @java.lang.Override
        public CreateReadSessionRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateReadSessionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateReadSessionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.CreateReadSessionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
