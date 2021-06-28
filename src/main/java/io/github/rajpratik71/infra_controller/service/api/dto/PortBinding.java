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
 * PortBinding represents a binding between a host IP address and a host port. 
 */
@ApiModel(description = "PortBinding represents a binding between a host IP address and a host port. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PortBinding   {
  @JsonProperty("HostIp")
  private String hostIp;

  @JsonProperty("HostPort")
  private String hostPort;

  public PortBinding hostIp(String hostIp) {
    this.hostIp = hostIp;
    return this;
  }

  /**
   * Host IP address that the container's port is mapped to.
   * @return hostIp
  */
  @ApiModelProperty(example = "127.0.0.1", value = "Host IP address that the container's port is mapped to.")


  public String getHostIp() {
    return hostIp;
  }

  public void setHostIp(String hostIp) {
    this.hostIp = hostIp;
  }

  public PortBinding hostPort(String hostPort) {
    this.hostPort = hostPort;
    return this;
  }

  /**
   * Host port number that the container's port is mapped to.
   * @return hostPort
  */
  @ApiModelProperty(example = "4443", value = "Host port number that the container's port is mapped to.")


  public String getHostPort() {
    return hostPort;
  }

  public void setHostPort(String hostPort) {
    this.hostPort = hostPort;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PortBinding portBinding = (PortBinding) o;
    return Objects.equals(this.hostIp, portBinding.hostIp) &&
        Objects.equals(this.hostPort, portBinding.hostPort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostIp, hostPort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PortBinding {\n");
    
    sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
    sb.append("    hostPort: ").append(toIndentedString(hostPort)).append("\n");
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

