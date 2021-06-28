package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginDevice;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginMount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Settings that can be modified by users.
 */
@ApiModel(description = "Settings that can be modified by users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PluginSettings   {
  @JsonProperty("Mounts")
  @Valid
  private List<PluginMount> mounts = new ArrayList<>();

  @JsonProperty("Env")
  @Valid
  private List<String> env = new ArrayList<>();

  @JsonProperty("Args")
  @Valid
  private List<String> args = new ArrayList<>();

  @JsonProperty("Devices")
  @Valid
  private List<PluginDevice> devices = new ArrayList<>();

  public PluginSettings mounts(List<PluginMount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public PluginSettings addMountsItem(PluginMount mountsItem) {
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Get mounts
   * @return mounts
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<PluginMount> getMounts() {
    return mounts;
  }

  public void setMounts(List<PluginMount> mounts) {
    this.mounts = mounts;
  }

  public PluginSettings env(List<String> env) {
    this.env = env;
    return this;
  }

  public PluginSettings addEnvItem(String envItem) {
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
  */
  @ApiModelProperty(example = "[DEBUG=0]", required = true, value = "")
  @NotNull


  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }

  public PluginSettings args(List<String> args) {
    this.args = args;
    return this;
  }

  public PluginSettings addArgsItem(String argsItem) {
    this.args.add(argsItem);
    return this;
  }

  /**
   * Get args
   * @return args
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public PluginSettings devices(List<PluginDevice> devices) {
    this.devices = devices;
    return this;
  }

  public PluginSettings addDevicesItem(PluginDevice devicesItem) {
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * Get devices
   * @return devices
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<PluginDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<PluginDevice> devices) {
    this.devices = devices;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginSettings pluginSettings = (PluginSettings) o;
    return Objects.equals(this.mounts, pluginSettings.mounts) &&
        Objects.equals(this.env, pluginSettings.env) &&
        Objects.equals(this.args, pluginSettings.args) &&
        Objects.equals(this.devices, pluginSettings.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mounts, env, args, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginSettings {\n");
    
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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

