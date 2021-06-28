package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.EngineDescription;
import io.github.rajpratik71.infra_controller.service.api.dto.Platform;
import io.github.rajpratik71.infra_controller.service.api.dto.ResourceObject;
import io.github.rajpratik71.infra_controller.service.api.dto.TLSInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeDescription encapsulates the properties of the Node as reported by the agent. 
 */
@ApiModel(description = "NodeDescription encapsulates the properties of the Node as reported by the agent. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class NodeDescription   {
  @JsonProperty("Hostname")
  private String hostname;

  @JsonProperty("Platform")
  private Platform platform;

  @JsonProperty("Resources")
  private ResourceObject resources;

  @JsonProperty("Engine")
  private EngineDescription engine;

  @JsonProperty("TLSInfo")
  private TLSInfo tlSInfo;

  public NodeDescription hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * Get hostname
   * @return hostname
  */
  @ApiModelProperty(example = "bf3067039e47", value = "")


  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public NodeDescription platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @ApiModelProperty(value = "")

  @Valid

  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }

  public NodeDescription resources(ResourceObject resources) {
    this.resources = resources;
    return this;
  }

  /**
   * Get resources
   * @return resources
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResourceObject getResources() {
    return resources;
  }

  public void setResources(ResourceObject resources) {
    this.resources = resources;
  }

  public NodeDescription engine(EngineDescription engine) {
    this.engine = engine;
    return this;
  }

  /**
   * Get engine
   * @return engine
  */
  @ApiModelProperty(value = "")

  @Valid

  public EngineDescription getEngine() {
    return engine;
  }

  public void setEngine(EngineDescription engine) {
    this.engine = engine;
  }

  public NodeDescription tlSInfo(TLSInfo tlSInfo) {
    this.tlSInfo = tlSInfo;
    return this;
  }

  /**
   * Get tlSInfo
   * @return tlSInfo
  */
  @ApiModelProperty(value = "")

  @Valid

  public TLSInfo getTlSInfo() {
    return tlSInfo;
  }

  public void setTlSInfo(TLSInfo tlSInfo) {
    this.tlSInfo = tlSInfo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeDescription nodeDescription = (NodeDescription) o;
    return Objects.equals(this.hostname, nodeDescription.hostname) &&
        Objects.equals(this.platform, nodeDescription.platform) &&
        Objects.equals(this.resources, nodeDescription.resources) &&
        Objects.equals(this.engine, nodeDescription.engine) &&
        Objects.equals(this.tlSInfo, nodeDescription.tlSInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, platform, resources, engine, tlSInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeDescription {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    tlSInfo: ").append(toIndentedString(tlSInfo)).append("\n");
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

