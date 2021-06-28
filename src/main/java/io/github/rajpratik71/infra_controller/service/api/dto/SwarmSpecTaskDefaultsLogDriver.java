package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The log driver to use for tasks created in the orchestrator if unspecified by a service.  Updating this value only affects new tasks. Existing tasks continue to use their previously configured log driver until recreated. 
 */
@ApiModel(description = "The log driver to use for tasks created in the orchestrator if unspecified by a service.  Updating this value only affects new tasks. Existing tasks continue to use their previously configured log driver until recreated. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecTaskDefaultsLogDriver   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Options")
  @Valid
  private Map<String, String> options = null;

  public SwarmSpecTaskDefaultsLogDriver name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The log driver to use as a default for new tasks. 
   * @return name
  */
  @ApiModelProperty(example = "json-file", value = "The log driver to use as a default for new tasks. ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwarmSpecTaskDefaultsLogDriver options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public SwarmSpecTaskDefaultsLogDriver putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Driver-specific options for the selectd log driver, specified as key/value pairs. 
   * @return options
  */
  @ApiModelProperty(example = "{\"max-file\":\"10\",\"max-size\":\"100m\"}", value = "Driver-specific options for the selectd log driver, specified as key/value pairs. ")


  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecTaskDefaultsLogDriver swarmSpecTaskDefaultsLogDriver = (SwarmSpecTaskDefaultsLogDriver) o;
    return Objects.equals(this.name, swarmSpecTaskDefaultsLogDriver.name) &&
        Objects.equals(this.options, swarmSpecTaskDefaultsLogDriver.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecTaskDefaultsLogDriver {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

