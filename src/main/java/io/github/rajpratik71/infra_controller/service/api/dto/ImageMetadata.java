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
 * ImageMetadata
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ImageMetadata   {
  @JsonProperty("LastTagTime")
  private String lastTagTime;

  public ImageMetadata lastTagTime(String lastTagTime) {
    this.lastTagTime = lastTagTime;
    return this;
  }

  /**
   * Get lastTagTime
   * @return lastTagTime
  */
  @ApiModelProperty(value = "")


  public String getLastTagTime() {
    return lastTagTime;
  }

  public void setLastTagTime(String lastTagTime) {
    this.lastTagTime = lastTagTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageMetadata imageMetadata = (ImageMetadata) o;
    return Objects.equals(this.lastTagTime, imageMetadata.lastTagTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastTagTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageMetadata {\n");
    
    sb.append("    lastTagTime: ").append(toIndentedString(lastTagTime)).append("\n");
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

