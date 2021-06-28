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
 * ImageDeleteResponseItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ImageDeleteResponseItem   {
  @JsonProperty("Untagged")
  private String untagged;

  @JsonProperty("Deleted")
  private String deleted;

  public ImageDeleteResponseItem untagged(String untagged) {
    this.untagged = untagged;
    return this;
  }

  /**
   * The image ID of an image that was untagged
   * @return untagged
  */
  @ApiModelProperty(value = "The image ID of an image that was untagged")


  public String getUntagged() {
    return untagged;
  }

  public void setUntagged(String untagged) {
    this.untagged = untagged;
  }

  public ImageDeleteResponseItem deleted(String deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * The image ID of an image that was deleted
   * @return deleted
  */
  @ApiModelProperty(value = "The image ID of an image that was deleted")


  public String getDeleted() {
    return deleted;
  }

  public void setDeleted(String deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageDeleteResponseItem imageDeleteResponseItem = (ImageDeleteResponseItem) o;
    return Objects.equals(this.untagged, imageDeleteResponseItem.untagged) &&
        Objects.equals(this.deleted, imageDeleteResponseItem.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(untagged, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageDeleteResponseItem {\n");
    
    sb.append("    untagged: ").append(toIndentedString(untagged)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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

