package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecContainerSpecFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskSpecContainerSpecSecrets
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecContainerSpecSecrets   {
  @JsonProperty("File")
  private TaskSpecContainerSpecFile file;

  @JsonProperty("SecretID")
  private String secretID;

  @JsonProperty("SecretName")
  private String secretName;

  public TaskSpecContainerSpecSecrets file(TaskSpecContainerSpecFile file) {
    this.file = file;
    return this;
  }

  /**
   * Get file
   * @return file
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecContainerSpecFile getFile() {
    return file;
  }

  public void setFile(TaskSpecContainerSpecFile file) {
    this.file = file;
  }

  public TaskSpecContainerSpecSecrets secretID(String secretID) {
    this.secretID = secretID;
    return this;
  }

  /**
   * SecretID represents the ID of the specific secret that we're referencing. 
   * @return secretID
  */
  @ApiModelProperty(value = "SecretID represents the ID of the specific secret that we're referencing. ")


  public String getSecretID() {
    return secretID;
  }

  public void setSecretID(String secretID) {
    this.secretID = secretID;
  }

  public TaskSpecContainerSpecSecrets secretName(String secretName) {
    this.secretName = secretName;
    return this;
  }

  /**
   * SecretName is the name of the secret that this references, but this is just provided for lookup/display purposes. The secret in the reference will be identified by its ID. 
   * @return secretName
  */
  @ApiModelProperty(value = "SecretName is the name of the secret that this references, but this is just provided for lookup/display purposes. The secret in the reference will be identified by its ID. ")


  public String getSecretName() {
    return secretName;
  }

  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecSecrets taskSpecContainerSpecSecrets = (TaskSpecContainerSpecSecrets) o;
    return Objects.equals(this.file, taskSpecContainerSpecSecrets.file) &&
        Objects.equals(this.secretID, taskSpecContainerSpecSecrets.secretID) &&
        Objects.equals(this.secretName, taskSpecContainerSpecSecrets.secretName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, secretID, secretName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecSecrets {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    secretID: ").append(toIndentedString(secretID)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
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

