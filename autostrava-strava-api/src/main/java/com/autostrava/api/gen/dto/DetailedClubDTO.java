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
import com.autostrava.api.gen.dto.DetailedClubAllOfDTO;
import com.autostrava.api.gen.dto.SummaryClubDTO;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DetailedClubDTO
 */
@JsonPropertyOrder({
  DetailedClubDTO.JSON_PROPERTY_ID,
  DetailedClubDTO.JSON_PROPERTY_RESOURCE_STATE,
  DetailedClubDTO.JSON_PROPERTY_NAME,
  DetailedClubDTO.JSON_PROPERTY_PROFILE_MEDIUM,
  DetailedClubDTO.JSON_PROPERTY_COVER_PHOTO,
  DetailedClubDTO.JSON_PROPERTY_COVER_PHOTO_SMALL,
  DetailedClubDTO.JSON_PROPERTY_SPORT_TYPE,
  DetailedClubDTO.JSON_PROPERTY_CITY,
  DetailedClubDTO.JSON_PROPERTY_STATE,
  DetailedClubDTO.JSON_PROPERTY_COUNTRY,
  DetailedClubDTO.JSON_PROPERTY_PRIVATE,
  DetailedClubDTO.JSON_PROPERTY_MEMBER_COUNT,
  DetailedClubDTO.JSON_PROPERTY_FEATURED,
  DetailedClubDTO.JSON_PROPERTY_VERIFIED,
  DetailedClubDTO.JSON_PROPERTY_URL,
  DetailedClubDTO.JSON_PROPERTY_MEMBERSHIP,
  DetailedClubDTO.JSON_PROPERTY_ADMIN,
  DetailedClubDTO.JSON_PROPERTY_OWNER,
  DetailedClubDTO.JSON_PROPERTY_FOLLOWING_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T18:37:28.613+01:00[Europe/Belgrade]")
public class DetailedClubDTO {
  public static final String JSON_PROPERTY_ID = "id";
  private Long id;

  public static final String JSON_PROPERTY_RESOURCE_STATE = "resource_state";
  private Integer resourceState;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROFILE_MEDIUM = "profile_medium";
  private String profileMedium;

  public static final String JSON_PROPERTY_COVER_PHOTO = "cover_photo";
  private String coverPhoto;

  public static final String JSON_PROPERTY_COVER_PHOTO_SMALL = "cover_photo_small";
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

  public static final String JSON_PROPERTY_SPORT_TYPE = "sport_type";
  private SportTypeEnum sportType;

  public static final String JSON_PROPERTY_CITY = "city";
  private String city;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_PRIVATE = "private";
  private Boolean _private;

  public static final String JSON_PROPERTY_MEMBER_COUNT = "member_count";
  private Integer memberCount;

  public static final String JSON_PROPERTY_FEATURED = "featured";
  private Boolean featured;

  public static final String JSON_PROPERTY_VERIFIED = "verified";
  private Boolean verified;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  /**
   * The membership status of the logged-in athlete.
   */
  public enum MembershipEnum {
    MEMBER("member"),
    
    PENDING("pending");

    private String value;

    MembershipEnum(String value) {
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
    public static MembershipEnum fromValue(String value) {
      for (MembershipEnum b : MembershipEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_MEMBERSHIP = "membership";
  private MembershipEnum membership;

  public static final String JSON_PROPERTY_ADMIN = "admin";
  private Boolean admin;

  public static final String JSON_PROPERTY_OWNER = "owner";
  private Boolean owner;

  public static final String JSON_PROPERTY_FOLLOWING_COUNT = "following_count";
  private Integer followingCount;


  public DetailedClubDTO id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * The club&#39;s unique identifier.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The club's unique identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public DetailedClubDTO resourceState(Integer resourceState) {
    
    this.resourceState = resourceState;
    return this;
  }

   /**
   * Resource state, indicates level of detail. Possible values: 1 -&gt; \&quot;meta\&quot;, 2 -&gt; \&quot;summary\&quot;, 3 -&gt; \&quot;detail\&quot;
   * @return resourceState
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Resource state, indicates level of detail. Possible values: 1 -> \"meta\", 2 -> \"summary\", 3 -> \"detail\"")
  @JsonProperty(JSON_PROPERTY_RESOURCE_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getResourceState() {
    return resourceState;
  }


  public void setResourceState(Integer resourceState) {
    this.resourceState = resourceState;
  }


  public DetailedClubDTO name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The club&#39;s name.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The club's name.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DetailedClubDTO profileMedium(String profileMedium) {
    
    this.profileMedium = profileMedium;
    return this;
  }

   /**
   * URL to a 60x60 pixel profile picture.
   * @return profileMedium
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to a 60x60 pixel profile picture.")
  @JsonProperty(JSON_PROPERTY_PROFILE_MEDIUM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getProfileMedium() {
    return profileMedium;
  }


  public void setProfileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
  }


  public DetailedClubDTO coverPhoto(String coverPhoto) {
    
    this.coverPhoto = coverPhoto;
    return this;
  }

   /**
   * URL to a ~1185x580 pixel cover photo.
   * @return coverPhoto
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to a ~1185x580 pixel cover photo.")
  @JsonProperty(JSON_PROPERTY_COVER_PHOTO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverPhoto() {
    return coverPhoto;
  }


  public void setCoverPhoto(String coverPhoto) {
    this.coverPhoto = coverPhoto;
  }


  public DetailedClubDTO coverPhotoSmall(String coverPhotoSmall) {
    
    this.coverPhotoSmall = coverPhotoSmall;
    return this;
  }

   /**
   * URL to a ~360x176  pixel cover photo.
   * @return coverPhotoSmall
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "URL to a ~360x176  pixel cover photo.")
  @JsonProperty(JSON_PROPERTY_COVER_PHOTO_SMALL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCoverPhotoSmall() {
    return coverPhotoSmall;
  }


  public void setCoverPhotoSmall(String coverPhotoSmall) {
    this.coverPhotoSmall = coverPhotoSmall;
  }


  public DetailedClubDTO sportType(SportTypeEnum sportType) {
    
    this.sportType = sportType;
    return this;
  }

   /**
   * Get sportType
   * @return sportType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SPORT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SportTypeEnum getSportType() {
    return sportType;
  }


  public void setSportType(SportTypeEnum sportType) {
    this.sportType = sportType;
  }


  public DetailedClubDTO city(String city) {
    
    this.city = city;
    return this;
  }

   /**
   * The club&#39;s city.
   * @return city
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The club's city.")
  @JsonProperty(JSON_PROPERTY_CITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCity() {
    return city;
  }


  public void setCity(String city) {
    this.city = city;
  }


  public DetailedClubDTO state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * The club&#39;s state or geographical region.
   * @return state
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The club's state or geographical region.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  public DetailedClubDTO country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * The club&#39;s country.
   * @return country
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The club's country.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public DetailedClubDTO _private(Boolean _private) {
    
    this._private = _private;
    return this;
  }

   /**
   * Whether the club is private.
   * @return _private
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the club is private.")
  @JsonProperty(JSON_PROPERTY_PRIVATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isPrivate() {
    return _private;
  }


  public void setPrivate(Boolean _private) {
    this._private = _private;
  }


  public DetailedClubDTO memberCount(Integer memberCount) {
    
    this.memberCount = memberCount;
    return this;
  }

   /**
   * The club&#39;s member count.
   * @return memberCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The club's member count.")
  @JsonProperty(JSON_PROPERTY_MEMBER_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getMemberCount() {
    return memberCount;
  }


  public void setMemberCount(Integer memberCount) {
    this.memberCount = memberCount;
  }


  public DetailedClubDTO featured(Boolean featured) {
    
    this.featured = featured;
    return this;
  }

   /**
   * Whether the club is featured or not.
   * @return featured
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the club is featured or not.")
  @JsonProperty(JSON_PROPERTY_FEATURED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isFeatured() {
    return featured;
  }


  public void setFeatured(Boolean featured) {
    this.featured = featured;
  }


  public DetailedClubDTO verified(Boolean verified) {
    
    this.verified = verified;
    return this;
  }

   /**
   * Whether the club is verified or not.
   * @return verified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the club is verified or not.")
  @JsonProperty(JSON_PROPERTY_VERIFIED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isVerified() {
    return verified;
  }


  public void setVerified(Boolean verified) {
    this.verified = verified;
  }


  public DetailedClubDTO url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * The club&#39;s vanity URL.
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The club's vanity URL.")
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public DetailedClubDTO membership(MembershipEnum membership) {
    
    this.membership = membership;
    return this;
  }

   /**
   * The membership status of the logged-in athlete.
   * @return membership
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The membership status of the logged-in athlete.")
  @JsonProperty(JSON_PROPERTY_MEMBERSHIP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MembershipEnum getMembership() {
    return membership;
  }


  public void setMembership(MembershipEnum membership) {
    this.membership = membership;
  }


  public DetailedClubDTO admin(Boolean admin) {
    
    this.admin = admin;
    return this;
  }

   /**
   * Whether the currently logged-in athlete is an administrator of this club.
   * @return admin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the currently logged-in athlete is an administrator of this club.")
  @JsonProperty(JSON_PROPERTY_ADMIN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isAdmin() {
    return admin;
  }


  public void setAdmin(Boolean admin) {
    this.admin = admin;
  }


  public DetailedClubDTO owner(Boolean owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Whether the currently logged-in athlete is the owner of this club.
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the currently logged-in athlete is the owner of this club.")
  @JsonProperty(JSON_PROPERTY_OWNER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean isOwner() {
    return owner;
  }


  public void setOwner(Boolean owner) {
    this.owner = owner;
  }


  public DetailedClubDTO followingCount(Integer followingCount) {
    
    this.followingCount = followingCount;
    return this;
  }

   /**
   * The number of athletes in the club that the logged-in athlete follows.
   * @return followingCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of athletes in the club that the logged-in athlete follows.")
  @JsonProperty(JSON_PROPERTY_FOLLOWING_COUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFollowingCount() {
    return followingCount;
  }


  public void setFollowingCount(Integer followingCount) {
    this.followingCount = followingCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedClubDTO detailedClub = (DetailedClubDTO) o;
    return Objects.equals(this.id, detailedClub.id) &&
        Objects.equals(this.resourceState, detailedClub.resourceState) &&
        Objects.equals(this.name, detailedClub.name) &&
        Objects.equals(this.profileMedium, detailedClub.profileMedium) &&
        Objects.equals(this.coverPhoto, detailedClub.coverPhoto) &&
        Objects.equals(this.coverPhotoSmall, detailedClub.coverPhotoSmall) &&
        Objects.equals(this.sportType, detailedClub.sportType) &&
        Objects.equals(this.city, detailedClub.city) &&
        Objects.equals(this.state, detailedClub.state) &&
        Objects.equals(this.country, detailedClub.country) &&
        Objects.equals(this._private, detailedClub._private) &&
        Objects.equals(this.memberCount, detailedClub.memberCount) &&
        Objects.equals(this.featured, detailedClub.featured) &&
        Objects.equals(this.verified, detailedClub.verified) &&
        Objects.equals(this.url, detailedClub.url) &&
        Objects.equals(this.membership, detailedClub.membership) &&
        Objects.equals(this.admin, detailedClub.admin) &&
        Objects.equals(this.owner, detailedClub.owner) &&
        Objects.equals(this.followingCount, detailedClub.followingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, name, profileMedium, coverPhoto, coverPhotoSmall, sportType, city, state, country, _private, memberCount, featured, verified, url, membership, admin, owner, followingCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedClubDTO {\n");
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
    sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
    sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    followingCount: ").append(toIndentedString(followingCount)).append("\n");
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

