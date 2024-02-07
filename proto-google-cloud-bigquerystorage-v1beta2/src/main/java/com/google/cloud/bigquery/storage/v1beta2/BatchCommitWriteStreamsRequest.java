/*
 * Copyright 2024 Google LLC
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

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.storage.v1beta2;

/**
 *
 *
 * <pre>
 * Request message for `BatchCommitWriteStreams`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest}
 */
public final class BatchCommitWriteStreamsRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest)
    BatchCommitWriteStreamsRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchCommitWriteStreamsRequest.newBuilder() to construct.
  private BatchCommitWriteStreamsRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchCommitWriteStreamsRequest() {
    parent_ = "";
    writeStreams_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchCommitWriteStreamsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_BatchCommitWriteStreamsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1beta2.StorageProto
        .internal_static_google_cloud_bigquery_storage_v1beta2_BatchCommitWriteStreamsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest.class,
            com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. Parent table that all the streams should belong to, in the form
   * of `projects/{project}/datasets/{dataset}/tables/{table}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
   * Required. Parent table that all the streams should belong to, in the form
   * of `projects/{project}/datasets/{dataset}/tables/{table}`.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

  public static final int WRITE_STREAMS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList writeStreams_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. The group of streams that will be committed atomically.
   * </pre>
   *
   * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the writeStreams.
   */
  public com.google.protobuf.ProtocolStringList getWriteStreamsList() {
    return writeStreams_;
  }
  /**
   *
   *
   * <pre>
   * Required. The group of streams that will be committed atomically.
   * </pre>
   *
   * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of writeStreams.
   */
  public int getWriteStreamsCount() {
    return writeStreams_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. The group of streams that will be committed atomically.
   * </pre>
   *
   * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The writeStreams at the given index.
   */
  public java.lang.String getWriteStreams(int index) {
    return writeStreams_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. The group of streams that will be committed atomically.
   * </pre>
   *
   * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the writeStreams at the given index.
   */
  public com.google.protobuf.ByteString getWriteStreamsBytes(int index) {
    return writeStreams_.getByteString(index);
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
    for (int i = 0; i < writeStreams_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, writeStreams_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < writeStreams_.size(); i++) {
        dataSize += computeStringSizeNoTag(writeStreams_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getWriteStreamsList().size();
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
    if (!(obj
        instanceof com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest other =
        (com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getWriteStreamsList().equals(other.getWriteStreamsList())) return false;
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
    if (getWriteStreamsCount() > 0) {
      hash = (37 * hash) + WRITE_STREAMS_FIELD_NUMBER;
      hash = (53 * hash) + getWriteStreamsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest parseFrom(
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
      com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest prototype) {
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
   * Request message for `BatchCommitWriteStreams`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest)
      com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_BatchCommitWriteStreamsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_BatchCommitWriteStreamsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest.class,
              com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      writeStreams_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1beta2.StorageProto
          .internal_static_google_cloud_bigquery_storage_v1beta2_BatchCommitWriteStreamsRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest build() {
      com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest buildPartial() {
      com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest result =
          new com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        writeStreams_.makeImmutable();
        result.writeStreams_ = writeStreams_;
      }
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
      if (other
          instanceof com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest) {
        return mergeFrom(
            (com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest other) {
      if (other
          == com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
              .getDefaultInstance()) return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.writeStreams_.isEmpty()) {
        if (writeStreams_.isEmpty()) {
          writeStreams_ = other.writeStreams_;
          bitField0_ |= 0x00000002;
        } else {
          ensureWriteStreamsIsMutable();
          writeStreams_.addAll(other.writeStreams_);
        }
        onChanged();
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureWriteStreamsIsMutable();
                writeStreams_.add(s);
                break;
              } // case 18
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
     * Required. Parent table that all the streams should belong to, in the form
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Parent table that all the streams should belong to, in the form
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Parent table that all the streams should belong to, in the form
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Parent table that all the streams should belong to, in the form
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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
     * Required. Parent table that all the streams should belong to, in the form
     * of `projects/{project}/datasets/{dataset}/tables/{table}`.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED];</code>
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

    private com.google.protobuf.LazyStringArrayList writeStreams_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureWriteStreamsIsMutable() {
      if (!writeStreams_.isModifiable()) {
        writeStreams_ = new com.google.protobuf.LazyStringArrayList(writeStreams_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return A list containing the writeStreams.
     */
    public com.google.protobuf.ProtocolStringList getWriteStreamsList() {
      writeStreams_.makeImmutable();
      return writeStreams_;
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The count of writeStreams.
     */
    public int getWriteStreamsCount() {
      return writeStreams_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the element to return.
     * @return The writeStreams at the given index.
     */
    public java.lang.String getWriteStreams(int index) {
      return writeStreams_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the writeStreams at the given index.
     */
    public com.google.protobuf.ByteString getWriteStreamsBytes(int index) {
      return writeStreams_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index to set the value at.
     * @param value The writeStreams to set.
     * @return This builder for chaining.
     */
    public Builder setWriteStreams(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWriteStreamsIsMutable();
      writeStreams_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The writeStreams to add.
     * @return This builder for chaining.
     */
    public Builder addWriteStreams(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureWriteStreamsIsMutable();
      writeStreams_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param values The writeStreams to add.
     * @return This builder for chaining.
     */
    public Builder addAllWriteStreams(java.lang.Iterable<java.lang.String> values) {
      ensureWriteStreamsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, writeStreams_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWriteStreams() {
      writeStreams_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The group of streams that will be committed atomically.
     * </pre>
     *
     * <code>repeated string write_streams = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes of the writeStreams to add.
     * @return This builder for chaining.
     */
    public Builder addWriteStreamsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureWriteStreamsIsMutable();
      writeStreams_.add(value);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest)
  private static final com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest();
  }

  public static com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchCommitWriteStreamsRequest> PARSER =
      new com.google.protobuf.AbstractParser<BatchCommitWriteStreamsRequest>() {
        @java.lang.Override
        public BatchCommitWriteStreamsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchCommitWriteStreamsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchCommitWriteStreamsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1beta2.BatchCommitWriteStreamsRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
