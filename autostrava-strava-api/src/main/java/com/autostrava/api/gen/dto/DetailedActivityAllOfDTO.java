package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.DetailedSegmentEffortDTO;
import com.autostrava.api.gen.dto.LapDTO;
import com.autostrava.api.gen.dto.PhotosSummaryDTO;
import com.autostrava.api.gen.dto.SplitDTO;
import com.autostrava.api.gen.dto.SummaryGearDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedActivityAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedActivityAllOfDTO   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("photos")
  private PhotosSummaryDTO photos;

  @JsonProperty("gear")
  private SummaryGearDTO gear;

  @JsonProperty("calories")
  private Float calories;

  @JsonProperty("segment_efforts")
  @Valid
  private List<DetailedSegmentEffortDTO> segmentEfforts = null;

  @JsonProperty("device_name")
  private String deviceName;

  @JsonProperty("embed_token")
  private String embedToken;

  @JsonProperty("splits_metric")
  @Valid
  private List<SplitDTO> splitsMetric = null;

  @JsonProperty("splits_standard")
  @Valid
  private List<SplitDTO> splitsStandard = null;

  @JsonProperty("laps")
  @Valid
  private List<LapDTO> laps = null;

  @JsonProperty("best_efforts")
  @Valid
  private List<DetailedSegmentEffortDTO> bestEfforts = null;

  public DetailedActivityAllOfDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the activity
   * @return description
  */
  @ApiModelProperty(value = "The description of the activity")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DetailedActivityAllOfDTO photos(PhotosSummaryDTO photos) {
    this.photos = photos;
    return this;
  }

  /**
   * Get photos
   * @return photos
  */
  @ApiModelProperty(value = "")

  @Valid

  public PhotosSummaryDTO getPhotos() {
    return photos;
  }

  public void setPhotos(PhotosSummaryDTO photos) {
    this.photos = photos;
  }

  public DetailedActivityAllOfDTO gear(SummaryGearDTO gear) {
    this.gear = gear;
    return this;
  }

  /**
   * Get gear
   * @return gear
  */
  @ApiModelProperty(value = "")

  @Valid

  public SummaryGearDTO getGear() {
    return gear;
  }

  public void setGear(SummaryGearDTO gear) {
    this.gear = gear;
  }

  public DetailedActivityAllOfDTO calories(Float calories) {
    this.calories = calories;
    return this;
  }

  /**
   * The number of kilocalories consumed during this activity
   * @return calories
  */
  @ApiModelProperty(value = "The number of kilocalories consumed during this activity")


  public Float getCalories() {
    return calories;
  }

  public void setCalories(Float calories) {
    this.calories = calories;
  }

  public DetailedActivityAllOfDTO segmentEfforts(List<DetailedSegmentEffortDTO> segmentEfforts) {
    this.segmentEfforts = segmentEfforts;
    return this;
  }

  public DetailedActivityAllOfDTO addSegmentEffortsItem(DetailedSegmentEffortDTO segmentEffortsItem) {
    if (this.segmentEfforts == null) {
      this.segmentEfforts = new ArrayList<>();
    }
    this.segmentEfforts.add(segmentEffortsItem);
    return this;
  }

  /**
   * Get segmentEfforts
   * @return segmentEfforts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DetailedSegmentEffortDTO> getSegmentEfforts() {
    return segmentEfforts;
  }

  public void setSegmentEfforts(List<DetailedSegmentEffortDTO> segmentEfforts) {
    this.segmentEfforts = segmentEfforts;
  }

  public DetailedActivityAllOfDTO deviceName(String deviceName) {
    this.deviceName = deviceName;
    return this;
  }

  /**
   * The name of the device used to record the activity
   * @return deviceName
  */
  @ApiModelProperty(value = "The name of the device used to record the activity")


  public String getDeviceName() {
    return deviceName;
  }

  public void setDeviceName(String deviceName) {
    this.deviceName = deviceName;
  }

  public DetailedActivityAllOfDTO embedToken(String embedToken) {
    this.embedToken = embedToken;
    return this;
  }

  /**
   * The token used to embed a Strava activity
   * @return embedToken
  */
  @ApiModelProperty(value = "The token used to embed a Strava activity")


  public String getEmbedToken() {
    return embedToken;
  }

  public void setEmbedToken(String embedToken) {
    this.embedToken = embedToken;
  }

  public DetailedActivityAllOfDTO splitsMetric(List<SplitDTO> splitsMetric) {
    this.splitsMetric = splitsMetric;
    return this;
  }

  public DetailedActivityAllOfDTO addSplitsMetricItem(SplitDTO splitsMetricItem) {
    if (this.splitsMetric == null) {
      this.splitsMetric = new ArrayList<>();
    }
    this.splitsMetric.add(splitsMetricItem);
    return this;
  }

  /**
   * The splits of this activity in metric units (for runs)
   * @return splitsMetric
  */
  @ApiModelProperty(value = "The splits of this activity in metric units (for runs)")

  @Valid

  public List<SplitDTO> getSplitsMetric() {
    return splitsMetric;
  }

  public void setSplitsMetric(List<SplitDTO> splitsMetric) {
    this.splitsMetric = splitsMetric;
  }

  public DetailedActivityAllOfDTO splitsStandard(List<SplitDTO> splitsStandard) {
    this.splitsStandard = splitsStandard;
    return this;
  }

  public DetailedActivityAllOfDTO addSplitsStandardItem(SplitDTO splitsStandardItem) {
    if (this.splitsStandard == null) {
      this.splitsStandard = new ArrayList<>();
    }
    this.splitsStandard.add(splitsStandardItem);
    return this;
  }

  /**
   * The splits of this activity in imperial units (for runs)
   * @return splitsStandard
  */
  @ApiModelProperty(value = "The splits of this activity in imperial units (for runs)")

  @Valid

  public List<SplitDTO> getSplitsStandard() {
    return splitsStandard;
  }

  public void setSplitsStandard(List<SplitDTO> splitsStandard) {
    this.splitsStandard = splitsStandard;
  }

  public DetailedActivityAllOfDTO laps(List<LapDTO> laps) {
    this.laps = laps;
    return this;
  }

  public DetailedActivityAllOfDTO addLapsItem(LapDTO lapsItem) {
    if (this.laps == null) {
      this.laps = new ArrayList<>();
    }
    this.laps.add(lapsItem);
    return this;
  }

  /**
   * Get laps
   * @return laps
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<LapDTO> getLaps() {
    return laps;
  }

  public void setLaps(List<LapDTO> laps) {
    this.laps = laps;
  }

  public DetailedActivityAllOfDTO bestEfforts(List<DetailedSegmentEffortDTO> bestEfforts) {
    this.bestEfforts = bestEfforts;
    return this;
  }

  public DetailedActivityAllOfDTO addBestEffortsItem(DetailedSegmentEffortDTO bestEffortsItem) {
    if (this.bestEfforts == null) {
      this.bestEfforts = new ArrayList<>();
    }
    this.bestEfforts.add(bestEffortsItem);
    return this;
  }

  /**
   * Get bestEfforts
   * @return bestEfforts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<DetailedSegmentEffortDTO> getBestEfforts() {
    return bestEfforts;
  }

  public void setBestEfforts(List<DetailedSegmentEffortDTO> bestEfforts) {
    this.bestEfforts = bestEfforts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedActivityAllOfDTO detailedActivityAllOf = (DetailedActivityAllOfDTO) o;
    return Objects.equals(this.description, detailedActivityAllOf.description) &&
        Objects.equals(this.photos, detailedActivityAllOf.photos) &&
        Objects.equals(this.gear, detailedActivityAllOf.gear) &&
        Objects.equals(this.calories, detailedActivityAllOf.calories) &&
        Objects.equals(this.segmentEfforts, detailedActivityAllOf.segmentEfforts) &&
        Objects.equals(this.deviceName, detailedActivityAllOf.deviceName) &&
        Objects.equals(this.embedToken, detailedActivityAllOf.embedToken) &&
        Objects.equals(this.splitsMetric, detailedActivityAllOf.splitsMetric) &&
        Objects.equals(this.splitsStandard, detailedActivityAllOf.splitsStandard) &&
        Objects.equals(this.laps, detailedActivityAllOf.laps) &&
        Objects.equals(this.bestEfforts, detailedActivityAllOf.bestEfforts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, photos, gear, calories, segmentEfforts, deviceName, embedToken, splitsMetric, splitsStandard, laps, bestEfforts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedActivityAllOfDTO {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    photos: ").append(toIndentedString(photos)).append("\n");
    sb.append("    gear: ").append(toIndentedString(gear)).append("\n");
    sb.append("    calories: ").append(toIndentedString(calories)).append("\n");
    sb.append("    segmentEfforts: ").append(toIndentedString(segmentEfforts)).append("\n");
    sb.append("    deviceName: ").append(toIndentedString(deviceName)).append("\n");
    sb.append("    embedToken: ").append(toIndentedString(embedToken)).append("\n");
    sb.append("    splitsMetric: ").append(toIndentedString(splitsMetric)).append("\n");
    sb.append("    splitsStandard: ").append(toIndentedString(splitsStandard)).append("\n");
    sb.append("    laps: ").append(toIndentedString(laps)).append("\n");
    sb.append("    bestEfforts: ").append(toIndentedString(bestEfforts)).append("\n");
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

