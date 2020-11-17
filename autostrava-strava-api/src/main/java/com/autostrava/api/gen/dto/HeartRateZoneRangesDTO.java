package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.ZoneRangeDTO;
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
 * HeartRateZoneRangesDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class HeartRateZoneRangesDTO   {
  @JsonProperty("custom_zones")
  private Boolean customZones;

  @JsonProperty("zones")
  @Valid
  private List<ZoneRangeDTO> zones = null;

  public HeartRateZoneRangesDTO customZones(Boolean customZones) {
    this.customZones = customZones;
    return this;
  }

  /**
   * Whether the athlete has set their own custom heart rate zones
   * @return customZones
  */
  @ApiModelProperty(value = "Whether the athlete has set their own custom heart rate zones")


  public Boolean isCustomZones() {
    return customZones;
  }

  public void setCustomZones(Boolean customZones) {
    this.customZones = customZones;
  }

  public HeartRateZoneRangesDTO zones(List<ZoneRangeDTO> zones) {
    this.zones = zones;
    return this;
  }

  public HeartRateZoneRangesDTO addZonesItem(ZoneRangeDTO zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<>();
    }
    this.zones.add(zonesItem);
    return this;
  }

  /**
   * Get zones
   * @return zones
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ZoneRangeDTO> getZones() {
    return zones;
  }

  public void setZones(List<ZoneRangeDTO> zones) {
    this.zones = zones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeartRateZoneRangesDTO heartRateZoneRanges = (HeartRateZoneRangesDTO) o;
    return Objects.equals(this.customZones, heartRateZoneRanges.customZones) &&
        Objects.equals(this.zones, heartRateZoneRanges.zones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customZones, zones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeartRateZoneRangesDTO {\n");
    
    sb.append("    customZones: ").append(toIndentedString(customZones)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
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

