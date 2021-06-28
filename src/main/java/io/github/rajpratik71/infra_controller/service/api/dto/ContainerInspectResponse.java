package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerState;
import io.github.rajpratik71.infra_controller.service.api.dto.GraphDriverData;
import io.github.rajpratik71.infra_controller.service.api.dto.HostConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.MountPoint;
import io.github.rajpratik71.infra_controller.service.api.dto.NetworkSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ContainerInspectResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ContainerInspectResponse   {
  @JsonProperty("Id")
  private String id;

  @JsonProperty("Created")
  private String created;

  @JsonProperty("Path")
  private String path;

  @JsonProperty("Args")
  @Valid
  private List<String> args = null;

  @JsonProperty("State")
  private ContainerState state;

  @JsonProperty("Image")
  private String image;

  @JsonProperty("ResolvConfPath")
  private String resolvConfPath;

  @JsonProperty("HostnamePath")
  private String hostnamePath;

  @JsonProperty("HostsPath")
  private String hostsPath;

  @JsonProperty("LogPath")
  private String logPath;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("RestartCount")
  private Integer restartCount;

  @JsonProperty("Driver")
  private String driver;

  @JsonProperty("Platform")
  private String platform;

  @JsonProperty("MountLabel")
  private String mountLabel;

  @JsonProperty("ProcessLabel")
  private String processLabel;

  @JsonProperty("AppArmorProfile")
  private String appArmorProfile;

  @JsonProperty("ExecIDs")
  @Valid
  private JsonNullable<List<String>> execIDs = JsonNullable.undefined();

  @JsonProperty("HostConfig")
  private HostConfig hostConfig;

  @JsonProperty("GraphDriver")
  private GraphDriverData graphDriver;

  @JsonProperty("SizeRw")
  private Long sizeRw;

  @JsonProperty("SizeRootFs")
  private Long sizeRootFs;

  @JsonProperty("Mounts")
  @Valid
  private List<MountPoint> mounts = null;

  @JsonProperty("Config")
  private ContainerConfig config;

  @JsonProperty("NetworkSettings")
  private NetworkSettings networkSettings;

  public ContainerInspectResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the container
   * @return id
  */
  @ApiModelProperty(value = "The ID of the container")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContainerInspectResponse created(String created) {
    this.created = created;
    return this;
  }

  /**
   * The time the container was created
   * @return created
  */
  @ApiModelProperty(value = "The time the container was created")


  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ContainerInspectResponse path(String path) {
    this.path = path;
    return this;
  }

  /**
   * The path to the command being run
   * @return path
  */
  @ApiModelProperty(value = "The path to the command being run")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ContainerInspectResponse args(List<String> args) {
    this.args = args;
    return this;
  }

  public ContainerInspectResponse addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * The arguments to the command being run
   * @return args
  */
  @ApiModelProperty(value = "The arguments to the command being run")


  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public ContainerInspectResponse state(ContainerState state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContainerState getState() {
    return state;
  }

  public void setState(ContainerState state) {
    this.state = state;
  }

  public ContainerInspectResponse image(String image) {
    this.image = image;
    return this;
  }

  /**
   * The container's image ID
   * @return image
  */
  @ApiModelProperty(value = "The container's image ID")


  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public ContainerInspectResponse resolvConfPath(String resolvConfPath) {
    this.resolvConfPath = resolvConfPath;
    return this;
  }

  /**
   * Get resolvConfPath
   * @return resolvConfPath
  */
  @ApiModelProperty(value = "")


  public String getResolvConfPath() {
    return resolvConfPath;
  }

  public void setResolvConfPath(String resolvConfPath) {
    this.resolvConfPath = resolvConfPath;
  }

  public ContainerInspectResponse hostnamePath(String hostnamePath) {
    this.hostnamePath = hostnamePath;
    return this;
  }

  /**
   * Get hostnamePath
   * @return hostnamePath
  */
  @ApiModelProperty(value = "")


  public String getHostnamePath() {
    return hostnamePath;
  }

  public void setHostnamePath(String hostnamePath) {
    this.hostnamePath = hostnamePath;
  }

  public ContainerInspectResponse hostsPath(String hostsPath) {
    this.hostsPath = hostsPath;
    return this;
  }

  /**
   * Get hostsPath
   * @return hostsPath
  */
  @ApiModelProperty(value = "")


  public String getHostsPath() {
    return hostsPath;
  }

  public void setHostsPath(String hostsPath) {
    this.hostsPath = hostsPath;
  }

  public ContainerInspectResponse logPath(String logPath) {
    this.logPath = logPath;
    return this;
  }

  /**
   * Get logPath
   * @return logPath
  */
  @ApiModelProperty(value = "")


  public String getLogPath() {
    return logPath;
  }

  public void setLogPath(String logPath) {
    this.logPath = logPath;
  }

  public ContainerInspectResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ContainerInspectResponse restartCount(Integer restartCount) {
    this.restartCount = restartCount;
    return this;
  }

  /**
   * Get restartCount
   * @return restartCount
  */
  @ApiModelProperty(value = "")


  public Integer getRestartCount() {
    return restartCount;
  }

  public void setRestartCount(Integer restartCount) {
    this.restartCount = restartCount;
  }

  public ContainerInspectResponse driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  @ApiModelProperty(value = "")


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public ContainerInspectResponse platform(String platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @ApiModelProperty(value = "")


  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public ContainerInspectResponse mountLabel(String mountLabel) {
    this.mountLabel = mountLabel;
    return this;
  }

  /**
   * Get mountLabel
   * @return mountLabel
  */
  @ApiModelProperty(value = "")


  public String getMountLabel() {
    return mountLabel;
  }

  public void setMountLabel(String mountLabel) {
    this.mountLabel = mountLabel;
  }

  public ContainerInspectResponse processLabel(String processLabel) {
    this.processLabel = processLabel;
    return this;
  }

  /**
   * Get processLabel
   * @return processLabel
  */
  @ApiModelProperty(value = "")


  public String getProcessLabel() {
    return processLabel;
  }

  public void setProcessLabel(String processLabel) {
    this.processLabel = processLabel;
  }

  public ContainerInspectResponse appArmorProfile(String appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
    return this;
  }

  /**
   * Get appArmorProfile
   * @return appArmorProfile
  */
  @ApiModelProperty(value = "")


  public String getAppArmorProfile() {
    return appArmorProfile;
  }

  public void setAppArmorProfile(String appArmorProfile) {
    this.appArmorProfile = appArmorProfile;
  }

  public ContainerInspectResponse execIDs(List<String> execIDs) {
    this.execIDs = JsonNullable.of(execIDs);
    return this;
  }

  public ContainerInspectResponse addExecIDsItem(String execIDsItem) {
    if (this.execIDs == null || !this.execIDs.isPresent()) {
      this.execIDs = JsonNullable.of(new ArrayList<>());
    }
    this.execIDs.get().add(execIDsItem);
    return this;
  }

  /**
   * IDs of exec instances that are running in the container.
   * @return execIDs
  */
  @ApiModelProperty(value = "IDs of exec instances that are running in the container.")


  public JsonNullable<List<String>> getExecIDs() {
    return execIDs;
  }

  public void setExecIDs(JsonNullable<List<String>> execIDs) {
    this.execIDs = execIDs;
  }

  public ContainerInspectResponse hostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
    return this;
  }

  /**
   * Get hostConfig
   * @return hostConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public HostConfig getHostConfig() {
    return hostConfig;
  }

  public void setHostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
  }

  public ContainerInspectResponse graphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
    return this;
  }

  /**
   * Get graphDriver
   * @return graphDriver
  */
  @ApiModelProperty(value = "")

  @Valid

  public GraphDriverData getGraphDriver() {
    return graphDriver;
  }

  public void setGraphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
  }

  public ContainerInspectResponse sizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
    return this;
  }

  /**
   * The size of files that have been created or changed by this container. 
   * @return sizeRw
  */
  @ApiModelProperty(value = "The size of files that have been created or changed by this container. ")


  public Long getSizeRw() {
    return sizeRw;
  }

  public void setSizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
  }

  public ContainerInspectResponse sizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
    return this;
  }

  /**
   * The total size of all the files in this container.
   * @return sizeRootFs
  */
  @ApiModelProperty(value = "The total size of all the files in this container.")


  public Long getSizeRootFs() {
    return sizeRootFs;
  }

  public void setSizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
  }

  public ContainerInspectResponse mounts(List<MountPoint> mounts) {
    this.mounts = mounts;
    return this;
  }

  public ContainerInspectResponse addMountsItem(MountPoint mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Get mounts
   * @return mounts
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<MountPoint> getMounts() {
    return mounts;
  }

  public void setMounts(List<MountPoint> mounts) {
    this.mounts = mounts;
  }

  public ContainerInspectResponse config(ContainerConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContainerConfig getConfig() {
    return config;
  }

  public void setConfig(ContainerConfig config) {
    this.config = config;
  }

  public ContainerInspectResponse networkSettings(NetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
    return this;
  }

  /**
   * Get networkSettings
   * @return networkSettings
  */
  @ApiModelProperty(value = "")

  @Valid

  public NetworkSettings getNetworkSettings() {
    return networkSettings;
  }

  public void setNetworkSettings(NetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerInspectResponse containerInspectResponse = (ContainerInspectResponse) o;
    return Objects.equals(this.id, containerInspectResponse.id) &&
        Objects.equals(this.created, containerInspectResponse.created) &&
        Objects.equals(this.path, containerInspectResponse.path) &&
        Objects.equals(this.args, containerInspectResponse.args) &&
        Objects.equals(this.state, containerInspectResponse.state) &&
        Objects.equals(this.image, containerInspectResponse.image) &&
        Objects.equals(this.resolvConfPath, containerInspectResponse.resolvConfPath) &&
        Objects.equals(this.hostnamePath, containerInspectResponse.hostnamePath) &&
        Objects.equals(this.hostsPath, containerInspectResponse.hostsPath) &&
        Objects.equals(this.logPath, containerInspectResponse.logPath) &&
        Objects.equals(this.name, containerInspectResponse.name) &&
        Objects.equals(this.restartCount, containerInspectResponse.restartCount) &&
        Objects.equals(this.driver, containerInspectResponse.driver) &&
        Objects.equals(this.platform, containerInspectResponse.platform) &&
        Objects.equals(this.mountLabel, containerInspectResponse.mountLabel) &&
        Objects.equals(this.processLabel, containerInspectResponse.processLabel) &&
        Objects.equals(this.appArmorProfile, containerInspectResponse.appArmorProfile) &&
        Objects.equals(this.execIDs, containerInspectResponse.execIDs) &&
        Objects.equals(this.hostConfig, containerInspectResponse.hostConfig) &&
        Objects.equals(this.graphDriver, containerInspectResponse.graphDriver) &&
        Objects.equals(this.sizeRw, containerInspectResponse.sizeRw) &&
        Objects.equals(this.sizeRootFs, containerInspectResponse.sizeRootFs) &&
        Objects.equals(this.mounts, containerInspectResponse.mounts) &&
        Objects.equals(this.config, containerInspectResponse.config) &&
        Objects.equals(this.networkSettings, containerInspectResponse.networkSettings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, created, path, args, state, image, resolvConfPath, hostnamePath, hostsPath, logPath, name, restartCount, driver, platform, mountLabel, processLabel, appArmorProfile, execIDs, hostConfig, graphDriver, sizeRw, sizeRootFs, mounts, config, networkSettings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerInspectResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    resolvConfPath: ").append(toIndentedString(resolvConfPath)).append("\n");
    sb.append("    hostnamePath: ").append(toIndentedString(hostnamePath)).append("\n");
    sb.append("    hostsPath: ").append(toIndentedString(hostsPath)).append("\n");
    sb.append("    logPath: ").append(toIndentedString(logPath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    restartCount: ").append(toIndentedString(restartCount)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    mountLabel: ").append(toIndentedString(mountLabel)).append("\n");
    sb.append("    processLabel: ").append(toIndentedString(processLabel)).append("\n");
    sb.append("    appArmorProfile: ").append(toIndentedString(appArmorProfile)).append("\n");
    sb.append("    execIDs: ").append(toIndentedString(execIDs)).append("\n");
    sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
    sb.append("    graphDriver: ").append(toIndentedString(graphDriver)).append("\n");
    sb.append("    sizeRw: ").append(toIndentedString(sizeRw)).append("\n");
    sb.append("    sizeRootFs: ").append(toIndentedString(sizeRootFs)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    networkSettings: ").append(toIndentedString(networkSettings)).append("\n");
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

