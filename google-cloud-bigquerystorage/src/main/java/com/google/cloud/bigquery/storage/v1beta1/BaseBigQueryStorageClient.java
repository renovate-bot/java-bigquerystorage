/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.bigquery.storage.v1beta1;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.ServerStreamingCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStub;
import com.google.cloud.bigquery.storage.v1beta1.stub.BigQueryStorageStubSettings;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: BigQuery storage API.
 *
 * <p>The BigQuery storage API can be used to read data stored in BigQuery.
 *
 * <p>The v1beta1 API is not yet officially deprecated, and will go through a full deprecation cycle
 * (https://cloud.google.com/products#product-launch-stages) before the service is turned down.
 * However, new code should use the v1 API going forward.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
 *   TableReferenceProto.TableReference tableReference =
 *       TableReferenceProto.TableReference.newBuilder().build();
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   int requestedStreams = 1017221410;
 *   Storage.ReadSession response =
 *       baseBigQueryStorageClient.createReadSession(tableReference, parent, requestedStreams);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the BaseBigQueryStorageClient object to clean up resources
 * such as threads. In the example above, try-with-resources is used, which automatically calls
 * close().
 *
 * <table>
 *    <caption>Methods</caption>
 *    <tr>
 *      <th>Method</th>
 *      <th>Description</th>
 *      <th>Method Variants</th>
 *    </tr>
 *    <tr>
 *      <td><p> CreateReadSession</td>
 *      <td><p> Creates a new read session. A read session divides the contents of a BigQuery table into one or more streams, which can then be used to read data from the table. The read session also specifies properties of the data to be read, such as a list of columns or a push-down filter describing the rows to be returned.
 * <p>  A particular row can be read by at most one stream. When the caller has reached the end of each stream in the session, then all the data in the table has been read.
 * <p>  Read sessions automatically expire 6 hours after they are created and do not require manual clean-up by the caller.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> createReadSession(TableReferenceProto.TableReference tableReference, ProjectName parent, int requestedStreams)
 *           <li><p> createReadSession(TableReferenceProto.TableReference tableReference, String parent, int requestedStreams)
 *           <li><p> createReadSession(Storage.CreateReadSessionRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> createReadSessionCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> ReadRows</td>
 *      <td><p> Reads rows from the table in the format prescribed by the read session. Each response contains one or more table rows, up to a maximum of 10 MiB per response; read requests which attempt to read individual rows larger than this will fail.
 * <p>  Each request also returns a set of stream statistics reflecting the estimated total number of rows in the read stream. This number is computed based on the total table size and the number of active streams in the read session, and may change as other streams continue to read data.</td>
 *      <td>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> readRowsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> BatchCreateReadSessionStreams</td>
 *      <td><p> Creates additional streams for a ReadSession. This API can be used to dynamically adjust the parallelism of a batch processing task upwards by adding additional workers.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> batchCreateReadSessionStreams(Storage.ReadSession session, int requestedStreams)
 *           <li><p> batchCreateReadSessionStreams(Storage.BatchCreateReadSessionStreamsRequest request)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> batchCreateReadSessionStreamsCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> FinalizeStream</td>
 *      <td><p> Causes a single stream in a ReadSession to gracefully stop. This API can be used to dynamically adjust the parallelism of a batch processing task downwards without losing data.
 * <p>  This API does not delete the stream -- it remains visible in the ReadSession, and any data processed by the stream is not released to other streams. However, no additional data will be assigned to the stream once this call completes. Callers must continue reading data on the stream until the end of the stream is reached so that data which has already been assigned to the stream will be processed.
 * <p>  This method will return an error if there are no other live streams in the Session, or if SplitReadStream() has been called on the given Stream.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> finalizeStream(Storage.FinalizeStreamRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> finalizeStream(Storage.Stream stream)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> finalizeStreamCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *    <tr>
 *      <td><p> SplitReadStream</td>
 *      <td><p> Splits a given read stream into two Streams. These streams are referred to as the primary and the residual of the split. The original stream can still be read from in the same manner as before. Both of the returned streams can also be read from, and the total rows return by both child streams will be the same as the rows read from the original stream.
 * <p>  Moreover, the two child streams will be allocated back to back in the original Stream. Concretely, it is guaranteed that for streams Original, Primary, and Residual, that Original[0-j] = Primary[0-j] and Original[j-n] = Residual[0-m] once the streams have been read to completion.
 * <p>  This method is guaranteed to be idempotent.</td>
 *      <td>
 *      <p>Request object method variants only take one parameter, a request object, which must be constructed before the call.</p>
 *      <ul>
 *           <li><p> splitReadStream(Storage.SplitReadStreamRequest request)
 *      </ul>
 *      <p>"Flattened" method variants have converted the fields of the request object into function parameters to enable multiple ways to call the same method.</p>
 *      <ul>
 *           <li><p> splitReadStream(Storage.Stream originalStream)
 *      </ul>
 *      <p>Callable method variants take no parameters and return an immutable API callable object, which can be used to initiate calls to the service.</p>
 *      <ul>
 *           <li><p> splitReadStreamCallable()
 *      </ul>
 *       </td>
 *    </tr>
 *  </table>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of BaseBigQueryStorageSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BaseBigQueryStorageSettings baseBigQueryStorageSettings =
 *     BaseBigQueryStorageSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * BaseBigQueryStorageClient baseBigQueryStorageClient =
 *     BaseBigQueryStorageClient.create(baseBigQueryStorageSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BaseBigQueryStorageSettings baseBigQueryStorageSettings =
 *     BaseBigQueryStorageSettings.newBuilder().setEndpoint(myEndpoint).build();
 * BaseBigQueryStorageClient baseBigQueryStorageClient =
 *     BaseBigQueryStorageClient.create(baseBigQueryStorageSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class BaseBigQueryStorageClient implements BackgroundResource {
  private final BaseBigQueryStorageSettings settings;
  private final BigQueryStorageStub stub;

  /** Constructs an instance of BaseBigQueryStorageClient with default settings. */
  public static final BaseBigQueryStorageClient create() throws IOException {
    return create(BaseBigQueryStorageSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of BaseBigQueryStorageClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final BaseBigQueryStorageClient create(BaseBigQueryStorageSettings settings)
      throws IOException {
    return new BaseBigQueryStorageClient(settings);
  }

  /**
   * Constructs an instance of BaseBigQueryStorageClient, using the given stub for making calls.
   * This is for advanced usage - prefer using create(BaseBigQueryStorageSettings).
   */
  public static final BaseBigQueryStorageClient create(BigQueryStorageStub stub) {
    return new BaseBigQueryStorageClient(stub);
  }

  /**
   * Constructs an instance of BaseBigQueryStorageClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected BaseBigQueryStorageClient(BaseBigQueryStorageSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((BigQueryStorageStubSettings) settings.getStubSettings()).createStub();
  }

  protected BaseBigQueryStorageClient(BigQueryStorageStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final BaseBigQueryStorageSettings getSettings() {
    return settings;
  }

  public BigQueryStorageStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new read session. A read session divides the contents of a BigQuery table into one or
   * more streams, which can then be used to read data from the table. The read session also
   * specifies properties of the data to be read, such as a list of columns or a push-down filter
   * describing the rows to be returned.
   *
   * <p>A particular row can be read by at most one stream. When the caller has reached the end of
   * each stream in the session, then all the data in the table has been read.
   *
   * <p>Read sessions automatically expire 6 hours after they are created and do not require manual
   * clean-up by the caller.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   TableReferenceProto.TableReference tableReference =
   *       TableReferenceProto.TableReference.newBuilder().build();
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   int requestedStreams = 1017221410;
   *   Storage.ReadSession response =
   *       baseBigQueryStorageClient.createReadSession(tableReference, parent, requestedStreams);
   * }
   * }</pre>
   *
   * @param tableReference Required. Reference to the table to read.
   * @param parent Required. String of the form `projects/{project_id}` indicating the project this
   *     ReadSession is associated with. This is the project that will be billed for usage.
   * @param requestedStreams Initial number of streams. If unset or 0, we will provide a value of
   *     streams so as to produce reasonable throughput. Must be non-negative. The number of streams
   *     may be lower than the requested number, depending on the amount parallelism that is
   *     reasonable for the table and the maximum amount of parallelism allowed by the system.
   *     <p>Streams must be read starting from offset 0.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Storage.ReadSession createReadSession(
      TableReferenceProto.TableReference tableReference, ProjectName parent, int requestedStreams) {
    Storage.CreateReadSessionRequest request =
        Storage.CreateReadSessionRequest.newBuilder()
            .setTableReference(tableReference)
            .setParent(parent == null ? null : parent.toString())
            .setRequestedStreams(requestedStreams)
            .build();
    return createReadSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new read session. A read session divides the contents of a BigQuery table into one or
   * more streams, which can then be used to read data from the table. The read session also
   * specifies properties of the data to be read, such as a list of columns or a push-down filter
   * describing the rows to be returned.
   *
   * <p>A particular row can be read by at most one stream. When the caller has reached the end of
   * each stream in the session, then all the data in the table has been read.
   *
   * <p>Read sessions automatically expire 6 hours after they are created and do not require manual
   * clean-up by the caller.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   TableReferenceProto.TableReference tableReference =
   *       TableReferenceProto.TableReference.newBuilder().build();
   *   String parent = ProjectName.of("[PROJECT]").toString();
   *   int requestedStreams = 1017221410;
   *   Storage.ReadSession response =
   *       baseBigQueryStorageClient.createReadSession(tableReference, parent, requestedStreams);
   * }
   * }</pre>
   *
   * @param tableReference Required. Reference to the table to read.
   * @param parent Required. String of the form `projects/{project_id}` indicating the project this
   *     ReadSession is associated with. This is the project that will be billed for usage.
   * @param requestedStreams Initial number of streams. If unset or 0, we will provide a value of
   *     streams so as to produce reasonable throughput. Must be non-negative. The number of streams
   *     may be lower than the requested number, depending on the amount parallelism that is
   *     reasonable for the table and the maximum amount of parallelism allowed by the system.
   *     <p>Streams must be read starting from offset 0.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Storage.ReadSession createReadSession(
      TableReferenceProto.TableReference tableReference, String parent, int requestedStreams) {
    Storage.CreateReadSessionRequest request =
        Storage.CreateReadSessionRequest.newBuilder()
            .setTableReference(tableReference)
            .setParent(parent)
            .setRequestedStreams(requestedStreams)
            .build();
    return createReadSession(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new read session. A read session divides the contents of a BigQuery table into one or
   * more streams, which can then be used to read data from the table. The read session also
   * specifies properties of the data to be read, such as a list of columns or a push-down filter
   * describing the rows to be returned.
   *
   * <p>A particular row can be read by at most one stream. When the caller has reached the end of
   * each stream in the session, then all the data in the table has been read.
   *
   * <p>Read sessions automatically expire 6 hours after they are created and do not require manual
   * clean-up by the caller.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.CreateReadSessionRequest request =
   *       Storage.CreateReadSessionRequest.newBuilder()
   *           .setTableReference(TableReferenceProto.TableReference.newBuilder().build())
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setTableModifiers(TableReferenceProto.TableModifiers.newBuilder().build())
   *           .setRequestedStreams(1017221410)
   *           .setReadOptions(ReadOptions.TableReadOptions.newBuilder().build())
   *           .setFormat(Storage.DataFormat.forNumber(0))
   *           .setShardingStrategy(Storage.ShardingStrategy.forNumber(0))
   *           .build();
   *   Storage.ReadSession response = baseBigQueryStorageClient.createReadSession(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Storage.ReadSession createReadSession(Storage.CreateReadSessionRequest request) {
    return createReadSessionCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new read session. A read session divides the contents of a BigQuery table into one or
   * more streams, which can then be used to read data from the table. The read session also
   * specifies properties of the data to be read, such as a list of columns or a push-down filter
   * describing the rows to be returned.
   *
   * <p>A particular row can be read by at most one stream. When the caller has reached the end of
   * each stream in the session, then all the data in the table has been read.
   *
   * <p>Read sessions automatically expire 6 hours after they are created and do not require manual
   * clean-up by the caller.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.CreateReadSessionRequest request =
   *       Storage.CreateReadSessionRequest.newBuilder()
   *           .setTableReference(TableReferenceProto.TableReference.newBuilder().build())
   *           .setParent(ProjectName.of("[PROJECT]").toString())
   *           .setTableModifiers(TableReferenceProto.TableModifiers.newBuilder().build())
   *           .setRequestedStreams(1017221410)
   *           .setReadOptions(ReadOptions.TableReadOptions.newBuilder().build())
   *           .setFormat(Storage.DataFormat.forNumber(0))
   *           .setShardingStrategy(Storage.ShardingStrategy.forNumber(0))
   *           .build();
   *   ApiFuture<Storage.ReadSession> future =
   *       baseBigQueryStorageClient.createReadSessionCallable().futureCall(request);
   *   // Do something.
   *   Storage.ReadSession response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<Storage.CreateReadSessionRequest, Storage.ReadSession>
      createReadSessionCallable() {
    return stub.createReadSessionCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Reads rows from the table in the format prescribed by the read session. Each response contains
   * one or more table rows, up to a maximum of 10 MiB per response; read requests which attempt to
   * read individual rows larger than this will fail.
   *
   * <p>Each request also returns a set of stream statistics reflecting the estimated total number
   * of rows in the read stream. This number is computed based on the total table size and the
   * number of active streams in the read session, and may change as other streams continue to read
   * data.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.ReadRowsRequest request =
   *       Storage.ReadRowsRequest.newBuilder()
   *           .setReadPosition(Storage.StreamPosition.newBuilder().build())
   *           .build();
   *   ServerStream<Storage.ReadRowsResponse> stream =
   *       baseBigQueryStorageClient.readRowsCallable().call(request);
   *   for (Storage.ReadRowsResponse response : stream) {
   *     // Do something when a response is received.
   *   }
   * }
   * }</pre>
   */
  public final ServerStreamingCallable<Storage.ReadRowsRequest, Storage.ReadRowsResponse>
      readRowsCallable() {
    return stub.readRowsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates additional streams for a ReadSession. This API can be used to dynamically adjust the
   * parallelism of a batch processing task upwards by adding additional workers.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.ReadSession session = Storage.ReadSession.newBuilder().build();
   *   int requestedStreams = 1017221410;
   *   Storage.BatchCreateReadSessionStreamsResponse response =
   *       baseBigQueryStorageClient.batchCreateReadSessionStreams(session, requestedStreams);
   * }
   * }</pre>
   *
   * @param session Required. Must be a non-expired session obtained from a call to
   *     CreateReadSession. Only the name field needs to be set.
   * @param requestedStreams Required. Number of new streams requested. Must be positive. Number of
   *     added streams may be less than this, see CreateReadSessionRequest for more information.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Storage.BatchCreateReadSessionStreamsResponse batchCreateReadSessionStreams(
      Storage.ReadSession session, int requestedStreams) {
    Storage.BatchCreateReadSessionStreamsRequest request =
        Storage.BatchCreateReadSessionStreamsRequest.newBuilder()
            .setSession(session)
            .setRequestedStreams(requestedStreams)
            .build();
    return batchCreateReadSessionStreams(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates additional streams for a ReadSession. This API can be used to dynamically adjust the
   * parallelism of a batch processing task upwards by adding additional workers.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.BatchCreateReadSessionStreamsRequest request =
   *       Storage.BatchCreateReadSessionStreamsRequest.newBuilder()
   *           .setSession(Storage.ReadSession.newBuilder().build())
   *           .setRequestedStreams(1017221410)
   *           .build();
   *   Storage.BatchCreateReadSessionStreamsResponse response =
   *       baseBigQueryStorageClient.batchCreateReadSessionStreams(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Storage.BatchCreateReadSessionStreamsResponse batchCreateReadSessionStreams(
      Storage.BatchCreateReadSessionStreamsRequest request) {
    return batchCreateReadSessionStreamsCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates additional streams for a ReadSession. This API can be used to dynamically adjust the
   * parallelism of a batch processing task upwards by adding additional workers.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.BatchCreateReadSessionStreamsRequest request =
   *       Storage.BatchCreateReadSessionStreamsRequest.newBuilder()
   *           .setSession(Storage.ReadSession.newBuilder().build())
   *           .setRequestedStreams(1017221410)
   *           .build();
   *   ApiFuture<Storage.BatchCreateReadSessionStreamsResponse> future =
   *       baseBigQueryStorageClient.batchCreateReadSessionStreamsCallable().futureCall(request);
   *   // Do something.
   *   Storage.BatchCreateReadSessionStreamsResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<
          Storage.BatchCreateReadSessionStreamsRequest,
          Storage.BatchCreateReadSessionStreamsResponse>
      batchCreateReadSessionStreamsCallable() {
    return stub.batchCreateReadSessionStreamsCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Causes a single stream in a ReadSession to gracefully stop. This API can be used to dynamically
   * adjust the parallelism of a batch processing task downwards without losing data.
   *
   * <p>This API does not delete the stream -- it remains visible in the ReadSession, and any data
   * processed by the stream is not released to other streams. However, no additional data will be
   * assigned to the stream once this call completes. Callers must continue reading data on the
   * stream until the end of the stream is reached so that data which has already been assigned to
   * the stream will be processed.
   *
   * <p>This method will return an error if there are no other live streams in the Session, or if
   * SplitReadStream() has been called on the given Stream.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.Stream stream = Storage.Stream.newBuilder().build();
   *   baseBigQueryStorageClient.finalizeStream(stream);
   * }
   * }</pre>
   *
   * @param stream Required. Stream to finalize.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void finalizeStream(Storage.Stream stream) {
    Storage.FinalizeStreamRequest request =
        Storage.FinalizeStreamRequest.newBuilder().setStream(stream).build();
    finalizeStream(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Causes a single stream in a ReadSession to gracefully stop. This API can be used to dynamically
   * adjust the parallelism of a batch processing task downwards without losing data.
   *
   * <p>This API does not delete the stream -- it remains visible in the ReadSession, and any data
   * processed by the stream is not released to other streams. However, no additional data will be
   * assigned to the stream once this call completes. Callers must continue reading data on the
   * stream until the end of the stream is reached so that data which has already been assigned to
   * the stream will be processed.
   *
   * <p>This method will return an error if there are no other live streams in the Session, or if
   * SplitReadStream() has been called on the given Stream.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.FinalizeStreamRequest request =
   *       Storage.FinalizeStreamRequest.newBuilder()
   *           .setStream(Storage.Stream.newBuilder().build())
   *           .build();
   *   baseBigQueryStorageClient.finalizeStream(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void finalizeStream(Storage.FinalizeStreamRequest request) {
    finalizeStreamCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Causes a single stream in a ReadSession to gracefully stop. This API can be used to dynamically
   * adjust the parallelism of a batch processing task downwards without losing data.
   *
   * <p>This API does not delete the stream -- it remains visible in the ReadSession, and any data
   * processed by the stream is not released to other streams. However, no additional data will be
   * assigned to the stream once this call completes. Callers must continue reading data on the
   * stream until the end of the stream is reached so that data which has already been assigned to
   * the stream will be processed.
   *
   * <p>This method will return an error if there are no other live streams in the Session, or if
   * SplitReadStream() has been called on the given Stream.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.FinalizeStreamRequest request =
   *       Storage.FinalizeStreamRequest.newBuilder()
   *           .setStream(Storage.Stream.newBuilder().build())
   *           .build();
   *   ApiFuture<Empty> future =
   *       baseBigQueryStorageClient.finalizeStreamCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<Storage.FinalizeStreamRequest, Empty> finalizeStreamCallable() {
    return stub.finalizeStreamCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Splits a given read stream into two Streams. These streams are referred to as the primary and
   * the residual of the split. The original stream can still be read from in the same manner as
   * before. Both of the returned streams can also be read from, and the total rows return by both
   * child streams will be the same as the rows read from the original stream.
   *
   * <p>Moreover, the two child streams will be allocated back to back in the original Stream.
   * Concretely, it is guaranteed that for streams Original, Primary, and Residual, that
   * Original[0-j] = Primary[0-j] and Original[j-n] = Residual[0-m] once the streams have been read
   * to completion.
   *
   * <p>This method is guaranteed to be idempotent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.Stream originalStream = Storage.Stream.newBuilder().build();
   *   Storage.SplitReadStreamResponse response =
   *       baseBigQueryStorageClient.splitReadStream(originalStream);
   * }
   * }</pre>
   *
   * @param originalStream Required. Stream to split.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Storage.SplitReadStreamResponse splitReadStream(Storage.Stream originalStream) {
    Storage.SplitReadStreamRequest request =
        Storage.SplitReadStreamRequest.newBuilder().setOriginalStream(originalStream).build();
    return splitReadStream(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Splits a given read stream into two Streams. These streams are referred to as the primary and
   * the residual of the split. The original stream can still be read from in the same manner as
   * before. Both of the returned streams can also be read from, and the total rows return by both
   * child streams will be the same as the rows read from the original stream.
   *
   * <p>Moreover, the two child streams will be allocated back to back in the original Stream.
   * Concretely, it is guaranteed that for streams Original, Primary, and Residual, that
   * Original[0-j] = Primary[0-j] and Original[j-n] = Residual[0-m] once the streams have been read
   * to completion.
   *
   * <p>This method is guaranteed to be idempotent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.SplitReadStreamRequest request =
   *       Storage.SplitReadStreamRequest.newBuilder()
   *           .setOriginalStream(Storage.Stream.newBuilder().build())
   *           .setFraction(-1653751294)
   *           .build();
   *   Storage.SplitReadStreamResponse response = baseBigQueryStorageClient.splitReadStream(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Storage.SplitReadStreamResponse splitReadStream(
      Storage.SplitReadStreamRequest request) {
    return splitReadStreamCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Splits a given read stream into two Streams. These streams are referred to as the primary and
   * the residual of the split. The original stream can still be read from in the same manner as
   * before. Both of the returned streams can also be read from, and the total rows return by both
   * child streams will be the same as the rows read from the original stream.
   *
   * <p>Moreover, the two child streams will be allocated back to back in the original Stream.
   * Concretely, it is guaranteed that for streams Original, Primary, and Residual, that
   * Original[0-j] = Primary[0-j] and Original[j-n] = Residual[0-m] once the streams have been read
   * to completion.
   *
   * <p>This method is guaranteed to be idempotent.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (BaseBigQueryStorageClient baseBigQueryStorageClient = BaseBigQueryStorageClient.create()) {
   *   Storage.SplitReadStreamRequest request =
   *       Storage.SplitReadStreamRequest.newBuilder()
   *           .setOriginalStream(Storage.Stream.newBuilder().build())
   *           .setFraction(-1653751294)
   *           .build();
   *   ApiFuture<Storage.SplitReadStreamResponse> future =
   *       baseBigQueryStorageClient.splitReadStreamCallable().futureCall(request);
   *   // Do something.
   *   Storage.SplitReadStreamResponse response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<Storage.SplitReadStreamRequest, Storage.SplitReadStreamResponse>
      splitReadStreamCallable() {
    return stub.splitReadStreamCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }
}
