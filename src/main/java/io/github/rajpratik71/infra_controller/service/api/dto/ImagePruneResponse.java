package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageDeleteResponseItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImagePruneResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ImagePruneResponse   {
  @JsonProperty("ImagesDeleted")
  @Valid
  private List<ImageDeleteResponseItem> imagesDeleted = null;

  @JsonProperty("SpaceReclaimed")
  private Long spaceReclaimed;

  public ImagePruneResponse imagesDeleted(List<ImageDeleteResponseItem> imagesDeleted) {
    this.imagesDeleted = imagesDeleted;
    return this;
  }

  public ImagePruneResponse addImagesDeletedItem(ImageDeleteResponseItem imagesDeletedItem) {
    if (this.imagesDeleted == null) {
      this.imagesDeleted = new ArrayList<>();
    }
    this.imagesDeleted.add(imagesDeletedItem);
    return this;
  }

  /**
   * Images that were deleted
   * @return imagesDeleted
  */
  @ApiModelProperty(value = "Images that were deleted")

  @Valid

  public List<ImageDeleteResponseItem> getImagesDeleted() {
    return imagesDeleted;
  }

  public void setImagesDeleted(List<ImageDeleteResponseItem> imagesDeleted) {
    this.imagesDeleted = imagesDeleted;
  }

  public ImagePruneResponse spaceReclaimed(Long spaceReclaimed) {
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
    ImagePruneResponse imagePruneResponse = (ImagePruneResponse) o;
    return Objects.equals(this.imagesDeleted, imagePruneResponse.imagesDeleted) &&
        Objects.equals(this.spaceReclaimed, imagePruneResponse.spaceReclaimed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imagesDeleted, spaceReclaimed);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImagePruneResponse {\n");
    
    sb.append("    imagesDeleted: ").append(toIndentedString(imagesDeleted)).append("\n");
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

