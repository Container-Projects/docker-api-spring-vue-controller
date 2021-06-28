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
 * PluginConfigUser
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PluginConfigUser   {
  @JsonProperty("UID")
  private Integer UID;

  @JsonProperty("GID")
  private Integer GID;

  public PluginConfigUser UID(Integer UID) {
    this.UID = UID;
    return this;
  }

  /**
   * Get UID
   * @return UID
  */
  @ApiModelProperty(example = "1000", value = "")


  public Integer getUID() {
    return UID;
  }

  public void setUID(Integer UID) {
    this.UID = UID;
  }

  public PluginConfigUser GID(Integer GID) {
    this.GID = GID;
    return this;
  }

  /**
   * Get GID
   * @return GID
  */
  @ApiModelProperty(example = "1000", value = "")


  public Integer getGID() {
    return GID;
  }

  public void setGID(Integer GID) {
    this.GID = GID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigUser pluginConfigUser = (PluginConfigUser) o;
    return Objects.equals(this.UID, pluginConfigUser.UID) &&
        Objects.equals(this.GID, pluginConfigUser.GID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(UID, GID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigUser {\n");
    
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
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

