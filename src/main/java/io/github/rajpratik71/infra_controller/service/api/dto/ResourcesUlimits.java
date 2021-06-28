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
 * ResourcesUlimits
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ResourcesUlimits   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Soft")
  private Integer soft;

  @JsonProperty("Hard")
  private Integer hard;

  public ResourcesUlimits name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of ulimit
   * @return name
  */
  @ApiModelProperty(value = "Name of ulimit")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourcesUlimits soft(Integer soft) {
    this.soft = soft;
    return this;
  }

  /**
   * Soft limit
   * @return soft
  */
  @ApiModelProperty(value = "Soft limit")


  public Integer getSoft() {
    return soft;
  }

  public void setSoft(Integer soft) {
    this.soft = soft;
  }

  public ResourcesUlimits hard(Integer hard) {
    this.hard = hard;
    return this;
  }

  /**
   * Hard limit
   * @return hard
  */
  @ApiModelProperty(value = "Hard limit")


  public Integer getHard() {
    return hard;
  }

  public void setHard(Integer hard) {
    this.hard = hard;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesUlimits resourcesUlimits = (ResourcesUlimits) o;
    return Objects.equals(this.name, resourcesUlimits.name) &&
        Objects.equals(this.soft, resourcesUlimits.soft) &&
        Objects.equals(this.hard, resourcesUlimits.hard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, soft, hard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesUlimits {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    soft: ").append(toIndentedString(soft)).append("\n");
    sb.append("    hard: ").append(toIndentedString(hard)).append("\n");
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

