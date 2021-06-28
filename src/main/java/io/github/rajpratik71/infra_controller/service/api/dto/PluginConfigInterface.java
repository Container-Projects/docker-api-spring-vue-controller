package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginInterfaceType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The interface between Docker and the plugin
 */
@ApiModel(description = "The interface between Docker and the plugin")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PluginConfigInterface   {
  @JsonProperty("Types")
  @Valid
  private List<PluginInterfaceType> types = new ArrayList<>();

  @JsonProperty("Socket")
  private String socket;

  /**
   * Protocol to use for clients connecting to the plugin.
   */
  public enum ProtocolSchemeEnum {
    EMPTY(""),
    
    MOBY_PLUGINS_HTTP_V1("moby.plugins.http/v1");

    private String value;

    ProtocolSchemeEnum(String value) {
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
    public static ProtocolSchemeEnum fromValue(String value) {
      for (ProtocolSchemeEnum b : ProtocolSchemeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("ProtocolScheme")
  private ProtocolSchemeEnum protocolScheme;

  public PluginConfigInterface types(List<PluginInterfaceType> types) {
    this.types = types;
    return this;
  }

  public PluginConfigInterface addTypesItem(PluginInterfaceType typesItem) {
    this.types.add(typesItem);
    return this;
  }

  /**
   * Get types
   * @return types
  */
  @ApiModelProperty(example = "[docker.volumedriver/1.0]", required = true, value = "")
  @NotNull

  @Valid

  public List<PluginInterfaceType> getTypes() {
    return types;
  }

  public void setTypes(List<PluginInterfaceType> types) {
    this.types = types;
  }

  public PluginConfigInterface socket(String socket) {
    this.socket = socket;
    return this;
  }

  /**
   * Get socket
   * @return socket
  */
  @ApiModelProperty(example = "plugins.sock", required = true, value = "")
  @NotNull


  public String getSocket() {
    return socket;
  }

  public void setSocket(String socket) {
    this.socket = socket;
  }

  public PluginConfigInterface protocolScheme(ProtocolSchemeEnum protocolScheme) {
    this.protocolScheme = protocolScheme;
    return this;
  }

  /**
   * Protocol to use for clients connecting to the plugin.
   * @return protocolScheme
  */
  @ApiModelProperty(example = "some.protocol/v1.0", value = "Protocol to use for clients connecting to the plugin.")


  public ProtocolSchemeEnum getProtocolScheme() {
    return protocolScheme;
  }

  public void setProtocolScheme(ProtocolSchemeEnum protocolScheme) {
    this.protocolScheme = protocolScheme;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigInterface pluginConfigInterface = (PluginConfigInterface) o;
    return Objects.equals(this.types, pluginConfigInterface.types) &&
        Objects.equals(this.socket, pluginConfigInterface.socket) &&
        Objects.equals(this.protocolScheme, pluginConfigInterface.protocolScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(types, socket, protocolScheme);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigInterface {\n");
    
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("    socket: ").append(toIndentedString(socket)).append("\n");
    sb.append("    protocolScheme: ").append(toIndentedString(protocolScheme)).append("\n");
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

