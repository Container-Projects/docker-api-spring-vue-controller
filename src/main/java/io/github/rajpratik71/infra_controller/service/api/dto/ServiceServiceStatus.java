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
 * The status of the service&#39;s tasks. Provided only when requested as part of a ServiceList operation. 
 */
@ApiModel(description = "The status of the service's tasks. Provided only when requested as part of a ServiceList operation. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceServiceStatus   {
  @JsonProperty("RunningTasks")
  private Integer runningTasks;

  @JsonProperty("DesiredTasks")
  private Integer desiredTasks;

  @JsonProperty("CompletedTasks")
  private Integer completedTasks;

  public ServiceServiceStatus runningTasks(Integer runningTasks) {
    this.runningTasks = runningTasks;
    return this;
  }

  /**
   * The number of tasks for the service currently in the Running state. 
   * @return runningTasks
  */
  @ApiModelProperty(example = "7", value = "The number of tasks for the service currently in the Running state. ")


  public Integer getRunningTasks() {
    return runningTasks;
  }

  public void setRunningTasks(Integer runningTasks) {
    this.runningTasks = runningTasks;
  }

  public ServiceServiceStatus desiredTasks(Integer desiredTasks) {
    this.desiredTasks = desiredTasks;
    return this;
  }

  /**
   * The number of tasks for the service desired to be running. For replicated services, this is the replica count from the service spec. For global services, this is computed by taking count of all tasks for the service with a Desired State other than Shutdown. 
   * @return desiredTasks
  */
  @ApiModelProperty(example = "10", value = "The number of tasks for the service desired to be running. For replicated services, this is the replica count from the service spec. For global services, this is computed by taking count of all tasks for the service with a Desired State other than Shutdown. ")


  public Integer getDesiredTasks() {
    return desiredTasks;
  }

  public void setDesiredTasks(Integer desiredTasks) {
    this.desiredTasks = desiredTasks;
  }

  public ServiceServiceStatus completedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
    return this;
  }

  /**
   * The number of tasks for a job that are in the Completed state. This field must be cross-referenced with the service type, as the value of 0 may mean the service is not in a job mode, or it may mean the job-mode service has no tasks yet Completed. 
   * @return completedTasks
  */
  @ApiModelProperty(value = "The number of tasks for a job that are in the Completed state. This field must be cross-referenced with the service type, as the value of 0 may mean the service is not in a job mode, or it may mean the job-mode service has no tasks yet Completed. ")


  public Integer getCompletedTasks() {
    return completedTasks;
  }

  public void setCompletedTasks(Integer completedTasks) {
    this.completedTasks = completedTasks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceServiceStatus serviceServiceStatus = (ServiceServiceStatus) o;
    return Objects.equals(this.runningTasks, serviceServiceStatus.runningTasks) &&
        Objects.equals(this.desiredTasks, serviceServiceStatus.desiredTasks) &&
        Objects.equals(this.completedTasks, serviceServiceStatus.completedTasks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(runningTasks, desiredTasks, completedTasks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceServiceStatus {\n");
    
    sb.append("    runningTasks: ").append(toIndentedString(runningTasks)).append("\n");
    sb.append("    desiredTasks: ").append(toIndentedString(desiredTasks)).append("\n");
    sb.append("    completedTasks: ").append(toIndentedString(completedTasks)).append("\n");
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

