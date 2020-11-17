package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PhotosSummaryPrimaryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class PhotosSummaryPrimaryDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("source")
  private Integer source;

  @JsonProperty("unique_id")
  private String uniqueId;

  @JsonProperty("urls")
  @Valid
  private Map<String, String> urls = null;

  public PhotosSummaryPrimaryDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PhotosSummaryPrimaryDTO source(Integer source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @ApiModelProperty(value = "")


  public Integer getSource() {
    return source;
  }

  public void setSource(Integer source) {
    this.source = source;
  }

  public PhotosSummaryPrimaryDTO uniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
    return this;
  }

  /**
   * Get uniqueId
   * @return uniqueId
  */
  @ApiModelProperty(value = "")


  public String getUniqueId() {
    return uniqueId;
  }

  public void setUniqueId(String uniqueId) {
    this.uniqueId = uniqueId;
  }

  public PhotosSummaryPrimaryDTO urls(Map<String, String> urls) {
    this.urls = urls;
    return this;
  }

  public PhotosSummaryPrimaryDTO putUrlsItem(String key, String urlsItem) {
    if (this.urls == null) {
      this.urls = new HashMap<>();
    }
    this.urls.put(key, urlsItem);
    return this;
  }

  /**
   * Get urls
   * @return urls
  */
  @ApiModelProperty(value = "")


  public Map<String, String> getUrls() {
    return urls;
  }

  public void setUrls(Map<String, String> urls) {
    this.urls = urls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhotosSummaryPrimaryDTO photosSummaryPrimary = (PhotosSummaryPrimaryDTO) o;
    return Objects.equals(this.id, photosSummaryPrimary.id) &&
        Objects.equals(this.source, photosSummaryPrimary.source) &&
        Objects.equals(this.uniqueId, photosSummaryPrimary.uniqueId) &&
        Objects.equals(this.urls, photosSummaryPrimary.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, uniqueId, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhotosSummaryPrimaryDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    uniqueId: ").append(toIndentedString(uniqueId)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

