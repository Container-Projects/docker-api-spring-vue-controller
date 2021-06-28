package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemVersionComponents;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemVersionPlatform;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Response of Engine API: GET \&quot;/version\&quot; 
 */
@ApiModel(description = "Response of Engine API: GET \"/version\" ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemVersion   {
  @JsonProperty("Platform")
  private SystemVersionPlatform platform;

  @JsonProperty("Components")
  @Valid
  private List<SystemVersionComponents> components = null;

  @JsonProperty("Version")
  private String version;

  @JsonProperty("ApiVersion")
  private String apiVersion;

  @JsonProperty("MinAPIVersion")
  private String minAPIVersion;

  @JsonProperty("GitCommit")
  private String gitCommit;

  @JsonProperty("GoVersion")
  private String goVersion;

  @JsonProperty("Os")
  private String os;

  @JsonProperty("Arch")
  private String arch;

  @JsonProperty("KernelVersion")
  private String kernelVersion;

  @JsonProperty("Experimental")
  private Boolean experimental;

  @JsonProperty("BuildTime")
  private String buildTime;

  public SystemVersion platform(SystemVersionPlatform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemVersionPlatform getPlatform() {
    return platform;
  }

  public void setPlatform(SystemVersionPlatform platform) {
    this.platform = platform;
  }

  public SystemVersion components(List<SystemVersionComponents> components) {
    this.components = components;
    return this;
  }

  public SystemVersion addComponentsItem(SystemVersionComponents componentsItem) {
    if (this.components == null) {
      this.components = new ArrayList<>();
    }
    this.components.add(componentsItem);
    return this;
  }

  /**
   * Information about system components 
   * @return components
  */
  @ApiModelProperty(value = "Information about system components ")

  @Valid

  public List<SystemVersionComponents> getComponents() {
    return components;
  }

  public void setComponents(List<SystemVersionComponents> components) {
    this.components = components;
  }

  public SystemVersion version(String version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the daemon
   * @return version
  */
  @ApiModelProperty(example = "19.03.12", value = "The version of the daemon")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SystemVersion apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

  /**
   * The default (and highest) API version that is supported by the daemon 
   * @return apiVersion
  */
  @ApiModelProperty(example = "1.40", value = "The default (and highest) API version that is supported by the daemon ")


  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public SystemVersion minAPIVersion(String minAPIVersion) {
    this.minAPIVersion = minAPIVersion;
    return this;
  }

  /**
   * The minimum API version that is supported by the daemon 
   * @return minAPIVersion
  */
  @ApiModelProperty(example = "1.12", value = "The minimum API version that is supported by the daemon ")


  public String getMinAPIVersion() {
    return minAPIVersion;
  }

  public void setMinAPIVersion(String minAPIVersion) {
    this.minAPIVersion = minAPIVersion;
  }

  public SystemVersion gitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
    return this;
  }

  /**
   * The Git commit of the source code that was used to build the daemon 
   * @return gitCommit
  */
  @ApiModelProperty(example = "48a66213fe", value = "The Git commit of the source code that was used to build the daemon ")


  public String getGitCommit() {
    return gitCommit;
  }

  public void setGitCommit(String gitCommit) {
    this.gitCommit = gitCommit;
  }

  public SystemVersion goVersion(String goVersion) {
    this.goVersion = goVersion;
    return this;
  }

  /**
   * The version Go used to compile the daemon, and the version of the Go runtime in use. 
   * @return goVersion
  */
  @ApiModelProperty(example = "go1.13.14", value = "The version Go used to compile the daemon, and the version of the Go runtime in use. ")


  public String getGoVersion() {
    return goVersion;
  }

  public void setGoVersion(String goVersion) {
    this.goVersion = goVersion;
  }

  public SystemVersion os(String os) {
    this.os = os;
    return this;
  }

  /**
   * The operating system that the daemon is running on (\"linux\" or \"windows\") 
   * @return os
  */
  @ApiModelProperty(example = "linux", value = "The operating system that the daemon is running on (\"linux\" or \"windows\") ")


  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public SystemVersion arch(String arch) {
    this.arch = arch;
    return this;
  }

  /**
   * The architecture that the daemon is running on 
   * @return arch
  */
  @ApiModelProperty(example = "amd64", value = "The architecture that the daemon is running on ")


  public String getArch() {
    return arch;
  }

  public void setArch(String arch) {
    this.arch = arch;
  }

  public SystemVersion kernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
    return this;
  }

  /**
   * The kernel version (`uname -r`) that the daemon is running on.  This field is omitted when empty. 
   * @return kernelVersion
  */
  @ApiModelProperty(example = "4.19.76-linuxkit", value = "The kernel version (`uname -r`) that the daemon is running on.  This field is omitted when empty. ")


  public String getKernelVersion() {
    return kernelVersion;
  }

  public void setKernelVersion(String kernelVersion) {
    this.kernelVersion = kernelVersion;
  }

  public SystemVersion experimental(Boolean experimental) {
    this.experimental = experimental;
    return this;
  }

  /**
   * Indicates if the daemon is started with experimental features enabled.  This field is omitted when empty / false. 
   * @return experimental
  */
  @ApiModelProperty(example = "true", value = "Indicates if the daemon is started with experimental features enabled.  This field is omitted when empty / false. ")


  public Boolean getExperimental() {
    return experimental;
  }

  public void setExperimental(Boolean experimental) {
    this.experimental = experimental;
  }

  public SystemVersion buildTime(String buildTime) {
    this.buildTime = buildTime;
    return this;
  }

  /**
   * The date and time that the daemon was compiled. 
   * @return buildTime
  */
  @ApiModelProperty(example = "2020-06-22T15:49:27.000000000+00:00", value = "The date and time that the daemon was compiled. ")


  public String getBuildTime() {
    return buildTime;
  }

  public void setBuildTime(String buildTime) {
    this.buildTime = buildTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemVersion systemVersion = (SystemVersion) o;
    return Objects.equals(this.platform, systemVersion.platform) &&
        Objects.equals(this.components, systemVersion.components) &&
        Objects.equals(this.version, systemVersion.version) &&
        Objects.equals(this.apiVersion, systemVersion.apiVersion) &&
        Objects.equals(this.minAPIVersion, systemVersion.minAPIVersion) &&
        Objects.equals(this.gitCommit, systemVersion.gitCommit) &&
        Objects.equals(this.goVersion, systemVersion.goVersion) &&
        Objects.equals(this.os, systemVersion.os) &&
        Objects.equals(this.arch, systemVersion.arch) &&
        Objects.equals(this.kernelVersion, systemVersion.kernelVersion) &&
        Objects.equals(this.experimental, systemVersion.experimental) &&
        Objects.equals(this.buildTime, systemVersion.buildTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, components, version, apiVersion, minAPIVersion, gitCommit, goVersion, os, arch, kernelVersion, experimental, buildTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemVersion {\n");
    
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    minAPIVersion: ").append(toIndentedString(minAPIVersion)).append("\n");
    sb.append("    gitCommit: ").append(toIndentedString(gitCommit)).append("\n");
    sb.append("    goVersion: ").append(toIndentedString(goVersion)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
    sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
    sb.append("    experimental: ").append(toIndentedString(experimental)).append("\n");
    sb.append("    buildTime: ").append(toIndentedString(buildTime)).append("\n");
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

