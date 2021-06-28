package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PluginMount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PluginMount   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Settable")
  @Valid
  private List<String> settable = new ArrayList<>();

  @JsonProperty("Source")
  private String source;

  @JsonProperty("Destination")
  private String destination;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Options")
  @Valid
  private List<String> options = new ArrayList<>();

  public PluginMount name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "some-mount", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PluginMount description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(example = "This is a mount that's used by the plugin.", required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PluginMount settable(List<String> settable) {
    this.settable = settable;
    return this;
  }

  public PluginMount addSettableItem(String settableItem) {
    this.settable.add(settableItem);
    return this;
  }

  /**
   * Get settable
   * @return settable
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getSettable() {
    return settable;
  }

  public void setSettable(List<String> settable) {
    this.settable = settable;
  }

  public PluginMount source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @ApiModelProperty(example = "/var/lib/docker/plugins/", required = true, value = "")
  @NotNull


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public PluginMount destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  @ApiModelProperty(example = "/mnt/state", required = true, value = "")
  @NotNull


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public PluginMount type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(example = "bind", required = true, value = "")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PluginMount options(List<String> options) {
    this.options = options;
    return this;
  }

  public PluginMount addOptionsItem(String optionsItem) {
    this.options.add(optionsItem);
    return this;
  }

  /**
   * Get options
   * @return options
  */
  @ApiModelProperty(example = "[rbind, rw]", required = true, value = "")
  @NotNull


  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
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
    PluginMount pluginMount = (PluginMount) o;
    return Objects.equals(this.name, pluginMount.name) &&
        Objects.equals(this.description, pluginMount.description) &&
        Objects.equals(this.settable, pluginMount.settable) &&
        Objects.equals(this.source, pluginMount.source) &&
        Objects.equals(this.destination, pluginMount.destination) &&
        Objects.equals(this.type, pluginMount.type) &&
        Objects.equals(this.options, pluginMount.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, settable, source, destination, type, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginMount {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    settable: ").append(toIndentedString(settable)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

