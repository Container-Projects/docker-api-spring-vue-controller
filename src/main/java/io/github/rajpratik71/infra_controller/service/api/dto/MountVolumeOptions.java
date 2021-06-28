package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.MountVolumeOptionsDriverConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Optional configuration for the &#x60;volume&#x60; type.
 */
@ApiModel(description = "Optional configuration for the `volume` type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class MountVolumeOptions   {
  @JsonProperty("NoCopy")
  private Boolean noCopy = false;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("DriverConfig")
  private MountVolumeOptionsDriverConfig driverConfig;

  public MountVolumeOptions noCopy(Boolean noCopy) {
    this.noCopy = noCopy;
    return this;
  }

  /**
   * Populate volume with data from the target.
   * @return noCopy
  */
  @ApiModelProperty(value = "Populate volume with data from the target.")


  public Boolean getNoCopy() {
    return noCopy;
  }

  public void setNoCopy(Boolean noCopy) {
    this.noCopy = noCopy;
  }

  public MountVolumeOptions labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public MountVolumeOptions putLabelsItem(String key, String labelsItem) {
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

  public MountVolumeOptions driverConfig(MountVolumeOptionsDriverConfig driverConfig) {
    this.driverConfig = driverConfig;
    return this;
  }

  /**
   * Get driverConfig
   * @return driverConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public MountVolumeOptionsDriverConfig getDriverConfig() {
    return driverConfig;
  }

  public void setDriverConfig(MountVolumeOptionsDriverConfig driverConfig) {
    this.driverConfig = driverConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountVolumeOptions mountVolumeOptions = (MountVolumeOptions) o;
    return Objects.equals(this.noCopy, mountVolumeOptions.noCopy) &&
        Objects.equals(this.labels, mountVolumeOptions.labels) &&
        Objects.equals(this.driverConfig, mountVolumeOptions.driverConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(noCopy, labels, driverConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountVolumeOptions {\n");
    
    sb.append("    noCopy: ").append(toIndentedString(noCopy)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    driverConfig: ").append(toIndentedString(driverConfig)).append("\n");
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

