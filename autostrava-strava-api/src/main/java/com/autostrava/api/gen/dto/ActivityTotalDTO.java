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
 * A roll-up of metrics pertaining to a set of activities. Values are in seconds and meters.
 */
@ApiModel(description = "A roll-up of metrics pertaining to a set of activities. Values are in seconds and meters.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class ActivityTotalDTO   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("moving_time")
  private Integer movingTime;

  @JsonProperty("elapsed_time")
  private Integer elapsedTime;

  @JsonProperty("elevation_gain")
  private Float elevationGain;

  @JsonProperty("achievement_count")
  private Integer achievementCount;

  public ActivityTotalDTO count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of activities considered in this total.
   * @return count
  */
  @ApiModelProperty(value = "The number of activities considered in this total.")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ActivityTotalDTO distance(Float distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The total distance covered by the considered activities.
   * @return distance
  */
  @ApiModelProperty(value = "The total distance covered by the considered activities.")


  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public ActivityTotalDTO movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

  /**
   * The total moving time of the considered activities.
   * @return movingTime
  */
  @ApiModelProperty(value = "The total moving time of the considered activities.")


  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public ActivityTotalDTO elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * The total elapsed time of the considered activities.
   * @return elapsedTime
  */
  @ApiModelProperty(value = "The total elapsed time of the considered activities.")


  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public ActivityTotalDTO elevationGain(Float elevationGain) {
    this.elevationGain = elevationGain;
    return this;
  }

  /**
   * The total elevation gain of the considered activities.
   * @return elevationGain
  */
  @ApiModelProperty(value = "The total elevation gain of the considered activities.")


  public Float getElevationGain() {
    return elevationGain;
  }

  public void setElevationGain(Float elevationGain) {
    this.elevationGain = elevationGain;
  }

  public ActivityTotalDTO achievementCount(Integer achievementCount) {
    this.achievementCount = achievementCount;
    return this;
  }

  /**
   * The total number of achievements of the considered activities.
   * @return achievementCount
  */
  @ApiModelProperty(value = "The total number of achievements of the considered activities.")


  public Integer getAchievementCount() {
    return achievementCount;
  }

  public void setAchievementCount(Integer achievementCount) {
    this.achievementCount = achievementCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityTotalDTO activityTotal = (ActivityTotalDTO) o;
    return Objects.equals(this.count, activityTotal.count) &&
        Objects.equals(this.distance, activityTotal.distance) &&
        Objects.equals(this.movingTime, activityTotal.movingTime) &&
        Objects.equals(this.elapsedTime, activityTotal.elapsedTime) &&
        Objects.equals(this.elevationGain, activityTotal.elevationGain) &&
        Objects.equals(this.achievementCount, activityTotal.achievementCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, distance, movingTime, elapsedTime, elevationGain, achievementCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityTotalDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    elevationGain: ").append(toIndentedString(elevationGain)).append("\n");
    sb.append("    achievementCount: ").append(toIndentedString(achievementCount)).append("\n");
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

