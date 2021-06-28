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
 * change item in response to ContainerChanges operation
 */
@ApiModel(description = "change item in response to ContainerChanges operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ContainerChangeResponseItem   {
  @JsonProperty("Path")
  private String path;

  @JsonProperty("Kind")
  private Integer kind;

  public ContainerChangeResponseItem path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Path to file that has changed
   * @return path
  */
  @ApiModelProperty(required = true, value = "Path to file that has changed")
  @NotNull


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public ContainerChangeResponseItem kind(Integer kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Kind of change
   * @return kind
  */
  @ApiModelProperty(required = true, value = "Kind of change")
  @NotNull


  public Integer getKind() {
    return kind;
  }

  public void setKind(Integer kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerChangeResponseItem containerChangeResponseItem = (ContainerChangeResponseItem) o;
    return Objects.equals(this.path, containerChangeResponseItem.path) &&
        Objects.equals(this.kind, containerChangeResponseItem.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, kind);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerChangeResponseItem {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

