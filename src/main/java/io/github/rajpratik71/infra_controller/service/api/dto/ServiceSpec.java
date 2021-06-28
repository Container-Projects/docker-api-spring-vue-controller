package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.EndpointSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.NetworkAttachmentConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpecMode;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpecRollbackConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpecUpdateConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User modifiable configuration for a service.
 */
@ApiModel(description = "User modifiable configuration for a service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceSpec   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("TaskTemplate")
  private TaskSpec taskTemplate;

  @JsonProperty("Mode")
  private ServiceSpecMode mode;

  @JsonProperty("UpdateConfig")
  private ServiceSpecUpdateConfig updateConfig;

  @JsonProperty("RollbackConfig")
  private ServiceSpecRollbackConfig rollbackConfig;

  @JsonProperty("Networks")
  @Valid
  private List<NetworkAttachmentConfig> networks = null;

  @JsonProperty("EndpointSpec")
  private EndpointSpec endpointSpec;

  public ServiceSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the service.
   * @return name
  */
  @ApiModelProperty(value = "Name of the service.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ServiceSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ServiceSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  @ApiModelProperty(value = "User-defined key/value metadata.")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ServiceSpec taskTemplate(TaskSpec taskTemplate) {
    this.taskTemplate = taskTemplate;
    return this;
  }

  /**
   * Get taskTemplate
   * @return taskTemplate
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpec getTaskTemplate() {
    return taskTemplate;
  }

  public void setTaskTemplate(TaskSpec taskTemplate) {
    this.taskTemplate = taskTemplate;
  }

  public ServiceSpec mode(ServiceSpecMode mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceSpecMode getMode() {
    return mode;
  }

  public void setMode(ServiceSpecMode mode) {
    this.mode = mode;
  }

  public ServiceSpec updateConfig(ServiceSpecUpdateConfig updateConfig) {
    this.updateConfig = updateConfig;
    return this;
  }

  /**
   * Get updateConfig
   * @return updateConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceSpecUpdateConfig getUpdateConfig() {
    return updateConfig;
  }

  public void setUpdateConfig(ServiceSpecUpdateConfig updateConfig) {
    this.updateConfig = updateConfig;
  }

  public ServiceSpec rollbackConfig(ServiceSpecRollbackConfig rollbackConfig) {
    this.rollbackConfig = rollbackConfig;
    return this;
  }

  /**
   * Get rollbackConfig
   * @return rollbackConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceSpecRollbackConfig getRollbackConfig() {
    return rollbackConfig;
  }

  public void setRollbackConfig(ServiceSpecRollbackConfig rollbackConfig) {
    this.rollbackConfig = rollbackConfig;
  }

  public ServiceSpec networks(List<NetworkAttachmentConfig> networks) {
    this.networks = networks;
    return this;
  }

  public ServiceSpec addNetworksItem(NetworkAttachmentConfig networksItem) {
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

  public ServiceSpec endpointSpec(EndpointSpec endpointSpec) {
    this.endpointSpec = endpointSpec;
    return this;
  }

  /**
   * Get endpointSpec
   * @return endpointSpec
  */
  @ApiModelProperty(value = "")

  @Valid

  public EndpointSpec getEndpointSpec() {
    return endpointSpec;
  }

  public void setEndpointSpec(EndpointSpec endpointSpec) {
    this.endpointSpec = endpointSpec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpec serviceSpec = (ServiceSpec) o;
    return Objects.equals(this.name, serviceSpec.name) &&
        Objects.equals(this.labels, serviceSpec.labels) &&
        Objects.equals(this.taskTemplate, serviceSpec.taskTemplate) &&
        Objects.equals(this.mode, serviceSpec.mode) &&
        Objects.equals(this.updateConfig, serviceSpec.updateConfig) &&
        Objects.equals(this.rollbackConfig, serviceSpec.rollbackConfig) &&
        Objects.equals(this.networks, serviceSpec.networks) &&
        Objects.equals(this.endpointSpec, serviceSpec.endpointSpec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, taskTemplate, mode, updateConfig, rollbackConfig, networks, endpointSpec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    taskTemplate: ").append(toIndentedString(taskTemplate)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    updateConfig: ").append(toIndentedString(updateConfig)).append("\n");
    sb.append("    rollbackConfig: ").append(toIndentedString(rollbackConfig)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    endpointSpec: ").append(toIndentedString(endpointSpec)).append("\n");
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

