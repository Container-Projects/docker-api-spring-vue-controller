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
 * Represents a peer-node in the swarm
 */
@ApiModel(description = "Represents a peer-node in the swarm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PeerNode   {
  @JsonProperty("NodeID")
  private String nodeID;

  @JsonProperty("Addr")
  private String addr;

  public PeerNode nodeID(String nodeID) {
    this.nodeID = nodeID;
    return this;
  }

  /**
   * Unique identifier of for this node in the swarm.
   * @return nodeID
  */
  @ApiModelProperty(value = "Unique identifier of for this node in the swarm.")


  public String getNodeID() {
    return nodeID;
  }

  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }

  public PeerNode addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * IP address and ports at which this node can be reached. 
   * @return addr
  */
  @ApiModelProperty(value = "IP address and ports at which this node can be reached. ")


  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PeerNode peerNode = (PeerNode) o;
    return Objects.equals(this.nodeID, peerNode.nodeID) &&
        Objects.equals(this.addr, peerNode.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeID, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PeerNode {\n");
    
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

