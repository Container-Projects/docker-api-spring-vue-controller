package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse400
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineResponse400   {
  @JsonProperty("ErrorResponse")
  private ErrorResponse errorResponse;

  @JsonProperty("message")
  private String message;

  public InlineResponse400 errorResponse(ErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
    return this;
  }

  /**
   * Get errorResponse
   * @return errorResponse
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorResponse getErrorResponse() {
    return errorResponse;
  }

  public void setErrorResponse(ErrorResponse errorResponse) {
    this.errorResponse = errorResponse;
  }

  public InlineResponse400 message(String message) {
    this.message = message;
    return this;
  }

  /**
   * The error message. Either \"must specify path parameter\" (path cannot be empty) or \"not a directory\" (path was asserted to be a directory but exists as a file). 
   * @return message
  */
  @ApiModelProperty(value = "The error message. Either \"must specify path parameter\" (path cannot be empty) or \"not a directory\" (path was asserted to be a directory but exists as a file). ")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.errorResponse, inlineResponse400.errorResponse) &&
        Objects.equals(this.message, inlineResponse400.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorResponse, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("    errorResponse: ").append(toIndentedString(errorResponse)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

