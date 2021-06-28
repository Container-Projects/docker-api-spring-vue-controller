package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.Commit;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginsInfo;
import io.github.rajpratik71.infra_controller.service.api.dto.RegistryServiceConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.Runtime;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmInfo;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemInfoDefaultAddressPools;
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
 * SystemInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemInfo   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Containers")
  private Integer containers;

  @JsonProperty("ContainersRunning")
  private Integer containersRunning;

  @JsonProperty("ContainersPaused")
  private Integer containersPaused;

  @JsonProperty("ContainersStopped")
  private Integer containersStopped;

  @JsonProperty("Images")
  private Integer images;

  @JsonProperty("Driver")
  private String driver;

  @JsonProperty("DriverStatus")
  @Valid
  private List<List<String>> driverStatus = null;

  @JsonProperty("DockerRootDir")
  private String dockerRootDir;

  @JsonProperty("Plugins")
  private PluginsInfo plugins;

  @JsonProperty("MemoryLimit")
  private Boolean memoryLimit;

  @JsonProperty("SwapLimit")
  private Boolean swapLimit;

  @JsonProperty("KernelMemory")
  private Boolean kernelMemory;

  @JsonProperty("CpuCfsPeriod")
  private Boolean cpuCfsPeriod;

  @JsonProperty("CpuCfsQuota")
  private Boolean cpuCfsQuota;

  @JsonProperty("CPUShares")
  private Boolean cpUShares;

  @JsonProperty("CPUSet")
  private Boolean cpUSet;

  @JsonProperty("PidsLimit")
  private Boolean pidsLimit;

  @JsonProperty("OomKillDisable")
  private Boolean oomKillDisable;

  @JsonProperty("IPv4Forwarding")
  private Boolean ipv4Forwarding;

  @JsonProperty("BridgeNfIptables")
  private Boolean bridgeNfIptables;

  @JsonProperty("BridgeNfIp6tables")
  private Boolean bridgeNfIp6tables;

  @JsonProperty("Debug")
  private Boolean debug;

  @JsonProperty("NFd")
  private Integer nfd;

  @JsonProperty("NGoroutines")
  private Integer ngoroutines;

  @JsonProperty("SystemTime")
  private String systemTime;

  @JsonProperty("LoggingDriver")
  private String loggingDriver;

  /**
   * The driver to use for managing cgroups. 
   */
  public enum CgroupDriverEnum {
    CGROUPFS("cgroupfs"),
    
    SYSTEMD("systemd"),
    
    NONE("none");

    private String value;

    CgroupDriverEnum(String value) {
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
    public static CgroupDriverEnum fromValue(String value) {
      for (CgroupDriverEnum b : CgroupDriverEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("CgroupDriver")
  private CgroupDriverEnum cgroupDriver = CgroupDriverEnum.CGROUPFS;

  /**
   * The version of the cgroup. 
   */
  public enum CgroupVersionEnum {
    _1("1"),
    
    _2("2");

    private String value;

    CgroupVersionEnum(String value) {
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
    public static CgroupVersionEnum fromValue(String value) {
      for (CgroupVersionEnum b : CgroupVersionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("CgroupVersion")
  private CgroupVersionEnum cgroupVersion = CgroupVersionEnum._1;

  @JsonProperty("NEventsListener")
  private Integer neventsListener;

  @JsonProperty("KernelVersion")
  private String kernelVersion;

  @JsonProperty("OperatingSystem")
  private String operatingSystem;

  @JsonProperty("OSVersion")
  private String osVersion;

  @JsonProperty("OSType")
  private String osType;

  @JsonProperty("Architecture")
  private String architecture;

  @JsonProperty("NCPU")
  private Integer NCPU;

  @JsonProperty("MemTotal")
  private Long memTotal;

  @JsonProperty("IndexServerAddress")
  private String indexServerAddress = "https://index.docker.io/v1/";

  @JsonProperty("RegistryConfig")
  private JsonNullable<RegistryServiceConfig> registryConfig = JsonNullable.undefined();

  @JsonProperty("GenericResources")
  @Valid
  private List<Object> genericResources = null;

  @JsonProperty("HttpProxy")
  private String httpProxy;

  @JsonProperty("HttpsProxy")
  private String httpsProxy;

  @JsonProperty("NoProxy")
  private String noProxy;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Labels")
  @Valid
  private List<String> labels = null;

  @JsonProperty("ExperimentalBuild")
  private Boolean experimentalBuild;

  @JsonProperty("ServerVersion")
  private String serverVersion;

  @JsonProperty("ClusterStore")
  private String clusterStore;

  @JsonProperty("ClusterAdvertise")
  private String clusterAdvertise;

  @JsonProperty("Runtimes")
  @Valid
  private Map<String, Runtime> runtimes = null;

  @JsonProperty("DefaultRuntime")
  private String defaultRuntime = "runc";

  @JsonProperty("Swarm")
  private SwarmInfo swarm;

  @JsonProperty("LiveRestoreEnabled")
  private Boolean liveRestoreEnabled = false;

  /**
   * Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms. 
   */
  public enum IsolationEnum {
    DEFAULT("default"),
    
    HYPERV("hyperv"),
    
    PROCESS("process");

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
  private IsolationEnum isolation = IsolationEnum.DEFAULT;

  @JsonProperty("InitBinary")
  private String initBinary;

  @JsonProperty("ContainerdCommit")
  private Commit containerdCommit;

  @JsonProperty("RuncCommit")
  private Commit runcCommit;

  @JsonProperty("InitCommit")
  private Commit initCommit;

  @JsonProperty("SecurityOptions")
  @Valid
  private List<String> securityOptions = null;

  @JsonProperty("ProductLicense")
  private String productLicense;

  @JsonProperty("DefaultAddressPools")
  @Valid
  private List<SystemInfoDefaultAddressPools> defaultAddressPools = null;

  @JsonProperty("Warnings")
  @Valid
  private List<String> warnings = null;

  public SystemInfo ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Unique identifier of the daemon.  <p><br /></p>  > **Note**: The format of the ID itself is not part of the API, and > should not be considered stable. 
   * @return ID
  */
  @ApiModelProperty(example = "7TRN:IPZB:QYBB:VPBQ:UMPP:KARE:6ZNR:XE6T:7EWV:PKF4:ZOJD:TPYS", value = "Unique identifier of the daemon.  <p><br /></p>  > **Note**: The format of the ID itself is not part of the API, and > should not be considered stable. ")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public SystemInfo containers(Integer containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Total number of containers on the host.
   * @return containers
  */
  @ApiModelProperty(example = "14", value = "Total number of containers on the host.")


  public Integer getContainers() {
    return containers;
  }

  public void setContainers(Integer containers) {
    this.containers = containers;
  }

  public SystemInfo containersRunning(Integer containersRunning) {
    this.containersRunning = containersRunning;
    return this;
  }

  /**
   * Number of containers with status `\"running\"`. 
   * @return containersRunning
  */
  @ApiModelProperty(example = "3", value = "Number of containers with status `\"running\"`. ")


  public Integer getContainersRunning() {
    return containersRunning;
  }

  public void setContainersRunning(Integer containersRunning) {
    this.containersRunning = containersRunning;
  }

  public SystemInfo containersPaused(Integer containersPaused) {
    this.containersPaused = containersPaused;
    return this;
  }

  /**
   * Number of containers with status `\"paused\"`. 
   * @return containersPaused
  */
  @ApiModelProperty(example = "1", value = "Number of containers with status `\"paused\"`. ")


  public Integer getContainersPaused() {
    return containersPaused;
  }

  public void setContainersPaused(Integer containersPaused) {
    this.containersPaused = containersPaused;
  }

  public SystemInfo containersStopped(Integer containersStopped) {
    this.containersStopped = containersStopped;
    return this;
  }

  /**
   * Number of containers with status `\"stopped\"`. 
   * @return containersStopped
  */
  @ApiModelProperty(example = "10", value = "Number of containers with status `\"stopped\"`. ")


  public Integer getContainersStopped() {
    return containersStopped;
  }

  public void setContainersStopped(Integer containersStopped) {
    this.containersStopped = containersStopped;
  }

  public SystemInfo images(Integer images) {
    this.images = images;
    return this;
  }

  /**
   * Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted. 
   * @return images
  */
  @ApiModelProperty(example = "508", value = "Total number of images on the host.  Both _tagged_ and _untagged_ (dangling) images are counted. ")


  public Integer getImages() {
    return images;
  }

  public void setImages(Integer images) {
    this.images = images;
  }

  public SystemInfo driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the storage driver in use.
   * @return driver
  */
  @ApiModelProperty(example = "overlay2", value = "Name of the storage driver in use.")


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public SystemInfo driverStatus(List<List<String>> driverStatus) {
    this.driverStatus = driverStatus;
    return this;
  }

  public SystemInfo addDriverStatusItem(List<String> driverStatusItem) {
    if (this.driverStatus == null) {
      this.driverStatus = new ArrayList<>();
    }
    this.driverStatus.add(driverStatusItem);
    return this;
  }

  /**
   * Information specific to the storage driver, provided as \"label\" / \"value\" pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of `docker info` on the command line.  <p><br /></p>  > **Note**: The information returned in this field, including the > formatting of values and labels, should not be considered stable, > and may change without notice. 
   * @return driverStatus
  */
  @ApiModelProperty(example = "[[Backing Filesystem, extfs], [Supports d_type, true], [Native Overlay Diff, true]]", value = "Information specific to the storage driver, provided as \"label\" / \"value\" pairs.  This information is provided by the storage driver, and formatted in a way consistent with the output of `docker info` on the command line.  <p><br /></p>  > **Note**: The information returned in this field, including the > formatting of values and labels, should not be considered stable, > and may change without notice. ")

  @Valid

  public List<List<String>> getDriverStatus() {
    return driverStatus;
  }

  public void setDriverStatus(List<List<String>> driverStatus) {
    this.driverStatus = driverStatus;
  }

  public SystemInfo dockerRootDir(String dockerRootDir) {
    this.dockerRootDir = dockerRootDir;
    return this;
  }

  /**
   * Root directory of persistent Docker state.  Defaults to `/var/lib/docker` on Linux, and `C:\\ProgramData\\docker` on Windows. 
   * @return dockerRootDir
  */
  @ApiModelProperty(example = "/var/lib/docker", value = "Root directory of persistent Docker state.  Defaults to `/var/lib/docker` on Linux, and `C:\\ProgramData\\docker` on Windows. ")


  public String getDockerRootDir() {
    return dockerRootDir;
  }

  public void setDockerRootDir(String dockerRootDir) {
    this.dockerRootDir = dockerRootDir;
  }

  public SystemInfo plugins(PluginsInfo plugins) {
    this.plugins = plugins;
    return this;
  }

  /**
   * Get plugins
   * @return plugins
  */
  @ApiModelProperty(value = "")

  @Valid

  public PluginsInfo getPlugins() {
    return plugins;
  }

  public void setPlugins(PluginsInfo plugins) {
    this.plugins = plugins;
  }

  public SystemInfo memoryLimit(Boolean memoryLimit) {
    this.memoryLimit = memoryLimit;
    return this;
  }

  /**
   * Indicates if the host has memory limit support enabled.
   * @return memoryLimit
  */
  @ApiModelProperty(example = "true", value = "Indicates if the host has memory limit support enabled.")


  public Boolean getMemoryLimit() {
    return memoryLimit;
  }

  public void setMemoryLimit(Boolean memoryLimit) {
    this.memoryLimit = memoryLimit;
  }

  public SystemInfo swapLimit(Boolean swapLimit) {
    this.swapLimit = swapLimit;
    return this;
  }

  /**
   * Indicates if the host has memory swap limit support enabled.
   * @return swapLimit
  */
  @ApiModelProperty(example = "true", value = "Indicates if the host has memory swap limit support enabled.")


  public Boolean getSwapLimit() {
    return swapLimit;
  }

  public void setSwapLimit(Boolean swapLimit) {
    this.swapLimit = swapLimit;
  }

  public SystemInfo kernelMemory(Boolean kernelMemory) {
    this.kernelMemory = kernelMemory;
    return this;
  }

  /**
   * Indicates if the host has kernel memory limit support enabled.  <p><br /></p>  > **Deprecated**: This field is deprecated as the kernel 5.4 deprecated > `kmem.limit_in_bytes`. 
   * @return kernelMemory
  */
  @ApiModelProperty(example = "true", value = "Indicates if the host has kernel memory limit support enabled.  <p><br /></p>  > **Deprecated**: This field is deprecated as the kernel 5.4 deprecated > `kmem.limit_in_bytes`. ")


  public Boolean getKernelMemory() {
    return kernelMemory;
  }

  public void setKernelMemory(Boolean kernelMemory) {
    this.kernelMemory = kernelMemory;
  }

  public SystemInfo cpuCfsPeriod(Boolean cpuCfsPeriod) {
    this.cpuCfsPeriod = cpuCfsPeriod;
    return this;
  }

  /**
   * Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host. 
   * @return cpuCfsPeriod
  */
  @ApiModelProperty(example = "true", value = "Indicates if CPU CFS(Completely Fair Scheduler) period is supported by the host. ")


  public Boolean getCpuCfsPeriod() {
    return cpuCfsPeriod;
  }

  public void setCpuCfsPeriod(Boolean cpuCfsPeriod) {
    this.cpuCfsPeriod = cpuCfsPeriod;
  }

  public SystemInfo cpuCfsQuota(Boolean cpuCfsQuota) {
    this.cpuCfsQuota = cpuCfsQuota;
    return this;
  }

  /**
   * Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host. 
   * @return cpuCfsQuota
  */
  @ApiModelProperty(example = "true", value = "Indicates if CPU CFS(Completely Fair Scheduler) quota is supported by the host. ")


  public Boolean getCpuCfsQuota() {
    return cpuCfsQuota;
  }

  public void setCpuCfsQuota(Boolean cpuCfsQuota) {
    this.cpuCfsQuota = cpuCfsQuota;
  }

  public SystemInfo cpUShares(Boolean cpUShares) {
    this.cpUShares = cpUShares;
    return this;
  }

  /**
   * Indicates if CPU Shares limiting is supported by the host. 
   * @return cpUShares
  */
  @ApiModelProperty(example = "true", value = "Indicates if CPU Shares limiting is supported by the host. ")


  public Boolean getCpUShares() {
    return cpUShares;
  }

  public void setCpUShares(Boolean cpUShares) {
    this.cpUShares = cpUShares;
  }

  public SystemInfo cpUSet(Boolean cpUSet) {
    this.cpUSet = cpUSet;
    return this;
  }

  /**
   * Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt) 
   * @return cpUSet
  */
  @ApiModelProperty(example = "true", value = "Indicates if CPUsets (cpuset.cpus, cpuset.mems) are supported by the host.  See [cpuset(7)](https://www.kernel.org/doc/Documentation/cgroup-v1/cpusets.txt) ")


  public Boolean getCpUSet() {
    return cpUSet;
  }

  public void setCpUSet(Boolean cpUSet) {
    this.cpUSet = cpUSet;
  }

  public SystemInfo pidsLimit(Boolean pidsLimit) {
    this.pidsLimit = pidsLimit;
    return this;
  }

  /**
   * Indicates if the host kernel has PID limit support enabled.
   * @return pidsLimit
  */
  @ApiModelProperty(example = "true", value = "Indicates if the host kernel has PID limit support enabled.")


  public Boolean getPidsLimit() {
    return pidsLimit;
  }

  public void setPidsLimit(Boolean pidsLimit) {
    this.pidsLimit = pidsLimit;
  }

  public SystemInfo oomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
    return this;
  }

  /**
   * Indicates if OOM killer disable is supported on the host.
   * @return oomKillDisable
  */
  @ApiModelProperty(value = "Indicates if OOM killer disable is supported on the host.")


  public Boolean getOomKillDisable() {
    return oomKillDisable;
  }

  public void setOomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
  }

  public SystemInfo ipv4Forwarding(Boolean ipv4Forwarding) {
    this.ipv4Forwarding = ipv4Forwarding;
    return this;
  }

  /**
   * Indicates IPv4 forwarding is enabled.
   * @return ipv4Forwarding
  */
  @ApiModelProperty(example = "true", value = "Indicates IPv4 forwarding is enabled.")


  public Boolean getIpv4Forwarding() {
    return ipv4Forwarding;
  }

  public void setIpv4Forwarding(Boolean ipv4Forwarding) {
    this.ipv4Forwarding = ipv4Forwarding;
  }

  public SystemInfo bridgeNfIptables(Boolean bridgeNfIptables) {
    this.bridgeNfIptables = bridgeNfIptables;
    return this;
  }

  /**
   * Indicates if `bridge-nf-call-iptables` is available on the host.
   * @return bridgeNfIptables
  */
  @ApiModelProperty(example = "true", value = "Indicates if `bridge-nf-call-iptables` is available on the host.")


  public Boolean getBridgeNfIptables() {
    return bridgeNfIptables;
  }

  public void setBridgeNfIptables(Boolean bridgeNfIptables) {
    this.bridgeNfIptables = bridgeNfIptables;
  }

  public SystemInfo bridgeNfIp6tables(Boolean bridgeNfIp6tables) {
    this.bridgeNfIp6tables = bridgeNfIp6tables;
    return this;
  }

  /**
   * Indicates if `bridge-nf-call-ip6tables` is available on the host.
   * @return bridgeNfIp6tables
  */
  @ApiModelProperty(example = "true", value = "Indicates if `bridge-nf-call-ip6tables` is available on the host.")


  public Boolean getBridgeNfIp6tables() {
    return bridgeNfIp6tables;
  }

  public void setBridgeNfIp6tables(Boolean bridgeNfIp6tables) {
    this.bridgeNfIp6tables = bridgeNfIp6tables;
  }

  public SystemInfo debug(Boolean debug) {
    this.debug = debug;
    return this;
  }

  /**
   * Indicates if the daemon is running in debug-mode / with debug-level logging enabled. 
   * @return debug
  */
  @ApiModelProperty(example = "true", value = "Indicates if the daemon is running in debug-mode / with debug-level logging enabled. ")


  public Boolean getDebug() {
    return debug;
  }

  public void setDebug(Boolean debug) {
    this.debug = debug;
  }

  public SystemInfo nfd(Integer nfd) {
    this.nfd = nfd;
    return this;
  }

  /**
   * The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled. 
   * @return nfd
  */
  @ApiModelProperty(example = "64", value = "The total number of file Descriptors in use by the daemon process.  This information is only returned if debug-mode is enabled. ")


  public Integer getNfd() {
    return nfd;
  }

  public void setNfd(Integer nfd) {
    this.nfd = nfd;
  }

  public SystemInfo ngoroutines(Integer ngoroutines) {
    this.ngoroutines = ngoroutines;
    return this;
  }

  /**
   * The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled. 
   * @return ngoroutines
  */
  @ApiModelProperty(example = "174", value = "The  number of goroutines that currently exist.  This information is only returned if debug-mode is enabled. ")


  public Integer getNgoroutines() {
    return ngoroutines;
  }

  public void setNgoroutines(Integer ngoroutines) {
    this.ngoroutines = ngoroutines;
  }

  public SystemInfo systemTime(String systemTime) {
    this.systemTime = systemTime;
    return this;
  }

  /**
   * Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return systemTime
  */
  @ApiModelProperty(example = "2017-08-08T20:28:29.06202363Z", value = "Current system-time in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ")


  public String getSystemTime() {
    return systemTime;
  }

  public void setSystemTime(String systemTime) {
    this.systemTime = systemTime;
  }

  public SystemInfo loggingDriver(String loggingDriver) {
    this.loggingDriver = loggingDriver;
    return this;
  }

  /**
   * The logging driver to use as a default for new containers. 
   * @return loggingDriver
  */
  @ApiModelProperty(value = "The logging driver to use as a default for new containers. ")


  public String getLoggingDriver() {
    return loggingDriver;
  }

  public void setLoggingDriver(String loggingDriver) {
    this.loggingDriver = loggingDriver;
  }

  public SystemInfo cgroupDriver(CgroupDriverEnum cgroupDriver) {
    this.cgroupDriver = cgroupDriver;
    return this;
  }

  /**
   * The driver to use for managing cgroups. 
   * @return cgroupDriver
  */
  @ApiModelProperty(example = "cgroupfs", value = "The driver to use for managing cgroups. ")


  public CgroupDriverEnum getCgroupDriver() {
    return cgroupDriver;
  }

  public void setCgroupDriver(CgroupDriverEnum cgroupDriver) {
    this.cgroupDriver = cgroupDriver;
  }

  public SystemInfo cgroupVersion(CgroupVersionEnum cgroupVersion) {
    this.cgroupVersion = cgroupVersion;
    return this;
  }

  /**
   * The version of the cgroup. 
   * @return cgroupVersion
  */
  @ApiModelProperty(example = "1", value = "The version of the cgroup. ")


  public CgroupVersionEnum getCgroupVersion() {
    return cgroupVersion;
  }

  public void setCgroupVersion(CgroupVersionEnum cgroupVersion) {
    this.cgroupVersion = cgroupVersion;
  }

  public SystemInfo neventsListener(Integer neventsListener) {
    this.neventsListener = neventsListener;
    return this;
  }

  /**
   * Number of event listeners subscribed.
   * @return neventsListener
  */
  @ApiModelProperty(example = "30", value = "Number of event listeners subscribed.")


  public Integer getNeventsListener() {
    return neventsListener;
  }

  public void setNeventsListener(Integer neventsListener) {
    this.neventsListener = neventsListener;
  }

  public SystemInfo kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * Kernel version of the host.  On Linux, this information obtained from `uname`. On Windows this information is queried from the <kbd>HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\</kbd> registry value, for example _\"10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\"_. 
   * @return kernelVersion
  */
  @ApiModelProperty(example = "4.9.38-moby", value = "Kernel version of the host.  On Linux, this information obtained from `uname`. On Windows this information is queried from the <kbd>HKEY_LOCAL_MACHINE\\\\SOFTWARE\\\\Microsoft\\\\Windows NT\\\\CurrentVersion\\\\</kbd> registry value, for example _\"10.0 14393 (14393.1198.amd64fre.rs1_release_sec.170427-1353)\"_. ")


  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public SystemInfo operatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
    return this;
  }

  /**
   * Name of the host's operating system, for example: \"Ubuntu 16.04.2 LTS\" or \"Windows Server 2016 Datacenter\" 
   * @return operatingSystem
  */
  @ApiModelProperty(example = "Alpine Linux v3.5", value = "Name of the host's operating system, for example: \"Ubuntu 16.04.2 LTS\" or \"Windows Server 2016 Datacenter\" ")


  public String getOperatingSystem() {
    return operatingSystem;
  }

  public void setOperatingSystem(String operatingSystem) {
    this.operatingSystem = operatingSystem;
  }

  public SystemInfo osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Version of the host's operating system  <p><br /></p>  > **Note**: The information returned in this field, including its > very existence, and the formatting of values, should not be considered > stable, and may change without notice. 
   * @return osVersion
  */
  @ApiModelProperty(example = "16.04", value = "Version of the host's operating system  <p><br /></p>  > **Note**: The information returned in this field, including its > very existence, and the formatting of values, should not be considered > stable, and may change without notice. ")


  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public SystemInfo osType(String osType) {
    this.osType = osType;
    return this;
  }

  /**
   * Generic type of the operating system of the host, as returned by the Go runtime (`GOOS`).  Currently returned values are \"linux\" and \"windows\". A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). 
   * @return osType
  */
  @ApiModelProperty(example = "linux", value = "Generic type of the operating system of the host, as returned by the Go runtime (`GOOS`).  Currently returned values are \"linux\" and \"windows\". A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). ")


  public String getOsType() {
    return osType;
  }

  public void setOsType(String osType) {
    this.osType = osType;
  }

  public SystemInfo architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Hardware architecture of the host, as returned by the Go runtime (`GOARCH`).  A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). 
   * @return architecture
  */
  @ApiModelProperty(example = "x86_64", value = "Hardware architecture of the host, as returned by the Go runtime (`GOARCH`).  A full list of possible values can be found in the [Go documentation](https://golang.org/doc/install/source#environment). ")


  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public SystemInfo NCPU(Integer NCPU) {
    this.NCPU = NCPU;
    return this;
  }

  /**
   * The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected. 
   * @return NCPU
  */
  @ApiModelProperty(example = "4", value = "The number of logical CPUs usable by the daemon.  The number of available CPUs is checked by querying the operating system when the daemon starts. Changes to operating system CPU allocation after the daemon is started are not reflected. ")


  public Integer getNCPU() {
    return NCPU;
  }

  public void setNCPU(Integer NCPU) {
    this.NCPU = NCPU;
  }

  public SystemInfo memTotal(Long memTotal) {
    this.memTotal = memTotal;
    return this;
  }

  /**
   * Total amount of physical memory available on the host, in bytes. 
   * @return memTotal
  */
  @ApiModelProperty(example = "2095882240", value = "Total amount of physical memory available on the host, in bytes. ")


  public Long getMemTotal() {
    return memTotal;
  }

  public void setMemTotal(Long memTotal) {
    this.memTotal = memTotal;
  }

  public SystemInfo indexServerAddress(String indexServerAddress) {
    this.indexServerAddress = indexServerAddress;
    return this;
  }

  /**
   * Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud. 
   * @return indexServerAddress
  */
  @ApiModelProperty(example = "https://index.docker.io/v1/", value = "Address / URL of the index server that is used for image search, and as a default for user authentication for Docker Hub and Docker Cloud. ")


  public String getIndexServerAddress() {
    return indexServerAddress;
  }

  public void setIndexServerAddress(String indexServerAddress) {
    this.indexServerAddress = indexServerAddress;
  }

  public SystemInfo registryConfig(RegistryServiceConfig registryConfig) {
    this.registryConfig = JsonNullable.of(registryConfig);
    return this;
  }

  /**
   * Get registryConfig
   * @return registryConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<RegistryServiceConfig> getRegistryConfig() {
    return registryConfig;
  }

  public void setRegistryConfig(JsonNullable<RegistryServiceConfig> registryConfig) {
    this.registryConfig = registryConfig;
  }

  public SystemInfo genericResources(List<Object> genericResources) {
    this.genericResources = genericResources;
    return this;
  }

  public SystemInfo addGenericResourcesItem(Object genericResourcesItem) {
    if (this.genericResources == null) {
      this.genericResources = new ArrayList<>();
    }
    this.genericResources.add(genericResourcesItem);
    return this;
  }

  /**
   * User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). 
   * @return genericResources
  */
  @ApiModelProperty(example = "[{DiscreteResourceSpec={Kind=SSD, Value=3}}, {NamedResourceSpec={Kind=GPU, Value=UUID1}}, {NamedResourceSpec={Kind=GPU, Value=UUID2}}]", value = "User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). ")


  public List<Object> getGenericResources() {
    return genericResources;
  }

  public void setGenericResources(List<Object> genericResources) {
    this.genericResources = genericResources;
  }

  public SystemInfo httpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
    return this;
  }

  /**
   * HTTP-proxy configured for the daemon. This value is obtained from the [`HTTP_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. 
   * @return httpProxy
  */
  @ApiModelProperty(example = "http://xxxxx:xxxxx@proxy.corp.example.com:8080", value = "HTTP-proxy configured for the daemon. This value is obtained from the [`HTTP_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. ")


  public String getHttpProxy() {
    return httpProxy;
  }

  public void setHttpProxy(String httpProxy) {
    this.httpProxy = httpProxy;
  }

  public SystemInfo httpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
    return this;
  }

  /**
   * HTTPS-proxy configured for the daemon. This value is obtained from the [`HTTPS_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. 
   * @return httpsProxy
  */
  @ApiModelProperty(example = "https://xxxxx:xxxxx@proxy.corp.example.com:4443", value = "HTTPS-proxy configured for the daemon. This value is obtained from the [`HTTPS_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable. Credentials ([user info component](https://tools.ietf.org/html/rfc3986#section-3.2.1)) in the proxy URL are masked in the API response.  Containers do not automatically inherit this configuration. ")


  public String getHttpsProxy() {
    return httpsProxy;
  }

  public void setHttpsProxy(String httpsProxy) {
    this.httpsProxy = httpsProxy;
  }

  public SystemInfo noProxy(String noProxy) {
    this.noProxy = noProxy;
    return this;
  }

  /**
   * Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [`NO_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. 
   * @return noProxy
  */
  @ApiModelProperty(example = "*.local, 169.254/16", value = "Comma-separated list of domain extensions for which no proxy should be used. This value is obtained from the [`NO_PROXY`](https://www.gnu.org/software/wget/manual/html_node/Proxies.html) environment variable.  Containers do not automatically inherit this configuration. ")


  public String getNoProxy() {
    return noProxy;
  }

  public void setNoProxy(String noProxy) {
    this.noProxy = noProxy;
  }

  public SystemInfo name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Hostname of the host.
   * @return name
  */
  @ApiModelProperty(example = "node5.corp.example.com", value = "Hostname of the host.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemInfo labels(List<String> labels) {
    this.labels = labels;
    return this;
  }

  public SystemInfo addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

  /**
   * User-defined labels (key/value metadata) as set on the daemon.  <p><br /></p>  > **Note**: When part of a Swarm, nodes can both have _daemon_ labels, > set through the daemon configuration, and _node_ labels, set from a > manager node in the Swarm. Node labels are not included in this > field. Node labels can be retrieved using the `/nodes/(id)` endpoint > on a manager node in the Swarm. 
   * @return labels
  */
  @ApiModelProperty(example = "[storage=ssd, production]", value = "User-defined labels (key/value metadata) as set on the daemon.  <p><br /></p>  > **Note**: When part of a Swarm, nodes can both have _daemon_ labels, > set through the daemon configuration, and _node_ labels, set from a > manager node in the Swarm. Node labels are not included in this > field. Node labels can be retrieved using the `/nodes/(id)` endpoint > on a manager node in the Swarm. ")


  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

  public SystemInfo experimentalBuild(Boolean experimentalBuild) {
    this.experimentalBuild = experimentalBuild;
    return this;
  }

  /**
   * Indicates if experimental features are enabled on the daemon. 
   * @return experimentalBuild
  */
  @ApiModelProperty(example = "true", value = "Indicates if experimental features are enabled on the daemon. ")


  public Boolean getExperimentalBuild() {
    return experimentalBuild;
  }

  public void setExperimentalBuild(Boolean experimentalBuild) {
    this.experimentalBuild = experimentalBuild;
  }

  public SystemInfo serverVersion(String serverVersion) {
    this.serverVersion = serverVersion;
    return this;
  }

  /**
   * Version string of the daemon.  > **Note**: the [standalone Swarm API](https://docs.docker.com/swarm/swarm-api/) > returns the Swarm version instead of the daemon  version, for example > `swarm/1.2.8`. 
   * @return serverVersion
  */
  @ApiModelProperty(example = "17.06.0-ce", value = "Version string of the daemon.  > **Note**: the [standalone Swarm API](https://docs.docker.com/swarm/swarm-api/) > returns the Swarm version instead of the daemon  version, for example > `swarm/1.2.8`. ")


  public String getServerVersion() {
    return serverVersion;
  }

  public void setServerVersion(String serverVersion) {
    this.serverVersion = serverVersion;
  }

  public SystemInfo clusterStore(String clusterStore) {
    this.clusterStore = clusterStore;
    return this;
  }

  /**
   * URL of the distributed storage backend.   The storage backend is used for multihost networking (to store network and endpoint information) and by the node discovery mechanism.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty. 
   * @return clusterStore
  */
  @ApiModelProperty(example = "consul://consul.corp.example.com:8600/some/path", value = "URL of the distributed storage backend.   The storage backend is used for multihost networking (to store network and endpoint information) and by the node discovery mechanism.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty. ")


  public String getClusterStore() {
    return clusterStore;
  }

  public void setClusterStore(String clusterStore) {
    this.clusterStore = clusterStore;
  }

  public SystemInfo clusterAdvertise(String clusterAdvertise) {
    this.clusterAdvertise = clusterAdvertise;
    return this;
  }

  /**
   * The network endpoint that the Engine advertises for the purpose of node discovery. ClusterAdvertise is a `host:port` combination on which the daemon is reachable by other hosts.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty. 
   * @return clusterAdvertise
  */
  @ApiModelProperty(example = "node5.corp.example.com:8000", value = "The network endpoint that the Engine advertises for the purpose of node discovery. ClusterAdvertise is a `host:port` combination on which the daemon is reachable by other hosts.  <p><br /></p>  > **Deprecated**: This field is only propagated when using standalone Swarm > mode, and overlay networking using an external k/v store. Overlay > networks with Swarm mode enabled use the built-in raft store, and > this field will be empty. ")


  public String getClusterAdvertise() {
    return clusterAdvertise;
  }

  public void setClusterAdvertise(String clusterAdvertise) {
    this.clusterAdvertise = clusterAdvertise;
  }

  public SystemInfo runtimes(Map<String, Runtime> runtimes) {
    this.runtimes = runtimes;
    return this;
  }

  public SystemInfo putRuntimesItem(String key, Runtime runtimesItem) {
    if (this.runtimes == null) {
      this.runtimes = new HashMap<>();
    }
    this.runtimes.put(key, runtimesItem);
    return this;
  }

  /**
   * List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \"name\" used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the `containerd` daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is `runc`, and automatically configured. Additional runtimes can be configured by the user and will be listed here. 
   * @return runtimes
  */
  @ApiModelProperty(example = "{\"runc\":{\"path\":\"runc\"},\"runc-master\":{\"path\":\"/go/bin/runc\"},\"custom\":{\"path\":\"/usr/local/bin/my-oci-runtime\",\"runtimeArgs\":[\"--debug\",\"--systemd-cgroup=false\"]}}", value = "List of [OCI compliant](https://github.com/opencontainers/runtime-spec) runtimes configured on the daemon. Keys hold the \"name\" used to reference the runtime.  The Docker daemon relies on an OCI compliant runtime (invoked via the `containerd` daemon) as its interface to the Linux kernel namespaces, cgroups, and SELinux.  The default runtime is `runc`, and automatically configured. Additional runtimes can be configured by the user and will be listed here. ")

  @Valid

  public Map<String, Runtime> getRuntimes() {
    return runtimes;
  }

  public void setRuntimes(Map<String, Runtime> runtimes) {
    this.runtimes = runtimes;
  }

  public SystemInfo defaultRuntime(String defaultRuntime) {
    this.defaultRuntime = defaultRuntime;
    return this;
  }

  /**
   * Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time. 
   * @return defaultRuntime
  */
  @ApiModelProperty(example = "runc", value = "Name of the default OCI runtime that is used when starting containers.  The default can be overridden per-container at create time. ")


  public String getDefaultRuntime() {
    return defaultRuntime;
  }

  public void setDefaultRuntime(String defaultRuntime) {
    this.defaultRuntime = defaultRuntime;
  }

  public SystemInfo swarm(SwarmInfo swarm) {
    this.swarm = swarm;
    return this;
  }

  /**
   * Get swarm
   * @return swarm
  */
  @ApiModelProperty(value = "")

  @Valid

  public SwarmInfo getSwarm() {
    return swarm;
  }

  public void setSwarm(SwarmInfo swarm) {
    this.swarm = swarm;
  }

  public SystemInfo liveRestoreEnabled(Boolean liveRestoreEnabled) {
    this.liveRestoreEnabled = liveRestoreEnabled;
    return this;
  }

  /**
   * Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected. 
   * @return liveRestoreEnabled
  */
  @ApiModelProperty(example = "false", value = "Indicates if live restore is enabled.  If enabled, containers are kept running when the daemon is shutdown or upon daemon start if running containers are detected. ")


  public Boolean getLiveRestoreEnabled() {
    return liveRestoreEnabled;
  }

  public void setLiveRestoreEnabled(Boolean liveRestoreEnabled) {
    this.liveRestoreEnabled = liveRestoreEnabled;
  }

  public SystemInfo isolation(IsolationEnum isolation) {
    this.isolation = isolation;
    return this;
  }

  /**
   * Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms. 
   * @return isolation
  */
  @ApiModelProperty(value = "Represents the isolation technology to use as a default for containers. The supported values are platform-specific.  If no isolation value is specified on daemon start, on Windows client, the default is `hyperv`, and on Windows server, the default is `process`.  This option is currently not used on other platforms. ")


  public IsolationEnum getIsolation() {
    return isolation;
  }

  public void setIsolation(IsolationEnum isolation) {
    this.isolation = isolation;
  }

  public SystemInfo initBinary(String initBinary) {
    this.initBinary = initBinary;
    return this;
  }

  /**
   * Name and, optional, path of the `docker-init` binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. 
   * @return initBinary
  */
  @ApiModelProperty(example = "docker-init", value = "Name and, optional, path of the `docker-init` binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. ")


  public String getInitBinary() {
    return initBinary;
  }

  public void setInitBinary(String initBinary) {
    this.initBinary = initBinary;
  }

  public SystemInfo containerdCommit(Commit containerdCommit) {
    this.containerdCommit = containerdCommit;
    return this;
  }

  /**
   * Get containerdCommit
   * @return containerdCommit
  */
  @ApiModelProperty(value = "")

  @Valid

  public Commit getContainerdCommit() {
    return containerdCommit;
  }

  public void setContainerdCommit(Commit containerdCommit) {
    this.containerdCommit = containerdCommit;
  }

  public SystemInfo runcCommit(Commit runcCommit) {
    this.runcCommit = runcCommit;
    return this;
  }

  /**
   * Get runcCommit
   * @return runcCommit
  */
  @ApiModelProperty(value = "")

  @Valid

  public Commit getRuncCommit() {
    return runcCommit;
  }

  public void setRuncCommit(Commit runcCommit) {
    this.runcCommit = runcCommit;
  }

  public SystemInfo initCommit(Commit initCommit) {
    this.initCommit = initCommit;
    return this;
  }

  /**
   * Get initCommit
   * @return initCommit
  */
  @ApiModelProperty(value = "")

  @Valid

  public Commit getInitCommit() {
    return initCommit;
  }

  public void setInitCommit(Commit initCommit) {
    this.initCommit = initCommit;
  }

  public SystemInfo securityOptions(List<String> securityOptions) {
    this.securityOptions = securityOptions;
    return this;
  }

  public SystemInfo addSecurityOptionsItem(String securityOptionsItem) {
    if (this.securityOptions == null) {
      this.securityOptions = new ArrayList<>();
    }
    this.securityOptions.add(securityOptionsItem);
    return this;
  }

  /**
   * List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, user-namespaces (userns), and rootless.  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs. 
   * @return securityOptions
  */
  @ApiModelProperty(example = "[name=apparmor, name=seccomp,profile=default, name=selinux, name=userns, name=rootless]", value = "List of security features that are enabled on the daemon, such as apparmor, seccomp, SELinux, user-namespaces (userns), and rootless.  Additional configuration options for each security feature may be present, and are included as a comma-separated list of key/value pairs. ")


  public List<String> getSecurityOptions() {
    return securityOptions;
  }

  public void setSecurityOptions(List<String> securityOptions) {
    this.securityOptions = securityOptions;
  }

  public SystemInfo productLicense(String productLicense) {
    this.productLicense = productLicense;
    return this;
  }

  /**
   * Reports a summary of the product license on the daemon.  If a commercial license has been applied to the daemon, information such as number of nodes, and expiration are included. 
   * @return productLicense
  */
  @ApiModelProperty(example = "Community Engine", value = "Reports a summary of the product license on the daemon.  If a commercial license has been applied to the daemon, information such as number of nodes, and expiration are included. ")


  public String getProductLicense() {
    return productLicense;
  }

  public void setProductLicense(String productLicense) {
    this.productLicense = productLicense;
  }

  public SystemInfo defaultAddressPools(List<SystemInfoDefaultAddressPools> defaultAddressPools) {
    this.defaultAddressPools = defaultAddressPools;
    return this;
  }

  public SystemInfo addDefaultAddressPoolsItem(SystemInfoDefaultAddressPools defaultAddressPoolsItem) {
    if (this.defaultAddressPools == null) {
      this.defaultAddressPools = new ArrayList<>();
    }
    this.defaultAddressPools.add(defaultAddressPoolsItem);
    return this;
  }

  /**
   * List of custom default address pools for local networks, which can be specified in the daemon.json file or dockerd option.  Example: a Base \"10.10.0.0/16\" with Size 24 will define the set of 256 10.10.[0-255].0/24 address pools. 
   * @return defaultAddressPools
  */
  @ApiModelProperty(value = "List of custom default address pools for local networks, which can be specified in the daemon.json file or dockerd option.  Example: a Base \"10.10.0.0/16\" with Size 24 will define the set of 256 10.10.[0-255].0/24 address pools. ")

  @Valid

  public List<SystemInfoDefaultAddressPools> getDefaultAddressPools() {
    return defaultAddressPools;
  }

  public void setDefaultAddressPools(List<SystemInfoDefaultAddressPools> defaultAddressPools) {
    this.defaultAddressPools = defaultAddressPools;
  }

  public SystemInfo warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public SystemInfo addWarningsItem(String warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * List of warnings / informational messages about missing features, or issues related to the daemon configuration.  These messages can be printed by the client as information to the user. 
   * @return warnings
  */
  @ApiModelProperty(example = "[WARNING: No memory limit support, WARNING: bridge-nf-call-iptables is disabled, WARNING: bridge-nf-call-ip6tables is disabled]", value = "List of warnings / informational messages about missing features, or issues related to the daemon configuration.  These messages can be printed by the client as information to the user. ")


  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfo systemInfo = (SystemInfo) o;
    return Objects.equals(this.ID, systemInfo.ID) &&
        Objects.equals(this.containers, systemInfo.containers) &&
        Objects.equals(this.containersRunning, systemInfo.containersRunning) &&
        Objects.equals(this.containersPaused, systemInfo.containersPaused) &&
        Objects.equals(this.containersStopped, systemInfo.containersStopped) &&
        Objects.equals(this.images, systemInfo.images) &&
        Objects.equals(this.driver, systemInfo.driver) &&
        Objects.equals(this.driverStatus, systemInfo.driverStatus) &&
        Objects.equals(this.dockerRootDir, systemInfo.dockerRootDir) &&
        Objects.equals(this.plugins, systemInfo.plugins) &&
        Objects.equals(this.memoryLimit, systemInfo.memoryLimit) &&
        Objects.equals(this.swapLimit, systemInfo.swapLimit) &&
        Objects.equals(this.kernelMemory, systemInfo.kernelMemory) &&
        Objects.equals(this.cpuCfsPeriod, systemInfo.cpuCfsPeriod) &&
        Objects.equals(this.cpuCfsQuota, systemInfo.cpuCfsQuota) &&
        Objects.equals(this.cpUShares, systemInfo.cpUShares) &&
        Objects.equals(this.cpUSet, systemInfo.cpUSet) &&
        Objects.equals(this.pidsLimit, systemInfo.pidsLimit) &&
        Objects.equals(this.oomKillDisable, systemInfo.oomKillDisable) &&
        Objects.equals(this.ipv4Forwarding, systemInfo.ipv4Forwarding) &&
        Objects.equals(this.bridgeNfIptables, systemInfo.bridgeNfIptables) &&
        Objects.equals(this.bridgeNfIp6tables, systemInfo.bridgeNfIp6tables) &&
        Objects.equals(this.debug, systemInfo.debug) &&
        Objects.equals(this.nfd, systemInfo.nfd) &&
        Objects.equals(this.ngoroutines, systemInfo.ngoroutines) &&
        Objects.equals(this.systemTime, systemInfo.systemTime) &&
        Objects.equals(this.loggingDriver, systemInfo.loggingDriver) &&
        Objects.equals(this.cgroupDriver, systemInfo.cgroupDriver) &&
        Objects.equals(this.cgroupVersion, systemInfo.cgroupVersion) &&
        Objects.equals(this.neventsListener, systemInfo.neventsListener) &&
        Objects.equals(this.kernelVersion, systemInfo.kernelVersion) &&
        Objects.equals(this.operatingSystem, systemInfo.operatingSystem) &&
        Objects.equals(this.osVersion, systemInfo.osVersion) &&
        Objects.equals(this.osType, systemInfo.osType) &&
        Objects.equals(this.architecture, systemInfo.architecture) &&
        Objects.equals(this.NCPU, systemInfo.NCPU) &&
        Objects.equals(this.memTotal, systemInfo.memTotal) &&
        Objects.equals(this.indexServerAddress, systemInfo.indexServerAddress) &&
        Objects.equals(this.registryConfig, systemInfo.registryConfig) &&
        Objects.equals(this.genericResources, systemInfo.genericResources) &&
        Objects.equals(this.httpProxy, systemInfo.httpProxy) &&
        Objects.equals(this.httpsProxy, systemInfo.httpsProxy) &&
        Objects.equals(this.noProxy, systemInfo.noProxy) &&
        Objects.equals(this.name, systemInfo.name) &&
        Objects.equals(this.labels, systemInfo.labels) &&
        Objects.equals(this.experimentalBuild, systemInfo.experimentalBuild) &&
        Objects.equals(this.serverVersion, systemInfo.serverVersion) &&
        Objects.equals(this.clusterStore, systemInfo.clusterStore) &&
        Objects.equals(this.clusterAdvertise, systemInfo.clusterAdvertise) &&
        Objects.equals(this.runtimes, systemInfo.runtimes) &&
        Objects.equals(this.defaultRuntime, systemInfo.defaultRuntime) &&
        Objects.equals(this.swarm, systemInfo.swarm) &&
        Objects.equals(this.liveRestoreEnabled, systemInfo.liveRestoreEnabled) &&
        Objects.equals(this.isolation, systemInfo.isolation) &&
        Objects.equals(this.initBinary, systemInfo.initBinary) &&
        Objects.equals(this.containerdCommit, systemInfo.containerdCommit) &&
        Objects.equals(this.runcCommit, systemInfo.runcCommit) &&
        Objects.equals(this.initCommit, systemInfo.initCommit) &&
        Objects.equals(this.securityOptions, systemInfo.securityOptions) &&
        Objects.equals(this.productLicense, systemInfo.productLicense) &&
        Objects.equals(this.defaultAddressPools, systemInfo.defaultAddressPools) &&
        Objects.equals(this.warnings, systemInfo.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, containers, containersRunning, containersPaused, containersStopped, images, driver, driverStatus, dockerRootDir, plugins, memoryLimit, swapLimit, kernelMemory, cpuCfsPeriod, cpuCfsQuota, cpUShares, cpUSet, pidsLimit, oomKillDisable, ipv4Forwarding, bridgeNfIptables, bridgeNfIp6tables, debug, nfd, ngoroutines, systemTime, loggingDriver, cgroupDriver, cgroupVersion, neventsListener, kernelVersion, operatingSystem, osVersion, osType, architecture, NCPU, memTotal, indexServerAddress, registryConfig, genericResources, httpProxy, httpsProxy, noProxy, name, labels, experimentalBuild, serverVersion, clusterStore, clusterAdvertise, runtimes, defaultRuntime, swarm, liveRestoreEnabled, isolation, initBinary, containerdCommit, runcCommit, initCommit, securityOptions, productLicense, defaultAddressPools, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfo {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    containersRunning: ").append(toIndentedString(containersRunning)).append("\n");
    sb.append("    containersPaused: ").append(toIndentedString(containersPaused)).append("\n");
    sb.append("    containersStopped: ").append(toIndentedString(containersStopped)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverStatus: ").append(toIndentedString(driverStatus)).append("\n");
    sb.append("    dockerRootDir: ").append(toIndentedString(dockerRootDir)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
    sb.append("    memoryLimit: ").append(toIndentedString(memoryLimit)).append("\n");
    sb.append("    swapLimit: ").append(toIndentedString(swapLimit)).append("\n");
    sb.append("    kernelMemory: ").append(toIndentedString(kernelMemory)).append("\n");
    sb.append("    cpuCfsPeriod: ").append(toIndentedString(cpuCfsPeriod)).append("\n");
    sb.append("    cpuCfsQuota: ").append(toIndentedString(cpuCfsQuota)).append("\n");
    sb.append("    cpUShares: ").append(toIndentedString(cpUShares)).append("\n");
    sb.append("    cpUSet: ").append(toIndentedString(cpUSet)).append("\n");
    sb.append("    pidsLimit: ").append(toIndentedString(pidsLimit)).append("\n");
    sb.append("    oomKillDisable: ").append(toIndentedString(oomKillDisable)).append("\n");
    sb.append("    ipv4Forwarding: ").append(toIndentedString(ipv4Forwarding)).append("\n");
    sb.append("    bridgeNfIptables: ").append(toIndentedString(bridgeNfIptables)).append("\n");
    sb.append("    bridgeNfIp6tables: ").append(toIndentedString(bridgeNfIp6tables)).append("\n");
    sb.append("    debug: ").append(toIndentedString(debug)).append("\n");
    sb.append("    nfd: ").append(toIndentedString(nfd)).append("\n");
    sb.append("    ngoroutines: ").append(toIndentedString(ngoroutines)).append("\n");
    sb.append("    systemTime: ").append(toIndentedString(systemTime)).append("\n");
    sb.append("    loggingDriver: ").append(toIndentedString(loggingDriver)).append("\n");
    sb.append("    cgroupDriver: ").append(toIndentedString(cgroupDriver)).append("\n");
    sb.append("    cgroupVersion: ").append(toIndentedString(cgroupVersion)).append("\n");
    sb.append("    neventsListener: ").append(toIndentedString(neventsListener)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    operatingSystem: ").append(toIndentedString(operatingSystem)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    NCPU: ").append(toIndentedString(NCPU)).append("\n");
    sb.append("    memTotal: ").append(toIndentedString(memTotal)).append("\n");
    sb.append("    indexServerAddress: ").append(toIndentedString(indexServerAddress)).append("\n");
    sb.append("    registryConfig: ").append(toIndentedString(registryConfig)).append("\n");
    sb.append("    genericResources: ").append(toIndentedString(genericResources)).append("\n");
    sb.append("    httpProxy: ").append(toIndentedString(httpProxy)).append("\n");
    sb.append("    httpsProxy: ").append(toIndentedString(httpsProxy)).append("\n");
    sb.append("    noProxy: ").append(toIndentedString(noProxy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    experimentalBuild: ").append(toIndentedString(experimentalBuild)).append("\n");
    sb.append("    serverVersion: ").append(toIndentedString(serverVersion)).append("\n");
    sb.append("    clusterStore: ").append(toIndentedString(clusterStore)).append("\n");
    sb.append("    clusterAdvertise: ").append(toIndentedString(clusterAdvertise)).append("\n");
    sb.append("    runtimes: ").append(toIndentedString(runtimes)).append("\n");
    sb.append("    defaultRuntime: ").append(toIndentedString(defaultRuntime)).append("\n");
    sb.append("    swarm: ").append(toIndentedString(swarm)).append("\n");
    sb.append("    liveRestoreEnabled: ").append(toIndentedString(liveRestoreEnabled)).append("\n");
    sb.append("    isolation: ").append(toIndentedString(isolation)).append("\n");
    sb.append("    initBinary: ").append(toIndentedString(initBinary)).append("\n");
    sb.append("    containerdCommit: ").append(toIndentedString(containerdCommit)).append("\n");
    sb.append("    runcCommit: ").append(toIndentedString(runcCommit)).append("\n");
    sb.append("    initCommit: ").append(toIndentedString(initCommit)).append("\n");
    sb.append("    securityOptions: ").append(toIndentedString(securityOptions)).append("\n");
    sb.append("    productLicense: ").append(toIndentedString(productLicense)).append("\n");
    sb.append("    defaultAddressPools: ").append(toIndentedString(defaultAddressPools)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

