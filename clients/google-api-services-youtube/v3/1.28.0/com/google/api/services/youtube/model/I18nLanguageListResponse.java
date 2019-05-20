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

package com.google.api.services.youtube.model;

/**
 * Model definition for I18nLanguageListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the YouTube Data API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class I18nLanguageListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Etag of this resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Serialized EventId of the request which produced this response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String eventId;

  /**
   * A list of supported i18n languages. In this map, the i18n language ID is the map key, and its
   * value is the corresponding i18nLanguage resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<I18nLanguage> items;

  static {
    // hack to force ProGuard to consider I18nLanguage used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(I18nLanguage.class);
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#i18nLanguageListResponse".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The visitorId identifies the visitor.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String visitorId;

  /**
   * Etag of this resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * Etag of this resource.
   * @param etag etag or {@code null} for none
   */
  public I18nLanguageListResponse setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @return value or {@code null} for none
   */
  public java.lang.String getEventId() {
    return eventId;
  }

  /**
   * Serialized EventId of the request which produced this response.
   * @param eventId eventId or {@code null} for none
   */
  public I18nLanguageListResponse setEventId(java.lang.String eventId) {
    this.eventId = eventId;
    return this;
  }

  /**
   * A list of supported i18n languages. In this map, the i18n language ID is the map key, and its
   * value is the corresponding i18nLanguage resource.
   * @return value or {@code null} for none
   */
  public java.util.List<I18nLanguage> getItems() {
    return items;
  }

  /**
   * A list of supported i18n languages. In this map, the i18n language ID is the map key, and its
   * value is the corresponding i18nLanguage resource.
   * @param items items or {@code null} for none
   */
  public I18nLanguageListResponse setItems(java.util.List<I18nLanguage> items) {
    this.items = items;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#i18nLanguageListResponse".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string
   * "youtube#i18nLanguageListResponse".
   * @param kind kind or {@code null} for none
   */
  public I18nLanguageListResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The visitorId identifies the visitor.
   * @return value or {@code null} for none
   */
  public java.lang.String getVisitorId() {
    return visitorId;
  }

  /**
   * The visitorId identifies the visitor.
   * @param visitorId visitorId or {@code null} for none
   */
  public I18nLanguageListResponse setVisitorId(java.lang.String visitorId) {
    this.visitorId = visitorId;
    return this;
  }

  @Override
  public I18nLanguageListResponse set(String fieldName, Object value) {
    return (I18nLanguageListResponse) super.set(fieldName, value);
  }

  @Override
  public I18nLanguageListResponse clone() {
    return (I18nLanguageListResponse) super.clone();
  }

}