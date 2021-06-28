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
 * File represents a specific target that is backed by a file. 
 */
@ApiModel(description = "File represents a specific target that is backed by a file. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecContainerSpecFile   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("UID")
  private String UID;

  @JsonProperty("GID")
  private String GID;

  @JsonProperty("Mode")
  private Integer mode;

  public TaskSpecContainerSpecFile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name represents the final filename in the filesystem. 
   * @return name
  */
  @ApiModelProperty(value = "Name represents the final filename in the filesystem. ")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskSpecContainerSpecFile UID(String UID) {
    this.UID = UID;
    return this;
  }

  /**
   * UID represents the file UID.
   * @return UID
  */
  @ApiModelProperty(value = "UID represents the file UID.")


  public String getUID() {
    return UID;
  }

  public void setUID(String UID) {
    this.UID = UID;
  }

  public TaskSpecContainerSpecFile GID(String GID) {
    this.GID = GID;
    return this;
  }

  /**
   * GID represents the file GID.
   * @return GID
  */
  @ApiModelProperty(value = "GID represents the file GID.")


  public String getGID() {
    return GID;
  }

  public void setGID(String GID) {
    this.GID = GID;
  }

  public TaskSpecContainerSpecFile mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Mode represents the FileMode of the file.
   * @return mode
  */
  @ApiModelProperty(value = "Mode represents the FileMode of the file.")


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
    TaskSpecContainerSpecFile taskSpecContainerSpecFile = (TaskSpecContainerSpecFile) o;
    return Objects.equals(this.name, taskSpecContainerSpecFile.name) &&
        Objects.equals(this.UID, taskSpecContainerSpecFile.UID) &&
        Objects.equals(this.GID, taskSpecContainerSpecFile.GID) &&
        Objects.equals(this.mode, taskSpecContainerSpecFile.mode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, UID, GID, mode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecFile {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
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

