package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemEventsResponseActor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemEventsResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemEventsResponse   {
  @JsonProperty("Type")
  private String type;

  @JsonProperty("Action")
  private String action;

  @JsonProperty("Actor")
  private SystemEventsResponseActor actor;

  @JsonProperty("time")
  private Integer time;

  @JsonProperty("timeNano")
  private Long timeNano;

  public SystemEventsResponse type(String type) {
    this.type = type;
    return this;
  }

  /**
   * The type of object emitting the event
   * @return type
  */
  @ApiModelProperty(value = "The type of object emitting the event")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SystemEventsResponse action(String action) {
    this.action = action;
    return this;
  }

  /**
   * The type of event
   * @return action
  */
  @ApiModelProperty(value = "The type of event")


  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public SystemEventsResponse actor(SystemEventsResponseActor actor) {
    this.actor = actor;
    return this;
  }

  /**
   * Get actor
   * @return actor
  */
  @ApiModelProperty(value = "")

  @Valid

  public SystemEventsResponseActor getActor() {
    return actor;
  }

  public void setActor(SystemEventsResponseActor actor) {
    this.actor = actor;
  }

  public SystemEventsResponse time(Integer time) {
    this.time = time;
    return this;
  }

  /**
   * Timestamp of event
   * @return time
  */
  @ApiModelProperty(value = "Timestamp of event")


  public Integer getTime() {
    return time;
  }

  public void setTime(Integer time) {
    this.time = time;
  }

  public SystemEventsResponse timeNano(Long timeNano) {
    this.timeNano = timeNano;
    return this;
  }

  /**
   * Timestamp of event, with nanosecond accuracy
   * @return timeNano
  */
  @ApiModelProperty(value = "Timestamp of event, with nanosecond accuracy")


  public Long getTimeNano() {
    return timeNano;
  }

  public void setTimeNano(Long timeNano) {
    this.timeNano = timeNano;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemEventsResponse systemEventsResponse = (SystemEventsResponse) o;
    return Objects.equals(this.type, systemEventsResponse.type) &&
        Objects.equals(this.action, systemEventsResponse.action) &&
        Objects.equals(this.actor, systemEventsResponse.actor) &&
        Objects.equals(this.time, systemEventsResponse.time) &&
        Objects.equals(this.timeNano, systemEventsResponse.timeNano);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, action, actor, time, timeNano);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemEventsResponse {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    timeNano: ").append(toIndentedString(timeNano)).append("\n");
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

