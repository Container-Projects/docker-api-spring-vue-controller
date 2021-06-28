package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.Driver;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConfigSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ConfigSpec   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("Data")
  private String data;

  @JsonProperty("Templating")
  private Driver templating;

  public ConfigSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User-defined name of the config.
   * @return name
  */
  @ApiModelProperty(value = "User-defined name of the config.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ConfigSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ConfigSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
  */
  @ApiModelProperty(value = "User-defined key/value metadata.")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ConfigSpec data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) config data. 
   * @return data
  */
  @ApiModelProperty(value = "Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) config data. ")


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public ConfigSpec templating(Driver templating) {
    this.templating = templating;
    return this;
  }

  /**
   * Get templating
   * @return templating
  */
  @ApiModelProperty(value = "")

  @Valid

  public Driver getTemplating() {
    return templating;
  }

  public void setTemplating(Driver templating) {
    this.templating = templating;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfigSpec configSpec = (ConfigSpec) o;
    return Objects.equals(this.name, configSpec.name) &&
        Objects.equals(this.labels, configSpec.labels) &&
        Objects.equals(this.data, configSpec.data) &&
        Objects.equals(this.templating, configSpec.templating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, data, templating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfigSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    templating: ").append(toIndentedString(templating)).append("\n");
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

