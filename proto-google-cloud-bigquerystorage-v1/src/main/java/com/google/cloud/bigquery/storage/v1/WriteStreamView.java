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
// source: google/cloud/bigquery/storage/v1/stream.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.storage.v1;

/**
 *
 *
 * <pre>
 * WriteStreamView is a view enum that controls what details about a write
 * stream should be returned.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.bigquery.storage.v1.WriteStreamView}
 */
public enum WriteStreamView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default / unset value.
   * </pre>
   *
   * <code>WRITE_STREAM_VIEW_UNSPECIFIED = 0;</code>
   */
  WRITE_STREAM_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The BASIC projection returns basic metadata about a write stream.  The
   * basic view does not include schema information.  This is the default view
   * returned by GetWriteStream.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  BASIC(1),
  /**
   *
   *
   * <pre>
   * The FULL projection returns all available write stream metadata, including
   * the schema.  CreateWriteStream returns the full projection of write stream
   * metadata.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default / unset value.
   * </pre>
   *
   * <code>WRITE_STREAM_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int WRITE_STREAM_VIEW_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The BASIC projection returns basic metadata about a write stream.  The
   * basic view does not include schema information.  This is the default view
   * returned by GetWriteStream.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  public static final int BASIC_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The FULL projection returns all available write stream metadata, including
   * the schema.  CreateWriteStream returns the full projection of write stream
   * metadata.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  public static final int FULL_VALUE = 2;

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
  public static WriteStreamView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static WriteStreamView forNumber(int value) {
    switch (value) {
      case 0:
        return WRITE_STREAM_VIEW_UNSPECIFIED;
      case 1:
        return BASIC;
      case 2:
        return FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<WriteStreamView> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<WriteStreamView> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<WriteStreamView>() {
        public WriteStreamView findValueByNumber(int number) {
          return WriteStreamView.forNumber(number);
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
    return com.google.cloud.bigquery.storage.v1.StreamProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final WriteStreamView[] VALUES = values();

  public static WriteStreamView valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private WriteStreamView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.bigquery.storage.v1.WriteStreamView)
}
