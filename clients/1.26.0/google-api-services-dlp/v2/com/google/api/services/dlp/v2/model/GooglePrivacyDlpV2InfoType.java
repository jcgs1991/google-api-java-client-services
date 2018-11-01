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

package com.google.api.services.dlp.v2.model;

/**
 * Type of information detected by the API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2InfoType extends com.google.api.client.json.GenericJson {

  /**
   * Name of the information type. Either a name of your choosing when creating a CustomInfoType, or
   * one of the names listed at https://cloud.google.com/dlp/docs/infotypes-reference when
   * specifying a built-in type. InfoType names should conform to the pattern [a-zA-Z0-9_]{1,64}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Name of the information type. Either a name of your choosing when creating a CustomInfoType, or
   * one of the names listed at https://cloud.google.com/dlp/docs/infotypes-reference when
   * specifying a built-in type. InfoType names should conform to the pattern [a-zA-Z0-9_]{1,64}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the information type. Either a name of your choosing when creating a CustomInfoType, or
   * one of the names listed at https://cloud.google.com/dlp/docs/infotypes-reference when
   * specifying a built-in type. InfoType names should conform to the pattern [a-zA-Z0-9_]{1,64}.
   * @param name name or {@code null} for none
   */
  public GooglePrivacyDlpV2InfoType setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2InfoType set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2InfoType) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2InfoType clone() {
    return (GooglePrivacyDlpV2InfoType) super.clone();
  }

}
