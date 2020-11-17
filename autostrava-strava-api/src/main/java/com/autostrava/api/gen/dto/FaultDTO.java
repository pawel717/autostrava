package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.ErrorDTO;
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
 * Encapsulates the errors that may be returned from the API.
 */
@ApiModel(description = "Encapsulates the errors that may be returned from the API.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class FaultDTO   {
  @JsonProperty("errors")
  @Valid
  private List<ErrorDTO> errors = null;

  @JsonProperty("message")
  private String message;

  public FaultDTO errors(List<ErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public FaultDTO addErrorsItem(ErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * The set of specific errors associated with this fault, if any.
   * @return errors
  */
  @ApiModelProperty(value = "The set of specific errors associated with this fault, if any.")

  @Valid

  public List<ErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDTO> errors) {
    this.errors = errors;
  }

  public FaultDTO message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The message of the fault.
   * @return message
  */
  @ApiModelProperty(value = "The message of the fault.")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FaultDTO fault = (FaultDTO) o;
    return Objects.equals(this.errors, fault.errors) &&
        Objects.equals(this.message, fault.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaultDTO {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

