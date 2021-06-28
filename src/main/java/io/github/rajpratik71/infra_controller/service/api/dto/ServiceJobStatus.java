package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ObjectVersion;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The status of the service when it is in one of ReplicatedJob or GlobalJob modes. Absent on Replicated and Global mode services. The JobIteration is an ObjectVersion, but unlike the Service&#39;s version, does not need to be sent with an update request. 
 */
@ApiModel(description = "The status of the service when it is in one of ReplicatedJob or GlobalJob modes. Absent on Replicated and Global mode services. The JobIteration is an ObjectVersion, but unlike the Service's version, does not need to be sent with an update request. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceJobStatus   {
  @JsonProperty("JobIteration")
  private ObjectVersion jobIteration;

  @JsonProperty("LastExecution")
  private String lastExecution;

  public ServiceJobStatus jobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
    return this;
  }

  /**
   * Get jobIteration
   * @return jobIteration
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectVersion getJobIteration() {
    return jobIteration;
  }

  public void setJobIteration(ObjectVersion jobIteration) {
    this.jobIteration = jobIteration;
  }

  public ServiceJobStatus lastExecution(String lastExecution) {
    this.lastExecution = lastExecution;
    return this;
  }

  /**
   * The last time, as observed by the server, that this job was started. 
   * @return lastExecution
  */
  @ApiModelProperty(value = "The last time, as observed by the server, that this job was started. ")


  public String getLastExecution() {
    return lastExecution;
  }

  public void setLastExecution(String lastExecution) {
    this.lastExecution = lastExecution;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceJobStatus serviceJobStatus = (ServiceJobStatus) o;
    return Objects.equals(this.jobIteration, serviceJobStatus.jobIteration) &&
        Objects.equals(this.lastExecution, serviceJobStatus.lastExecution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobIteration, lastExecution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceJobStatus {\n");
    
    sb.append("    jobIteration: ").append(toIndentedString(jobIteration)).append("\n");
    sb.append("    lastExecution: ").append(toIndentedString(lastExecution)).append("\n");
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

