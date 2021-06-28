package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An open port on a container
 */
@ApiModel(description = "An open port on a container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Port   {
  @JsonProperty("IP")
  private String IP;

  @JsonProperty("PrivatePort")
  private Integer privatePort;

  @JsonProperty("PublicPort")
  private Integer publicPort;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    TCP("tcp"),
    
    UDP("udp"),
    
    SCTP("sctp");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;

  public Port IP(String IP) {
    this.IP = IP;
    return this;
  }

  /**
   * Host IP address that the container's port is mapped to
   * @return IP
  */
  @ApiModelProperty(value = "Host IP address that the container's port is mapped to")


  public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }

  public Port privatePort(Integer privatePort) {
    this.privatePort = privatePort;
    return this;
  }

  /**
   * Port on the container
   * @return privatePort
  */
  @ApiModelProperty(required = true, value = "Port on the container")
  @NotNull


  public Integer getPrivatePort() {
    return privatePort;
  }

  public void setPrivatePort(Integer privatePort) {
    this.privatePort = privatePort;
  }

  public Port publicPort(Integer publicPort) {
    this.publicPort = publicPort;
    return this;
  }

  /**
   * Port exposed on the host
   * @return publicPort
  */
  @ApiModelProperty(value = "Port exposed on the host")


  public Integer getPublicPort() {
    return publicPort;
  }

  public void setPublicPort(Integer publicPort) {
    this.publicPort = publicPort;
  }

  public Port type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Port port = (Port) o;
    return Objects.equals(this.IP, port.IP) &&
        Objects.equals(this.privatePort, port.privatePort) &&
        Objects.equals(this.publicPort, port.publicPort) &&
        Objects.equals(this.type, port.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(IP, privatePort, publicPort, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Port {\n");
    
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    privatePort: ").append(toIndentedString(privatePort)).append("\n");
    sb.append("    publicPort: ").append(toIndentedString(publicPort)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

