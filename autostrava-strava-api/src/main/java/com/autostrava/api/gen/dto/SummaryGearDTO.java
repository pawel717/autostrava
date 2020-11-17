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
 * SummaryGearDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SummaryGearDTO   {
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

  public SummaryGearDTO id(String id) {
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

  public SummaryGearDTO resourceState(Integer resourceState) {
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

  public SummaryGearDTO primary(Boolean primary) {
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

  public SummaryGearDTO name(String name) {
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

  public SummaryGearDTO distance(Float distance) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryGearDTO summaryGear = (SummaryGearDTO) o;
    return Objects.equals(this.id, summaryGear.id) &&
        Objects.equals(this.resourceState, summaryGear.resourceState) &&
        Objects.equals(this.primary, summaryGear.primary) &&
        Objects.equals(this.name, summaryGear.name) &&
        Objects.equals(this.distance, summaryGear.distance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, primary, name, distance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryGearDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceState: ").append(toIndentedString(resourceState)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
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

