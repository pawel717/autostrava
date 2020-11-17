/*
 * Strava API v3
 * The [Swagger Playground](https://developers.strava.com/playground) is the easiest way to familiarize yourself with the Strava API by submitting HTTP requests and observing the responses before you write any client code. It will show what a response will look like with different endpoints depending on the authorization scope you receive from your athletes. To use the Playground, go to https://www.strava.com/settings/api and change your “Authorization Callback Domain” to developers.strava.com. Please note, we only support Swagger 2.0. There is a known issue where you can only select one scope at a time. For more information, please check the section “client code” at https://developers.strava.com/docs.
 *
 * The version of the OpenAPI document: 3.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.autostrava.api.gen.dto;

import java.util.Objects;
import java.util.Arrays;
import com.autostrava.api.gen.dto.AltitudeStreamAllOfDTO;
import com.autostrava.api.gen.dto.BaseStreamDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AltitudeStreamDTO
 */
@JsonPropertyOrder({
  AltitudeStreamDTO.JSON_PROPERTY_ORIGINAL_SIZE,
  AltitudeStreamDTO.JSON_PROPERTY_RESOLUTION,
  AltitudeStreamDTO.JSON_PROPERTY_SERIES_TYPE,
  AltitudeStreamDTO.JSON_PROPERTY_DATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T18:37:28.613+01:00[Europe/Belgrade]")
public class AltitudeStreamDTO {
  public static final String JSON_PROPERTY_ORIGINAL_SIZE = "original_size";
  private Integer originalSize;

  /**
   * The level of detail (sampling) in which this stream was returned
   */
  public enum ResolutionEnum {
    LOW("low"),
    
    MEDIUM("medium"),
    
    HIGH("high");

    private String value;

    ResolutionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ResolutionEnum fromValue(String value) {
      for (ResolutionEnum b : ResolutionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESOLUTION = "resolution";
  private ResolutionEnum resolution;

  /**
   * The base series used in the case the stream was downsampled
   */
  public enum SeriesTypeEnum {
    DISTANCE("distance"),
    
    TIME("time");

    private String value;

    SeriesTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeriesTypeEnum fromValue(String value) {
      for (SeriesTypeEnum b : SeriesTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERIES_TYPE = "series_type";
  private SeriesTypeEnum seriesType;

  public static final String JSON_PROPERTY_DATA = "data";
  private List<Float> data = null;


  public AltitudeStreamDTO originalSize(Integer originalSize) {
    
    this.originalSize = originalSize;
    return this;
  }

   /**
   * The number of data points in this stream
   * @return originalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of data points in this stream")
  @JsonProperty(JSON_PROPERTY_ORIGINAL_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getOriginalSize() {
    return originalSize;
  }


  public void setOriginalSize(Integer originalSize) {
    this.originalSize = originalSize;
  }


  public AltitudeStreamDTO resolution(ResolutionEnum resolution) {
    
    this.resolution = resolution;
    return this;
  }

   /**
   * The level of detail (sampling) in which this stream was returned
   * @return resolution
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The level of detail (sampling) in which this stream was returned")
  @JsonProperty(JSON_PROPERTY_RESOLUTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolutionEnum getResolution() {
    return resolution;
  }


  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }


  public AltitudeStreamDTO seriesType(SeriesTypeEnum seriesType) {
    
    this.seriesType = seriesType;
    return this;
  }

   /**
   * The base series used in the case the stream was downsampled
   * @return seriesType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The base series used in the case the stream was downsampled")
  @JsonProperty(JSON_PROPERTY_SERIES_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SeriesTypeEnum getSeriesType() {
    return seriesType;
  }


  public void setSeriesType(SeriesTypeEnum seriesType) {
    this.seriesType = seriesType;
  }


  public AltitudeStreamDTO data(List<Float> data) {
    
    this.data = data;
    return this;
  }

  public AltitudeStreamDTO addDataItem(Float dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * The sequence of altitude values for this stream, in meters
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sequence of altitude values for this stream, in meters")
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Float> getData() {
    return data;
  }


  public void setData(List<Float> data) {
    this.data = data;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AltitudeStreamDTO altitudeStream = (AltitudeStreamDTO) o;
    return Objects.equals(this.originalSize, altitudeStream.originalSize) &&
        Objects.equals(this.resolution, altitudeStream.resolution) &&
        Objects.equals(this.seriesType, altitudeStream.seriesType) &&
        Objects.equals(this.data, altitudeStream.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalSize, resolution, seriesType, data);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AltitudeStreamDTO {\n");
    sb.append("    originalSize: ").append(toIndentedString(originalSize)).append("\n");
    sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
    sb.append("    seriesType: ").append(toIndentedString(seriesType)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

