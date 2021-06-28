package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NodeSpec
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class NodeSpec   {
  @JsonProperty("Name")
  private String name;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = null;

  /**
   * Role of the node.
   */
  public enum RoleEnum {
    WORKER("worker"),
    
    MANAGER("manager");

    private String value;

    RoleEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static RoleEnum fromValue(String value) {
      for (RoleEnum b : RoleEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Role")
  private RoleEnum role;

  /**
   * Availability of the node.
   */
  public enum AvailabilityEnum {
    ACTIVE("active"),
    
    PAUSE("pause"),
    
    DRAIN("drain");

    private String value;

    AvailabilityEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AvailabilityEnum fromValue(String value) {
      for (AvailabilityEnum b : AvailabilityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Availability")
  private AvailabilityEnum availability;

  public NodeSpec name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name for the node.
   * @return name
  */
  @ApiModelProperty(example = "my-node", value = "Name for the node.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NodeSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public NodeSpec putLabelsItem(String key, String labelsItem) {
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

  public NodeSpec role(RoleEnum role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the node.
   * @return role
  */
  @ApiModelProperty(example = "manager", value = "Role of the node.")


  public RoleEnum getRole() {
    return role;
  }

  public void setRole(RoleEnum role) {
    this.role = role;
  }

  public NodeSpec availability(AvailabilityEnum availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Availability of the node.
   * @return availability
  */
  @ApiModelProperty(example = "active", value = "Availability of the node.")


  public AvailabilityEnum getAvailability() {
    return availability;
  }

  public void setAvailability(AvailabilityEnum availability) {
    this.availability = availability;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NodeSpec nodeSpec = (NodeSpec) o;
    return Objects.equals(this.name, nodeSpec.name) &&
        Objects.equals(this.labels, nodeSpec.labels) &&
        Objects.equals(this.role, nodeSpec.role) &&
        Objects.equals(this.availability, nodeSpec.availability);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, labels, role, availability);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NodeSpec {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
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

