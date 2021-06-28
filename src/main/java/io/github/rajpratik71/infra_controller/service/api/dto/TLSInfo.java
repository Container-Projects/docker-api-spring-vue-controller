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
 * Information about the issuer of leaf TLS certificates and the trusted root CA certificate. 
 */
@ApiModel(description = "Information about the issuer of leaf TLS certificates and the trusted root CA certificate. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TLSInfo   {
  @JsonProperty("TrustRoot")
  private String trustRoot;

  @JsonProperty("CertIssuerSubject")
  private String certIssuerSubject;

  @JsonProperty("CertIssuerPublicKey")
  private String certIssuerPublicKey;

  public TLSInfo trustRoot(String trustRoot) {
    this.trustRoot = trustRoot;
    return this;
  }

  /**
   * The root CA certificate(s) that are used to validate leaf TLS certificates. 
   * @return trustRoot
  */
  @ApiModelProperty(value = "The root CA certificate(s) that are used to validate leaf TLS certificates. ")


  public String getTrustRoot() {
    return trustRoot;
  }

  public void setTrustRoot(String trustRoot) {
    this.trustRoot = trustRoot;
  }

  public TLSInfo certIssuerSubject(String certIssuerSubject) {
    this.certIssuerSubject = certIssuerSubject;
    return this;
  }

  /**
   * The base64-url-safe-encoded raw subject bytes of the issuer.
   * @return certIssuerSubject
  */
  @ApiModelProperty(value = "The base64-url-safe-encoded raw subject bytes of the issuer.")


  public String getCertIssuerSubject() {
    return certIssuerSubject;
  }

  public void setCertIssuerSubject(String certIssuerSubject) {
    this.certIssuerSubject = certIssuerSubject;
  }

  public TLSInfo certIssuerPublicKey(String certIssuerPublicKey) {
    this.certIssuerPublicKey = certIssuerPublicKey;
    return this;
  }

  /**
   * The base64-url-safe-encoded raw public key bytes of the issuer. 
   * @return certIssuerPublicKey
  */
  @ApiModelProperty(value = "The base64-url-safe-encoded raw public key bytes of the issuer. ")


  public String getCertIssuerPublicKey() {
    return certIssuerPublicKey;
  }

  public void setCertIssuerPublicKey(String certIssuerPublicKey) {
    this.certIssuerPublicKey = certIssuerPublicKey;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TLSInfo tlSInfo = (TLSInfo) o;
    return Objects.equals(this.trustRoot, tlSInfo.trustRoot) &&
        Objects.equals(this.certIssuerSubject, tlSInfo.certIssuerSubject) &&
        Objects.equals(this.certIssuerPublicKey, tlSInfo.certIssuerPublicKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trustRoot, certIssuerSubject, certIssuerPublicKey);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TLSInfo {\n");
    
    sb.append("    trustRoot: ").append(toIndentedString(trustRoot)).append("\n");
    sb.append("    certIssuerSubject: ").append(toIndentedString(certIssuerSubject)).append("\n");
    sb.append("    certIssuerPublicKey: ").append(toIndentedString(certIssuerPublicKey)).append("\n");
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

