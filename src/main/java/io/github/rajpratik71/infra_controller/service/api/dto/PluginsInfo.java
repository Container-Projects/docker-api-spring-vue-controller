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
 * Available plugins per type.  &lt;p&gt;&lt;br /&gt;&lt;/p&gt;  &gt; **Note**: Only unmanaged (V1) plugins are included in this list. &gt; V1 plugins are \&quot;lazily\&quot; loaded, and are not returned in this list &gt; if there is no resource using the plugin. 
 */
@ApiModel(description = "Available plugins per type.  <p><br /></p>  > **Note**: Only unmanaged (V1) plugins are included in this list. > V1 plugins are \"lazily\" loaded, and are not returned in this list > if there is no resource using the plugin. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class PluginsInfo   {
  @JsonProperty("Volume")
  @Valid
  private List<String> volume = null;

  @JsonProperty("Network")
  @Valid
  private List<String> network = null;

  @JsonProperty("Authorization")
  @Valid
  private List<String> authorization = null;

  @JsonProperty("Log")
  @Valid
  private List<String> log = null;

  public PluginsInfo volume(List<String> volume) {
    this.volume = volume;
    return this;
  }

  public PluginsInfo addVolumeItem(String volumeItem) {
    if (this.volume == null) {
      this.volume = new ArrayList<>();
    }
    this.volume.add(volumeItem);
    return this;
  }

  /**
   * Names of available volume-drivers, and network-driver plugins.
   * @return volume
  */
  @ApiModelProperty(example = "[local]", value = "Names of available volume-drivers, and network-driver plugins.")


  public List<String> getVolume() {
    return volume;
  }

  public void setVolume(List<String> volume) {
    this.volume = volume;
  }

  public PluginsInfo network(List<String> network) {
    this.network = network;
    return this;
  }

  public PluginsInfo addNetworkItem(String networkItem) {
    if (this.network == null) {
      this.network = new ArrayList<>();
    }
    this.network.add(networkItem);
    return this;
  }

  /**
   * Names of available network-drivers, and network-driver plugins.
   * @return network
  */
  @ApiModelProperty(example = "[bridge, host, ipvlan, macvlan, null, overlay]", value = "Names of available network-drivers, and network-driver plugins.")


  public List<String> getNetwork() {
    return network;
  }

  public void setNetwork(List<String> network) {
    this.network = network;
  }

  public PluginsInfo authorization(List<String> authorization) {
    this.authorization = authorization;
    return this;
  }

  public PluginsInfo addAuthorizationItem(String authorizationItem) {
    if (this.authorization == null) {
      this.authorization = new ArrayList<>();
    }
    this.authorization.add(authorizationItem);
    return this;
  }

  /**
   * Names of available authorization plugins.
   * @return authorization
  */
  @ApiModelProperty(example = "[img-authz-plugin, hbm]", value = "Names of available authorization plugins.")


  public List<String> getAuthorization() {
    return authorization;
  }

  public void setAuthorization(List<String> authorization) {
    this.authorization = authorization;
  }

  public PluginsInfo log(List<String> log) {
    this.log = log;
    return this;
  }

  public PluginsInfo addLogItem(String logItem) {
    if (this.log == null) {
      this.log = new ArrayList<>();
    }
    this.log.add(logItem);
    return this;
  }

  /**
   * Names of available logging-drivers, and logging-driver plugins.
   * @return log
  */
  @ApiModelProperty(example = "[awslogs, fluentd, gcplogs, gelf, journald, json-file, logentries, splunk, syslog]", value = "Names of available logging-drivers, and logging-driver plugins.")


  public List<String> getLog() {
    return log;
  }

  public void setLog(List<String> log) {
    this.log = log;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginsInfo pluginsInfo = (PluginsInfo) o;
    return Objects.equals(this.volume, pluginsInfo.volume) &&
        Objects.equals(this.network, pluginsInfo.network) &&
        Objects.equals(this.authorization, pluginsInfo.authorization) &&
        Objects.equals(this.log, pluginsInfo.log);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volume, network, authorization, log);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginsInfo {\n");
    
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    authorization: ").append(toIndentedString(authorization)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
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

