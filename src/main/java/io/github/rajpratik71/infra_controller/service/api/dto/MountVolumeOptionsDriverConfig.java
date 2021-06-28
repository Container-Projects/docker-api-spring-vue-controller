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
 * Map of driver specific options
 */
@ApiModel(description = "Map of driver specific options")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class MountVolumeOptionsDriverConfig   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Options")
  @Valid
  private Map<String, String> options = null;

  public MountVolumeOptionsDriverConfig name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the driver to use to create the volume.
   * @return name
  */
  @ApiModelProperty(value = "Name of the driver to use to create the volume.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MountVolumeOptionsDriverConfig options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public MountVolumeOptionsDriverConfig putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * key/value map of driver specific options.
   * @return options
  */
  @ApiModelProperty(value = "key/value map of driver specific options.")


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
    MountVolumeOptionsDriverConfig mountVolumeOptionsDriverConfig = (MountVolumeOptionsDriverConfig) o;
    return Objects.equals(this.name, mountVolumeOptionsDriverConfig.name) &&
        Objects.equals(this.options, mountVolumeOptionsDriverConfig.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountVolumeOptionsDriverConfig {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

