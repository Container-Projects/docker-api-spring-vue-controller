package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecTaskDefaultsLogDriver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Defaults for creating tasks in this cluster.
 */
@ApiModel(description = "Defaults for creating tasks in this cluster.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecTaskDefaults   {
  @JsonProperty("LogDriver")
  private SwarmSpecTaskDefaultsLogDriver logDriver;

  public SwarmSpecTaskDefaults logDriver(SwarmSpecTaskDefaultsLogDriver logDriver) {
    this.logDriver = logDriver;
    return this;
  }

  /**
   * Get logDriver
   * @return logDriver
  */
  @ApiModelProperty(value = "")

  @Valid

  public SwarmSpecTaskDefaultsLogDriver getLogDriver() {
    return logDriver;
  }

  public void setLogDriver(SwarmSpecTaskDefaultsLogDriver logDriver) {
    this.logDriver = logDriver;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecTaskDefaults swarmSpecTaskDefaults = (SwarmSpecTaskDefaults) o;
    return Objects.equals(this.logDriver, swarmSpecTaskDefaults.logDriver);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logDriver);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecTaskDefaults {\n");
    
    sb.append("    logDriver: ").append(toIndentedString(logDriver)).append("\n");
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

