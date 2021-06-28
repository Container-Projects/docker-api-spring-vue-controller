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
 * SELinux labels of the container
 */
@ApiModel(description = "SELinux labels of the container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecContainerSpecPrivilegesSELinuxContext   {
  @JsonProperty("Disable")
  private Boolean disable;

  @JsonProperty("User")
  private String user;

  @JsonProperty("Role")
  private String role;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Level")
  private String level;

  public TaskSpecContainerSpecPrivilegesSELinuxContext disable(Boolean disable) {
    this.disable = disable;
    return this;
  }

  /**
   * Disable SELinux
   * @return disable
  */
  @ApiModelProperty(value = "Disable SELinux")


  public Boolean getDisable() {
    return disable;
  }

  public void setDisable(Boolean disable) {
    this.disable = disable;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext user(String user) {
    this.user = user;
    return this;
  }

  /**
   * SELinux user label
   * @return user
  */
  @ApiModelProperty(value = "SELinux user label")


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext role(String role) {
    this.role = role;
    return this;
  }

  /**
   * SELinux role label
   * @return role
  */
  @ApiModelProperty(value = "SELinux role label")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext type(String type) {
    this.type = type;
    return this;
  }

  /**
   * SELinux type label
   * @return type
  */
  @ApiModelProperty(value = "SELinux type label")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public TaskSpecContainerSpecPrivilegesSELinuxContext level(String level) {
    this.level = level;
    return this;
  }

  /**
   * SELinux level label
   * @return level
  */
  @ApiModelProperty(value = "SELinux level label")


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivilegesSELinuxContext taskSpecContainerSpecPrivilegesSELinuxContext = (TaskSpecContainerSpecPrivilegesSELinuxContext) o;
    return Objects.equals(this.disable, taskSpecContainerSpecPrivilegesSELinuxContext.disable) &&
        Objects.equals(this.user, taskSpecContainerSpecPrivilegesSELinuxContext.user) &&
        Objects.equals(this.role, taskSpecContainerSpecPrivilegesSELinuxContext.role) &&
        Objects.equals(this.type, taskSpecContainerSpecPrivilegesSELinuxContext.type) &&
        Objects.equals(this.level, taskSpecContainerSpecPrivilegesSELinuxContext.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(disable, user, role, type, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivilegesSELinuxContext {\n");
    
    sb.append("    disable: ").append(toIndentedString(disable)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

