// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/cloud_speech.proto

package com.google.cloud.speech.v1;

public interface SpeechAdaptationInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.SpeechAdaptationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether there was a timeout when applying speech adaptation. If true,
   * adaptation had no effect in the response transcript.
   * </pre>
   *
   * <code>bool adaptation_timeout = 1;</code>
   * @return The adaptationTimeout.
   */
  boolean getAdaptationTimeout();

  /**
   * <pre>
   * If set, returns a message specifying which part of the speech adaptation
   * request timed out.
   * </pre>
   *
   * <code>string timeout_message = 4;</code>
   * @return The timeoutMessage.
   */
  java.lang.String getTimeoutMessage();
  /**
   * <pre>
   * If set, returns a message specifying which part of the speech adaptation
   * request timed out.
   * </pre>
   *
   * <code>string timeout_message = 4;</code>
   * @return The bytes for timeoutMessage.
   */
  com.google.protobuf.ByteString
      getTimeoutMessageBytes();
}
