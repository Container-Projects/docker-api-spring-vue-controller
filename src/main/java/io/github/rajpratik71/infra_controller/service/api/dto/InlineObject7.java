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
 * InlineObject7
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineObject7   {
  @JsonProperty("UnlockKey")
  private String unlockKey;

  public InlineObject7 unlockKey(String unlockKey) {
    this.unlockKey = unlockKey;
    return this;
  }

  /**
   * The swarm's unlock key.
   * @return unlockKey
  */
  @ApiModelProperty(value = "The swarm's unlock key.")


  public String getUnlockKey() {
    return unlockKey;
  }

  public void setUnlockKey(String unlockKey) {
    this.unlockKey = unlockKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject7 inlineObject7 = (InlineObject7) o;
    return Objects.equals(this.unlockKey, inlineObject7.unlockKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unlockKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject7 {\n");
    
    sb.append("    unlockKey: ").append(toIndentedString(unlockKey)).append("\n");
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

