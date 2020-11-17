package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PolylineMapDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class PolylineMapDTO   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("polyline")
  private String polyline;

  @JsonProperty("summary_polyline")
  private String summaryPolyline;

  public PolylineMapDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The identifier of the map
   * @return id
  */
  @ApiModelProperty(value = "The identifier of the map")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PolylineMapDTO polyline(String polyline) {
    this.polyline = polyline;
    return this;
  }

  /**
   * The polyline of the map, only returned on detailed representation of an object
   * @return polyline
  */
  @ApiModelProperty(value = "The polyline of the map, only returned on detailed representation of an object")


  public String getPolyline() {
    return polyline;
  }

  public void setPolyline(String polyline) {
    this.polyline = polyline;
  }

  public PolylineMapDTO summaryPolyline(String summaryPolyline) {
    this.summaryPolyline = summaryPolyline;
    return this;
  }

  /**
   * The summary polyline of the map
   * @return summaryPolyline
  */
  @ApiModelProperty(value = "The summary polyline of the map")


  public String getSummaryPolyline() {
    return summaryPolyline;
  }

  public void setSummaryPolyline(String summaryPolyline) {
    this.summaryPolyline = summaryPolyline;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolylineMapDTO polylineMap = (PolylineMapDTO) o;
    return Objects.equals(this.id, polylineMap.id) &&
        Objects.equals(this.polyline, polylineMap.polyline) &&
        Objects.equals(this.summaryPolyline, polylineMap.summaryPolyline);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, polyline, summaryPolyline);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolylineMapDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    polyline: ").append(toIndentedString(polyline)).append("\n");
    sb.append("    summaryPolyline: ").append(toIndentedString(summaryPolyline)).append("\n");
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

