package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.PolylineMapDTO;
import com.autostrava.api.gen.dto.SummaryAthleteDTO;
import com.autostrava.api.gen.dto.SummarySegmentDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RouteDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class RouteDTO   {
  @JsonProperty("athlete")
  private SummaryAthleteDTO athlete = null;

  @JsonProperty("description")
  private String description;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("elevation_gain")
  private Float elevationGain;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("id_str")
  private String idStr;

  @JsonProperty("map")
  private PolylineMapDTO map;

  @JsonProperty("name")
  private String name;

  @JsonProperty("private")
  private Boolean _private;

  @JsonProperty("starred")
  private Boolean starred;

  @JsonProperty("timestamp")
  private Integer timestamp;

  @JsonProperty("type")
  private Integer type;

  @JsonProperty("sub_type")
  private Integer subType;

  @JsonProperty("created_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  @JsonProperty("estimated_moving_time")
  private Integer estimatedMovingTime;

  @JsonProperty("segments")
  @Valid
  private List<SummarySegmentDTO> segments = null;

  public RouteDTO athlete(SummaryAthleteDTO athlete) {
    this.athlete = athlete;
    return this;
  }

  /**
   * Get athlete
   * @return athlete
  */
  @ApiModelProperty(value = "")

  @Valid

  public SummaryAthleteDTO getAthlete() {
    return athlete;
  }

  public void setAthlete(SummaryAthleteDTO athlete) {
    this.athlete = athlete;
  }

  public RouteDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the route
   * @return description
  */
  @ApiModelProperty(value = "The description of the route")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RouteDTO distance(Float distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The route's distance, in meters
   * @return distance
  */
  @ApiModelProperty(value = "The route's distance, in meters")


  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public RouteDTO elevationGain(Float elevationGain) {
    this.elevationGain = elevationGain;
    return this;
  }

  /**
   * The route's elevation gain.
   * @return elevationGain
  */
  @ApiModelProperty(value = "The route's elevation gain.")


  public Float getElevationGain() {
    return elevationGain;
  }

  public void setElevationGain(Float elevationGain) {
    this.elevationGain = elevationGain;
  }

  public RouteDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this route
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of this route")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public RouteDTO idStr(String idStr) {
    this.idStr = idStr;
    return this;
  }

  /**
   * The unique identifier of the route in string format
   * @return idStr
  */
  @ApiModelProperty(value = "The unique identifier of the route in string format")


  public String getIdStr() {
    return idStr;
  }

  public void setIdStr(String idStr) {
    this.idStr = idStr;
  }

  public RouteDTO map(PolylineMapDTO map) {
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

  public RouteDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of this route
   * @return name
  */
  @ApiModelProperty(value = "The name of this route")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RouteDTO _private(Boolean _private) {
    this._private = _private;
    return this;
  }

  /**
   * Whether this route is private
   * @return _private
  */
  @ApiModelProperty(value = "Whether this route is private")


  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public RouteDTO starred(Boolean starred) {
    this.starred = starred;
    return this;
  }

  /**
   * Whether this route is starred by the logged-in athlete
   * @return starred
  */
  @ApiModelProperty(value = "Whether this route is starred by the logged-in athlete")


  public Boolean isStarred() {
    return starred;
  }

  public void setStarred(Boolean starred) {
    this.starred = starred;
  }

  public RouteDTO timestamp(Integer timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * An epoch timestamp of when the route was created
   * @return timestamp
  */
  @ApiModelProperty(value = "An epoch timestamp of when the route was created")


  public Integer getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(Integer timestamp) {
    this.timestamp = timestamp;
  }

  public RouteDTO type(Integer type) {
    this.type = type;
    return this;
  }

  /**
   * This route's type (1 for ride, 2 for runs)
   * @return type
  */
  @ApiModelProperty(value = "This route's type (1 for ride, 2 for runs)")


  public Integer getType() {
    return type;
  }

  public void setType(Integer type) {
    this.type = type;
  }

  public RouteDTO subType(Integer subType) {
    this.subType = subType;
    return this;
  }

  /**
   * This route's sub-type (1 for road, 2 for mountain bike, 3 for cross, 4 for trail, 5 for mixed)
   * @return subType
  */
  @ApiModelProperty(value = "This route's sub-type (1 for road, 2 for mountain bike, 3 for cross, 4 for trail, 5 for mixed)")


  public Integer getSubType() {
    return subType;
  }

  public void setSubType(Integer subType) {
    this.subType = subType;
  }

  public RouteDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the route was created
   * @return createdAt
  */
  @ApiModelProperty(value = "The time at which the route was created")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public RouteDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time at which the route was last updated
   * @return updatedAt
  */
  @ApiModelProperty(value = "The time at which the route was last updated")

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public RouteDTO estimatedMovingTime(Integer estimatedMovingTime) {
    this.estimatedMovingTime = estimatedMovingTime;
    return this;
  }

  /**
   * Estimated time in seconds for the authenticated athlete to complete route
   * @return estimatedMovingTime
  */
  @ApiModelProperty(value = "Estimated time in seconds for the authenticated athlete to complete route")


  public Integer getEstimatedMovingTime() {
    return estimatedMovingTime;
  }

  public void setEstimatedMovingTime(Integer estimatedMovingTime) {
    this.estimatedMovingTime = estimatedMovingTime;
  }

  public RouteDTO segments(List<SummarySegmentDTO> segments) {
    this.segments = segments;
    return this;
  }

  public RouteDTO addSegmentsItem(SummarySegmentDTO segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * The segments traversed by this route
   * @return segments
  */
  @ApiModelProperty(value = "The segments traversed by this route")

  @Valid

  public List<SummarySegmentDTO> getSegments() {
    return segments;
  }

  public void setSegments(List<SummarySegmentDTO> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteDTO route = (RouteDTO) o;
    return Objects.equals(this.athlete, route.athlete) &&
        Objects.equals(this.description, route.description) &&
        Objects.equals(this.distance, route.distance) &&
        Objects.equals(this.elevationGain, route.elevationGain) &&
        Objects.equals(this.id, route.id) &&
        Objects.equals(this.idStr, route.idStr) &&
        Objects.equals(this.map, route.map) &&
        Objects.equals(this.name, route.name) &&
        Objects.equals(this._private, route._private) &&
        Objects.equals(this.starred, route.starred) &&
        Objects.equals(this.timestamp, route.timestamp) &&
        Objects.equals(this.type, route.type) &&
        Objects.equals(this.subType, route.subType) &&
        Objects.equals(this.createdAt, route.createdAt) &&
        Objects.equals(this.updatedAt, route.updatedAt) &&
        Objects.equals(this.estimatedMovingTime, route.estimatedMovingTime) &&
        Objects.equals(this.segments, route.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(athlete, description, distance, elevationGain, id, idStr, map, name, _private, starred, timestamp, type, subType, createdAt, updatedAt, estimatedMovingTime, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteDTO {\n");
    
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    elevationGain: ").append(toIndentedString(elevationGain)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStr: ").append(toIndentedString(idStr)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    estimatedMovingTime: ").append(toIndentedString(estimatedMovingTime)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

