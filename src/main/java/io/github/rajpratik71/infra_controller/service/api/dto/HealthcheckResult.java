package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * HealthcheckResult stores information about a single run of a healthcheck probe 
 */
@ApiModel(description = "HealthcheckResult stores information about a single run of a healthcheck probe ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class HealthcheckResult   {
  @JsonProperty("Start")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime start;

  @JsonProperty("End")
  private String end;

  @JsonProperty("ExitCode")
  private Integer exitCode;

  @JsonProperty("Output")
  private String output;

  public HealthcheckResult start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

  /**
   * Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return start
  */
  @ApiModelProperty(example = "2020-01-04T10:44:24.496525531Z", value = "Date and time at which this check started in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ")

  @Valid

  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public HealthcheckResult end(String end) {
    this.end = end;
    return this;
  }

  /**
   * Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return end
  */
  @ApiModelProperty(example = "2020-01-04T10:45:21.364524523Z", value = "Date and time at which this check ended in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ")


  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }

  public HealthcheckResult exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * ExitCode meanings:  - `0` healthy - `1` unhealthy - `2` reserved (considered unhealthy) - other values: error running probe 
   * @return exitCode
  */
  @ApiModelProperty(example = "0", value = "ExitCode meanings:  - `0` healthy - `1` unhealthy - `2` reserved (considered unhealthy) - other values: error running probe ")


  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }

  public HealthcheckResult output(String output) {
    this.output = output;
    return this;
  }

  /**
   * Output from last check
   * @return output
  */
  @ApiModelProperty(value = "Output from last check")


  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthcheckResult healthcheckResult = (HealthcheckResult) o;
    return Objects.equals(this.start, healthcheckResult.start) &&
        Objects.equals(this.end, healthcheckResult.end) &&
        Objects.equals(this.exitCode, healthcheckResult.exitCode) &&
        Objects.equals(this.output, healthcheckResult.output);
  }

  @Override
  public int hashCode() {
    return Objects.hash(start, end, exitCode, output);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthcheckResult {\n");
    
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
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

