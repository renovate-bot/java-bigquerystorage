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

package com.google.cloud.bigquery.storage.v1.stub;

import com.google.api.core.ApiFunction;
import com.google.api.core.ObsoleteApi;
import com.google.api.gax.core.GaxProperties;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.GaxGrpcProperties;
import com.google.api.gax.grpc.GrpcTransportChannel;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.StreamingCallSettings;
import com.google.api.gax.rpc.StubSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.bigquery.storage.v1.AppendRowsRequest;
import com.google.cloud.bigquery.storage.v1.AppendRowsResponse;
import com.google.cloud.bigquery.storage.v1.BatchCommitWriteStreamsRequest;
import com.google.cloud.bigquery.storage.v1.BatchCommitWriteStreamsResponse;
import com.google.cloud.bigquery.storage.v1.CreateWriteStreamRequest;
import com.google.cloud.bigquery.storage.v1.FinalizeWriteStreamRequest;
import com.google.cloud.bigquery.storage.v1.FinalizeWriteStreamResponse;
import com.google.cloud.bigquery.storage.v1.FlushRowsRequest;
import com.google.cloud.bigquery.storage.v1.FlushRowsResponse;
import com.google.cloud.bigquery.storage.v1.GetWriteStreamRequest;
import com.google.cloud.bigquery.storage.v1.WriteStream;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Settings class to configure an instance of {@link BigQueryWriteStub}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (bigquerystorage.googleapis.com) and default port (443) are
 *       used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the
 * [RetrySettings](https://cloud.google.com/java/docs/reference/gax/latest/com.google.api.gax.retrying.RetrySettings)
 * of createWriteStream:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * BigQueryWriteStubSettings.Builder bigQueryWriteSettingsBuilder =
 *     BigQueryWriteStubSettings.newBuilder();
 * bigQueryWriteSettingsBuilder
 *     .createWriteStreamSettings()
 *     .setRetrySettings(
 *         bigQueryWriteSettingsBuilder
 *             .createWriteStreamSettings()
 *             .getRetrySettings()
 *             .toBuilder()
 *             .setInitialRetryDelayDuration(Duration.ofSeconds(1))
 *             .setInitialRpcTimeoutDuration(Duration.ofSeconds(5))
 *             .setMaxAttempts(5)
 *             .setMaxRetryDelayDuration(Duration.ofSeconds(30))
 *             .setMaxRpcTimeoutDuration(Duration.ofSeconds(60))
 *             .setRetryDelayMultiplier(1.3)
 *             .setRpcTimeoutMultiplier(1.5)
 *             .setTotalTimeoutDuration(Duration.ofSeconds(300))
 *             .build());
 * BigQueryWriteStubSettings bigQueryWriteSettings = bigQueryWriteSettingsBuilder.build();
 * }</pre>
 *
 * Please refer to the [Client Side Retry
 * Guide](https://github.com/googleapis/google-cloud-java/blob/main/docs/client_retries.md) for
 * additional support in setting retries.
 */
@Generated("by gapic-generator-java")
public class BigQueryWriteStubSettings extends StubSettings<BigQueryWriteStubSettings> {
  /** The default scopes of the service. */
  private static final ImmutableList<String> DEFAULT_SERVICE_SCOPES =
      ImmutableList.<String>builder()
          .add("https://www.googleapis.com/auth/bigquery")
          .add("https://www.googleapis.com/auth/bigquery.insertdata")
          .add("https://www.googleapis.com/auth/cloud-platform")
          .build();

  private final UnaryCallSettings<CreateWriteStreamRequest, WriteStream> createWriteStreamSettings;
  private final StreamingCallSettings<AppendRowsRequest, AppendRowsResponse> appendRowsSettings;
  private final UnaryCallSettings<GetWriteStreamRequest, WriteStream> getWriteStreamSettings;
  private final UnaryCallSettings<FinalizeWriteStreamRequest, FinalizeWriteStreamResponse>
      finalizeWriteStreamSettings;
  private final UnaryCallSettings<BatchCommitWriteStreamsRequest, BatchCommitWriteStreamsResponse>
      batchCommitWriteStreamsSettings;
  private final UnaryCallSettings<FlushRowsRequest, FlushRowsResponse> flushRowsSettings;

  /** Returns the object with the settings used for calls to createWriteStream. */
  public UnaryCallSettings<CreateWriteStreamRequest, WriteStream> createWriteStreamSettings() {
    return createWriteStreamSettings;
  }

  /** Returns the object with the settings used for calls to appendRows. */
  public StreamingCallSettings<AppendRowsRequest, AppendRowsResponse> appendRowsSettings() {
    return appendRowsSettings;
  }

  /** Returns the object with the settings used for calls to getWriteStream. */
  public UnaryCallSettings<GetWriteStreamRequest, WriteStream> getWriteStreamSettings() {
    return getWriteStreamSettings;
  }

  /** Returns the object with the settings used for calls to finalizeWriteStream. */
  public UnaryCallSettings<FinalizeWriteStreamRequest, FinalizeWriteStreamResponse>
      finalizeWriteStreamSettings() {
    return finalizeWriteStreamSettings;
  }

  /** Returns the object with the settings used for calls to batchCommitWriteStreams. */
  public UnaryCallSettings<BatchCommitWriteStreamsRequest, BatchCommitWriteStreamsResponse>
      batchCommitWriteStreamsSettings() {
    return batchCommitWriteStreamsSettings;
  }

  /** Returns the object with the settings used for calls to flushRows. */
  public UnaryCallSettings<FlushRowsRequest, FlushRowsResponse> flushRowsSettings() {
    return flushRowsSettings;
  }

  public BigQueryWriteStub createStub() throws IOException {
    if (getTransportChannelProvider()
        .getTransportName()
        .equals(GrpcTransportChannel.getGrpcTransportName())) {
      return GrpcBigQueryWriteStub.create(this);
    }
    throw new UnsupportedOperationException(
        String.format(
            "Transport not supported: %s", getTransportChannelProvider().getTransportName()));
  }

  /** Returns the default service name. */
  @Override
  public String getServiceName() {
    return "bigquerystorage";
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return InstantiatingExecutorProvider.newBuilder();
  }

  /** Returns the default service endpoint. */
  @ObsoleteApi("Use getEndpoint() instead")
  public static String getDefaultEndpoint() {
    return "bigquerystorage.googleapis.com:443";
  }

  /** Returns the default mTLS service endpoint. */
  public static String getDefaultMtlsEndpoint() {
    return "bigquerystorage.mtls.googleapis.com:443";
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return DEFAULT_SERVICE_SCOPES;
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return GoogleCredentialsProvider.newBuilder()
        .setScopesToApply(DEFAULT_SERVICE_SCOPES)
        .setUseJwtAccessWithScope(true);
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return InstantiatingGrpcChannelProvider.newBuilder()
        .setMaxInboundMessageSize(Integer.MAX_VALUE);
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return defaultGrpcTransportProviderBuilder().build();
  }

  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return ApiClientHeaderProvider.newBuilder()
        .setGeneratedLibToken(
            "gapic", GaxProperties.getLibraryVersion(BigQueryWriteStubSettings.class))
        .setTransportToken(
            GaxGrpcProperties.getGrpcTokenName(), GaxGrpcProperties.getGrpcVersion());
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected BigQueryWriteStubSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);

    createWriteStreamSettings = settingsBuilder.createWriteStreamSettings().build();
    appendRowsSettings = settingsBuilder.appendRowsSettings().build();
    getWriteStreamSettings = settingsBuilder.getWriteStreamSettings().build();
    finalizeWriteStreamSettings = settingsBuilder.finalizeWriteStreamSettings().build();
    batchCommitWriteStreamsSettings = settingsBuilder.batchCommitWriteStreamsSettings().build();
    flushRowsSettings = settingsBuilder.flushRowsSettings().build();
  }

  /** Builder for BigQueryWriteStubSettings. */
  public static class Builder extends StubSettings.Builder<BigQueryWriteStubSettings, Builder> {
    private final ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders;
    private final UnaryCallSettings.Builder<CreateWriteStreamRequest, WriteStream>
        createWriteStreamSettings;
    private final StreamingCallSettings.Builder<AppendRowsRequest, AppendRowsResponse>
        appendRowsSettings;
    private final UnaryCallSettings.Builder<GetWriteStreamRequest, WriteStream>
        getWriteStreamSettings;
    private final UnaryCallSettings.Builder<FinalizeWriteStreamRequest, FinalizeWriteStreamResponse>
        finalizeWriteStreamSettings;
    private final UnaryCallSettings.Builder<
            BatchCommitWriteStreamsRequest, BatchCommitWriteStreamsResponse>
        batchCommitWriteStreamsSettings;
    private final UnaryCallSettings.Builder<FlushRowsRequest, FlushRowsResponse> flushRowsSettings;
    private static final ImmutableMap<String, ImmutableSet<StatusCode.Code>>
        RETRYABLE_CODE_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, ImmutableSet<StatusCode.Code>> definitions =
          ImmutableMap.builder();
      definitions.put(
          "retry_policy_5_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED,
                  StatusCode.Code.UNAVAILABLE,
                  StatusCode.Code.RESOURCE_EXHAUSTED)));
      definitions.put(
          "retry_policy_3_codes",
          ImmutableSet.copyOf(Lists.<StatusCode.Code>newArrayList(StatusCode.Code.UNAVAILABLE)));
      definitions.put(
          "retry_policy_4_codes",
          ImmutableSet.copyOf(
              Lists.<StatusCode.Code>newArrayList(
                  StatusCode.Code.DEADLINE_EXCEEDED,
                  StatusCode.Code.UNAVAILABLE,
                  StatusCode.Code.RESOURCE_EXHAUSTED)));
      RETRYABLE_CODE_DEFINITIONS = definitions.build();
    }

    private static final ImmutableMap<String, RetrySettings> RETRY_PARAM_DEFINITIONS;

    static {
      ImmutableMap.Builder<String, RetrySettings> definitions = ImmutableMap.builder();
      RetrySettings settings = null;
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(10000L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(120000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(1200000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(1200000L))
              .setTotalTimeoutDuration(Duration.ofMillis(1200000L))
              .build();
      definitions.put("retry_policy_5_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(86400000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(86400000L))
              .setTotalTimeoutDuration(Duration.ofMillis(86400000L))
              .build();
      definitions.put("retry_policy_3_params", settings);
      settings =
          RetrySettings.newBuilder()
              .setInitialRetryDelayDuration(Duration.ofMillis(100L))
              .setRetryDelayMultiplier(1.3)
              .setMaxRetryDelayDuration(Duration.ofMillis(60000L))
              .setInitialRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setRpcTimeoutMultiplier(1.0)
              .setMaxRpcTimeoutDuration(Duration.ofMillis(600000L))
              .setTotalTimeoutDuration(Duration.ofMillis(600000L))
              .build();
      definitions.put("retry_policy_4_params", settings);
      RETRY_PARAM_DEFINITIONS = definitions.build();
    }

    protected Builder() {
      this(((ClientContext) null));
    }

    protected Builder(ClientContext clientContext) {
      super(clientContext);

      createWriteStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      appendRowsSettings = StreamingCallSettings.newBuilder();
      getWriteStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      finalizeWriteStreamSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      batchCommitWriteStreamsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();
      flushRowsSettings = UnaryCallSettings.newUnaryCallSettingsBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createWriteStreamSettings,
              getWriteStreamSettings,
              finalizeWriteStreamSettings,
              batchCommitWriteStreamsSettings,
              flushRowsSettings);
      initDefaults(this);
    }

    protected Builder(BigQueryWriteStubSettings settings) {
      super(settings);

      createWriteStreamSettings = settings.createWriteStreamSettings.toBuilder();
      appendRowsSettings = settings.appendRowsSettings.toBuilder();
      getWriteStreamSettings = settings.getWriteStreamSettings.toBuilder();
      finalizeWriteStreamSettings = settings.finalizeWriteStreamSettings.toBuilder();
      batchCommitWriteStreamsSettings = settings.batchCommitWriteStreamsSettings.toBuilder();
      flushRowsSettings = settings.flushRowsSettings.toBuilder();

      unaryMethodSettingsBuilders =
          ImmutableList.<UnaryCallSettings.Builder<?, ?>>of(
              createWriteStreamSettings,
              getWriteStreamSettings,
              finalizeWriteStreamSettings,
              batchCommitWriteStreamsSettings,
              flushRowsSettings);
    }

    private static Builder createDefault() {
      Builder builder = new Builder(((ClientContext) null));

      builder.setTransportChannelProvider(defaultTransportChannelProvider());
      builder.setCredentialsProvider(defaultCredentialsProviderBuilder().build());
      builder.setInternalHeaderProvider(defaultApiClientHeaderProviderBuilder().build());
      builder.setMtlsEndpoint(getDefaultMtlsEndpoint());
      builder.setSwitchToMtlsEndpointAllowed(true);

      return initDefaults(builder);
    }

    private static Builder initDefaults(Builder builder) {
      builder
          .createWriteStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_5_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_5_params"));

      builder
          .getWriteStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_4_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_4_params"));

      builder
          .finalizeWriteStreamSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_4_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_4_params"));

      builder
          .batchCommitWriteStreamsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_4_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_4_params"));

      builder
          .flushRowsSettings()
          .setRetryableCodes(RETRYABLE_CODE_DEFINITIONS.get("retry_policy_4_codes"))
          .setRetrySettings(RETRY_PARAM_DEFINITIONS.get("retry_policy_4_params"));

      return builder;
    }

    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) {
      super.applyToAllUnaryMethods(unaryMethodSettingsBuilders, settingsUpdater);
      return this;
    }

    public ImmutableList<UnaryCallSettings.Builder<?, ?>> unaryMethodSettingsBuilders() {
      return unaryMethodSettingsBuilders;
    }

    /** Returns the builder for the settings used for calls to createWriteStream. */
    public UnaryCallSettings.Builder<CreateWriteStreamRequest, WriteStream>
        createWriteStreamSettings() {
      return createWriteStreamSettings;
    }

    /** Returns the builder for the settings used for calls to appendRows. */
    public StreamingCallSettings.Builder<AppendRowsRequest, AppendRowsResponse>
        appendRowsSettings() {
      return appendRowsSettings;
    }

    /** Returns the builder for the settings used for calls to getWriteStream. */
    public UnaryCallSettings.Builder<GetWriteStreamRequest, WriteStream> getWriteStreamSettings() {
      return getWriteStreamSettings;
    }

    /** Returns the builder for the settings used for calls to finalizeWriteStream. */
    public UnaryCallSettings.Builder<FinalizeWriteStreamRequest, FinalizeWriteStreamResponse>
        finalizeWriteStreamSettings() {
      return finalizeWriteStreamSettings;
    }

    /** Returns the builder for the settings used for calls to batchCommitWriteStreams. */
    public UnaryCallSettings.Builder<
            BatchCommitWriteStreamsRequest, BatchCommitWriteStreamsResponse>
        batchCommitWriteStreamsSettings() {
      return batchCommitWriteStreamsSettings;
    }

    /** Returns the builder for the settings used for calls to flushRows. */
    public UnaryCallSettings.Builder<FlushRowsRequest, FlushRowsResponse> flushRowsSettings() {
      return flushRowsSettings;
    }

    @Override
    public BigQueryWriteStubSettings build() throws IOException {
      return new BigQueryWriteStubSettings(this);
    }
  }
}
