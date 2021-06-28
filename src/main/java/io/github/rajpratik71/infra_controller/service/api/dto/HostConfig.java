package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.DeviceMapping;
import io.github.rajpratik71.infra_controller.service.api.dto.DeviceRequest;
import io.github.rajpratik71.infra_controller.service.api.dto.HostConfigAllOf;
import io.github.rajpratik71.infra_controller.service.api.dto.HostConfigAllOfLogConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.Mount;
import io.github.rajpratik71.infra_controller.service.api.dto.PortBinding;
import io.github.rajpratik71.infra_controller.service.api.dto.Resources;
import io.github.rajpratik71.infra_controller.service.api.dto.ResourcesBlkioWeightDevice;
import io.github.rajpratik71.infra_controller.service.api.dto.ResourcesUlimits;
import io.github.rajpratik71.infra_controller.service.api.dto.RestartPolicy;
import io.github.rajpratik71.infra_controller.service.api.dto.ThrottleDevice;
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
 * Container configuration that depends on the host we are running on
 */
@ApiModel(description = "Container configuration that depends on the host we are running on")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class HostConfig   {
  @JsonProperty("CpuShares")
  private Integer cpuShares;

  @JsonProperty("Memory")
  private Long memory = 0l;

  @JsonProperty("CgroupParent")
  private String cgroupParent;

  @JsonProperty("BlkioWeight")
  private Integer blkioWeight;

  @JsonProperty("BlkioWeightDevice")
  @Valid
  private List<ResourcesBlkioWeightDevice> blkioWeightDevice = null;

  @JsonProperty("BlkioDeviceReadBps")
  @Valid
  private List<ThrottleDevice> blkioDeviceReadBps = null;

  @JsonProperty("BlkioDeviceWriteBps")
  @Valid
  private List<ThrottleDevice> blkioDeviceWriteBps = null;

  @JsonProperty("BlkioDeviceReadIOps")
  @Valid
  private List<ThrottleDevice> blkioDeviceReadIOps = null;

  @JsonProperty("BlkioDeviceWriteIOps")
  @Valid
  private List<ThrottleDevice> blkioDeviceWriteIOps = null;

  @JsonProperty("CpuPeriod")
  private Long cpuPeriod;

  @JsonProperty("CpuQuota")
  private Long cpuQuota;

  @JsonProperty("CpuRealtimePeriod")
  private Long cpuRealtimePeriod;

  @JsonProperty("CpuRealtimeRuntime")
  private Long cpuRealtimeRuntime;

  @JsonProperty("CpusetCpus")
  private String cpusetCpus;

  @JsonProperty("CpusetMems")
  private String cpusetMems;

  @JsonProperty("Devices")
  @Valid
  private List<DeviceMapping> devices = null;

  @JsonProperty("DeviceCgroupRules")
  @Valid
  private List<String> deviceCgroupRules = null;

  @JsonProperty("DeviceRequests")
  @Valid
  private List<DeviceRequest> deviceRequests = null;

  @JsonProperty("KernelMemory")
  private Long kernelMemory;

  @JsonProperty("KernelMemoryTCP")
  private Long kernelMemoryTCP;

  @JsonProperty("MemoryReservation")
  private Long memoryReservation;

  @JsonProperty("MemorySwap")
  private Long memorySwap;

  @JsonProperty("MemorySwappiness")
  private Long memorySwappiness;

  @JsonProperty("NanoCpus")
  private Long nanoCpus;

  @JsonProperty("OomKillDisable")
  private Boolean oomKillDisable;

  @JsonProperty("Init")
  private JsonNullable<Boolean> init = JsonNullable.undefined();

  @JsonProperty("PidsLimit")
  private JsonNullable<Long> pidsLimit = JsonNullable.undefined();

  @JsonProperty("Ulimits")
  @Valid
  private List<ResourcesUlimits> ulimits = null;

  @JsonProperty("CpuCount")
  private Long cpuCount;

  @JsonProperty("CpuPercent")
  private Long cpuPercent;

  @JsonProperty("IOMaximumIOps")
  private Long ioMaximumIOps;

  @JsonProperty("IOMaximumBandwidth")
  private Long ioMaximumBandwidth;

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

  public HostConfig cpuShares(Integer cpuShares) {
    this.cpuShares = cpuShares;
    return this;
  }

  /**
   * An integer value representing this container's relative CPU weight versus other containers. 
   * @return cpuShares
  */
  @ApiModelProperty(value = "An integer value representing this container's relative CPU weight versus other containers. ")


  public Integer getCpuShares() {
    return cpuShares;
  }

  public void setCpuShares(Integer cpuShares) {
    this.cpuShares = cpuShares;
  }

  public HostConfig memory(Long memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Memory limit in bytes.
   * @return memory
  */
  @ApiModelProperty(value = "Memory limit in bytes.")


  public Long getMemory() {
    return memory;
  }

  public void setMemory(Long memory) {
    this.memory = memory;
  }

  public HostConfig cgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
    return this;
  }

  /**
   * Path to `cgroups` under which the container's `cgroup` is created. If the path is not absolute, the path is considered to be relative to the `cgroups` path of the init process. Cgroups are created if they do not already exist. 
   * @return cgroupParent
  */
  @ApiModelProperty(value = "Path to `cgroups` under which the container's `cgroup` is created. If the path is not absolute, the path is considered to be relative to the `cgroups` path of the init process. Cgroups are created if they do not already exist. ")


  public String getCgroupParent() {
    return cgroupParent;
  }

  public void setCgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
  }

  public HostConfig blkioWeight(Integer blkioWeight) {
    this.blkioWeight = blkioWeight;
    return this;
  }

  /**
   * Block IO weight (relative weight).
   * minimum: 0
   * maximum: 1000
   * @return blkioWeight
  */
  @ApiModelProperty(value = "Block IO weight (relative weight).")

