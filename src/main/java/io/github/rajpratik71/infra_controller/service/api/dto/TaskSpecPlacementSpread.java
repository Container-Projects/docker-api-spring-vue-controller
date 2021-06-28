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
 * TaskSpecPlacementSpread
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecPlacementSpread   {
  @JsonProperty("SpreadDescriptor")
  private String spreadDescriptor;

  public TaskSpecPlacementSpread spreadDescriptor(String spreadDescriptor) {
    this.spreadDescriptor = spreadDescriptor;
    return this;
  }

  /**
   * label descriptor, such as `engine.labels.az`. 
   * @return spreadDescriptor
  */
  @ApiModelProperty(value = "label descriptor, such as `engine.labels.az`. ")


  public String getSpreadDescriptor() {
    return spreadDescriptor;
  }

  public void setSpreadDescriptor(String spreadDescriptor) {
    this.spreadDescriptor = spreadDescriptor;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPlacementSpread taskSpecPlacementSpread = (TaskSpecPlacementSpread) o;
    return Objects.equals(this.spreadDescriptor, taskSpecPlacementSpread.spreadDescriptor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spreadDescriptor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPlacementSpread {\n");
    
    sb.append("    spreadDescriptor: ").append(toIndentedString(spreadDescriptor)).append("\n");
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

