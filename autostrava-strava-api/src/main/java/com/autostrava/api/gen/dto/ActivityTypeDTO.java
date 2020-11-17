package com.autostrava.api.gen.dto;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * An enumeration of the types an activity may have.
 */
public enum ActivityTypeDTO {
  
  ALPINESKI("AlpineSki"),
  
  BACKCOUNTRYSKI("BackcountrySki"),
  
  CANOEING("Canoeing"),
  
  CROSSFIT("Crossfit"),
  
  EBIKERIDE("EBikeRide"),
  
  ELLIPTICAL("Elliptical"),
  
  GOLF("Golf"),
  
  HANDCYCLE("Handcycle"),
  
  HIKE("Hike"),
  
  ICESKATE("IceSkate"),
  
  INLINESKATE("InlineSkate"),
  
  KAYAKING("Kayaking"),
  
  KITESURF("Kitesurf"),
  
  NORDICSKI("NordicSki"),
  
  RIDE("Ride"),
  
  ROCKCLIMBING("RockClimbing"),
  
  ROLLERSKI("RollerSki"),
  
  ROWING("Rowing"),
  
  RUN("Run"),
  
  SAIL("Sail"),
  
  SKATEBOARD("Skateboard"),
  
  SNOWBOARD("Snowboard"),
  
  SNOWSHOE("Snowshoe"),
  
  SOCCER("Soccer"),
  
  STAIRSTEPPER("StairStepper"),
  
  STANDUPPADDLING("StandUpPaddling"),
  
  SURFING("Surfing"),
  
  SWIM("Swim"),
  
  VELOMOBILE("Velomobile"),
  
  VIRTUALRIDE("VirtualRide"),
  
  VIRTUALRUN("VirtualRun"),
  
  WALK("Walk"),
  
  WEIGHTTRAINING("WeightTraining"),
  
  WHEELCHAIR("Wheelchair"),
  
  WINDSURF("Windsurf"),
  
  WORKOUT("Workout"),
  
  YOGA("Yoga");

  private String value;

  ActivityTypeDTO(String value) {
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
  public static ActivityTypeDTO fromValue(String value) {
    for (ActivityTypeDTO b : ActivityTypeDTO.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

