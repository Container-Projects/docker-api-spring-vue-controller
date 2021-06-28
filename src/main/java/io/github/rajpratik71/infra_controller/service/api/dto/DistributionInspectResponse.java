package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.DistributionInspectResponseDescriptor;
import io.github.rajpratik71.infra_controller.service.api.dto.DistributionInspectResponsePlatforms;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DistributionInspectResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class DistributionInspectResponse   {
  @JsonProperty("Descriptor")
  private DistributionInspectResponseDescriptor descriptor;

  @JsonProperty("Platforms")
  @Valid
  private List<DistributionInspectResponsePlatforms> platforms = new ArrayList<>();

  public DistributionInspectResponse descriptor(DistributionInspectResponseDescriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public DistributionInspectResponseDescriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(DistributionInspectResponseDescriptor descriptor) {
    this.descriptor = descriptor;
  }

  public DistributionInspectResponse platforms(List<DistributionInspectResponsePlatforms> platforms) {
    this.platforms = platforms;
    return this;
  }

  public DistributionInspectResponse addPlatformsItem(DistributionInspectResponsePlatforms platformsItem) {
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * An array containing all platforms supported by the image. 
   * @return platforms
  */
  @ApiModelProperty(required = true, value = "An array containing all platforms supported by the image. ")
  @NotNull

  @Valid

  public List<DistributionInspectResponsePlatforms> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<DistributionInspectResponsePlatforms> platforms) {
    this.platforms = platforms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionInspectResponse distributionInspectResponse = (DistributionInspectResponse) o;
    return Objects.equals(this.descriptor, distributionInspectResponse.descriptor) &&
        Objects.equals(this.platforms, distributionInspectResponse.platforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(descriptor, platforms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionInspectResponse {\n");
    
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
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

