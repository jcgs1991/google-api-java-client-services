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

package com.google.api.services.androidpublisher.model;

/**
 * A permission used by this APK.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExternallyHostedApkUsesPermission extends com.google.api.client.json.GenericJson {

  /**
   * Optionally, the maximum SDK version for which the permission is required.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxSdkVersion;

  /**
   * The name of the permission requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optionally, the maximum SDK version for which the permission is required.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxSdkVersion() {
    return maxSdkVersion;
  }

  /**
   * Optionally, the maximum SDK version for which the permission is required.
   * @param maxSdkVersion maxSdkVersion or {@code null} for none
   */
  public ExternallyHostedApkUsesPermission setMaxSdkVersion(java.lang.Integer maxSdkVersion) {
    this.maxSdkVersion = maxSdkVersion;
    return this;
  }

  /**
   * The name of the permission requested.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the permission requested.
   * @param name name or {@code null} for none
   */
  public ExternallyHostedApkUsesPermission setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public ExternallyHostedApkUsesPermission set(String fieldName, Object value) {
    return (ExternallyHostedApkUsesPermission) super.set(fieldName, value);
  }

  @Override
  public ExternallyHostedApkUsesPermission clone() {
    return (ExternallyHostedApkUsesPermission) super.clone();
  }

}