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

package com.google.api.services.doubleclicksearch.model;

/**
 * A message containing availability data relevant to DoubleClick Search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Search Ads 360 API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Availability extends com.google.api.client.json.GenericJson {

  /**
   * DS advertiser ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long advertiserId;

  /**
   * DS agency ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long agencyId;

  /**
   * The time by which all conversions have been uploaded, in epoch millis UTC.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger availabilityTimestamp;

  /**
   * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long segmentationId;

  /**
   * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity
   * name).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentationName;

  /**
   * The segmentation type that this availability is for (its default value is FLOODLIGHT).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String segmentationType;

  /**
   * DS advertiser ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAdvertiserId() {
    return advertiserId;
  }

  /**
   * DS advertiser ID.
   * @param advertiserId advertiserId or {@code null} for none
   */
  public Availability setAdvertiserId(java.lang.Long advertiserId) {
    this.advertiserId = advertiserId;
    return this;
  }

  /**
   * DS agency ID.
   * @return value or {@code null} for none
   */
  public java.lang.Long getAgencyId() {
    return agencyId;
  }

  /**
   * DS agency ID.
   * @param agencyId agencyId or {@code null} for none
   */
  public Availability setAgencyId(java.lang.Long agencyId) {
    this.agencyId = agencyId;
    return this;
  }

  /**
   * The time by which all conversions have been uploaded, in epoch millis UTC.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getAvailabilityTimestamp() {
    return availabilityTimestamp;
  }

  /**
   * The time by which all conversions have been uploaded, in epoch millis UTC.
   * @param availabilityTimestamp availabilityTimestamp or {@code null} for none
   */
  public Availability setAvailabilityTimestamp(java.math.BigInteger availabilityTimestamp) {
    this.availabilityTimestamp = availabilityTimestamp;
    return this;
  }

  /**
   * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
   * @return value or {@code null} for none
   */
  public java.lang.Long getSegmentationId() {
    return segmentationId;
  }

  /**
   * The numeric segmentation identifier (for example, DoubleClick Search Floodlight activity ID).
   * @param segmentationId segmentationId or {@code null} for none
   */
  public Availability setSegmentationId(java.lang.Long segmentationId) {
    this.segmentationId = segmentationId;
    return this;
  }

  /**
   * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity
   * name).
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentationName() {
    return segmentationName;
  }

  /**
   * The friendly segmentation identifier (for example, DoubleClick Search Floodlight activity
   * name).
   * @param segmentationName segmentationName or {@code null} for none
   */
  public Availability setSegmentationName(java.lang.String segmentationName) {
    this.segmentationName = segmentationName;
    return this;
  }

  /**
   * The segmentation type that this availability is for (its default value is FLOODLIGHT).
   * @return value or {@code null} for none
   */
  public java.lang.String getSegmentationType() {
    return segmentationType;
  }

  /**
   * The segmentation type that this availability is for (its default value is FLOODLIGHT).
   * @param segmentationType segmentationType or {@code null} for none
   */
  public Availability setSegmentationType(java.lang.String segmentationType) {
    this.segmentationType = segmentationType;
    return this;
  }

  @Override
  public Availability set(String fieldName, Object value) {
    return (Availability) super.set(fieldName, value);
  }

  @Override
  public Availability clone() {
    return (Availability) super.clone();
  }

}
