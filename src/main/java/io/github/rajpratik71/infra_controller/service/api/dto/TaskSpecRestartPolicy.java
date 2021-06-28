package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specification for the restart policy which applies to containers created as part of this service. 
 */
@ApiModel(description = "Specification for the restart policy which applies to containers created as part of this service. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecRestartPolicy   {
  /**
   * Condition for restart.
   */
  public enum ConditionEnum {
    NONE("none"),
    
    ON_FAILURE("on-failure"),
    
    ANY("any");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ConditionEnum fromValue(String value) {
      for (ConditionEnum b : ConditionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Condition")
  private ConditionEnum condition;

  @JsonProperty("Delay")
  private Long delay;

  @JsonProperty("MaxAttempts")
  private Long maxAttempts = 0l;

  @JsonProperty("Window")
  private Long window = 0l;

  public TaskSpecRestartPolicy condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }

  /**
   * Condition for restart.
   * @return condition
  */
  @ApiModelProperty(value = "Condition for restart.")


  public ConditionEnum getCondition() {
    return condition;
  }

  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }

  public TaskSpecRestartPolicy delay(Long delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Delay between restart attempts.
   * @return delay
  */
  @ApiModelProperty(value = "Delay between restart attempts.")


  public Long getDelay() {
    return delay;
  }

  public void setDelay(Long delay) {
    this.delay = delay;
  }

  public TaskSpecRestartPolicy maxAttempts(Long maxAttempts) {
    this.maxAttempts = maxAttempts;
    return this;
  }

  /**
   * Maximum attempts to restart a given container before giving up (default value is 0, which is ignored). 
   * @return maxAttempts
  */
  @ApiModelProperty(value = "Maximum attempts to restart a given container before giving up (default value is 0, which is ignored). ")


  public Long getMaxAttempts() {
    return maxAttempts;
  }

  public void setMaxAttempts(Long maxAttempts) {
    this.maxAttempts = maxAttempts;
  }

  public TaskSpecRestartPolicy window(Long window) {
    this.window = window;
    return this;
  }

  /**
   * Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded). 
   * @return window
  */
  @ApiModelProperty(value = "Windows is the time window used to evaluate the restart policy (default value is 0, which is unbounded). ")


  public Long getWindow() {
    return window;
  }

  public void setWindow(Long window) {
    this.window = window;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecRestartPolicy taskSpecRestartPolicy = (TaskSpecRestartPolicy) o;
    return Objects.equals(this.condition, taskSpecRestartPolicy.condition) &&
        Objects.equals(this.delay, taskSpecRestartPolicy.delay) &&
        Objects.equals(this.maxAttempts, taskSpecRestartPolicy.maxAttempts) &&
        Objects.equals(this.window, taskSpecRestartPolicy.window);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, delay, maxAttempts, window);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecRestartPolicy {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    maxAttempts: ").append(toIndentedString(maxAttempts)).append("\n");
    sb.append("    window: ").append(toIndentedString(window)).append("\n");
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

