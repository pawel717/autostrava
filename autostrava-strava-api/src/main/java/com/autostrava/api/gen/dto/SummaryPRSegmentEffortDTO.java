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
 * SummaryPRSegmentEffortDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SummaryPRSegmentEffortDTO   {
  @JsonProperty("pr_activity_id")
  private Long prActivityId;

  @JsonProperty("pr_elapsed_time")
  private Integer prElapsedTime;

  @JsonProperty("pr_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime prDate;

  @JsonProperty("effort_count")
  private Integer effortCount;

  public SummaryPRSegmentEffortDTO prActivityId(Long prActivityId) {
    this.prActivityId = prActivityId;
    return this;
  }

  /**
   * The unique identifier of the activity related to the PR effort.
   * @return prActivityId
  */
  @ApiModelProperty(value = "The unique identifier of the activity related to the PR effort.")


  public Long getPrActivityId() {
    return prActivityId;
  }

  public void setPrActivityId(Long prActivityId) {
    this.prActivityId = prActivityId;
  }

  public SummaryPRSegmentEffortDTO prElapsedTime(Integer prElapsedTime) {
    this.prElapsedTime = prElapsedTime;
    return this;
  }

  /**
   * The elapsed time ot the PR effort.
   * @return prElapsedTime
  */
  @ApiModelProperty(value = "The elapsed time ot the PR effort.")


  public Integer getPrElapsedTime() {
    return prElapsedTime;
  }

  public void setPrElapsedTime(Integer prElapsedTime) {
    this.prElapsedTime = prElapsedTime;
  }

  public SummaryPRSegmentEffortDTO prDate(OffsetDateTime prDate) {
    this.prDate = prDate;
    return this;
  }

  /**
   * The time at which the PR effort was started.
   * @return prDate
  */
  @ApiModelProperty(value = "The time at which the PR effort was started.")

  @Valid

  public OffsetDateTime getPrDate() {
    return prDate;
  }

  public void setPrDate(OffsetDateTime prDate) {
    this.prDate = prDate;
  }

  public SummaryPRSegmentEffortDTO effortCount(Integer effortCount) {
    this.effortCount = effortCount;
    return this;
  }

  /**
   * Number of efforts by the authenticated athlete on this segment.
   * @return effortCount
  */
  @ApiModelProperty(value = "Number of efforts by the authenticated athlete on this segment.")


  public Integer getEffortCount() {
    return effortCount;
  }

  public void setEffortCount(Integer effortCount) {
    this.effortCount = effortCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryPRSegmentEffortDTO summaryPRSegmentEffort = (SummaryPRSegmentEffortDTO) o;
    return Objects.equals(this.prActivityId, summaryPRSegmentEffort.prActivityId) &&
        Objects.equals(this.prElapsedTime, summaryPRSegmentEffort.prElapsedTime) &&
        Objects.equals(this.prDate, summaryPRSegmentEffort.prDate) &&
        Objects.equals(this.effortCount, summaryPRSegmentEffort.effortCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prActivityId, prElapsedTime, prDate, effortCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryPRSegmentEffortDTO {\n");
    
    sb.append("    prActivityId: ").append(toIndentedString(prActivityId)).append("\n");
    sb.append("    prElapsedTime: ").append(toIndentedString(prElapsedTime)).append("\n");
    sb.append("    prDate: ").append(toIndentedString(prDate)).append("\n");
    sb.append("    effortCount: ").append(toIndentedString(effortCount)).append("\n");
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

