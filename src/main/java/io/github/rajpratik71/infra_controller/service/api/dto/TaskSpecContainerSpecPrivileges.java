package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecContainerSpecPrivilegesCredentialSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecContainerSpecPrivilegesSELinuxContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Security options for the container
 */
@ApiModel(description = "Security options for the container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecContainerSpecPrivileges   {
  @JsonProperty("CredentialSpec")
  private TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec;

  @JsonProperty("SELinuxContext")
  private TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext;

  public TaskSpecContainerSpecPrivileges credentialSpec(TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec) {
    this.credentialSpec = credentialSpec;
    return this;
  }

  /**
   * Get credentialSpec
   * @return credentialSpec
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecContainerSpecPrivilegesCredentialSpec getCredentialSpec() {
    return credentialSpec;
  }

  public void setCredentialSpec(TaskSpecContainerSpecPrivilegesCredentialSpec credentialSpec) {
    this.credentialSpec = credentialSpec;
  }

  public TaskSpecContainerSpecPrivileges seLinuxContext(TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext) {
    this.seLinuxContext = seLinuxContext;
    return this;
  }

  /**
   * Get seLinuxContext
   * @return seLinuxContext
  */
  @ApiModelProperty(value = "")

  @Valid

  public TaskSpecContainerSpecPrivilegesSELinuxContext getSeLinuxContext() {
    return seLinuxContext;
  }

  public void setSeLinuxContext(TaskSpecContainerSpecPrivilegesSELinuxContext seLinuxContext) {
    this.seLinuxContext = seLinuxContext;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivileges taskSpecContainerSpecPrivileges = (TaskSpecContainerSpecPrivileges) o;
    return Objects.equals(this.credentialSpec, taskSpecContainerSpecPrivileges.credentialSpec) &&
        Objects.equals(this.seLinuxContext, taskSpecContainerSpecPrivileges.seLinuxContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(credentialSpec, seLinuxContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivileges {\n");
    
    sb.append("    credentialSpec: ").append(toIndentedString(credentialSpec)).append("\n");
    sb.append("    seLinuxContext: ").append(toIndentedString(seLinuxContext)).append("\n");
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

