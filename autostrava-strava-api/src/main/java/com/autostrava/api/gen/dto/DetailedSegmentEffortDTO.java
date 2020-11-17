package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.DetailedSegmentEffortAllOfDTO;
import com.autostrava.api.gen.dto.MetaActivityDTO;
import com.autostrava.api.gen.dto.MetaAthleteDTO;
import com.autostrava.api.gen.dto.SummarySegmentDTO;
import com.autostrava.api.gen.dto.SummarySegmentEffortDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedSegmentEffortDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedSegmentEffortDTO   {
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

  @JsonProperty("name")
  private String name;

  @JsonProperty("activity")
  private MetaActivityDTO activity;

  @JsonProperty("athlete")
  private MetaAthleteDTO athlete;

  @JsonProperty("moving_time")
  private Integer movingTime;

  @JsonProperty("start_index")
  private Integer startIndex;

  @JsonProperty("end_index")
  private Integer endIndex;

  @JsonProperty("average_cadence")
  private Float averageCadence;

  @JsonProperty("average_watts")
  private Float averageWatts;

  @JsonProperty("device_watts")
  private Boolean deviceWatts;

  @JsonProperty("average_heartrate")
  private Float averageHeartrate;

  @JsonProperty("max_heartrate")
  private Float maxHeartrate;

  @JsonProperty("segment")
  private SummarySegmentDTO segment;

  @JsonProperty("kom_rank")
  private Integer komRank;

  @JsonProperty("pr_rank")
  private Integer prRank;

  @JsonProperty("hidden")
  private Boolean hidden;

  public DetailedSegmentEffortDTO id(Long id) {
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

  public DetailedSegmentEffortDTO activityId(Long activityId) {
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

  public DetailedSegmentEffortDTO elapsedTime(Integer elapsedTime) {
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

  public DetailedSegmentEffortDTO startDate(OffsetDateTime startDate) {
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

  public DetailedSegmentEffortDTO startDateLocal(OffsetDateTime startDateLocal) {
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

  public DetailedSegmentEffortDTO distance(Float distance) {
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

  public DetailedSegmentEffortDTO isKom(Boolean isKom) {
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

  public DetailedSegmentEffortDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the segment on which this effort was performed
   * @return name
  */
  @ApiModelProperty(value = "The name of the segment on which this effort was performed")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedSegmentEffortDTO activity(MetaActivityDTO activity) {
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

  public DetailedSegmentEffortDTO athlete(MetaAthleteDTO athlete) {
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

  public DetailedSegmentEffortDTO movingTime(Integer movingTime) {
    this.movingTime = movingTime;
    return this;
  }

  /**
   * The effort's moving time
   * @return movingTime
  */
  @ApiModelProperty(value = "The effort's moving time")


  public Integer getMovingTime() {
    return movingTime;
  }

  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }

  public DetailedSegmentEffortDTO startIndex(Integer startIndex) {
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

  public DetailedSegmentEffortDTO endIndex(Integer endIndex) {
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

  public DetailedSegmentEffortDTO averageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
    return this;
  }

  /**
   * The effort's average cadence
   * @return averageCadence
  */
  @ApiModelProperty(value = "The effort's average cadence")


  public Float getAverageCadence() {
    return averageCadence;
  }

  public void setAverageCadence(Float averageCadence) {
    this.averageCadence = averageCadence;
  }

  public DetailedSegmentEffortDTO averageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
    return this;
  }

  /**
   * The average wattage of this effort
   * @return averageWatts
  */
  @ApiModelProperty(value = "The average wattage of this effort")


  public Float getAverageWatts() {
    return averageWatts;
  }

  public void setAverageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
  }

  public DetailedSegmentEffortDTO deviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
    return this;
  }

  /**
   * For riding efforts, whether the wattage was reported by a dedicated recording device
   * @return deviceWatts
  */
  @ApiModelProperty(value = "For riding efforts, whether the wattage was reported by a dedicated recording device")


  public Boolean isDeviceWatts() {
    return deviceWatts;
  }

  public void setDeviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
  }

  public DetailedSegmentEffortDTO averageHeartrate(Float averageHeartrate) {
    this.averageHeartrate = averageHeartrate;
    return this;
  }

  /**
   * The heart heart rate of the athlete during this effort
   * @return averageHeartrate
  */
  @ApiModelProperty(value = "The heart heart rate of the athlete during this effort")


  public Float getAverageHeartrate() {
    return averageHeartrate;
  }

  public void setAverageHeartrate(Float averageHeartrate) {
    this.averageHeartrate = averageHeartrate;
  }

  public DetailedSegmentEffortDTO maxHeartrate(Float maxHeartrate) {
    this.maxHeartrate = maxHeartrate;
    return this;
  }

  /**
   * The maximum heart rate of the athlete during this effort
   * @return maxHeartrate
  */
  @ApiModelProperty(value = "The maximum heart rate of the athlete during this effort")


  public Float getMaxHeartrate() {
    return maxHeartrate;
  }

  public void setMaxHeartrate(Float maxHeartrate) {
    this.maxHeartrate = maxHeartrate;
  }

  public DetailedSegmentEffortDTO segment(SummarySegmentDTO segment) {
    this.segment = segment;
    return this;
  }

  /**
   * Get segment
   * @return segment
  */
  @ApiModelProperty(value = "")

  @Valid

  public SummarySegmentDTO getSegment() {
    return segment;
  }

  public void setSegment(SummarySegmentDTO segment) {
    this.segment = segment;
  }

  public DetailedSegmentEffortDTO komRank(Integer komRank) {
    this.komRank = komRank;
    return this;
  }

  /**
   * The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload
   * minimum: 1
   * maximum: 10
   * @return komRank
  */
  @ApiModelProperty(value = "The rank of the effort on the global leaderboard if it belongs in the top 10 at the time of upload")

@Min(1) @Max(10) 
  public Integer getKomRank() {
    return komRank;
  }

  public void setKomRank(Integer komRank) {
    this.komRank = komRank;
  }

  public DetailedSegmentEffortDTO prRank(Integer prRank) {
    this.prRank = prRank;
    return this;
  }

  /**
   * The rank of the effort on the athlete's leaderboard if it belongs in the top 3 at the time of upload
   * minimum: 1
   * maximum: 3
   * @return prRank
  */
  @ApiModelProperty(value = "The rank of the effort on the athlete's leaderboard if it belongs in the top 3 at the time of upload")

@Min(1) @Max(3) 
  public Integer getPrRank() {
    return prRank;
  }

  public void setPrRank(Integer prRank) {
    this.prRank = prRank;
  }

  public DetailedSegmentEffortDTO hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

  /**
   * Whether this effort should be hidden when viewed within an activity
   * @return hidden
  */
  @ApiModelProperty(value = "Whether this effort should be hidden when viewed within an activity")


  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedSegmentEffortDTO detailedSegmentEffort = (DetailedSegmentEffortDTO) o;
    return Objects.equals(this.id, detailedSegmentEffort.id) &&
        Objects.equals(this.activityId, detailedSegmentEffort.activityId) &&
        Objects.equals(this.elapsedTime, detailedSegmentEffort.elapsedTime) &&
        Objects.equals(this.startDate, detailedSegmentEffort.startDate) &&
        Objects.equals(this.startDateLocal, detailedSegmentEffort.startDateLocal) &&
        Objects.equals(this.distance, detailedSegmentEffort.distance) &&
        Objects.equals(this.isKom, detailedSegmentEffort.isKom) &&
        Objects.equals(this.name, detailedSegmentEffort.name) &&
        Objects.equals(this.activity, detailedSegmentEffort.activity) &&
        Objects.equals(this.athlete, detailedSegmentEffort.athlete) &&
        Objects.equals(this.movingTime, detailedSegmentEffort.movingTime) &&
        Objects.equals(this.startIndex, detailedSegmentEffort.startIndex) &&
        Objects.equals(this.endIndex, detailedSegmentEffort.endIndex) &&
        Objects.equals(this.averageCadence, detailedSegmentEffort.averageCadence) &&
        Objects.equals(this.averageWatts, detailedSegmentEffort.averageWatts) &&
        Objects.equals(this.deviceWatts, detailedSegmentEffort.deviceWatts) &&
        Objects.equals(this.averageHeartrate, detailedSegmentEffort.averageHeartrate) &&
        Objects.equals(this.maxHeartrate, detailedSegmentEffort.maxHeartrate) &&
        Objects.equals(this.segment, detailedSegmentEffort.segment) &&
        Objects.equals(this.komRank, detailedSegmentEffort.komRank) &&
        Objects.equals(this.prRank, detailedSegmentEffort.prRank) &&
        Objects.equals(this.hidden, detailedSegmentEffort.hidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, elapsedTime, startDate, startDateLocal, distance, isKom, name, activity, athlete, movingTime, startIndex, endIndex, averageCadence, averageWatts, deviceWatts, averageHeartrate, maxHeartrate, segment, komRank, prRank, hidden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegmentEffortDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    isKom: ").append(toIndentedString(isKom)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activity: ").append(toIndentedString(activity)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    endIndex: ").append(toIndentedString(endIndex)).append("\n");
    sb.append("    averageCadence: ").append(toIndentedString(averageCadence)).append("\n");
    sb.append("    averageWatts: ").append(toIndentedString(averageWatts)).append("\n");
    sb.append("    deviceWatts: ").append(toIndentedString(deviceWatts)).append("\n");
    sb.append("    averageHeartrate: ").append(toIndentedString(averageHeartrate)).append("\n");
    sb.append("    maxHeartrate: ").append(toIndentedString(maxHeartrate)).append("\n");
    sb.append("    segment: ").append(toIndentedString(segment)).append("\n");
    sb.append("    komRank: ").append(toIndentedString(komRank)).append("\n");
    sb.append("    prRank: ").append(toIndentedString(prRank)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
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

