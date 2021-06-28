package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Plugin spec for the service.  *(Experimental release only.)*  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are &gt; mutually exclusive. PluginSpec is only used when the Runtime field &gt; is set to &#x60;plugin&#x60;. NetworkAttachmentSpec is used when the Runtime &gt; field is set to &#x60;attachment&#x60;. 
 */
@ApiModel(description = "Plugin spec for the service.  *(Experimental release only.)*  <p><br /></p>  > **Note**: ContainerSpec, NetworkAttachmentSpec, and PluginSpec are > mutually exclusive. PluginSpec is only used when the Runtime field > is set to `plugin`. NetworkAttachmentSpec is used when the Runtime > field is set to `attachment`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecPluginSpec   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Remote")
  private String remote;

  @JsonProperty("Disabled")
  private Boolean disabled;

  @JsonProperty("PluginPrivilege")
  @Valid
  private List<InlineObject> pluginPrivilege = null;

  public TaskSpecPluginSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name or 'alias' to use for the plugin.
   * @return name
  */
  @ApiModelProperty(value = "The name or 'alias' to use for the plugin.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TaskSpecPluginSpec remote(String remote) {
    this.remote = remote;
    return this;
  }

  /**
   * The plugin image reference to use.
   * @return remote
  */
  @ApiModelProperty(value = "The plugin image reference to use.")


  public String getRemote() {
    return remote;
  }

  public void setRemote(String remote) {
    this.remote = remote;
  }

  public TaskSpecPluginSpec disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Disable the plugin once scheduled.
   * @return disabled
  */
  @ApiModelProperty(value = "Disable the plugin once scheduled.")


  public Boolean getDisabled() {
    return disabled;
  }

  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  public TaskSpecPluginSpec pluginPrivilege(List<InlineObject> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
    return this;
  }

  public TaskSpecPluginSpec addPluginPrivilegeItem(InlineObject pluginPrivilegeItem) {
    if (this.pluginPrivilege == null) {
      this.pluginPrivilege = new ArrayList<>();
    }
    this.pluginPrivilege.add(pluginPrivilegeItem);
    return this;
  }

  /**
   * Get pluginPrivilege
   * @return pluginPrivilege
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<InlineObject> getPluginPrivilege() {
    return pluginPrivilege;
  }

  public void setPluginPrivilege(List<InlineObject> pluginPrivilege) {
    this.pluginPrivilege = pluginPrivilege;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPluginSpec taskSpecPluginSpec = (TaskSpecPluginSpec) o;
    return Objects.equals(this.name, taskSpecPluginSpec.name) &&
        Objects.equals(this.remote, taskSpecPluginSpec.remote) &&
        Objects.equals(this.disabled, taskSpecPluginSpec.disabled) &&
        Objects.equals(this.pluginPrivilege, taskSpecPluginSpec.pluginPrivilege);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, remote, disabled, pluginPrivilege);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPluginSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    remote: ").append(toIndentedString(remote)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    pluginPrivilege: ").append(toIndentedString(pluginPrivilege)).append("\n");
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

