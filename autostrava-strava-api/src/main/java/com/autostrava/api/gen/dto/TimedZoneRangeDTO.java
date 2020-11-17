package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.TimedZoneRangeAllOfDTO;
import com.autostrava.api.gen.dto.ZoneRangeDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A union type representing the time spent in a given zone.
 */
@ApiModel(description = "A union type representing the time spent in a given zone.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class TimedZoneRangeDTO   {
  @JsonProperty("min")
  private Integer min;

  @JsonProperty("max")
  private Integer max;

  @JsonProperty("time")
  private Integer time;

  public TimedZoneRangeDTO min(Integer min) {
    this.min = min;
    return this;
  }

  /**
   * The minimum value in the range.
   * @return min
  */
  @ApiModelProperty(value = "The minimum value in the range.")


  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public TimedZoneRangeDTO max(Integer max) {
    this.max = max;
    return this;
  }

  /**
   * The maximum value in the range.
   * @return max
  */
  @ApiModelProperty(value = "The maximum value in the range.")


  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public TimedZoneRangeDTO time(Integer time) {
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
    TimedZoneRangeDTO timedZoneRange = (TimedZoneRangeDTO) o;
    return Objects.equals(this.min, timedZoneRange.min) &&
        Objects.equals(this.max, timedZoneRange.max) &&
        Objects.equals(this.time, timedZoneRange.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, max, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimedZoneRangeDTO {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
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

