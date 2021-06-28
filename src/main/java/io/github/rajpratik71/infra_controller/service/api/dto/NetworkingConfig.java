package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.EndpointSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NetworkingConfig represents the container&#39;s networking configuration for each of its interfaces. It is used for the networking configs specified in the &#x60;docker create&#x60; and &#x60;docker network connect&#x60; commands. 
 */
@ApiModel(description = "NetworkingConfig represents the container's networking configuration for each of its interfaces. It is used for the networking configs specified in the `docker create` and `docker network connect` commands. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class NetworkingConfig   {
  @JsonProperty("EndpointsConfig")
  @Valid
  private Map<String, EndpointSettings> endpointsConfig = null;

  public NetworkingConfig endpointsConfig(Map<String, EndpointSettings> endpointsConfig) {
    this.endpointsConfig = endpointsConfig;
    return this;
  }

  public NetworkingConfig putEndpointsConfigItem(String key, EndpointSettings endpointsConfigItem) {
    if (this.endpointsConfig == null) {
      this.endpointsConfig = new HashMap<>();
    }
    this.endpointsConfig.put(key, endpointsConfigItem);
    return this;
  }

  /**
   * A mapping of network name to endpoint configuration for that network. 
   * @return endpointsConfig
  */
  @ApiModelProperty(value = "A mapping of network name to endpoint configuration for that network. ")

  @Valid

  public Map<String, EndpointSettings> getEndpointsConfig() {
    return endpointsConfig;
  }

  public void setEndpointsConfig(Map<String, EndpointSettings> endpointsConfig) {
    this.endpointsConfig = endpointsConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkingConfig networkingConfig = (NetworkingConfig) o;
    return Objects.equals(this.endpointsConfig, networkingConfig.endpointsConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointsConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkingConfig {\n");
    
    sb.append("    endpointsConfig: ").append(toIndentedString(endpointsConfig)).append("\n");
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

