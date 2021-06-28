package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Specification for the update strategy of the service.
 */
@ApiModel(description = "Specification for the update strategy of the service.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceSpecUpdateConfig   {
  @JsonProperty("Parallelism")
  private Long parallelism;

  @JsonProperty("Delay")
  private Long delay;

  /**
   * Action to take if an updated task fails to run, or stops running during the update. 
   */
  public enum FailureActionEnum {
    CONTINUE("continue"),
    
    PAUSE("pause"),
    
    ROLLBACK("rollback");

    private String value;

    FailureActionEnum(String value) {
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
    public static FailureActionEnum fromValue(String value) {
      for (FailureActionEnum b : FailureActionEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("FailureAction")
  private FailureActionEnum failureAction;

  @JsonProperty("Monitor")
  private Long monitor;

  @JsonProperty("MaxFailureRatio")
  private BigDecimal maxFailureRatio;

  /**
   * The order of operations when rolling out an updated task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down. 
   */
  public enum OrderEnum {
    STOP_FIRST("stop-first"),
    
    START_FIRST("start-first");

    private String value;

    OrderEnum(String value) {
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
    public static OrderEnum fromValue(String value) {
      for (OrderEnum b : OrderEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Order")
  private OrderEnum order;

  public ServiceSpecUpdateConfig parallelism(Long parallelism) {
    this.parallelism = parallelism;
    return this;
  }

  /**
   * Maximum number of tasks to be updated in one iteration (0 means unlimited parallelism). 
   * @return parallelism
  */
  @ApiModelProperty(value = "Maximum number of tasks to be updated in one iteration (0 means unlimited parallelism). ")


  public Long getParallelism() {
    return parallelism;
  }

  public void setParallelism(Long parallelism) {
    this.parallelism = parallelism;
  }

  public ServiceSpecUpdateConfig delay(Long delay) {
    this.delay = delay;
    return this;
  }

  /**
   * Amount of time between updates, in nanoseconds.
   * @return delay
  */
  @ApiModelProperty(value = "Amount of time between updates, in nanoseconds.")


  public Long getDelay() {
    return delay;
  }

  public void setDelay(Long delay) {
    this.delay = delay;
  }

  public ServiceSpecUpdateConfig failureAction(FailureActionEnum failureAction) {
    this.failureAction = failureAction;
    return this;
  }

  /**
   * Action to take if an updated task fails to run, or stops running during the update. 
   * @return failureAction
  */
  @ApiModelProperty(value = "Action to take if an updated task fails to run, or stops running during the update. ")


  public FailureActionEnum getFailureAction() {
    return failureAction;
  }

  public void setFailureAction(FailureActionEnum failureAction) {
    this.failureAction = failureAction;
  }

  public ServiceSpecUpdateConfig monitor(Long monitor) {
    this.monitor = monitor;
    return this;
  }

  /**
   * Amount of time to monitor each updated task for failures, in nanoseconds. 
   * @return monitor
  */
  @ApiModelProperty(value = "Amount of time to monitor each updated task for failures, in nanoseconds. ")


  public Long getMonitor() {
    return monitor;
  }

  public void setMonitor(Long monitor) {
    this.monitor = monitor;
  }

  public ServiceSpecUpdateConfig maxFailureRatio(BigDecimal maxFailureRatio) {
    this.maxFailureRatio = maxFailureRatio;
    return this;
  }

  /**
   * The fraction of tasks that may fail during an update before the failure action is invoked, specified as a floating point number between 0 and 1. 
   * @return maxFailureRatio
  */
  @ApiModelProperty(value = "The fraction of tasks that may fail during an update before the failure action is invoked, specified as a floating point number between 0 and 1. ")

  @Valid

  public BigDecimal getMaxFailureRatio() {
    return maxFailureRatio;
  }

  public void setMaxFailureRatio(BigDecimal maxFailureRatio) {
    this.maxFailureRatio = maxFailureRatio;
  }

  public ServiceSpecUpdateConfig order(OrderEnum order) {
    this.order = order;
    return this;
  }

  /**
   * The order of operations when rolling out an updated task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down. 
   * @return order
  */
  @ApiModelProperty(value = "The order of operations when rolling out an updated task. Either the old task is shut down before the new task is started, or the new task is started before the old task is shut down. ")


  public OrderEnum getOrder() {
    return order;
  }

  public void setOrder(OrderEnum order) {
    this.order = order;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceSpecUpdateConfig serviceSpecUpdateConfig = (ServiceSpecUpdateConfig) o;
    return Objects.equals(this.parallelism, serviceSpecUpdateConfig.parallelism) &&
        Objects.equals(this.delay, serviceSpecUpdateConfig.delay) &&
        Objects.equals(this.failureAction, serviceSpecUpdateConfig.failureAction) &&
        Objects.equals(this.monitor, serviceSpecUpdateConfig.monitor) &&
        Objects.equals(this.maxFailureRatio, serviceSpecUpdateConfig.maxFailureRatio) &&
        Objects.equals(this.order, serviceSpecUpdateConfig.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parallelism, delay, failureAction, monitor, maxFailureRatio, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceSpecUpdateConfig {\n");
    
    sb.append("    parallelism: ").append(toIndentedString(parallelism)).append("\n");
    sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
    sb.append("    failureAction: ").append(toIndentedString(failureAction)).append("\n");
    sb.append("    monitor: ").append(toIndentedString(monitor)).append("\n");
    sb.append("    maxFailureRatio: ").append(toIndentedString(maxFailureRatio)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

