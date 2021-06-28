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
 * Dispatcher configuration.
 */
@ApiModel(description = "Dispatcher configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecDispatcher   {
  @JsonProperty("HeartbeatPeriod")
  private Long heartbeatPeriod;

  public SwarmSpecDispatcher heartbeatPeriod(Long heartbeatPeriod) {
    this.heartbeatPeriod = heartbeatPeriod;
    return this;
  }

  /**
   * The delay for an agent to send a heartbeat to the dispatcher. 
   * @return heartbeatPeriod
  */
  @ApiModelProperty(example = "5000000000", value = "The delay for an agent to send a heartbeat to the dispatcher. ")


  public Long getHeartbeatPeriod() {
    return heartbeatPeriod;
  }

  public void setHeartbeatPeriod(Long heartbeatPeriod) {
    this.heartbeatPeriod = heartbeatPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecDispatcher swarmSpecDispatcher = (SwarmSpecDispatcher) o;
    return Objects.equals(this.heartbeatPeriod, swarmSpecDispatcher.heartbeatPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heartbeatPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecDispatcher {\n");
    
    sb.append("    heartbeatPeriod: ").append(toIndentedString(heartbeatPeriod)).append("\n");
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

