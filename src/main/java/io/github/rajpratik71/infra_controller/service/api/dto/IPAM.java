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
 * IPAM
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class IPAM   {
  @JsonProperty("Driver")
  private String driver = "default";

  @JsonProperty("Config")
  @Valid
  private List<Map<String, String>> config = null;

  @JsonProperty("Options")
  @Valid
  private Map<String, String> options = null;

  public IPAM driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the IPAM driver to use.
   * @return driver
  */
  @ApiModelProperty(value = "Name of the IPAM driver to use.")


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public IPAM config(List<Map<String, String>> config) {
    this.config = config;
    return this;
  }

  public IPAM addConfigItem(Map<String, String> configItem) {
    if (this.config == null) {
      this.config = new ArrayList<>();
    }
    this.config.add(configItem);
    return this;
  }

  /**
   * List of IPAM configuration options, specified as a map:  ``` {\"Subnet\": <CIDR>, \"IPRange\": <CIDR>, \"Gateway\": <IP address>, \"AuxAddress\": <device_name:IP address>} ``` 
   * @return config
  */
  @ApiModelProperty(value = "List of IPAM configuration options, specified as a map:  ``` {\"Subnet\": <CIDR>, \"IPRange\": <CIDR>, \"Gateway\": <IP address>, \"AuxAddress\": <device_name:IP address>} ``` ")

  @Valid

  public List<Map<String, String>> getConfig() {
    return config;
  }

  public void setConfig(List<Map<String, String>> config) {
    this.config = config;
  }

  public IPAM options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public IPAM putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Driver-specific options, specified as a map.
   * @return options
  */
  @ApiModelProperty(value = "Driver-specific options, specified as a map.")


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
    IPAM IPAM = (IPAM) o;
    return Objects.equals(this.driver, IPAM.driver) &&
        Objects.equals(this.config, IPAM.config) &&
        Objects.equals(this.options, IPAM.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driver, config, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAM {\n");
    
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

