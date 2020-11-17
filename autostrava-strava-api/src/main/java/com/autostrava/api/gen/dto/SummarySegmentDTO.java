package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.SummaryPRSegmentEffortDTO;
import com.autostrava.api.gen.dto.SummarySegmentEffortDTO;
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
 * SummarySegmentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SummarySegmentDTO   {
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

  public SummarySegmentDTO id(Long id) {
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

  public SummarySegmentDTO name(String name) {
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

  public SummarySegmentDTO activityType(ActivityTypeEnum activityType) {
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

  public SummarySegmentDTO distance(Float distance) {
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

  public SummarySegmentDTO averageGrade(Float averageGrade) {
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

  public SummarySegmentDTO maximumGrade(Float maximumGrade) {
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

  public SummarySegmentDTO elevationHigh(Float elevationHigh) {
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

  public SummarySegmentDTO elevationLow(Float elevationLow) {
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

  public SummarySegmentDTO startLatlng(List<Float> startLatlng) {
    this.startLatlng = startLatlng;
    return this;
  }

  public SummarySegmentDTO addStartLatlngItem(Float startLatlngItem) {
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

  public SummarySegmentDTO endLatlng(List<Float> endLatlng) {
    this.endLatlng = endLatlng;
    return this;
  }

  public SummarySegmentDTO addEndLatlngItem(Float endLatlngItem) {
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

  public SummarySegmentDTO climbCategory(Integer climbCategory) {
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

  public SummarySegmentDTO city(String city) {
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

  public SummarySegmentDTO state(String state) {
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

  public SummarySegmentDTO country(String country) {
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

  public SummarySegmentDTO _private(Boolean _private) {
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

  public SummarySegmentDTO athletePrEffort(SummarySegmentEffortDTO athletePrEffort) {
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

  public SummarySegmentDTO athleteSegmentStats(SummaryPRSegmentEffortDTO athleteSegmentStats) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummarySegmentDTO summarySegment = (SummarySegmentDTO) o;
    return Objects.equals(this.id, summarySegment.id) &&
        Objects.equals(this.name, summarySegment.name) &&
        Objects.equals(this.activityType, summarySegment.activityType) &&
        Objects.equals(this.distance, summarySegment.distance) &&
        Objects.equals(this.averageGrade, summarySegment.averageGrade) &&
        Objects.equals(this.maximumGrade, summarySegment.maximumGrade) &&
        Objects.equals(this.elevationHigh, summarySegment.elevationHigh) &&
        Objects.equals(this.elevationLow, summarySegment.elevationLow) &&
        Objects.equals(this.startLatlng, summarySegment.startLatlng) &&
        Objects.equals(this.endLatlng, summarySegment.endLatlng) &&
        Objects.equals(this.climbCategory, summarySegment.climbCategory) &&
        Objects.equals(this.city, summarySegment.city) &&
        Objects.equals(this.state, summarySegment.state) &&
        Objects.equals(this.country, summarySegment.country) &&
        Objects.equals(this._private, summarySegment._private) &&
        Objects.equals(this.athletePrEffort, summarySegment.athletePrEffort) &&
        Objects.equals(this.athleteSegmentStats, summarySegment.athleteSegmentStats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, activityType, distance, averageGrade, maximumGrade, elevationHigh, elevationLow, startLatlng, endLatlng, climbCategory, city, state, country, _private, athletePrEffort, athleteSegmentStats);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummarySegmentDTO {\n");
    
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

