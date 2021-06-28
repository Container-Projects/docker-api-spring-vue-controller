package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecCAConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecDispatcher;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecEncryptionConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecOrchestration;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecRaft;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpecTaskDefaults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User modifiable swarm configuration.
 */
@ApiModel(description = "User modifiable swarm configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpec   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  @JsonProperty("Orchestration")
  private JsonNullable<SwarmSpecOrchestration> orchestration = JsonNullable.undefined();

  @JsonProperty("Raft")
  private SwarmSpecRaft raft;

  @JsonProperty("Dispatcher")
  private JsonNullable<SwarmSpecDispatcher> dispatcher = JsonNullable.undefined();

  @JsonProperty("CAConfig")
  private JsonNullable<SwarmSpecCAConfig> caConfig = JsonNullable.undefined();

  @JsonProperty("EncryptionConfig")
  private SwarmSpecEncryptionConfig encryptionConfig;

  @JsonProperty("TaskDefaults")
  private SwarmSpecTaskDefaults taskDefaults;

  public SwarmSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the swarm.
   * @return name
  */
  @ApiModelProperty(example = "default", value = "Name of the swarm.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SwarmSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public SwarmSpec putLabelsItem(String key, String labelsItem) {
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
  @ApiModelProperty(example = "{\"com.example.corp.type\":\"production\",\"com.example.corp.department\":\"engineering\"}", value = "User-defined key/value metadata.")


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public SwarmSpec orchestration(SwarmSpecOrchestration orchestration) {
    this.orchestration = JsonNullable.of(orchestration);
    return this;
  }

  /**
   * Get orchestration
   * @return orchestration
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SwarmSpecOrchestration> getOrchestration() {
    return orchestration;
  }

  public void setOrchestration(JsonNullable<SwarmSpecOrchestration> orchestration) {
    this.orchestration = orchestration;
  }

  public SwarmSpec raft(SwarmSpecRaft raft) {
    this.raft = raft;
    return this;
  }

  /**
   * Get raft
   * @return raft
  */
  @ApiModelProperty(value = "")

  @Valid

  public SwarmSpecRaft getRaft() {
    return raft;
  }

  public void setRaft(SwarmSpecRaft raft) {
    this.raft = raft;
  }

  public SwarmSpec dispatcher(SwarmSpecDispatcher dispatcher) {
    this.dispatcher = JsonNullable.of(dispatcher);
    return this;
  }

  /**
   * Get dispatcher
   * @return dispatcher
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SwarmSpecDispatcher> getDispatcher() {
    return dispatcher;
  }

  public void setDispatcher(JsonNullable<SwarmSpecDispatcher> dispatcher) {
    this.dispatcher = dispatcher;
  }

  public SwarmSpec caConfig(SwarmSpecCAConfig caConfig) {
    this.caConfig = JsonNullable.of(caConfig);
    return this;
  }

  /**
   * Get caConfig
   * @return caConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public JsonNullable<SwarmSpecCAConfig> getCaConfig() {
    return caConfig;
  }

  public void setCaConfig(JsonNullable<SwarmSpecCAConfig> caConfig) {
    this.caConfig = caConfig;
  }

  public SwarmSpec encryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

  /**
   * Get encryptionConfig
   * @return encryptionConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public SwarmSpecEncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  public void setEncryptionConfig(SwarmSpecEncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
  }

  public SwarmSpec taskDefaults(SwarmSpecTaskDefaults taskDefaults) {
    this.taskDefaults = taskDefaults;
    return this;
  }

  /**
   * Get taskDefaults
   * @return taskDefaults
  */
  @ApiModelProperty(value = "")

  @Valid

  public SwarmSpecTaskDefaults getTaskDefaults() {
    return taskDefaults;
  }

  public void setTaskDefaults(SwarmSpecTaskDefaults taskDefaults) {
    this.taskDefaults = taskDefaults;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpec swarmSpec = (SwarmSpec) o;
    return Objects.equals(this.name, swarmSpec.name) &&
        Objects.equals(this.labels, swarmSpec.labels) &&
        Objects.equals(this.orchestration, swarmSpec.orchestration) &&
        Objects.equals(this.raft, swarmSpec.raft) &&
        Objects.equals(this.dispatcher, swarmSpec.dispatcher) &&
        Objects.equals(this.caConfig, swarmSpec.caConfig) &&
        Objects.equals(this.encryptionConfig, swarmSpec.encryptionConfig) &&
        Objects.equals(this.taskDefaults, swarmSpec.taskDefaults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, orchestration, raft, dispatcher, caConfig, encryptionConfig, taskDefaults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    orchestration: ").append(toIndentedString(orchestration)).append("\n");
    sb.append("    raft: ").append(toIndentedString(raft)).append("\n");
    sb.append("    dispatcher: ").append(toIndentedString(dispatcher)).append("\n");
    sb.append("    caConfig: ").append(toIndentedString(caConfig)).append("\n");
    sb.append("    encryptionConfig: ").append(toIndentedString(encryptionConfig)).append("\n");
    sb.append("    taskDefaults: ").append(toIndentedString(taskDefaults)).append("\n");
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

