package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject5
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineObject5   {
  @JsonProperty("ListenAddr")
  private String listenAddr;

  @JsonProperty("AdvertiseAddr")
  private String advertiseAddr;

  @JsonProperty("DataPathAddr")
  private String dataPathAddr;

  @JsonProperty("DataPathPort")
  private Integer dataPathPort;

  @JsonProperty("DefaultAddrPool")
  @Valid
  private List<String> defaultAddrPool = null;

  @JsonProperty("ForceNewCluster")
  private Boolean forceNewCluster;

  @JsonProperty("SubnetSize")
  private Integer subnetSize;

  @JsonProperty("Spec")
  private SwarmSpec spec;

  public InlineObject5 listenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
    return this;
  }

  /**
   * Listen address used for inter-manager communication, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the default swarm listening port is used. 
   * @return listenAddr
  */
  @ApiModelProperty(value = "Listen address used for inter-manager communication, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the default swarm listening port is used. ")


  public String getListenAddr() {
    return listenAddr;
  }

  public void setListenAddr(String listenAddr) {
    this.listenAddr = listenAddr;
  }

  public InlineObject5 advertiseAddr(String advertiseAddr) {
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

  public InlineObject5 dataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
    return this;
  }

  /**
   * Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other  nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. 
   * @return dataPathAddr
  */
  @ApiModelProperty(value = "Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other  nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster. ")


  public String getDataPathAddr() {
    return dataPathAddr;
  }

  public void setDataPathAddr(String dataPathAddr) {
    this.dataPathAddr = dataPathAddr;
  }

  public InlineObject5 dataPathPort(Integer dataPathPort) {
    this.dataPathPort = dataPathPort;
    return this;
  }

  /**
   * DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. if no port is set or is set to 0, default port 4789 will be used. 
   * @return dataPathPort
  */
  @ApiModelProperty(value = "DataPathPort specifies the data path port number for data traffic. Acceptable port range is 1024 to 49151. if no port is set or is set to 0, default port 4789 will be used. ")


  public Integer getDataPathPort() {
    return dataPathPort;
  }

  public void setDataPathPort(Integer dataPathPort) {
    this.dataPathPort = dataPathPort;
  }

  public InlineObject5 defaultAddrPool(List<String> defaultAddrPool) {
    this.defaultAddrPool = defaultAddrPool;
    return this;
  }

  public InlineObject5 addDefaultAddrPoolItem(String defaultAddrPoolItem) {
    if (this.defaultAddrPool == null) {
      this.defaultAddrPool = new ArrayList<>();
    }
    this.defaultAddrPool.add(defaultAddrPoolItem);
    return this;
  }

  /**
   * Default Address Pool specifies default subnet pools for global scope networks. 
   * @return defaultAddrPool
  */
  @ApiModelProperty(value = "Default Address Pool specifies default subnet pools for global scope networks. ")


  public List<String> getDefaultAddrPool() {
    return defaultAddrPool;
  }

  public void setDefaultAddrPool(List<String> defaultAddrPool) {
    this.defaultAddrPool = defaultAddrPool;
  }

  public InlineObject5 forceNewCluster(Boolean forceNewCluster) {
    this.forceNewCluster = forceNewCluster;
    return this;
  }

  /**
   * Force creation of a new swarm.
   * @return forceNewCluster
  */
  @ApiModelProperty(value = "Force creation of a new swarm.")


  public Boolean getForceNewCluster() {
    return forceNewCluster;
  }

  public void setForceNewCluster(Boolean forceNewCluster) {
    this.forceNewCluster = forceNewCluster;
  }

  public InlineObject5 subnetSize(Integer subnetSize) {
    this.subnetSize = subnetSize;
    return this;
  }

  /**
   * SubnetSize specifies the subnet size of the networks created from the default subnet pool. 
   * @return subnetSize
  */
  @ApiModelProperty(value = "SubnetSize specifies the subnet size of the networks created from the default subnet pool. ")


  public Integer getSubnetSize() {
    return subnetSize;
  }

  public void setSubnetSize(Integer subnetSize) {
    this.subnetSize = subnetSize;
  }

  public InlineObject5 spec(SwarmSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @ApiModelProperty(value = "")

  @Valid

  public SwarmSpec getSpec() {
    return spec;
  }

  public void setSpec(SwarmSpec spec) {
    this.spec = spec;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject5 inlineObject5 = (InlineObject5) o;
    return Objects.equals(this.listenAddr, inlineObject5.listenAddr) &&
        Objects.equals(this.advertiseAddr, inlineObject5.advertiseAddr) &&
        Objects.equals(this.dataPathAddr, inlineObject5.dataPathAddr) &&
        Objects.equals(this.dataPathPort, inlineObject5.dataPathPort) &&
        Objects.equals(this.defaultAddrPool, inlineObject5.defaultAddrPool) &&
        Objects.equals(this.forceNewCluster, inlineObject5.forceNewCluster) &&
        Objects.equals(this.subnetSize, inlineObject5.subnetSize) &&
        Objects.equals(this.spec, inlineObject5.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listenAddr, advertiseAddr, dataPathAddr, dataPathPort, defaultAddrPool, forceNewCluster, subnetSize, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject5 {\n");
    
    sb.append("    listenAddr: ").append(toIndentedString(listenAddr)).append("\n");
    sb.append("    advertiseAddr: ").append(toIndentedString(advertiseAddr)).append("\n");
    sb.append("    dataPathAddr: ").append(toIndentedString(dataPathAddr)).append("\n");
    sb.append("    dataPathPort: ").append(toIndentedString(dataPathPort)).append("\n");
    sb.append("    defaultAddrPool: ").append(toIndentedString(defaultAddrPool)).append("\n");
    sb.append("    forceNewCluster: ").append(toIndentedString(forceNewCluster)).append("\n");
    sb.append("    subnetSize: ").append(toIndentedString(subnetSize)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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

