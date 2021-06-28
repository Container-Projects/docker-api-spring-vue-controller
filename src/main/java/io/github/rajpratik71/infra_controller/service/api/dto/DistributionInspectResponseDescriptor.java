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
 * A descriptor struct containing digest, media type, and size. 
 */
@ApiModel(description = "A descriptor struct containing digest, media type, and size. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class DistributionInspectResponseDescriptor   {
  @JsonProperty("MediaType")
  private String mediaType;

  @JsonProperty("Size")
  private Long size;

  @JsonProperty("Digest")
  private String digest;

  @JsonProperty("URLs")
  @Valid
  private List<String> urLs = null;

  public DistributionInspectResponseDescriptor mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

  /**
   * Get mediaType
   * @return mediaType
  */
  @ApiModelProperty(value = "")


  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public DistributionInspectResponseDescriptor size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @ApiModelProperty(value = "")


  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public DistributionInspectResponseDescriptor digest(String digest) {
    this.digest = digest;
    return this;
  }

  /**
   * Get digest
   * @return digest
  */
  @ApiModelProperty(value = "")


  public String getDigest() {
    return digest;
  }

  public void setDigest(String digest) {
    this.digest = digest;
  }

  public DistributionInspectResponseDescriptor urLs(List<String> urLs) {
    this.urLs = urLs;
    return this;
  }

  public DistributionInspectResponseDescriptor addUrLsItem(String urLsItem) {
    if (this.urLs == null) {
      this.urLs = new ArrayList<>();
    }
    this.urLs.add(urLsItem);
    return this;
  }

  /**
   * Get urLs
   * @return urLs
  */
  @ApiModelProperty(value = "")


  public List<String> getUrLs() {
    return urLs;
  }

  public void setUrLs(List<String> urLs) {
    this.urLs = urLs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionInspectResponseDescriptor distributionInspectResponseDescriptor = (DistributionInspectResponseDescriptor) o;
    return Objects.equals(this.mediaType, distributionInspectResponseDescriptor.mediaType) &&
        Objects.equals(this.size, distributionInspectResponseDescriptor.size) &&
        Objects.equals(this.digest, distributionInspectResponseDescriptor.digest) &&
        Objects.equals(this.urLs, distributionInspectResponseDescriptor.urLs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, size, digest, urLs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionInspectResponseDescriptor {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    digest: ").append(toIndentedString(digest)).append("\n");
    sb.append("    urLs: ").append(toIndentedString(urLs)).append("\n");
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

