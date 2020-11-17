package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SummarySegmentEffortDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SummarySegmentEffortDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("activity_id")
  private Long activityId;

  @JsonProperty("elapsed_time")
  private Integer elapsedTime;

  @JsonProperty("start_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("start_date_local")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateLocal;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("is_kom")
  private Boolean isKom;

  public SummarySegmentEffortDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this effort
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of this effort")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SummarySegmentEffortDTO activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The unique identifier of the activity related to this effort
   * @return activityId
  */
  @ApiModelProperty(value = "The unique identifier of the activity related to this effort")


  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public SummarySegmentEffortDTO elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * The effort's elapsed time
   * @return elapsedTime
  */
  @ApiModelProperty(value = "The effort's elapsed time")


  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public SummarySegmentEffortDTO startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The time at which the effort was started.
   * @return startDate
  */
  @ApiModelProperty(value = "The time at which the effort was started.")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public SummarySegmentEffortDTO startDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
    return this;
  }

  /**
   * The time at which the effort was started in the local timezone.
   * @return startDateLocal
  */
  @ApiModelProperty(value = "The time at which the effort was started in the local timezone.")

  @Valid

  public OffsetDateTime getStartDateLocal() {
    return startDateLocal;
  }

  public void setStartDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }

  public SummarySegmentEffortDTO distance(Float distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The effort's distance in meters
   * @return distance
  */
  @ApiModelProperty(value = "The effort's distance in meters")


  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public SummarySegmentEffortDTO isKom(Boolean isKom) {
    this.isKom = isKom;
    return this;
  }

  /**
   * Whether this effort is the current best on the leaderboard
   * @return isKom
  */
  @ApiModelProperty(value = "Whether this effort is the current best on the leaderboard")


  public Boolean isIsKom() {
    return isKom;
  }

  public void setIsKom(Boolean isKom) {
    this.isKom = isKom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarySegmentEffortDTO summarySegmentEffort = (SummarySegmentEffortDTO) o;
    return Objects.equals(this.id, summarySegmentEffort.id) &&
        Objects.equals(this.activityId, summarySegmentEffort.activityId) &&
        Objects.equals(this.elapsedTime, summarySegmentEffort.elapsedTime) &&
        Objects.equals(this.startDate, summarySegmentEffort.startDate) &&
        Objects.equals(this.startDateLocal, summarySegmentEffort.startDateLocal) &&
        Objects.equals(this.distance, summarySegmentEffort.distance) &&
        Objects.equals(this.isKom, summarySegmentEffort.isKom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, elapsedTime, startDate, startDateLocal, distance, isKom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarySegmentEffortDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    isKom: ").append(toIndentedString(isKom)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

