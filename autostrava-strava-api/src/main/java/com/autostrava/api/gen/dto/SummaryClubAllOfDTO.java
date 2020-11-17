package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SummaryClubAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SummaryClubAllOfDTO   {
  @JsonProperty("profile_medium")
  private String profileMedium;

  @JsonProperty("cover_photo")
  private String coverPhoto;

  @JsonProperty("cover_photo_small")
  private String coverPhotoSmall;

  /**
   * Gets or Sets sportType
   */
  public enum SportTypeEnum {
    CYCLING("cycling"),
    
    RUNNING("running"),
    
    TRIATHLON("triathlon"),
    
    OTHER("other");

    private String value;

    SportTypeEnum(String value) {
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
    public static SportTypeEnum fromValue(String value) {
      for (SportTypeEnum b : SportTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("sport_type")
  private SportTypeEnum sportType;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  @JsonProperty("private")
  private Boolean _private;

  @JsonProperty("member_count")
  private Integer memberCount;

  @JsonProperty("featured")
  private Boolean featured;

  @JsonProperty("verified")
  private Boolean verified;

  @JsonProperty("url")
  private String url;

  public SummaryClubAllOfDTO profileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
    return this;
  }

  /**
   * URL to a 60x60 pixel profile picture.
   * @return profileMedium
  */
  @ApiModelProperty(value = "URL to a 60x60 pixel profile picture.")


  public String getProfileMedium() {
    return profileMedium;
  }

  public void setProfileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
  }

  public SummaryClubAllOfDTO coverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
    return this;
  }

  /**
   * URL to a ~1185x580 pixel cover photo.
   * @return coverPhoto
  */
  @ApiModelProperty(value = "URL to a ~1185x580 pixel cover photo.")


  public String getCoverPhoto() {
    return coverPhoto;
  }

  public void setCoverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
  }

  public SummaryClubAllOfDTO coverPhotoSmall(String coverPhotoSmall) {
    this.coverPhotoSmall = coverPhotoSmall;
    return this;
  }

  /**
   * URL to a ~360x176  pixel cover photo.
   * @return coverPhotoSmall
  */
  @ApiModelProperty(value = "URL to a ~360x176  pixel cover photo.")


  public String getCoverPhotoSmall() {
    return coverPhotoSmall;
  }

  public void setCoverPhotoSmall(String coverPhotoSmall) {
    this.coverPhotoSmall = coverPhotoSmall;
  }

  public SummaryClubAllOfDTO sportType(SportTypeEnum sportType) {
    this.sportType = sportType;
    return this;
  }

  /**
   * Get sportType
   * @return sportType
  */
  @ApiModelProperty(value = "")


  public SportTypeEnum getSportType() {
    return sportType;
  }

  public void setSportType(SportTypeEnum sportType) {
    this.sportType = sportType;
  }

  public SummaryClubAllOfDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The club's city.
   * @return city
  */
  @ApiModelProperty(value = "The club's city.")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SummaryClubAllOfDTO state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The club's state or geographical region.
   * @return state
  */
  @ApiModelProperty(value = "The club's state or geographical region.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SummaryClubAllOfDTO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The club's country.
   * @return country
  */
  @ApiModelProperty(value = "The club's country.")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SummaryClubAllOfDTO _private(Boolean _private) {
    this._private = _private;
    return this;
  }

  /**
   * Whether the club is private.
   * @return _private
  */
  @ApiModelProperty(value = "Whether the club is private.")


  public Boolean isPrivate() {
    return _private;
  }

  public void setPrivate(Boolean _private) {
    this._private = _private;
  }

  public SummaryClubAllOfDTO memberCount(Integer memberCount) {
    this.memberCount = memberCount;
    return this;
  }

  /**
   * The club's member count.
   * @return memberCount
  */
  @ApiModelProperty(value = "The club's member count.")


  public Integer getMemberCount() {
    return memberCount;
  }

  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }

  public SummaryClubAllOfDTO featured(Boolean featured) {
    this.featured = featured;
    return this;
  }

  /**
   * Whether the club is featured or not.
   * @return featured
  */
  @ApiModelProperty(value = "Whether the club is featured or not.")


  public Boolean isFeatured() {
    return featured;
  }

  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }

  public SummaryClubAllOfDTO verified(Boolean verified) {
    this.verified = verified;
    return this;
  }

  /**
   * Whether the club is verified or not.
   * @return verified
  */
  @ApiModelProperty(value = "Whether the club is verified or not.")


  public Boolean isVerified() {
    return verified;
  }

  public void setVerified(Boolean verified) {
    this.verified = verified;
  }

  public SummaryClubAllOfDTO url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The club's vanity URL.
   * @return url
  */
  @ApiModelProperty(value = "The club's vanity URL.")


  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryClubAllOfDTO summaryClubAllOf = (SummaryClubAllOfDTO) o;
    return Objects.equals(this.profileMedium, summaryClubAllOf.profileMedium) &&
        Objects.equals(this.coverPhoto, summaryClubAllOf.coverPhoto) &&
        Objects.equals(this.coverPhotoSmall, summaryClubAllOf.coverPhotoSmall) &&
        Objects.equals(this.sportType, summaryClubAllOf.sportType) &&
        Objects.equals(this.city, summaryClubAllOf.city) &&
        Objects.equals(this.state, summaryClubAllOf.state) &&
        Objects.equals(this.country, summaryClubAllOf.country) &&
        Objects.equals(this._private, summaryClubAllOf._private) &&
        Objects.equals(this.memberCount, summaryClubAllOf.memberCount) &&
        Objects.equals(this.featured, summaryClubAllOf.featured) &&
        Objects.equals(this.verified, summaryClubAllOf.verified) &&
        Objects.equals(this.url, summaryClubAllOf.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(profileMedium, coverPhoto, coverPhotoSmall, sportType, city, state, country, _private, memberCount, featured, verified, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryClubAllOfDTO {\n");
    
    sb.append("    profileMedium: ").append(toIndentedString(profileMedium)).append("\n");
    sb.append("    coverPhoto: ").append(toIndentedString(coverPhoto)).append("\n");
    sb.append("    coverPhotoSmall: ").append(toIndentedString(coverPhotoSmall)).append("\n");
    sb.append("    sportType: ").append(toIndentedString(sportType)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    memberCount: ").append(toIndentedString(memberCount)).append("\n");
    sb.append("    featured: ").append(toIndentedString(featured)).append("\n");
    sb.append("    verified: ").append(toIndentedString(verified)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

