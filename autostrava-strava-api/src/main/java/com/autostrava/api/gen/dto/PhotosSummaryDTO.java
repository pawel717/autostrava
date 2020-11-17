package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.PhotosSummaryPrimaryDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhotosSummaryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class PhotosSummaryDTO   {
  @JsonProperty("count")
  private Integer count;

  @JsonProperty("primary")
  private PhotosSummaryPrimaryDTO primary;

  public PhotosSummaryDTO count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * The number of photos
   * @return count
  */
  @ApiModelProperty(value = "The number of photos")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PhotosSummaryDTO primary(PhotosSummaryPrimaryDTO primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Get primary
   * @return primary
  */
  @ApiModelProperty(value = "")

  @Valid

  public PhotosSummaryPrimaryDTO getPrimary() {
    return primary;
  }

  public void setPrimary(PhotosSummaryPrimaryDTO primary) {
    this.primary = primary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotosSummaryDTO photosSummary = (PhotosSummaryDTO) o;
    return Objects.equals(this.count, photosSummary.count) &&
        Objects.equals(this.primary, photosSummary.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotosSummaryDTO {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

