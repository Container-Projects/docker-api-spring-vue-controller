package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.IPAM;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineObject2
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class InlineObject2   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("CheckDuplicate")
  private Boolean checkDuplicate;

  @JsonProperty("Driver")
  private String driver = "bridge";

  @JsonProperty("Internal")
  private Boolean internal;

  @JsonProperty("Attachable")
  private Boolean attachable;

  @JsonProperty("Ingress")
  private Boolean ingress;

  @JsonProperty("IPAM")
  private IPAM IPAM;

  @JsonProperty("EnableIPv6")
  private Boolean enableIPv6;

  @JsonProperty("Options")
  @Valid
  private Map<String, String> options = null;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  public InlineObject2 name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The network's name.
   * @return name
  */
  @ApiModelProperty(required = true, value = "The network's name.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineObject2 checkDuplicate(Boolean checkDuplicate) {
    this.checkDuplicate = checkDuplicate;
    return this;
  }

  /**
   * Check for networks with duplicate names. Since Network is primarily keyed based on a random ID and not on the name, and network name is strictly a user-friendly alias to the network which is uniquely identified using ID, there is no guaranteed way to check for duplicates. CheckDuplicate is there to provide a best effort checking of any networks which has the same name but it is not guaranteed to catch all name collisions. 
   * @return checkDuplicate
  */
  @ApiModelProperty(value = "Check for networks with duplicate names. Since Network is primarily keyed based on a random ID and not on the name, and network name is strictly a user-friendly alias to the network which is uniquely identified using ID, there is no guaranteed way to check for duplicates. CheckDuplicate is there to provide a best effort checking of any networks which has the same name but it is not guaranteed to catch all name collisions. ")


  public Boolean getCheckDuplicate() {
    return checkDuplicate;
  }

  public void setCheckDuplicate(Boolean checkDuplicate) {
    this.checkDuplicate = checkDuplicate;
  }

  public InlineObject2 driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the network driver plugin to use.
   * @return driver
  */
  @ApiModelProperty(value = "Name of the network driver plugin to use.")


  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }

  public InlineObject2 internal(Boolean internal) {
    this.internal = internal;
    return this;
  }

  /**
   * Restrict external access to the network.
   * @return internal
  */
  @ApiModelProperty(value = "Restrict external access to the network.")


  public Boolean getInternal() {
    return internal;
  }

  public void setInternal(Boolean internal) {
    this.internal = internal;
  }

  public InlineObject2 attachable(Boolean attachable) {
    this.attachable = attachable;
    return this;
  }

  /**
   * Globally scoped network is manually attachable by regular containers from workers in swarm mode. 
   * @return attachable
  */
  @ApiModelProperty(value = "Globally scoped network is manually attachable by regular containers from workers in swarm mode. ")


  public Boolean getAttachable() {
    return attachable;
  }

  public void setAttachable(Boolean attachable) {
    this.attachable = attachable;
  }

  public InlineObject2 ingress(Boolean ingress) {
    this.ingress = ingress;
    return this;
  }

  /**
   * Ingress network is the network which provides the routing-mesh in swarm mode. 
   * @return ingress
  */
  @ApiModelProperty(value = "Ingress network is the network which provides the routing-mesh in swarm mode. ")


  public Boolean getIngress() {
    return ingress;
  }

  public void setIngress(Boolean ingress) {
    this.ingress = ingress;
  }

  public InlineObject2 IPAM(IPAM IPAM) {
    this.IPAM = IPAM;
    return this;
  }

  /**
   * Get IPAM
   * @return IPAM
  */
  @ApiModelProperty(value = "")

  @Valid

  public IPAM getIPAM() {
    return IPAM;
  }

  public void setIPAM(IPAM IPAM) {
    this.IPAM = IPAM;
  }

  public InlineObject2 enableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
    return this;
  }

  /**
   * Enable IPv6 on the network.
   * @return enableIPv6
  */
  @ApiModelProperty(value = "Enable IPv6 on the network.")


  public Boolean getEnableIPv6() {
    return enableIPv6;
  }

  public void setEnableIPv6(Boolean enableIPv6) {
    this.enableIPv6 = enableIPv6;
  }

  public InlineObject2 options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public InlineObject2 putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * Network specific options to be used by the drivers.
   * @return options
  */
  @ApiModelProperty(value = "Network specific options to be used by the drivers.")


  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }

  public InlineObject2 labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public InlineObject2 putLabelsItem(String key, String labelsItem) {
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineObject2 inlineObject2 = (InlineObject2) o;
    return Objects.equals(this.name, inlineObject2.name) &&
        Objects.equals(this.checkDuplicate, inlineObject2.checkDuplicate) &&
        Objects.equals(this.driver, inlineObject2.driver) &&
        Objects.equals(this.internal, inlineObject2.internal) &&
        Objects.equals(this.attachable, inlineObject2.attachable) &&
        Objects.equals(this.ingress, inlineObject2.ingress) &&
        Objects.equals(this.IPAM, inlineObject2.IPAM) &&
        Objects.equals(this.enableIPv6, inlineObject2.enableIPv6) &&
        Objects.equals(this.options, inlineObject2.options) &&
        Objects.equals(this.labels, inlineObject2.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, checkDuplicate, driver, internal, attachable, ingress, IPAM, enableIPv6, options, labels);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineObject2 {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    checkDuplicate: ").append(toIndentedString(checkDuplicate)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    internal: ").append(toIndentedString(internal)).append("\n");
    sb.append("    attachable: ").append(toIndentedString(attachable)).append("\n");
    sb.append("    ingress: ").append(toIndentedString(ingress)).append("\n");
    sb.append("    IPAM: ").append(toIndentedString(IPAM)).append("\n");
    sb.append("    enableIPv6: ").append(toIndentedString(enableIPv6)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

