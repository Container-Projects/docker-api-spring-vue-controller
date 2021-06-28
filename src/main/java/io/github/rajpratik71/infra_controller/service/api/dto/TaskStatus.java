package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskState;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskStatusContainerStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskStatus   {
  @JsonProperty("Timestamp")
  private String timestamp;

  @JsonProperty("State")
  private TaskState state;

  @JsonProperty("Message")
  private String message;

  @JsonProperty("Err")
  private String err;

  @JsonProperty("ContainerStatus")
  private TaskStatusContainerStatus containerStatus;

  public TaskStatus timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")


  public String getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  public TaskStatus state(TaskState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskState getState() {
    return state;
  }

  public void setState(TaskState state) {
    this.state = state;
  }

  public TaskStatus message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  */
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public TaskStatus err(String err) {
    this.err = err;
    return this;
  }

  /**
   * Get err
   * @return err
  */
  @ApiModelProperty(value = "")


  public String getErr() {
    return err;
  }

  public void setErr(String err) {
    this.err = err;
  }

  public TaskStatus containerStatus(TaskStatusContainerStatus containerStatus) {
    this.containerStatus = containerStatus;
    return this;
  }

  /**
   * Get containerStatus
   * @return containerStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskStatusContainerStatus getContainerStatus() {
    return containerStatus;
  }

  public void setContainerStatus(TaskStatusContainerStatus containerStatus) {
    this.containerStatus = containerStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskStatus taskStatus = (TaskStatus) o;
    return Objects.equals(this.timestamp, taskStatus.timestamp) &&
        Objects.equals(this.state, taskStatus.state) &&
        Objects.equals(this.message, taskStatus.message) &&
        Objects.equals(this.err, taskStatus.err) &&
        Objects.equals(this.containerStatus, taskStatus.containerStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, state, message, err, containerStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatus {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    err: ").append(toIndentedString(err)).append("\n");
    sb.append("    containerStatus: ").append(toIndentedString(containerStatus)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

