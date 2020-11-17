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
 * UploadDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class UploadDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("id_str")
  private String idStr;

  @JsonProperty("external_id")
  private String externalId;

  @JsonProperty("error")
  private String error;

  @JsonProperty("status")
  private String status;

  @JsonProperty("activity_id")
  private Long activityId;

  public UploadDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the upload
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of the upload")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public UploadDTO idStr(String idStr) {
    this.idStr = idStr;
    return this;
  }

  /**
   * The unique identifier of the upload in string format
   * @return idStr
  */
  @ApiModelProperty(value = "The unique identifier of the upload in string format")


  public String getIdStr() {
    return idStr;
  }

  public void setIdStr(String idStr) {
    this.idStr = idStr;
  }

  public UploadDTO externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * The external identifier of the upload
   * @return externalId
  */
  @ApiModelProperty(value = "The external identifier of the upload")


  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public UploadDTO error(String error) {
    this.error = error;
    return this;
  }

  /**
   * The error associated with this upload
   * @return error
  */
  @ApiModelProperty(value = "The error associated with this upload")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public UploadDTO status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of this upload
   * @return status
  */
  @ApiModelProperty(value = "The status of this upload")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public UploadDTO activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The identifier of the activity this upload resulted into
   * @return activityId
  */
  @ApiModelProperty(value = "The identifier of the activity this upload resulted into")


  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadDTO upload = (UploadDTO) o;
    return Objects.equals(this.id, upload.id) &&
        Objects.equals(this.idStr, upload.idStr) &&
        Objects.equals(this.externalId, upload.externalId) &&
        Objects.equals(this.error, upload.error) &&
        Objects.equals(this.status, upload.status) &&
        Objects.equals(this.activityId, upload.activityId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, idStr, externalId, error, status, activityId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idStr: ").append(toIndentedString(idStr)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
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

