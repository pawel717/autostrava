package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.DetailedSegmentAllOfDTO;
import com.autostrava.api.gen.dto.PolylineMapDTO;
import com.autostrava.api.gen.dto.SummaryPRSegmentEffortDTO;
import com.autostrava.api.gen.dto.SummarySegmentDTO;
import com.autostrava.api.gen.dto.SummarySegmentEffortDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedSegmentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedSegmentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  /**
   * Gets or Sets activityType
   */
  public enum ActivityTypeEnum {
    RIDE("Ride"),
    
    RUN("Run");

    private String value;

    ActivityTypeEnum(String value) {
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
    public static ActivityTypeEnum fromValue(String value) {
      for (ActivityTypeEnum b : ActivityTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("activity_type")
  private ActivityTypeEnum activityType;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("average_grade")
  private Float averageGrade;

  @JsonProperty("maximum_grade")
  private Float maximumGrade;

  @JsonProperty("elevation_high")
  private Float elevationHigh;

  @JsonProperty("elevation_low")
  private Float elevationLow;

  @JsonProperty("start_latlng")
  @Valid
  private List<Float> startLatlng = null;

  @JsonProperty("end_latlng")
  @Valid
  private List<Float> endLatlng = null;

  @JsonProperty("climb_category")
  private Integer climbCategory;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  @JsonProperty("private")
  private Boolean _private;

  @JsonProperty("athlete_pr_effort")
  private SummarySegmentEffortDTO athletePrEffort;

  @JsonProperty("athlete_segment_stats")
  private SummaryPRSegmentEffortDTO athleteSegmentStats;

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

  public DetailedSegmentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this segment
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of this segment")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public DetailedSegmentDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this segment
   * @return name
  */
  @ApiModelProperty(value = "The name of this segment")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedSegmentDTO activityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
    return this;
  }

  /**
   * Get activityType
   * @return activityType
  */
  @ApiModelProperty(value = "")


  public ActivityTypeEnum getActivityType() {
    return activityType;
  }

  public void setActivityType(ActivityTypeEnum activityType) {
    this.activityType = activityType;
  }

  public DetailedSegmentDTO distance(Float distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The segment's distance, in meters
   * @return distance
  */
  @ApiModelProperty(value = "The segment's distance, in meters")


  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public DetailedSegmentDTO averageGrade(Float averageGrade) {
    this.averageGrade = averageGrade;
    return this;
  }

  /**
   * The segment's average grade, in percents
   * @return averageGrade
  */
  @ApiModelProperty(value = "The segment's average grade, in percents")


  public Float getAverageGrade() {
    return averageGrade;
  }

  public void setAverageGrade(Float averageGrade) {
    this.averageGrade = averageGrade;
  }

  public DetailedSegmentDTO maximumGrade(Float maximumGrade) {
    this.maximumGrade = maximumGrade;
    return this;
  }

  /**
   * The segments's maximum grade, in percents
   * @return maximumGrade
  */
  @ApiModelProperty(value = "The segments's maximum grade, in percents")


  public Float getMaximumGrade() {
    return maximumGrade;
  }

  public void setMaximumGrade(Float maximumGrade) {
    this.maximumGrade = maximumGrade;
  }

  public DetailedSegmentDTO elevationHigh(Float elevationHigh) {
    this.elevationHigh = elevationHigh;
    return this;
  }

  /**
   * The segments's highest elevation, in meters
   * @return elevationHigh
  */
  @ApiModelProperty(value = "The segments's highest elevation, in meters")


  public Float getElevationHigh() {
    return elevationHigh;
  }

  public void setElevationHigh(Float elevationHigh) {
    this.elevationHigh = elevationHigh;
  }

  public DetailedSegmentDTO elevationLow(Float elevationLow) {
    this.elevationLow = elevationLow;
    return this;
  }

  /**
   * The segments's lowest elevation, in meters
   * @return elevationLow
  */
  @ApiModelProperty(value = "The segments's lowest elevation, in meters")


  public Float getElevationLow() {
    return elevationLow;
  }

  public void setElevationLow(Float elevationLow) {
    this.elevationLow = elevationLow;
  }

  public DetailedSegmentDTO startLatlng(List<Float> startLatlng) {
    this.startLatlng = startLatlng;
    return this;
  }

  public DetailedSegmentDTO addStartLatlngItem(Float startLatlngItem) {
    if (this.startLatlng == null) {
      this.startLatlng = new ArrayList<>();
    }
    this.startLatlng.add(startLatlngItem);
    return this;
  }

  /**
   * A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.
   * @return startLatlng
  */
  @ApiModelProperty(value = "A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.")

@Size(min=2,max=2) 
  public List<Float> getStartLatlng() {
    return startLatlng;
  }

  public void setStartLatlng(List<Float> startLatlng) {
    this.startLatlng = startLatlng;
  }

  public DetailedSegmentDTO endLatlng(List<Float> endLatlng) {
    this.endLatlng = endLatlng;
    return this;
  }

  public DetailedSegmentDTO addEndLatlngItem(Float endLatlngItem) {
    if (this.endLatlng == null) {
      this.endLatlng = new ArrayList<>();
    }
    this.endLatlng.add(endLatlngItem);
    return this;
  }

  /**
   * A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.
   * @return endLatlng
  */
  @ApiModelProperty(value = "A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.")

@Size(min=2,max=2) 
  public List<Float> getEndLatlng() {
    return endLatlng;
  }

  public void setEndLatlng(List<Float> endLatlng) {
    this.endLatlng = endLatlng;
  }

  public DetailedSegmentDTO climbCategory(Integer climbCategory) {
    this.climbCategory = climbCategory;
    return this;
  }

  /**
   * The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category.
   * @return climbCategory
  */
  @ApiModelProperty(value = "The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category.")


  public Integer getClimbCategory() {
    return climbCategory;
  }

  public void setClimbCategory(Integer climbCategory) {
    this.climbCategory = climbCategory;
  }

  public DetailedSegmentDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The segments's city.
   * @return city
  */
  @ApiModelProperty(value = "The segments's city.")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public DetailedSegmentDTO state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The segments's state or geographical region.
   * @return state
  */
  @ApiModelProperty(value = "The segments's state or geographical region.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public DetailedSegmentDTO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The segment's country.
   * @return country
  */
  @ApiModelProperty(value = "The segment's country.")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public DetailedSegmentDTO _private(Boolean _private) {
    this._private = _private;
    return this;
  }

  /**
   * Whether this segment is private.
   * @return _private
  */
  @ApiModelProperty(value = "Whether this segment is private.")


  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public DetailedSegmentDTO athletePrEffort(SummarySegmentEffortDTO athletePrEffort) {
    this.athletePrEffort = athletePrEffort;
    return this;
  }

  /**
   * Get athletePrEffort
   * @return athletePrEffort
  */
  @ApiModelProperty(value = "")

  @Valid

  public SummarySegmentEffortDTO getAthletePrEffort() {
    return athletePrEffort;
  }

  public void setAthletePrEffort(SummarySegmentEffortDTO athletePrEffort) {
    this.athletePrEffort = athletePrEffort;
  }

  public DetailedSegmentDTO athleteSegmentStats(SummaryPRSegmentEffortDTO athleteSegmentStats) {
    this.athleteSegmentStats = athleteSegmentStats;
    return this;
  }

  /**
   * Get athleteSegmentStats
   * @return athleteSegmentStats
  */
  @ApiModelProperty(value = "")

  @Valid

  public SummaryPRSegmentEffortDTO getAthleteSegmentStats() {
    return athleteSegmentStats;
  }

  public void setAthleteSegmentStats(SummaryPRSegmentEffortDTO athleteSegmentStats) {
    this.athleteSegmentStats = athleteSegmentStats;
  }

  public DetailedSegmentDTO createdAt(OffsetDateTime createdAt) {
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

  public DetailedSegmentDTO updatedAt(OffsetDateTime updatedAt) {
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

  public DetailedSegmentDTO totalElevationGain(Float totalElevationGain) {
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

  public DetailedSegmentDTO map(PolylineMapDTO map) {
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

  public DetailedSegmentDTO effortCount(Integer effortCount) {
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

  public DetailedSegmentDTO athleteCount(Integer athleteCount) {
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

  public DetailedSegmentDTO hazardous(Boolean hazardous) {
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

  public DetailedSegmentDTO starCount(Integer starCount) {
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
    DetailedSegmentDTO detailedSegment = (DetailedSegmentDTO) o;
    return Objects.equals(this.id, detailedSegment.id) &&
        Objects.equals(this.name, detailedSegment.name) &&
        Objects.equals(this.activityType, detailedSegment.activityType) &&
        Objects.equals(this.distance, detailedSegment.distance) &&
        Objects.equals(this.averageGrade, detailedSegment.averageGrade) &&
        Objects.equals(this.maximumGrade, detailedSegment.maximumGrade) &&
        Objects.equals(this.elevationHigh, detailedSegment.elevationHigh) &&
        Objects.equals(this.elevationLow, detailedSegment.elevationLow) &&
        Objects.equals(this.startLatlng, detailedSegment.startLatlng) &&
        Objects.equals(this.endLatlng, detailedSegment.endLatlng) &&
        Objects.equals(this.climbCategory, detailedSegment.climbCategory) &&
        Objects.equals(this.city, detailedSegment.city) &&
        Objects.equals(this.state, detailedSegment.state) &&
        Objects.equals(this.country, detailedSegment.country) &&
        Objects.equals(this._private, detailedSegment._private) &&
        Objects.equals(this.athletePrEffort, detailedSegment.athletePrEffort) &&
        Objects.equals(this.athleteSegmentStats, detailedSegment.athleteSegmentStats) &&
        Objects.equals(this.createdAt, detailedSegment.createdAt) &&
        Objects.equals(this.updatedAt, detailedSegment.updatedAt) &&
        Objects.equals(this.totalElevationGain, detailedSegment.totalElevationGain) &&
        Objects.equals(this.map, detailedSegment.map) &&
        Objects.equals(this.effortCount, detailedSegment.effortCount) &&
        Objects.equals(this.athleteCount, detailedSegment.athleteCount) &&
        Objects.equals(this.hazardous, detailedSegment.hazardous) &&
        Objects.equals(this.starCount, detailedSegment.starCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, activityType, distance, averageGrade, maximumGrade, elevationHigh, elevationLow, startLatlng, endLatlng, climbCategory, city, state, country, _private, athletePrEffort, athleteSegmentStats, createdAt, updatedAt, totalElevationGain, map, effortCount, athleteCount, hazardous, starCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedSegmentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    activityType: ").append(toIndentedString(activityType)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    averageGrade: ").append(toIndentedString(averageGrade)).append("\n");
    sb.append("    maximumGrade: ").append(toIndentedString(maximumGrade)).append("\n");
    sb.append("    elevationHigh: ").append(toIndentedString(elevationHigh)).append("\n");
    sb.append("    elevationLow: ").append(toIndentedString(elevationLow)).append("\n");
    sb.append("    startLatlng: ").append(toIndentedString(startLatlng)).append("\n");
    sb.append("    endLatlng: ").append(toIndentedString(endLatlng)).append("\n");
    sb.append("    climbCategory: ").append(toIndentedString(climbCategory)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    athletePrEffort: ").append(toIndentedString(athletePrEffort)).append("\n");
    sb.append("    athleteSegmentStats: ").append(toIndentedString(athleteSegmentStats)).append("\n");
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

