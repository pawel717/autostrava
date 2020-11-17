package com.autostrava.api.gen.dto;

import java.util.Objects;
import com.autostrava.api.gen.dto.SummaryClubDTO;
import com.autostrava.api.gen.dto.SummaryGearDTO;
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
 * DetailedAthleteAllOfDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-11-17T17:18:28.526+01:00[Europe/Belgrade]")

public class DetailedAthleteAllOfDTO   {
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

  public DetailedAthleteAllOfDTO followerCount(Integer followerCount) {
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

  public DetailedAthleteAllOfDTO friendCount(Integer friendCount) {
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

  public DetailedAthleteAllOfDTO measurementPreference(MeasurementPreferenceEnum measurementPreference) {
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

  public DetailedAthleteAllOfDTO ftp(Integer ftp) {
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

  public DetailedAthleteAllOfDTO weight(Float weight) {
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

  public DetailedAthleteAllOfDTO clubs(List<SummaryClubDTO> clubs) {
    this.clubs = clubs;
    return this;
  }

  public DetailedAthleteAllOfDTO addClubsItem(SummaryClubDTO clubsItem) {
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

  public DetailedAthleteAllOfDTO bikes(List<SummaryGearDTO> bikes) {
    this.bikes = bikes;
    return this;
  }

  public DetailedAthleteAllOfDTO addBikesItem(SummaryGearDTO bikesItem) {
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

  public DetailedAthleteAllOfDTO shoes(List<SummaryGearDTO> shoes) {
    this.shoes = shoes;
    return this;
  }

  public DetailedAthleteAllOfDTO addShoesItem(SummaryGearDTO shoesItem) {
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
    DetailedAthleteAllOfDTO detailedAthleteAllOf = (DetailedAthleteAllOfDTO) o;
    return Objects.equals(this.followerCount, detailedAthleteAllOf.followerCount) &&
        Objects.equals(this.friendCount, detailedAthleteAllOf.friendCount) &&
        Objects.equals(this.measurementPreference, detailedAthleteAllOf.measurementPreference) &&
        Objects.equals(this.ftp, detailedAthleteAllOf.ftp) &&
        Objects.equals(this.weight, detailedAthleteAllOf.weight) &&
        Objects.equals(this.clubs, detailedAthleteAllOf.clubs) &&
        Objects.equals(this.bikes, detailedAthleteAllOf.bikes) &&
        Objects.equals(this.shoes, detailedAthleteAllOf.shoes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(followerCount, friendCount, measurementPreference, ftp, weight, clubs, bikes, shoes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetailedAthleteAllOfDTO {\n");
    
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

