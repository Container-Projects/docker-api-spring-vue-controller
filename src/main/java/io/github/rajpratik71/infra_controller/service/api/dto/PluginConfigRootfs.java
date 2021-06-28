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
 * PluginConfigRootfs
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PluginConfigRootfs   {
  @JsonProperty("type")
  private String type;

  @JsonProperty("diff_ids")
  @Valid
  private List<String> diffIds = null;

  public PluginConfigRootfs type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(example = "layers", value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PluginConfigRootfs diffIds(List<String> diffIds) {
    this.diffIds = diffIds;
    return this;
  }

  public PluginConfigRootfs addDiffIdsItem(String diffIdsItem) {
    if (this.diffIds == null) {
      this.diffIds = new ArrayList<>();
    }
    this.diffIds.add(diffIdsItem);
    return this;
  }

  /**
   * Get diffIds
   * @return diffIds
  */
  @ApiModelProperty(example = "[sha256:675532206fbf3030b8458f88d6e26d4eb1577688a25efec97154c94e8b6b4887, sha256:e216a057b1cb1efc11f8a268f37ef62083e70b1b38323ba252e25ac88904a7e8]", value = "")


  public List<String> getDiffIds() {
    return diffIds;
  }

  public void setDiffIds(List<String> diffIds) {
    this.diffIds = diffIds;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigRootfs pluginConfigRootfs = (PluginConfigRootfs) o;
    return Objects.equals(this.type, pluginConfigRootfs.type) &&
        Objects.equals(this.diffIds, pluginConfigRootfs.diffIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, diffIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigRootfs {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    diffIds: ").append(toIndentedString(diffIds)).append("\n");
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

