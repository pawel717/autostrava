package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.MetaClubDTO;
import com.autostrava.api.gen.dto.SummaryClubAllOfDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SummaryClubDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SummaryClubDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("resource_state")
  private Integer resourceState;

  @JsonProperty("name")
  private String name;

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

  public SummaryClubDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The club's unique identifier.
   * @return id
  */
  @ApiModelProperty(value = "The club's unique identifier.")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SummaryClubDTO resourceState(Integer resourceState) {
    this.resourceState = resourceState;
    return this;
  }

  /**
   * Resource state, indicates level of detail. Possible values: 1 -> \"meta\", 2 -> \"summary\", 3 -> \"detail\"
   * @return resourceState
  */
  @ApiModelProperty(value = "Resource state, indicates level of detail. Possible values: 1 -> \"meta\", 2 -> \"summary\", 3 -> \"detail\"")


  public Integer getResourceState() {
    return resourceState;
  }

  public void setResourceState(Integer resourceState) {
    this.resourceState = resourceState;
  }

  public SummaryClubDTO name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The club's name.
   * @return name
  */
  @ApiModelProperty(value = "The club's name.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SummaryClubDTO profileMedium(String profileMedium) {
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

  public SummaryClubDTO coverPhoto(String coverPhoto) {
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

  public SummaryClubDTO coverPhotoSmall(String coverPhotoSmall) {
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

  public SummaryClubDTO sportType(SportTypeEnum sportType) {
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

  public SummaryClubDTO city(String city) {
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

  public SummaryClubDTO state(String state) {
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

  public SummaryClubDTO country(String country) {
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

  public SummaryClubDTO _private(Boolean _private) {
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

  public SummaryClubDTO memberCount(Integer memberCount) {
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

  public SummaryClubDTO featured(Boolean featured) {
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

  public SummaryClubDTO verified(Boolean verified) {
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

  public SummaryClubDTO url(String url) {
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
    SummaryClubDTO summaryClub = (SummaryClubDTO) o;
    return Objects.equals(this.id, summaryClub.id) &&
        Objects.equals(this.resourceState, summaryClub.resourceState) &&
        Objects.equals(this.name, summaryClub.name) &&
        Objects.equals(this.profileMedium, summaryClub.profileMedium) &&
        Objects.equals(this.coverPhoto, summaryClub.coverPhoto) &&
        Objects.equals(this.coverPhotoSmall, summaryClub.coverPhotoSmall) &&
        Objects.equals(this.sportType, summaryClub.sportType) &&
        Objects.equals(this.city, summaryClub.city) &&
        Objects.equals(this.state, summaryClub.state) &&
        Objects.equals(this.country, summaryClub.country) &&
        Objects.equals(this._private, summaryClub._private) &&
        Objects.equals(this.memberCount, summaryClub.memberCount) &&
        Objects.equals(this.featured, summaryClub.featured) &&
        Objects.equals(this.verified, summaryClub.verified) &&
        Objects.equals(this.url, summaryClub.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, name, profileMedium, coverPhoto, coverPhotoSmall, sportType, city, state, country, _private, memberCount, featured, verified, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryClubDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceState: ").append(toIndentedString(resourceState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

