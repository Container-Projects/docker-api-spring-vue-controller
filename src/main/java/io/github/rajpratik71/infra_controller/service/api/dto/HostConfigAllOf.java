package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.HostConfigAllOfLogConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.Mount;
import io.github.rajpratik71.infra_controller.service.api.dto.PortBinding;
import io.github.rajpratik71.infra_controller.service.api.dto.RestartPolicy;
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
 * HostConfigAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class HostConfigAllOf   {
  @JsonProperty("Binds")
  @Valid
  private List<String> binds = null;

  @JsonProperty("ContainerIDFile")
  private String containerIDFile;

  @JsonProperty("LogConfig")
  private HostConfigAllOfLogConfig logConfig;

  @JsonProperty("NetworkMode")
  private String networkMode;

  @JsonProperty("PortBindings")
  @Valid
  private Map<String, List<PortBinding>> portBindings = null;

  @JsonProperty("RestartPolicy")
  private RestartPolicy restartPolicy;

  @JsonProperty("AutoRemove")
  private Boolean autoRemove;

  @JsonProperty("VolumeDriver")
  private String volumeDriver;

  @JsonProperty("VolumesFrom")
  @Valid
  private List<String> volumesFrom = null;

  @JsonProperty("Mounts")
  @Valid
  private List<Mount> mounts = null;

  @JsonProperty("CapAdd")
  @Valid
  private List<String> capAdd = null;

  @JsonProperty("CapDrop")
  @Valid
  private List<String> capDrop = null;

  /**
   * cgroup namespace mode for the container. Possible values are:  - `\"private\"`: the container runs in its own private cgroup namespace - `\"host\"`: use the host system's cgroup namespace  If not specified, the daemon default is used, which can either be `\"private\"` or `\"host\"`, depending on daemon version, kernel support and configuration. 
   */
  public enum CgroupnsModeEnum {
    PRIVATE("private"),
    
    HOST("host");

    private String value;

    CgroupnsModeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CgroupnsModeEnum fromValue(String value) {
      for (CgroupnsModeEnum b : CgroupnsModeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("CgroupnsMode")
  private CgroupnsModeEnum cgroupnsMode;

  @JsonProperty("Dns")
  @Valid
  private List<String> dns = null;

  @JsonProperty("DnsOptions")
  @Valid
  private List<String> dnsOptions = null;

  @JsonProperty("DnsSearch")
  @Valid
  private List<String> dnsSearch = null;

  @JsonProperty("ExtraHosts")
  @Valid
  private List<String> extraHosts = null;

  @JsonProperty("GroupAdd")
  @Valid
  private List<String> groupAdd = null;

  @JsonProperty("IpcMode")
  private String ipcMode;

  @JsonProperty("Cgroup")
  private String cgroup;

  @JsonProperty("Links")
  @Valid
  private List<String> links = null;

  @JsonProperty("OomScoreAdj")
  private Integer oomScoreAdj;

  @JsonProperty("PidMode")
  private String pidMode;

  @JsonProperty("Privileged")
  private Boolean privileged;

  @JsonProperty("PublishAllPorts")
  private Boolean publishAllPorts;

  @JsonProperty("ReadonlyRootfs")
  private Boolean readonlyRootfs;

  @JsonProperty("SecurityOpt")
  @Valid
  private List<String> securityOpt = null;

  @JsonProperty("StorageOpt")
  @Valid
  private Map<String, String> storageOpt = null;

  @JsonProperty("Tmpfs")
  @Valid
  private Map<String, String> tmpfs = null;

  @JsonProperty("UTSMode")
  private String utSMode;

  @JsonProperty("UsernsMode")
  private String usernsMode;

  @JsonProperty("ShmSize")
  private Integer shmSize;

  @JsonProperty("Sysctls")
  @Valid
  private Map<String, String> sysctls = null;

  @JsonProperty("Runtime")
  private String runtime;

  @JsonProperty("ConsoleSize")
  @Valid
  private List<Integer> consoleSize = null;

  /**
   * Isolation technology of the container. (Windows only) 
   */
  public enum IsolationEnum {
    DEFAULT("default"),
    
    PROCESS("process"),
    
    HYPERV("hyperv");

    private String value;

    IsolationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static IsolationEnum fromValue(String value) {
      for (IsolationEnum b : IsolationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Isolation")
  private IsolationEnum isolation;

  @JsonProperty("MaskedPaths")
  @Valid
  private List<String> maskedPaths = null;

  @JsonProperty("ReadonlyPaths")
  @Valid
  private List<String> readonlyPaths = null;

  public HostConfigAllOf binds(List<String> binds) {
    this.binds = binds;
    return this;
  }

  public HostConfigAllOf addBindsItem(String bindsItem) {
    if (this.binds == null) {
      this.binds = new ArrayList<>();
    }
    this.binds.add(bindsItem);
    return this;
  }

  /**
   * A list of volume bindings for this container. Each volume binding is a string in one of these forms:  - `host-src:container-dest[:options]` to bind-mount a host path   into the container. Both `host-src`, and `container-dest` must   be an _absolute_ path. - `volume-name:container-dest[:options]` to bind-mount a volume   managed by a volume driver into the container. `container-dest`   must be an _absolute_ path.  `options` is an optional, comma-delimited list of:  - `nocopy` disables automatic copying of data from the container   path to the volume. The `nocopy` flag only applies to named volumes. - `[ro|rw]` mounts a volume read-only or read-write, respectively.   If omitted or set to `rw`, volumes are mounted read-write. - `[z|Z]` applies SELinux labels to allow or deny multiple containers   to read and write to the same volume.     - `z`: a _shared_ content label is applied to the content. This       label indicates that multiple containers can share the volume       content, for both reading and writing.     - `Z`: a _private unshared_ label is applied to the content.       This label indicates that only the current container can use       a private volume. Labeling systems such as SELinux require       proper labels to be placed on volume content that is mounted       into a container. Without a label, the security system can       prevent a container's processes from using the content. By       default, the labels set by the host operating system are not       modified. - `[[r]shared|[r]slave|[r]private]` specifies mount   [propagation behavior](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt).   This only applies to bind-mounted volumes, not internal volumes   or named volumes. Mount propagation requires the source mount   point (the location where the source directory is mounted in the   host operating system) to have the correct propagation properties.   For shared volumes, the source mount point must be set to `shared`.   For slave volumes, the mount must be set to either `shared` or   `slave`. 
   * @return binds
  */
  @ApiModelProperty(value = "A list of volume bindings for this container. Each volume binding is a string in one of these forms:  - `host-src:container-dest[:options]` to bind-mount a host path   into the container. Both `host-src`, and `container-dest` must   be an _absolute_ path. - `volume-name:container-dest[:options]` to bind-mount a volume   managed by a volume driver into the container. `container-dest`   must be an _absolute_ path.  `options` is an optional, comma-delimited list of:  - `nocopy` disables automatic copying of data from the container   path to the volume. The `nocopy` flag only applies to named volumes. - `[ro|rw]` mounts a volume read-only or read-write, respectively.   If omitted or set to `rw`, volumes are mounted read-write. - `[z|Z]` applies SELinux labels to allow or deny multiple containers   to read and write to the same volume.     - `z`: a _shared_ content label is applied to the content. This       label indicates that multiple containers can share the volume       content, for both reading and writing.     - `Z`: a _private unshared_ label is applied to the content.       This label indicates that only the current container can use       a private volume. Labeling systems such as SELinux require       proper labels to be placed on volume content that is mounted       into a container. Without a label, the security system can       prevent a container's processes from using the content. By       default, the labels set by the host operating system are not       modified. - `[[r]shared|[r]slave|[r]private]` specifies mount   [propagation behavior](https://www.kernel.org/doc/Documentation/filesystems/sharedsubtree.txt).   This only applies to bind-mounted volumes, not internal volumes   or named volumes. Mount propagation requires the source mount   point (the location where the source directory is mounted in the   host operating system) to have the correct propagation properties.   For shared volumes, the source mount point must be set to `shared`.   For slave volumes, the mount must be set to either `shared` or   `slave`. ")


  public List<String> getBinds() {
    return binds;
  }

  public void setBinds(List<String> binds) {
    this.binds = binds;
  }

  public HostConfigAllOf containerIDFile(String containerIDFile) {
    this.containerIDFile = containerIDFile;
    return this;
  }

  /**
   * Path to a file where the container ID is written
   * @return containerIDFile
  */
  @ApiModelProperty(value = "Path to a file where the container ID is written")


  public String getContainerIDFile() {
    return containerIDFile;
  }

  public void setContainerIDFile(String containerIDFile) {
    this.containerIDFile = containerIDFile;
  }

  public HostConfigAllOf logConfig(HostConfigAllOfLogConfig logConfig) {
    this.logConfig = logConfig;
    return this;
  }

  /**
   * Get logConfig
   * @return logConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public HostConfigAllOfLogConfig getLogConfig() {
    return logConfig;
  }

  public void setLogConfig(HostConfigAllOfLogConfig logConfig) {
    this.logConfig = logConfig;
  }

  public HostConfigAllOf networkMode(String networkMode) {
    this.networkMode = networkMode;
    return this;
  }

  /**
   * Network mode to use for this container. Supported standard values are: `bridge`, `host`, `none`, and `container:<name|id>`. Any other value is taken as a custom network's name to which this container should connect to. 
   * @return networkMode
  */
  @ApiModelProperty(value = "Network mode to use for this container. Supported standard values are: `bridge`, `host`, `none`, and `container:<name|id>`. Any other value is taken as a custom network's name to which this container should connect to. ")


  public String getNetworkMode() {
    return networkMode;
  }

  public void setNetworkMode(String networkMode) {
    this.networkMode = networkMode;
  }

  public HostConfigAllOf portBindings(Map<String, List<PortBinding>> portBindings) {
    this.portBindings = portBindings;
    return this;
  }

  public HostConfigAllOf putPortBindingsItem(String key, List<PortBinding> portBindingsItem) {
    if (this.portBindings == null) {
      this.portBindings = new HashMap<>();
    }
    this.portBindings.put(key, portBindingsItem);
    return this;
  }

  /**
   * PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table. 
   * @return portBindings
  */
  @ApiModelProperty(example = "{443/tcp=[{HostIp=127.0.0.1, HostPort=4443}], 80/tcp=[{HostIp=0.0.0.0, HostPort=80}, {HostIp=0.0.0.0, HostPort=8080}], 80/udp=[{HostIp=0.0.0.0, HostPort=80}], 53/udp=[{HostIp=0.0.0.0, HostPort=53}]}", value = "PortMap describes the mapping of container ports to host ports, using the container's port-number and protocol as key in the format `<port>/<protocol>`, for example, `80/udp`.  If a container's port is mapped for multiple protocols, separate entries are added to the mapping table. ")

  @Valid

  public Map<String, List<PortBinding>> getPortBindings() {
    return portBindings;
  }

  public void setPortBindings(Map<String, List<PortBinding>> portBindings) {
    this.portBindings = portBindings;
  }

  public HostConfigAllOf restartPolicy(RestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
    return this;
  }

  /**
   * Get restartPolicy
   * @return restartPolicy
  */
  @ApiModelProperty(value = "")

  @Valid

  public RestartPolicy getRestartPolicy() {
    return restartPolicy;
  }

  public void setRestartPolicy(RestartPolicy restartPolicy) {
    this.restartPolicy = restartPolicy;
  }

  public HostConfigAllOf autoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
    return this;
  }

  /**
   * Automatically remove the container when the container's process exits. This has no effect if `RestartPolicy` is set. 
   * @return autoRemove
  */
  @ApiModelProperty(value = "Automatically remove the container when the container's process exits. This has no effect if `RestartPolicy` is set. ")


  public Boolean getAutoRemove() {
    return autoRemove;
  }

  public void setAutoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
  }

  public HostConfigAllOf volumeDriver(String volumeDriver) {
    this.volumeDriver = volumeDriver;
    return this;
  }

  /**
   * Driver that this container uses to mount volumes.
   * @return volumeDriver
  */
  @ApiModelProperty(value = "Driver that this container uses to mount volumes.")


  public String getVolumeDriver() {
    return volumeDriver;
  }

  public void setVolumeDriver(String volumeDriver) {
    this.volumeDriver = volumeDriver;
  }

  public HostConfigAllOf volumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
    return this;
  }

  public HostConfigAllOf addVolumesFromItem(String volumesFromItem) {
    if (this.volumesFrom == null) {
      this.volumesFrom = new ArrayList<>();
    }
    this.volumesFrom.add(volumesFromItem);
    return this;
  }

  /**
   * A list of volumes to inherit from another container, specified in the form `<container name>[:<ro|rw>]`. 
   * @return volumesFrom
  */
  @ApiModelProperty(value = "A list of volumes to inherit from another container, specified in the form `<container name>[:<ro|rw>]`. ")


  public List<String> getVolumesFrom() {
    return volumesFrom;
  }

  public void setVolumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
  }

  public HostConfigAllOf mounts(List<Mount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public HostConfigAllOf addMountsItem(Mount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Specification for mounts to be added to the container. 
   * @return mounts
  */
  @ApiModelProperty(value = "Specification for mounts to be added to the container. ")

  @Valid

  public List<Mount> getMounts() {
    return mounts;
  }

  public void setMounts(List<Mount> mounts) {
    this.mounts = mounts;
  }

  public HostConfigAllOf capAdd(List<String> capAdd) {
    this.capAdd = capAdd;
    return this;
  }

  public HostConfigAllOf addCapAddItem(String capAddItem) {
    if (this.capAdd == null) {
      this.capAdd = new ArrayList<>();
    }
    this.capAdd.add(capAddItem);
    return this;
  }

  /**
   * A list of kernel capabilities to add to the container. Conflicts with option 'Capabilities'. 
   * @return capAdd
  */
  @ApiModelProperty(value = "A list of kernel capabilities to add to the container. Conflicts with option 'Capabilities'. ")


  public List<String> getCapAdd() {
    return capAdd;
  }

  public void setCapAdd(List<String> capAdd) {
    this.capAdd = capAdd;
  }

  public HostConfigAllOf capDrop(List<String> capDrop) {
    this.capDrop = capDrop;
    return this;
  }

  public HostConfigAllOf addCapDropItem(String capDropItem) {
    if (this.capDrop == null) {
      this.capDrop = new ArrayList<>();
    }
    this.capDrop.add(capDropItem);
    return this;
  }

  /**
   * A list of kernel capabilities to drop from the container. Conflicts with option 'Capabilities'. 
   * @return capDrop
  */
  @ApiModelProperty(value = "A list of kernel capabilities to drop from the container. Conflicts with option 'Capabilities'. ")


  public List<String> getCapDrop() {
    return capDrop;
  }

  public void setCapDrop(List<String> capDrop) {
    this.capDrop = capDrop;
  }

  public HostConfigAllOf cgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
    this.cgroupnsMode = cgroupnsMode;
    return this;
  }

  /**
   * cgroup namespace mode for the container. Possible values are:  - `\"private\"`: the container runs in its own private cgroup namespace - `\"host\"`: use the host system's cgroup namespace  If not specified, the daemon default is used, which can either be `\"private\"` or `\"host\"`, depending on daemon version, kernel support and configuration. 
   * @return cgroupnsMode
  */
  @ApiModelProperty(value = "cgroup namespace mode for the container. Possible values are:  - `\"private\"`: the container runs in its own private cgroup namespace - `\"host\"`: use the host system's cgroup namespace  If not specified, the daemon default is used, which can either be `\"private\"` or `\"host\"`, depending on daemon version, kernel support and configuration. ")


  public CgroupnsModeEnum getCgroupnsMode() {
    return cgroupnsMode;
  }

  public void setCgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
    this.cgroupnsMode = cgroupnsMode;
  }

  public HostConfigAllOf dns(List<String> dns) {
    this.dns = dns;
    return this;
  }

  public HostConfigAllOf addDnsItem(String dnsItem) {
    if (this.dns == null) {
      this.dns = new ArrayList<>();
    }
    this.dns.add(dnsItem);
    return this;
  }

  /**
   * A list of DNS servers for the container to use.
   * @return dns
  */
  @ApiModelProperty(value = "A list of DNS servers for the container to use.")


  public List<String> getDns() {
    return dns;
  }

  public void setDns(List<String> dns) {
    this.dns = dns;
  }

  public HostConfigAllOf dnsOptions(List<String> dnsOptions) {
    this.dnsOptions = dnsOptions;
    return this;
  }

  public HostConfigAllOf addDnsOptionsItem(String dnsOptionsItem) {
    if (this.dnsOptions == null) {
      this.dnsOptions = new ArrayList<>();
    }
    this.dnsOptions.add(dnsOptionsItem);
    return this;
  }

  /**
   * A list of DNS options.
   * @return dnsOptions
  */
  @ApiModelProperty(value = "A list of DNS options.")


  public List<String> getDnsOptions() {
    return dnsOptions;
  }

  public void setDnsOptions(List<String> dnsOptions) {
    this.dnsOptions = dnsOptions;
  }

  public HostConfigAllOf dnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
    return this;
  }

  public HostConfigAllOf addDnsSearchItem(String dnsSearchItem) {
    if (this.dnsSearch == null) {
      this.dnsSearch = new ArrayList<>();
    }
    this.dnsSearch.add(dnsSearchItem);
    return this;
  }

  /**
   * A list of DNS search domains.
   * @return dnsSearch
  */
  @ApiModelProperty(value = "A list of DNS search domains.")


  public List<String> getDnsSearch() {
    return dnsSearch;
  }

  public void setDnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
  }

  public HostConfigAllOf extraHosts(List<String> extraHosts) {
    this.extraHosts = extraHosts;
    return this;
  }

  public HostConfigAllOf addExtraHostsItem(String extraHostsItem) {
    if (this.extraHosts == null) {
      this.extraHosts = new ArrayList<>();
    }
    this.extraHosts.add(extraHostsItem);
    return this;
  }

  /**
   * A list of hostnames/IP mappings to add to the container's `/etc/hosts` file. Specified in the form `[\"hostname:IP\"]`. 
   * @return extraHosts
  */
  @ApiModelProperty(value = "A list of hostnames/IP mappings to add to the container's `/etc/hosts` file. Specified in the form `[\"hostname:IP\"]`. ")


  public List<String> getExtraHosts() {
    return extraHosts;
  }

  public void setExtraHosts(List<String> extraHosts) {
    this.extraHosts = extraHosts;
  }

  public HostConfigAllOf groupAdd(List<String> groupAdd) {
    this.groupAdd = groupAdd;
    return this;
  }

  public HostConfigAllOf addGroupAddItem(String groupAddItem) {
    if (this.groupAdd == null) {
      this.groupAdd = new ArrayList<>();
    }
    this.groupAdd.add(groupAddItem);
    return this;
  }

  /**
   * A list of additional groups that the container process will run as. 
   * @return groupAdd
  */
  @ApiModelProperty(value = "A list of additional groups that the container process will run as. ")


  public List<String> getGroupAdd() {
    return groupAdd;
  }

  public void setGroupAdd(List<String> groupAdd) {
    this.groupAdd = groupAdd;
  }

  public HostConfigAllOf ipcMode(String ipcMode) {
    this.ipcMode = ipcMode;
    return this;
  }

  /**
   * IPC sharing mode for the container. Possible values are:  - `\"none\"`: own private IPC namespace, with /dev/shm not mounted - `\"private\"`: own private IPC namespace - `\"shareable\"`: own private IPC namespace, with a possibility to share it with other containers - `\"container:<name|id>\"`: join another (shareable) container's IPC namespace - `\"host\"`: use the host system's IPC namespace  If not specified, daemon default is used, which can either be `\"private\"` or `\"shareable\"`, depending on daemon version and configuration. 
   * @return ipcMode
  */
  @ApiModelProperty(value = "IPC sharing mode for the container. Possible values are:  - `\"none\"`: own private IPC namespace, with /dev/shm not mounted - `\"private\"`: own private IPC namespace - `\"shareable\"`: own private IPC namespace, with a possibility to share it with other containers - `\"container:<name|id>\"`: join another (shareable) container's IPC namespace - `\"host\"`: use the host system's IPC namespace  If not specified, daemon default is used, which can either be `\"private\"` or `\"shareable\"`, depending on daemon version and configuration. ")


  public String getIpcMode() {
    return ipcMode;
  }

  public void setIpcMode(String ipcMode) {
    this.ipcMode = ipcMode;
  }

  public HostConfigAllOf cgroup(String cgroup) {
    this.cgroup = cgroup;
    return this;
  }

  /**
   * Cgroup to use for the container.
   * @return cgroup
  */
  @ApiModelProperty(value = "Cgroup to use for the container.")


  public String getCgroup() {
    return cgroup;
  }

  public void setCgroup(String cgroup) {
    this.cgroup = cgroup;
  }

  public HostConfigAllOf links(List<String> links) {
    this.links = links;
    return this;
  }

  public HostConfigAllOf addLinksItem(String linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * A list of links for the container in the form `container_name:alias`. 
   * @return links
  */
  @ApiModelProperty(value = "A list of links for the container in the form `container_name:alias`. ")


  public List<String> getLinks() {
    return links;
  }

  public void setLinks(List<String> links) {
    this.links = links;
  }

  public HostConfigAllOf oomScoreAdj(Integer oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
    return this;
  }

  /**
   * An integer value containing the score given to the container in order to tune OOM killer preferences. 
   * @return oomScoreAdj
  */
  @ApiModelProperty(example = "500", value = "An integer value containing the score given to the container in order to tune OOM killer preferences. ")


  public Integer getOomScoreAdj() {
    return oomScoreAdj;
  }

  public void setOomScoreAdj(Integer oomScoreAdj) {
    this.oomScoreAdj = oomScoreAdj;
  }

  public HostConfigAllOf pidMode(String pidMode) {
    this.pidMode = pidMode;
    return this;
  }

  /**
   * Set the PID (Process) Namespace mode for the container. It can be either:  - `\"container:<name|id>\"`: joins another container's PID namespace - `\"host\"`: use the host's PID namespace inside the container 
   * @return pidMode
  */
  @ApiModelProperty(value = "Set the PID (Process) Namespace mode for the container. It can be either:  - `\"container:<name|id>\"`: joins another container's PID namespace - `\"host\"`: use the host's PID namespace inside the container ")


  public String getPidMode() {
    return pidMode;
  }

  public void setPidMode(String pidMode) {
    this.pidMode = pidMode;
  }

  public HostConfigAllOf privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Gives the container full access to the host.
   * @return privileged
  */
  @ApiModelProperty(value = "Gives the container full access to the host.")


  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public HostConfigAllOf publishAllPorts(Boolean publishAllPorts) {
    this.publishAllPorts = publishAllPorts;
    return this;
  }

  /**
   * Allocates an ephemeral host port for all of a container's exposed ports.  Ports are de-allocated when the container stops and allocated when the container starts. The allocated port might be changed when restarting the container.  The port is selected from the ephemeral port range that depends on the kernel. For example, on Linux the range is defined by `/proc/sys/net/ipv4/ip_local_port_range`. 
   * @return publishAllPorts
  */
  @ApiModelProperty(value = "Allocates an ephemeral host port for all of a container's exposed ports.  Ports are de-allocated when the container stops and allocated when the container starts. The allocated port might be changed when restarting the container.  The port is selected from the ephemeral port range that depends on the kernel. For example, on Linux the range is defined by `/proc/sys/net/ipv4/ip_local_port_range`. ")


  public Boolean getPublishAllPorts() {
    return publishAllPorts;
  }

  public void setPublishAllPorts(Boolean publishAllPorts) {
    this.publishAllPorts = publishAllPorts;
  }

  public HostConfigAllOf readonlyRootfs(Boolean readonlyRootfs) {
    this.readonlyRootfs = readonlyRootfs;
    return this;
  }

  /**
   * Mount the container's root filesystem as read only.
   * @return readonlyRootfs
  */
  @ApiModelProperty(value = "Mount the container's root filesystem as read only.")


  public Boolean getReadonlyRootfs() {
    return readonlyRootfs;
  }

  public void setReadonlyRootfs(Boolean readonlyRootfs) {
    this.readonlyRootfs = readonlyRootfs;
  }

  public HostConfigAllOf securityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
    return this;
  }

  public HostConfigAllOf addSecurityOptItem(String securityOptItem) {
    if (this.securityOpt == null) {
      this.securityOpt = new ArrayList<>();
    }
    this.securityOpt.add(securityOptItem);
    return this;
  }

  /**
   * A list of string values to customize labels for MLS systems, such as SELinux.
   * @return securityOpt
  */
  @ApiModelProperty(value = "A list of string values to customize labels for MLS systems, such as SELinux.")


  public List<String> getSecurityOpt() {
    return securityOpt;
  }

  public void setSecurityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
  }

  public HostConfigAllOf storageOpt(Map<String, String> storageOpt) {
    this.storageOpt = storageOpt;
    return this;
  }

  public HostConfigAllOf putStorageOptItem(String key, String storageOptItem) {
    if (this.storageOpt == null) {
      this.storageOpt = new HashMap<>();
    }
    this.storageOpt.put(key, storageOptItem);
    return this;
  }

  /**
   * Storage driver options for this container, in the form `{\"size\": \"120G\"}`. 
   * @return storageOpt
  */
  @ApiModelProperty(value = "Storage driver options for this container, in the form `{\"size\": \"120G\"}`. ")


  public Map<String, String> getStorageOpt() {
    return storageOpt;
  }

  public void setStorageOpt(Map<String, String> storageOpt) {
    this.storageOpt = storageOpt;
  }

  public HostConfigAllOf tmpfs(Map<String, String> tmpfs) {
    this.tmpfs = tmpfs;
    return this;
  }

  public HostConfigAllOf putTmpfsItem(String key, String tmpfsItem) {
    if (this.tmpfs == null) {
      this.tmpfs = new HashMap<>();
    }
    this.tmpfs.put(key, tmpfsItem);
    return this;
  }

  /**
   * A map of container directories which should be replaced by tmpfs mounts, and their corresponding mount options. For example:  ``` { \"/run\": \"rw,noexec,nosuid,size=65536k\" } ``` 
   * @return tmpfs
  */
  @ApiModelProperty(value = "A map of container directories which should be replaced by tmpfs mounts, and their corresponding mount options. For example:  ``` { \"/run\": \"rw,noexec,nosuid,size=65536k\" } ``` ")


  public Map<String, String> getTmpfs() {
    return tmpfs;
  }

  public void setTmpfs(Map<String, String> tmpfs) {
    this.tmpfs = tmpfs;
  }

  public HostConfigAllOf utSMode(String utSMode) {
    this.utSMode = utSMode;
    return this;
  }

  /**
   * UTS namespace to use for the container.
   * @return utSMode
  */
  @ApiModelProperty(value = "UTS namespace to use for the container.")


  public String getUtSMode() {
    return utSMode;
  }

  public void setUtSMode(String utSMode) {
    this.utSMode = utSMode;
  }

  public HostConfigAllOf usernsMode(String usernsMode) {
    this.usernsMode = usernsMode;
    return this;
  }

  /**
   * Sets the usernamespace mode for the container when usernamespace remapping option is enabled. 
   * @return usernsMode
  */
  @ApiModelProperty(value = "Sets the usernamespace mode for the container when usernamespace remapping option is enabled. ")


  public String getUsernsMode() {
    return usernsMode;
  }

  public void setUsernsMode(String usernsMode) {
    this.usernsMode = usernsMode;
  }

  public HostConfigAllOf shmSize(Integer shmSize) {
    this.shmSize = shmSize;
    return this;
  }

  /**
   * Size of `/dev/shm` in bytes. If omitted, the system uses 64MB. 
   * minimum: 0
   * @return shmSize
  */
  @ApiModelProperty(value = "Size of `/dev/shm` in bytes. If omitted, the system uses 64MB. ")

