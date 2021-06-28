package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.NetworkAttachmentConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecContainerSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecLogDriver;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecNetworkAttachmentSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecPlacement;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecPluginSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecResources;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecRestartPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User modifiable task configuration.
 */
@ApiModel(description = "User modifiable task configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpec   {
  @JsonProperty("PluginSpec")
  private TaskSpecPluginSpec pluginSpec;

  @JsonProperty("ContainerSpec")
  private TaskSpecContainerSpec containerSpec;

  @JsonProperty("NetworkAttachmentSpec")
  private TaskSpecNetworkAttachmentSpec networkAttachmentSpec;

  @JsonProperty("Resources")
  private TaskSpecResources resources;

  @JsonProperty("RestartPolicy")
  private TaskSpecRestartPolicy restartPolicy;

  @JsonProperty("Placement")
  private TaskSpecPlacement placement;

  @JsonProperty("ForceUpdate")
  private Integer forceUpdate;

  @JsonProperty("Runtime")
  private String runtime;

  @JsonProperty("Networks")
  @Valid
  private List<NetworkAttachmentConfig> networks = null;

  @JsonProperty("LogDriver")
  private TaskSpecLogDriver logDriver;

  public TaskSpec pluginSpec(TaskSpecPluginSpec pluginSpec) {
    this.pluginSpec = pluginSpec;
    return this;
  }

  /**
   * Get pluginSpec
   * @return pluginSpec
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecPluginSpec getPluginSpec() {
    return pluginSpec;
  }

  public void setPluginSpec(TaskSpecPluginSpec pluginSpec) {
    this.pluginSpec = pluginSpec;
  }

  public TaskSpec containerSpec(TaskSpecContainerSpec containerSpec) {
    this.containerSpec = containerSpec;
    return this;
  }

  /**
   * Get containerSpec
   * @return containerSpec
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecContainerSpec getContainerSpec() {
    return containerSpec;
  }

  public void setContainerSpec(TaskSpecContainerSpec containerSpec) {
    this.containerSpec = containerSpec;
  }

  public TaskSpec networkAttachmentSpec(TaskSpecNetworkAttachmentSpec networkAttachmentSpec) {
    this.networkAttachmentSpec = networkAttachmentSpec;
    return this;
  }

  /**
   * Get networkAttachmentSpec
   * @return networkAttachmentSpec
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecNetworkAttachmentSpec getNetworkAttachmentSpec() {
    return networkAttachmentSpec;
  }

  public void setNetworkAttachmentSpec(TaskSpecNetworkAttachmentSpec networkAttachmentSpec) {
    this.networkAttachmentSpec = networkAttachmentSpec;
  }

  public TaskSpec resources(TaskSpecResources resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecResources getResources() {
    return resources;
  }

  public void setResources(TaskSpecResources resources) {
    this.resources = resources;
  }

  public TaskSpec restartPolicy(TaskSpecRestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * Get restartPolicy
   * @return restartPolicy
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecRestartPolicy getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(TaskSpecRestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public TaskSpec placement(TaskSpecPlacement placement) {
    this.placement = placement;
    return this;
  }

  /**
   * Get placement
   * @return placement
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecPlacement getPlacement() {
    return placement;
  }

  public void setPlacement(TaskSpecPlacement placement) {
    this.placement = placement;
  }

  public TaskSpec forceUpdate(Integer forceUpdate) {
    this.forceUpdate = forceUpdate;
    return this;
  }

  /**
   * A counter that triggers an update even if no relevant parameters have been changed. 
   * @return forceUpdate
  */
  @ApiModelProperty(value = "A counter that triggers an update even if no relevant parameters have been changed. ")


  public Integer getForceUpdate() {
    return forceUpdate;
  }

  public void setForceUpdate(Integer forceUpdate) {
    this.forceUpdate = forceUpdate;
  }

  public TaskSpec runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Runtime is the type of runtime specified for the task executor. 
   * @return runtime
  */
  @ApiModelProperty(value = "Runtime is the type of runtime specified for the task executor. ")


  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public TaskSpec networks(List<NetworkAttachmentConfig> networks) {
    this.networks = networks;
    return this;
  }

  public TaskSpec addNetworksItem(NetworkAttachmentConfig networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

  /**
   * Specifies which networks the service should attach to.
   * @return networks
  */
  @ApiModelProperty(value = "Specifies which networks the service should attach to.")

  @Valid

  public List<NetworkAttachmentConfig> getNetworks() {
    return networks;
  }

  public void setNetworks(List<NetworkAttachmentConfig> networks) {
    this.networks = networks;
  }

  public TaskSpec logDriver(TaskSpecLogDriver logDriver) {
    this.logDriver = logDriver;
    return this;
  }

  /**
   * Get logDriver
   * @return logDriver
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecLogDriver getLogDriver() {
    return logDriver;
  }

  public void setLogDriver(TaskSpecLogDriver logDriver) {
    this.logDriver = logDriver;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpec taskSpec = (TaskSpec) o;
    return Objects.equals(this.pluginSpec, taskSpec.pluginSpec) &&
        Objects.equals(this.containerSpec, taskSpec.containerSpec) &&
        Objects.equals(this.networkAttachmentSpec, taskSpec.networkAttachmentSpec) &&
        Objects.equals(this.resources, taskSpec.resources) &&
        Objects.equals(this.restartPolicy, taskSpec.restartPolicy) &&
        Objects.equals(this.placement, taskSpec.placement) &&
        Objects.equals(this.forceUpdate, taskSpec.forceUpdate) &&
        Objects.equals(this.runtime, taskSpec.runtime) &&
        Objects.equals(this.networks, taskSpec.networks) &&
        Objects.equals(this.logDriver, taskSpec.logDriver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pluginSpec, containerSpec, networkAttachmentSpec, resources, restartPolicy, placement, forceUpdate, runtime, networks, logDriver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpec {\n");
    
    sb.append("    pluginSpec: ").append(toIndentedString(pluginSpec)).append("\n");
    sb.append("    containerSpec: ").append(toIndentedString(containerSpec)).append("\n");
    sb.append("    networkAttachmentSpec: ").append(toIndentedString(networkAttachmentSpec)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    placement: ").append(toIndentedString(placement)).append("\n");
    sb.append("    forceUpdate: ").append(toIndentedString(forceUpdate)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    logDriver: ").append(toIndentedString(logDriver)).append("\n");
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

