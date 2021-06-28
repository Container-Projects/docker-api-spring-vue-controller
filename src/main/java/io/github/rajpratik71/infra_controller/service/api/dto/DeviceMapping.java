package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A device mapping between the host and container
 */
@ApiModel(description = "A device mapping between the host and container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class DeviceMapping   {
  @JsonProperty("PathOnHost")
  private String pathOnHost;

  @JsonProperty("PathInContainer")
  private String pathInContainer;

  @JsonProperty("CgroupPermissions")
  private String cgroupPermissions;

  public DeviceMapping pathOnHost(String pathOnHost) {
    this.pathOnHost = pathOnHost;
    return this;
  }

  /**
   * Get pathOnHost
   * @return pathOnHost
  */
  @ApiModelProperty(value = "")


  public String getPathOnHost() {
    return pathOnHost;
  }

  public void setPathOnHost(String pathOnHost) {
    this.pathOnHost = pathOnHost;
  }

  public DeviceMapping pathInContainer(String pathInContainer) {
    this.pathInContainer = pathInContainer;
    return this;
  }

  /**
   * Get pathInContainer
   * @return pathInContainer
  */
  @ApiModelProperty(value = "")


  public String getPathInContainer() {
    return pathInContainer;
  }

  public void setPathInContainer(String pathInContainer) {
    this.pathInContainer = pathInContainer;
  }

  public DeviceMapping cgroupPermissions(String cgroupPermissions) {
    this.cgroupPermissions = cgroupPermissions;
    return this;
  }

  /**
   * Get cgroupPermissions
   * @return cgroupPermissions
  */
  @ApiModelProperty(value = "")


  public String getCgroupPermissions() {
    return cgroupPermissions;
  }

  public void setCgroupPermissions(String cgroupPermissions) {
    this.cgroupPermissions = cgroupPermissions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeviceMapping deviceMapping = (DeviceMapping) o;
    return Objects.equals(this.pathOnHost, deviceMapping.pathOnHost) &&
        Objects.equals(this.pathInContainer, deviceMapping.pathInContainer) &&
        Objects.equals(this.cgroupPermissions, deviceMapping.cgroupPermissions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pathOnHost, pathInContainer, cgroupPermissions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeviceMapping {\n");
    
    sb.append("    pathOnHost: ").append(toIndentedString(pathOnHost)).append("\n");
    sb.append("    pathInContainer: ").append(toIndentedString(pathInContainer)).append("\n");
    sb.append("    cgroupPermissions: ").append(toIndentedString(cgroupPermissions)).append("\n");
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

