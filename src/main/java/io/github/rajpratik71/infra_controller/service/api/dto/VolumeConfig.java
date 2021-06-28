package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Volume configuration
 */
@ApiModel(description = "Volume configuration")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class VolumeConfig   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Driver")
  private String driver = "local";

  @JsonProperty("DriverOpts")
  @Valid
  private Map<String, String> driverOpts = null;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  public VolumeConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The new volume's name. If not specified, Docker generates a name. 
   * @return name
  */
  @ApiModelProperty(value = "The new volume's name. If not specified, Docker generates a name. ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public VolumeConfig driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the volume driver to use.
   * @return driver
  */
  @ApiModelProperty(value = "Name of the volume driver to use.")


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public VolumeConfig driverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
    return this;
  }

  public VolumeConfig putDriverOptsItem(String key, String driverOptsItem) {
    if (this.driverOpts == null) {
      this.driverOpts = new HashMap<>();
    }
    this.driverOpts.put(key, driverOptsItem);
    return this;
  }

  /**
   * A mapping of driver options and values. These options are passed directly to the driver and are driver specific. 
   * @return driverOpts
  */
  @ApiModelProperty(value = "A mapping of driver options and values. These options are passed directly to the driver and are driver specific. ")


  public Map<String, String> getDriverOpts() {
    return driverOpts;
  }

  public void setDriverOpts(Map<String, String> driverOpts) {
    this.driverOpts = driverOpts;
  }

  public VolumeConfig labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public VolumeConfig putLabelsItem(String key, String labelsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeConfig volumeConfig = (VolumeConfig) o;
    return Objects.equals(this.name, volumeConfig.name) &&
        Objects.equals(this.driver, volumeConfig.driver) &&
        Objects.equals(this.driverOpts, volumeConfig.driverOpts) &&
        Objects.equals(this.labels, volumeConfig.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, driver, driverOpts, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeConfig {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    driverOpts: ").append(toIndentedString(driverOpts)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

