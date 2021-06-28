package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ManagerStatus;
import io.github.rajpratik71.infra_controller.service.api.dto.NodeDescription;
import io.github.rajpratik71.infra_controller.service.api.dto.NodeSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.NodeStatus;
import io.github.rajpratik71.infra_controller.service.api.dto.ObjectVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Node
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Node   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Version")
  private ObjectVersion version;

  @JsonProperty("CreatedAt")
  private String createdAt;

  @JsonProperty("UpdatedAt")
  private String updatedAt;

  @JsonProperty("Spec")
  private NodeSpec spec;

  @JsonProperty("Description")
  private NodeDescription description;

  @JsonProperty("Status")
  private NodeStatus status;

  @JsonProperty("ManagerStatus")
  private JsonNullable<ManagerStatus> managerStatus = JsonNullable.undefined();

  public Node ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
  */
  @ApiModelProperty(example = "24ifsmvkjbyhk", value = "")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public Node version(ObjectVersion version) {
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

  public Node createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time at which the node was added to the swarm in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return createdAt
  */
  @ApiModelProperty(example = "2016-08-18T10:44:24.496525531Z", value = "Date and time at which the node was added to the swarm in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Node updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date and time at which the node was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return updatedAt
  */
  @ApiModelProperty(example = "2017-08-09T07:09:37.632105588Z", value = "Date and time at which the node was last updated in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Node spec(NodeSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @ApiModelProperty(value = "")

  @Valid

  public NodeSpec getSpec() {
    return spec;
  }

  public void setSpec(NodeSpec spec) {
    this.spec = spec;
  }

  public Node description(NodeDescription description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")

  @Valid

  public NodeDescription getDescription() {
    return description;
  }

  public void setDescription(NodeDescription description) {
    this.description = description;
  }

  public Node status(NodeStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")

  @Valid

  public NodeStatus getStatus() {
    return status;
  }

  public void setStatus(NodeStatus status) {
    this.status = status;
  }

  public Node managerStatus(ManagerStatus managerStatus) {
    this.managerStatus = JsonNullable.of(managerStatus);
    return this;
  }

  /**
   * Get managerStatus
   * @return managerStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ManagerStatus> getManagerStatus() {
    return managerStatus;
  }

  public void setManagerStatus(JsonNullable<ManagerStatus> managerStatus) {
    this.managerStatus = managerStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Node node = (Node) o;
    return Objects.equals(this.ID, node.ID) &&
        Objects.equals(this.version, node.version) &&
        Objects.equals(this.createdAt, node.createdAt) &&
        Objects.equals(this.updatedAt, node.updatedAt) &&
        Objects.equals(this.spec, node.spec) &&
        Objects.equals(this.description, node.description) &&
        Objects.equals(this.status, node.status) &&
        Objects.equals(this.managerStatus, node.managerStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, spec, description, status, managerStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Node {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    managerStatus: ").append(toIndentedString(managerStatus)).append("\n");
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

