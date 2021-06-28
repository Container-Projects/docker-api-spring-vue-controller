package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SwarmSpecCAConfigExternalCAs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecCAConfigExternalCAs   {
  /**
   * Protocol for communication with the external CA (currently only `cfssl` is supported). 
   */
  public enum ProtocolEnum {
    CFSSL("cfssl");

    private String value;

    ProtocolEnum(String value) {
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
    public static ProtocolEnum fromValue(String value) {
      for (ProtocolEnum b : ProtocolEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Protocol")
  private ProtocolEnum protocol = ProtocolEnum.CFSSL;

  @JsonProperty("URL")
  private String URL;

  @JsonProperty("Options")
  @Valid
  private Map<String, String> options = null;

  @JsonProperty("CACert")
  private String caCert;

  public SwarmSpecCAConfigExternalCAs protocol(ProtocolEnum protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * Protocol for communication with the external CA (currently only `cfssl` is supported). 
   * @return protocol
  */
  @ApiModelProperty(value = "Protocol for communication with the external CA (currently only `cfssl` is supported). ")


  public ProtocolEnum getProtocol() {
    return protocol;
  }

  public void setProtocol(ProtocolEnum protocol) {
    this.protocol = protocol;
  }

  public SwarmSpecCAConfigExternalCAs URL(String URL) {
    this.URL = URL;
    return this;
  }

  /**
   * URL where certificate signing requests should be sent. 
   * @return URL
  */
  @ApiModelProperty(value = "URL where certificate signing requests should be sent. ")


  public String getURL() {
    return URL;
  }

  public void setURL(String URL) {
    this.URL = URL;
  }

  public SwarmSpecCAConfigExternalCAs options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public SwarmSpecCAConfigExternalCAs putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * An object with key/value pairs that are interpreted as protocol-specific options for the external CA driver. 
   * @return options
  */
  @ApiModelProperty(value = "An object with key/value pairs that are interpreted as protocol-specific options for the external CA driver. ")


  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public SwarmSpecCAConfigExternalCAs caCert(String caCert) {
    this.caCert = caCert;
    return this;
  }

  /**
   * The root CA certificate (in PEM format) this external CA uses to issue TLS certificates (assumed to be to the current swarm root CA certificate if not provided). 
   * @return caCert
  */
  @ApiModelProperty(value = "The root CA certificate (in PEM format) this external CA uses to issue TLS certificates (assumed to be to the current swarm root CA certificate if not provided). ")


  public String getCaCert() {
    return caCert;
  }

  public void setCaCert(String caCert) {
    this.caCert = caCert;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecCAConfigExternalCAs swarmSpecCAConfigExternalCAs = (SwarmSpecCAConfigExternalCAs) o;
    return Objects.equals(this.protocol, swarmSpecCAConfigExternalCAs.protocol) &&
        Objects.equals(this.URL, swarmSpecCAConfigExternalCAs.URL) &&
        Objects.equals(this.options, swarmSpecCAConfigExternalCAs.options) &&
        Objects.equals(this.caCert, swarmSpecCAConfigExternalCAs.caCert);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, URL, options, caCert);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecCAConfigExternalCAs {\n");
    
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    URL: ").append(toIndentedString(URL)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    caCert: ").append(toIndentedString(caCert)).append("\n");
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

