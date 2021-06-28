package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.EndpointPortConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.EndpointSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceEndpointVirtualIPs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ServiceEndpoint
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceEndpoint   {
  @JsonProperty("Spec")
  private EndpointSpec spec;

  @JsonProperty("Ports")
  @Valid
  private List<EndpointPortConfig> ports = null;

  @JsonProperty("VirtualIPs")
  @Valid
  private List<ServiceEndpointVirtualIPs> virtualIPs = null;

  public ServiceEndpoint spec(EndpointSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @ApiModelProperty(value = "")

  @Valid

  public EndpointSpec getSpec() {
    return spec;
  }

  public void setSpec(EndpointSpec spec) {
    this.spec = spec;
  }

  public ServiceEndpoint ports(List<EndpointPortConfig> ports) {
    this.ports = ports;
    return this;
  }

  public ServiceEndpoint addPortsItem(EndpointPortConfig portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Get ports
   * @return ports
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<EndpointPortConfig> getPorts() {
    return ports;
  }

  public void setPorts(List<EndpointPortConfig> ports) {
    this.ports = ports;
  }

  public ServiceEndpoint virtualIPs(List<ServiceEndpointVirtualIPs> virtualIPs) {
    this.virtualIPs = virtualIPs;
    return this;
  }

  public ServiceEndpoint addVirtualIPsItem(ServiceEndpointVirtualIPs virtualIPsItem) {
    if (this.virtualIPs == null) {
      this.virtualIPs = new ArrayList<>();
    }
    this.virtualIPs.add(virtualIPsItem);
    return this;
  }

  /**
   * Get virtualIPs
   * @return virtualIPs
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ServiceEndpointVirtualIPs> getVirtualIPs() {
    return virtualIPs;
  }

  public void setVirtualIPs(List<ServiceEndpointVirtualIPs> virtualIPs) {
    this.virtualIPs = virtualIPs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceEndpoint serviceEndpoint = (ServiceEndpoint) o;
    return Objects.equals(this.spec, serviceEndpoint.spec) &&
        Objects.equals(this.ports, serviceEndpoint.ports) &&
        Objects.equals(this.virtualIPs, serviceEndpoint.virtualIPs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spec, ports, virtualIPs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEndpoint {\n");
    
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    virtualIPs: ").append(toIndentedString(virtualIPs)).append("\n");
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