@Min(0)
  public Integer getShmSize() {
    return shmSize;
  }

  public void setShmSize(Integer shmSize) {
    this.shmSize = shmSize;
  }

  public HostConfigAllOf sysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public HostConfigAllOf putSysctlsItem(String key, String sysctlsItem) {
    if (this.sysctls == null) {
      this.sysctls = new HashMap<>();
    }
    this.sysctls.put(key, sysctlsItem);
    return this;
  }

  /**
   * A list of kernel parameters (sysctls) to set in the container. For example:  ``` {\"net.ipv4.ip_forward\": \"1\"} ``` 
   * @return sysctls
  */
  @ApiModelProperty(value = "A list of kernel parameters (sysctls) to set in the container. For example:  ``` {\"net.ipv4.ip_forward\": \"1\"} ``` ")


  public Map<String, String> getSysctls() {
    return sysctls;
  }

  public void setSysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
  }

  public HostConfigAllOf runtime(String runtime) {
    this.runtime = runtime;
    return this;
  }

  /**
   * Runtime to use with this container.
   * @return runtime
  */
  @ApiModelProperty(value = "Runtime to use with this container.")


  public String getRuntime() {
    return runtime;
  }

  public void setRuntime(String runtime) {
    this.runtime = runtime;
  }

  public HostConfigAllOf consoleSize(List<Integer> consoleSize) {
    this.consoleSize = consoleSize;
    return this;
  }

  public HostConfigAllOf addConsoleSizeItem(Integer consoleSizeItem) {
    if (this.consoleSize == null) {
      this.consoleSize = new ArrayList<>();
    }
    this.consoleSize.add(consoleSizeItem);
    return this;
  }

  /**
   * Initial console size, as an `[height, width]` array. (Windows only) 
   * @return consoleSize
  */
  @ApiModelProperty(value = "Initial console size, as an `[height, width]` array. (Windows only) ")

