package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.PolylineMapDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedSegmentAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedSegmentAllOfDTO   {
  @JsonProperty("created_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @JsonProperty("total_elevation_gain")
  private Float totalElevationGain;

  @JsonProperty("map")
  private PolylineMapDTO map;

  @JsonProperty("effort_count")
  private Integer effortCount;

  @JsonProperty("athlete_count")
  private Integer athleteCount;

  @JsonProperty("hazardous")
  private Boolean hazardous;

  @JsonProperty("star_count")
  private Integer starCount;

  public DetailedSegmentAllOfDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the segment was created.
   * @return createdAt
  */
  @ApiModelProperty(value = "The time at which the segment was created.")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public DetailedSegmentAllOfDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time at which the segment was last updated.
   * @return updatedAt
  */
  @ApiModelProperty(value = "The time at which the segment was last updated.")

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public DetailedSegmentAllOfDTO totalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
    return this;
  }

  /**
   * The segment's total elevation gain.
   * @return totalElevationGain
  */
  @ApiModelProperty(value = "The segment's total elevation gain.")


  public Float getTotalElevationGain() {
    return totalElevationGain;
  }

  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }

  public DetailedSegmentAllOfDTO map(PolylineMapDTO map) {
    this.map = map;
    return this;
  }

  /**
   * Get map
   * @return map
  */
  @ApiModelProperty(value = "")

  @Valid

  public PolylineMapDTO getMap() {
    return map;
  }

  public void setMap(PolylineMapDTO map) {
    this.map = map;
  }

  public DetailedSegmentAllOfDTO effortCount(Integer effortCount) {
    this.effortCount = effortCount;
    return this;
  }

  /**
   * The total number of efforts for this segment
   * @return effortCount
  */
  @ApiModelProperty(value = "The total number of efforts for this segment")


  public Integer getEffortCount() {
    return effortCount;
  }

  public void setEffortCount(Integer effortCount) {
    this.effortCount = effortCount;
  }

  public DetailedSegmentAllOfDTO athleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
    return this;
  }

  /**
   * The number of unique athletes who have an effort for this segment
   * @return athleteCount
  */
  @ApiModelProperty(value = "The number of unique athletes who have an effort for this segment")


  public Integer getAthleteCount() {
    return athleteCount;
  }

  public void setAthleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
  }

  public DetailedSegmentAllOfDTO hazardous(Boolean hazardous) {
    this.hazardous = hazardous;
    return this;
  }

  /**
   * Whether this segment is considered hazardous
   * @return hazardous
  */
  @ApiModelProperty(value = "Whether this segment is considered hazardous")


  public Boolean isHazardous() {
    return hazardous;
  }

  public void setHazardous(Boolean hazardous) {
    this.hazardous = hazardous;
  }

  public DetailedSegmentAllOfDTO starCount(Integer starCount) {
    this.starCount = starCount;
    return this;
  }

  /**
   * The number of stars for this segment
   * @return starCount
  */
  @ApiModelProperty(value = "The number of stars for this segment")


  public Integer getStarCount() {
    return starCount;
  }

  public void setStarCount(Integer starCount) {
    this.starCount = starCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedSegmentAllOfDTO detailedSegmentAllOf = (DetailedSegmentAllOfDTO) o;
    return Objects.equals(this.createdAt, detailedSegmentAllOf.createdAt) &&
        Objects.equals(this.updatedAt, detailedSegmentAllOf.updatedAt) &&
        Objects.equals(this.totalElevationGain, detailedSegmentAllOf.totalElevationGain) &&
        Objects.equals(this.map, detailedSegmentAllOf.map) &&
        Objects.equals(this.effortCount, detailedSegmentAllOf.effortCount) &&
        Objects.equals(this.athleteCount, detailedSegmentAllOf.athleteCount) &&
        Objects.equals(this.hazardous, detailedSegmentAllOf.hazardous) &&
        Objects.equals(this.starCount, detailedSegmentAllOf.starCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, updatedAt, totalElevationGain, map, effortCount, athleteCount, hazardous, starCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegmentAllOfDTO {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    effortCount: ").append(toIndentedString(effortCount)).append("\n");
    sb.append("    athleteCount: ").append(toIndentedString(athleteCount)).append("\n");
    sb.append("    hazardous: ").append(toIndentedString(hazardous)).append("\n");
    sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
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

