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
 * ResourcesBlkioWeightDevice
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ResourcesBlkioWeightDevice   {
  @JsonProperty("Path")
  private String path;

  @JsonProperty("Weight")
  private Integer weight;

  public ResourcesBlkioWeightDevice path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Get path
   * @return path
  */
  @ApiModelProperty(value = "")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ResourcesBlkioWeightDevice weight(Integer weight) {
    this.weight = weight;
    return this;
  }

  /**
   * Get weight
   * minimum: 0
   * @return weight
  */
  @ApiModelProperty(value = "")

@Min(0)
  public Integer getWeight() {
    return weight;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourcesBlkioWeightDevice resourcesBlkioWeightDevice = (ResourcesBlkioWeightDevice) o;
    return Objects.equals(this.path, resourcesBlkioWeightDevice.path) &&
        Objects.equals(this.weight, resourcesBlkioWeightDevice.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourcesBlkioWeightDevice {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

