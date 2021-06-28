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
 * ServiceEndpointVirtualIPs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceEndpointVirtualIPs   {
  @JsonProperty("NetworkID")
  private String networkID;

  @JsonProperty("Addr")
  private String addr;

  public ServiceEndpointVirtualIPs networkID(String networkID) {
    this.networkID = networkID;
    return this;
  }

  /**
   * Get networkID
   * @return networkID
  */
  @ApiModelProperty(value = "")


  public String getNetworkID() {
    return networkID;
  }

  public void setNetworkID(String networkID) {
    this.networkID = networkID;
  }

  public ServiceEndpointVirtualIPs addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * Get addr
   * @return addr
  */
  @ApiModelProperty(value = "")


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
    ServiceEndpointVirtualIPs serviceEndpointVirtualIPs = (ServiceEndpointVirtualIPs) o;
    return Objects.equals(this.networkID, serviceEndpointVirtualIPs.networkID) &&
        Objects.equals(this.addr, serviceEndpointVirtualIPs.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkID, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceEndpointVirtualIPs {\n");
    
    sb.append("    networkID: ").append(toIndentedString(networkID)).append("\n");
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

