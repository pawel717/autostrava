package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SplitDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SplitDTO   {
  @JsonProperty("average_speed")
  private Float averageSpeed;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("elapsed_time")
  private Integer elapsedTime;

  @JsonProperty("elevation_difference")
  private Float elevationDifference;

  @JsonProperty("pace_zone")
  private Integer paceZone;

  @JsonProperty("moving_time")
  private Integer movingTime;

  @JsonProperty("split")
  private Integer split;

  public SplitDTO averageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
    return this;
  }

  /**
   * The average speed of this split, in meters per second
   * @return averageSpeed
  */
  @ApiModelProperty(value = "The average speed of this split, in meters per second")


  public Float getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public SplitDTO distance(Float distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The distance of this split, in meters
   * @return distance
  */
  @ApiModelProperty(value = "The distance of this split, in meters")


  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public SplitDTO elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * The elapsed time of this split, in seconds
   * @return elapsedTime
  */
  @ApiModelProperty(value = "The elapsed time of this split, in seconds")


  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public SplitDTO elevationDifference(Float elevationDifference) {
    this.elevationDifference = elevationDifference;
    return this;
  }

  /**
   * The elevation difference of this split, in meters
   * @return elevationDifference
  */
  @ApiModelProperty(value = "The elevation difference of this split, in meters")


  public Float getElevationDifference() {
    return elevationDifference;
  }

  public void setElevationDifference(Float elevationDifference) {
    this.elevationDifference = elevationDifference;
  }

  public SplitDTO paceZone(Integer paceZone) {
    this.paceZone = paceZone;
    return this;
  }

  /**
   * The pacing zone of this split
   * @return paceZone
  */
  @ApiModelProperty(value = "The pacing zone of this split")


  public Integer getPaceZone() {
    return paceZone;
  }

  public void setPaceZone(Integer paceZone) {
    this.paceZone = paceZone;
  }

  public SplitDTO movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

  /**
   * The moving time of this split, in seconds
   * @return movingTime
  */
  @ApiModelProperty(value = "The moving time of this split, in seconds")


  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public SplitDTO split(Integer split) {
    this.split = split;
    return this;
  }

  /**
   * N/A
   * @return split
  */
  @ApiModelProperty(value = "N/A")


  public Integer getSplit() {
    return split;
  }

  public void setSplit(Integer split) {
    this.split = split;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SplitDTO split = (SplitDTO) o;
    return Objects.equals(this.averageSpeed, split.averageSpeed) &&
        Objects.equals(this.distance, split.distance) &&
        Objects.equals(this.elapsedTime, split.elapsedTime) &&
        Objects.equals(this.elevationDifference, split.elevationDifference) &&
        Objects.equals(this.paceZone, split.paceZone) &&
        Objects.equals(this.movingTime, split.movingTime) &&
        Objects.equals(this.split, split.split);
  }

  @Override
  public int hashCode() {
    return Objects.hash(averageSpeed, distance, elapsedTime, elevationDifference, paceZone, movingTime, split);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SplitDTO {\n");
    
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    elevationDifference: ").append(toIndentedString(elevationDifference)).append("\n");
    sb.append("    paceZone: ").append(toIndentedString(paceZone)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
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

