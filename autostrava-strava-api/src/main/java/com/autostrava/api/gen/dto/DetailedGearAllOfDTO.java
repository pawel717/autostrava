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
 * DetailedGearAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedGearAllOfDTO   {
  @JsonProperty("brand_name")
  private String brandName;

  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("frame_type")
  private Integer frameType;

  @JsonProperty("description")
  private String description;

  public DetailedGearAllOfDTO brandName(String brandName) {
    this.brandName = brandName;
    return this;
  }

  /**
   * The gear's brand name.
   * @return brandName
  */
  @ApiModelProperty(value = "The gear's brand name.")


  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public DetailedGearAllOfDTO modelName(String modelName) {
    this.modelName = modelName;
    return this;
  }

  /**
   * The gear's model name.
   * @return modelName
  */
  @ApiModelProperty(value = "The gear's model name.")


  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }

  public DetailedGearAllOfDTO frameType(Integer frameType) {
    this.frameType = frameType;
    return this;
  }

  /**
   * The gear's frame type (bike only).
   * @return frameType
  */
  @ApiModelProperty(value = "The gear's frame type (bike only).")


  public Integer getFrameType() {
    return frameType;
  }

  public void setFrameType(Integer frameType) {
    this.frameType = frameType;
  }

  public DetailedGearAllOfDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The gear's description.
   * @return description
  */
  @ApiModelProperty(value = "The gear's description.")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedGearAllOfDTO detailedGearAllOf = (DetailedGearAllOfDTO) o;
    return Objects.equals(this.brandName, detailedGearAllOf.brandName) &&
        Objects.equals(this.modelName, detailedGearAllOf.modelName) &&
        Objects.equals(this.frameType, detailedGearAllOf.frameType) &&
        Objects.equals(this.description, detailedGearAllOf.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandName, modelName, frameType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedGearAllOfDTO {\n");
    
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    modelName: ").append(toIndentedString(modelName)).append("\n");
    sb.append("    frameType: ").append(toIndentedString(frameType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

