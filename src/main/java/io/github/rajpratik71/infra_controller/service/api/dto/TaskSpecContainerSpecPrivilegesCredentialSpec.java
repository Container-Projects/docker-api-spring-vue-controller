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
 * CredentialSpec for managed service account (Windows only)
 */
@ApiModel(description = "CredentialSpec for managed service account (Windows only)")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecContainerSpecPrivilegesCredentialSpec   {
  @JsonProperty("Config")
  private String config;

  @JsonProperty("File")
  private String file;

  @JsonProperty("Registry")
  private String registry;

  public TaskSpecContainerSpecPrivilegesCredentialSpec config(String config) {
    this.config = config;
    return this;
  }

  /**
   * Load credential spec from a Swarm Config with the given ID. The specified config must also be present in the Configs field with the Runtime property set.  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. 
   * @return config
  */
  @ApiModelProperty(example = "0bt9dmxjvjiqermk6xrop3ekq", value = "Load credential spec from a Swarm Config with the given ID. The specified config must also be present in the Configs field with the Runtime property set.  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ")


  public String getConfig() {
    return config;
  }

  public void setConfig(String config) {
    this.config = config;
  }

  public TaskSpecContainerSpecPrivilegesCredentialSpec file(String file) {
    this.file = file;
    return this;
  }

  /**
   * Load credential spec from this file. The file is read by the daemon, and must be present in the `CredentialSpecs` subdirectory in the docker data directory, which defaults to `C:\\ProgramData\\Docker\\` on Windows.  For example, specifying `spec.json` loads `C:\\ProgramData\\Docker\\CredentialSpecs\\spec.json`.  <p><br /></p>  > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. 
   * @return file
  */
  @ApiModelProperty(example = "spec.json", value = "Load credential spec from this file. The file is read by the daemon, and must be present in the `CredentialSpecs` subdirectory in the docker data directory, which defaults to `C:\\ProgramData\\Docker\\` on Windows.  For example, specifying `spec.json` loads `C:\\ProgramData\\Docker\\CredentialSpecs\\spec.json`.  <p><br /></p>  > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ")


  public String getFile() {
    return file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public TaskSpecContainerSpecPrivilegesCredentialSpec registry(String registry) {
    this.registry = registry;
    return this;
  }

  /**
   * Load credential spec from this value in the Windows registry. The specified registry value must be located in:  `HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Virtualization\\Containers\\CredentialSpecs`  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. 
   * @return registry
  */
  @ApiModelProperty(value = "Load credential spec from this value in the Windows registry. The specified registry value must be located in:  `HKLM\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Virtualization\\Containers\\CredentialSpecs`  <p><br /></p>   > **Note**: `CredentialSpec.File`, `CredentialSpec.Registry`, > and `CredentialSpec.Config` are mutually exclusive. ")


  public String getRegistry() {
    return registry;
  }

  public void setRegistry(String registry) {
    this.registry = registry;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecPrivilegesCredentialSpec taskSpecContainerSpecPrivilegesCredentialSpec = (TaskSpecContainerSpecPrivilegesCredentialSpec) o;
    return Objects.equals(this.config, taskSpecContainerSpecPrivilegesCredentialSpec.config) &&
        Objects.equals(this.file, taskSpecContainerSpecPrivilegesCredentialSpec.file) &&
        Objects.equals(this.registry, taskSpecContainerSpecPrivilegesCredentialSpec.registry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, file, registry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecPrivilegesCredentialSpec {\n");
    
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
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

