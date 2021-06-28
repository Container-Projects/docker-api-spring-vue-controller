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
 * ServiceCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ServiceCreateResponse   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Warning")
  private String warning;

  public ServiceCreateResponse ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The ID of the created service.
   * @return ID
  */
  @ApiModelProperty(value = "The ID of the created service.")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public ServiceCreateResponse warning(String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Optional warning message
   * @return warning
  */
  @ApiModelProperty(value = "Optional warning message")


  public String getWarning() {
    return warning;
  }

  public void setWarning(String warning) {
    this.warning = warning;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceCreateResponse serviceCreateResponse = (ServiceCreateResponse) o;
    return Objects.equals(this.ID, serviceCreateResponse.ID) &&
        Objects.equals(this.warning, serviceCreateResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceCreateResponse {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    warning: ").append(toIndentedString(warning)).append("\n");
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

