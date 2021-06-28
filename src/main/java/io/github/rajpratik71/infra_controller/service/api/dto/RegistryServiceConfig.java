package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.IndexInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RegistryServiceConfig stores daemon registry services configuration. 
 */
@ApiModel(description = "RegistryServiceConfig stores daemon registry services configuration. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class RegistryServiceConfig   {
  @JsonProperty("AllowNondistributableArtifactsCIDRs")
  @Valid
  private List<String> allowNondistributableArtifactsCIDRs = null;

  @JsonProperty("AllowNondistributableArtifactsHostnames")
  @Valid
  private List<String> allowNondistributableArtifactsHostnames = null;

  @JsonProperty("InsecureRegistryCIDRs")
  @Valid
  private List<String> insecureRegistryCIDRs = null;

  @JsonProperty("IndexConfigs")
  @Valid
  private Map<String, IndexInfo> indexConfigs = null;

  @JsonProperty("Mirrors")
  @Valid
  private List<String> mirrors = null;

  public RegistryServiceConfig allowNondistributableArtifactsCIDRs(List<String> allowNondistributableArtifactsCIDRs) {
    this.allowNondistributableArtifactsCIDRs = allowNondistributableArtifactsCIDRs;
    return this;
  }

  public RegistryServiceConfig addAllowNondistributableArtifactsCIDRsItem(String allowNondistributableArtifactsCIDRsItem) {
    if (this.allowNondistributableArtifactsCIDRs == null) {
      this.allowNondistributableArtifactsCIDRs = new ArrayList<>();
    }
    this.allowNondistributableArtifactsCIDRs.add(allowNondistributableArtifactsCIDRsItem);
    return this;
  }

  /**
   * List of IP ranges to which nondistributable artifacts can be pushed, using the CIDR syntax [RFC 4632](https://tools.ietf.org/html/4632).  Some images (for example, Windows base images) contain artifacts whose distribution is restricted by license. When these images are pushed to a registry, restricted artifacts are not included.  This configuration override this behavior, and enables the daemon to push nondistributable artifacts to all registries whose resolved IP address is within the subnet described by the CIDR syntax.  This option is useful when pushing images containing nondistributable artifacts to a registry on an air-gapped network so hosts on that network can pull the images without connecting to another server.  > **Warning**: Nondistributable artifacts typically have restrictions > on how and where they can be distributed and shared. Only use this > feature to push artifacts to private registries and ensure that you > are in compliance with any terms that cover redistributing > nondistributable artifacts. 
   * @return allowNondistributableArtifactsCIDRs
  */
  @ApiModelProperty(example = "[::1/128, 127.0.0.0/8]", value = "List of IP ranges to which nondistributable artifacts can be pushed, using the CIDR syntax [RFC 4632](https://tools.ietf.org/html/4632).  Some images (for example, Windows base images) contain artifacts whose distribution is restricted by license. When these images are pushed to a registry, restricted artifacts are not included.  This configuration override this behavior, and enables the daemon to push nondistributable artifacts to all registries whose resolved IP address is within the subnet described by the CIDR syntax.  This option is useful when pushing images containing nondistributable artifacts to a registry on an air-gapped network so hosts on that network can pull the images without connecting to another server.  > **Warning**: Nondistributable artifacts typically have restrictions > on how and where they can be distributed and shared. Only use this > feature to push artifacts to private registries and ensure that you > are in compliance with any terms that cover redistributing > nondistributable artifacts. ")


  public List<String> getAllowNondistributableArtifactsCIDRs() {
    return allowNondistributableArtifactsCIDRs;
  }

  public void setAllowNondistributableArtifactsCIDRs(List<String> allowNondistributableArtifactsCIDRs) {
    this.allowNondistributableArtifactsCIDRs = allowNondistributableArtifactsCIDRs;
  }

  public RegistryServiceConfig allowNondistributableArtifactsHostnames(List<String> allowNondistributableArtifactsHostnames) {
    this.allowNondistributableArtifactsHostnames = allowNondistributableArtifactsHostnames;
    return this;
  }

  public RegistryServiceConfig addAllowNondistributableArtifactsHostnamesItem(String allowNondistributableArtifactsHostnamesItem) {
    if (this.allowNondistributableArtifactsHostnames == null) {
      this.allowNondistributableArtifactsHostnames = new ArrayList<>();
    }
    this.allowNondistributableArtifactsHostnames.add(allowNondistributableArtifactsHostnamesItem);
    return this;
  }

  /**
   * List of registry hostnames to which nondistributable artifacts can be pushed, using the format `<hostname>[:<port>]` or `<IP address>[:<port>]`.  Some images (for example, Windows base images) contain artifacts whose distribution is restricted by license. When these images are pushed to a registry, restricted artifacts are not included.  This configuration override this behavior for the specified registries.  This option is useful when pushing images containing nondistributable artifacts to a registry on an air-gapped network so hosts on that network can pull the images without connecting to another server.  > **Warning**: Nondistributable artifacts typically have restrictions > on how and where they can be distributed and shared. Only use this > feature to push artifacts to private registries and ensure that you > are in compliance with any terms that cover redistributing > nondistributable artifacts. 
   * @return allowNondistributableArtifactsHostnames
  */
  @ApiModelProperty(example = "[registry.internal.corp.example.com:3000, [2001:db8:a0b:12f0::1]:443]", value = "List of registry hostnames to which nondistributable artifacts can be pushed, using the format `<hostname>[:<port>]` or `<IP address>[:<port>]`.  Some images (for example, Windows base images) contain artifacts whose distribution is restricted by license. When these images are pushed to a registry, restricted artifacts are not included.  This configuration override this behavior for the specified registries.  This option is useful when pushing images containing nondistributable artifacts to a registry on an air-gapped network so hosts on that network can pull the images without connecting to another server.  > **Warning**: Nondistributable artifacts typically have restrictions > on how and where they can be distributed and shared. Only use this > feature to push artifacts to private registries and ensure that you > are in compliance with any terms that cover redistributing > nondistributable artifacts. ")


  public List<String> getAllowNondistributableArtifactsHostnames() {
    return allowNondistributableArtifactsHostnames;
  }

  public void setAllowNondistributableArtifactsHostnames(List<String> allowNondistributableArtifactsHostnames) {
    this.allowNondistributableArtifactsHostnames = allowNondistributableArtifactsHostnames;
  }

  public RegistryServiceConfig insecureRegistryCIDRs(List<String> insecureRegistryCIDRs) {
    this.insecureRegistryCIDRs = insecureRegistryCIDRs;
    return this;
  }

  public RegistryServiceConfig addInsecureRegistryCIDRsItem(String insecureRegistryCIDRsItem) {
    if (this.insecureRegistryCIDRs == null) {
      this.insecureRegistryCIDRs = new ArrayList<>();
    }
    this.insecureRegistryCIDRs.add(insecureRegistryCIDRsItem);
    return this;
  }

  /**
   * List of IP ranges of insecure registries, using the CIDR syntax ([RFC 4632](https://tools.ietf.org/html/4632)). Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  By default, local registries (`127.0.0.0/8`) are configured as insecure. All other registries are secure. Communicating with an insecure registry is not possible if the daemon assumes that registry is secure.  This configuration override this behavior, insecure communication with registries whose resolved IP address is within the subnet described by the CIDR syntax.  Registries can also be marked insecure by hostname. Those registries are listed under `IndexConfigs` and have their `Secure` field set to `false`.  > **Warning**: Using this option can be useful when running a local > registry, but introduces security vulnerabilities. This option > should therefore ONLY be used for testing purposes. For increased > security, users should add their CA to their system's list of trusted > CAs instead of enabling this option. 
   * @return insecureRegistryCIDRs
  */
  @ApiModelProperty(example = "[::1/128, 127.0.0.0/8]", value = "List of IP ranges of insecure registries, using the CIDR syntax ([RFC 4632](https://tools.ietf.org/html/4632)). Insecure registries accept un-encrypted (HTTP) and/or untrusted (HTTPS with certificates from unknown CAs) communication.  By default, local registries (`127.0.0.0/8`) are configured as insecure. All other registries are secure. Communicating with an insecure registry is not possible if the daemon assumes that registry is secure.  This configuration override this behavior, insecure communication with registries whose resolved IP address is within the subnet described by the CIDR syntax.  Registries can also be marked insecure by hostname. Those registries are listed under `IndexConfigs` and have their `Secure` field set to `false`.  > **Warning**: Using this option can be useful when running a local > registry, but introduces security vulnerabilities. This option > should therefore ONLY be used for testing purposes. For increased > security, users should add their CA to their system's list of trusted > CAs instead of enabling this option. ")


  public List<String> getInsecureRegistryCIDRs() {
    return insecureRegistryCIDRs;
  }

  public void setInsecureRegistryCIDRs(List<String> insecureRegistryCIDRs) {
    this.insecureRegistryCIDRs = insecureRegistryCIDRs;
  }

  public RegistryServiceConfig indexConfigs(Map<String, IndexInfo> indexConfigs) {
    this.indexConfigs = indexConfigs;
    return this;
  }

  public RegistryServiceConfig putIndexConfigsItem(String key, IndexInfo indexConfigsItem) {
    if (this.indexConfigs == null) {
      this.indexConfigs = new HashMap<>();
    }
    this.indexConfigs.put(key, indexConfigsItem);
    return this;
  }

  /**
   * Get indexConfigs
   * @return indexConfigs
  */
  @ApiModelProperty(example = "{\"127.0.0.1:5000\":{\"Name\":\"127.0.0.1:5000\",\"Mirrors\":[],\"Secure\":false,\"Official\":false},\"[2001:db8:a0b:12f0::1]:80\":{\"Name\":\"[2001:db8:a0b:12f0::1]:80\",\"Mirrors\":[],\"Secure\":false,\"Official\":false},\"docker.io\":{\"Name\":\"docker.io\",\"Mirrors\":[\"https://hub-mirror.corp.example.com:5000/\"],\"Secure\":true,\"Official\":true},\"registry.internal.corp.example.com:3000\":{\"Name\":\"registry.internal.corp.example.com:3000\",\"Mirrors\":[],\"Secure\":false,\"Official\":false}}", value = "")

  @Valid

  public Map<String, IndexInfo> getIndexConfigs() {
    return indexConfigs;
  }

  public void setIndexConfigs(Map<String, IndexInfo> indexConfigs) {
    this.indexConfigs = indexConfigs;
  }

  public RegistryServiceConfig mirrors(List<String> mirrors) {
    this.mirrors = mirrors;
    return this;
  }

  public RegistryServiceConfig addMirrorsItem(String mirrorsItem) {
    if (this.mirrors == null) {
      this.mirrors = new ArrayList<>();
    }
    this.mirrors.add(mirrorsItem);
    return this;
  }

  /**
   * List of registry URLs that act as a mirror for the official (`docker.io`) registry. 
   * @return mirrors
  */
  @ApiModelProperty(example = "[https://hub-mirror.corp.example.com:5000/, https://[2001:db8:a0b:12f0::1]/]", value = "List of registry URLs that act as a mirror for the official (`docker.io`) registry. ")


  public List<String> getMirrors() {
    return mirrors;
  }

  public void setMirrors(List<String> mirrors) {
    this.mirrors = mirrors;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RegistryServiceConfig registryServiceConfig = (RegistryServiceConfig) o;
    return Objects.equals(this.allowNondistributableArtifactsCIDRs, registryServiceConfig.allowNondistributableArtifactsCIDRs) &&
        Objects.equals(this.allowNondistributableArtifactsHostnames, registryServiceConfig.allowNondistributableArtifactsHostnames) &&
        Objects.equals(this.insecureRegistryCIDRs, registryServiceConfig.insecureRegistryCIDRs) &&
        Objects.equals(this.indexConfigs, registryServiceConfig.indexConfigs) &&
        Objects.equals(this.mirrors, registryServiceConfig.mirrors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowNondistributableArtifactsCIDRs, allowNondistributableArtifactsHostnames, insecureRegistryCIDRs, indexConfigs, mirrors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RegistryServiceConfig {\n");
    
    sb.append("    allowNondistributableArtifactsCIDRs: ").append(toIndentedString(allowNondistributableArtifactsCIDRs)).append("\n");
    sb.append("    allowNondistributableArtifactsHostnames: ").append(toIndentedString(allowNondistributableArtifactsHostnames)).append("\n");
    sb.append("    insecureRegistryCIDRs: ").append(toIndentedString(insecureRegistryCIDRs)).append("\n");
    sb.append("    indexConfigs: ").append(toIndentedString(indexConfigs)).append("\n");
    sb.append("    mirrors: ").append(toIndentedString(mirrors)).append("\n");
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

