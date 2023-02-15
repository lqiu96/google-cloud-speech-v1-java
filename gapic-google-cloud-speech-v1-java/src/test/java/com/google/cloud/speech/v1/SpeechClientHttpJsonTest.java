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

package com.google.cloud.speech.v1;

import static com.google.cloud.speech.v1.SpeechClient.ListOperationsPagedResponse;

import com.google.api.gax.core.NoCredentialsProvider;
import com.google.api.gax.httpjson.GaxHttpJsonProperties;
import com.google.api.gax.httpjson.testing.MockHttpService;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ApiException;
import com.google.api.gax.rpc.ApiExceptionFactory;
import com.google.api.gax.rpc.InvalidArgumentException;
import com.google.api.gax.rpc.StatusCode;
import com.google.api.gax.rpc.testing.FakeStatusCode;
import com.google.cloud.speech.v1.stub.HttpJsonSpeechStub;
import com.google.common.collect.Lists;
import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.Any;
import com.google.protobuf.Duration;
import com.google.rpc.Status;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.annotation.Generated;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

@Generated("by gapic-generator-java")
public class SpeechClientHttpJsonTest {
  private static MockHttpService mockService;
  private static SpeechClient client;

  @BeforeClass
  public static void startStaticServer() throws IOException {
    mockService =
        new MockHttpService(
            HttpJsonSpeechStub.getMethodDescriptors(), SpeechSettings.getDefaultEndpoint());
    SpeechSettings settings =
        SpeechSettings.newHttpJsonBuilder()
            .setTransportChannelProvider(
                SpeechSettings.defaultHttpJsonTransportProviderBuilder()
                    .setHttpTransport(mockService)
                    .build())
            .setCredentialsProvider(NoCredentialsProvider.create())
            .build();
    client = SpeechClient.create(settings);
  }

  @AfterClass
  public static void stopServer() {
    client.close();
  }

  @Before
  public void setUp() {}

  @After
  public void tearDown() throws Exception {
    mockService.reset();
  }

  @Test
  public void recognizeTest() throws Exception {
    RecognizeResponse expectedResponse =
        RecognizeResponse.newBuilder()
            .addAllResults(new ArrayList<SpeechRecognitionResult>())
            .setTotalBilledTime(Duration.newBuilder().build())
            .setSpeechAdaptationInfo(SpeechAdaptationInfo.newBuilder().build())
            .setRequestId(37109963)
            .build();
    mockService.addResponse(expectedResponse);

    RecognitionConfig config = RecognitionConfig.newBuilder().build();
    RecognitionAudio audio = RecognitionAudio.newBuilder().build();

    RecognizeResponse actualResponse = client.recognize(config, audio);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void recognizeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecognitionConfig config = RecognitionConfig.newBuilder().build();
      RecognitionAudio audio = RecognitionAudio.newBuilder().build();
      client.recognize(config, audio);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void longRunningRecognizeTest() throws Exception {
    LongRunningRecognizeResponse expectedResponse =
        LongRunningRecognizeResponse.newBuilder()
            .addAllResults(new ArrayList<SpeechRecognitionResult>())
            .setTotalBilledTime(Duration.newBuilder().build())
            .setOutputConfig(TranscriptOutputConfig.newBuilder().build())
            .setOutputError(Status.newBuilder().build())
            .setSpeechAdaptationInfo(SpeechAdaptationInfo.newBuilder().build())
            .setRequestId(37109963)
            .build();
    Operation resultOperation =
        Operation.newBuilder()
            .setName("longRunningRecognizeTest")
            .setDone(true)
            .setResponse(Any.pack(expectedResponse))
            .build();
    mockService.addResponse(resultOperation);

    RecognitionConfig config = RecognitionConfig.newBuilder().build();
    RecognitionAudio audio = RecognitionAudio.newBuilder().build();

    LongRunningRecognizeResponse actualResponse =
        client.longRunningRecognizeAsync(config, audio).get();
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void longRunningRecognizeExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      RecognitionConfig config = RecognitionConfig.newBuilder().build();
      RecognitionAudio audio = RecognitionAudio.newBuilder().build();
      client.longRunningRecognizeAsync(config, audio).get();
      Assert.fail("No exception raised");
    } catch (ExecutionException e) {
    }
  }

  @Test
  public void streamingRecognizeUnsupportedMethodTest() throws Exception {
    // The streamingRecognize() method is not supported in REST transport.
    // This empty test is generated for technical reasons.
  }

  @Test
  public void listOperationsTest() throws Exception {
    Operation responsesElement = Operation.newBuilder().build();
    ListOperationsResponse expectedResponse =
        ListOperationsResponse.newBuilder()
            .setNextPageToken("")
            .addAllOperations(Arrays.asList(responsesElement))
            .build();
    mockService.addResponse(expectedResponse);

    String name = "name3373707";
    String filter = "filter-1274492040";

    ListOperationsPagedResponse pagedListResponse = client.listOperations(name, filter);

    List<Operation> resources = Lists.newArrayList(pagedListResponse.iterateAll());

    Assert.assertEquals(1, resources.size());
    Assert.assertEquals(expectedResponse.getOperationsList().get(0), resources.get(0));

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void listOperationsExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "name3373707";
      String filter = "filter-1274492040";
      client.listOperations(name, filter);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }

  @Test
  public void getOperationTest() throws Exception {
    Operation expectedResponse =
        Operation.newBuilder()
            .setName("name3373707")
            .setMetadata(Any.newBuilder().build())
            .setDone(true)
            .build();
    mockService.addResponse(expectedResponse);

    String name = "name-3525";

    Operation actualResponse = client.getOperation(name);
    Assert.assertEquals(expectedResponse, actualResponse);

    List<String> actualRequests = mockService.getRequestPaths();
    Assert.assertEquals(1, actualRequests.size());

    String apiClientHeaderKey =
        mockService
            .getRequestHeaders()
            .get(ApiClientHeaderProvider.getDefaultApiClientHeaderKey())
            .iterator()
            .next();
    Assert.assertTrue(
        GaxHttpJsonProperties.getDefaultApiClientHeaderPattern()
            .matcher(apiClientHeaderKey)
            .matches());
  }

  @Test
  public void getOperationExceptionTest() throws Exception {
    ApiException exception =
        ApiExceptionFactory.createException(
            new Exception(), FakeStatusCode.of(StatusCode.Code.INVALID_ARGUMENT), false);
    mockService.addException(exception);

    try {
      String name = "name-3525";
      client.getOperation(name);
      Assert.fail("No exception raised");
    } catch (InvalidArgumentException e) {
      // Expected exception.
    }
  }
}
