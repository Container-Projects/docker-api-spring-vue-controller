package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorDetail;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageID;
import io.github.rajpratik71.infra_controller.service.api.dto.ProgressDetail;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BuildInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class BuildInfo   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("stream")
  private String stream;

  @JsonProperty("error")
  private String error;

  @JsonProperty("errorDetail")
  private ErrorDetail errorDetail;

  @JsonProperty("status")
  private String status;

  @JsonProperty("progress")
  private String progress;

  @JsonProperty("progressDetail")
  private ProgressDetail progressDetail;

  @JsonProperty("aux")
  private ImageID aux;

  public BuildInfo id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BuildInfo stream(String stream) {
    this.stream = stream;
    return this;
  }

  /**
   * Get stream
   * @return stream
  */
  @ApiModelProperty(value = "")


  public String getStream() {
    return stream;
  }

  public void setStream(String stream) {
    this.stream = stream;
  }

  public BuildInfo error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
  */
  @ApiModelProperty(value = "")


  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public BuildInfo errorDetail(ErrorDetail errorDetail) {
    this.errorDetail = errorDetail;
    return this;
  }

  /**
   * Get errorDetail
   * @return errorDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public ErrorDetail getErrorDetail() {
    return errorDetail;
  }

  public void setErrorDetail(ErrorDetail errorDetail) {
    this.errorDetail = errorDetail;
  }

  public BuildInfo status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public BuildInfo progress(String progress) {
    this.progress = progress;
    return this;
  }

  /**
   * Get progress
   * @return progress
  */
  @ApiModelProperty(value = "")


  public String getProgress() {
    return progress;
  }

  public void setProgress(String progress) {
    this.progress = progress;
  }

  public BuildInfo progressDetail(ProgressDetail progressDetail) {
    this.progressDetail = progressDetail;
    return this;
  }

  /**
   * Get progressDetail
   * @return progressDetail
  */
  @ApiModelProperty(value = "")

  @Valid

  public ProgressDetail getProgressDetail() {
    return progressDetail;
  }

  public void setProgressDetail(ProgressDetail progressDetail) {
    this.progressDetail = progressDetail;
  }

  public BuildInfo aux(ImageID aux) {
    this.aux = aux;
    return this;
  }

  /**
   * Get aux
   * @return aux
  */
  @ApiModelProperty(value = "")

  @Valid

  public ImageID getAux() {
    return aux;
  }

  public void setAux(ImageID aux) {
    this.aux = aux;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildInfo buildInfo = (BuildInfo) o;
    return Objects.equals(this.id, buildInfo.id) &&
        Objects.equals(this.stream, buildInfo.stream) &&
        Objects.equals(this.error, buildInfo.error) &&
        Objects.equals(this.errorDetail, buildInfo.errorDetail) &&
        Objects.equals(this.status, buildInfo.status) &&
        Objects.equals(this.progress, buildInfo.progress) &&
        Objects.equals(this.progressDetail, buildInfo.progressDetail) &&
        Objects.equals(this.aux, buildInfo.aux);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, stream, error, errorDetail, status, progress, progressDetail, aux);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildInfo {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDetail: ").append(toIndentedString(errorDetail)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    progressDetail: ").append(toIndentedString(progressDetail)).append("\n");
    sb.append("    aux: ").append(toIndentedString(aux)).append("\n");
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

