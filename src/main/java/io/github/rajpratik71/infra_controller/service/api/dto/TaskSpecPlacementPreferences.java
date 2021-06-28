package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecPlacementSpread;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskSpecPlacementPreferences
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecPlacementPreferences   {
  @JsonProperty("Spread")
  private TaskSpecPlacementSpread spread;

  public TaskSpecPlacementPreferences spread(TaskSpecPlacementSpread spread) {
    this.spread = spread;
    return this;
  }

  /**
   * Get spread
   * @return spread
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecPlacementSpread getSpread() {
    return spread;
  }

  public void setSpread(TaskSpecPlacementSpread spread) {
    this.spread = spread;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPlacementPreferences taskSpecPlacementPreferences = (TaskSpecPlacementPreferences) o;
    return Objects.equals(this.spread, taskSpecPlacementPreferences.spread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPlacementPreferences {\n");
    
    sb.append("    spread: ").append(toIndentedString(spread)).append("\n");
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

