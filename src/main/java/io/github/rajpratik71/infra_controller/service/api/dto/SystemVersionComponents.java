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
 * SystemVersionComponents
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemVersionComponents   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Version")
  private String version;

  @JsonProperty("Details")
  private JsonNullable<Object> details = JsonNullable.undefined();

  public SystemVersionComponents name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the component 
   * @return name
  */
  @ApiModelProperty(example = "Engine", required = true, value = "Name of the component ")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SystemVersionComponents version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the component 
   * @return version
  */
  @ApiModelProperty(example = "19.03.12", required = true, value = "Version of the component ")
  @NotNull


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SystemVersionComponents details(Object details) {
    this.details = JsonNullable.of(details);
    return this;
  }

  /**
   * Key/value pairs of strings with additional information about the component. These values are intended for informational purposes only, and their content is not defined, and not part of the API specification.  These messages can be printed by the client as information to the user. 
   * @return details
  */
  @ApiModelProperty(value = "Key/value pairs of strings with additional information about the component. These values are intended for informational purposes only, and their content is not defined, and not part of the API specification.  These messages can be printed by the client as information to the user. ")


  public JsonNullable<Object> getDetails() {
    return details;
  }

  public void setDetails(JsonNullable<Object> details) {
    this.details = details;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemVersionComponents systemVersionComponents = (SystemVersionComponents) o;
    return Objects.equals(this.name, systemVersionComponents.name) &&
        Objects.equals(this.version, systemVersionComponents.version) &&
        Objects.equals(this.details, systemVersionComponents.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, version, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemVersionComponents {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

