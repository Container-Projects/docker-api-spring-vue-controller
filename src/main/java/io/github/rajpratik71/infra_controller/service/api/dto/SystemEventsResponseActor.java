package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemEventsResponseActor
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemEventsResponseActor   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Attributes")
  @Valid
  private Map<String, String> attributes = null;

  public SystemEventsResponseActor ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * The ID of the object emitting the event
   * @return ID
  */
  @ApiModelProperty(value = "The ID of the object emitting the event")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public SystemEventsResponseActor attributes(Map<String, String> attributes) {
    this.attributes = attributes;
    return this;
  }

  public SystemEventsResponseActor putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

  /**
   * Various key/value attributes of the object, depending on its type
   * @return attributes
  */
  @ApiModelProperty(value = "Various key/value attributes of the object, depending on its type")


  public Map<String, String> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemEventsResponseActor systemEventsResponseActor = (SystemEventsResponseActor) o;
    return Objects.equals(this.ID, systemEventsResponseActor.ID) &&
        Objects.equals(this.attributes, systemEventsResponseActor.attributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, attributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemEventsResponseActor {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

