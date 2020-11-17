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
 * DetailedClubAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedClubAllOfDTO   {
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

  public DetailedClubAllOfDTO membership(MembershipEnum membership) {
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

  public DetailedClubAllOfDTO admin(Boolean admin) {
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

  public DetailedClubAllOfDTO owner(Boolean owner) {
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

  public DetailedClubAllOfDTO followingCount(Integer followingCount) {
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

