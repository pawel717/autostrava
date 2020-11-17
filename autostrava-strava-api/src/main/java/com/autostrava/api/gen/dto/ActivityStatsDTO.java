package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.ActivityTotalDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A set of rolled-up statistics and totals for an athlete
 */
@ApiModel(description = "A set of rolled-up statistics and totals for an athlete")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class ActivityStatsDTO   {
  @JsonProperty("biggest_ride_distance")
  private Double biggestRideDistance;

  @JsonProperty("biggest_climb_elevation_gain")
  private Double biggestClimbElevationGain;

  @JsonProperty("recent_ride_totals")
  private ActivityTotalDTO recentRideTotals;

  @JsonProperty("recent_run_totals")
  private ActivityTotalDTO recentRunTotals;

  @JsonProperty("recent_swim_totals")
  private ActivityTotalDTO recentSwimTotals;

  @JsonProperty("ytd_ride_totals")
  private ActivityTotalDTO ytdRideTotals;

  @JsonProperty("ytd_run_totals")
  private ActivityTotalDTO ytdRunTotals;

  @JsonProperty("ytd_swim_totals")
  private ActivityTotalDTO ytdSwimTotals;

  @JsonProperty("all_ride_totals")
  private ActivityTotalDTO allRideTotals;

  @JsonProperty("all_run_totals")
  private ActivityTotalDTO allRunTotals;

  @JsonProperty("all_swim_totals")
  private ActivityTotalDTO allSwimTotals;

  public ActivityStatsDTO biggestRideDistance(Double biggestRideDistance) {
    this.biggestRideDistance = biggestRideDistance;
    return this;
  }

  /**
   * The longest distance ridden by the athlete.
   * @return biggestRideDistance
  */
  @ApiModelProperty(value = "The longest distance ridden by the athlete.")


  public Double getBiggestRideDistance() {
    return biggestRideDistance;
  }

  public void setBiggestRideDistance(Double biggestRideDistance) {
    this.biggestRideDistance = biggestRideDistance;
  }

  public ActivityStatsDTO biggestClimbElevationGain(Double biggestClimbElevationGain) {
    this.biggestClimbElevationGain = biggestClimbElevationGain;
    return this;
  }

  /**
   * The highest climb ridden by the athlete.
   * @return biggestClimbElevationGain
  */
  @ApiModelProperty(value = "The highest climb ridden by the athlete.")


  public Double getBiggestClimbElevationGain() {
    return biggestClimbElevationGain;
  }

  public void setBiggestClimbElevationGain(Double biggestClimbElevationGain) {
    this.biggestClimbElevationGain = biggestClimbElevationGain;
  }

  public ActivityStatsDTO recentRideTotals(ActivityTotalDTO recentRideTotals) {
    this.recentRideTotals = recentRideTotals;
    return this;
  }

  /**
   * Get recentRideTotals
   * @return recentRideTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getRecentRideTotals() {
    return recentRideTotals;
  }

  public void setRecentRideTotals(ActivityTotalDTO recentRideTotals) {
    this.recentRideTotals = recentRideTotals;
  }

  public ActivityStatsDTO recentRunTotals(ActivityTotalDTO recentRunTotals) {
    this.recentRunTotals = recentRunTotals;
    return this;
  }

  /**
   * Get recentRunTotals
   * @return recentRunTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getRecentRunTotals() {
    return recentRunTotals;
  }

  public void setRecentRunTotals(ActivityTotalDTO recentRunTotals) {
    this.recentRunTotals = recentRunTotals;
  }

  public ActivityStatsDTO recentSwimTotals(ActivityTotalDTO recentSwimTotals) {
    this.recentSwimTotals = recentSwimTotals;
    return this;
  }

  /**
   * Get recentSwimTotals
   * @return recentSwimTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getRecentSwimTotals() {
    return recentSwimTotals;
  }

  public void setRecentSwimTotals(ActivityTotalDTO recentSwimTotals) {
    this.recentSwimTotals = recentSwimTotals;
  }

  public ActivityStatsDTO ytdRideTotals(ActivityTotalDTO ytdRideTotals) {
    this.ytdRideTotals = ytdRideTotals;
    return this;
  }

  /**
   * Get ytdRideTotals
   * @return ytdRideTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getYtdRideTotals() {
    return ytdRideTotals;
  }

  public void setYtdRideTotals(ActivityTotalDTO ytdRideTotals) {
    this.ytdRideTotals = ytdRideTotals;
  }

  public ActivityStatsDTO ytdRunTotals(ActivityTotalDTO ytdRunTotals) {
    this.ytdRunTotals = ytdRunTotals;
    return this;
  }

  /**
   * Get ytdRunTotals
   * @return ytdRunTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getYtdRunTotals() {
    return ytdRunTotals;
  }

  public void setYtdRunTotals(ActivityTotalDTO ytdRunTotals) {
    this.ytdRunTotals = ytdRunTotals;
  }

  public ActivityStatsDTO ytdSwimTotals(ActivityTotalDTO ytdSwimTotals) {
    this.ytdSwimTotals = ytdSwimTotals;
    return this;
  }

  /**
   * Get ytdSwimTotals
   * @return ytdSwimTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getYtdSwimTotals() {
    return ytdSwimTotals;
  }

  public void setYtdSwimTotals(ActivityTotalDTO ytdSwimTotals) {
    this.ytdSwimTotals = ytdSwimTotals;
  }

  public ActivityStatsDTO allRideTotals(ActivityTotalDTO allRideTotals) {
    this.allRideTotals = allRideTotals;
    return this;
  }

  /**
   * Get allRideTotals
   * @return allRideTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getAllRideTotals() {
    return allRideTotals;
  }

  public void setAllRideTotals(ActivityTotalDTO allRideTotals) {
    this.allRideTotals = allRideTotals;
  }

  public ActivityStatsDTO allRunTotals(ActivityTotalDTO allRunTotals) {
    this.allRunTotals = allRunTotals;
    return this;
  }

  /**
   * Get allRunTotals
   * @return allRunTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getAllRunTotals() {
    return allRunTotals;
  }

  public void setAllRunTotals(ActivityTotalDTO allRunTotals) {
    this.allRunTotals = allRunTotals;
  }

  public ActivityStatsDTO allSwimTotals(ActivityTotalDTO allSwimTotals) {
    this.allSwimTotals = allSwimTotals;
    return this;
  }

  /**
   * Get allSwimTotals
   * @return allSwimTotals
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTotalDTO getAllSwimTotals() {
    return allSwimTotals;
  }

  public void setAllSwimTotals(ActivityTotalDTO allSwimTotals) {
    this.allSwimTotals = allSwimTotals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityStatsDTO activityStats = (ActivityStatsDTO) o;
    return Objects.equals(this.biggestRideDistance, activityStats.biggestRideDistance) &&
        Objects.equals(this.biggestClimbElevationGain, activityStats.biggestClimbElevationGain) &&
        Objects.equals(this.recentRideTotals, activityStats.recentRideTotals) &&
        Objects.equals(this.recentRunTotals, activityStats.recentRunTotals) &&
        Objects.equals(this.recentSwimTotals, activityStats.recentSwimTotals) &&
        Objects.equals(this.ytdRideTotals, activityStats.ytdRideTotals) &&
        Objects.equals(this.ytdRunTotals, activityStats.ytdRunTotals) &&
        Objects.equals(this.ytdSwimTotals, activityStats.ytdSwimTotals) &&
        Objects.equals(this.allRideTotals, activityStats.allRideTotals) &&
        Objects.equals(this.allRunTotals, activityStats.allRunTotals) &&
        Objects.equals(this.allSwimTotals, activityStats.allSwimTotals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(biggestRideDistance, biggestClimbElevationGain, recentRideTotals, recentRunTotals, recentSwimTotals, ytdRideTotals, ytdRunTotals, ytdSwimTotals, allRideTotals, allRunTotals, allSwimTotals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityStatsDTO {\n");
    
    sb.append("    biggestRideDistance: ").append(toIndentedString(biggestRideDistance)).append("\n");
    sb.append("    biggestClimbElevationGain: ").append(toIndentedString(biggestClimbElevationGain)).append("\n");
    sb.append("    recentRideTotals: ").append(toIndentedString(recentRideTotals)).append("\n");
    sb.append("    recentRunTotals: ").append(toIndentedString(recentRunTotals)).append("\n");
    sb.append("    recentSwimTotals: ").append(toIndentedString(recentSwimTotals)).append("\n");
    sb.append("    ytdRideTotals: ").append(toIndentedString(ytdRideTotals)).append("\n");
    sb.append("    ytdRunTotals: ").append(toIndentedString(ytdRunTotals)).append("\n");
    sb.append("    ytdSwimTotals: ").append(toIndentedString(ytdSwimTotals)).append("\n");
    sb.append("    allRideTotals: ").append(toIndentedString(allRideTotals)).append("\n");
    sb.append("    allRunTotals: ").append(toIndentedString(allRunTotals)).append("\n");
    sb.append("    allSwimTotals: ").append(toIndentedString(allSwimTotals)).append("\n");
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

