package com.autostrava.api.gen.dto;

import java.util.Objects;
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
 * ExplorerSegmentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class ExplorerSegmentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("climb_category")
  private Integer climbCategory;

  /**
   * The description for the category of the climb
   */
  public enum ClimbCategoryDescEnum {
    NC("NC"),
    
    _4("4"),
    
    _3("3"),
    
    _2("2"),
    
    _1("1"),
    
    HC("HC");

    private String value;

    ClimbCategoryDescEnum(String value) {
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
    public static ClimbCategoryDescEnum fromValue(String value) {
      for (ClimbCategoryDescEnum b : ClimbCategoryDescEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("climb_category_desc")
  private ClimbCategoryDescEnum climbCategoryDesc;

  @JsonProperty("avg_grade")
  private Float avgGrade;

  @JsonProperty("start_latlng")
  @Valid
  private List<Float> startLatlng = null;

  @JsonProperty("end_latlng")
  @Valid
  private List<Float> endLatlng = null;

  @JsonProperty("elev_difference")
  private Float elevDifference;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("points")
  private String points;

  public ExplorerSegmentDTO id(Long id) {
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

  public ExplorerSegmentDTO name(String name) {
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

  public ExplorerSegmentDTO climbCategory(Integer climbCategory) {
    this.climbCategory = climbCategory;
    return this;
  }

  /**
   * The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category. If climb_category = 5, climb_category_desc = HC. If climb_category = 2, climb_category_desc = 3.
   * minimum: 0
   * maximum: 5
   * @return climbCategory
  */
  @ApiModelProperty(value = "The category of the climb [0, 5]. Higher is harder ie. 5 is Hors catégorie, 0 is uncategorized in climb_category. If climb_category = 5, climb_category_desc = HC. If climb_category = 2, climb_category_desc = 3.")

@Min(0) @Max(5) 
  public Integer getClimbCategory() {
    return climbCategory;
  }

  public void setClimbCategory(Integer climbCategory) {
    this.climbCategory = climbCategory;
  }

  public ExplorerSegmentDTO climbCategoryDesc(ClimbCategoryDescEnum climbCategoryDesc) {
    this.climbCategoryDesc = climbCategoryDesc;
    return this;
  }

  /**
   * The description for the category of the climb
   * @return climbCategoryDesc
  */
  @ApiModelProperty(value = "The description for the category of the climb")


  public ClimbCategoryDescEnum getClimbCategoryDesc() {
    return climbCategoryDesc;
  }

  public void setClimbCategoryDesc(ClimbCategoryDescEnum climbCategoryDesc) {
    this.climbCategoryDesc = climbCategoryDesc;
  }

  public ExplorerSegmentDTO avgGrade(Float avgGrade) {
    this.avgGrade = avgGrade;
    return this;
  }

  /**
   * The segment's average grade, in percents
   * @return avgGrade
  */
  @ApiModelProperty(value = "The segment's average grade, in percents")


  public Float getAvgGrade() {
    return avgGrade;
  }

  public void setAvgGrade(Float avgGrade) {
    this.avgGrade = avgGrade;
  }

  public ExplorerSegmentDTO startLatlng(List<Float> startLatlng) {
    this.startLatlng = startLatlng;
    return this;
  }

  public ExplorerSegmentDTO addStartLatlngItem(Float startLatlngItem) {
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

  public ExplorerSegmentDTO endLatlng(List<Float> endLatlng) {
    this.endLatlng = endLatlng;
    return this;
  }

  public ExplorerSegmentDTO addEndLatlngItem(Float endLatlngItem) {
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

  public ExplorerSegmentDTO elevDifference(Float elevDifference) {
    this.elevDifference = elevDifference;
    return this;
  }

  /**
   * The segments's evelation difference, in meters
   * @return elevDifference
  */
  @ApiModelProperty(value = "The segments's evelation difference, in meters")


  public Float getElevDifference() {
    return elevDifference;
  }

  public void setElevDifference(Float elevDifference) {
    this.elevDifference = elevDifference;
  }

  public ExplorerSegmentDTO distance(Float distance) {
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

  public ExplorerSegmentDTO points(String points) {
    this.points = points;
    return this;
  }

  /**
   * The polyline of the segment
   * @return points
  */
  @ApiModelProperty(value = "The polyline of the segment")


  public String getPoints() {
    return points;
  }

  public void setPoints(String points) {
    this.points = points;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplorerSegmentDTO explorerSegment = (ExplorerSegmentDTO) o;
    return Objects.equals(this.id, explorerSegment.id) &&
        Objects.equals(this.name, explorerSegment.name) &&
        Objects.equals(this.climbCategory, explorerSegment.climbCategory) &&
        Objects.equals(this.climbCategoryDesc, explorerSegment.climbCategoryDesc) &&
        Objects.equals(this.avgGrade, explorerSegment.avgGrade) &&
        Objects.equals(this.startLatlng, explorerSegment.startLatlng) &&
        Objects.equals(this.endLatlng, explorerSegment.endLatlng) &&
        Objects.equals(this.elevDifference, explorerSegment.elevDifference) &&
        Objects.equals(this.distance, explorerSegment.distance) &&
        Objects.equals(this.points, explorerSegment.points);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, climbCategory, climbCategoryDesc, avgGrade, startLatlng, endLatlng, elevDifference, distance, points);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplorerSegmentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    climbCategory: ").append(toIndentedString(climbCategory)).append("\n");
    sb.append("    climbCategoryDesc: ").append(toIndentedString(climbCategoryDesc)).append("\n");
    sb.append("    avgGrade: ").append(toIndentedString(avgGrade)).append("\n");
    sb.append("    startLatlng: ").append(toIndentedString(startLatlng)).append("\n");
    sb.append("    endLatlng: ").append(toIndentedString(endLatlng)).append("\n");
    sb.append("    elevDifference: ").append(toIndentedString(elevDifference)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
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

