package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.HealthConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Configuration for a container that is portable between hosts
 */
@ApiModel(description = "Configuration for a container that is portable between hosts")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ContainerConfig   {
  @JsonProperty("Hostname")
  private String hostname;

  @JsonProperty("Domainname")
  private String domainname;

  @JsonProperty("User")
  private String user;

  @JsonProperty("AttachStdin")
  private Boolean attachStdin = false;

  @JsonProperty("AttachStdout")
  private Boolean attachStdout = true;

  @JsonProperty("AttachStderr")
  private Boolean attachStderr = true;

  @JsonProperty("ExposedPorts")
  @Valid
  private Map<String, Object> exposedPorts = null;

  @JsonProperty("Tty")
  private Boolean tty = false;

  @JsonProperty("OpenStdin")
  private Boolean openStdin = false;

  @JsonProperty("StdinOnce")
  private Boolean stdinOnce = false;

  @JsonProperty("Env")
  @Valid
  private List<String> env = null;

  @JsonProperty("Cmd")
  @Valid
  private List<String> cmd = null;

  @JsonProperty("Healthcheck")
  private HealthConfig healthcheck;

  @JsonProperty("ArgsEscaped")
  private Boolean argsEscaped;

  @JsonProperty("Image")
  private String image;

  @JsonProperty("Volumes")
  @Valid
  private Map<String, Object> volumes = null;

  @JsonProperty("WorkingDir")
  private String workingDir;

  @JsonProperty("Entrypoint")
  @Valid
  private List<String> entrypoint = null;

  @JsonProperty("NetworkDisabled")
  private Boolean networkDisabled;

  @JsonProperty("MacAddress")
  private String macAddress;

  @JsonProperty("OnBuild")
  @Valid
  private List<String> onBuild = null;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("StopSignal")
  private String stopSignal = "SIGTERM";

  @JsonProperty("StopTimeout")
  private Integer stopTimeout;

  @JsonProperty("Shell")
  @Valid
  private List<String> shell = null;

  public ContainerConfig hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }

  /**
   * The hostname to use for the container, as a valid RFC 1123 hostname.
   * @return hostname
  */
  @ApiModelProperty(value = "The hostname to use for the container, as a valid RFC 1123 hostname.")


  public String getHostname() {
    return hostname;
  }

  public void setHostname(String hostname) {
    this.hostname = hostname;
  }

  public ContainerConfig domainname(String domainname) {
    this.domainname = domainname;
    return this;
  }

  /**
   * The domain name to use for the container.
   * @return domainname
  */
  @ApiModelProperty(value = "The domain name to use for the container.")


  public String getDomainname() {
    return domainname;
  }

  public void setDomainname(String domainname) {
    this.domainname = domainname;
  }

  public ContainerConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * The user that commands are run as inside the container.
   * @return user
  */
  @ApiModelProperty(value = "The user that commands are run as inside the container.")


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ContainerConfig attachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
    return this;
  }

  /**
   * Whether to attach to `stdin`.
   * @return attachStdin
  */
  @ApiModelProperty(value = "Whether to attach to `stdin`.")


  public Boolean getAttachStdin() {
    return attachStdin;
  }

  public void setAttachStdin(Boolean attachStdin) {
    this.attachStdin = attachStdin;
  }

  public ContainerConfig attachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
    return this;
  }

  /**
   * Whether to attach to `stdout`.
   * @return attachStdout
  */
  @ApiModelProperty(value = "Whether to attach to `stdout`.")


  public Boolean getAttachStdout() {
    return attachStdout;
  }

  public void setAttachStdout(Boolean attachStdout) {
    this.attachStdout = attachStdout;
  }

  public ContainerConfig attachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
    return this;
  }

  /**
   * Whether to attach to `stderr`.
   * @return attachStderr
  */
  @ApiModelProperty(value = "Whether to attach to `stderr`.")


  public Boolean getAttachStderr() {
    return attachStderr;
  }

  public void setAttachStderr(Boolean attachStderr) {
    this.attachStderr = attachStderr;
  }

  public ContainerConfig exposedPorts(Map<String, Object> exposedPorts) {
    this.exposedPorts = exposedPorts;
    return this;
  }

  public ContainerConfig putExposedPortsItem(String key, Object exposedPortsItem) {
    if (this.exposedPorts == null) {
      this.exposedPorts = new HashMap<>();
    }
    this.exposedPorts.put(key, exposedPortsItem);
    return this;
  }

  /**
   * An object mapping ports to an empty object in the form:  `{\"<port>/<tcp|udp|sctp>\": {}}` 
   * @return exposedPorts
  */
  @ApiModelProperty(value = "An object mapping ports to an empty object in the form:  `{\"<port>/<tcp|udp|sctp>\": {}}` ")


  public Map<String, Object> getExposedPorts() {
    return exposedPorts;
  }

  public void setExposedPorts(Map<String, Object> exposedPorts) {
    this.exposedPorts = exposedPorts;
  }

  public ContainerConfig tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Attach standard streams to a TTY, including `stdin` if it is not closed. 
   * @return tty
  */
  @ApiModelProperty(value = "Attach standard streams to a TTY, including `stdin` if it is not closed. ")


  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public ContainerConfig openStdin(Boolean openStdin) {
    this.openStdin = openStdin;
    return this;
  }

  /**
   * Open `stdin`
   * @return openStdin
  */
  @ApiModelProperty(value = "Open `stdin`")


  public Boolean getOpenStdin() {
    return openStdin;
  }

  public void setOpenStdin(Boolean openStdin) {
    this.openStdin = openStdin;
  }

  public ContainerConfig stdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
    return this;
  }

  /**
   * Close `stdin` after one attached client disconnects
   * @return stdinOnce
  */
  @ApiModelProperty(value = "Close `stdin` after one attached client disconnects")


  public Boolean getStdinOnce() {
    return stdinOnce;
  }

  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }

  public ContainerConfig env(List<String> env) {
    this.env = env;
    return this;
  }

  public ContainerConfig addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * A list of environment variables to set inside the container in the form `[\"VAR=value\", ...]`. A variable without `=` is removed from the environment, rather than to have an empty value. 
   * @return env
  */
  @ApiModelProperty(value = "A list of environment variables to set inside the container in the form `[\"VAR=value\", ...]`. A variable without `=` is removed from the environment, rather than to have an empty value. ")


  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }

  public ContainerConfig cmd(List<String> cmd) {
    this.cmd = cmd;
    return this;
  }

  public ContainerConfig addCmdItem(String cmdItem) {
    if (this.cmd == null) {
      this.cmd = new ArrayList<>();
    }
    this.cmd.add(cmdItem);
    return this;
  }

  /**
   * Command to run specified as a string or an array of strings. 
   * @return cmd
  */
  @ApiModelProperty(value = "Command to run specified as a string or an array of strings. ")


  public List<String> getCmd() {
    return cmd;
  }

  public void setCmd(List<String> cmd) {
    this.cmd = cmd;
  }

  public ContainerConfig healthcheck(HealthConfig healthcheck) {
    this.healthcheck = healthcheck;
    return this;
  }

  /**
   * Get healthcheck
   * @return healthcheck
  */
  @ApiModelProperty(value = "")

  @Valid

  public HealthConfig getHealthcheck() {
    return healthcheck;
  }

  public void setHealthcheck(HealthConfig healthcheck) {
    this.healthcheck = healthcheck;
  }

  public ContainerConfig argsEscaped(Boolean argsEscaped) {
    this.argsEscaped = argsEscaped;
    return this;
  }

  /**
   * Command is already escaped (Windows only)
   * @return argsEscaped
  */
  @ApiModelProperty(value = "Command is already escaped (Windows only)")


  public Boolean getArgsEscaped() {
    return argsEscaped;
  }

  public void setArgsEscaped(Boolean argsEscaped) {
    this.argsEscaped = argsEscaped;
  }

  public ContainerConfig image(String image) {
    this.image = image;
    return this;
  }

  /**
   * The name of the image to use when creating the container/ 
   * @return image
  */
  @ApiModelProperty(value = "The name of the image to use when creating the container/ ")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ContainerConfig volumes(Map<String, Object> volumes) {
    this.volumes = volumes;
    return this;
  }

  public ContainerConfig putVolumesItem(String key, Object volumesItem) {
    if (this.volumes == null) {
      this.volumes = new HashMap<>();
    }
    this.volumes.put(key, volumesItem);
    return this;
  }

  /**
   * An object mapping mount point paths inside the container to empty objects. 
   * @return volumes
  */
  @ApiModelProperty(value = "An object mapping mount point paths inside the container to empty objects. ")


  public Map<String, Object> getVolumes() {
    return volumes;
  }

  public void setVolumes(Map<String, Object> volumes) {
    this.volumes = volumes;
  }

  public ContainerConfig workingDir(String workingDir) {
    this.workingDir = workingDir;
    return this;
  }

  /**
   * The working directory for commands to run in.
   * @return workingDir
  */
  @ApiModelProperty(value = "The working directory for commands to run in.")


  public String getWorkingDir() {
    return workingDir;
  }

  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }

  public ContainerConfig entrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  public ContainerConfig addEntrypointItem(String entrypointItem) {
    if (this.entrypoint == null) {
      this.entrypoint = new ArrayList<>();
    }
    this.entrypoint.add(entrypointItem);
    return this;
  }

  /**
   * The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (`[\"\"]`) then the entry point is reset to system default (i.e., the entry point used by docker when there is no `ENTRYPOINT` instruction in the `Dockerfile`). 
   * @return entrypoint
  */
  @ApiModelProperty(value = "The entry point for the container as a string or an array of strings.  If the array consists of exactly one empty string (`[\"\"]`) then the entry point is reset to system default (i.e., the entry point used by docker when there is no `ENTRYPOINT` instruction in the `Dockerfile`). ")


  public List<String> getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(List<String> entrypoint) {
    this.entrypoint = entrypoint;
  }

  public ContainerConfig networkDisabled(Boolean networkDisabled) {
    this.networkDisabled = networkDisabled;
    return this;
  }

  /**
   * Disable networking for the container.
   * @return networkDisabled
  */
  @ApiModelProperty(value = "Disable networking for the container.")


  public Boolean getNetworkDisabled() {
    return networkDisabled;
  }

  public void setNetworkDisabled(Boolean networkDisabled) {
    this.networkDisabled = networkDisabled;
  }

  public ContainerConfig macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * MAC address of the container.
   * @return macAddress
  */
  @ApiModelProperty(value = "MAC address of the container.")


  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }

  public ContainerConfig onBuild(List<String> onBuild) {
    this.onBuild = onBuild;
    return this;
  }

  public ContainerConfig addOnBuildItem(String onBuildItem) {
    if (this.onBuild == null) {
      this.onBuild = new ArrayList<>();
    }
    this.onBuild.add(onBuildItem);
    return this;
  }

  /**
   * `ONBUILD` metadata that were defined in the image's `Dockerfile`. 
   * @return onBuild
  */
  @ApiModelProperty(value = "`ONBUILD` metadata that were defined in the image's `Dockerfile`. ")


  public List<String> getOnBuild() {
    return onBuild;
  }

  public void setOnBuild(List<String> onBuild) {
    this.onBuild = onBuild;
  }

  public ContainerConfig labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ContainerConfig putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  @ApiModelProperty(value = "User-defined key/value metadata.")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ContainerConfig stopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
    return this;
  }

  /**
   * Signal to stop a container as a string or unsigned integer. 
   * @return stopSignal
  */
  @ApiModelProperty(value = "Signal to stop a container as a string or unsigned integer. ")


  public String getStopSignal() {
    return stopSignal;
  }

  public void setStopSignal(String stopSignal) {
    this.stopSignal = stopSignal;
  }

  public ContainerConfig stopTimeout(Integer stopTimeout) {
    this.stopTimeout = stopTimeout;
    return this;
  }

  /**
   * Timeout to stop a container in seconds.
   * @return stopTimeout
  */
  @ApiModelProperty(value = "Timeout to stop a container in seconds.")


  public Integer getStopTimeout() {
    return stopTimeout;
  }

  public void setStopTimeout(Integer stopTimeout) {
    this.stopTimeout = stopTimeout;
  }

  public ContainerConfig shell(List<String> shell) {
    this.shell = shell;
    return this;
  }

  public ContainerConfig addShellItem(String shellItem) {
    if (this.shell == null) {
      this.shell = new ArrayList<>();
    }
    this.shell.add(shellItem);
    return this;
  }

  /**
   * Shell for when `RUN`, `CMD`, and `ENTRYPOINT` uses a shell. 
   * @return shell
  */
  @ApiModelProperty(value = "Shell for when `RUN`, `CMD`, and `ENTRYPOINT` uses a shell. ")


  public List<String> getShell() {
    return shell;
  }

  public void setShell(List<String> shell) {
    this.shell = shell;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerConfig containerConfig = (ContainerConfig) o;
    return Objects.equals(this.hostname, containerConfig.hostname) &&
        Objects.equals(this.domainname, containerConfig.domainname) &&
        Objects.equals(this.user, containerConfig.user) &&
        Objects.equals(this.attachStdin, containerConfig.attachStdin) &&
        Objects.equals(this.attachStdout, containerConfig.attachStdout) &&
        Objects.equals(this.attachStderr, containerConfig.attachStderr) &&
        Objects.equals(this.exposedPorts, containerConfig.exposedPorts) &&
        Objects.equals(this.tty, containerConfig.tty) &&
        Objects.equals(this.openStdin, containerConfig.openStdin) &&
        Objects.equals(this.stdinOnce, containerConfig.stdinOnce) &&
        Objects.equals(this.env, containerConfig.env) &&
        Objects.equals(this.cmd, containerConfig.cmd) &&
        Objects.equals(this.healthcheck, containerConfig.healthcheck) &&
        Objects.equals(this.argsEscaped, containerConfig.argsEscaped) &&
        Objects.equals(this.image, containerConfig.image) &&
        Objects.equals(this.volumes, containerConfig.volumes) &&
        Objects.equals(this.workingDir, containerConfig.workingDir) &&
        Objects.equals(this.entrypoint, containerConfig.entrypoint) &&
        Objects.equals(this.networkDisabled, containerConfig.networkDisabled) &&
        Objects.equals(this.macAddress, containerConfig.macAddress) &&
        Objects.equals(this.onBuild, containerConfig.onBuild) &&
        Objects.equals(this.labels, containerConfig.labels) &&
        Objects.equals(this.stopSignal, containerConfig.stopSignal) &&
        Objects.equals(this.stopTimeout, containerConfig.stopTimeout) &&
        Objects.equals(this.shell, containerConfig.shell);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hostname, domainname, user, attachStdin, attachStdout, attachStderr, exposedPorts, tty, openStdin, stdinOnce, env, cmd, healthcheck, argsEscaped, image, volumes, workingDir, entrypoint, networkDisabled, macAddress, onBuild, labels, stopSignal, stopTimeout, shell);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerConfig {\n");
    
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    domainname: ").append(toIndentedString(domainname)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    attachStdin: ").append(toIndentedString(attachStdin)).append("\n");
    sb.append("    attachStdout: ").append(toIndentedString(attachStdout)).append("\n");
    sb.append("    attachStderr: ").append(toIndentedString(attachStderr)).append("\n");
    sb.append("    exposedPorts: ").append(toIndentedString(exposedPorts)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    openStdin: ").append(toIndentedString(openStdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    argsEscaped: ").append(toIndentedString(argsEscaped)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    networkDisabled: ").append(toIndentedString(networkDisabled)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    onBuild: ").append(toIndentedString(onBuild)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    stopSignal: ").append(toIndentedString(stopSignal)).append("\n");
    sb.append("    stopTimeout: ").append(toIndentedString(stopTimeout)).append("\n");
    sb.append("    shell: ").append(toIndentedString(shell)).append("\n");
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

