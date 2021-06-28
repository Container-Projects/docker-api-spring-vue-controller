package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskStatusContainerStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskStatusContainerStatus   {
  @JsonProperty("ContainerID")
  private String containerID;

  @JsonProperty("PID")
  private Integer PID;

  @JsonProperty("ExitCode")
  private Integer exitCode;

  public TaskStatusContainerStatus containerID(String containerID) {
    this.containerID = containerID;
    return this;
  }

  /**
   * Get containerID
   * @return containerID
  */
  @ApiModelProperty(value = "")


  public String getContainerID() {
    return containerID;
  }

  public void setContainerID(String containerID) {
    this.containerID = containerID;
  }

  public TaskStatusContainerStatus PID(Integer PID) {
    this.PID = PID;
    return this;
  }

  /**
   * Get PID
   * @return PID
  */
  @ApiModelProperty(value = "")


  public Integer getPID() {
    return PID;
  }

  public void setPID(Integer PID) {
    this.PID = PID;
  }

  public TaskStatusContainerStatus exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Get exitCode
   * @return exitCode
  */
  @ApiModelProperty(value = "")


  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskStatusContainerStatus taskStatusContainerStatus = (TaskStatusContainerStatus) o;
    return Objects.equals(this.containerID, taskStatusContainerStatus.containerID) &&
        Objects.equals(this.PID, taskStatusContainerStatus.PID) &&
        Objects.equals(this.exitCode, taskStatusContainerStatus.exitCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerID, PID, exitCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskStatusContainerStatus {\n");
    
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    PID: ").append(toIndentedString(PID)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
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

