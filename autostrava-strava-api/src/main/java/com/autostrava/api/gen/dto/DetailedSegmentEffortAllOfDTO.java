package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.MetaActivityDTO;
import com.autostrava.api.gen.dto.MetaAthleteDTO;
import com.autostrava.api.gen.dto.SummarySegmentDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedSegmentEffortAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedSegmentEffortAllOfDTO   {
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

  public DetailedSegmentEffortAllOfDTO name(String name) {
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

  public DetailedSegmentEffortAllOfDTO activity(MetaActivityDTO activity) {
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

  public DetailedSegmentEffortAllOfDTO athlete(MetaAthleteDTO athlete) {
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

  public DetailedSegmentEffortAllOfDTO movingTime(Integer movingTime) {
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

  public DetailedSegmentEffortAllOfDTO startIndex(Integer startIndex) {
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

  public DetailedSegmentEffortAllOfDTO endIndex(Integer endIndex) {
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

  public DetailedSegmentEffortAllOfDTO averageCadence(Float averageCadence) {
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

  public DetailedSegmentEffortAllOfDTO averageWatts(Float averageWatts) {
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

  public DetailedSegmentEffortAllOfDTO deviceWatts(Boolean deviceWatts) {
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

  public DetailedSegmentEffortAllOfDTO averageHeartrate(Float averageHeartrate) {
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

  public DetailedSegmentEffortAllOfDTO maxHeartrate(Float maxHeartrate) {
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

  public DetailedSegmentEffortAllOfDTO segment(SummarySegmentDTO segment) {
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

  public DetailedSegmentEffortAllOfDTO komRank(Integer komRank) {
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

  public DetailedSegmentEffortAllOfDTO prRank(Integer prRank) {
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

  public DetailedSegmentEffortAllOfDTO hidden(Boolean hidden) {
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
    DetailedSegmentEffortAllOfDTO detailedSegmentEffortAllOf = (DetailedSegmentEffortAllOfDTO) o;
    return Objects.equals(this.name, detailedSegmentEffortAllOf.name) &&
        Objects.equals(this.activity, detailedSegmentEffortAllOf.activity) &&
        Objects.equals(this.athlete, detailedSegmentEffortAllOf.athlete) &&
        Objects.equals(this.movingTime, detailedSegmentEffortAllOf.movingTime) &&
        Objects.equals(this.startIndex, detailedSegmentEffortAllOf.startIndex) &&
        Objects.equals(this.endIndex, detailedSegmentEffortAllOf.endIndex) &&
        Objects.equals(this.averageCadence, detailedSegmentEffortAllOf.averageCadence) &&
        Objects.equals(this.averageWatts, detailedSegmentEffortAllOf.averageWatts) &&
        Objects.equals(this.deviceWatts, detailedSegmentEffortAllOf.deviceWatts) &&
        Objects.equals(this.averageHeartrate, detailedSegmentEffortAllOf.averageHeartrate) &&
        Objects.equals(this.maxHeartrate, detailedSegmentEffortAllOf.maxHeartrate) &&
        Objects.equals(this.segment, detailedSegmentEffortAllOf.segment) &&
        Objects.equals(this.komRank, detailedSegmentEffortAllOf.komRank) &&
        Objects.equals(this.prRank, detailedSegmentEffortAllOf.prRank) &&
        Objects.equals(this.hidden, detailedSegmentEffortAllOf.hidden);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, activity, athlete, movingTime, startIndex, endIndex, averageCadence, averageWatts, deviceWatts, averageHeartrate, maxHeartrate, segment, komRank, prRank, hidden);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegmentEffortAllOfDTO {\n");
    
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

