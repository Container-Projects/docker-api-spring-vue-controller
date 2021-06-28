package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginConfigArgs;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginConfigInterface;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginConfigLinux;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginConfigNetwork;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginConfigRootfs;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginConfigUser;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginEnv;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginMount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The config of a plugin.
 */
@ApiModel(description = "The config of a plugin.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PluginConfig   {
  @JsonProperty("DockerVersion")
  private String dockerVersion;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("Documentation")
  private String documentation;

  @JsonProperty("Interface")
  private PluginConfigInterface _interface;

  @JsonProperty("Entrypoint")
  @Valid
  private List<String> entrypoint = new ArrayList<>();

  @JsonProperty("WorkDir")
  private String workDir;

  @JsonProperty("User")
  private PluginConfigUser user;

  @JsonProperty("Network")
  private PluginConfigNetwork network;

  @JsonProperty("Linux")
  private PluginConfigLinux linux;

  @JsonProperty("PropagatedMount")
  private String propagatedMount;

  @JsonProperty("IpcHost")
  private Boolean ipcHost;

  @JsonProperty("PidHost")
  private Boolean pidHost;

  @JsonProperty("Mounts")
  @Valid
  private List<PluginMount> mounts = new ArrayList<>();

  @JsonProperty("Env")
  @Valid
  private List<PluginEnv> env = new ArrayList<>();

  @JsonProperty("Args")
  private PluginConfigArgs args;

  @JsonProperty("rootfs")
  private PluginConfigRootfs rootfs;

  public PluginConfig dockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
    return this;
  }

  /**
   * Docker Version used to create the plugin
   * @return dockerVersion
  */
  @ApiModelProperty(example = "17.06.0-ce", value = "Docker Version used to create the plugin")


  public String getDockerVersion() {
    return dockerVersion;
  }

  public void setDockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
  }

  public PluginConfig description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(example = "A sample volume plugin for Docker", required = true, value = "")
  @NotNull


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PluginConfig documentation(String documentation) {
    this.documentation = documentation;
    return this;
  }

  /**
   * Get documentation
   * @return documentation
  */
  @ApiModelProperty(example = "https://docs.docker.com/engine/extend/plugins/", required = true, value = "")
  @NotNull


  public String getDocumentation() {
    return documentation;
  }

  public void setDocumentation(String documentation) {
    this.documentation = documentation;
  }

  public PluginConfig _interface(PluginConfigInterface _interface) {
    this._interface = _interface;
    return this;
  }

  /**
   * Get _interface
   * @return _interface
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PluginConfigInterface getInterface() {
    return _interface;
  }

  public void setInterface(PluginConfigInterface _interface) {
    this._interface = _interface;
  }

  public PluginConfig entrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  public PluginConfig addEntrypointItem(String entrypointItem) {
    this.entrypoint.add(entrypointItem);
    return this;
  }

  /**
   * Get entrypoint
   * @return entrypoint
  */
  @ApiModelProperty(example = "[/usr/bin/sample-volume-plugin, /data]", required = true, value = "")
  @NotNull


  public List<String> getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }

  public PluginConfig workDir(String workDir) {
    this.workDir = workDir;
    return this;
  }

  /**
   * Get workDir
   * @return workDir
  */
  @ApiModelProperty(example = "/bin/", required = true, value = "")
  @NotNull


  public String getWorkDir() {
    return workDir;
  }

  public void setWorkDir(String workDir) {
    this.workDir = workDir;
  }

  public PluginConfig user(PluginConfigUser user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @ApiModelProperty(value = "")

  @Valid

  public PluginConfigUser getUser() {
    return user;
  }

  public void setUser(PluginConfigUser user) {
    this.user = user;
  }

  public PluginConfig network(PluginConfigNetwork network) {
    this.network = network;
    return this;
  }

  /**
   * Get network
   * @return network
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PluginConfigNetwork getNetwork() {
    return network;
  }

  public void setNetwork(PluginConfigNetwork network) {
    this.network = network;
  }

  public PluginConfig linux(PluginConfigLinux linux) {
    this.linux = linux;
    return this;
  }

  /**
   * Get linux
   * @return linux
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PluginConfigLinux getLinux() {
    return linux;
  }

  public void setLinux(PluginConfigLinux linux) {
    this.linux = linux;
  }

  public PluginConfig propagatedMount(String propagatedMount) {
    this.propagatedMount = propagatedMount;
    return this;
  }

  /**
   * Get propagatedMount
   * @return propagatedMount
  */
  @ApiModelProperty(example = "/mnt/volumes", required = true, value = "")
  @NotNull


  public String getPropagatedMount() {
    return propagatedMount;
  }

  public void setPropagatedMount(String propagatedMount) {
    this.propagatedMount = propagatedMount;
  }

  public PluginConfig ipcHost(Boolean ipcHost) {
    this.ipcHost = ipcHost;
    return this;
  }

  /**
   * Get ipcHost
   * @return ipcHost
  */
  @ApiModelProperty(example = "false", required = true, value = "")
  @NotNull


  public Boolean getIpcHost() {
    return ipcHost;
  }

  public void setIpcHost(Boolean ipcHost) {
    this.ipcHost = ipcHost;
  }

  public PluginConfig pidHost(Boolean pidHost) {
    this.pidHost = pidHost;
    return this;
  }

  /**
   * Get pidHost
   * @return pidHost
  */
  @ApiModelProperty(example = "false", required = true, value = "")
  @NotNull


  public Boolean getPidHost() {
    return pidHost;
  }

  public void setPidHost(Boolean pidHost) {
    this.pidHost = pidHost;
  }

  public PluginConfig mounts(List<PluginMount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public PluginConfig addMountsItem(PluginMount mountsItem) {
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

  public PluginConfig env(List<PluginEnv> env) {
    this.env = env;
    return this;
  }

  public PluginConfig addEnvItem(PluginEnv envItem) {
    this.env.add(envItem);
    return this;
  }

  /**
   * Get env
   * @return env
  */
  @ApiModelProperty(example = "[{Name=DEBUG, Description=If set, prints debug messages, Value=0}]", required = true, value = "")
  @NotNull

  @Valid

  public List<PluginEnv> getEnv() {
    return env;
  }

  public void setEnv(List<PluginEnv> env) {
    this.env = env;
  }

  public PluginConfig args(PluginConfigArgs args) {
    this.args = args;
    return this;
  }

  /**
   * Get args
   * @return args
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PluginConfigArgs getArgs() {
    return args;
  }

  public void setArgs(PluginConfigArgs args) {
    this.args = args;
  }

  public PluginConfig rootfs(PluginConfigRootfs rootfs) {
    this.rootfs = rootfs;
    return this;
  }

  /**
   * Get rootfs
   * @return rootfs
  */
  @ApiModelProperty(value = "")

  @Valid

  public PluginConfigRootfs getRootfs() {
    return rootfs;
  }

  public void setRootfs(PluginConfigRootfs rootfs) {
    this.rootfs = rootfs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfig pluginConfig = (PluginConfig) o;
    return Objects.equals(this.dockerVersion, pluginConfig.dockerVersion) &&
        Objects.equals(this.description, pluginConfig.description) &&
        Objects.equals(this.documentation, pluginConfig.documentation) &&
        Objects.equals(this._interface, pluginConfig._interface) &&
        Objects.equals(this.entrypoint, pluginConfig.entrypoint) &&
        Objects.equals(this.workDir, pluginConfig.workDir) &&
        Objects.equals(this.user, pluginConfig.user) &&
        Objects.equals(this.network, pluginConfig.network) &&
        Objects.equals(this.linux, pluginConfig.linux) &&
        Objects.equals(this.propagatedMount, pluginConfig.propagatedMount) &&
        Objects.equals(this.ipcHost, pluginConfig.ipcHost) &&
        Objects.equals(this.pidHost, pluginConfig.pidHost) &&
        Objects.equals(this.mounts, pluginConfig.mounts) &&
        Objects.equals(this.env, pluginConfig.env) &&
        Objects.equals(this.args, pluginConfig.args) &&
        Objects.equals(this.rootfs, pluginConfig.rootfs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dockerVersion, description, documentation, _interface, entrypoint, workDir, user, network, linux, propagatedMount, ipcHost, pidHost, mounts, env, args, rootfs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfig {\n");
    
    sb.append("    dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    documentation: ").append(toIndentedString(documentation)).append("\n");
    sb.append("    _interface: ").append(toIndentedString(_interface)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    workDir: ").append(toIndentedString(workDir)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    linux: ").append(toIndentedString(linux)).append("\n");
    sb.append("    propagatedMount: ").append(toIndentedString(propagatedMount)).append("\n");
    sb.append("    ipcHost: ").append(toIndentedString(ipcHost)).append("\n");
    sb.append("    pidHost: ").append(toIndentedString(pidHost)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    rootfs: ").append(toIndentedString(rootfs)).append("\n");
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

