package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Reachability represents the reachability of a node.
 */
public enum Reachability {
  
  UNKNOWN("unknown"),
  
  UNREACHABLE("unreachable"),
  
  REACHABLE("reachable");

  private String value;

  Reachability(String value) {
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
  public static Reachability fromValue(String value) {
    for (Reachability b : Reachability.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

