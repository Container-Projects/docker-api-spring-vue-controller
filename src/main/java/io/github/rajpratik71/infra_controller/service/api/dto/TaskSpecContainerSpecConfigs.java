package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecContainerSpecFile1;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskSpecContainerSpecConfigs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecContainerSpecConfigs   {
  @JsonProperty("File")
  private TaskSpecContainerSpecFile1 file;

  @JsonProperty("Runtime")
  private Object runtime;

  @JsonProperty("ConfigID")
  private String configID;

  @JsonProperty("ConfigName")
  private String configName;

  public TaskSpecContainerSpecConfigs file(TaskSpecContainerSpecFile1 file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecContainerSpecFile1 getFile() {
    return file;
  }

  public void setFile(TaskSpecContainerSpecFile1 file) {
    this.file = file;
  }

  public TaskSpecContainerSpecConfigs runtime(Object runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Runtime represents a target that is not mounted into the container but is used by the task  <p><br /><p>  > **Note**: `Configs.File` and `Configs.Runtime` are mutually > exclusive 
   * @return runtime
  */
  @ApiModelProperty(value = "Runtime represents a target that is not mounted into the container but is used by the task  <p><br /><p>  > **Note**: `Configs.File` and `Configs.Runtime` are mutually > exclusive ")


  public Object getRuntime() {
    return runtime;
  }

  public void setRuntime(Object runtime) {
    this.runtime = runtime;
  }

  public TaskSpecContainerSpecConfigs configID(String configID) {
    this.configID = configID;
    return this;
  }

  /**
   * ConfigID represents the ID of the specific config that we're referencing. 
   * @return configID
  */
  @ApiModelProperty(value = "ConfigID represents the ID of the specific config that we're referencing. ")


  public String getConfigID() {
    return configID;
  }

  public void setConfigID(String configID) {
    this.configID = configID;
  }

  public TaskSpecContainerSpecConfigs configName(String configName) {
    this.configName = configName;
    return this;
  }

  /**
   * ConfigName is the name of the config that this references, but this is just provided for lookup/display purposes. The config in the reference will be identified by its ID. 
   * @return configName
  */
  @ApiModelProperty(value = "ConfigName is the name of the config that this references, but this is just provided for lookup/display purposes. The config in the reference will be identified by its ID. ")


  public String getConfigName() {
    return configName;
  }

  public void setConfigName(String configName) {
    this.configName = configName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecConfigs taskSpecContainerSpecConfigs = (TaskSpecContainerSpecConfigs) o;
    return Objects.equals(this.file, taskSpecContainerSpecConfigs.file) &&
        Objects.equals(this.runtime, taskSpecContainerSpecConfigs.runtime) &&
        Objects.equals(this.configID, taskSpecContainerSpecConfigs.configID) &&
        Objects.equals(this.configName, taskSpecContainerSpecConfigs.configName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, runtime, configID, configName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecConfigs {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    configID: ").append(toIndentedString(configID)).append("\n");
    sb.append("    configName: ").append(toIndentedString(configName)).append("\n");
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

