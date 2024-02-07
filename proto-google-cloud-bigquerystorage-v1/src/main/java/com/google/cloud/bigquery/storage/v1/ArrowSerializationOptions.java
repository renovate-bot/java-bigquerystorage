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
// source: google/cloud/bigquery/storage/v1/arrow.proto

// Protobuf Java Version: 3.25.2
package com.google.cloud.bigquery.storage.v1;

/**
 *
 *
 * <pre>
 * Contains options specific to Arrow Serialization.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.storage.v1.ArrowSerializationOptions}
 */
public final class ArrowSerializationOptions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.storage.v1.ArrowSerializationOptions)
    ArrowSerializationOptionsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ArrowSerializationOptions.newBuilder() to construct.
  private ArrowSerializationOptions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ArrowSerializationOptions() {
    bufferCompression_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ArrowSerializationOptions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.storage.v1.ArrowProto
        .internal_static_google_cloud_bigquery_storage_v1_ArrowSerializationOptions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.storage.v1.ArrowProto
        .internal_static_google_cloud_bigquery_storage_v1_ArrowSerializationOptions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.class,
            com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Compression codec's supported by Arrow.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec}
   */
  public enum CompressionCodec implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * If unspecified no compression will be used.
     * </pre>
     *
     * <code>COMPRESSION_UNSPECIFIED = 0;</code>
     */
    COMPRESSION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * LZ4 Frame (https://github.com/lz4/lz4/blob/dev/doc/lz4_Frame_format.md)
     * </pre>
     *
     * <code>LZ4_FRAME = 1;</code>
     */
    LZ4_FRAME(1),
    /**
     *
     *
     * <pre>
     * Zstandard compression.
     * </pre>
     *
     * <code>ZSTD = 2;</code>
     */
    ZSTD(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * If unspecified no compression will be used.
     * </pre>
     *
     * <code>COMPRESSION_UNSPECIFIED = 0;</code>
     */
    public static final int COMPRESSION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * LZ4 Frame (https://github.com/lz4/lz4/blob/dev/doc/lz4_Frame_format.md)
     * </pre>
     *
     * <code>LZ4_FRAME = 1;</code>
     */
    public static final int LZ4_FRAME_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Zstandard compression.
     * </pre>
     *
     * <code>ZSTD = 2;</code>
     */
    public static final int ZSTD_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static CompressionCodec valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CompressionCodec forNumber(int value) {
      switch (value) {
        case 0:
          return COMPRESSION_UNSPECIFIED;
        case 1:
          return LZ4_FRAME;
        case 2:
          return ZSTD;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CompressionCodec> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CompressionCodec>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<CompressionCodec>() {
              public CompressionCodec findValueByNumber(int number) {
                return CompressionCodec.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final CompressionCodec[] VALUES = values();

    public static CompressionCodec valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CompressionCodec(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec)
  }

  public static final int BUFFER_COMPRESSION_FIELD_NUMBER = 2;
  private int bufferCompression_ = 0;
  /**
   *
   *
   * <pre>
   * The compression codec to use for Arrow buffers in serialized record
   * batches.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec buffer_compression = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for bufferCompression.
   */
  @java.lang.Override
  public int getBufferCompressionValue() {
    return bufferCompression_;
  }
  /**
   *
   *
   * <pre>
   * The compression codec to use for Arrow buffers in serialized record
   * batches.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec buffer_compression = 2;
   * </code>
   *
   * @return The bufferCompression.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec
      getBufferCompression() {
    com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec result =
        com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec.forNumber(
            bufferCompression_);
    return result == null
        ? com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec
            .UNRECOGNIZED
        : result;
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
    if (bufferCompression_
        != com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec
            .COMPRESSION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, bufferCompression_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bufferCompression_
        != com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec
            .COMPRESSION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, bufferCompression_);
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
    if (!(obj instanceof com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions other =
        (com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions) obj;

    if (bufferCompression_ != other.bufferCompression_) return false;
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
    hash = (37 * hash) + BUFFER_COMPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + bufferCompression_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions parseFrom(
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
      com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions prototype) {
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
   * Contains options specific to Arrow Serialization.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.storage.v1.ArrowSerializationOptions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.storage.v1.ArrowSerializationOptions)
      com.google.cloud.bigquery.storage.v1.ArrowSerializationOptionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.storage.v1.ArrowProto
          .internal_static_google_cloud_bigquery_storage_v1_ArrowSerializationOptions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.storage.v1.ArrowProto
          .internal_static_google_cloud_bigquery_storage_v1_ArrowSerializationOptions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.class,
              com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      bufferCompression_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.storage.v1.ArrowProto
          .internal_static_google_cloud_bigquery_storage_v1_ArrowSerializationOptions_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions
        getDefaultInstanceForType() {
      return com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions build() {
      com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions buildPartial() {
      com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions result =
          new com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bufferCompression_ = bufferCompression_;
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
      if (other instanceof com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions) {
        return mergeFrom((com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions other) {
      if (other
          == com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.getDefaultInstance())
        return this;
      if (other.bufferCompression_ != 0) {
        setBufferCompressionValue(other.getBufferCompressionValue());
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
            case 16:
              {
                bufferCompression_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 16
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

    private int bufferCompression_ = 0;
    /**
     *
     *
     * <pre>
     * The compression codec to use for Arrow buffers in serialized record
     * batches.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec buffer_compression = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for bufferCompression.
     */
    @java.lang.Override
    public int getBufferCompressionValue() {
      return bufferCompression_;
    }
    /**
     *
     *
     * <pre>
     * The compression codec to use for Arrow buffers in serialized record
     * batches.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec buffer_compression = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for bufferCompression to set.
     * @return This builder for chaining.
     */
    public Builder setBufferCompressionValue(int value) {
      bufferCompression_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The compression codec to use for Arrow buffers in serialized record
     * batches.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec buffer_compression = 2;
     * </code>
     *
     * @return The bufferCompression.
     */
    @java.lang.Override
    public com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec
        getBufferCompression() {
      com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec result =
          com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec.forNumber(
              bufferCompression_);
      return result == null
          ? com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The compression codec to use for Arrow buffers in serialized record
     * batches.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec buffer_compression = 2;
     * </code>
     *
     * @param value The bufferCompression to set.
     * @return This builder for chaining.
     */
    public Builder setBufferCompression(
        com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      bufferCompression_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The compression codec to use for Arrow buffers in serialized record
     * batches.
     * </pre>
     *
     * <code>
     * .google.cloud.bigquery.storage.v1.ArrowSerializationOptions.CompressionCodec buffer_compression = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBufferCompression() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bufferCompression_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.storage.v1.ArrowSerializationOptions)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.storage.v1.ArrowSerializationOptions)
  private static final com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions();
  }

  public static com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ArrowSerializationOptions> PARSER =
      new com.google.protobuf.AbstractParser<ArrowSerializationOptions>() {
        @java.lang.Override
        public ArrowSerializationOptions parsePartialFrom(
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

  public static com.google.protobuf.Parser<ArrowSerializationOptions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ArrowSerializationOptions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.storage.v1.ArrowSerializationOptions
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
