package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecCAConfigExternalCAs;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CA configuration.
 */
@ApiModel(description = "CA configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecCAConfig   {
  @JsonProperty("NodeCertExpiry")
  private Long nodeCertExpiry;

  @JsonProperty("ExternalCAs")
  @Valid
  private List<SwarmSpecCAConfigExternalCAs> externalCAs = null;

  @JsonProperty("SigningCACert")
  private String signingCACert;

  @JsonProperty("SigningCAKey")
  private String signingCAKey;

  @JsonProperty("ForceRotate")
  private Integer forceRotate;

  public SwarmSpecCAConfig nodeCertExpiry(Long nodeCertExpiry) {
    this.nodeCertExpiry = nodeCertExpiry;
    return this;
  }

  /**
   * The duration node certificates are issued for.
   * @return nodeCertExpiry
  */
  @ApiModelProperty(example = "7776000000000000", value = "The duration node certificates are issued for.")


  public Long getNodeCertExpiry() {
    return nodeCertExpiry;
  }

  public void setNodeCertExpiry(Long nodeCertExpiry) {
    this.nodeCertExpiry = nodeCertExpiry;
  }

  public SwarmSpecCAConfig externalCAs(List<SwarmSpecCAConfigExternalCAs> externalCAs) {
    this.externalCAs = externalCAs;
    return this;
  }

  public SwarmSpecCAConfig addExternalCAsItem(SwarmSpecCAConfigExternalCAs externalCAsItem) {
    if (this.externalCAs == null) {
      this.externalCAs = new ArrayList<>();
    }
    this.externalCAs.add(externalCAsItem);
    return this;
  }

  /**
   * Configuration for forwarding signing requests to an external certificate authority. 
   * @return externalCAs
  */
  @ApiModelProperty(value = "Configuration for forwarding signing requests to an external certificate authority. ")

  @Valid

  public List<SwarmSpecCAConfigExternalCAs> getExternalCAs() {
    return externalCAs;
  }

  public void setExternalCAs(List<SwarmSpecCAConfigExternalCAs> externalCAs) {
    this.externalCAs = externalCAs;
  }

  public SwarmSpecCAConfig signingCACert(String signingCACert) {
    this.signingCACert = signingCACert;
    return this;
  }

  /**
   * The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format. 
   * @return signingCACert
  */
  @ApiModelProperty(value = "The desired signing CA certificate for all swarm node TLS leaf certificates, in PEM format. ")


  public String getSigningCACert() {
    return signingCACert;
  }

  public void setSigningCACert(String signingCACert) {
    this.signingCACert = signingCACert;
  }

  public SwarmSpecCAConfig signingCAKey(String signingCAKey) {
    this.signingCAKey = signingCAKey;
    return this;
  }

  /**
   * The desired signing CA key for all swarm node TLS leaf certificates, in PEM format. 
   * @return signingCAKey
  */
  @ApiModelProperty(value = "The desired signing CA key for all swarm node TLS leaf certificates, in PEM format. ")


  public String getSigningCAKey() {
    return signingCAKey;
  }

  public void setSigningCAKey(String signingCAKey) {
    this.signingCAKey = signingCAKey;
  }

  public SwarmSpecCAConfig forceRotate(Integer forceRotate) {
    this.forceRotate = forceRotate;
    return this;
  }

  /**
   * An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey` 
   * @return forceRotate
  */
  @ApiModelProperty(value = "An integer whose purpose is to force swarm to generate a new signing CA certificate and key, if none have been specified in `SigningCACert` and `SigningCAKey` ")


  public Integer getForceRotate() {
    return forceRotate;
  }

  public void setForceRotate(Integer forceRotate) {
    this.forceRotate = forceRotate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecCAConfig swarmSpecCAConfig = (SwarmSpecCAConfig) o;
    return Objects.equals(this.nodeCertExpiry, swarmSpecCAConfig.nodeCertExpiry) &&
        Objects.equals(this.externalCAs, swarmSpecCAConfig.externalCAs) &&
        Objects.equals(this.signingCACert, swarmSpecCAConfig.signingCACert) &&
        Objects.equals(this.signingCAKey, swarmSpecCAConfig.signingCAKey) &&
        Objects.equals(this.forceRotate, swarmSpecCAConfig.forceRotate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeCertExpiry, externalCAs, signingCACert, signingCAKey, forceRotate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecCAConfig {\n");
    
    sb.append("    nodeCertExpiry: ").append(toIndentedString(nodeCertExpiry)).append("\n");
    sb.append("    externalCAs: ").append(toIndentedString(externalCAs)).append("\n");
    sb.append("    signingCACert: ").append(toIndentedString(signingCACert)).append("\n");
    sb.append("    signingCAKey: ").append(toIndentedString(signingCAKey)).append("\n");
    sb.append("    forceRotate: ").append(toIndentedString(forceRotate)).append("\n");
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

