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
 * SecretSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SecretSpec   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("Data")
  private String data;

  @JsonProperty("Driver")
  private Driver driver;

  @JsonProperty("Templating")
  private Driver templating;

  public SecretSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * User-defined name of the secret.
   * @return name
  */
  @ApiModelProperty(value = "User-defined name of the secret.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecretSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SecretSpec putLabelsItem(String key, String labelsItem) {
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
  @ApiModelProperty(example = "{\"com.example.some-label\":\"some-value\",\"com.example.some-other-label\":\"some-other-value\"}", value = "User-defined key/value metadata.")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public SecretSpec data(String data) {
    this.data = data;
    return this;
  }

  /**
   * Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints. 
   * @return data
  */
  @ApiModelProperty(example = "", value = "Base64-url-safe-encoded ([RFC 4648](https://tools.ietf.org/html/rfc4648#section-5)) data to store as secret.  This field is only used to _create_ a secret, and is not returned by other endpoints. ")


  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public SecretSpec driver(Driver driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Get driver
   * @return driver
  */
  @ApiModelProperty(value = "")

  @Valid

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public SecretSpec templating(Driver templating) {
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
    SecretSpec secretSpec = (SecretSpec) o;
    return Objects.equals(this.name, secretSpec.name) &&
        Objects.equals(this.labels, secretSpec.labels) &&
        Objects.equals(this.data, secretSpec.data) &&
        Objects.equals(this.driver, secretSpec.driver) &&
        Objects.equals(this.templating, secretSpec.templating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, data, driver, templating);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecretSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
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

