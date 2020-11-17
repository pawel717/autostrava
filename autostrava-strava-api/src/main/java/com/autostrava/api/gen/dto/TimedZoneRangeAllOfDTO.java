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
 * TimedZoneRangeAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class TimedZoneRangeAllOfDTO   {
  @JsonProperty("time")
  private Integer time;

  public TimedZoneRangeAllOfDTO time(Integer time) {
    this.time = time;
    return this;
  }

  /**
   * The number of seconds spent in this zone
   * @return time
  */
  @ApiModelProperty(value = "The number of seconds spent in this zone")


  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimedZoneRangeAllOfDTO timedZoneRangeAllOf = (TimedZoneRangeAllOfDTO) o;
    return Objects.equals(this.time, timedZoneRangeAllOf.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimedZoneRangeAllOfDTO {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

