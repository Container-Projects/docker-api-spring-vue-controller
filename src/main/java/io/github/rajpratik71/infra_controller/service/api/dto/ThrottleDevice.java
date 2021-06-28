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
 * ThrottleDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ThrottleDevice   {
  @JsonProperty("Path")
  private String path;

  @JsonProperty("Rate")
  private Long rate;

  public ThrottleDevice path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Device path
   * @return path
  */
  @ApiModelProperty(value = "Device path")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ThrottleDevice rate(Long rate) {
    this.rate = rate;
    return this;
  }

  /**
   * Rate
   * minimum: 0
   * @return rate
  */
  @ApiModelProperty(value = "Rate")

@Min(0L)
  public Long getRate() {
    return rate;
  }

  public void setRate(Long rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThrottleDevice throttleDevice = (ThrottleDevice) o;
    return Objects.equals(this.path, throttleDevice.path) &&
        Objects.equals(this.rate, throttleDevice.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, rate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThrottleDevice {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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

