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
 * ContainerPruneResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ContainerPruneResponse   {
  @JsonProperty("ContainersDeleted")
  @Valid
  private List<String> containersDeleted = null;

  @JsonProperty("SpaceReclaimed")
  private Long spaceReclaimed;

  public ContainerPruneResponse containersDeleted(List<String> containersDeleted) {
    this.containersDeleted = containersDeleted;
    return this;
  }

  public ContainerPruneResponse addContainersDeletedItem(String containersDeletedItem) {
    if (this.containersDeleted == null) {
      this.containersDeleted = new ArrayList<>();
    }
    this.containersDeleted.add(containersDeletedItem);
    return this;
  }

  /**
   * Container IDs that were deleted
   * @return containersDeleted
  */
  @ApiModelProperty(value = "Container IDs that were deleted")


  public List<String> getContainersDeleted() {
    return containersDeleted;
  }

  public void setContainersDeleted(List<String> containersDeleted) {
    this.containersDeleted = containersDeleted;
  }

  public ContainerPruneResponse spaceReclaimed(Long spaceReclaimed) {
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
    ContainerPruneResponse containerPruneResponse = (ContainerPruneResponse) o;
    return Objects.equals(this.containersDeleted, containerPruneResponse.containersDeleted) &&
        Objects.equals(this.spaceReclaimed, containerPruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containersDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerPruneResponse {\n");
    
    sb.append("    containersDeleted: ").append(toIndentedString(containersDeleted)).append("\n");
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

