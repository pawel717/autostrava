package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.DetailedAthleteAllOfDTO;
import com.autostrava.api.gen.dto.SummaryAthleteDTO;
import com.autostrava.api.gen.dto.SummaryClubDTO;
import com.autostrava.api.gen.dto.SummaryGearDTO;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DetailedAthleteDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedAthleteDTO   {
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

  @JsonProperty("follower_count")
  private Integer followerCount;

  @JsonProperty("friend_count")
  private Integer friendCount;

  /**
   * The athlete's preferred unit system.
   */
  public enum MeasurementPreferenceEnum {
    FEET("feet"),
    
    METERS("meters");

    private String value;

    MeasurementPreferenceEnum(String value) {
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
    public static MeasurementPreferenceEnum fromValue(String value) {
      for (MeasurementPreferenceEnum b : MeasurementPreferenceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("measurement_preference")
  private MeasurementPreferenceEnum measurementPreference;

  @JsonProperty("ftp")
  private Integer ftp;

  @JsonProperty("weight")
  private Float weight;

  @JsonProperty("clubs")
  @Valid
  private List<SummaryClubDTO> clubs = null;

  @JsonProperty("bikes")
  @Valid
  private List<SummaryGearDTO> bikes = null;

  @JsonProperty("shoes")
  @Valid
  private List<SummaryGearDTO> shoes = null;

  public DetailedAthleteDTO id(Long id) {
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

  public DetailedAthleteDTO resourceState(Integer resourceState) {
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

  public DetailedAthleteDTO firstname(String firstname) {
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

  public DetailedAthleteDTO lastname(String lastname) {
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

  public DetailedAthleteDTO profileMedium(String profileMedium) {
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

  public DetailedAthleteDTO profile(String profile) {
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

  public DetailedAthleteDTO city(String city) {
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

  public DetailedAthleteDTO state(String state) {
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

  public DetailedAthleteDTO country(String country) {
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

  public DetailedAthleteDTO sex(SexEnum sex) {
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

  public DetailedAthleteDTO premium(Boolean premium) {
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

  public DetailedAthleteDTO summit(Boolean summit) {
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

  public DetailedAthleteDTO createdAt(OffsetDateTime createdAt) {
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

  public DetailedAthleteDTO updatedAt(OffsetDateTime updatedAt) {
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

  public DetailedAthleteDTO followerCount(Integer followerCount) {
    this.followerCount = followerCount;
    return this;
  }

  /**
   * The athlete's follower count.
   * @return followerCount
  */
  @ApiModelProperty(value = "The athlete's follower count.")


  public Integer getFollowerCount() {
    return followerCount;
  }

  public void setFollowerCount(Integer followerCount) {
    this.followerCount = followerCount;
  }

  public DetailedAthleteDTO friendCount(Integer friendCount) {
    this.friendCount = friendCount;
    return this;
  }

  /**
   * The athlete's friend count.
   * @return friendCount
  */
  @ApiModelProperty(value = "The athlete's friend count.")


  public Integer getFriendCount() {
    return friendCount;
  }

  public void setFriendCount(Integer friendCount) {
    this.friendCount = friendCount;
  }

  public DetailedAthleteDTO measurementPreference(MeasurementPreferenceEnum measurementPreference) {
    this.measurementPreference = measurementPreference;
    return this;
  }

  /**
   * The athlete's preferred unit system.
   * @return measurementPreference
  */
  @ApiModelProperty(value = "The athlete's preferred unit system.")


  public MeasurementPreferenceEnum getMeasurementPreference() {
    return measurementPreference;
  }

  public void setMeasurementPreference(MeasurementPreferenceEnum measurementPreference) {
    this.measurementPreference = measurementPreference;
  }

  public DetailedAthleteDTO ftp(Integer ftp) {
    this.ftp = ftp;
    return this;
  }

  /**
   * The athlete's FTP (Functional Threshold Power).
   * @return ftp
  */
  @ApiModelProperty(value = "The athlete's FTP (Functional Threshold Power).")


  public Integer getFtp() {
    return ftp;
  }

  public void setFtp(Integer ftp) {
    this.ftp = ftp;
  }

  public DetailedAthleteDTO weight(Float weight) {
    this.weight = weight;
    return this;
  }

  /**
   * The athlete's weight.
   * @return weight
  */
  @ApiModelProperty(value = "The athlete's weight.")


  public Float getWeight() {
    return weight;
  }

  public void setWeight(Float weight) {
    this.weight = weight;
  }

  public DetailedAthleteDTO clubs(List<SummaryClubDTO> clubs) {
    this.clubs = clubs;
    return this;
  }

  public DetailedAthleteDTO addClubsItem(SummaryClubDTO clubsItem) {
    if (this.clubs == null) {
      this.clubs = new ArrayList<>();
    }
    this.clubs.add(clubsItem);
    return this;
  }

  /**
   * The athlete's clubs.
   * @return clubs
  */
  @ApiModelProperty(value = "The athlete's clubs.")

  @Valid

  public List<SummaryClubDTO> getClubs() {
    return clubs;
  }

  public void setClubs(List<SummaryClubDTO> clubs) {
    this.clubs = clubs;
  }

  public DetailedAthleteDTO bikes(List<SummaryGearDTO> bikes) {
    this.bikes = bikes;
    return this;
  }

  public DetailedAthleteDTO addBikesItem(SummaryGearDTO bikesItem) {
    if (this.bikes == null) {
      this.bikes = new ArrayList<>();
    }
    this.bikes.add(bikesItem);
    return this;
  }

  /**
   * The athlete's bikes.
   * @return bikes
  */
  @ApiModelProperty(value = "The athlete's bikes.")

  @Valid

  public List<SummaryGearDTO> getBikes() {
    return bikes;
  }

  public void setBikes(List<SummaryGearDTO> bikes) {
    this.bikes = bikes;
  }

  public DetailedAthleteDTO shoes(List<SummaryGearDTO> shoes) {
    this.shoes = shoes;
    return this;
  }

  public DetailedAthleteDTO addShoesItem(SummaryGearDTO shoesItem) {
    if (this.shoes == null) {
      this.shoes = new ArrayList<>();
    }
    this.shoes.add(shoesItem);
    return this;
  }

  /**
   * The athlete's shoes.
   * @return shoes
  */
  @ApiModelProperty(value = "The athlete's shoes.")

  @Valid

  public List<SummaryGearDTO> getShoes() {
    return shoes;
  }

  public void setShoes(List<SummaryGearDTO> shoes) {
    this.shoes = shoes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DetailedAthleteDTO detailedAthlete = (DetailedAthleteDTO) o;
    return Objects.equals(this.id, detailedAthlete.id) &&
        Objects.equals(this.resourceState, detailedAthlete.resourceState) &&
        Objects.equals(this.firstname, detailedAthlete.firstname) &&
        Objects.equals(this.lastname, detailedAthlete.lastname) &&
        Objects.equals(this.profileMedium, detailedAthlete.profileMedium) &&
        Objects.equals(this.profile, detailedAthlete.profile) &&
        Objects.equals(this.city, detailedAthlete.city) &&
        Objects.equals(this.state, detailedAthlete.state) &&
        Objects.equals(this.country, detailedAthlete.country) &&
        Objects.equals(this.sex, detailedAthlete.sex) &&
        Objects.equals(this.premium, detailedAthlete.premium) &&
        Objects.equals(this.summit, detailedAthlete.summit) &&
        Objects.equals(this.createdAt, detailedAthlete.createdAt) &&
        Objects.equals(this.updatedAt, detailedAthlete.updatedAt) &&
        Objects.equals(this.followerCount, detailedAthlete.followerCount) &&
        Objects.equals(this.friendCount, detailedAthlete.friendCount) &&
        Objects.equals(this.measurementPreference, detailedAthlete.measurementPreference) &&
        Objects.equals(this.ftp, detailedAthlete.ftp) &&
        Objects.equals(this.weight, detailedAthlete.weight) &&
        Objects.equals(this.clubs, detailedAthlete.clubs) &&
        Objects.equals(this.bikes, detailedAthlete.bikes) &&
        Objects.equals(this.shoes, detailedAthlete.shoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, resourceState, firstname, lastname, profileMedium, profile, city, state, country, sex, premium, summit, createdAt, updatedAt, followerCount, friendCount, measurementPreference, ftp, weight, clubs, bikes, shoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedAthleteDTO {\n");
    
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
    sb.append("    followerCount: ").append(toIndentedString(followerCount)).append("\n");
    sb.append("    friendCount: ").append(toIndentedString(friendCount)).append("\n");
    sb.append("    measurementPreference: ").append(toIndentedString(measurementPreference)).append("\n");
    sb.append("    ftp: ").append(toIndentedString(ftp)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    clubs: ").append(toIndentedString(clubs)).append("\n");
    sb.append("    bikes: ").append(toIndentedString(bikes)).append("\n");
    sb.append("    shoes: ").append(toIndentedString(shoes)).append("\n");
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

