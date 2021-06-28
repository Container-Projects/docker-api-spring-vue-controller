package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.EndpointSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject3
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineObject3   {
  @JsonProperty("Container")
  private String container;

  @JsonProperty("EndpointConfig")
  private EndpointSettings endpointConfig;

  public InlineObject3 container(String container) {
    this.container = container;
    return this;
  }

  /**
   * The ID or name of the container to connect to the network.
   * @return container
  */
  @ApiModelProperty(value = "The ID or name of the container to connect to the network.")


  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public InlineObject3 endpointConfig(EndpointSettings endpointConfig) {
    this.endpointConfig = endpointConfig;
    return this;
  }

  /**
   * Get endpointConfig
   * @return endpointConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public EndpointSettings getEndpointConfig() {
    return endpointConfig;
  }

  public void setEndpointConfig(EndpointSettings endpointConfig) {
    this.endpointConfig = endpointConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject3 inlineObject3 = (InlineObject3) o;
    return Objects.equals(this.container, inlineObject3.container) &&
        Objects.equals(this.endpointConfig, inlineObject3.endpointConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, endpointConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject3 {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    endpointConfig: ").append(toIndentedString(endpointConfig)).append("\n");
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

