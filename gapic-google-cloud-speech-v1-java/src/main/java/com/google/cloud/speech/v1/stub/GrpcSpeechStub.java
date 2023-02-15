/*
 * Copyright 2022 Google LLC
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

package com.google.cloud.speech.v1.stub;

import static com.google.cloud.speech.v1.SpeechClient.ListOperationsPagedResponse;

import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.grpc.GrpcCallSettings;
import com.google.api.gax.grpc.GrpcStubCallableFactory;
import com.google.api.gax.rpc.BidiStreamingCallable;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.speech.v1.LongRunningRecognizeMetadata;
import com.google.cloud.speech.v1.LongRunningRecognizeRequest;
import com.google.cloud.speech.v1.LongRunningRecognizeResponse;
import com.google.cloud.speech.v1.RecognizeRequest;
import com.google.cloud.speech.v1.RecognizeResponse;
import com.google.cloud.speech.v1.StreamingRecognizeRequest;
import com.google.cloud.speech.v1.StreamingRecognizeResponse;
import com.google.common.collect.ImmutableMap;
import com.google.longrunning.GetOperationRequest;
import com.google.longrunning.ListOperationsRequest;
import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.GrpcOperationsStub;
import io.grpc.MethodDescriptor;
import io.grpc.protobuf.ProtoUtils;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * gRPC stub implementation for the Speech service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator-java")
public class GrpcSpeechStub extends SpeechStub {
  private static final MethodDescriptor<RecognizeRequest, RecognizeResponse>
      recognizeMethodDescriptor =
          MethodDescriptor.<RecognizeRequest, RecognizeResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.speech.v1.Speech/Recognize")
              .setRequestMarshaller(ProtoUtils.marshaller(RecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(RecognizeResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<LongRunningRecognizeRequest, Operation>
      longRunningRecognizeMethodDescriptor =
          MethodDescriptor.<LongRunningRecognizeRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.cloud.speech.v1.Speech/LongRunningRecognize")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(LongRunningRecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeMethodDescriptor =
          MethodDescriptor.<StreamingRecognizeRequest, StreamingRecognizeResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName("google.cloud.speech.v1.Speech/StreamingRecognize")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(StreamingRecognizeRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(StreamingRecognizeResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<ListOperationsRequest, ListOperationsResponse>
      listOperationsMethodDescriptor =
          MethodDescriptor.<ListOperationsRequest, ListOperationsResponse>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/ListOperations")
              .setRequestMarshaller(
                  ProtoUtils.marshaller(ListOperationsRequest.getDefaultInstance()))
              .setResponseMarshaller(
                  ProtoUtils.marshaller(ListOperationsResponse.getDefaultInstance()))
              .build();

  private static final MethodDescriptor<GetOperationRequest, Operation>
      getOperationMethodDescriptor =
          MethodDescriptor.<GetOperationRequest, Operation>newBuilder()
              .setType(MethodDescriptor.MethodType.UNARY)
              .setFullMethodName("google.longrunning.Operations/GetOperation")
              .setRequestMarshaller(ProtoUtils.marshaller(GetOperationRequest.getDefaultInstance()))
              .setResponseMarshaller(ProtoUtils.marshaller(Operation.getDefaultInstance()))
              .build();

  private final UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable;
  private final UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable;
  private final OperationCallable<
          LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata>
      longRunningRecognizeOperationCallable;
  private final BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeCallable;
  private final UnaryCallable<ListOperationsRequest, ListOperationsResponse> listOperationsCallable;
  private final UnaryCallable<ListOperationsRequest, ListOperationsPagedResponse>
      listOperationsPagedCallable;
  private final UnaryCallable<GetOperationRequest, Operation> getOperationCallable;

  private final BackgroundResource backgroundResources;
  private final GrpcOperationsStub operationsStub;
  private final GrpcStubCallableFactory callableFactory;

  public static final GrpcSpeechStub create(SpeechStubSettings settings) throws IOException {
    return new GrpcSpeechStub(settings, ClientContext.create(settings));
  }

  public static final GrpcSpeechStub create(ClientContext clientContext) throws IOException {
    return new GrpcSpeechStub(SpeechStubSettings.newBuilder().build(), clientContext);
  }

  public static final GrpcSpeechStub create(
      ClientContext clientContext, GrpcStubCallableFactory callableFactory) throws IOException {
    return new GrpcSpeechStub(
        SpeechStubSettings.newBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of GrpcSpeechStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcSpeechStub(SpeechStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new GrpcSpeechCallableFactory());
  }

  /**
   * Constructs an instance of GrpcSpeechStub, using the given settings. This is protected so that
   * it is easy to make a subclass, but otherwise, the static factory methods should be preferred.
   */
  protected GrpcSpeechStub(
      SpeechStubSettings settings,
      ClientContext clientContext,
      GrpcStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;
    this.operationsStub = GrpcOperationsStub.create(clientContext, callableFactory);

    GrpcCallSettings<ListOperationsRequest, ListOperationsResponse>
        listOperationsTransportSettings =
            GrpcCallSettings.<ListOperationsRequest, ListOperationsResponse>newBuilder()
                .setMethodDescriptor(listOperationsMethodDescriptor)
                .build();
    GrpcCallSettings<GetOperationRequest, Operation> getOperationTransportSettings =
        GrpcCallSettings.<GetOperationRequest, Operation>newBuilder()
            .setMethodDescriptor(getOperationMethodDescriptor)
            .setParamsExtractor(
                request -> {
                  ImmutableMap.Builder<String, String> params = ImmutableMap.builder();
                  params.put("name", String.valueOf(request.getName()));
                  return params.build();
                })
            .build();

    this.listOperationsCallable =
        callableFactory.createUnaryCallable(
            listOperationsTransportSettings, settings.listOperationsSettings(), clientContext);
    this.listOperationsPagedCallable =
        callableFactory.createPagedCallable(
            listOperationsTransportSettings, settings.listOperationsSettings(), clientContext);
    this.getOperationCallable =
        callableFactory.createUnaryCallable(
            getOperationTransportSettings, settings.getOperationSettings(), clientContext);

    GrpcCallSettings<RecognizeRequest, RecognizeResponse> recognizeTransportSettings =
        GrpcCallSettings.<RecognizeRequest, RecognizeResponse>newBuilder()
            .setMethodDescriptor(recognizeMethodDescriptor)
            .build();
    GrpcCallSettings<LongRunningRecognizeRequest, Operation> longRunningRecognizeTransportSettings =
        GrpcCallSettings.<LongRunningRecognizeRequest, Operation>newBuilder()
            .setMethodDescriptor(longRunningRecognizeMethodDescriptor)
            .build();
    GrpcCallSettings<StreamingRecognizeRequest, StreamingRecognizeResponse>
        streamingRecognizeTransportSettings =
            GrpcCallSettings.<StreamingRecognizeRequest, StreamingRecognizeResponse>newBuilder()
                .setMethodDescriptor(streamingRecognizeMethodDescriptor)
                .build();

    this.recognizeCallable =
        callableFactory.createUnaryCallable(
            recognizeTransportSettings, settings.recognizeSettings(), clientContext);
    this.longRunningRecognizeCallable =
        callableFactory.createUnaryCallable(
            longRunningRecognizeTransportSettings,
            settings.longRunningRecognizeSettings(),
            clientContext);
    this.longRunningRecognizeOperationCallable =
        callableFactory.createOperationCallable(
            longRunningRecognizeTransportSettings,
            settings.longRunningRecognizeOperationSettings(),
            clientContext,
            operationsStub);
    this.streamingRecognizeCallable =
        callableFactory.createBidiStreamingCallable(
            streamingRecognizeTransportSettings,
            settings.streamingRecognizeSettings(),
            clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @Override
  public UnaryCallable<RecognizeRequest, RecognizeResponse> recognizeCallable() {
    return recognizeCallable;
  }

  @Override
  public UnaryCallable<LongRunningRecognizeRequest, Operation> longRunningRecognizeCallable() {
    return longRunningRecognizeCallable;
  }

  @Override
  public OperationCallable<
          LongRunningRecognizeRequest, LongRunningRecognizeResponse, LongRunningRecognizeMetadata>
      longRunningRecognizeOperationCallable() {
    return longRunningRecognizeOperationCallable;
  }

  @Override
  public BidiStreamingCallable<StreamingRecognizeRequest, StreamingRecognizeResponse>
      streamingRecognizeCallable() {
    return streamingRecognizeCallable;
  }

  @Override
  public UnaryCallable<ListOperationsRequest, ListOperationsResponse> listOperationsCallable() {
    return listOperationsCallable;
  }

  @Override
  public UnaryCallable<ListOperationsRequest, ListOperationsPagedResponse>
      listOperationsPagedCallable() {
    return listOperationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetOperationRequest, Operation> getOperationCallable() {
    return getOperationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
