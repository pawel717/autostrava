package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.ExplorerSegmentDTO;
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
 * ExplorerResponseDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class ExplorerResponseDTO   {
  @JsonProperty("segments")
  @Valid
  private List<ExplorerSegmentDTO> segments = null;

  public ExplorerResponseDTO segments(List<ExplorerSegmentDTO> segments) {
    this.segments = segments;
    return this;
  }

  public ExplorerResponseDTO addSegmentsItem(ExplorerSegmentDTO segmentsItem) {
    if (this.segments == null) {
      this.segments = new ArrayList<>();
    }
    this.segments.add(segmentsItem);
    return this;
  }

  /**
   * The set of segments matching an explorer request
   * @return segments
  */
  @ApiModelProperty(value = "The set of segments matching an explorer request")

  @Valid

  public List<ExplorerSegmentDTO> getSegments() {
    return segments;
  }

  public void setSegments(List<ExplorerSegmentDTO> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExplorerResponseDTO explorerResponse = (ExplorerResponseDTO) o;
    return Objects.equals(this.segments, explorerResponse.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExplorerResponseDTO {\n");
    
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

