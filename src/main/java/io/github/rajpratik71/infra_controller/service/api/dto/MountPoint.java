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
 * A mount point inside a container
 */
@ApiModel(description = "A mount point inside a container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class MountPoint   {
  @JsonProperty("Type")
  private String type;

  @JsonProperty("Name")
  private String name;

  @JsonProperty("Source")
  private String source;

  @JsonProperty("Destination")
  private String destination;

  @JsonProperty("Driver")
  private String driver;

  @JsonProperty("Mode")
  private String mode;

  @JsonProperty("RW")
  private Boolean RW;

  @JsonProperty("Propagation")
  private String propagation;

  public MountPoint type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MountPoint name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MountPoint source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Get source
   * @return source
  */
  @ApiModelProperty(value = "")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public MountPoint destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Get destination
   * @return destination
  */
  @ApiModelProperty(value = "")


  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public MountPoint driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  @ApiModelProperty(value = "")


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public MountPoint mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Get mode
   * @return mode
  */
  @ApiModelProperty(value = "")


  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public MountPoint RW(Boolean RW) {
    this.RW = RW;
    return this;
  }

  /**
   * Get RW
   * @return RW
  */
  @ApiModelProperty(value = "")


  public Boolean getRW() {
    return RW;
  }

  public void setRW(Boolean RW) {
    this.RW = RW;
  }

  public MountPoint propagation(String propagation) {
    this.propagation = propagation;
    return this;
  }

  /**
   * Get propagation
   * @return propagation
  */
  @ApiModelProperty(value = "")


  public String getPropagation() {
    return propagation;
  }

  public void setPropagation(String propagation) {
    this.propagation = propagation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountPoint mountPoint = (MountPoint) o;
    return Objects.equals(this.type, mountPoint.type) &&
        Objects.equals(this.name, mountPoint.name) &&
        Objects.equals(this.source, mountPoint.source) &&
        Objects.equals(this.destination, mountPoint.destination) &&
        Objects.equals(this.driver, mountPoint.driver) &&
        Objects.equals(this.mode, mountPoint.mode) &&
        Objects.equals(this.RW, mountPoint.RW) &&
        Objects.equals(this.propagation, mountPoint.propagation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, source, destination, driver, mode, RW, propagation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountPoint {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    RW: ").append(toIndentedString(RW)).append("\n");
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
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

