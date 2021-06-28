package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.DeviceMapping;
import io.github.rajpratik71.infra_controller.service.api.dto.DeviceRequest;
import io.github.rajpratik71.infra_controller.service.api.dto.ResourcesBlkioWeightDevice;
import io.github.rajpratik71.infra_controller.service.api.dto.ResourcesUlimits;
import io.github.rajpratik71.infra_controller.service.api.dto.ThrottleDevice;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A container&#39;s resources (cgroups config, ulimits, etc)
 */
@ApiModel(description = "A container's resources (cgroups config, ulimits, etc)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Resources   {
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

  public Resources cpuShares(Integer cpuShares) {
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

  public Resources memory(Long memory) {
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

  public Resources cgroupParent(String cgroupParent) {
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

  public Resources blkioWeight(Integer blkioWeight) {
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

  public Resources blkioWeightDevice(List<ResourcesBlkioWeightDevice> blkioWeightDevice) {
    this.blkioWeightDevice = blkioWeightDevice;
    return this;
  }

  public Resources addBlkioWeightDeviceItem(ResourcesBlkioWeightDevice blkioWeightDeviceItem) {
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

  public Resources blkioDeviceReadBps(List<ThrottleDevice> blkioDeviceReadBps) {
    this.blkioDeviceReadBps = blkioDeviceReadBps;
    return this;
  }

  public Resources addBlkioDeviceReadBpsItem(ThrottleDevice blkioDeviceReadBpsItem) {
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

  public Resources blkioDeviceWriteBps(List<ThrottleDevice> blkioDeviceWriteBps) {
    this.blkioDeviceWriteBps = blkioDeviceWriteBps;
    return this;
  }

  public Resources addBlkioDeviceWriteBpsItem(ThrottleDevice blkioDeviceWriteBpsItem) {
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

  public Resources blkioDeviceReadIOps(List<ThrottleDevice> blkioDeviceReadIOps) {
    this.blkioDeviceReadIOps = blkioDeviceReadIOps;
    return this;
  }

  public Resources addBlkioDeviceReadIOpsItem(ThrottleDevice blkioDeviceReadIOpsItem) {
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

  public Resources blkioDeviceWriteIOps(List<ThrottleDevice> blkioDeviceWriteIOps) {
    this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
    return this;
  }

  public Resources addBlkioDeviceWriteIOpsItem(ThrottleDevice blkioDeviceWriteIOpsItem) {
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

  public Resources cpuPeriod(Long cpuPeriod) {
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

  public Resources cpuQuota(Long cpuQuota) {
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

  public Resources cpuRealtimePeriod(Long cpuRealtimePeriod) {
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

  public Resources cpuRealtimeRuntime(Long cpuRealtimeRuntime) {
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

  public Resources cpusetCpus(String cpusetCpus) {
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

  public Resources cpusetMems(String cpusetMems) {
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

  public Resources devices(List<DeviceMapping> devices) {
    this.devices = devices;
    return this;
  }

  public Resources addDevicesItem(DeviceMapping devicesItem) {
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

  public Resources deviceCgroupRules(List<String> deviceCgroupRules) {
    this.deviceCgroupRules = deviceCgroupRules;
    return this;
  }

  public Resources addDeviceCgroupRulesItem(String deviceCgroupRulesItem) {
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

  public Resources deviceRequests(List<DeviceRequest> deviceRequests) {
    this.deviceRequests = deviceRequests;
    return this;
  }

  public Resources addDeviceRequestsItem(DeviceRequest deviceRequestsItem) {
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

  public Resources kernelMemory(Long kernelMemory) {
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

  public Resources kernelMemoryTCP(Long kernelMemoryTCP) {
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

  public Resources memoryReservation(Long memoryReservation) {
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

  public Resources memorySwap(Long memorySwap) {
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

  public Resources memorySwappiness(Long memorySwappiness) {
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

  public Resources nanoCpus(Long nanoCpus) {
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

  public Resources oomKillDisable(Boolean oomKillDisable) {
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

  public Resources init(Boolean init) {
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

  public Resources pidsLimit(Long pidsLimit) {
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

  public Resources ulimits(List<ResourcesUlimits> ulimits) {
    this.ulimits = ulimits;
    return this;
  }

  public Resources addUlimitsItem(ResourcesUlimits ulimitsItem) {
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

  public Resources cpuCount(Long cpuCount) {
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

  public Resources cpuPercent(Long cpuPercent) {
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

  public Resources ioMaximumIOps(Long ioMaximumIOps) {
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

  public Resources ioMaximumBandwidth(Long ioMaximumBandwidth) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Resources resources = (Resources) o;
    return Objects.equals(this.cpuShares, resources.cpuShares) &&
        Objects.equals(this.memory, resources.memory) &&
        Objects.equals(this.cgroupParent, resources.cgroupParent) &&
        Objects.equals(this.blkioWeight, resources.blkioWeight) &&
        Objects.equals(this.blkioWeightDevice, resources.blkioWeightDevice) &&
        Objects.equals(this.blkioDeviceReadBps, resources.blkioDeviceReadBps) &&
        Objects.equals(this.blkioDeviceWriteBps, resources.blkioDeviceWriteBps) &&
        Objects.equals(this.blkioDeviceReadIOps, resources.blkioDeviceReadIOps) &&
        Objects.equals(this.blkioDeviceWriteIOps, resources.blkioDeviceWriteIOps) &&
        Objects.equals(this.cpuPeriod, resources.cpuPeriod) &&
        Objects.equals(this.cpuQuota, resources.cpuQuota) &&
        Objects.equals(this.cpuRealtimePeriod, resources.cpuRealtimePeriod) &&
        Objects.equals(this.cpuRealtimeRuntime, resources.cpuRealtimeRuntime) &&
        Objects.equals(this.cpusetCpus, resources.cpusetCpus) &&
        Objects.equals(this.cpusetMems, resources.cpusetMems) &&
        Objects.equals(this.devices, resources.devices) &&
        Objects.equals(this.deviceCgroupRules, resources.deviceCgroupRules) &&
        Objects.equals(this.deviceRequests, resources.deviceRequests) &&
        Objects.equals(this.kernelMemory, resources.kernelMemory) &&
        Objects.equals(this.kernelMemoryTCP, resources.kernelMemoryTCP) &&
        Objects.equals(this.memoryReservation, resources.memoryReservation) &&
        Objects.equals(this.memorySwap, resources.memorySwap) &&
        Objects.equals(this.memorySwappiness, resources.memorySwappiness) &&
        Objects.equals(this.nanoCpus, resources.nanoCpus) &&
        Objects.equals(this.oomKillDisable, resources.oomKillDisable) &&
        Objects.equals(this.init, resources.init) &&
        Objects.equals(this.pidsLimit, resources.pidsLimit) &&
        Objects.equals(this.ulimits, resources.ulimits) &&
        Objects.equals(this.cpuCount, resources.cpuCount) &&
        Objects.equals(this.cpuPercent, resources.cpuPercent) &&
        Objects.equals(this.ioMaximumIOps, resources.ioMaximumIOps) &&
        Objects.equals(this.ioMaximumBandwidth, resources.ioMaximumBandwidth);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpuShares, memory, cgroupParent, blkioWeight, blkioWeightDevice, blkioDeviceReadBps, blkioDeviceWriteBps, blkioDeviceReadIOps, blkioDeviceWriteIOps, cpuPeriod, cpuQuota, cpuRealtimePeriod, cpuRealtimeRuntime, cpusetCpus, cpusetMems, devices, deviceCgroupRules, deviceRequests, kernelMemory, kernelMemoryTCP, memoryReservation, memorySwap, memorySwappiness, nanoCpus, oomKillDisable, init, pidsLimit, ulimits, cpuCount, cpuPercent, ioMaximumIOps, ioMaximumBandwidth);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Resources {\n");
    
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

