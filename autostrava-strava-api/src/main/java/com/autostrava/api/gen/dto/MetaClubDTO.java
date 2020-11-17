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
 * MetaClubDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class MetaClubDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("resource_state")
  private Integer resourceState;

  @JsonProperty("name")
  private String name;

  public MetaClubDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The club's unique identifier.
   * @return id
  */
  @ApiModelProperty(value = "The club's unique identifier.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public MetaClubDTO resourceState(Integer resourceState) {
    this.resourceState = resourceState;
    return this;
  }

  /**
   * Resource state, indicates level of detail. Possible values: 1 -> \"meta\", 2 -> \"summary\", 3 -> \"detail\"
   * @return resourceState
  */
  @ApiModelProperty(value = "Resource state, indicates level of detail. Possible values: 1 -> \"meta\", 2 -> \"summary\", 3 -> \"detail\"")


  public Integer getResourceState() {
    return resourceState;
  }

  public void setResourceState(Integer resourceState) {
    this.resourceState = resourceState;
  }

  public MetaClubDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The club's name.
   * @return name
  */
  @ApiModelProperty(value = "The club's name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetaClubDTO metaClub = (MetaClubDTO) o;
    return Objects.equals(this.id, metaClub.id) &&
        Objects.equals(this.resourceState, metaClub.resourceState) &&
        Objects.equals(this.name, metaClub.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetaClubDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceState: ").append(toIndentedString(resourceState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

