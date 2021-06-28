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
 * SystemAuthResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemAuthResponse   {
  @JsonProperty("Status")
  private String status;

  @JsonProperty("IdentityToken")
  private String identityToken;

  public SystemAuthResponse status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the authentication
   * @return status
  */
  @ApiModelProperty(required = true, value = "The status of the authentication")
  @NotNull


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SystemAuthResponse identityToken(String identityToken) {
    this.identityToken = identityToken;
    return this;
  }

  /**
   * An opaque token used to authenticate a user after a successful login
   * @return identityToken
  */
  @ApiModelProperty(value = "An opaque token used to authenticate a user after a successful login")


  public String getIdentityToken() {
    return identityToken;
  }

  public void setIdentityToken(String identityToken) {
    this.identityToken = identityToken;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemAuthResponse systemAuthResponse = (SystemAuthResponse) o;
    return Objects.equals(this.status, systemAuthResponse.status) &&
        Objects.equals(this.identityToken, systemAuthResponse.identityToken);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, identityToken);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemAuthResponse {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    identityToken: ").append(toIndentedString(identityToken)).append("\n");
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