@Min(0) @Max(1000) 
  public Integer getBlkioWeight() {
    return blkioWeight;
  }

  public void setBlkioWeight(Integer blkioWeight) {
    this.blkioWeight = blkioWeight;
  }

  public HostConfig blkioWeightDevice(List<ResourcesBlkioWeightDevice> blkioWeightDevice) {
    this.blkioWeightDevice = blkioWeightDevice;
    return this;
  }

  public HostConfig addBlkioWeightDeviceItem(ResourcesBlkioWeightDevice blkioWeightDeviceItem) {
    if (this.blkioWeightDevice == null) {
      this.blkioWeightDevice = new ArrayList<>();
    }
    this.blkioWeightDevice.add(blkioWeightDeviceItem);
    return this;
  }

  /**
   * Block IO weight (relative device weight) in the form:  ``` [{\"Path\": \"device_path\", \"Weight\": weight}] ``` 
   * @return blkioWeightDevice
  */
  @ApiModelProperty(value = "Block IO weight (relative device weight) in the form:  ``` [{\"Path\": \"device_path\", \"Weight\": weight}] ``` ")

  @Valid

  public List<ResourcesBlkioWeightDevice> getBlkioWeightDevice() {
    return blkioWeightDevice;
  }

  public void setBlkioWeightDevice(List<ResourcesBlkioWeightDevice> blkioWeightDevice) {
    this.blkioWeightDevice = blkioWeightDevice;
  }

  public HostConfig blkioDeviceReadBps(List<ThrottleDevice> blkioDeviceReadBps) {
    this.blkioDeviceReadBps = blkioDeviceReadBps;
    return this;
  }

  public HostConfig addBlkioDeviceReadBpsItem(ThrottleDevice blkioDeviceReadBpsItem) {
    if (this.blkioDeviceReadBps == null) {
      this.blkioDeviceReadBps = new ArrayList<>();
    }
    this.blkioDeviceReadBps.add(blkioDeviceReadBpsItem);
    return this;
  }

  /**
   * Limit read rate (bytes per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceReadBps
  */
  @ApiModelProperty(value = "Limit read rate (bytes per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ")

  @Valid

  public List<ThrottleDevice> getBlkioDeviceReadBps() {
    return blkioDeviceReadBps;
  }

  public void setBlkioDeviceReadBps(List<ThrottleDevice> blkioDeviceReadBps) {
    this.blkioDeviceReadBps = blkioDeviceReadBps;
  }

  public HostConfig blkioDeviceWriteBps(List<ThrottleDevice> blkioDeviceWriteBps) {
    this.blkioDeviceWriteBps = blkioDeviceWriteBps;
    return this;
  }

  public HostConfig addBlkioDeviceWriteBpsItem(ThrottleDevice blkioDeviceWriteBpsItem) {
    if (this.blkioDeviceWriteBps == null) {
      this.blkioDeviceWriteBps = new ArrayList<>();
    }
    this.blkioDeviceWriteBps.add(blkioDeviceWriteBpsItem);
    return this;
  }

  /**
   * Limit write rate (bytes per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceWriteBps
  */
  @ApiModelProperty(value = "Limit write rate (bytes per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ")

  @Valid

  public List<ThrottleDevice> getBlkioDeviceWriteBps() {
    return blkioDeviceWriteBps;
  }

  public void setBlkioDeviceWriteBps(List<ThrottleDevice> blkioDeviceWriteBps) {
    this.blkioDeviceWriteBps = blkioDeviceWriteBps;
  }

  public HostConfig blkioDeviceReadIOps(List<ThrottleDevice> blkioDeviceReadIOps) {
    this.blkioDeviceReadIOps = blkioDeviceReadIOps;
    return this;
  }

  public HostConfig addBlkioDeviceReadIOpsItem(ThrottleDevice blkioDeviceReadIOpsItem) {
    if (this.blkioDeviceReadIOps == null) {
      this.blkioDeviceReadIOps = new ArrayList<>();
    }
    this.blkioDeviceReadIOps.add(blkioDeviceReadIOpsItem);
    return this;
  }

  /**
   * Limit read rate (IO per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceReadIOps
  */
  @ApiModelProperty(value = "Limit read rate (IO per second) from a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ")

  @Valid

  public List<ThrottleDevice> getBlkioDeviceReadIOps() {
    return blkioDeviceReadIOps;
  }

  public void setBlkioDeviceReadIOps(List<ThrottleDevice> blkioDeviceReadIOps) {
    this.blkioDeviceReadIOps = blkioDeviceReadIOps;
  }

  public HostConfig blkioDeviceWriteIOps(List<ThrottleDevice> blkioDeviceWriteIOps) {
    this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
    return this;
  }

  public HostConfig addBlkioDeviceWriteIOpsItem(ThrottleDevice blkioDeviceWriteIOpsItem) {
    if (this.blkioDeviceWriteIOps == null) {
      this.blkioDeviceWriteIOps = new ArrayList<>();
    }
    this.blkioDeviceWriteIOps.add(blkioDeviceWriteIOpsItem);
    return this;
  }

  /**
   * Limit write rate (IO per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` 
   * @return blkioDeviceWriteIOps
  */
  @ApiModelProperty(value = "Limit write rate (IO per second) to a device, in the form:  ``` [{\"Path\": \"device_path\", \"Rate\": rate}] ``` ")

  @Valid

  public List<ThrottleDevice> getBlkioDeviceWriteIOps() {
    return blkioDeviceWriteIOps;
  }

  public void setBlkioDeviceWriteIOps(List<ThrottleDevice> blkioDeviceWriteIOps) {
    this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
  }

  public HostConfig cpuPeriod(Long cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
    return this;
  }

  /**
   * The length of a CPU period in microseconds.
   * @return cpuPeriod
  */
  @ApiModelProperty(value = "The length of a CPU period in microseconds.")


  public Long getCpuPeriod() {
    return cpuPeriod;
  }

  public void setCpuPeriod(Long cpuPeriod) {
    this.cpuPeriod = cpuPeriod;
  }

  public HostConfig cpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
    return this;
  }

  /**
   * Microseconds of CPU time that the container can get in a CPU period. 
   * @return cpuQuota
  */
  @ApiModelProperty(value = "Microseconds of CPU time that the container can get in a CPU period. ")


  public Long getCpuQuota() {
    return cpuQuota;
  }

  public void setCpuQuota(Long cpuQuota) {
    this.cpuQuota = cpuQuota;
  }

  public HostConfig cpuRealtimePeriod(Long cpuRealtimePeriod) {
    this.cpuRealtimePeriod = cpuRealtimePeriod;
    return this;
  }

  /**
   * The length of a CPU real-time period in microseconds. Set to 0 to allocate no time allocated to real-time tasks. 
   * @return cpuRealtimePeriod
  */
  @ApiModelProperty(value = "The length of a CPU real-time period in microseconds. Set to 0 to allocate no time allocated to real-time tasks. ")


  public Long getCpuRealtimePeriod() {
    return cpuRealtimePeriod;
  }

  public void setCpuRealtimePeriod(Long cpuRealtimePeriod) {
    this.cpuRealtimePeriod = cpuRealtimePeriod;
  }

  public HostConfig cpuRealtimeRuntime(Long cpuRealtimeRuntime) {
    this.cpuRealtimeRuntime = cpuRealtimeRuntime;
    return this;
  }

  /**
   * The length of a CPU real-time runtime in microseconds. Set to 0 to allocate no time allocated to real-time tasks. 
   * @return cpuRealtimeRuntime
  */
  @ApiModelProperty(value = "The length of a CPU real-time runtime in microseconds. Set to 0 to allocate no time allocated to real-time tasks. ")


  public Long getCpuRealtimeRuntime() {
    return cpuRealtimeRuntime;
  }

  public void setCpuRealtimeRuntime(Long cpuRealtimeRuntime) {
    this.cpuRealtimeRuntime = cpuRealtimeRuntime;
  }

  public HostConfig cpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
    return this;
  }

  /**
   * CPUs in which to allow execution (e.g., `0-3`, `0,1`). 
   * @return cpusetCpus
  */
  @ApiModelProperty(example = "0-3", value = "CPUs in which to allow execution (e.g., `0-3`, `0,1`). ")


  public String getCpusetCpus() {
    return cpusetCpus;
  }

  public void setCpusetCpus(String cpusetCpus) {
    this.cpusetCpus = cpusetCpus;
  }

  public HostConfig cpusetMems(String cpusetMems) {
    this.cpusetMems = cpusetMems;
    return this;
  }

  /**
   * Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems. 
   * @return cpusetMems
  */
  @ApiModelProperty(value = "Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems. ")


  public String getCpusetMems() {
    return cpusetMems;
  }

  public void setCpusetMems(String cpusetMems) {
    this.cpusetMems = cpusetMems;
  }

  public HostConfig devices(List<DeviceMapping> devices) {
    this.devices = devices;
    return this;
  }

  public HostConfig addDevicesItem(DeviceMapping devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * A list of devices to add to the container.
   * @return devices
  */
  @ApiModelProperty(value = "A list of devices to add to the container.")

  @Valid

  public List<DeviceMapping> getDevices() {
    return devices;
  }

  public void setDevices(List<DeviceMapping> devices) {
    this.devices = devices;
  }

  public HostConfig deviceCgroupRules(List<String> deviceCgroupRules) {
    this.deviceCgroupRules = deviceCgroupRules;
    return this;
  }

  public HostConfig addDeviceCgroupRulesItem(String deviceCgroupRulesItem) {
    if (this.deviceCgroupRules == null) {
      this.deviceCgroupRules = new ArrayList<>();
    }
    this.deviceCgroupRules.add(deviceCgroupRulesItem);
    return this;
  }

  /**
   * a list of cgroup rules to apply to the container
   * @return deviceCgroupRules
  */
  @ApiModelProperty(value = "a list of cgroup rules to apply to the container")


  public List<String> getDeviceCgroupRules() {
    return deviceCgroupRules;
  }

  public void setDeviceCgroupRules(List<String> deviceCgroupRules) {
    this.deviceCgroupRules = deviceCgroupRules;
  }

  public HostConfig deviceRequests(List<DeviceRequest> deviceRequests) {
    this.deviceRequests = deviceRequests;
    return this;
  }

  public HostConfig addDeviceRequestsItem(DeviceRequest deviceRequestsItem) {
    if (this.deviceRequests == null) {
      this.deviceRequests = new ArrayList<>();
    }
    this.deviceRequests.add(deviceRequestsItem);
    return this;
  }

  /**
   * A list of requests for devices to be sent to device drivers. 
   * @return deviceRequests
  */
  @ApiModelProperty(value = "A list of requests for devices to be sent to device drivers. ")

  @Valid

  public List<DeviceRequest> getDeviceRequests() {
    return deviceRequests;
  }

  public void setDeviceRequests(List<DeviceRequest> deviceRequests) {
    this.deviceRequests = deviceRequests;
  }

  public HostConfig kernelMemory(Long kernelMemory) {
    this.kernelMemory = kernelMemory;
    return this;
  }

  /**
   * Kernel memory limit in bytes.  <p><br /></p>  > **Deprecated**: This field is deprecated as the kernel 5.4 deprecated > `kmem.limit_in_bytes`. 
   * @return kernelMemory
  */
  @ApiModelProperty(example = "209715200", value = "Kernel memory limit in bytes.  <p><br /></p>  > **Deprecated**: This field is deprecated as the kernel 5.4 deprecated > `kmem.limit_in_bytes`. ")


  public Long getKernelMemory() {
    return kernelMemory;
  }

  public void setKernelMemory(Long kernelMemory) {
    this.kernelMemory = kernelMemory;
  }

  public HostConfig kernelMemoryTCP(Long kernelMemoryTCP) {
    this.kernelMemoryTCP = kernelMemoryTCP;
    return this;
  }

  /**
   * Hard limit for kernel TCP buffer memory (in bytes).
   * @return kernelMemoryTCP
  */
  @ApiModelProperty(value = "Hard limit for kernel TCP buffer memory (in bytes).")


  public Long getKernelMemoryTCP() {
    return kernelMemoryTCP;
  }

  public void setKernelMemoryTCP(Long kernelMemoryTCP) {
    this.kernelMemoryTCP = kernelMemoryTCP;
  }

  public HostConfig memoryReservation(Long memoryReservation) {
    this.memoryReservation = memoryReservation;
    return this;
  }

  /**
   * Memory soft limit in bytes.
   * @return memoryReservation
  */
  @ApiModelProperty(value = "Memory soft limit in bytes.")


  public Long getMemoryReservation() {
    return memoryReservation;
  }

  public void setMemoryReservation(Long memoryReservation) {
    this.memoryReservation = memoryReservation;
  }

  public HostConfig memorySwap(Long memorySwap) {
    this.memorySwap = memorySwap;
    return this;
  }

  /**
   * Total memory limit (memory + swap). Set as `-1` to enable unlimited swap. 
   * @return memorySwap
  */
  @ApiModelProperty(value = "Total memory limit (memory + swap). Set as `-1` to enable unlimited swap. ")


  public Long getMemorySwap() {
    return memorySwap;
  }

  public void setMemorySwap(Long memorySwap) {
    this.memorySwap = memorySwap;
  }

  public HostConfig memorySwappiness(Long memorySwappiness) {
    this.memorySwappiness = memorySwappiness;
    return this;
  }

  /**
   * Tune a container's memory swappiness behavior. Accepts an integer between 0 and 100. 
   * minimum: 0
   * maximum: 100
   * @return memorySwappiness
  */
  @ApiModelProperty(value = "Tune a container's memory swappiness behavior. Accepts an integer between 0 and 100. ")

@Min(0L) @Max(100L) 
  public Long getMemorySwappiness() {
    return memorySwappiness;
  }

  public void setMemorySwappiness(Long memorySwappiness) {
    this.memorySwappiness = memorySwappiness;
  }

  public HostConfig nanoCpus(Long nanoCpus) {
    this.nanoCpus = nanoCpus;
    return this;
  }

  /**
   * CPU quota in units of 10<sup>-9</sup> CPUs.
   * @return nanoCpus
  */
  @ApiModelProperty(value = "CPU quota in units of 10<sup>-9</sup> CPUs.")


  public Long getNanoCpus() {
    return nanoCpus;
  }

  public void setNanoCpus(Long nanoCpus) {
    this.nanoCpus = nanoCpus;
  }

  public HostConfig oomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
    return this;
  }

  /**
   * Disable OOM Killer for the container.
   * @return oomKillDisable
  */
  @ApiModelProperty(value = "Disable OOM Killer for the container.")


  public Boolean getOomKillDisable() {
    return oomKillDisable;
  }

  public void setOomKillDisable(Boolean oomKillDisable) {
    this.oomKillDisable = oomKillDisable;
  }

  public HostConfig init(Boolean init) {
    this.init = JsonNullable.of(init);
    return this;
  }

  /**
   * Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used. 
   * @return init
  */
  @ApiModelProperty(value = "Run an init inside the container that forwards signals and reaps processes. This field is omitted if empty, and the default (as configured on the daemon) is used. ")


  public JsonNullable<Boolean> getInit() {
    return init;
  }

  public void setInit(JsonNullable<Boolean> init) {
    this.init = init;
  }

  public HostConfig pidsLimit(Long pidsLimit) {
    this.pidsLimit = JsonNullable.of(pidsLimit);
    return this;
  }

  /**
   * Tune a container's PIDs limit. Set `0` or `-1` for unlimited, or `null` to not change. 
   * @return pidsLimit
  */
  @ApiModelProperty(value = "Tune a container's PIDs limit. Set `0` or `-1` for unlimited, or `null` to not change. ")


  public JsonNullable<Long> getPidsLimit() {
    return pidsLimit;
  }

  public void setPidsLimit(JsonNullable<Long> pidsLimit) {
    this.pidsLimit = pidsLimit;
  }

  public HostConfig ulimits(List<ResourcesUlimits> ulimits) {
    this.ulimits = ulimits;
    return this;
  }

  public HostConfig addUlimitsItem(ResourcesUlimits ulimitsItem) {
    if (this.ulimits == null) {
      this.ulimits = new ArrayList<>();
    }
    this.ulimits.add(ulimitsItem);
    return this;
  }

  /**
   * A list of resource limits to set in the container. For example:  ``` {\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048} ``` 
   * @return ulimits
  */
  @ApiModelProperty(value = "A list of resource limits to set in the container. For example:  ``` {\"Name\": \"nofile\", \"Soft\": 1024, \"Hard\": 2048} ``` ")

  @Valid

  public List<ResourcesUlimits> getUlimits() {
    return ulimits;
  }

  public void setUlimits(List<ResourcesUlimits> ulimits) {
    this.ulimits = ulimits;
  }

  public HostConfig cpuCount(Long cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * The number of usable CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. 
   * @return cpuCount
  */
  @ApiModelProperty(value = "The number of usable CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. ")


  public Long getCpuCount() {
    return cpuCount;
  }

  public void setCpuCount(Long cpuCount) {
    this.cpuCount = cpuCount;
  }

  public HostConfig cpuPercent(Long cpuPercent) {
    this.cpuPercent = cpuPercent;
    return this;
  }

  /**
   * The usable percentage of the available CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. 
   * @return cpuPercent
  */
  @ApiModelProperty(value = "The usable percentage of the available CPUs (Windows only).  On Windows Server containers, the processor resource controls are mutually exclusive. The order of precedence is `CPUCount` first, then `CPUShares`, and `CPUPercent` last. ")


  public Long getCpuPercent() {
    return cpuPercent;
  }

  public void setCpuPercent(Long cpuPercent) {
    this.cpuPercent = cpuPercent;
  }

  public HostConfig ioMaximumIOps(Long ioMaximumIOps) {
    this.ioMaximumIOps = ioMaximumIOps;
    return this;
  }

  /**
   * Maximum IOps for the container system drive (Windows only)
   * @return ioMaximumIOps
  */
  @ApiModelProperty(value = "Maximum IOps for the container system drive (Windows only)")


  public Long getIoMaximumIOps() {
    return ioMaximumIOps;
  }

  public void setIoMaximumIOps(Long ioMaximumIOps) {
    this.ioMaximumIOps = ioMaximumIOps;
  }

  public HostConfig ioMaximumBandwidth(Long ioMaximumBandwidth) {
    this.ioMaximumBandwidth = ioMaximumBandwidth;
    return this;
  }

  /**
   * Maximum IO in bytes per second for the container system drive (Windows only). 
   * @return ioMaximumBandwidth
  */
  @ApiModelProperty(value = "Maximum IO in bytes per second for the container system drive (Windows only). ")


  public Long getIoMaximumBandwidth() {
    return ioMaximumBandwidth;
  }

  public void setIoMaximumBandwidth(Long ioMaximumBandwidth) {
    this.ioMaximumBandwidth = ioMaximumBandwidth;
  }

  public HostConfig binds(List<String> binds) {
    this.binds = binds;
    return this;
  }

  public HostConfig addBindsItem(String bindsItem) {
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

  public HostConfig containerIDFile(String containerIDFile) {
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

  public HostConfig logConfig(HostConfigAllOfLogConfig logConfig) {
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

  public HostConfig networkMode(String networkMode) {
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

  public HostConfig portBindings(Map<String, List<PortBinding>> portBindings) {
    this.portBindings = portBindings;
    return this;
  }

  public HostConfig putPortBindingsItem(String key, List<PortBinding> portBindingsItem) {
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

  public HostConfig restartPolicy(RestartPolicy restartPolicy) {
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

  public HostConfig autoRemove(Boolean autoRemove) {
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

  public HostConfig volumeDriver(String volumeDriver) {
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

  public HostConfig volumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
    return this;
  }

  public HostConfig addVolumesFromItem(String volumesFromItem) {
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

  public HostConfig mounts(List<Mount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public HostConfig addMountsItem(Mount mountsItem) {
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

  public HostConfig capAdd(List<String> capAdd) {
    this.capAdd = capAdd;
    return this;
  }

  public HostConfig addCapAddItem(String capAddItem) {
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

  public HostConfig capDrop(List<String> capDrop) {
    this.capDrop = capDrop;
    return this;
  }

  public HostConfig addCapDropItem(String capDropItem) {
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

  public HostConfig cgroupnsMode(CgroupnsModeEnum cgroupnsMode) {
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

  public HostConfig dns(List<String> dns) {
    this.dns = dns;
    return this;
  }

  public HostConfig addDnsItem(String dnsItem) {
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

  public HostConfig dnsOptions(List<String> dnsOptions) {
    this.dnsOptions = dnsOptions;
    return this;
  }

  public HostConfig addDnsOptionsItem(String dnsOptionsItem) {
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

  public HostConfig dnsSearch(List<String> dnsSearch) {
    this.dnsSearch = dnsSearch;
    return this;
  }

  public HostConfig addDnsSearchItem(String dnsSearchItem) {
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

  public HostConfig extraHosts(List<String> extraHosts) {
    this.extraHosts = extraHosts;
    return this;
  }

  public HostConfig addExtraHostsItem(String extraHostsItem) {
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

  public HostConfig groupAdd(List<String> groupAdd) {
    this.groupAdd = groupAdd;
    return this;
  }

  public HostConfig addGroupAddItem(String groupAddItem) {
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

  public HostConfig ipcMode(String ipcMode) {
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

  public HostConfig cgroup(String cgroup) {
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

  public HostConfig links(List<String> links) {
    this.links = links;
    return this;
  }

  public HostConfig addLinksItem(String linksItem) {
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

  public HostConfig oomScoreAdj(Integer oomScoreAdj) {
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

  public HostConfig pidMode(String pidMode) {
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

  public HostConfig privileged(Boolean privileged) {
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

  public HostConfig publishAllPorts(Boolean publishAllPorts) {
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

  public HostConfig readonlyRootfs(Boolean readonlyRootfs) {
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

  public HostConfig securityOpt(List<String> securityOpt) {
    this.securityOpt = securityOpt;
    return this;
  }

  public HostConfig addSecurityOptItem(String securityOptItem) {
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

  public HostConfig storageOpt(Map<String, String> storageOpt) {
    this.storageOpt = storageOpt;
    return this;
  }

  public HostConfig putStorageOptItem(String key, String storageOptItem) {
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

  public HostConfig tmpfs(Map<String, String> tmpfs) {
    this.tmpfs = tmpfs;
    return this;
  }

  public HostConfig putTmpfsItem(String key, String tmpfsItem) {
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

  public HostConfig utSMode(String utSMode) {
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

  public HostConfig usernsMode(String usernsMode) {
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

  public HostConfig shmSize(Integer shmSize) {
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

  public HostConfig sysctls(Map<String, String> sysctls) {
    this.sysctls = sysctls;
    return this;
  }

  public HostConfig putSysctlsItem(String key, String sysctlsItem) {
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

  public HostConfig runtime(String runtime) {
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

  public HostConfig consoleSize(List<Integer> consoleSize) {
    this.consoleSize = consoleSize;
    return this;
  }

  public HostConfig addConsoleSizeItem(Integer consoleSizeItem) {
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

  public HostConfig isolation(IsolationEnum isolation) {
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

  public HostConfig maskedPaths(List<String> maskedPaths) {
    this.maskedPaths = maskedPaths;
    return this;
  }

  public HostConfig addMaskedPathsItem(String maskedPathsItem) {
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

  public HostConfig readonlyPaths(List<String> readonlyPaths) {
    this.readonlyPaths = readonlyPaths;
    return this;
  }

  public HostConfig addReadonlyPathsItem(String readonlyPathsItem) {
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
    HostConfig hostConfig = (HostConfig) o;
    return Objects.equals(this.cpuShares, hostConfig.cpuShares) &&
        Objects.equals(this.memory, hostConfig.memory) &&
        Objects.equals(this.cgroupParent, hostConfig.cgroupParent) &&
        Objects.equals(this.blkioWeight, hostConfig.blkioWeight) &&
        Objects.equals(this.blkioWeightDevice, hostConfig.blkioWeightDevice) &&
        Objects.equals(this.blkioDeviceReadBps, hostConfig.blkioDeviceReadBps) &&
        Objects.equals(this.blkioDeviceWriteBps, hostConfig.blkioDeviceWriteBps) &&
        Objects.equals(this.blkioDeviceReadIOps, hostConfig.blkioDeviceReadIOps) &&
        Objects.equals(this.blkioDeviceWriteIOps, hostConfig.blkioDeviceWriteIOps) &&
        Objects.equals(this.cpuPeriod, hostConfig.cpuPeriod) &&
        Objects.equals(this.cpuQuota, hostConfig.cpuQuota) &&
        Objects.equals(this.cpuRealtimePeriod, hostConfig.cpuRealtimePeriod) &&
        Objects.equals(this.cpuRealtimeRuntime, hostConfig.cpuRealtimeRuntime) &&
        Objects.equals(this.cpusetCpus, hostConfig.cpusetCpus) &&
        Objects.equals(this.cpusetMems, hostConfig.cpusetMems) &&
        Objects.equals(this.devices, hostConfig.devices) &&
        Objects.equals(this.deviceCgroupRules, hostConfig.deviceCgroupRules) &&
        Objects.equals(this.deviceRequests, hostConfig.deviceRequests) &&
        Objects.equals(this.kernelMemory, hostConfig.kernelMemory) &&
        Objects.equals(this.kernelMemoryTCP, hostConfig.kernelMemoryTCP) &&
        Objects.equals(this.memoryReservation, hostConfig.memoryReservation) &&
        Objects.equals(this.memorySwap, hostConfig.memorySwap) &&
        Objects.equals(this.memorySwappiness, hostConfig.memorySwappiness) &&
        Objects.equals(this.nanoCpus, hostConfig.nanoCpus) &&
        Objects.equals(this.oomKillDisable, hostConfig.oomKillDisable) &&
        Objects.equals(this.init, hostConfig.init) &&
        Objects.equals(this.pidsLimit, hostConfig.pidsLimit) &&
        Objects.equals(this.ulimits, hostConfig.ulimits) &&
        Objects.equals(this.cpuCount, hostConfig.cpuCount) &&
        Objects.equals(this.cpuPercent, hostConfig.cpuPercent) &&
        Objects.equals(this.ioMaximumIOps, hostConfig.ioMaximumIOps) &&
        Objects.equals(this.ioMaximumBandwidth, hostConfig.ioMaximumBandwidth) &&
        Objects.equals(this.binds, hostConfig.binds) &&
        Objects.equals(this.containerIDFile, hostConfig.containerIDFile) &&
        Objects.equals(this.logConfig, hostConfig.logConfig) &&
        Objects.equals(this.networkMode, hostConfig.networkMode) &&
        Objects.equals(this.portBindings, hostConfig.portBindings) &&
        Objects.equals(this.restartPolicy, hostConfig.restartPolicy) &&
        Objects.equals(this.autoRemove, hostConfig.autoRemove) &&
        Objects.equals(this.volumeDriver, hostConfig.volumeDriver) &&
        Objects.equals(this.volumesFrom, hostConfig.volumesFrom) &&
        Objects.equals(this.mounts, hostConfig.mounts) &&
        Objects.equals(this.capAdd, hostConfig.capAdd) &&
        Objects.equals(this.capDrop, hostConfig.capDrop) &&
        Objects.equals(this.cgroupnsMode, hostConfig.cgroupnsMode) &&
        Objects.equals(this.dns, hostConfig.dns) &&
        Objects.equals(this.dnsOptions, hostConfig.dnsOptions) &&
        Objects.equals(this.dnsSearch, hostConfig.dnsSearch) &&
        Objects.equals(this.extraHosts, hostConfig.extraHosts) &&
        Objects.equals(this.groupAdd, hostConfig.groupAdd) &&
        Objects.equals(this.ipcMode, hostConfig.ipcMode) &&
        Objects.equals(this.cgroup, hostConfig.cgroup) &&
        Objects.equals(this.links, hostConfig.links) &&
        Objects.equals(this.oomScoreAdj, hostConfig.oomScoreAdj) &&
        Objects.equals(this.pidMode, hostConfig.pidMode) &&
        Objects.equals(this.privileged, hostConfig.privileged) &&
        Objects.equals(this.publishAllPorts, hostConfig.publishAllPorts) &&
        Objects.equals(this.readonlyRootfs, hostConfig.readonlyRootfs) &&
        Objects.equals(this.securityOpt, hostConfig.securityOpt) &&
        Objects.equals(this.storageOpt, hostConfig.storageOpt) &&
        Objects.equals(this.tmpfs, hostConfig.tmpfs) &&
        Objects.equals(this.utSMode, hostConfig.utSMode) &&
        Objects.equals(this.usernsMode, hostConfig.usernsMode) &&
        Objects.equals(this.shmSize, hostConfig.shmSize) &&
        Objects.equals(this.sysctls, hostConfig.sysctls) &&
        Objects.equals(this.runtime, hostConfig.runtime) &&
        Objects.equals(this.consoleSize, hostConfig.consoleSize) &&
        Objects.equals(this.isolation, hostConfig.isolation) &&
        Objects.equals(this.maskedPaths, hostConfig.maskedPaths) &&
        Objects.equals(this.readonlyPaths, hostConfig.readonlyPaths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuShares, memory, cgroupParent, blkioWeight, blkioWeightDevice, blkioDeviceReadBps, blkioDeviceWriteBps, blkioDeviceReadIOps, blkioDeviceWriteIOps, cpuPeriod, cpuQuota, cpuRealtimePeriod, cpuRealtimeRuntime, cpusetCpus, cpusetMems, devices, deviceCgroupRules, deviceRequests, kernelMemory, kernelMemoryTCP, memoryReservation, memorySwap, memorySwappiness, nanoCpus, oomKillDisable, init, pidsLimit, ulimits, cpuCount, cpuPercent, ioMaximumIOps, ioMaximumBandwidth, binds, containerIDFile, logConfig, networkMode, portBindings, restartPolicy, autoRemove, volumeDriver, volumesFrom, mounts, capAdd, capDrop, cgroupnsMode, dns, dnsOptions, dnsSearch, extraHosts, groupAdd, ipcMode, cgroup, links, oomScoreAdj, pidMode, privileged, publishAllPorts, readonlyRootfs, securityOpt, storageOpt, tmpfs, utSMode, usernsMode, shmSize, sysctls, runtime, consoleSize, isolation, maskedPaths, readonlyPaths);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HostConfig {\n");
    
    sb.append("    cpuShares: ").append(toIndentedString(cpuShares)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    cgroupParent: ").append(toIndentedString(cgroupParent)).append("\n");
    sb.append("    blkioWeight: ").append(toIndentedString(blkioWeight)).append("\n");
    sb.append("    blkioWeightDevice: ").append(toIndentedString(blkioWeightDevice)).append("\n");
    sb.append("    blkioDeviceReadBps: ").append(toIndentedString(blkioDeviceReadBps)).append("\n");
    sb.append("    blkioDeviceWriteBps: ").append(toIndentedString(blkioDeviceWriteBps)).append("\n");
    sb.append("    blkioDeviceReadIOps: ").append(toIndentedString(blkioDeviceReadIOps)).append("\n");
    sb.append("    blkioDeviceWriteIOps: ").append(toIndentedString(blkioDeviceWriteIOps)).append("\n");
    sb.append("    cpuPeriod: ").append(toIndentedString(cpuPeriod)).append("\n");
    sb.append("    cpuQuota: ").append(toIndentedString(cpuQuota)).append("\n");
    sb.append("    cpuRealtimePeriod: ").append(toIndentedString(cpuRealtimePeriod)).append("\n");
    sb.append("    cpuRealtimeRuntime: ").append(toIndentedString(cpuRealtimeRuntime)).append("\n");
    sb.append("    cpusetCpus: ").append(toIndentedString(cpusetCpus)).append("\n");
    sb.append("    cpusetMems: ").append(toIndentedString(cpusetMems)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    deviceCgroupRules: ").append(toIndentedString(deviceCgroupRules)).append("\n");
    sb.append("    deviceRequests: ").append(toIndentedString(deviceRequests)).append("\n");
    sb.append("    kernelMemory: ").append(toIndentedString(kernelMemory)).append("\n");
    sb.append("    kernelMemoryTCP: ").append(toIndentedString(kernelMemoryTCP)).append("\n");
    sb.append("    memoryReservation: ").append(toIndentedString(memoryReservation)).append("\n");
    sb.append("    memorySwap: ").append(toIndentedString(memorySwap)).append("\n");
    sb.append("    memorySwappiness: ").append(toIndentedString(memorySwappiness)).append("\n");
    sb.append("    nanoCpus: ").append(toIndentedString(nanoCpus)).append("\n");
    sb.append("    oomKillDisable: ").append(toIndentedString(oomKillDisable)).append("\n");
    sb.append("    init: ").append(toIndentedString(init)).append("\n");
    sb.append("    pidsLimit: ").append(toIndentedString(pidsLimit)).append("\n");
    sb.append("    ulimits: ").append(toIndentedString(ulimits)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
    sb.append("    cpuPercent: ").append(toIndentedString(cpuPercent)).append("\n");
    sb.append("    ioMaximumIOps: ").append(toIndentedString(ioMaximumIOps)).append("\n");
    sb.append("    ioMaximumBandwidth: ").append(toIndentedString(ioMaximumBandwidth)).append("\n");
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

