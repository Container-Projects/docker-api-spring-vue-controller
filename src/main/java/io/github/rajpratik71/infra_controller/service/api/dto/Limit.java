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
 * An object describing a limit on resources which can be requested by a task. 
 */
@ApiModel(description = "An object describing a limit on resources which can be requested by a task. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Limit   {
  @JsonProperty("NanoCPUs")
  private Long nanoCPUs;

  @JsonProperty("MemoryBytes")
  private Long memoryBytes;

  @JsonProperty("Pids")
  private Long pids = 0l;

  public Limit nanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
    return this;
  }

  /**
   * Get nanoCPUs
   * @return nanoCPUs
  */
  @ApiModelProperty(example = "4000000000", value = "")


  public Long getNanoCPUs() {
    return nanoCPUs;
  }

  public void setNanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
  }

  public Limit memoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
    return this;
  }

  /**
   * Get memoryBytes
   * @return memoryBytes
  */
  @ApiModelProperty(example = "8272408576", value = "")


  public Long getMemoryBytes() {
    return memoryBytes;
  }

  public void setMemoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
  }

  public Limit pids(Long pids) {
    this.pids = pids;
    return this;
  }

  /**
   * Limits the maximum number of PIDs in the container. Set `0` for unlimited. 
   * @return pids
  */
  @ApiModelProperty(example = "100", value = "Limits the maximum number of PIDs in the container. Set `0` for unlimited. ")


  public Long getPids() {
    return pids;
  }

  public void setPids(Long pids) {
    this.pids = pids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Limit limit = (Limit) o;
    return Objects.equals(this.nanoCPUs, limit.nanoCPUs) &&
        Objects.equals(this.memoryBytes, limit.memoryBytes) &&
        Objects.equals(this.pids, limit.pids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanoCPUs, memoryBytes, pids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Limit {\n");
    
    sb.append("    nanoCPUs: ").append(toIndentedString(nanoCPUs)).append("\n");
    sb.append("    memoryBytes: ").append(toIndentedString(memoryBytes)).append("\n");
    sb.append("    pids: ").append(toIndentedString(pids)).append("\n");
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

