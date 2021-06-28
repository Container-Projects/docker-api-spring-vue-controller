package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ProcessConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExecInspectResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ExecInspectResponse   {
  @JsonProperty("CanRemove")
  private Boolean canRemove;

  @JsonProperty("DetachKeys")
  private String detachKeys;

  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Running")
  private Boolean running;

  @JsonProperty("ExitCode")
  private Integer exitCode;

  @JsonProperty("ProcessConfig")
  private ProcessConfig processConfig;

  @JsonProperty("OpenStdin")
  private Boolean openStdin;

  @JsonProperty("OpenStderr")
  private Boolean openStderr;

  @JsonProperty("OpenStdout")
  private Boolean openStdout;

  @JsonProperty("ContainerID")
  private String containerID;

  @JsonProperty("Pid")
  private Integer pid;

  public ExecInspectResponse canRemove(Boolean canRemove) {
    this.canRemove = canRemove;
    return this;
  }

  /**
   * Get canRemove
   * @return canRemove
  */
  @ApiModelProperty(value = "")


  public Boolean getCanRemove() {
    return canRemove;
  }

  public void setCanRemove(Boolean canRemove) {
    this.canRemove = canRemove;
  }

  public ExecInspectResponse detachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
    return this;
  }

  /**
   * Get detachKeys
   * @return detachKeys
  */
  @ApiModelProperty(value = "")


  public String getDetachKeys() {
    return detachKeys;
  }

  public void setDetachKeys(String detachKeys) {
    this.detachKeys = detachKeys;
  }

  public ExecInspectResponse ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
  */
  @ApiModelProperty(value = "")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ExecInspectResponse running(Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Get running
   * @return running
  */
  @ApiModelProperty(value = "")


  public Boolean getRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }

  public ExecInspectResponse exitCode(Integer exitCode) {
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

  public ExecInspectResponse processConfig(ProcessConfig processConfig) {
    this.processConfig = processConfig;
    return this;
  }

  /**
   * Get processConfig
   * @return processConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProcessConfig getProcessConfig() {
    return processConfig;
  }

  public void setProcessConfig(ProcessConfig processConfig) {
    this.processConfig = processConfig;
  }

  public ExecInspectResponse openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  /**
   * Get openStdin
   * @return openStdin
  */
  @ApiModelProperty(value = "")


  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }

  public ExecInspectResponse openStderr(Boolean openStderr) {
    this.openStderr = openStderr;
    return this;
  }

  /**
   * Get openStderr
   * @return openStderr
  */
  @ApiModelProperty(value = "")


  public Boolean getOpenStderr() {
    return openStderr;
  }

  public void setOpenStderr(Boolean openStderr) {
    this.openStderr = openStderr;
  }

  public ExecInspectResponse openStdout(Boolean openStdout) {
    this.openStdout = openStdout;
    return this;
  }

  /**
   * Get openStdout
   * @return openStdout
  */
  @ApiModelProperty(value = "")


  public Boolean getOpenStdout() {
    return openStdout;
  }

  public void setOpenStdout(Boolean openStdout) {
    this.openStdout = openStdout;
  }

  public ExecInspectResponse containerID(String containerID) {
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

  public ExecInspectResponse pid(Integer pid) {
    this.pid = pid;
    return this;
  }

  /**
   * The system process ID for the exec process.
   * @return pid
  */
  @ApiModelProperty(value = "The system process ID for the exec process.")


  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExecInspectResponse execInspectResponse = (ExecInspectResponse) o;
    return Objects.equals(this.canRemove, execInspectResponse.canRemove) &&
        Objects.equals(this.detachKeys, execInspectResponse.detachKeys) &&
        Objects.equals(this.ID, execInspectResponse.ID) &&
        Objects.equals(this.running, execInspectResponse.running) &&
        Objects.equals(this.exitCode, execInspectResponse.exitCode) &&
        Objects.equals(this.processConfig, execInspectResponse.processConfig) &&
        Objects.equals(this.openStdin, execInspectResponse.openStdin) &&
        Objects.equals(this.openStderr, execInspectResponse.openStderr) &&
        Objects.equals(this.openStdout, execInspectResponse.openStdout) &&
        Objects.equals(this.containerID, execInspectResponse.containerID) &&
        Objects.equals(this.pid, execInspectResponse.pid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canRemove, detachKeys, ID, running, exitCode, processConfig, openStdin, openStderr, openStdout, containerID, pid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecInspectResponse {\n");
    
    sb.append("    canRemove: ").append(toIndentedString(canRemove)).append("\n");
    sb.append("    detachKeys: ").append(toIndentedString(detachKeys)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    processConfig: ").append(toIndentedString(processConfig)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    openStderr: ").append(toIndentedString(openStderr)).append("\n");
    sb.append("    openStdout: ").append(toIndentedString(openStdout)).append("\n");
    sb.append("    containerID: ").append(toIndentedString(containerID)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
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

