/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.remotebuildexecution.v2.model;

/**
 * ExecutedActionMetadata contains details about a completed execution.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Remote Build Execution API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class BuildBazelRemoteExecutionV2ExecutedActionMetadata extends com.google.api.client.json.GenericJson {

  /**
   * When the worker completed executing the action command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String executionCompletedTimestamp;

  /**
   * When the worker started executing the action command.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String executionStartTimestamp;

  /**
   * When the worker finished fetching action inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String inputFetchCompletedTimestamp;

  /**
   * When the worker started fetching action inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String inputFetchStartTimestamp;

  /**
   * When the worker finished uploading action outputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String outputUploadCompletedTimestamp;

  /**
   * When the worker started uploading action outputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String outputUploadStartTimestamp;

  /**
   * When was the action added to the queue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String queuedTimestamp;

  /**
   * The name of the worker which ran the execution.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String worker;

  /**
   * When the worker completed the action, including all stages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String workerCompletedTimestamp;

  /**
   * When the worker received the action.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String workerStartTimestamp;

  /**
   * When the worker completed executing the action command.
   * @return value or {@code null} for none
   */
  public String getExecutionCompletedTimestamp() {
    return executionCompletedTimestamp;
  }

  /**
   * When the worker completed executing the action command.
   * @param executionCompletedTimestamp executionCompletedTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setExecutionCompletedTimestamp(String executionCompletedTimestamp) {
    this.executionCompletedTimestamp = executionCompletedTimestamp;
    return this;
  }

  /**
   * When the worker started executing the action command.
   * @return value or {@code null} for none
   */
  public String getExecutionStartTimestamp() {
    return executionStartTimestamp;
  }

  /**
   * When the worker started executing the action command.
   * @param executionStartTimestamp executionStartTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setExecutionStartTimestamp(String executionStartTimestamp) {
    this.executionStartTimestamp = executionStartTimestamp;
    return this;
  }

  /**
   * When the worker finished fetching action inputs.
   * @return value or {@code null} for none
   */
  public String getInputFetchCompletedTimestamp() {
    return inputFetchCompletedTimestamp;
  }

  /**
   * When the worker finished fetching action inputs.
   * @param inputFetchCompletedTimestamp inputFetchCompletedTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setInputFetchCompletedTimestamp(String inputFetchCompletedTimestamp) {
    this.inputFetchCompletedTimestamp = inputFetchCompletedTimestamp;
    return this;
  }

  /**
   * When the worker started fetching action inputs.
   * @return value or {@code null} for none
   */
  public String getInputFetchStartTimestamp() {
    return inputFetchStartTimestamp;
  }

  /**
   * When the worker started fetching action inputs.
   * @param inputFetchStartTimestamp inputFetchStartTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setInputFetchStartTimestamp(String inputFetchStartTimestamp) {
    this.inputFetchStartTimestamp = inputFetchStartTimestamp;
    return this;
  }

  /**
   * When the worker finished uploading action outputs.
   * @return value or {@code null} for none
   */
  public String getOutputUploadCompletedTimestamp() {
    return outputUploadCompletedTimestamp;
  }

  /**
   * When the worker finished uploading action outputs.
   * @param outputUploadCompletedTimestamp outputUploadCompletedTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setOutputUploadCompletedTimestamp(String outputUploadCompletedTimestamp) {
    this.outputUploadCompletedTimestamp = outputUploadCompletedTimestamp;
    return this;
  }

  /**
   * When the worker started uploading action outputs.
   * @return value or {@code null} for none
   */
  public String getOutputUploadStartTimestamp() {
    return outputUploadStartTimestamp;
  }

  /**
   * When the worker started uploading action outputs.
   * @param outputUploadStartTimestamp outputUploadStartTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setOutputUploadStartTimestamp(String outputUploadStartTimestamp) {
    this.outputUploadStartTimestamp = outputUploadStartTimestamp;
    return this;
  }

  /**
   * When was the action added to the queue.
   * @return value or {@code null} for none
   */
  public String getQueuedTimestamp() {
    return queuedTimestamp;
  }

  /**
   * When was the action added to the queue.
   * @param queuedTimestamp queuedTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setQueuedTimestamp(String queuedTimestamp) {
    this.queuedTimestamp = queuedTimestamp;
    return this;
  }

  /**
   * The name of the worker which ran the execution.
   * @return value or {@code null} for none
   */
  public java.lang.String getWorker() {
    return worker;
  }

  /**
   * The name of the worker which ran the execution.
   * @param worker worker or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setWorker(java.lang.String worker) {
    this.worker = worker;
    return this;
  }

  /**
   * When the worker completed the action, including all stages.
   * @return value or {@code null} for none
   */
  public String getWorkerCompletedTimestamp() {
    return workerCompletedTimestamp;
  }

  /**
   * When the worker completed the action, including all stages.
   * @param workerCompletedTimestamp workerCompletedTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setWorkerCompletedTimestamp(String workerCompletedTimestamp) {
    this.workerCompletedTimestamp = workerCompletedTimestamp;
    return this;
  }

  /**
   * When the worker received the action.
   * @return value or {@code null} for none
   */
  public String getWorkerStartTimestamp() {
    return workerStartTimestamp;
  }

  /**
   * When the worker received the action.
   * @param workerStartTimestamp workerStartTimestamp or {@code null} for none
   */
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata setWorkerStartTimestamp(String workerStartTimestamp) {
    this.workerStartTimestamp = workerStartTimestamp;
    return this;
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata set(String fieldName, Object value) {
    return (BuildBazelRemoteExecutionV2ExecutedActionMetadata) super.set(fieldName, value);
  }

  @Override
  public BuildBazelRemoteExecutionV2ExecutedActionMetadata clone() {
    return (BuildBazelRemoteExecutionV2ExecutedActionMetadata) super.clone();
  }

}