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
 * VolumePruneResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class VolumePruneResponse   {
  @JsonProperty("VolumesDeleted")
  @Valid
  private List<String> volumesDeleted = null;

  @JsonProperty("SpaceReclaimed")
  private Long spaceReclaimed;

  public VolumePruneResponse volumesDeleted(List<String> volumesDeleted) {
    this.volumesDeleted = volumesDeleted;
    return this;
  }

  public VolumePruneResponse addVolumesDeletedItem(String volumesDeletedItem) {
    if (this.volumesDeleted == null) {
      this.volumesDeleted = new ArrayList<>();
    }
    this.volumesDeleted.add(volumesDeletedItem);
    return this;
  }

  /**
   * Volumes that were deleted
   * @return volumesDeleted
  */
  @ApiModelProperty(value = "Volumes that were deleted")


  public List<String> getVolumesDeleted() {
    return volumesDeleted;
  }

  public void setVolumesDeleted(List<String> volumesDeleted) {
    this.volumesDeleted = volumesDeleted;
  }

  public VolumePruneResponse spaceReclaimed(Long spaceReclaimed) {
    this.spaceReclaimed = spaceReclaimed;
    return this;
  }

  /**
   * Disk space reclaimed in bytes
   * @return spaceReclaimed
  */
  @ApiModelProperty(value = "Disk space reclaimed in bytes")


  public Long getSpaceReclaimed() {
    return spaceReclaimed;
  }

  public void setSpaceReclaimed(Long spaceReclaimed) {
    this.spaceReclaimed = spaceReclaimed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumePruneResponse volumePruneResponse = (VolumePruneResponse) o;
    return Objects.equals(this.volumesDeleted, volumePruneResponse.volumesDeleted) &&
        Objects.equals(this.spaceReclaimed, volumePruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumesDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumePruneResponse {\n");
    
    sb.append("    volumesDeleted: ").append(toIndentedString(volumesDeleted)).append("\n");
    sb.append("    spaceReclaimed: ").append(toIndentedString(spaceReclaimed)).append("\n");
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

