package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpecModeReplicated;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpecModeReplicatedJob;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Scheduling mode for the service.
 */
@ApiModel(description = "Scheduling mode for the service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceSpecMode   {
  @JsonProperty("Replicated")
  private ServiceSpecModeReplicated replicated;

  @JsonProperty("Global")
  private Object global;

  @JsonProperty("ReplicatedJob")
  private ServiceSpecModeReplicatedJob replicatedJob;

  @JsonProperty("GlobalJob")
  private Object globalJob;

  public ServiceSpecMode replicated(ServiceSpecModeReplicated replicated) {
    this.replicated = replicated;
    return this;
  }

  /**
   * Get replicated
   * @return replicated
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceSpecModeReplicated getReplicated() {
    return replicated;
  }

  public void setReplicated(ServiceSpecModeReplicated replicated) {
    this.replicated = replicated;
  }

  public ServiceSpecMode global(Object global) {
    this.global = global;
    return this;
  }

  /**
   * Get global
   * @return global
  */
  @ApiModelProperty(value = "")


  public Object getGlobal() {
    return global;
  }

  public void setGlobal(Object global) {
    this.global = global;
  }

  public ServiceSpecMode replicatedJob(ServiceSpecModeReplicatedJob replicatedJob) {
    this.replicatedJob = replicatedJob;
    return this;
  }

  /**
   * Get replicatedJob
   * @return replicatedJob
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceSpecModeReplicatedJob getReplicatedJob() {
    return replicatedJob;
  }

  public void setReplicatedJob(ServiceSpecModeReplicatedJob replicatedJob) {
    this.replicatedJob = replicatedJob;
  }

  public ServiceSpecMode globalJob(Object globalJob) {
    this.globalJob = globalJob;
    return this;
  }

  /**
   * The mode used for services which run a task to the completed state on each valid node. 
   * @return globalJob
  */
  @ApiModelProperty(value = "The mode used for services which run a task to the completed state on each valid node. ")


  public Object getGlobalJob() {
    return globalJob;
  }

  public void setGlobalJob(Object globalJob) {
    this.globalJob = globalJob;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecMode serviceSpecMode = (ServiceSpecMode) o;
    return Objects.equals(this.replicated, serviceSpecMode.replicated) &&
        Objects.equals(this.global, serviceSpecMode.global) &&
        Objects.equals(this.replicatedJob, serviceSpecMode.replicatedJob) &&
        Objects.equals(this.globalJob, serviceSpecMode.globalJob);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicated, global, replicatedJob, globalJob);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecMode {\n");
    
    sb.append("    replicated: ").append(toIndentedString(replicated)).append("\n");
    sb.append("    global: ").append(toIndentedString(global)).append("\n");
    sb.append("    replicatedJob: ").append(toIndentedString(replicatedJob)).append("\n");
    sb.append("    globalJob: ").append(toIndentedString(globalJob)).append("\n");
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

