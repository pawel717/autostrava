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
 * ErrorDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class ErrorDTO   {
  @JsonProperty("code")
  private String code;

  @JsonProperty("field")
  private String field;

  @JsonProperty("resource")
  private String resource;

  public ErrorDTO code(String code) {
    this.code = code;
    return this;
  }

  /**
   * The code associated with this error.
   * @return code
  */
  @ApiModelProperty(value = "The code associated with this error.")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ErrorDTO field(String field) {
    this.field = field;
    return this;
  }

  /**
   * The specific field or aspect of the resource associated with this error.
   * @return field
  */
  @ApiModelProperty(value = "The specific field or aspect of the resource associated with this error.")


  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ErrorDTO resource(String resource) {
    this.resource = resource;
    return this;
  }

  /**
   * The type of resource associated with this error.
   * @return resource
  */
  @ApiModelProperty(value = "The type of resource associated with this error.")


  public String getResource() {
    return resource;
  }

  public void setResource(String resource) {
    this.resource = resource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDTO error = (ErrorDTO) o;
    return Objects.equals(this.code, error.code) &&
        Objects.equals(this.field, error.field) &&
        Objects.equals(this.resource, error.resource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, field, resource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDTO {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
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

