package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Current local status of this node.
 */
public enum LocalNodeState {
  
  EMPTY(""),
  
  INACTIVE("inactive"),
  
  PENDING("pending"),
  
  ACTIVE("active"),
  
  ERROR("error"),
  
  LOCKED("locked");

  private String value;

  LocalNodeState(String value) {
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
  public static LocalNodeState fromValue(String value) {
    for (LocalNodeState b : LocalNodeState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