@Size(min=2,max=2) 
  public List<Integer> getConsoleSize() {
    return consoleSize;
  }

  public void setConsoleSize(List<Integer> consoleSize) {
    this.consoleSize = consoleSize;
  }

  public HostConfigAllOf isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

  /**
   * Isolation technology of the container. (Windows only) 
   * @return isolation
  */
  @ApiModelProperty(value = "Isolation technology of the container. (Windows only) ")


  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }

  public HostConfigAllOf maskedPaths(List<String> maskedPaths) {
    this.maskedPaths = maskedPaths;
    return this;
  }

  public HostConfigAllOf addMaskedPathsItem(String maskedPathsItem) {
    if (this.maskedPaths == null) {
      this.maskedPaths = new ArrayList<>();
    }
    this.maskedPaths.add(maskedPathsItem);
    return this;
  }

  /**
   * The list of paths to be masked inside the container (this overrides the default set of paths). 
   * @return maskedPaths
  */
  @ApiModelProperty(value = "The list of paths to be masked inside the container (this overrides the default set of paths). ")


  public List<String> getMaskedPaths() {
    return maskedPaths;
  }

  public void setMaskedPaths(List<String> maskedPaths) {
    this.maskedPaths = maskedPaths;
  }

  public HostConfigAllOf readonlyPaths(List<String> readonlyPaths) {
    this.readonlyPaths = readonlyPaths;
    return this;
  }

  public HostConfigAllOf addReadonlyPathsItem(String readonlyPathsItem) {
    if (this.readonlyPaths == null) {
      this.readonlyPaths = new ArrayList<>();
    }
    this.readonlyPaths.add(readonlyPathsItem);
    return this;
  }

  /**
   * The list of paths to be set as read-only inside the container (this overrides the default set of paths). 
   * @return readonlyPaths
  */
  @ApiModelProperty(value = "The list of paths to be set as read-only inside the container (this overrides the default set of paths). ")


  public List<String> getReadonlyPaths() {
    return readonlyPaths;
  }

  public void setReadonlyPaths(List<String> readonlyPaths) {
    this.readonlyPaths = readonlyPaths;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HostConfigAllOf hostConfigAllOf = (HostConfigAllOf) o;
    return Objects.equals(this.binds, hostConfigAllOf.binds) &&
        Objects.equals(this.containerIDFile, hostConfigAllOf.containerIDFile) &&
        Objects.equals(this.logConfig, hostConfigAllOf.logConfig) &&
        Objects.equals(this.networkMode, hostConfigAllOf.networkMode) &&
        Objects.equals(this.portBindings, hostConfigAllOf.portBindings) &&
        Objects.equals(this.restartPolicy, hostConfigAllOf.restartPolicy) &&
        Objects.equals(this.autoRemove, hostConfigAllOf.autoRemove) &&
        Objects.equals(this.volumeDriver, hostConfigAllOf.volumeDriver) &&
        Objects.equals(this.volumesFrom, hostConfigAllOf.volumesFrom) &&
        Objects.equals(this.mounts, hostConfigAllOf.mounts) &&
        Objects.equals(this.capAdd, hostConfigAllOf.capAdd) &&
        Objects.equals(this.capDrop, hostConfigAllOf.capDrop) &&
        Objects.equals(this.cgroupnsMode, hostConfigAllOf.cgroupnsMode) &&
        Objects.equals(this.dns, hostConfigAllOf.dns) &&
        Objects.equals(this.dnsOptions, hostConfigAllOf.dnsOptions) &&
        Objects.equals(this.dnsSearch, hostConfigAllOf.dnsSearch) &&
        Objects.equals(this.extraHosts, hostConfigAllOf.extraHosts) &&
        Objects.equals(this.groupAdd, hostConfigAllOf.groupAdd) &&
        Objects.equals(this.ipcMode, hostConfigAllOf.ipcMode) &&
        Objects.equals(this.cgroup, hostConfigAllOf.cgroup) &&
        Objects.equals(this.links, hostConfigAllOf.links) &&
        Objects.equals(this.oomScoreAdj, hostConfigAllOf.oomScoreAdj) &&
        Objects.equals(this.pidMode, hostConfigAllOf.pidMode) &&
        Objects.equals(this.privileged, hostConfigAllOf.privileged) &&
        Objects.equals(this.publishAllPorts, hostConfigAllOf.publishAllPorts) &&
        Objects.equals(this.readonlyRootfs, hostConfigAllOf.readonlyRootfs) &&
        Objects.equals(this.securityOpt, hostConfigAllOf.securityOpt) &&
        Objects.equals(this.storageOpt, hostConfigAllOf.storageOpt) &&
        Objects.equals(this.tmpfs, hostConfigAllOf.tmpfs) &&
        Objects.equals(this.utSMode, hostConfigAllOf.utSMode) &&
        Objects.equals(this.usernsMode, hostConfigAllOf.usernsMode) &&
        Objects.equals(this.shmSize, hostConfigAllOf.shmSize) &&
        Objects.equals(this.sysctls, hostConfigAllOf.sysctls) &&
        Objects.equals(this.runtime, hostConfigAllOf.runtime) &&
        Objects.equals(this.consoleSize, hostConfigAllOf.consoleSize) &&
        Objects.equals(this.isolation, hostConfigAllOf.isolation) &&
        Objects.equals(this.maskedPaths, hostConfigAllOf.maskedPaths) &&
        Objects.equals(this.readonlyPaths, hostConfigAllOf.readonlyPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(binds, containerIDFile, logConfig, networkMode, portBindings, restartPolicy, autoRemove, volumeDriver, volumesFrom, mounts, capAdd, capDrop, cgroupnsMode, dns, dnsOptions, dnsSearch, extraHosts, groupAdd, ipcMode, cgroup, links, oomScoreAdj, pidMode, privileged, publishAllPorts, readonlyRootfs, securityOpt, storageOpt, tmpfs, utSMode, usernsMode, shmSize, sysctls, runtime, consoleSize, isolation, maskedPaths, readonlyPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostConfigAllOf {\n");
    
    sb.append("    binds: ").append(toIndentedString(binds)).append("\n");
    sb.append("    containerIDFile: ").append(toIndentedString(containerIDFile)).append("\n");
    sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
    sb.append("    networkMode: ").append(toIndentedString(networkMode)).append("\n");
    sb.append("    portBindings: ").append(toIndentedString(portBindings)).append("\n");
    sb.append("    restartPolicy: ").append(toIndentedString(restartPolicy)).append("\n");
    sb.append("    autoRemove: ").append(toIndentedString(autoRemove)).append("\n");
    sb.append("    volumeDriver: ").append(toIndentedString(volumeDriver)).append("\n");
    sb.append("    volumesFrom: ").append(toIndentedString(volumesFrom)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    capAdd: ").append(toIndentedString(capAdd)).append("\n");
    sb.append("    capDrop: ").append(toIndentedString(capDrop)).append("\n");
    sb.append("    cgroupnsMode: ").append(toIndentedString(cgroupnsMode)).append("\n");
    sb.append("    dns: ").append(toIndentedString(dns)).append("\n");
    sb.append("    dnsOptions: ").append(toIndentedString(dnsOptions)).append("\n");
    sb.append("    dnsSearch: ").append(toIndentedString(dnsSearch)).append("\n");
    sb.append("    extraHosts: ").append(toIndentedString(extraHosts)).append("\n");
    sb.append("    groupAdd: ").append(toIndentedString(groupAdd)).append("\n");
    sb.append("    ipcMode: ").append(toIndentedString(ipcMode)).append("\n");
    sb.append("    cgroup: ").append(toIndentedString(cgroup)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    oomScoreAdj: ").append(toIndentedString(oomScoreAdj)).append("\n");
    sb.append("    pidMode: ").append(toIndentedString(pidMode)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    publishAllPorts: ").append(toIndentedString(publishAllPorts)).append("\n");
    sb.append("    readonlyRootfs: ").append(toIndentedString(readonlyRootfs)).append("\n");
    sb.append("    securityOpt: ").append(toIndentedString(securityOpt)).append("\n");
    sb.append("    storageOpt: ").append(toIndentedString(storageOpt)).append("\n");
    sb.append("    tmpfs: ").append(toIndentedString(tmpfs)).append("\n");
    sb.append("    utSMode: ").append(toIndentedString(utSMode)).append("\n");
    sb.append("    usernsMode: ").append(toIndentedString(usernsMode)).append("\n");
    sb.append("    shmSize: ").append(toIndentedString(shmSize)).append("\n");
    sb.append("    sysctls: ").append(toIndentedString(sysctls)).append("\n");
    sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
    sb.append("    consoleSize: ").append(toIndentedString(consoleSize)).append("\n");
    sb.append("    isolation: ").append(toIndentedString(isolation)).append("\n");
    sb.append("    maskedPaths: ").append(toIndentedString(maskedPaths)).append("\n");
    sb.append("    readonlyPaths: ").append(toIndentedString(readonlyPaths)).append("\n");
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

