package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject6
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineObject6   {
  @JsonProperty("ListenAddr")
  private String listenAddr;

  @JsonProperty("AdvertiseAddr")
  private String advertiseAddr;

  @JsonProperty("DataPathAddr")
  private String dataPathAddr;

  @JsonProperty("RemoteAddrs")
  @Valid
  private List<String> remoteAddrs = null;

  @JsonProperty("JoinToken")
  private String joinToken;

  public InlineObject6 listenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
    return this;
  }

  /**
   * Listen address used for inter-manager communication if the node gets promoted to manager, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). 
   * @return listenAddr
  */
  @ApiModelProperty(value = "Listen address used for inter-manager communication if the node gets promoted to manager, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). ")


  public String getListenAddr() {
    return listenAddr;
  }

  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }

  public InlineObject6 advertiseAddr(String advertiseAddr) {
    this.advertiseAddr = advertiseAddr;
    return this;
  }

  /**
   * Externally reachable address advertised to other nodes. This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the port number from the listen address is used. If `AdvertiseAddr` is not specified, it will be automatically detected when possible. 
   * @return advertiseAddr
  */
  @ApiModelProperty(value = "Externally reachable address advertised to other nodes. This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the port number from the listen address is used. If `AdvertiseAddr` is not specified, it will be automatically detected when possible. ")


  public String getAdvertiseAddr() {
    return advertiseAddr;
  }

  public void setAdvertiseAddr(String advertiseAddr) {
    this.advertiseAddr = advertiseAddr;
  }

  public InlineObject6 dataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
    return this;
  }

  /**
   * Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. 
   * @return dataPathAddr
  */
  @ApiModelProperty(value = "Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. ")


  public String getDataPathAddr() {
    return dataPathAddr;
  }

  public void setDataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
  }

  public InlineObject6 remoteAddrs(List<String> remoteAddrs) {
    this.remoteAddrs = remoteAddrs;
    return this;
  }

  public InlineObject6 addRemoteAddrsItem(String remoteAddrsItem) {
    if (this.remoteAddrs == null) {
      this.remoteAddrs = new ArrayList<>();
    }
    this.remoteAddrs.add(remoteAddrsItem);
    return this;
  }

  /**
   * Addresses of manager nodes already participating in the swarm. 
   * @return remoteAddrs
  */
  @ApiModelProperty(value = "Addresses of manager nodes already participating in the swarm. ")


  public List<String> getRemoteAddrs() {
    return remoteAddrs;
  }

  public void setRemoteAddrs(List<String> remoteAddrs) {
    this.remoteAddrs = remoteAddrs;
  }

  public InlineObject6 joinToken(String joinToken) {
    this.joinToken = joinToken;
    return this;
  }

  /**
   * Secret token for joining this swarm.
   * @return joinToken
  */
  @ApiModelProperty(value = "Secret token for joining this swarm.")


  public String getJoinToken() {
    return joinToken;
  }

  public void setJoinToken(String joinToken) {
    this.joinToken = joinToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject6 inlineObject6 = (InlineObject6) o;
    return Objects.equals(this.listenAddr, inlineObject6.listenAddr) &&
        Objects.equals(this.advertiseAddr, inlineObject6.advertiseAddr) &&
        Objects.equals(this.dataPathAddr, inlineObject6.dataPathAddr) &&
        Objects.equals(this.remoteAddrs, inlineObject6.remoteAddrs) &&
        Objects.equals(this.joinToken, inlineObject6.joinToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenAddr, advertiseAddr, dataPathAddr, remoteAddrs, joinToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject6 {\n");
    
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    advertiseAddr: ").append(toIndentedString(advertiseAddr)).append("\n");
    sb.append("    dataPathAddr: ").append(toIndentedString(dataPathAddr)).append("\n");
    sb.append("    remoteAddrs: ").append(toIndentedString(remoteAddrs)).append("\n");
    sb.append("    joinToken: ").append(toIndentedString(joinToken)).append("\n");
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

