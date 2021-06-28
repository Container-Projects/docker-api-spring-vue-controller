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
 * An object describing the resources which can be advertised by a node and requested by a task. 
 */
@ApiModel(description = "An object describing the resources which can be advertised by a node and requested by a task. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ResourceObject   {
  @JsonProperty("NanoCPUs")
  private Long nanoCPUs;

  @JsonProperty("MemoryBytes")
  private Long memoryBytes;

  @JsonProperty("GenericResources")
  @Valid
  private List<Object> genericResources = null;

  public ResourceObject nanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
    return this;
  }

  /**
   * Get nanoCPUs
   * @return nanoCPUs
  */
  @ApiModelProperty(example = "4000000000", value = "")


  public Long getNanoCPUs() {
    return nanoCPUs;
  }

  public void setNanoCPUs(Long nanoCPUs) {
    this.nanoCPUs = nanoCPUs;
  }

  public ResourceObject memoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
    return this;
  }

  /**
   * Get memoryBytes
   * @return memoryBytes
  */
  @ApiModelProperty(example = "8272408576", value = "")


  public Long getMemoryBytes() {
    return memoryBytes;
  }

  public void setMemoryBytes(Long memoryBytes) {
    this.memoryBytes = memoryBytes;
  }

  public ResourceObject genericResources(List<Object> genericResources) {
    this.genericResources = genericResources;
    return this;
  }

  public ResourceObject addGenericResourcesItem(Object genericResourcesItem) {
    if (this.genericResources == null) {
      this.genericResources = new ArrayList<>();
    }
    this.genericResources.add(genericResourcesItem);
    return this;
  }

  /**
   * User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). 
   * @return genericResources
  */
  @ApiModelProperty(example = "[{DiscreteResourceSpec={Kind=SSD, Value=3}}, {NamedResourceSpec={Kind=GPU, Value=UUID1}}, {NamedResourceSpec={Kind=GPU, Value=UUID2}}]", value = "User-defined resources can be either Integer resources (e.g, `SSD=3`) or String resources (e.g, `GPU=UUID1`). ")


  public List<Object> getGenericResources() {
    return genericResources;
  }

  public void setGenericResources(List<Object> genericResources) {
    this.genericResources = genericResources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceObject resourceObject = (ResourceObject) o;
    return Objects.equals(this.nanoCPUs, resourceObject.nanoCPUs) &&
        Objects.equals(this.memoryBytes, resourceObject.memoryBytes) &&
        Objects.equals(this.genericResources, resourceObject.genericResources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nanoCPUs, memoryBytes, genericResources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceObject {\n");
    
    sb.append("    nanoCPUs: ").append(toIndentedString(nanoCPUs)).append("\n");
    sb.append("    memoryBytes: ").append(toIndentedString(memoryBytes)).append("\n");
    sb.append("    genericResources: ").append(toIndentedString(genericResources)).append("\n");
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

