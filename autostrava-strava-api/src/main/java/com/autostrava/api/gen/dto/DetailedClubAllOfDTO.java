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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * DetailedClubAllOfDTO
 */
@JsonPropertyOrder({
  DetailedClubAllOfDTO.JSON_PROPERTY_MEMBERSHIP,
  DetailedClubAllOfDTO.JSON_PROPERTY_ADMIN,
  DetailedClubAllOfDTO.JSON_PROPERTY_OWNER,
  DetailedClubAllOfDTO.JSON_PROPERTY_FOLLOWING_COUNT
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-11-17T18:37:28.613+01:00[Europe/Belgrade]")
public class DetailedClubAllOfDTO {
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


  public DetailedClubAllOfDTO membership(MembershipEnum membership) {
    
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


  public DetailedClubAllOfDTO admin(Boolean admin) {
    
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


  public DetailedClubAllOfDTO owner(Boolean owner) {
    
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


  public DetailedClubAllOfDTO followingCount(Integer followingCount) {
    
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
    DetailedClubAllOfDTO detailedClubAllOf = (DetailedClubAllOfDTO) o;
    return Objects.equals(this.membership, detailedClubAllOf.membership) &&
        Objects.equals(this.admin, detailedClubAllOf.admin) &&
        Objects.equals(this.owner, detailedClubAllOf.owner) &&
        Objects.equals(this.followingCount, detailedClubAllOf.followingCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(membership, admin, owner, followingCount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedClubAllOfDTO {\n");
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

