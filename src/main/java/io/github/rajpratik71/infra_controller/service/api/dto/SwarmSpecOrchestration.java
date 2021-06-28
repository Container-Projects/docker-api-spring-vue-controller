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
 * Orchestration configuration.
 */
@ApiModel(description = "Orchestration configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecOrchestration   {
  @JsonProperty("TaskHistoryRetentionLimit")
  private Long taskHistoryRetentionLimit;

  public SwarmSpecOrchestration taskHistoryRetentionLimit(Long taskHistoryRetentionLimit) {
    this.taskHistoryRetentionLimit = taskHistoryRetentionLimit;
    return this;
  }

  /**
   * The number of historic tasks to keep per instance or node. If negative, never remove completed or failed tasks. 
   * @return taskHistoryRetentionLimit
  */
  @ApiModelProperty(example = "10", value = "The number of historic tasks to keep per instance or node. If negative, never remove completed or failed tasks. ")


  public Long getTaskHistoryRetentionLimit() {
    return taskHistoryRetentionLimit;
  }

  public void setTaskHistoryRetentionLimit(Long taskHistoryRetentionLimit) {
    this.taskHistoryRetentionLimit = taskHistoryRetentionLimit;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecOrchestration swarmSpecOrchestration = (SwarmSpecOrchestration) o;
    return Objects.equals(this.taskHistoryRetentionLimit, swarmSpecOrchestration.taskHistoryRetentionLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taskHistoryRetentionLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecOrchestration {\n");
    
    sb.append("    taskHistoryRetentionLimit: ").append(toIndentedString(taskHistoryRetentionLimit)).append("\n");
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

