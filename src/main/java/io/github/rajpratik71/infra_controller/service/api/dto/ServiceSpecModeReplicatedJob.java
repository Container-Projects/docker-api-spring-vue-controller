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
 * The mode used for services with a finite number of tasks that run to a completed state. 
 */
@ApiModel(description = "The mode used for services with a finite number of tasks that run to a completed state. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceSpecModeReplicatedJob   {
  @JsonProperty("MaxConcurrent")
  private Long maxConcurrent = 1l;

  @JsonProperty("TotalCompletions")
  private Long totalCompletions;

  public ServiceSpecModeReplicatedJob maxConcurrent(Long maxConcurrent) {
    this.maxConcurrent = maxConcurrent;
    return this;
  }

  /**
   * The maximum number of replicas to run simultaneously. 
   * @return maxConcurrent
  */
  @ApiModelProperty(value = "The maximum number of replicas to run simultaneously. ")


  public Long getMaxConcurrent() {
    return maxConcurrent;
  }

  public void setMaxConcurrent(Long maxConcurrent) {
    this.maxConcurrent = maxConcurrent;
  }

  public ServiceSpecModeReplicatedJob totalCompletions(Long totalCompletions) {
    this.totalCompletions = totalCompletions;
    return this;
  }

  /**
   * The total number of replicas desired to reach the Completed state. If unset, will default to the value of `MaxConcurrent` 
   * @return totalCompletions
  */
  @ApiModelProperty(value = "The total number of replicas desired to reach the Completed state. If unset, will default to the value of `MaxConcurrent` ")


  public Long getTotalCompletions() {
    return totalCompletions;
  }

  public void setTotalCompletions(Long totalCompletions) {
    this.totalCompletions = totalCompletions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecModeReplicatedJob serviceSpecModeReplicatedJob = (ServiceSpecModeReplicatedJob) o;
    return Objects.equals(this.maxConcurrent, serviceSpecModeReplicatedJob.maxConcurrent) &&
        Objects.equals(this.totalCompletions, serviceSpecModeReplicatedJob.totalCompletions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxConcurrent, totalCompletions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecModeReplicatedJob {\n");
    
    sb.append("    maxConcurrent: ").append(toIndentedString(maxConcurrent)).append("\n");
    sb.append("    totalCompletions: ").append(toIndentedString(totalCompletions)).append("\n");
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

