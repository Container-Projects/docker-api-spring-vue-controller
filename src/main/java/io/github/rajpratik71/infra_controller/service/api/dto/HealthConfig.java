package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A test to perform to check that the container is healthy.
 */
@ApiModel(description = "A test to perform to check that the container is healthy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class HealthConfig   {
  @JsonProperty("Test")
  @Valid
  private List<String> test = null;

  @JsonProperty("Interval")
  private Integer interval;

  @JsonProperty("Timeout")
  private Integer timeout;

  @JsonProperty("Retries")
  private Integer retries;

  @JsonProperty("StartPeriod")
  private Integer startPeriod;

  public HealthConfig test(List<String> test) {
    this.test = test;
    return this;
  }

  public HealthConfig addTestItem(String testItem) {
    if (this.test == null) {
      this.test = new ArrayList<>();
    }
    this.test.add(testItem);
    return this;
  }

  /**
   * The test to perform. Possible values are:  - `[]` inherit healthcheck from image or parent image - `[\"NONE\"]` disable healthcheck - `[\"CMD\", args...]` exec arguments directly - `[\"CMD-SHELL\", command]` run command with system's default shell 
   * @return test
  */
  @ApiModelProperty(value = "The test to perform. Possible values are:  - `[]` inherit healthcheck from image or parent image - `[\"NONE\"]` disable healthcheck - `[\"CMD\", args...]` exec arguments directly - `[\"CMD-SHELL\", command]` run command with system's default shell ")


  public List<String> getTest() {
    return test;
  }

  public void setTest(List<String> test) {
    this.test = test;
  }

  public HealthConfig interval(Integer interval) {
    this.interval = interval;
    return this;
  }

  /**
   * The time to wait between checks in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. 
   * @return interval
  */
  @ApiModelProperty(value = "The time to wait between checks in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. ")


  public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public HealthConfig timeout(Integer timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * The time to wait before considering the check to have hung. It should be 0 or at least 1000000 (1 ms). 0 means inherit. 
   * @return timeout
  */
  @ApiModelProperty(value = "The time to wait before considering the check to have hung. It should be 0 or at least 1000000 (1 ms). 0 means inherit. ")


  public Integer getTimeout() {
    return timeout;
  }

  public void setTimeout(Integer timeout) {
    this.timeout = timeout;
  }

  public HealthConfig retries(Integer retries) {
    this.retries = retries;
    return this;
  }

  /**
   * The number of consecutive failures needed to consider a container as unhealthy. 0 means inherit. 
   * @return retries
  */
  @ApiModelProperty(value = "The number of consecutive failures needed to consider a container as unhealthy. 0 means inherit. ")


  public Integer getRetries() {
    return retries;
  }

  public void setRetries(Integer retries) {
    this.retries = retries;
  }

  public HealthConfig startPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
    return this;
  }

  /**
   * Start period for the container to initialize before starting health-retries countdown in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. 
   * @return startPeriod
  */
  @ApiModelProperty(value = "Start period for the container to initialize before starting health-retries countdown in nanoseconds. It should be 0 or at least 1000000 (1 ms). 0 means inherit. ")


  public Integer getStartPeriod() {
    return startPeriod;
  }

  public void setStartPeriod(Integer startPeriod) {
    this.startPeriod = startPeriod;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthConfig healthConfig = (HealthConfig) o;
    return Objects.equals(this.test, healthConfig.test) &&
        Objects.equals(this.interval, healthConfig.interval) &&
        Objects.equals(this.timeout, healthConfig.timeout) &&
        Objects.equals(this.retries, healthConfig.retries) &&
        Objects.equals(this.startPeriod, healthConfig.startPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(test, interval, timeout, retries, startPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthConfig {\n");
    
    sb.append("    test: ").append(toIndentedString(test)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    retries: ").append(toIndentedString(retries)).append("\n");
    sb.append("    startPeriod: ").append(toIndentedString(startPeriod)).append("\n");
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

