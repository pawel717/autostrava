package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.HeartRateZoneRangesDTO;
import com.autostrava.api.gen.dto.PowerZoneRangesDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ZonesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class ZonesDTO   {
  @JsonProperty("heart_rate")
  private HeartRateZoneRangesDTO heartRate;

  @JsonProperty("power")
  private PowerZoneRangesDTO power;

  public ZonesDTO heartRate(HeartRateZoneRangesDTO heartRate) {
    this.heartRate = heartRate;
    return this;
  }

  /**
   * Get heartRate
   * @return heartRate
  */
  @ApiModelProperty(value = "")

  @Valid

  public HeartRateZoneRangesDTO getHeartRate() {
    return heartRate;
  }

  public void setHeartRate(HeartRateZoneRangesDTO heartRate) {
    this.heartRate = heartRate;
  }

  public ZonesDTO power(PowerZoneRangesDTO power) {
    this.power = power;
    return this;
  }

  /**
   * Get power
   * @return power
  */
  @ApiModelProperty(value = "")

  @Valid

  public PowerZoneRangesDTO getPower() {
    return power;
  }

  public void setPower(PowerZoneRangesDTO power) {
    this.power = power;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZonesDTO zones = (ZonesDTO) o;
    return Objects.equals(this.heartRate, zones.heartRate) &&
        Objects.equals(this.power, zones.power);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heartRate, power);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZonesDTO {\n");
    
    sb.append("    heartRate: ").append(toIndentedString(heartRate)).append("\n");
    sb.append("    power: ").append(toIndentedString(power)).append("\n");
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

