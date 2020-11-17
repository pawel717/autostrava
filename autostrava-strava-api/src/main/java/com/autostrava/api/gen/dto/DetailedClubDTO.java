package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.DetailedClubAllOfDTO;
import com.autostrava.api.gen.dto.SummaryClubDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedClubDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedClubDTO   {
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

  @JsonProperty("membership")
  private MembershipEnum membership;

  @JsonProperty("admin")
  private Boolean admin;

  @JsonProperty("owner")
  private Boolean owner;

  @JsonProperty("following_count")
  private Integer followingCount;

  public DetailedClubDTO id(Long id) {
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

  public DetailedClubDTO resourceState(Integer resourceState) {
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

  public DetailedClubDTO name(String name) {
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

  public DetailedClubDTO profileMedium(String profileMedium) {
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

  public DetailedClubDTO coverPhoto(String coverPhoto) {
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

  public DetailedClubDTO coverPhotoSmall(String coverPhotoSmall) {
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

  public DetailedClubDTO sportType(SportTypeEnum sportType) {
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

  public DetailedClubDTO city(String city) {
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

  public DetailedClubDTO state(String state) {
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

  public DetailedClubDTO country(String country) {
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

  public DetailedClubDTO _private(Boolean _private) {
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

  public DetailedClubDTO memberCount(Integer memberCount) {
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

  public DetailedClubDTO featured(Boolean featured) {
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

  public DetailedClubDTO verified(Boolean verified) {
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

  public DetailedClubDTO url(String url) {
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

  public DetailedClubDTO membership(MembershipEnum membership) {
    this.membership = membership;
    return this;
  }

  /**
   * The membership status of the logged-in athlete.
   * @return membership
  */
  @ApiModelProperty(value = "The membership status of the logged-in athlete.")


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
  */
  @ApiModelProperty(value = "Whether the currently logged-in athlete is an administrator of this club.")


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
  */
  @ApiModelProperty(value = "Whether the currently logged-in athlete is the owner of this club.")


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
  */
  @ApiModelProperty(value = "The number of athletes in the club that the logged-in athlete follows.")


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

