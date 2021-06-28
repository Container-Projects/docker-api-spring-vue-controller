package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.HealthcheckResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Health stores information about the container&#39;s healthcheck results. 
 */
@ApiModel(description = "Health stores information about the container's healthcheck results. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Health   {
  /**
   * Status is one of `none`, `starting`, `healthy` or `unhealthy`  - \"none\"      Indicates there is no healthcheck - \"starting\"  Starting indicates that the container is not yet ready - \"healthy\"   Healthy indicates that the container is running correctly - \"unhealthy\" Unhealthy indicates that the container has a problem 
   */
  public enum StatusEnum {
    NONE("none"),
    
    STARTING("starting"),
    
    HEALTHY("healthy"),
    
    UNHEALTHY("unhealthy");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Status")
  private StatusEnum status;

  @JsonProperty("FailingStreak")
  private Integer failingStreak;

  @JsonProperty("Log")
  @Valid
  private List<HealthcheckResult> log = null;

  public Health status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status is one of `none`, `starting`, `healthy` or `unhealthy`  - \"none\"      Indicates there is no healthcheck - \"starting\"  Starting indicates that the container is not yet ready - \"healthy\"   Healthy indicates that the container is running correctly - \"unhealthy\" Unhealthy indicates that the container has a problem 
   * @return status
  */
  @ApiModelProperty(example = "healthy", value = "Status is one of `none`, `starting`, `healthy` or `unhealthy`  - \"none\"      Indicates there is no healthcheck - \"starting\"  Starting indicates that the container is not yet ready - \"healthy\"   Healthy indicates that the container is running correctly - \"unhealthy\" Unhealthy indicates that the container has a problem ")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public Health failingStreak(Integer failingStreak) {
    this.failingStreak = failingStreak;
    return this;
  }

  /**
   * FailingStreak is the number of consecutive failures
   * @return failingStreak
  */
  @ApiModelProperty(example = "0", value = "FailingStreak is the number of consecutive failures")


  public Integer getFailingStreak() {
    return failingStreak;
  }

  public void setFailingStreak(Integer failingStreak) {
    this.failingStreak = failingStreak;
  }

  public Health log(List<HealthcheckResult> log) {
    this.log = log;
    return this;
  }

  public Health addLogItem(HealthcheckResult logItem) {
    if (this.log == null) {
      this.log = new ArrayList<>();
    }
    this.log.add(logItem);
    return this;
  }

  /**
   * Log contains the last few results (oldest first) 
   * @return log
  */
  @ApiModelProperty(value = "Log contains the last few results (oldest first) ")

  @Valid

  public List<HealthcheckResult> getLog() {
    return log;
  }

  public void setLog(List<HealthcheckResult> log) {
    this.log = log;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Health health = (Health) o;
    return Objects.equals(this.status, health.status) &&
        Objects.equals(this.failingStreak, health.failingStreak) &&
        Objects.equals(this.log, health.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, failingStreak, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Health {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    failingStreak: ").append(toIndentedString(failingStreak)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

