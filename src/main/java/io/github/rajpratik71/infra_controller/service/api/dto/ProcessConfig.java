package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProcessConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ProcessConfig   {
  @JsonProperty("privileged")
  private Boolean privileged;

  @JsonProperty("user")
  private String user;

  @JsonProperty("tty")
  private Boolean tty;

  @JsonProperty("entrypoint")
  private String entrypoint;

  @JsonProperty("arguments")
  @Valid
  private List<String> arguments = null;

  public ProcessConfig privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Get privileged
   * @return privileged
  */
  @ApiModelProperty(value = "")


  public Boolean getPrivileged() {
    return privileged;
  }

  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }

  public ProcessConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
  */
  @ApiModelProperty(value = "")


  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ProcessConfig tty(Boolean tty) {
    this.tty = tty;
    return this;
  }

  /**
   * Get tty
   * @return tty
  */
  @ApiModelProperty(value = "")


  public Boolean getTty() {
    return tty;
  }

  public void setTty(Boolean tty) {
    this.tty = tty;
  }

  public ProcessConfig entrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
    return this;
  }

  /**
   * Get entrypoint
   * @return entrypoint
  */
  @ApiModelProperty(value = "")


  public String getEntrypoint() {
    return entrypoint;
  }

  public void setEntrypoint(String entrypoint) {
    this.entrypoint = entrypoint;
  }

  public ProcessConfig arguments(List<String> arguments) {
    this.arguments = arguments;
    return this;
  }

  public ProcessConfig addArgumentsItem(String argumentsItem) {
    if (this.arguments == null) {
      this.arguments = new ArrayList<>();
    }
    this.arguments.add(argumentsItem);
    return this;
  }

  /**
   * Get arguments
   * @return arguments
  */
  @ApiModelProperty(value = "")


  public List<String> getArguments() {
    return arguments;
  }

  public void setArguments(List<String> arguments) {
    this.arguments = arguments;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessConfig processConfig = (ProcessConfig) o;
    return Objects.equals(this.privileged, processConfig.privileged) &&
        Objects.equals(this.user, processConfig.user) &&
        Objects.equals(this.tty, processConfig.tty) &&
        Objects.equals(this.entrypoint, processConfig.entrypoint) &&
        Objects.equals(this.arguments, processConfig.arguments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privileged, user, tty, entrypoint, arguments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessConfig {\n");
    
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
    sb.append("    arguments: ").append(toIndentedString(arguments)).append("\n");
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

