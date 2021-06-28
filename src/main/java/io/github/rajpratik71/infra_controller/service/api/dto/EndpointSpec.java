package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.EndpointPortConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Properties that can be configured to access and load balance a service.
 */
@ApiModel(description = "Properties that can be configured to access and load balance a service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class EndpointSpec   {
  /**
   * The mode of resolution to use for internal load balancing between tasks. 
   */
  public enum ModeEnum {
    VIP("vip"),
    
    DNSRR("dnsrr");

    private String value;

    ModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModeEnum fromValue(String value) {
      for (ModeEnum b : ModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Mode")
  private ModeEnum mode = ModeEnum.VIP;

  @JsonProperty("Ports")
  @Valid
  private List<EndpointPortConfig> ports = null;

  public EndpointSpec mode(ModeEnum mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The mode of resolution to use for internal load balancing between tasks. 
   * @return mode
  */
  @ApiModelProperty(value = "The mode of resolution to use for internal load balancing between tasks. ")


  public ModeEnum getMode() {
    return mode;
  }

  public void setMode(ModeEnum mode) {
    this.mode = mode;
  }

  public EndpointSpec ports(List<EndpointPortConfig> ports) {
    this.ports = ports;
    return this;
  }

  public EndpointSpec addPortsItem(EndpointPortConfig portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * List of exposed ports that this service is accessible on from the outside. Ports can only be provided if `vip` resolution mode is used. 
   * @return ports
  */
  @ApiModelProperty(value = "List of exposed ports that this service is accessible on from the outside. Ports can only be provided if `vip` resolution mode is used. ")

  @Valid

  public List<EndpointPortConfig> getPorts() {
    return ports;
  }

  public void setPorts(List<EndpointPortConfig> ports) {
    this.ports = ports;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointSpec endpointSpec = (EndpointSpec) o;
    return Objects.equals(this.mode, endpointSpec.mode) &&
        Objects.equals(this.ports, endpointSpec.ports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mode, ports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointSpec {\n");
    
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
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

