package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OK response to ContainerCreate operation
 */
@ApiModel(description = "OK response to ContainerCreate operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ContainerCreateResponse   {
  @JsonProperty("Id")
  private String id;

  @JsonProperty("Warnings")
  @Valid
  private List<String> warnings = new ArrayList<>();

  public ContainerCreateResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the created container
   * @return id
  */
  @ApiModelProperty(required = true, value = "The ID of the created container")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ContainerCreateResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public ContainerCreateResponse addWarningsItem(String warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Warnings encountered when creating the container
   * @return warnings
  */
  @ApiModelProperty(required = true, value = "Warnings encountered when creating the container")
  @NotNull


  public List<String> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<String> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerCreateResponse containerCreateResponse = (ContainerCreateResponse) o;
    return Objects.equals(this.id, containerCreateResponse.id) &&
        Objects.equals(this.warnings, containerCreateResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerCreateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

