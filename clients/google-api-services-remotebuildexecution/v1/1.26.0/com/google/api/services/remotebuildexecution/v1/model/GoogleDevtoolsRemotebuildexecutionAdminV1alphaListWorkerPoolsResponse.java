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

package com.google.api.services.remotebuildexecution.v1.model;

/**
 * Model definition for GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse.
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
public final class GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse extends com.google.api.client.json.GenericJson {

  /**
   * The list of worker pools in a given instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool> workerPools;

  /**
   * The list of worker pools in a given instance.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool> getWorkerPools() {
    return workerPools;
  }

  /**
   * The list of worker pools in a given instance.
   * @param workerPools workerPools or {@code null} for none
   */
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse setWorkerPools(java.util.List<GoogleDevtoolsRemotebuildexecutionAdminV1alphaWorkerPool> workerPools) {
    this.workerPools = workerPools;
    return this;
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse set(String fieldName, Object value) {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse clone() {
    return (GoogleDevtoolsRemotebuildexecutionAdminV1alphaListWorkerPoolsResponse) super.clone();
  }

}