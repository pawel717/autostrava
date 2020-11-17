package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.ActivityTypeDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdatableActivityDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class UpdatableActivityDTO   {
  @JsonProperty("commute")
  private Boolean commute;

  @JsonProperty("trainer")
  private Boolean trainer;

  @JsonProperty("description")
  private String description;

  @JsonProperty("name")
  private String name;

  @JsonProperty("type")
  private ActivityTypeDTO type;

  @JsonProperty("gear_id")
  private String gearId;

  public UpdatableActivityDTO commute(Boolean commute) {
    this.commute = commute;
    return this;
  }

  /**
   * Whether this activity is a commute
   * @return commute
  */
  @ApiModelProperty(value = "Whether this activity is a commute")


  public Boolean isCommute() {
    return commute;
  }

  public void setCommute(Boolean commute) {
    this.commute = commute;
  }

  public UpdatableActivityDTO trainer(Boolean trainer) {
    this.trainer = trainer;
    return this;
  }

  /**
   * Whether this activity was recorded on a training machine
   * @return trainer
  */
  @ApiModelProperty(value = "Whether this activity was recorded on a training machine")


  public Boolean isTrainer() {
    return trainer;
  }

  public void setTrainer(Boolean trainer) {
    this.trainer = trainer;
  }

  public UpdatableActivityDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the activity
   * @return description
  */
  @ApiModelProperty(value = "The description of the activity")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdatableActivityDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the activity
   * @return name
  */
  @ApiModelProperty(value = "The name of the activity")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdatableActivityDTO type(ActivityTypeDTO type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")

  @Valid

  public ActivityTypeDTO getType() {
    return type;
  }

  public void setType(ActivityTypeDTO type) {
    this.type = type;
  }

  public UpdatableActivityDTO gearId(String gearId) {
    this.gearId = gearId;
    return this;
  }

  /**
   * Identifier for the gear associated with the activity. ‘none’ clears gear from activity
   * @return gearId
  */
  @ApiModelProperty(value = "Identifier for the gear associated with the activity. ‘none’ clears gear from activity")


  public String getGearId() {
    return gearId;
  }

  public void setGearId(String gearId) {
    this.gearId = gearId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatableActivityDTO updatableActivity = (UpdatableActivityDTO) o;
    return Objects.equals(this.commute, updatableActivity.commute) &&
        Objects.equals(this.trainer, updatableActivity.trainer) &&
        Objects.equals(this.description, updatableActivity.description) &&
        Objects.equals(this.name, updatableActivity.name) &&
        Objects.equals(this.type, updatableActivity.type) &&
        Objects.equals(this.gearId, updatableActivity.gearId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commute, trainer, description, name, type, gearId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatableActivityDTO {\n");
    
    sb.append("    commute: ").append(toIndentedString(commute)).append("\n");
    sb.append("    trainer: ").append(toIndentedString(trainer)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    gearId: ").append(toIndentedString(gearId)).append("\n");
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

