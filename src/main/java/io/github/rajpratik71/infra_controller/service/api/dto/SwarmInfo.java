package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ClusterInfo;
import io.github.rajpratik71.infra_controller.service.api.dto.LocalNodeState;
import io.github.rajpratik71.infra_controller.service.api.dto.PeerNode;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Represents generic information about swarm. 
 */
@ApiModel(description = "Represents generic information about swarm. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmInfo   {
  @JsonProperty("NodeID")
  private String nodeID = "";

  @JsonProperty("NodeAddr")
  private String nodeAddr = "";

  @JsonProperty("LocalNodeState")
  private LocalNodeState localNodeState = LocalNodeState.EMPTY;

  @JsonProperty("ControlAvailable")
  private Boolean controlAvailable = false;

  @JsonProperty("Error")
  private String error = "";

  @JsonProperty("RemoteManagers")
  @Valid
  private JsonNullable<List<PeerNode>> remoteManagers = JsonNullable.undefined();

  @JsonProperty("Nodes")
  private JsonNullable<Integer> nodes = JsonNullable.undefined();

  @JsonProperty("Managers")
  private JsonNullable<Integer> managers = JsonNullable.undefined();

  @JsonProperty("Cluster")
  private JsonNullable<ClusterInfo> cluster = JsonNullable.undefined();

  public SwarmInfo nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

  /**
   * Unique identifier of for this node in the swarm.
   * @return nodeID
  */
  @ApiModelProperty(example = "k67qz4598weg5unwwffg6z1m1", value = "Unique identifier of for this node in the swarm.")


  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public SwarmInfo nodeAddr(String nodeAddr) {
    this.nodeAddr = nodeAddr;
    return this;
  }

  /**
   * IP address at which this node can be reached by other nodes in the swarm. 
   * @return nodeAddr
  */
  @ApiModelProperty(example = "10.0.0.46", value = "IP address at which this node can be reached by other nodes in the swarm. ")


  public String getNodeAddr() {
    return nodeAddr;
  }

  public void setNodeAddr(String nodeAddr) {
    this.nodeAddr = nodeAddr;
  }

  public SwarmInfo localNodeState(LocalNodeState localNodeState) {
    this.localNodeState = localNodeState;
    return this;
  }

  /**
   * Get localNodeState
   * @return localNodeState
  */
  @ApiModelProperty(value = "")

  @Valid

  public LocalNodeState getLocalNodeState() {
    return localNodeState;
  }

  public void setLocalNodeState(LocalNodeState localNodeState) {
    this.localNodeState = localNodeState;
  }

  public SwarmInfo controlAvailable(Boolean controlAvailable) {
    this.controlAvailable = controlAvailable;
    return this;
  }

  /**
   * Get controlAvailable
   * @return controlAvailable
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getControlAvailable() {
    return controlAvailable;
  }

  public void setControlAvailable(Boolean controlAvailable) {
    this.controlAvailable = controlAvailable;
  }

  public SwarmInfo error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @ApiModelProperty(value = "")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public SwarmInfo remoteManagers(List<PeerNode> remoteManagers) {
    this.remoteManagers = JsonNullable.of(remoteManagers);
    return this;
  }

  public SwarmInfo addRemoteManagersItem(PeerNode remoteManagersItem) {
    if (this.remoteManagers == null || !this.remoteManagers.isPresent()) {
      this.remoteManagers = JsonNullable.of(new ArrayList<>());
    }
    this.remoteManagers.get().add(remoteManagersItem);
    return this;
  }

  /**
   * List of ID's and addresses of other managers in the swarm. 
   * @return remoteManagers
  */
  @ApiModelProperty(example = "[{NodeID=71izy0goik036k48jg985xnds, Addr=10.0.0.158:2377}, {NodeID=79y6h1o4gv8n120drcprv5nmc, Addr=10.0.0.159:2377}, {NodeID=k67qz4598weg5unwwffg6z1m1, Addr=10.0.0.46:2377}]", value = "List of ID's and addresses of other managers in the swarm. ")

  @Valid

  public JsonNullable<List<PeerNode>> getRemoteManagers() {
    return remoteManagers;
  }

  public void setRemoteManagers(JsonNullable<List<PeerNode>> remoteManagers) {
    this.remoteManagers = remoteManagers;
  }

  public SwarmInfo nodes(Integer nodes) {
    this.nodes = JsonNullable.of(nodes);
    return this;
  }

  /**
   * Total number of nodes in the swarm.
   * @return nodes
  */
  @ApiModelProperty(example = "4", value = "Total number of nodes in the swarm.")


  public JsonNullable<Integer> getNodes() {
    return nodes;
  }

  public void setNodes(JsonNullable<Integer> nodes) {
    this.nodes = nodes;
  }

  public SwarmInfo managers(Integer managers) {
    this.managers = JsonNullable.of(managers);
    return this;
  }

  /**
   * Total number of managers in the swarm.
   * @return managers
  */
  @ApiModelProperty(example = "3", value = "Total number of managers in the swarm.")


  public JsonNullable<Integer> getManagers() {
    return managers;
  }

  public void setManagers(JsonNullable<Integer> managers) {
    this.managers = managers;
  }

  public SwarmInfo cluster(ClusterInfo cluster) {
    this.cluster = JsonNullable.of(cluster);
    return this;
  }

  /**
   * Get cluster
   * @return cluster
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<ClusterInfo> getCluster() {
    return cluster;
  }

  public void setCluster(JsonNullable<ClusterInfo> cluster) {
    this.cluster = cluster;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmInfo swarmInfo = (SwarmInfo) o;
    return Objects.equals(this.nodeID, swarmInfo.nodeID) &&
        Objects.equals(this.nodeAddr, swarmInfo.nodeAddr) &&
        Objects.equals(this.localNodeState, swarmInfo.localNodeState) &&
        Objects.equals(this.controlAvailable, swarmInfo.controlAvailable) &&
        Objects.equals(this.error, swarmInfo.error) &&
        Objects.equals(this.remoteManagers, swarmInfo.remoteManagers) &&
        Objects.equals(this.nodes, swarmInfo.nodes) &&
        Objects.equals(this.managers, swarmInfo.managers) &&
        Objects.equals(this.cluster, swarmInfo.cluster);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeID, nodeAddr, localNodeState, controlAvailable, error, remoteManagers, nodes, managers, cluster);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmInfo {\n");
    
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    nodeAddr: ").append(toIndentedString(nodeAddr)).append("\n");
    sb.append("    localNodeState: ").append(toIndentedString(localNodeState)).append("\n");
    sb.append("    controlAvailable: ").append(toIndentedString(controlAvailable)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    remoteManagers: ").append(toIndentedString(remoteManagers)).append("\n");
    sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
    sb.append("    managers: ").append(toIndentedString(managers)).append("\n");
    sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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

