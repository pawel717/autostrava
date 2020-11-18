/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.autostrava.api.gen.dto;

import java.util.Objects;
import java.util.Arrays;
import com.autostrava.api.gen.dto.SummaryPRSegmentEffortDTO;
import com.autostrava.api.gen.dto.SummarySegmentEffortDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SummarySegmentDTO
 */
@JsonPropertyOrder({
  SummarySegmentDTO.JSON_PROPERTY_ID,
  SummarySegmentDTO.JSON_PROPERTY_NAME,
  SummarySegmentDTO.JSON_PROPERTY_ACTIVITY_TYPE,
  SummarySegmentDTO.JSON_PROPERTY_DISTANCE,
  SummarySegmentDTO.JSON_PROPERTY_AVERAGE_GRADE,
  SummarySegmentDTO.JSON_PROPERTY_MAXIMUM_GRADE,
  SummarySegmentDTO.JSON_PROPERTY_ELEVATION_HIGH,
  SummarySegmentDTO.JSON_PROPERTY_ELEVATION_LOW,
  SummarySegmentDTO.JSON_PROPERTY_START_LATLNG,
  SummarySegmentDTO.JSON_PROPERTY_END_LATLNG,
  SummarySegmentDTO.JSON_PROPERTY_CLIMB_CATEGORY,
  SummarySegmentDTO.JSON_PROPERTY_CITY,
  SummarySegmentDTO.JSON_PROPERTY_STATE,
  SummarySegmentDTO.JSON_PROPERTY_COUNTRY,
  SummarySegmentDTO.JSON_PROPERTY_PRIVATE,
  SummarySegmentDTO.JSON_PROPERTY_ATHLETE_PR_EFFORT,
  SummarySegmentDTO.JSON_PROPERTY_ATHLETE_SEGMENT_STATS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T20:13:51.882+01:00[Europe/Belgrade]")
public class SummarySegmentDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_NAME = "name";
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

  public static final String JSON_PROPERTY_ACTIVITY_TYPE = "activity_type";
  private ActivityTypeEnum activityType;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Float distance;

  public static final String JSON_PROPERTY_AVERAGE_GRADE = "average_grade";
  private Float averageGrade;

  public static final String JSON_PROPERTY_MAXIMUM_GRADE = "maximum_grade";
  private Float maximumGrade;

  public static final String JSON_PROPERTY_ELEVATION_HIGH = "elevation_high";
  private Float elevationHigh;

  public static final String JSON_PROPERTY_ELEVATION_LOW = "elevation_low";
  private Float elevationLow;

  public static final String JSON_PROPERTY_START_LATLNG = "start_latlng";
  private List<Float> startLatlng = null;

  public static final String JSON_PROPERTY_END_LATLNG = "end_latlng";
  private List<Float> endLatlng = null;

  public static final String JSON_PROPERTY_CLIMB_CATEGORY = "climb_category";
  private Integer climbCategory;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  private Boolean _private;

  public static final String JSON_PROPERTY_ATHLETE_PR_EFFORT = "athlete_pr_effort";
  private SummarySegmentEffortDTO athletePrEffort;

  public static final String JSON_PROPERTY_ATHLETE_SEGMENT_STATS = "athlete_segment_stats";
  private SummaryPRSegmentEffortDTO athleteSegmentStats;


  public SummarySegmentDTO id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of this segment
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of this segment")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of this segment")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTIVITY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segment&#39;s distance, in meters
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment's distance, in meters")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segment&#39;s average grade, in percents
   * @return averageGrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment's average grade, in percents")
  @JsonProperty(JSON_PROPERTY_AVERAGE_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segments&#39;s maximum grade, in percents
   * @return maximumGrade
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's maximum grade, in percents")
  @JsonProperty(JSON_PROPERTY_MAXIMUM_GRADE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segments&#39;s highest elevation, in meters
   * @return elevationHigh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's highest elevation, in meters")
  @JsonProperty(JSON_PROPERTY_ELEVATION_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segments&#39;s lowest elevation, in meters
   * @return elevationLow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's lowest elevation, in meters")
  @JsonProperty(JSON_PROPERTY_ELEVATION_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.")
  @JsonProperty(JSON_PROPERTY_START_LATLNG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A pair of latitude/longitude coordinates, represented as an array of 2 floating point numbers.")
  @JsonProperty(JSON_PROPERTY_END_LATLNG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category.")
  @JsonProperty(JSON_PROPERTY_CLIMB_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segments&#39;s city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's city.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segments&#39;s state or geographical region.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segments's state or geographical region.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
   * The segment&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The segment's country.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this segment is private.")
  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATHLETE_PR_EFFORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATHLETE_SEGMENT_STATS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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

