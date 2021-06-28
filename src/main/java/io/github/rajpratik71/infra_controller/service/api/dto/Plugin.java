package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A plugin for the Engine API
 */
@ApiModel(description = "A plugin for the Engine API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Plugin   {
  @JsonProperty("Id")
  private String id;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Enabled")
  private Boolean enabled;

  @JsonProperty("Settings")
  private PluginSettings settings;

  @JsonProperty("PluginReference")
  private String pluginReference;

  @JsonProperty("Config")
  private PluginConfig config;

  public Plugin id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(example = "5724e2c8652da337ab2eedd19fc6fc0ec908e4bd907c7421bf6a8dfc70c4c078", value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Plugin name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "tiborvass/sample-volume-plugin", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Plugin enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * True if the plugin is running. False if the plugin is not running, only installed.
   * @return enabled
  */
  @ApiModelProperty(example = "true", required = true, value = "True if the plugin is running. False if the plugin is not running, only installed.")
  @NotNull


  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public Plugin settings(PluginSettings settings) {
    this.settings = settings;
    return this;
  }

  /**
   * Get settings
   * @return settings
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PluginSettings getSettings() {
    return settings;
  }

  public void setSettings(PluginSettings settings) {
    this.settings = settings;
  }

  public Plugin pluginReference(String pluginReference) {
    this.pluginReference = pluginReference;
    return this;
  }

  /**
   * plugin remote reference used to push/pull the plugin
   * @return pluginReference
  */
  @ApiModelProperty(example = "localhost:5000/tiborvass/sample-volume-plugin:latest", value = "plugin remote reference used to push/pull the plugin")


  public String getPluginReference() {
    return pluginReference;
  }

  public void setPluginReference(String pluginReference) {
    this.pluginReference = pluginReference;
  }

  public Plugin config(PluginConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PluginConfig getConfig() {
    return config;
  }

  public void setConfig(PluginConfig config) {
    this.config = config;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugin plugin = (Plugin) o;
    return Objects.equals(this.id, plugin.id) &&
        Objects.equals(this.name, plugin.name) &&
        Objects.equals(this.enabled, plugin.enabled) &&
        Objects.equals(this.settings, plugin.settings) &&
        Objects.equals(this.pluginReference, plugin.pluginReference) &&
        Objects.equals(this.config, plugin.config);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, settings, pluginReference, config);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugin {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    pluginReference: ").append(toIndentedString(pluginReference)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

