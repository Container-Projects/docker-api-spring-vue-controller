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
 * Platform represents the platform (Arch/OS). 
 */
@ApiModel(description = "Platform represents the platform (Arch/OS). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Platform   {
  @JsonProperty("Architecture")
  private String architecture;

  @JsonProperty("OS")
  private String OS;

  public Platform architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Architecture represents the hardware architecture (for example, `x86_64`). 
   * @return architecture
  */
  @ApiModelProperty(example = "x86_64", value = "Architecture represents the hardware architecture (for example, `x86_64`). ")


  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public Platform OS(String OS) {
    this.OS = OS;
    return this;
  }

  /**
   * OS represents the Operating System (for example, `linux` or `windows`). 
   * @return OS
  */
  @ApiModelProperty(example = "linux", value = "OS represents the Operating System (for example, `linux` or `windows`). ")


  public String getOS() {
    return OS;
  }

  public void setOS(String OS) {
    this.OS = OS;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Platform platform = (Platform) o;
    return Objects.equals(this.architecture, platform.architecture) &&
        Objects.equals(this.OS, platform.OS);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, OS);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Platform {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
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

