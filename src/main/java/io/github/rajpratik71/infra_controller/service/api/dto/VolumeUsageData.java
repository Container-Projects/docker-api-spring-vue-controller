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
 * Usage details about the volume. This information is used by the &#x60;GET /system/df&#x60; endpoint, and omitted in other endpoints. 
 */
@ApiModel(description = "Usage details about the volume. This information is used by the `GET /system/df` endpoint, and omitted in other endpoints. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class VolumeUsageData   {
  @JsonProperty("Size")
  private Integer size;

  @JsonProperty("RefCount")
  private Integer refCount;

  public VolumeUsageData size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\") 
   * @return size
  */
  @ApiModelProperty(required = true, value = "Amount of disk space used by the volume (in bytes). This information is only available for volumes created with the `\"local\"` volume driver. For volumes created with other volume drivers, this field is set to `-1` (\"not available\") ")
  @NotNull


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public VolumeUsageData refCount(Integer refCount) {
    this.refCount = refCount;
    return this;
  }

  /**
   * The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available. 
   * @return refCount
  */
  @ApiModelProperty(required = true, value = "The number of containers referencing this volume. This field is set to `-1` if the reference-count is not available. ")
  @NotNull


  public Integer getRefCount() {
    return refCount;
  }

  public void setRefCount(Integer refCount) {
    this.refCount = refCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeUsageData volumeUsageData = (VolumeUsageData) o;
    return Objects.equals(this.size, volumeUsageData.size) &&
        Objects.equals(this.refCount, volumeUsageData.refCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(size, refCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeUsageData {\n");
    
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    refCount: ").append(toIndentedString(refCount)).append("\n");
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

