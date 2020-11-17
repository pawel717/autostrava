package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.SummaryAthleteDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CommentDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class CommentDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("activity_id")
  private Long activityId;

  @JsonProperty("text")
  private String text;

  @JsonProperty("athlete")
  private SummaryAthleteDTO athlete = null;

  @JsonProperty("created_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public CommentDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of this comment
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of this comment")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public CommentDTO activityId(Long activityId) {
    this.activityId = activityId;
    return this;
  }

  /**
   * The identifier of the activity this comment is related to
   * @return activityId
  */
  @ApiModelProperty(value = "The identifier of the activity this comment is related to")


  public Long getActivityId() {
    return activityId;
  }

  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }

  public CommentDTO text(String text) {
    this.text = text;
    return this;
  }

  /**
   * The content of the comment
   * @return text
  */
  @ApiModelProperty(value = "The content of the comment")


  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public CommentDTO athlete(SummaryAthleteDTO athlete) {
    this.athlete = athlete;
    return this;
  }

  /**
   * Get athlete
   * @return athlete
  */
  @ApiModelProperty(value = "")

  @Valid

  public SummaryAthleteDTO getAthlete() {
    return athlete;
  }

  public void setAthlete(SummaryAthleteDTO athlete) {
    this.athlete = athlete;
  }

  public CommentDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which this comment was created.
   * @return createdAt
  */
  @ApiModelProperty(value = "The time at which this comment was created.")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommentDTO comment = (CommentDTO) o;
    return Objects.equals(this.id, comment.id) &&
        Objects.equals(this.activityId, comment.activityId) &&
        Objects.equals(this.text, comment.text) &&
        Objects.equals(this.athlete, comment.athlete) &&
        Objects.equals(this.createdAt, comment.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, activityId, text, athlete, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommentDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    athlete: ").append(toIndentedString(athlete)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

