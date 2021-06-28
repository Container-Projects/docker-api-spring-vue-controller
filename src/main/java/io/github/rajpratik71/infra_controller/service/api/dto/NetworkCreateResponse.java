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
 * NetworkCreateResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class NetworkCreateResponse   {
  @JsonProperty("Id")
  private String id;

  @JsonProperty("Warning")
  private String warning;

  public NetworkCreateResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the created network.
   * @return id
  */
  @ApiModelProperty(value = "The ID of the created network.")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public NetworkCreateResponse warning(String warning) {
    this.warning = warning;
    return this;
  }

  /**
   * Get warning
   * @return warning
  */
  @ApiModelProperty(value = "")


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
    NetworkCreateResponse networkCreateResponse = (NetworkCreateResponse) o;
    return Objects.equals(this.id, networkCreateResponse.id) &&
        Objects.equals(this.warning, networkCreateResponse.warning);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warning);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkCreateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

