package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.JoinTokens;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SwarmAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmAllOf   {
  @JsonProperty("JoinTokens")
  private JoinTokens joinTokens;

  public SwarmAllOf joinTokens(JoinTokens joinTokens) {
    this.joinTokens = joinTokens;
    return this;
  }

  /**
   * Get joinTokens
   * @return joinTokens
  */
  @ApiModelProperty(value = "")

  @Valid

  public JoinTokens getJoinTokens() {
    return joinTokens;
  }

  public void setJoinTokens(JoinTokens joinTokens) {
    this.joinTokens = joinTokens;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmAllOf swarmAllOf = (SwarmAllOf) o;
    return Objects.equals(this.joinTokens, swarmAllOf.joinTokens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(joinTokens);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmAllOf {\n");
    
    sb.append("    joinTokens: ").append(toIndentedString(joinTokens)).append("\n");
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

