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
import com.autostrava.api.gen.dto.ActivityTypeDTO;
import com.autostrava.api.gen.dto.MetaActivityDTO;
import com.autostrava.api.gen.dto.MetaAthleteDTO;
import com.autostrava.api.gen.dto.PolylineMapDTO;
import com.autostrava.api.gen.dto.SummaryActivityAllOfDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SummaryActivityDTO
 */
@JsonPropertyOrder({
  SummaryActivityDTO.JSON_PROPERTY_ID,
  SummaryActivityDTO.JSON_PROPERTY_EXTERNAL_ID,
  SummaryActivityDTO.JSON_PROPERTY_UPLOAD_ID,
  SummaryActivityDTO.JSON_PROPERTY_ATHLETE,
  SummaryActivityDTO.JSON_PROPERTY_NAME,
  SummaryActivityDTO.JSON_PROPERTY_DISTANCE,
  SummaryActivityDTO.JSON_PROPERTY_MOVING_TIME,
  SummaryActivityDTO.JSON_PROPERTY_ELAPSED_TIME,
  SummaryActivityDTO.JSON_PROPERTY_TOTAL_ELEVATION_GAIN,
  SummaryActivityDTO.JSON_PROPERTY_ELEV_HIGH,
  SummaryActivityDTO.JSON_PROPERTY_ELEV_LOW,
  SummaryActivityDTO.JSON_PROPERTY_TYPE,
  SummaryActivityDTO.JSON_PROPERTY_START_DATE,
  SummaryActivityDTO.JSON_PROPERTY_START_DATE_LOCAL,
  SummaryActivityDTO.JSON_PROPERTY_TIMEZONE,
  SummaryActivityDTO.JSON_PROPERTY_START_LATLNG,
  SummaryActivityDTO.JSON_PROPERTY_END_LATLNG,
  SummaryActivityDTO.JSON_PROPERTY_ACHIEVEMENT_COUNT,
  SummaryActivityDTO.JSON_PROPERTY_KUDOS_COUNT,
  SummaryActivityDTO.JSON_PROPERTY_COMMENT_COUNT,
  SummaryActivityDTO.JSON_PROPERTY_ATHLETE_COUNT,
  SummaryActivityDTO.JSON_PROPERTY_PHOTO_COUNT,
  SummaryActivityDTO.JSON_PROPERTY_TOTAL_PHOTO_COUNT,
  SummaryActivityDTO.JSON_PROPERTY_MAP,
  SummaryActivityDTO.JSON_PROPERTY_TRAINER,
  SummaryActivityDTO.JSON_PROPERTY_COMMUTE,
  SummaryActivityDTO.JSON_PROPERTY_MANUAL,
  SummaryActivityDTO.JSON_PROPERTY_PRIVATE,
  SummaryActivityDTO.JSON_PROPERTY_FLAGGED,
  SummaryActivityDTO.JSON_PROPERTY_WORKOUT_TYPE,
  SummaryActivityDTO.JSON_PROPERTY_UPLOAD_ID_STR,
  SummaryActivityDTO.JSON_PROPERTY_AVERAGE_SPEED,
  SummaryActivityDTO.JSON_PROPERTY_MAX_SPEED,
  SummaryActivityDTO.JSON_PROPERTY_HAS_KUDOED,
  SummaryActivityDTO.JSON_PROPERTY_GEAR_ID,
  SummaryActivityDTO.JSON_PROPERTY_KILOJOULES,
  SummaryActivityDTO.JSON_PROPERTY_AVERAGE_WATTS,
  SummaryActivityDTO.JSON_PROPERTY_DEVICE_WATTS,
  SummaryActivityDTO.JSON_PROPERTY_MAX_WATTS,
  SummaryActivityDTO.JSON_PROPERTY_WEIGHTED_AVERAGE_WATTS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T20:13:51.882+01:00[Europe/Belgrade]")
public class SummaryActivityDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private String externalId;

  public static final String JSON_PROPERTY_UPLOAD_ID = "upload_id";
  private Long uploadId;

  public static final String JSON_PROPERTY_ATHLETE = "athlete";
  private MetaAthleteDTO athlete;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DISTANCE = "distance";
  private Float distance;

  public static final String JSON_PROPERTY_MOVING_TIME = "moving_time";
  private Integer movingTime;

  public static final String JSON_PROPERTY_ELAPSED_TIME = "elapsed_time";
  private Integer elapsedTime;

  public static final String JSON_PROPERTY_TOTAL_ELEVATION_GAIN = "total_elevation_gain";
  private Float totalElevationGain;

  public static final String JSON_PROPERTY_ELEV_HIGH = "elev_high";
  private Float elevHigh;

  public static final String JSON_PROPERTY_ELEV_LOW = "elev_low";
  private Float elevLow;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ActivityTypeDTO type;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public static final String JSON_PROPERTY_START_DATE_LOCAL = "start_date_local";
  private OffsetDateTime startDateLocal;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_START_LATLNG = "start_latlng";
  private List<Float> startLatlng = null;

  public static final String JSON_PROPERTY_END_LATLNG = "end_latlng";
  private List<Float> endLatlng = null;

  public static final String JSON_PROPERTY_ACHIEVEMENT_COUNT = "achievement_count";
  private Integer achievementCount;

  public static final String JSON_PROPERTY_KUDOS_COUNT = "kudos_count";
  private Integer kudosCount;

  public static final String JSON_PROPERTY_COMMENT_COUNT = "comment_count";
  private Integer commentCount;

  public static final String JSON_PROPERTY_ATHLETE_COUNT = "athlete_count";
  private Integer athleteCount;

  public static final String JSON_PROPERTY_PHOTO_COUNT = "photo_count";
  private Integer photoCount;

  public static final String JSON_PROPERTY_TOTAL_PHOTO_COUNT = "total_photo_count";
  private Integer totalPhotoCount;

  public static final String JSON_PROPERTY_MAP = "map";
  private PolylineMapDTO map;

  public static final String JSON_PROPERTY_TRAINER = "trainer";
  private Boolean trainer;

  public static final String JSON_PROPERTY_COMMUTE = "commute";
  private Boolean commute;

  public static final String JSON_PROPERTY_MANUAL = "manual";
  private Boolean manual;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  private Boolean _private;

  public static final String JSON_PROPERTY_FLAGGED = "flagged";
  private Boolean flagged;

  public static final String JSON_PROPERTY_WORKOUT_TYPE = "workout_type";
  private Integer workoutType;

  public static final String JSON_PROPERTY_UPLOAD_ID_STR = "upload_id_str";
  private String uploadIdStr;

  public static final String JSON_PROPERTY_AVERAGE_SPEED = "average_speed";
  private Float averageSpeed;

  public static final String JSON_PROPERTY_MAX_SPEED = "max_speed";
  private Float maxSpeed;

  public static final String JSON_PROPERTY_HAS_KUDOED = "has_kudoed";
  private Boolean hasKudoed;

  public static final String JSON_PROPERTY_GEAR_ID = "gear_id";
  private String gearId;

  public static final String JSON_PROPERTY_KILOJOULES = "kilojoules";
  private Float kilojoules;

  public static final String JSON_PROPERTY_AVERAGE_WATTS = "average_watts";
  private Float averageWatts;

  public static final String JSON_PROPERTY_DEVICE_WATTS = "device_watts";
  private Boolean deviceWatts;

  public static final String JSON_PROPERTY_MAX_WATTS = "max_watts";
  private Integer maxWatts;

  public static final String JSON_PROPERTY_WEIGHTED_AVERAGE_WATTS = "weighted_average_watts";
  private Integer weightedAverageWatts;


  public SummaryActivityDTO id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique identifier of the activity
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the activity")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public SummaryActivityDTO externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * The identifier provided at upload time
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier provided at upload time")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public SummaryActivityDTO uploadId(Long uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * The identifier of the upload that resulted in this activity
   * @return uploadId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The identifier of the upload that resulted in this activity")
  @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getUploadId() {
    return uploadId;
  }


  public void setUploadId(Long uploadId) {
    this.uploadId = uploadId;
  }


  public SummaryActivityDTO athlete(MetaAthleteDTO athlete) {
    
    this.athlete = athlete;
    return this;
  }

   /**
   * Get athlete
   * @return athlete
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATHLETE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MetaAthleteDTO getAthlete() {
    return athlete;
  }


  public void setAthlete(MetaAthleteDTO athlete) {
    this.athlete = athlete;
  }


  public SummaryActivityDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the activity
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the activity")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SummaryActivityDTO distance(Float distance) {
    
    this.distance = distance;
    return this;
  }

   /**
   * The activity&#39;s distance, in meters
   * @return distance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's distance, in meters")
  @JsonProperty(JSON_PROPERTY_DISTANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getDistance() {
    return distance;
  }


  public void setDistance(Float distance) {
    this.distance = distance;
  }


  public SummaryActivityDTO movingTime(Integer movingTime) {
    
    this.movingTime = movingTime;
    return this;
  }

   /**
   * The activity&#39;s moving time, in seconds
   * @return movingTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's moving time, in seconds")
  @JsonProperty(JSON_PROPERTY_MOVING_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMovingTime() {
    return movingTime;
  }


  public void setMovingTime(Integer movingTime) {
    this.movingTime = movingTime;
  }


  public SummaryActivityDTO elapsedTime(Integer elapsedTime) {
    
    this.elapsedTime = elapsedTime;
    return this;
  }

   /**
   * The activity&#39;s elapsed time, in seconds
   * @return elapsedTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's elapsed time, in seconds")
  @JsonProperty(JSON_PROPERTY_ELAPSED_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getElapsedTime() {
    return elapsedTime;
  }


  public void setElapsedTime(Integer elapsedTime) {
    this.elapsedTime = elapsedTime;
  }


  public SummaryActivityDTO totalElevationGain(Float totalElevationGain) {
    
    this.totalElevationGain = totalElevationGain;
    return this;
  }

   /**
   * The activity&#39;s total elevation gain.
   * @return totalElevationGain
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's total elevation gain.")
  @JsonProperty(JSON_PROPERTY_TOTAL_ELEVATION_GAIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getTotalElevationGain() {
    return totalElevationGain;
  }


  public void setTotalElevationGain(Float totalElevationGain) {
    this.totalElevationGain = totalElevationGain;
  }


  public SummaryActivityDTO elevHigh(Float elevHigh) {
    
    this.elevHigh = elevHigh;
    return this;
  }

   /**
   * The activity&#39;s highest elevation, in meters
   * @return elevHigh
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's highest elevation, in meters")
  @JsonProperty(JSON_PROPERTY_ELEV_HIGH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getElevHigh() {
    return elevHigh;
  }


  public void setElevHigh(Float elevHigh) {
    this.elevHigh = elevHigh;
  }


  public SummaryActivityDTO elevLow(Float elevLow) {
    
    this.elevLow = elevLow;
    return this;
  }

   /**
   * The activity&#39;s lowest elevation, in meters
   * @return elevLow
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's lowest elevation, in meters")
  @JsonProperty(JSON_PROPERTY_ELEV_LOW)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getElevLow() {
    return elevLow;
  }


  public void setElevLow(Float elevLow) {
    this.elevLow = elevLow;
  }


  public SummaryActivityDTO type(ActivityTypeDTO type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ActivityTypeDTO getType() {
    return type;
  }


  public void setType(ActivityTypeDTO type) {
    this.type = type;
  }


  public SummaryActivityDTO startDate(OffsetDateTime startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * The time at which the activity was started.
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the activity was started.")
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDate() {
    return startDate;
  }


  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }


  public SummaryActivityDTO startDateLocal(OffsetDateTime startDateLocal) {
    
    this.startDateLocal = startDateLocal;
    return this;
  }

   /**
   * The time at which the activity was started in the local timezone.
   * @return startDateLocal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time at which the activity was started in the local timezone.")
  @JsonProperty(JSON_PROPERTY_START_DATE_LOCAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getStartDateLocal() {
    return startDateLocal;
  }


  public void setStartDateLocal(OffsetDateTime startDateLocal) {
    this.startDateLocal = startDateLocal;
  }


  public SummaryActivityDTO timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * The timezone of the activity
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The timezone of the activity")
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public SummaryActivityDTO startLatlng(List<Float> startLatlng) {
    
    this.startLatlng = startLatlng;
    return this;
  }

  public SummaryActivityDTO addStartLatlngItem(Float startLatlngItem) {
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


  public SummaryActivityDTO endLatlng(List<Float> endLatlng) {
    
    this.endLatlng = endLatlng;
    return this;
  }

  public SummaryActivityDTO addEndLatlngItem(Float endLatlngItem) {
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


  public SummaryActivityDTO achievementCount(Integer achievementCount) {
    
    this.achievementCount = achievementCount;
    return this;
  }

   /**
   * The number of achievements gained during this activity
   * @return achievementCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of achievements gained during this activity")
  @JsonProperty(JSON_PROPERTY_ACHIEVEMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAchievementCount() {
    return achievementCount;
  }


  public void setAchievementCount(Integer achievementCount) {
    this.achievementCount = achievementCount;
  }


  public SummaryActivityDTO kudosCount(Integer kudosCount) {
    
    this.kudosCount = kudosCount;
    return this;
  }

   /**
   * The number of kudos given for this activity
   * @return kudosCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of kudos given for this activity")
  @JsonProperty(JSON_PROPERTY_KUDOS_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getKudosCount() {
    return kudosCount;
  }


  public void setKudosCount(Integer kudosCount) {
    this.kudosCount = kudosCount;
  }


  public SummaryActivityDTO commentCount(Integer commentCount) {
    
    this.commentCount = commentCount;
    return this;
  }

   /**
   * The number of comments for this activity
   * @return commentCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of comments for this activity")
  @JsonProperty(JSON_PROPERTY_COMMENT_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getCommentCount() {
    return commentCount;
  }


  public void setCommentCount(Integer commentCount) {
    this.commentCount = commentCount;
  }


  public SummaryActivityDTO athleteCount(Integer athleteCount) {
    
    this.athleteCount = athleteCount;
    return this;
  }

   /**
   * The number of athletes for taking part in a group activity
   * minimum: 1
   * @return athleteCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of athletes for taking part in a group activity")
  @JsonProperty(JSON_PROPERTY_ATHLETE_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getAthleteCount() {
    return athleteCount;
  }


  public void setAthleteCount(Integer athleteCount) {
    this.athleteCount = athleteCount;
  }


  public SummaryActivityDTO photoCount(Integer photoCount) {
    
    this.photoCount = photoCount;
    return this;
  }

   /**
   * The number of Instagram photos for this activity
   * @return photoCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of Instagram photos for this activity")
  @JsonProperty(JSON_PROPERTY_PHOTO_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getPhotoCount() {
    return photoCount;
  }


  public void setPhotoCount(Integer photoCount) {
    this.photoCount = photoCount;
  }


  public SummaryActivityDTO totalPhotoCount(Integer totalPhotoCount) {
    
    this.totalPhotoCount = totalPhotoCount;
    return this;
  }

   /**
   * The number of Instagram and Strava photos for this activity
   * @return totalPhotoCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of Instagram and Strava photos for this activity")
  @JsonProperty(JSON_PROPERTY_TOTAL_PHOTO_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getTotalPhotoCount() {
    return totalPhotoCount;
  }


  public void setTotalPhotoCount(Integer totalPhotoCount) {
    this.totalPhotoCount = totalPhotoCount;
  }


  public SummaryActivityDTO map(PolylineMapDTO map) {
    
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PolylineMapDTO getMap() {
    return map;
  }


  public void setMap(PolylineMapDTO map) {
    this.map = map;
  }


  public SummaryActivityDTO trainer(Boolean trainer) {
    
    this.trainer = trainer;
    return this;
  }

   /**
   * Whether this activity was recorded on a training machine
   * @return trainer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this activity was recorded on a training machine")
  @JsonProperty(JSON_PROPERTY_TRAINER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isTrainer() {
    return trainer;
  }


  public void setTrainer(Boolean trainer) {
    this.trainer = trainer;
  }


  public SummaryActivityDTO commute(Boolean commute) {
    
    this.commute = commute;
    return this;
  }

   /**
   * Whether this activity is a commute
   * @return commute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this activity is a commute")
  @JsonProperty(JSON_PROPERTY_COMMUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isCommute() {
    return commute;
  }


  public void setCommute(Boolean commute) {
    this.commute = commute;
  }


  public SummaryActivityDTO manual(Boolean manual) {
    
    this.manual = manual;
    return this;
  }

   /**
   * Whether this activity was created manually
   * @return manual
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this activity was created manually")
  @JsonProperty(JSON_PROPERTY_MANUAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isManual() {
    return manual;
  }


  public void setManual(Boolean manual) {
    this.manual = manual;
  }


  public SummaryActivityDTO _private(Boolean _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * Whether this activity is private
   * @return _private
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this activity is private")
  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isPrivate() {
    return _private;
  }


  public void setPrivate(Boolean _private) {
    this._private = _private;
  }


  public SummaryActivityDTO flagged(Boolean flagged) {
    
    this.flagged = flagged;
    return this;
  }

   /**
   * Whether this activity is flagged
   * @return flagged
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this activity is flagged")
  @JsonProperty(JSON_PROPERTY_FLAGGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isFlagged() {
    return flagged;
  }


  public void setFlagged(Boolean flagged) {
    this.flagged = flagged;
  }


  public SummaryActivityDTO workoutType(Integer workoutType) {
    
    this.workoutType = workoutType;
    return this;
  }

   /**
   * The activity&#39;s workout type
   * @return workoutType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's workout type")
  @JsonProperty(JSON_PROPERTY_WORKOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWorkoutType() {
    return workoutType;
  }


  public void setWorkoutType(Integer workoutType) {
    this.workoutType = workoutType;
  }


  public SummaryActivityDTO uploadIdStr(String uploadIdStr) {
    
    this.uploadIdStr = uploadIdStr;
    return this;
  }

   /**
   * The unique identifier of the upload in string format
   * @return uploadIdStr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier of the upload in string format")
  @JsonProperty(JSON_PROPERTY_UPLOAD_ID_STR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUploadIdStr() {
    return uploadIdStr;
  }


  public void setUploadIdStr(String uploadIdStr) {
    this.uploadIdStr = uploadIdStr;
  }


  public SummaryActivityDTO averageSpeed(Float averageSpeed) {
    
    this.averageSpeed = averageSpeed;
    return this;
  }

   /**
   * The activity&#39;s average speed, in meters per second
   * @return averageSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's average speed, in meters per second")
  @JsonProperty(JSON_PROPERTY_AVERAGE_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageSpeed() {
    return averageSpeed;
  }


  public void setAverageSpeed(Float averageSpeed) {
    this.averageSpeed = averageSpeed;
  }


  public SummaryActivityDTO maxSpeed(Float maxSpeed) {
    
    this.maxSpeed = maxSpeed;
    return this;
  }

   /**
   * The activity&#39;s max speed, in meters per second
   * @return maxSpeed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The activity's max speed, in meters per second")
  @JsonProperty(JSON_PROPERTY_MAX_SPEED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getMaxSpeed() {
    return maxSpeed;
  }


  public void setMaxSpeed(Float maxSpeed) {
    this.maxSpeed = maxSpeed;
  }


  public SummaryActivityDTO hasKudoed(Boolean hasKudoed) {
    
    this.hasKudoed = hasKudoed;
    return this;
  }

   /**
   * Whether the logged-in athlete has kudoed this activity
   * @return hasKudoed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the logged-in athlete has kudoed this activity")
  @JsonProperty(JSON_PROPERTY_HAS_KUDOED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isHasKudoed() {
    return hasKudoed;
  }


  public void setHasKudoed(Boolean hasKudoed) {
    this.hasKudoed = hasKudoed;
  }


  public SummaryActivityDTO gearId(String gearId) {
    
    this.gearId = gearId;
    return this;
  }

   /**
   * The id of the gear for the activity
   * @return gearId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The id of the gear for the activity")
  @JsonProperty(JSON_PROPERTY_GEAR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGearId() {
    return gearId;
  }


  public void setGearId(String gearId) {
    this.gearId = gearId;
  }


  public SummaryActivityDTO kilojoules(Float kilojoules) {
    
    this.kilojoules = kilojoules;
    return this;
  }

   /**
   * The total work done in kilojoules during this activity. Rides only
   * @return kilojoules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The total work done in kilojoules during this activity. Rides only")
  @JsonProperty(JSON_PROPERTY_KILOJOULES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getKilojoules() {
    return kilojoules;
  }


  public void setKilojoules(Float kilojoules) {
    this.kilojoules = kilojoules;
  }


  public SummaryActivityDTO averageWatts(Float averageWatts) {
    
    this.averageWatts = averageWatts;
    return this;
  }

   /**
   * Average power output in watts during this activity. Rides only
   * @return averageWatts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Average power output in watts during this activity. Rides only")
  @JsonProperty(JSON_PROPERTY_AVERAGE_WATTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Float getAverageWatts() {
    return averageWatts;
  }


  public void setAverageWatts(Float averageWatts) {
    this.averageWatts = averageWatts;
  }


  public SummaryActivityDTO deviceWatts(Boolean deviceWatts) {
    
    this.deviceWatts = deviceWatts;
    return this;
  }

   /**
   * Whether the watts are from a power meter, false if estimated
   * @return deviceWatts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the watts are from a power meter, false if estimated")
  @JsonProperty(JSON_PROPERTY_DEVICE_WATTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isDeviceWatts() {
    return deviceWatts;
  }


  public void setDeviceWatts(Boolean deviceWatts) {
    this.deviceWatts = deviceWatts;
  }


  public SummaryActivityDTO maxWatts(Integer maxWatts) {
    
    this.maxWatts = maxWatts;
    return this;
  }

   /**
   * Rides with power meter data only
   * @return maxWatts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Rides with power meter data only")
  @JsonProperty(JSON_PROPERTY_MAX_WATTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMaxWatts() {
    return maxWatts;
  }


  public void setMaxWatts(Integer maxWatts) {
    this.maxWatts = maxWatts;
  }


  public SummaryActivityDTO weightedAverageWatts(Integer weightedAverageWatts) {
    
    this.weightedAverageWatts = weightedAverageWatts;
    return this;
  }

   /**
   * Similar to Normalized Power. Rides with power meter data only
   * @return weightedAverageWatts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Similar to Normalized Power. Rides with power meter data only")
  @JsonProperty(JSON_PROPERTY_WEIGHTED_AVERAGE_WATTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getWeightedAverageWatts() {
    return weightedAverageWatts;
  }


  public void setWeightedAverageWatts(Integer weightedAverageWatts) {
    this.weightedAverageWatts = weightedAverageWatts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryActivityDTO summaryActivity = (SummaryActivityDTO) o;
    return Objects.equals(this.id, summaryActivity.id) &&
        Objects.equals(this.externalId, summaryActivity.externalId) &&
        Objects.equals(this.uploadId, summaryActivity.uploadId) &&
        Objects.equals(this.athlete, summaryActivity.athlete) &&
        Objects.equals(this.name, summaryActivity.name) &&
        Objects.equals(this.distance, summaryActivity.distance) &&
        Objects.equals(this.movingTime, summaryActivity.movingTime) &&
        Objects.equals(this.elapsedTime, summaryActivity.elapsedTime) &&
        Objects.equals(this.totalElevationGain, summaryActivity.totalElevationGain) &&
        Objects.equals(this.elevHigh, summaryActivity.elevHigh) &&
        Objects.equals(this.elevLow, summaryActivity.elevLow) &&
        Objects.equals(this.type, summaryActivity.type) &&
        Objects.equals(this.startDate, summaryActivity.startDate) &&
        Objects.equals(this.startDateLocal, summaryActivity.startDateLocal) &&
        Objects.equals(this.timezone, summaryActivity.timezone) &&
        Objects.equals(this.startLatlng, summaryActivity.startLatlng) &&
        Objects.equals(this.endLatlng, summaryActivity.endLatlng) &&
        Objects.equals(this.achievementCount, summaryActivity.achievementCount) &&
        Objects.equals(this.kudosCount, summaryActivity.kudosCount) &&
        Objects.equals(this.commentCount, summaryActivity.commentCount) &&
        Objects.equals(this.athleteCount, summaryActivity.athleteCount) &&
        Objects.equals(this.photoCount, summaryActivity.photoCount) &&
        Objects.equals(this.totalPhotoCount, summaryActivity.totalPhotoCount) &&
        Objects.equals(this.map, summaryActivity.map) &&
        Objects.equals(this.trainer, summaryActivity.trainer) &&
        Objects.equals(this.commute, summaryActivity.commute) &&
        Objects.equals(this.manual, summaryActivity.manual) &&
        Objects.equals(this._private, summaryActivity._private) &&
        Objects.equals(this.flagged, summaryActivity.flagged) &&
        Objects.equals(this.workoutType, summaryActivity.workoutType) &&
        Objects.equals(this.uploadIdStr, summaryActivity.uploadIdStr) &&
        Objects.equals(this.averageSpeed, summaryActivity.averageSpeed) &&
        Objects.equals(this.maxSpeed, summaryActivity.maxSpeed) &&
        Objects.equals(this.hasKudoed, summaryActivity.hasKudoed) &&
        Objects.equals(this.gearId, summaryActivity.gearId) &&
        Objects.equals(this.kilojoules, summaryActivity.kilojoules) &&
        Objects.equals(this.averageWatts, summaryActivity.averageWatts) &&
        Objects.equals(this.deviceWatts, summaryActivity.deviceWatts) &&
        Objects.equals(this.maxWatts, summaryActivity.maxWatts) &&
        Objects.equals(this.weightedAverageWatts, summaryActivity.weightedAverageWatts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, uploadId, athlete, name, distance, movingTime, elapsedTime, totalElevationGain, elevHigh, elevLow, type, startDate, startDateLocal, timezone, startLatlng, endLatlng, achievementCount, kudosCount, commentCount, athleteCount, photoCount, totalPhotoCount, map, trainer, commute, manual, _private, flagged, workoutType, uploadIdStr, averageSpeed, maxSpeed, hasKudoed, gearId, kilojoules, averageWatts, deviceWatts, maxWatts, weightedAverageWatts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryActivityDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    movingTime: ").append(toIndentedString(movingTime)).append("\n");
    sb.append("    elapsedTime: ").append(toIndentedString(elapsedTime)).append("\n");
    sb.append("    totalElevationGain: ").append(toIndentedString(totalElevationGain)).append("\n");
    sb.append("    elevHigh: ").append(toIndentedString(elevHigh)).append("\n");
    sb.append("    elevLow: ").append(toIndentedString(elevLow)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    startDateLocal: ").append(toIndentedString(startDateLocal)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    startLatlng: ").append(toIndentedString(startLatlng)).append("\n");
    sb.append("    endLatlng: ").append(toIndentedString(endLatlng)).append("\n");
    sb.append("    achievementCount: ").append(toIndentedString(achievementCount)).append("\n");
    sb.append("    kudosCount: ").append(toIndentedString(kudosCount)).append("\n");
    sb.append("    commentCount: ").append(toIndentedString(commentCount)).append("\n");
    sb.append("    athleteCount: ").append(toIndentedString(athleteCount)).append("\n");
    sb.append("    photoCount: ").append(toIndentedString(photoCount)).append("\n");
    sb.append("    totalPhotoCount: ").append(toIndentedString(totalPhotoCount)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    trainer: ").append(toIndentedString(trainer)).append("\n");
    sb.append("    commute: ").append(toIndentedString(commute)).append("\n");
    sb.append("    manual: ").append(toIndentedString(manual)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    flagged: ").append(toIndentedString(flagged)).append("\n");
    sb.append("    workoutType: ").append(toIndentedString(workoutType)).append("\n");
    sb.append("    uploadIdStr: ").append(toIndentedString(uploadIdStr)).append("\n");
    sb.append("    averageSpeed: ").append(toIndentedString(averageSpeed)).append("\n");
    sb.append("    maxSpeed: ").append(toIndentedString(maxSpeed)).append("\n");
    sb.append("    hasKudoed: ").append(toIndentedString(hasKudoed)).append("\n");
    sb.append("    gearId: ").append(toIndentedString(gearId)).append("\n");
    sb.append("    kilojoules: ").append(toIndentedString(kilojoules)).append("\n");
    sb.append("    averageWatts: ").append(toIndentedString(averageWatts)).append("\n");
    sb.append("    deviceWatts: ").append(toIndentedString(deviceWatts)).append("\n");
    sb.append("    maxWatts: ").append(toIndentedString(maxWatts)).append("\n");
    sb.append("    weightedAverageWatts: ").append(toIndentedString(weightedAverageWatts)).append("\n");
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

