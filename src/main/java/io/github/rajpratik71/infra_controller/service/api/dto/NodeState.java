package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * NodeState represents the state of a node.
 */
public enum NodeState {
  
  UNKNOWN("unknown"),
  
  DOWN("down"),
  
  READY("ready"),
  
  DISCONNECTED("disconnected");

  private String value;

  NodeState(String value) {
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
  public static NodeState fromValue(String value) {
    for (NodeState b : NodeState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

