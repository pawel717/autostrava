package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.TimedZoneRangeDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ActivityZoneDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class ActivityZoneDTO   {
  @JsonProperty("score")
  private Integer score;

  @JsonProperty("distribution_buckets")
  @Valid
  private List<TimedZoneRangeDTO> distributionBuckets = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    HEARTRATE("heartrate"),
    
    POWER("power");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("type")
  private TypeEnum type;

  @JsonProperty("sensor_based")
  private Boolean sensorBased;

  @JsonProperty("points")
  private Integer points;

  @JsonProperty("custom_zones")
  private Boolean customZones;

  @JsonProperty("max")
  private Integer max;

  public ActivityZoneDTO score(Integer score) {
    this.score = score;
    return this;
  }

  /**
   * Get score
   * @return score
  */
  @ApiModelProperty(value = "")


  public Integer getScore() {
    return score;
  }

  public void setScore(Integer score) {
    this.score = score;
  }

  public ActivityZoneDTO distributionBuckets(List<TimedZoneRangeDTO> distributionBuckets) {
    this.distributionBuckets = distributionBuckets;
    return this;
  }

  public ActivityZoneDTO addDistributionBucketsItem(TimedZoneRangeDTO distributionBucketsItem) {
    if (this.distributionBuckets == null) {
      this.distributionBuckets = new ArrayList<>();
    }
    this.distributionBuckets.add(distributionBucketsItem);
    return this;
  }

  /**
   * Stores the exclusive ranges representing zones and the time spent in each.
   * @return distributionBuckets
  */
  @ApiModelProperty(value = "Stores the exclusive ranges representing zones and the time spent in each.")

  @Valid

  public List<TimedZoneRangeDTO> getDistributionBuckets() {
    return distributionBuckets;
  }

  public void setDistributionBuckets(List<TimedZoneRangeDTO> distributionBuckets) {
    this.distributionBuckets = distributionBuckets;
  }

  public ActivityZoneDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ActivityZoneDTO sensorBased(Boolean sensorBased) {
    this.sensorBased = sensorBased;
    return this;
  }

  /**
   * Get sensorBased
   * @return sensorBased
  */
  @ApiModelProperty(value = "")


  public Boolean isSensorBased() {
    return sensorBased;
  }

  public void setSensorBased(Boolean sensorBased) {
    this.sensorBased = sensorBased;
  }

  public ActivityZoneDTO points(Integer points) {
    this.points = points;
    return this;
  }

  /**
   * Get points
   * @return points
  */
  @ApiModelProperty(value = "")


  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public ActivityZoneDTO customZones(Boolean customZones) {
    this.customZones = customZones;
    return this;
  }

  /**
   * Get customZones
   * @return customZones
  */
  @ApiModelProperty(value = "")


  public Boolean isCustomZones() {
    return customZones;
  }

  public void setCustomZones(Boolean customZones) {
    this.customZones = customZones;
  }

  public ActivityZoneDTO max(Integer max) {
    this.max = max;
    return this;
  }

  /**
   * Get max
   * @return max
  */
  @ApiModelProperty(value = "")


  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityZoneDTO activityZone = (ActivityZoneDTO) o;
    return Objects.equals(this.score, activityZone.score) &&
        Objects.equals(this.distributionBuckets, activityZone.distributionBuckets) &&
        Objects.equals(this.type, activityZone.type) &&
        Objects.equals(this.sensorBased, activityZone.sensorBased) &&
        Objects.equals(this.points, activityZone.points) &&
        Objects.equals(this.customZones, activityZone.customZones) &&
        Objects.equals(this.max, activityZone.max);
  }

  @Override
  public int hashCode() {
    return Objects.hash(score, distributionBuckets, type, sensorBased, points, customZones, max);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityZoneDTO {\n");
    
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    distributionBuckets: ").append(toIndentedString(distributionBuckets)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sensorBased: ").append(toIndentedString(sensorBased)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    customZones: ").append(toIndentedString(customZones)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

