package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * A request for devices to be sent to device drivers
 */
@ApiModel(description = "A request for devices to be sent to device drivers")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class DeviceRequest   {
  @JsonProperty("Driver")
  private String driver;

  @JsonProperty("Count")
  private Integer count;

  @JsonProperty("DeviceIDs")
  @Valid
  private List<String> deviceIDs = null;

  @JsonProperty("Capabilities")
  @Valid
  private List<List<String>> capabilities = null;

  @JsonProperty("Options")
  @Valid
  private Map<String, String> options = null;

  public DeviceRequest driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  @ApiModelProperty(example = "nvidia", value = "")


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public DeviceRequest count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * Get count
   * @return count
  */
  @ApiModelProperty(example = "-1", value = "")


  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public DeviceRequest deviceIDs(List<String> deviceIDs) {
    this.deviceIDs = deviceIDs;
    return this;
  }

  public DeviceRequest addDeviceIDsItem(String deviceIDsItem) {
    if (this.deviceIDs == null) {
      this.deviceIDs = new ArrayList<>();
    }
    this.deviceIDs.add(deviceIDsItem);
    return this;
  }

  /**
   * Get deviceIDs
   * @return deviceIDs
  */
  @ApiModelProperty(example = "[0, 1, GPU-fef8089b-4820-abfc-e83e-94318197576e]", value = "")


  public List<String> getDeviceIDs() {
    return deviceIDs;
  }

  public void setDeviceIDs(List<String> deviceIDs) {
    this.deviceIDs = deviceIDs;
  }

  public DeviceRequest capabilities(List<List<String>> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public DeviceRequest addCapabilitiesItem(List<String> capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * A list of capabilities; an OR list of AND lists of capabilities. 
   * @return capabilities
  */
  @ApiModelProperty(example = "[[gpu, nvidia, compute]]", value = "A list of capabilities; an OR list of AND lists of capabilities. ")

  @Valid

  public List<List<String>> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<List<String>> capabilities) {
    this.capabilities = capabilities;
  }

  public DeviceRequest options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public DeviceRequest putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Driver-specific options, specified as a key/value pairs. These options are passed directly to the driver. 
   * @return options
  */
  @ApiModelProperty(value = "Driver-specific options, specified as a key/value pairs. These options are passed directly to the driver. ")


  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
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
    DeviceRequest deviceRequest = (DeviceRequest) o;
    return Objects.equals(this.driver, deviceRequest.driver) &&
        Objects.equals(this.count, deviceRequest.count) &&
        Objects.equals(this.deviceIDs, deviceRequest.deviceIDs) &&
        Objects.equals(this.capabilities, deviceRequest.capabilities) &&
        Objects.equals(this.options, deviceRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, count, deviceIDs, capabilities, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceRequest {\n");
    
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    deviceIDs: ").append(toIndentedString(deviceIDs)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
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

