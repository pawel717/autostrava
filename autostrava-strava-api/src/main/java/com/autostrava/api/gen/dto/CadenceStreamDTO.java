package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.BaseStreamDTO;
import com.autostrava.api.gen.dto.CadenceStreamAllOfDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CadenceStreamDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class CadenceStreamDTO   {
  @JsonProperty("original_size")
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

  @JsonProperty("resolution")
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

  @JsonProperty("series_type")
  private SeriesTypeEnum seriesType;

  @JsonProperty("data")
  @Valid
  private List<Integer> data = null;

  public CadenceStreamDTO originalSize(Integer originalSize) {
    this.originalSize = originalSize;
    return this;
  }

  /**
   * The number of data points in this stream
   * @return originalSize
  */
  @ApiModelProperty(value = "The number of data points in this stream")


  public Integer getOriginalSize() {
    return originalSize;
  }

  public void setOriginalSize(Integer originalSize) {
    this.originalSize = originalSize;
  }

  public CadenceStreamDTO resolution(ResolutionEnum resolution) {
    this.resolution = resolution;
    return this;
  }

  /**
   * The level of detail (sampling) in which this stream was returned
   * @return resolution
  */
  @ApiModelProperty(value = "The level of detail (sampling) in which this stream was returned")


  public ResolutionEnum getResolution() {
    return resolution;
  }

  public void setResolution(ResolutionEnum resolution) {
    this.resolution = resolution;
  }

  public CadenceStreamDTO seriesType(SeriesTypeEnum seriesType) {
    this.seriesType = seriesType;
    return this;
  }

  /**
   * The base series used in the case the stream was downsampled
   * @return seriesType
  */
  @ApiModelProperty(value = "The base series used in the case the stream was downsampled")


  public SeriesTypeEnum getSeriesType() {
    return seriesType;
  }

  public void setSeriesType(SeriesTypeEnum seriesType) {
    this.seriesType = seriesType;
  }

  public CadenceStreamDTO data(List<Integer> data) {
    this.data = data;
    return this;
  }

  public CadenceStreamDTO addDataItem(Integer dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

  /**
   * The sequence of cadence values for this stream, in rotations per minute
   * @return data
  */
  @ApiModelProperty(value = "The sequence of cadence values for this stream, in rotations per minute")


  public List<Integer> getData() {
    return data;
  }

  public void setData(List<Integer> data) {
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
    CadenceStreamDTO cadenceStream = (CadenceStreamDTO) o;
    return Objects.equals(this.originalSize, cadenceStream.originalSize) &&
        Objects.equals(this.resolution, cadenceStream.resolution) &&
        Objects.equals(this.seriesType, cadenceStream.seriesType) &&
        Objects.equals(this.data, cadenceStream.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originalSize, resolution, seriesType, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CadenceStreamDTO {\n");
    
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

