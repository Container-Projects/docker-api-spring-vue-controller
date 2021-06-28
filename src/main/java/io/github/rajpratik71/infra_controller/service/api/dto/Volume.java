package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.VolumeUsageData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Volume
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Volume   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Driver")
  private String driver;

  @JsonProperty("Mountpoint")
  private String mountpoint;

  @JsonProperty("CreatedAt")
  private String createdAt;

  @JsonProperty("Status")
  @Valid
  private Map<String, Object> status = null;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = new HashMap<>();

  /**
   * The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level. 
   */
  public enum ScopeEnum {
    LOCAL("local"),
    
    GLOBAL("global");

    private String value;

    ScopeEnum(String value) {
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
    public static ScopeEnum fromValue(String value) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Scope")
  private ScopeEnum scope = ScopeEnum.LOCAL;

  @JsonProperty("Options")
  @Valid
  private Map<String, String> options = new HashMap<>();

  @JsonProperty("UsageData")
  private JsonNullable<VolumeUsageData> usageData = JsonNullable.undefined();

  public Volume name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the volume.
   * @return name
  */
  @ApiModelProperty(required = true, value = "Name of the volume.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Volume driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the volume driver used by the volume.
   * @return driver
  */
  @ApiModelProperty(required = true, value = "Name of the volume driver used by the volume.")
  @NotNull


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public Volume mountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
    return this;
  }

  /**
   * Mount path of the volume on the host.
   * @return mountpoint
  */
  @ApiModelProperty(required = true, value = "Mount path of the volume on the host.")
  @NotNull


  public String getMountpoint() {
    return mountpoint;
  }

  public void setMountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
  }

  public Volume createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date/Time the volume was created.
   * @return createdAt
  */
  @ApiModelProperty(value = "Date/Time the volume was created.")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Volume status(Map<String, Object> status) {
    this.status = status;
    return this;
  }

  public Volume putStatusItem(String key, Object statusItem) {
    if (this.status == null) {
      this.status = new HashMap<>();
    }
    this.status.put(key, statusItem);
    return this;
  }

  /**
   * Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: `{\"key\":\"value\",\"key2\":\"value2\"}`.  The `Status` field is optional, and is omitted if the volume driver does not support this feature. 
   * @return status
  */
  @ApiModelProperty(value = "Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: `{\"key\":\"value\",\"key2\":\"value2\"}`.  The `Status` field is optional, and is omitted if the volume driver does not support this feature. ")


  public Map<String, Object> getStatus() {
    return status;
  }

  public void setStatus(Map<String, Object> status) {
    this.status = status;
  }

  public Volume labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Volume putLabelsItem(String key, String labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  @ApiModelProperty(required = true, value = "User-defined key/value metadata.")
  @NotNull


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public Volume scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level. 
   * @return scope
  */
  @ApiModelProperty(required = true, value = "The level at which the volume exists. Either `global` for cluster-wide, or `local` for machine level. ")
  @NotNull


  public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public Volume options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Volume putOptionsItem(String key, String optionsItem) {
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * The driver specific options used when creating the volume. 
   * @return options
  */
  @ApiModelProperty(required = true, value = "The driver specific options used when creating the volume. ")
  @NotNull


  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public Volume usageData(VolumeUsageData usageData) {
    this.usageData = JsonNullable.of(usageData);
    return this;
  }

  /**
   * Get usageData
   * @return usageData
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<VolumeUsageData> getUsageData() {
    return usageData;
  }

  public void setUsageData(JsonNullable<VolumeUsageData> usageData) {
    this.usageData = usageData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(this.name, volume.name) &&
        Objects.equals(this.driver, volume.driver) &&
        Objects.equals(this.mountpoint, volume.mountpoint) &&
        Objects.equals(this.createdAt, volume.createdAt) &&
        Objects.equals(this.status, volume.status) &&
        Objects.equals(this.labels, volume.labels) &&
        Objects.equals(this.scope, volume.scope) &&
        Objects.equals(this.options, volume.options) &&
        Objects.equals(this.usageData, volume.usageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, driver, mountpoint, createdAt, status, labels, scope, options, usageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    mountpoint: ").append(toIndentedString(mountpoint)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    usageData: ").append(toIndentedString(usageData)).append("\n");
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

