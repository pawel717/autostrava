package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.DetailedGearAllOfDTO;
import com.autostrava.api.gen.dto.SummaryGearDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedGearDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedGearDTO   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("resource_state")
  private Integer resourceState;

  @JsonProperty("primary")
  private Boolean primary;

  @JsonProperty("name")
  private String name;

  @JsonProperty("distance")
  private Float distance;

  @JsonProperty("brand_name")
  private String brandName;

  @JsonProperty("model_name")
  private String modelName;

  @JsonProperty("frame_type")
  private Integer frameType;

  @JsonProperty("description")
  private String description;

  public DetailedGearDTO id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The gear's unique identifier.
   * @return id
  */
  @ApiModelProperty(value = "The gear's unique identifier.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DetailedGearDTO resourceState(Integer resourceState) {
    this.resourceState = resourceState;
    return this;
  }

  /**
   * Resource state, indicates level of detail. Possible values: 2 -> \"summary\", 3 -> \"detail\"
   * @return resourceState
  */
  @ApiModelProperty(value = "Resource state, indicates level of detail. Possible values: 2 -> \"summary\", 3 -> \"detail\"")


  public Integer getResourceState() {
    return resourceState;
  }

  public void setResourceState(Integer resourceState) {
    this.resourceState = resourceState;
  }

  public DetailedGearDTO primary(Boolean primary) {
    this.primary = primary;
    return this;
  }

  /**
   * Whether this gear's is the owner's default one.
   * @return primary
  */
  @ApiModelProperty(value = "Whether this gear's is the owner's default one.")


  public Boolean isPrimary() {
    return primary;
  }

  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  public DetailedGearDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The gear's name.
   * @return name
  */
  @ApiModelProperty(value = "The gear's name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DetailedGearDTO distance(Float distance) {
    this.distance = distance;
    return this;
  }

  /**
   * The distance logged with this gear.
   * @return distance
  */
  @ApiModelProperty(value = "The distance logged with this gear.")


  public Float getDistance() {
    return distance;
  }

  public void setDistance(Float distance) {
    this.distance = distance;
  }

  public DetailedGearDTO brandName(String brandName) {
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

  public DetailedGearDTO modelName(String modelName) {
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

  public DetailedGearDTO frameType(Integer frameType) {
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

  public DetailedGearDTO description(String description) {
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
    DetailedGearDTO detailedGear = (DetailedGearDTO) o;
    return Objects.equals(this.id, detailedGear.id) &&
        Objects.equals(this.resourceState, detailedGear.resourceState) &&
        Objects.equals(this.primary, detailedGear.primary) &&
        Objects.equals(this.name, detailedGear.name) &&
        Objects.equals(this.distance, detailedGear.distance) &&
        Objects.equals(this.brandName, detailedGear.brandName) &&
        Objects.equals(this.modelName, detailedGear.modelName) &&
        Objects.equals(this.frameType, detailedGear.frameType) &&
        Objects.equals(this.description, detailedGear.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, primary, name, distance, brandName, modelName, frameType, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedGearDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceState: ").append(toIndentedString(resourceState)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

