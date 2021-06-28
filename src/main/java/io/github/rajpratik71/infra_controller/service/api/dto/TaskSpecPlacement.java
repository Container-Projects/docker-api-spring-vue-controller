package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.Platform;
import io.github.rajpratik71.infra_controller.service.api.dto.TaskSpecPlacementPreferences;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TaskSpecPlacement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecPlacement   {
  @JsonProperty("Constraints")
  @Valid
  private List<String> constraints = null;

  @JsonProperty("Preferences")
  @Valid
  private List<TaskSpecPlacementPreferences> preferences = null;

  @JsonProperty("MaxReplicas")
  private Long maxReplicas = 0l;

  @JsonProperty("Platforms")
  @Valid
  private List<Platform> platforms = null;

  public TaskSpecPlacement constraints(List<String> constraints) {
    this.constraints = constraints;
    return this;
  }

  public TaskSpecPlacement addConstraintsItem(String constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

  /**
   * An array of constraint expressions to limit the set of nodes where a task can be scheduled. Constraint expressions can either use a _match_ (`==`) or _exclude_ (`!=`) rule. Multiple constraints find nodes that satisfy every expression (AND match). Constraints can match node or Docker Engine labels as follows:  node attribute       | matches                        | example ---------------------|--------------------------------|----------------------------------------------- `node.id`            | Node ID                        | `node.id==2ivku8v2gvtg4` `node.hostname`      | Node hostname                  | `node.hostname!=node-2` `node.role`          | Node role (`manager`/`worker`) | `node.role==manager` `node.platform.os`   | Node operating system          | `node.platform.os==windows` `node.platform.arch` | Node architecture              | `node.platform.arch==x86_64` `node.labels`        | User-defined node labels       | `node.labels.security==high` `engine.labels`      | Docker Engine's labels         | `engine.labels.operatingsystem==ubuntu-14.04`  `engine.labels` apply to Docker Engine labels like operating system, drivers, etc. Swarm administrators add `node.labels` for operational purposes by using the [`node update endpoint`](#operation/NodeUpdate). 
   * @return constraints
  */
  @ApiModelProperty(example = "[node.hostname!=node3.corp.example.com, node.role!=manager, node.labels.type==production, node.platform.os==linux, node.platform.arch==x86_64]", value = "An array of constraint expressions to limit the set of nodes where a task can be scheduled. Constraint expressions can either use a _match_ (`==`) or _exclude_ (`!=`) rule. Multiple constraints find nodes that satisfy every expression (AND match). Constraints can match node or Docker Engine labels as follows:  node attribute       | matches                        | example ---------------------|--------------------------------|----------------------------------------------- `node.id`            | Node ID                        | `node.id==2ivku8v2gvtg4` `node.hostname`      | Node hostname                  | `node.hostname!=node-2` `node.role`          | Node role (`manager`/`worker`) | `node.role==manager` `node.platform.os`   | Node operating system          | `node.platform.os==windows` `node.platform.arch` | Node architecture              | `node.platform.arch==x86_64` `node.labels`        | User-defined node labels       | `node.labels.security==high` `engine.labels`      | Docker Engine's labels         | `engine.labels.operatingsystem==ubuntu-14.04`  `engine.labels` apply to Docker Engine labels like operating system, drivers, etc. Swarm administrators add `node.labels` for operational purposes by using the [`node update endpoint`](#operation/NodeUpdate). ")


  public List<String> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<String> constraints) {
    this.constraints = constraints;
  }

  public TaskSpecPlacement preferences(List<TaskSpecPlacementPreferences> preferences) {
    this.preferences = preferences;
    return this;
  }

  public TaskSpecPlacement addPreferencesItem(TaskSpecPlacementPreferences preferencesItem) {
    if (this.preferences == null) {
      this.preferences = new ArrayList<>();
    }
    this.preferences.add(preferencesItem);
    return this;
  }

  /**
   * Preferences provide a way to make the scheduler aware of factors such as topology. They are provided in order from highest to lowest precedence. 
   * @return preferences
  */
  @ApiModelProperty(example = "[{Spread={SpreadDescriptor=node.labels.datacenter}}, {Spread={SpreadDescriptor=node.labels.rack}}]", value = "Preferences provide a way to make the scheduler aware of factors such as topology. They are provided in order from highest to lowest precedence. ")

  @Valid

  public List<TaskSpecPlacementPreferences> getPreferences() {
    return preferences;
  }

  public void setPreferences(List<TaskSpecPlacementPreferences> preferences) {
    this.preferences = preferences;
  }

  public TaskSpecPlacement maxReplicas(Long maxReplicas) {
    this.maxReplicas = maxReplicas;
    return this;
  }

  /**
   * Maximum number of replicas for per node (default value is 0, which is unlimited) 
   * @return maxReplicas
  */
  @ApiModelProperty(value = "Maximum number of replicas for per node (default value is 0, which is unlimited) ")


  public Long getMaxReplicas() {
    return maxReplicas;
  }

  public void setMaxReplicas(Long maxReplicas) {
    this.maxReplicas = maxReplicas;
  }

  public TaskSpecPlacement platforms(List<Platform> platforms) {
    this.platforms = platforms;
    return this;
  }

  public TaskSpecPlacement addPlatformsItem(Platform platformsItem) {
    if (this.platforms == null) {
      this.platforms = new ArrayList<>();
    }
    this.platforms.add(platformsItem);
    return this;
  }

  /**
   * Platforms stores all the platforms that the service's image can run on. This field is used in the platform filter for scheduling. If empty, then the platform filter is off, meaning there are no scheduling restrictions. 
   * @return platforms
  */
  @ApiModelProperty(value = "Platforms stores all the platforms that the service's image can run on. This field is used in the platform filter for scheduling. If empty, then the platform filter is off, meaning there are no scheduling restrictions. ")

  @Valid

  public List<Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<Platform> platforms) {
    this.platforms = platforms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecPlacement taskSpecPlacement = (TaskSpecPlacement) o;
    return Objects.equals(this.constraints, taskSpecPlacement.constraints) &&
        Objects.equals(this.preferences, taskSpecPlacement.preferences) &&
        Objects.equals(this.maxReplicas, taskSpecPlacement.maxReplicas) &&
        Objects.equals(this.platforms, taskSpecPlacement.platforms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(constraints, preferences, maxReplicas, platforms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecPlacement {\n");
    
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    preferences: ").append(toIndentedString(preferences)).append("\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
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

