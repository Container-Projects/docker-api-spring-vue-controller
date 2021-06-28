package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.EndpointIPAMConfig;
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
 * Configuration for a network endpoint.
 */
@ApiModel(description = "Configuration for a network endpoint.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class EndpointSettings {
  @JsonProperty("IPAMConfig")
  private JsonNullable<EndpointIPAMConfig> ipAMConfig = JsonNullable.undefined();

  @JsonProperty("Links")
  @Valid
  private List<String> links = null;

  @JsonProperty("Aliases")
  @Valid
  private List<String> aliases = null;

  @JsonProperty("NetworkID")
  private String networkID;

  @JsonProperty("EndpointID")
  private String endpointID;

  @JsonProperty("Gateway")
  private String gateway;

  @JsonProperty("IPAddress")
  private String ipAddress;

  @JsonProperty("IPPrefixLen")
  private Integer ipPrefixLen;

  @JsonProperty("IPv6Gateway")
  private String ipv6Gateway;

  @JsonProperty("GlobalIPv6Address")
  private String globalIPv6Address;

  @JsonProperty("GlobalIPv6PrefixLen")
  private Long globalIPv6PrefixLen;

  @JsonProperty("MacAddress")
  private String macAddress;

  @JsonProperty("DriverOpts")
  @Valid
  private JsonNullable<Map<String, String>> driverOpts = JsonNullable.undefined();

  public EndpointSettings ipAMConfig(EndpointIPAMConfig ipAMConfig) {
    this.ipAMConfig = JsonNullable.of(ipAMConfig);
    return this;
  }

  /**
   * Get ipAMConfig
   * 
   * @return ipAMConfig
   */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<EndpointIPAMConfig> getIpAMConfig() {
    return ipAMConfig;
  }

  public void setIpAMConfig(JsonNullable<EndpointIPAMConfig> ipAMConfig) {
    this.ipAMConfig = ipAMConfig;
  }

  public EndpointSettings links(List<String> links) {
    this.links = links;
    return this;
  }

  public EndpointSettings addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * 
   * @return links
   */
  @ApiModelProperty(example = "[container_1, container_2]", value = "")

  public List<String> getLinks() {
    return links;
  }

  public void setLinks(List<String> links) {
    this.links = links;
  }

  public EndpointSettings aliases(List<String> aliases) {
    this.aliases = aliases;
    return this;
  }

  public EndpointSettings addAliasesItem(String aliasesItem) {
    if (this.aliases == null) {
      this.aliases = new ArrayList<>();
    }
    this.aliases.add(aliasesItem);
    return this;
  }

  /**
   * Get aliases
   * 
   * @return aliases
   */
  @ApiModelProperty(example = "[server_x, server_y]", value = "")

  public List<String> getAliases() {
    return aliases;
  }

  public void setAliases(List<String> aliases) {
    this.aliases = aliases;
  }

  public EndpointSettings networkID(String networkID) {
    this.networkID = networkID;
    return this;
  }

  /**
   * Unique ID of the network.
   * 
   * @return networkID
   */
  @ApiModelProperty(example = "08754567f1f40222263eab4102e1c733ae697e8e354aa9cd6e18d7402835292a", value = "Unique ID of the network. ")

  public String getNetworkID() {
    return networkID;
  }

  public void setNetworkID(String networkID) {
    this.networkID = networkID;
  }

  public EndpointSettings endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * Unique ID for the service endpoint in a Sandbox.
   * 
   * @return endpointID
   */
  @ApiModelProperty(example = "b88f5b905aabf2893f3cbc4ee42d1ea7980bbc0a92e2c8922b1e1795298afb0b", value = "Unique ID for the service endpoint in a Sandbox. ")

  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }

  public EndpointSettings gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Gateway address for this network.
   * 
   * @return gateway
   */
  @ApiModelProperty(example = "172.17.0.1", value = "Gateway address for this network. ")

  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public EndpointSettings ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IPv4 address.
   * 
   * @return ipAddress
   */
  @ApiModelProperty(example = "172.17.0.4", value = "IPv4 address. ")

  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }

  public EndpointSettings ipPrefixLen(Integer ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
    return this;
  }

  /**
   * Mask length of the IPv4 address.
   * 
   * @return ipPrefixLen
   */
  @ApiModelProperty(example = "16", value = "Mask length of the IPv4 address. ")

  public Integer getIpPrefixLen() {
    return ipPrefixLen;
  }

  public void setIpPrefixLen(Integer ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
  }

  public EndpointSettings ipv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
    return this;
  }

  /**
   * IPv6 gateway address.
   * 
   * @return ipv6Gateway
   */
  @ApiModelProperty(example = "2001:db8:2::100", value = "IPv6 gateway address. ")

  public String getIpv6Gateway() {
    return ipv6Gateway;
  }

  public void setIpv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
  }

  public EndpointSettings globalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
    return this;
  }

  /**
   * Global IPv6 address.
   * 
   * @return globalIPv6Address
   */
  @ApiModelProperty(example = "2001:db8::5689", value = "Global IPv6 address. ")

  public String getGlobalIPv6Address() {
    return globalIPv6Address;
  }

  public void setGlobalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
  }

  public EndpointSettings globalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    return this;
  }

  /**
   * Mask length of the global IPv6 address.
   * 
   * @return globalIPv6PrefixLen
   */
  @ApiModelProperty(example = "64", value = "Mask length of the global IPv6 address. ")

  public Long getGlobalIPv6PrefixLen() {
    return globalIPv6PrefixLen;
  }

  public void setGlobalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
  }

  public EndpointSettings macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * MAC address for the endpoint on this network.
   * 
   * @return macAddress
   */
  @ApiModelProperty(example = "02:42:ac:11:00:04", value = "MAC address for the endpoint on this network. ")

  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public EndpointSettings driverOpts(Map<String, String> driverOpts) {
    this.driverOpts = JsonNullable.of(driverOpts);
    return this;
  }

  // public EndpointSettings putDriverOptsItem(String key, String driverOptsItem)
  // {
  // if (this.driverOpts == null) {
  // this.driverOpts = new HashMap<>();
  // }
  // this.driverOpts.put(key, driverOptsItem);
  // return this;
  // }

  /**
   * DriverOpts is a mapping of driver options and values. These options are
   * passed directly to the driver and are driver specific.
   * 
   * @return driverOpts
   */
  @ApiModelProperty(example = "{\"com.example.some-label\":\"some-value\",\"com.example.some-other-label\":\"some-other-value\"}", value = "DriverOpts is a mapping of driver options and values. These options are passed directly to the driver and are driver specific. ")

  public JsonNullable<Map<String, String>> getDriverOpts() {
    return driverOpts;
  }

  public void setDriverOpts(JsonNullable<Map<String, String>> driverOpts) {
    this.driverOpts = driverOpts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSettings endpointSettings = (EndpointSettings) o;
    return Objects.equals(this.ipAMConfig, endpointSettings.ipAMConfig)
        && Objects.equals(this.links, endpointSettings.links) && Objects.equals(this.aliases, endpointSettings.aliases)
        && Objects.equals(this.networkID, endpointSettings.networkID)
        && Objects.equals(this.endpointID, endpointSettings.endpointID)
        && Objects.equals(this.gateway, endpointSettings.gateway)
        && Objects.equals(this.ipAddress, endpointSettings.ipAddress)
        && Objects.equals(this.ipPrefixLen, endpointSettings.ipPrefixLen)
        && Objects.equals(this.ipv6Gateway, endpointSettings.ipv6Gateway)
        && Objects.equals(this.globalIPv6Address, endpointSettings.globalIPv6Address)
        && Objects.equals(this.globalIPv6PrefixLen, endpointSettings.globalIPv6PrefixLen)
        && Objects.equals(this.macAddress, endpointSettings.macAddress)
        && Objects.equals(this.driverOpts, endpointSettings.driverOpts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipAMConfig, links, aliases, networkID, endpointID, gateway, ipAddress, ipPrefixLen, ipv6Gateway,
        globalIPv6Address, globalIPv6PrefixLen, macAddress, driverOpts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSettings {\n");

    sb.append("    ipAMConfig: ").append(toIndentedString(ipAMConfig)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
    sb.append("    networkID: ").append(toIndentedString(networkID)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipPrefixLen: ").append(toIndentedString(ipPrefixLen)).append("\n");
    sb.append("    ipv6Gateway: ").append(toIndentedString(ipv6Gateway)).append("\n");
    sb.append("    globalIPv6Address: ").append(toIndentedString(globalIPv6Address)).append("\n");
    sb.append("    globalIPv6PrefixLen: ").append(toIndentedString(globalIPv6PrefixLen)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    driverOpts: ").append(toIndentedString(driverOpts)).append("\n");
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
