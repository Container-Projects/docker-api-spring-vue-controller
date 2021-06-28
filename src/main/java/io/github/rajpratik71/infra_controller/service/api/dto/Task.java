package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ObjectVersion;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskState;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskStatus;
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
 * Task
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Task   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Version")
  private ObjectVersion version;

  @JsonProperty("CreatedAt")
  private String createdAt;

  @JsonProperty("UpdatedAt")
  private String updatedAt;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("Spec")
  private TaskSpec spec;

  @JsonProperty("ServiceID")
  private String serviceID;

  @JsonProperty("Slot")
  private Integer slot;

  @JsonProperty("NodeID")
  private String nodeID;

  @JsonProperty("AssignedGenericResources")
  @Valid
  private List<Object> assignedGenericResources = null;

  @JsonProperty("Status")
  private TaskStatus status;

  @JsonProperty("DesiredState")
  private TaskState desiredState;

  @JsonProperty("JobIteration")
  private ObjectVersion jobIteration;

  public Task ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The ID of the task.
   * @return ID
  */
  @ApiModelProperty(value = "The ID of the task.")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public Task version(ObjectVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectVersion getVersion() {
    return version;
  }

  public void setVersion(ObjectVersion version) {
    this.version = version;
  }

  public Task createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Task updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @ApiModelProperty(value = "")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Task name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the task.
   * @return name
  */
  @ApiModelProperty(value = "Name of the task.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Task labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Task putLabelsItem(String key, String labelsItem) {
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

  public Task spec(TaskSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpec getSpec() {
    return spec;
  }

  public void setSpec(TaskSpec spec) {
    this.spec = spec;
  }

  public Task serviceID(String serviceID) {
    this.serviceID = serviceID;
    return this;
  }

  /**
   * The ID of the service this task is part of.
   * @return serviceID
  */
  @ApiModelProperty(value = "The ID of the service this task is part of.")


  public String getServiceID() {
    return serviceID;
  }

  public void setServiceID(String serviceID) {
    this.serviceID = serviceID;
  }

  public Task slot(Integer slot) {
    this.slot = slot;
    return this;
  }

  /**
   * Get slot
   * @return slot
  */
  @ApiModelProperty(value = "")


  public Integer getSlot() {
    return slot;
  }

  public void setSlot(Integer slot) {
    this.slot = slot;
  }

  public Task nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

  /**
   * The ID of the node that this task is on.
   * @return nodeID
  */
  @ApiModelProperty(value = "The ID of the node that this task is on.")


  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public Task assignedGenericResources(List<Object> assignedGenericResources) {
    this.assignedGenericResources = assignedGenericResources;
    return this;
  }

  public Task addAssignedGenericResourcesItem(Object assignedGenericResourcesItem) {
    if (this.assignedGenericResources == null) {
      this.assignedGenericResources = new ArrayList<>();
    }
    this.assignedGenericResources.add(assignedGenericResourcesItem);
    return this;
  }

  /**
   * User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). 
   * @return assignedGenericResources
  */
  @ApiModelProperty(example = "[{DiscreteResourceSpec={Kind=SSD, Value=3}}, {NamedResourceSpec={Kind=GPU, Value=UUID1}}, {NamedResourceSpec={Kind=GPU, Value=UUID2}}]", value = "User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). ")


  public List<Object> getAssignedGenericResources() {
    return assignedGenericResources;
  }

  public void setAssignedGenericResources(List<Object> assignedGenericResources) {
    this.assignedGenericResources = assignedGenericResources;
  }

  public Task status(TaskStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskStatus getStatus() {
    return status;
  }

  public void setStatus(TaskStatus status) {
    this.status = status;
  }

  public Task desiredState(TaskState desiredState) {
    this.desiredState = desiredState;
    return this;
  }

  /**
   * Get desiredState
   * @return desiredState
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskState getDesiredState() {
    return desiredState;
  }

  public void setDesiredState(TaskState desiredState) {
    this.desiredState = desiredState;
  }

  public Task jobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
    return this;
  }

  /**
   * Get jobIteration
   * @return jobIteration
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectVersion getJobIteration() {
    return jobIteration;
  }

  public void setJobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.ID, task.ID) &&
        Objects.equals(this.version, task.version) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.updatedAt, task.updatedAt) &&
        Objects.equals(this.name, task.name) &&
        Objects.equals(this.labels, task.labels) &&
        Objects.equals(this.spec, task.spec) &&
        Objects.equals(this.serviceID, task.serviceID) &&
        Objects.equals(this.slot, task.slot) &&
        Objects.equals(this.nodeID, task.nodeID) &&
        Objects.equals(this.assignedGenericResources, task.assignedGenericResources) &&
        Objects.equals(this.status, task.status) &&
        Objects.equals(this.desiredState, task.desiredState) &&
        Objects.equals(this.jobIteration, task.jobIteration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, name, labels, spec, serviceID, slot, nodeID, assignedGenericResources, status, desiredState, jobIteration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    serviceID: ").append(toIndentedString(serviceID)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    assignedGenericResources: ").append(toIndentedString(assignedGenericResources)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    desiredState: ").append(toIndentedString(desiredState)).append("\n");
    sb.append("    jobIteration: ").append(toIndentedString(jobIteration)).append("\n");
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

