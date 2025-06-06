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

public interface SplitReadStreamRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.storage.v1beta2.SplitReadStreamRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Name of the stream to split.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Name of the stream to split.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A value in the range (0.0, 1.0) that specifies the fractional point at
   * which the original stream should be split. The actual split point is
   * evaluated on pre-filtered rows, so if a filter is provided, then there is
   * no guarantee that the division of the rows between the new child streams
   * will be proportional to this fractional value. Additionally, because the
   * server-side unit for assigning data is collections of rows, this fraction
   * will always map to a data storage boundary on the server side.
   * </pre>
   *
   * <code>double fraction = 2;</code>
   *
   * @return The fraction.
   */
  double getFraction();
}
