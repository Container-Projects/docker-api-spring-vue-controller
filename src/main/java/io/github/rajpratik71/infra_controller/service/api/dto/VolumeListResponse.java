package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Volume list response
 */
@ApiModel(description = "Volume list response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class VolumeListResponse   {
  @JsonProperty("Volumes")
  @Valid
  private List<Volume> volumes = new ArrayList<>();

  @JsonProperty("Warnings")
  @Valid
  private List<String> warnings = new ArrayList<>();

  public VolumeListResponse volumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public VolumeListResponse addVolumesItem(Volume volumesItem) {
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * List of volumes
   * @return volumes
  */
  @ApiModelProperty(required = true, value = "List of volumes")
  @NotNull

  @Valid

  public List<Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
  }

  public VolumeListResponse warnings(List<String> warnings) {
    this.warnings = warnings;
    return this;
  }

  public VolumeListResponse addWarningsItem(String warningsItem) {
    this.warnings.add(warningsItem);
    return this;
  }

  /**
   * Warnings that occurred when fetching the list of volumes. 
   * @return warnings
  */
  @ApiModelProperty(required = true, value = "Warnings that occurred when fetching the list of volumes. ")
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
    VolumeListResponse volumeListResponse = (VolumeListResponse) o;
    return Objects.equals(this.volumes, volumeListResponse.volumes) &&
        Objects.equals(this.warnings, volumeListResponse.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumes, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeListResponse {\n");
    
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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

