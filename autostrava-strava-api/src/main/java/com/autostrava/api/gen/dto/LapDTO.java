package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.MetaActivityDTO;
import com.autostrava.api.gen.dto.MetaAthleteDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * LapDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class LapDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("activity")
  private MetaActivityDTO activity;

  @JsonProperty("athlete")
  private MetaAthleteDTO athlete;

  @JsonProperty("average_cadence")
  private Float averageCadence;

  @JsonProperty("average_speed")
  private Float averageSpeed;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("elapsed_time")
  private Integer elapsedTime;

  @JsonProperty("start_index")
  private Integer startIndex;

  @JsonProperty("end_index")
  private Integer endIndex;

  @JsonProperty("lap_index")
  private Integer lapIndex;

  @JsonProperty("max_speed")
  private Float maxSpeed;

  @JsonProperty("moving_time")
  private Integer movingTime;

  @JsonProperty("name")
  private String name;

  @JsonProperty("pace_zone")
  private Integer paceZone;

  @JsonProperty("split")
  private Integer split;

  @JsonProperty("start_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("start_date_local")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDateLocal;

  @JsonProperty("total_elevation_gain")
  private Float totalElevationGain;

  public LapDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this lap
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of this lap")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LapDTO activity(MetaActivityDTO activity) {
    this.activity = activity;
    return this;
  }

  /**
   * Get activity
   * @return activity
  */
  @ApiModelProperty(value = "")

  @Valid

  public MetaActivityDTO getActivity() {
    return activity;
  }

  public void setActivity(MetaActivityDTO activity) {
    this.activity = activity;
  }

  public LapDTO athlete(MetaAthleteDTO athlete) {
    this.athlete = athlete;
    return this;
  }

  /**
   * Get athlete
   * @return athlete
  */
  @ApiModelProperty(value = "")

  @Valid

  public MetaAthleteDTO getAthlete() {
    return athlete;
  }

  public void setAthlete(MetaAthleteDTO athlete) {
    this.athlete = athlete;
  }

  public LapDTO averageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
    return this;
  }

  /**
   * The lap's average cadence
   * @return averageCadence
  */
  @ApiModelProperty(value = "The lap's average cadence")


  public Float getAverageCadence() {
    return averageCadence;
  }

  public void setAverageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
  }

  public LapDTO averageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
    return this;
  }

  /**
   * The lap's average speed
   * @return averageSpeed
  */
  @ApiModelProperty(value = "The lap's average speed")


  public Float getAverageSpeed() {
    return averageSpeed;
  }

  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }

  public LapDTO distance(Float distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The lap's distance, in meters
   * @return distance
  */
  @ApiModelProperty(value = "The lap's distance, in meters")


  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public LapDTO elapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
    return this;
  }

  /**
   * The lap's elapsed time, in seconds
   * @return elapsedTime
  */
  @ApiModelProperty(value = "The lap's elapsed time, in seconds")


  public Integer getElapsedTime() {
    return elapsedTime;
  }

  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }

  public LapDTO startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

  /**
   * The start index of this effort in its activity's stream
   * @return startIndex
  */
  @ApiModelProperty(value = "The start index of this effort in its activity's stream")


  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public LapDTO endIndex(Integer endIndex) {
    this.endIndex = endIndex;
    return this;
  }

  /**
   * The end index of this effort in its activity's stream
   * @return endIndex
  */
  @ApiModelProperty(value = "The end index of this effort in its activity's stream")


  public Integer getEndIndex() {
    return endIndex;
  }

  public void setEndIndex(Integer endIndex) {
    this.endIndex = endIndex;
  }

  public LapDTO lapIndex(Integer lapIndex) {
    this.lapIndex = lapIndex;
    return this;
  }

  /**
   * The index of this lap in the activity it belongs to
   * @return lapIndex
  */
  @ApiModelProperty(value = "The index of this lap in the activity it belongs to")


  public Integer getLapIndex() {
    return lapIndex;
  }

  public void setLapIndex(Integer lapIndex) {
    this.lapIndex = lapIndex;
  }

  public LapDTO maxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
    return this;
  }

  /**
   * The maximum speed of this lat, in meters per second
   * @return maxSpeed
  */
  @ApiModelProperty(value = "The maximum speed of this lat, in meters per second")


  public Float getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public LapDTO movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

  /**
   * The lap's moving time, in seconds
   * @return movingTime
  */
  @ApiModelProperty(value = "The lap's moving time, in seconds")


  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public LapDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the lap
   * @return name
  */
  @ApiModelProperty(value = "The name of the lap")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LapDTO paceZone(Integer paceZone) {
    this.paceZone = paceZone;
    return this;
  }

  /**
   * The athlete's pace zone during this lap
   * @return paceZone
  */
  @ApiModelProperty(value = "The athlete's pace zone during this lap")


  public Integer getPaceZone() {
    return paceZone;
  }

  public void setPaceZone(Integer paceZone) {
    this.paceZone = paceZone;
  }

  public LapDTO split(Integer split) {
    this.split = split;
    return this;
  }

  /**
   * Get split
   * @return split
  */
  @ApiModelProperty(value = "")


  public Integer getSplit() {
    return split;
  }

  public void setSplit(Integer split) {
    this.split = split;
  }

  public LapDTO startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * The time at which the lap was started.
   * @return startDate
  */
  @ApiModelProperty(value = "The time at which the lap was started.")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public LapDTO startDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
    return this;
  }

  /**
   * The time at which the lap was started in the local timezone.
   * @return startDateLocal
  */
  @ApiModelProperty(value = "The time at which the lap was started in the local timezone.")

  @Valid

  public OffsetDateTime getStartDateLocal() {
    return startDateLocal;
  }

  public void setStartDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }

  public LapDTO totalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
    return this;
  }

  /**
   * The elevation gain of this lap, in meters
   * @return totalElevationGain
  */
  @ApiModelProperty(value = "The elevation gain of this lap, in meters")


  public Float getTotalElevationGain() {
    return totalElevationGain;
  }

  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LapDTO lap = (LapDTO) o;
    return Objects.equals(this.id, lap.id) &&
        Objects.equals(this.activity, lap.activity) &&
        Objects.equals(this.athlete, lap.athlete) &&
        Objects.equals(this.averageCadence, lap.averageCadence) &&
        Objects.equals(this.averageSpeed, lap.averageSpeed) &&
        Objects.equals(this.distance, lap.distance) &&
        Objects.equals(this.elapsedTime, lap.elapsedTime) &&
        Objects.equals(this.startIndex, lap.startIndex) &&
        Objects.equals(this.endIndex, lap.endIndex) &&
        Objects.equals(this.lapIndex, lap.lapIndex) &&
        Objects.equals(this.maxSpeed, lap.maxSpeed) &&
        Objects.equals(this.movingTime, lap.movingTime) &&
        Objects.equals(this.name, lap.name) &&
        Objects.equals(this.paceZone, lap.paceZone) &&
        Objects.equals(this.split, lap.split) &&
        Objects.equals(this.startDate, lap.startDate) &&
        Objects.equals(this.startDateLocal, lap.startDateLocal) &&
        Objects.equals(this.totalElevationGain, lap.totalElevationGain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activity, athlete, averageCadence, averageSpeed, distance, elapsedTime, startIndex, endIndex, lapIndex, maxSpeed, movingTime, name, paceZone, split, startDate, startDateLocal, totalElevationGain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LapDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    averageCadence: ").append(toIndentedString(averageCadence)).append("\n");
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    lapIndex: ").append(toIndentedString(lapIndex)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    paceZone: ").append(toIndentedString(paceZone)).append("\n");
    sb.append("    split: ").append(toIndentedString(split)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
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

