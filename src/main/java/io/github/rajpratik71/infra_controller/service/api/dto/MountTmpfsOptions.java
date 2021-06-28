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
 * Optional configuration for the &#x60;tmpfs&#x60; type.
 */
@ApiModel(description = "Optional configuration for the `tmpfs` type.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class MountTmpfsOptions   {
  @JsonProperty("SizeBytes")
  private Long sizeBytes;

  @JsonProperty("Mode")
  private Integer mode;

  public MountTmpfsOptions sizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * The size for the tmpfs mount in bytes.
   * @return sizeBytes
  */
  @ApiModelProperty(value = "The size for the tmpfs mount in bytes.")


  public Long getSizeBytes() {
    return sizeBytes;
  }

  public void setSizeBytes(Long sizeBytes) {
    this.sizeBytes = sizeBytes;
  }

  public MountTmpfsOptions mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * The permission mode for the tmpfs mount in an integer.
   * @return mode
  */
  @ApiModelProperty(value = "The permission mode for the tmpfs mount in an integer.")


  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountTmpfsOptions mountTmpfsOptions = (MountTmpfsOptions) o;
    return Objects.equals(this.sizeBytes, mountTmpfsOptions.sizeBytes) &&
        Objects.equals(this.mode, mountTmpfsOptions.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sizeBytes, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountTmpfsOptions {\n");
    
    sb.append("    sizeBytes: ").append(toIndentedString(sizeBytes)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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

