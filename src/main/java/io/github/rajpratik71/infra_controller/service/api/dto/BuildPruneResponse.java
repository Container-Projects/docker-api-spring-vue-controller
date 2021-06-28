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
 * BuildPruneResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class BuildPruneResponse   {
  @JsonProperty("CachesDeleted")
  @Valid
  private List<String> cachesDeleted = null;

  @JsonProperty("SpaceReclaimed")
  private Long spaceReclaimed;

  public BuildPruneResponse cachesDeleted(List<String> cachesDeleted) {
    this.cachesDeleted = cachesDeleted;
    return this;
  }

  public BuildPruneResponse addCachesDeletedItem(String cachesDeletedItem) {
    if (this.cachesDeleted == null) {
      this.cachesDeleted = new ArrayList<>();
    }
    this.cachesDeleted.add(cachesDeletedItem);
    return this;
  }

  /**
   * Get cachesDeleted
   * @return cachesDeleted
  */
  @ApiModelProperty(value = "")


  public List<String> getCachesDeleted() {
    return cachesDeleted;
  }

  public void setCachesDeleted(List<String> cachesDeleted) {
    this.cachesDeleted = cachesDeleted;
  }

  public BuildPruneResponse spaceReclaimed(Long spaceReclaimed) {
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
    BuildPruneResponse buildPruneResponse = (BuildPruneResponse) o;
    return Objects.equals(this.cachesDeleted, buildPruneResponse.cachesDeleted) &&
        Objects.equals(this.spaceReclaimed, buildPruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cachesDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildPruneResponse {\n");
    
    sb.append("    cachesDeleted: ").append(toIndentedString(cachesDeleted)).append("\n");
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

