package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Optional configuration for the &#x60;bind&#x60; type.
 */
@ApiModel(description = "Optional configuration for the `bind` type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class MountBindOptions   {
  /**
   * A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.
   */
  public enum PropagationEnum {
    PRIVATE("private"),
    
    RPRIVATE("rprivate"),
    
    SHARED("shared"),
    
    RSHARED("rshared"),
    
    SLAVE("slave"),
    
    RSLAVE("rslave");

    private String value;

    PropagationEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PropagationEnum fromValue(String value) {
      for (PropagationEnum b : PropagationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Propagation")
  private PropagationEnum propagation;

  @JsonProperty("NonRecursive")
  private Boolean nonRecursive = false;

  public MountBindOptions propagation(PropagationEnum propagation) {
    this.propagation = propagation;
    return this;
  }

  /**
   * A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.
   * @return propagation
  */
  @ApiModelProperty(value = "A propagation mode with the value `[r]private`, `[r]shared`, or `[r]slave`.")


  public PropagationEnum getPropagation() {
    return propagation;
  }

  public void setPropagation(PropagationEnum propagation) {
    this.propagation = propagation;
  }

  public MountBindOptions nonRecursive(Boolean nonRecursive) {
    this.nonRecursive = nonRecursive;
    return this;
  }

  /**
   * Disable recursive bind mount.
   * @return nonRecursive
  */
  @ApiModelProperty(value = "Disable recursive bind mount.")


  public Boolean getNonRecursive() {
    return nonRecursive;
  }

  public void setNonRecursive(Boolean nonRecursive) {
    this.nonRecursive = nonRecursive;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountBindOptions mountBindOptions = (MountBindOptions) o;
    return Objects.equals(this.propagation, mountBindOptions.propagation) &&
        Objects.equals(this.nonRecursive, mountBindOptions.nonRecursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(propagation, nonRecursive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountBindOptions {\n");
    
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
    sb.append("    nonRecursive: ").append(toIndentedString(nonRecursive)).append("\n");
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

