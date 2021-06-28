package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Gets or Sets TaskState
 */
public enum TaskState {
  
  NEW("new"),
  
  ALLOCATED("allocated"),
  
  PENDING("pending"),
  
  ASSIGNED("assigned"),
  
  ACCEPTED("accepted"),
  
  PREPARING("preparing"),
  
  READY("ready"),
  
  STARTING("starting"),
  
  RUNNING("running"),
  
  COMPLETE("complete"),
  
  SHUTDOWN("shutdown"),
  
  FAILED("failed"),
  
  REJECTED("rejected"),
  
  REMOVE("remove"),
  
  ORPHANED("orphaned");

  private String value;

  TaskState(String value) {
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
  public static TaskState fromValue(String value) {
    for (TaskState b : TaskState.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

