package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.MetaAthleteDTO;
import com.autostrava.api.gen.dto.SummaryAthleteAllOfDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SummaryAthleteDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class SummaryAthleteDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("resource_state")
  private Integer resourceState;

  @JsonProperty("firstname")
  private String firstname;

  @JsonProperty("lastname")
  private String lastname;

  @JsonProperty("profile_medium")
  private String profileMedium;

  @JsonProperty("profile")
  private String profile;

  @JsonProperty("city")
  private String city;

  @JsonProperty("state")
  private String state;

  @JsonProperty("country")
  private String country;

  /**
   * The athlete's sex.
   */
  public enum SexEnum {
    M("M"),
    
    F("F");

    private String value;

    SexEnum(String value) {
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
    public static SexEnum fromValue(String value) {
      for (SexEnum b : SexEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("sex")
  private SexEnum sex;

  @JsonProperty("premium")
  private Boolean premium;

  @JsonProperty("summit")
  private Boolean summit;

  @JsonProperty("created_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  @JsonProperty("updated_at")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updatedAt;

  public SummaryAthleteDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier of the athlete
   * @return id
  */
  @ApiModelProperty(value = "The unique identifier of the athlete")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public SummaryAthleteDTO resourceState(Integer resourceState) {
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

  public SummaryAthleteDTO firstname(String firstname) {
    this.firstname = firstname;
    return this;
  }

  /**
   * The athlete's first name.
   * @return firstname
  */
  @ApiModelProperty(value = "The athlete's first name.")


  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public SummaryAthleteDTO lastname(String lastname) {
    this.lastname = lastname;
    return this;
  }

  /**
   * The athlete's last name.
   * @return lastname
  */
  @ApiModelProperty(value = "The athlete's last name.")


  public String getLastname() {
    return lastname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }

  public SummaryAthleteDTO profileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
    return this;
  }

  /**
   * URL to a 62x62 pixel profile picture.
   * @return profileMedium
  */
  @ApiModelProperty(value = "URL to a 62x62 pixel profile picture.")


  public String getProfileMedium() {
    return profileMedium;
  }

  public void setProfileMedium(String profileMedium) {
    this.profileMedium = profileMedium;
  }

  public SummaryAthleteDTO profile(String profile) {
    this.profile = profile;
    return this;
  }

  /**
   * URL to a 124x124 pixel profile picture.
   * @return profile
  */
  @ApiModelProperty(value = "URL to a 124x124 pixel profile picture.")


  public String getProfile() {
    return profile;
  }

  public void setProfile(String profile) {
    this.profile = profile;
  }

  public SummaryAthleteDTO city(String city) {
    this.city = city;
    return this;
  }

  /**
   * The athlete's city.
   * @return city
  */
  @ApiModelProperty(value = "The athlete's city.")


  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public SummaryAthleteDTO state(String state) {
    this.state = state;
    return this;
  }

  /**
   * The athlete's state or geographical region.
   * @return state
  */
  @ApiModelProperty(value = "The athlete's state or geographical region.")


  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public SummaryAthleteDTO country(String country) {
    this.country = country;
    return this;
  }

  /**
   * The athlete's country.
   * @return country
  */
  @ApiModelProperty(value = "The athlete's country.")


  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public SummaryAthleteDTO sex(SexEnum sex) {
    this.sex = sex;
    return this;
  }

  /**
   * The athlete's sex.
   * @return sex
  */
  @ApiModelProperty(value = "The athlete's sex.")


  public SexEnum getSex() {
    return sex;
  }

  public void setSex(SexEnum sex) {
    this.sex = sex;
  }

  public SummaryAthleteDTO premium(Boolean premium) {
    this.premium = premium;
    return this;
  }

  /**
   * Deprecated.  Use summit field instead. Whether the athlete has any Summit subscription.
   * @return premium
  */
  @ApiModelProperty(value = "Deprecated.  Use summit field instead. Whether the athlete has any Summit subscription.")


  public Boolean isPremium() {
    return premium;
  }

  public void setPremium(Boolean premium) {
    this.premium = premium;
  }

  public SummaryAthleteDTO summit(Boolean summit) {
    this.summit = summit;
    return this;
  }

  /**
   * Whether the athlete has any Summit subscription.
   * @return summit
  */
  @ApiModelProperty(value = "Whether the athlete has any Summit subscription.")


  public Boolean isSummit() {
    return summit;
  }

  public void setSummit(Boolean summit) {
    this.summit = summit;
  }

  public SummaryAthleteDTO createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time at which the athlete was created.
   * @return createdAt
  */
  @ApiModelProperty(value = "The time at which the athlete was created.")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public SummaryAthleteDTO updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time at which the athlete was last updated.
   * @return updatedAt
  */
  @ApiModelProperty(value = "The time at which the athlete was last updated.")

  @Valid

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryAthleteDTO summaryAthlete = (SummaryAthleteDTO) o;
    return Objects.equals(this.id, summaryAthlete.id) &&
        Objects.equals(this.resourceState, summaryAthlete.resourceState) &&
        Objects.equals(this.firstname, summaryAthlete.firstname) &&
        Objects.equals(this.lastname, summaryAthlete.lastname) &&
        Objects.equals(this.profileMedium, summaryAthlete.profileMedium) &&
        Objects.equals(this.profile, summaryAthlete.profile) &&
        Objects.equals(this.city, summaryAthlete.city) &&
        Objects.equals(this.state, summaryAthlete.state) &&
        Objects.equals(this.country, summaryAthlete.country) &&
        Objects.equals(this.sex, summaryAthlete.sex) &&
        Objects.equals(this.premium, summaryAthlete.premium) &&
        Objects.equals(this.summit, summaryAthlete.summit) &&
        Objects.equals(this.createdAt, summaryAthlete.createdAt) &&
        Objects.equals(this.updatedAt, summaryAthlete.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, firstname, lastname, profileMedium, profile, city, state, country, sex, premium, summit, createdAt, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryAthleteDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    resourceState: ").append(toIndentedString(resourceState)).append("\n");
    sb.append("    firstname: ").append(toIndentedString(firstname)).append("\n");
    sb.append("    lastname: ").append(toIndentedString(lastname)).append("\n");
    sb.append("    profileMedium: ").append(toIndentedString(profileMedium)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    sex: ").append(toIndentedString(sex)).append("\n");
    sb.append("    premium: ").append(toIndentedString(premium)).append("\n");
    sb.append("    summit: ").append(toIndentedString(summit)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

