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
 * InlineObject1
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineObject1   {
  @JsonProperty("Detach")
  private Boolean detach;

  @JsonProperty("Tty")
  private Boolean tty;

  public InlineObject1 detach(Boolean detach) {
    this.detach = detach;
    return this;
  }

  /**
   * Detach from the command.
   * @return detach
  */
  @ApiModelProperty(value = "Detach from the command.")


  public Boolean getDetach() {
    return detach;
  }

  public void setDetach(Boolean detach) {
    this.detach = detach;
  }

  public InlineObject1 tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Allocate a pseudo-TTY.
   * @return tty
  */
  @ApiModelProperty(value = "Allocate a pseudo-TTY.")


  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject1 inlineObject1 = (InlineObject1) o;
    return Objects.equals(this.detach, inlineObject1.detach) &&
        Objects.equals(this.tty, inlineObject1.tty);
  }

  @Override
  public int hashCode() {
    return Objects.hash(detach, tty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject1 {\n");
    
    sb.append("    detach: ").append(toIndentedString(detach)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
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

