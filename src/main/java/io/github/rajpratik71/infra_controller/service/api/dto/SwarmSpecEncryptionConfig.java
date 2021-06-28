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
 * Parameters related to encryption-at-rest.
 */
@ApiModel(description = "Parameters related to encryption-at-rest.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecEncryptionConfig   {
  @JsonProperty("AutoLockManagers")
  private Boolean autoLockManagers;

  public SwarmSpecEncryptionConfig autoLockManagers(Boolean autoLockManagers) {
    this.autoLockManagers = autoLockManagers;
    return this;
  }

  /**
   * If set, generate a key and use it to lock data stored on the managers. 
   * @return autoLockManagers
  */
  @ApiModelProperty(example = "false", value = "If set, generate a key and use it to lock data stored on the managers. ")


  public Boolean getAutoLockManagers() {
    return autoLockManagers;
  }

  public void setAutoLockManagers(Boolean autoLockManagers) {
    this.autoLockManagers = autoLockManagers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecEncryptionConfig swarmSpecEncryptionConfig = (SwarmSpecEncryptionConfig) o;
    return Objects.equals(this.autoLockManagers, swarmSpecEncryptionConfig.autoLockManagers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoLockManagers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecEncryptionConfig {\n");
    
    sb.append("    autoLockManagers: ").append(toIndentedString(autoLockManagers)).append("\n");
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

