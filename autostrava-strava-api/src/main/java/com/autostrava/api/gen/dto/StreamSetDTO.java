package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.AltitudeStreamDTO;
import com.autostrava.api.gen.dto.CadenceStreamDTO;
import com.autostrava.api.gen.dto.DistanceStreamDTO;
import com.autostrava.api.gen.dto.HeartrateStreamDTO;
import com.autostrava.api.gen.dto.LatLngStreamDTO;
import com.autostrava.api.gen.dto.MovingStreamDTO;
import com.autostrava.api.gen.dto.PowerStreamDTO;
import com.autostrava.api.gen.dto.SmoothGradeStreamDTO;
import com.autostrava.api.gen.dto.SmoothVelocityStreamDTO;
import com.autostrava.api.gen.dto.TemperatureStreamDTO;
import com.autostrava.api.gen.dto.TimeStreamDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * StreamSetDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class StreamSetDTO   {
  @JsonProperty("time")
  private TimeStreamDTO time = null;

  @JsonProperty("distance")
  private DistanceStreamDTO distance = null;

  @JsonProperty("latlng")
  private LatLngStreamDTO latlng = null;

  @JsonProperty("altitude")
  private AltitudeStreamDTO altitude = null;

  @JsonProperty("velocity_smooth")
  private SmoothVelocityStreamDTO velocitySmooth = null;

  @JsonProperty("heartrate")
  private HeartrateStreamDTO heartrate = null;

  @JsonProperty("cadence")
  private CadenceStreamDTO cadence = null;

  @JsonProperty("watts")
  private PowerStreamDTO watts = null;

  @JsonProperty("temp")
  private TemperatureStreamDTO temp = null;

  @JsonProperty("moving")
  private MovingStreamDTO moving = null;

  @JsonProperty("grade_smooth")
  private SmoothGradeStreamDTO gradeSmooth = null;

  public StreamSetDTO time(TimeStreamDTO time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
  */
  @ApiModelProperty(value = "")

  @Valid

  public TimeStreamDTO getTime() {
    return time;
  }

  public void setTime(TimeStreamDTO time) {
    this.time = time;
  }

  public StreamSetDTO distance(DistanceStreamDTO distance) {
    this.distance = distance;
    return this;
  }

  /**
   * Get distance
   * @return distance
  */
  @ApiModelProperty(value = "")

  @Valid

  public DistanceStreamDTO getDistance() {
    return distance;
  }

  public void setDistance(DistanceStreamDTO distance) {
    this.distance = distance;
  }

  public StreamSetDTO latlng(LatLngStreamDTO latlng) {
    this.latlng = latlng;
    return this;
  }

  /**
   * Get latlng
   * @return latlng
  */
  @ApiModelProperty(value = "")

  @Valid

  public LatLngStreamDTO getLatlng() {
    return latlng;
  }

  public void setLatlng(LatLngStreamDTO latlng) {
    this.latlng = latlng;
  }

  public StreamSetDTO altitude(AltitudeStreamDTO altitude) {
    this.altitude = altitude;
    return this;
  }

  /**
   * Get altitude
   * @return altitude
  */
  @ApiModelProperty(value = "")

  @Valid

  public AltitudeStreamDTO getAltitude() {
    return altitude;
  }

  public void setAltitude(AltitudeStreamDTO altitude) {
    this.altitude = altitude;
  }

  public StreamSetDTO velocitySmooth(SmoothVelocityStreamDTO velocitySmooth) {
    this.velocitySmooth = velocitySmooth;
    return this;
  }

  /**
   * Get velocitySmooth
   * @return velocitySmooth
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmoothVelocityStreamDTO getVelocitySmooth() {
    return velocitySmooth;
  }

  public void setVelocitySmooth(SmoothVelocityStreamDTO velocitySmooth) {
    this.velocitySmooth = velocitySmooth;
  }

  public StreamSetDTO heartrate(HeartrateStreamDTO heartrate) {
    this.heartrate = heartrate;
    return this;
  }

  /**
   * Get heartrate
   * @return heartrate
  */
  @ApiModelProperty(value = "")

  @Valid

  public HeartrateStreamDTO getHeartrate() {
    return heartrate;
  }

  public void setHeartrate(HeartrateStreamDTO heartrate) {
    this.heartrate = heartrate;
  }

  public StreamSetDTO cadence(CadenceStreamDTO cadence) {
    this.cadence = cadence;
    return this;
  }

  /**
   * Get cadence
   * @return cadence
  */
  @ApiModelProperty(value = "")

  @Valid

  public CadenceStreamDTO getCadence() {
    return cadence;
  }

  public void setCadence(CadenceStreamDTO cadence) {
    this.cadence = cadence;
  }

  public StreamSetDTO watts(PowerStreamDTO watts) {
    this.watts = watts;
    return this;
  }

  /**
   * Get watts
   * @return watts
  */
  @ApiModelProperty(value = "")

  @Valid

  public PowerStreamDTO getWatts() {
    return watts;
  }

  public void setWatts(PowerStreamDTO watts) {
    this.watts = watts;
  }

  public StreamSetDTO temp(TemperatureStreamDTO temp) {
    this.temp = temp;
    return this;
  }

  /**
   * Get temp
   * @return temp
  */
  @ApiModelProperty(value = "")

  @Valid

  public TemperatureStreamDTO getTemp() {
    return temp;
  }

  public void setTemp(TemperatureStreamDTO temp) {
    this.temp = temp;
  }

  public StreamSetDTO moving(MovingStreamDTO moving) {
    this.moving = moving;
    return this;
  }

  /**
   * Get moving
   * @return moving
  */
  @ApiModelProperty(value = "")

  @Valid

  public MovingStreamDTO getMoving() {
    return moving;
  }

  public void setMoving(MovingStreamDTO moving) {
    this.moving = moving;
  }

  public StreamSetDTO gradeSmooth(SmoothGradeStreamDTO gradeSmooth) {
    this.gradeSmooth = gradeSmooth;
    return this;
  }

  /**
   * Get gradeSmooth
   * @return gradeSmooth
  */
  @ApiModelProperty(value = "")

  @Valid

  public SmoothGradeStreamDTO getGradeSmooth() {
    return gradeSmooth;
  }

  public void setGradeSmooth(SmoothGradeStreamDTO gradeSmooth) {
    this.gradeSmooth = gradeSmooth;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StreamSetDTO streamSet = (StreamSetDTO) o;
    return Objects.equals(this.time, streamSet.time) &&
        Objects.equals(this.distance, streamSet.distance) &&
        Objects.equals(this.latlng, streamSet.latlng) &&
        Objects.equals(this.altitude, streamSet.altitude) &&
        Objects.equals(this.velocitySmooth, streamSet.velocitySmooth) &&
        Objects.equals(this.heartrate, streamSet.heartrate) &&
        Objects.equals(this.cadence, streamSet.cadence) &&
        Objects.equals(this.watts, streamSet.watts) &&
        Objects.equals(this.temp, streamSet.temp) &&
        Objects.equals(this.moving, streamSet.moving) &&
        Objects.equals(this.gradeSmooth, streamSet.gradeSmooth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time, distance, latlng, altitude, velocitySmooth, heartrate, cadence, watts, temp, moving, gradeSmooth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StreamSetDTO {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    distance: ").append(toIndentedString(distance)).append("\n");
    sb.append("    latlng: ").append(toIndentedString(latlng)).append("\n");
    sb.append("    altitude: ").append(toIndentedString(altitude)).append("\n");
    sb.append("    velocitySmooth: ").append(toIndentedString(velocitySmooth)).append("\n");
    sb.append("    heartrate: ").append(toIndentedString(heartrate)).append("\n");
    sb.append("    cadence: ").append(toIndentedString(cadence)).append("\n");
    sb.append("    watts: ").append(toIndentedString(watts)).append("\n");
    sb.append("    temp: ").append(toIndentedString(temp)).append("\n");
    sb.append("    moving: ").append(toIndentedString(moving)).append("\n");
    sb.append("    gradeSmooth: ").append(toIndentedString(gradeSmooth)).append("\n");
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

