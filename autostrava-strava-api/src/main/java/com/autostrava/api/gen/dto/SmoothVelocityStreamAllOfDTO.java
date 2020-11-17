package com.autostrava.api.gen.dto;

import java.util.Objects;
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
 * SmoothVelocityStreamAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SmoothVelocityStreamAllOfDTO   {
  @JsonProperty("data")
  @Valid
  private List<Float> data = null;

  public SmoothVelocityStreamAllOfDTO data(List<Float> data) {
    this.data = data;
    return this;
  }

  public SmoothVelocityStreamAllOfDTO addDataItem(Float dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * The sequence of velocity values for this stream, in meters per second
   * @return data
  */
  @ApiModelProperty(value = "The sequence of velocity values for this stream, in meters per second")


  public List<Float> getData() {
    return data;
  }

  public void setData(List<Float> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmoothVelocityStreamAllOfDTO smoothVelocityStreamAllOf = (SmoothVelocityStreamAllOfDTO) o;
    return Objects.equals(this.data, smoothVelocityStreamAllOf.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmoothVelocityStreamAllOfDTO {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

