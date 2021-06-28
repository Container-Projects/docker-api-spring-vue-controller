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
 * InlineObject4
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineObject4   {
  @JsonProperty("Container")
  private String container;

  @JsonProperty("Force")
  private Boolean force;

  public InlineObject4 container(String container) {
    this.container = container;
    return this;
  }

  /**
   * The ID or name of the container to disconnect from the network. 
   * @return container
  */
  @ApiModelProperty(value = "The ID or name of the container to disconnect from the network. ")


  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public InlineObject4 force(Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Force the container to disconnect from the network. 
   * @return force
  */
  @ApiModelProperty(value = "Force the container to disconnect from the network. ")


  public Boolean getForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject4 inlineObject4 = (InlineObject4) o;
    return Objects.equals(this.container, inlineObject4.container) &&
        Objects.equals(this.force, inlineObject4.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(container, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject4 {\n");
    
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

