package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.EngineDescriptionPlugins;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EngineDescription provides information about an engine.
 */
@ApiModel(description = "EngineDescription provides information about an engine.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class EngineDescription   {
  @JsonProperty("EngineVersion")
  private String engineVersion;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("Plugins")
  @Valid
  private List<EngineDescriptionPlugins> plugins = null;

  public EngineDescription engineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
    return this;
  }

  /**
   * Get engineVersion
   * @return engineVersion
  */
  @ApiModelProperty(example = "17.06.0", value = "")


  public String getEngineVersion() {
    return engineVersion;
  }

  public void setEngineVersion(String engineVersion) {
    this.engineVersion = engineVersion;
  }

  public EngineDescription labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public EngineDescription putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @ApiModelProperty(example = "{\"foo\":\"bar\"}", value = "")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public EngineDescription plugins(List<EngineDescriptionPlugins> plugins) {
    this.plugins = plugins;
    return this;
  }

  public EngineDescription addPluginsItem(EngineDescriptionPlugins pluginsItem) {
    if (this.plugins == null) {
      this.plugins = new ArrayList<>();
    }
    this.plugins.add(pluginsItem);
    return this;
  }

  /**
   * Get plugins
   * @return plugins
  */
  @ApiModelProperty(example = "[{Type=Log, Name=awslogs}, {Type=Log, Name=fluentd}, {Type=Log, Name=gcplogs}, {Type=Log, Name=gelf}, {Type=Log, Name=journald}, {Type=Log, Name=json-file}, {Type=Log, Name=logentries}, {Type=Log, Name=splunk}, {Type=Log, Name=syslog}, {Type=Network, Name=bridge}, {Type=Network, Name=host}, {Type=Network, Name=ipvlan}, {Type=Network, Name=macvlan}, {Type=Network, Name=null}, {Type=Network, Name=overlay}, {Type=Volume, Name=local}, {Type=Volume, Name=localhost:5000/vieux/sshfs:latest}, {Type=Volume, Name=vieux/sshfs:latest}]", value = "")

  @Valid

  public List<EngineDescriptionPlugins> getPlugins() {
    return plugins;
  }

  public void setPlugins(List<EngineDescriptionPlugins> plugins) {
    this.plugins = plugins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngineDescription engineDescription = (EngineDescription) o;
    return Objects.equals(this.engineVersion, engineDescription.engineVersion) &&
        Objects.equals(this.labels, engineDescription.labels) &&
        Objects.equals(this.plugins, engineDescription.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineVersion, labels, plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngineDescription {\n");
    
    sb.append("    engineVersion: ").append(toIndentedString(engineVersion)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

