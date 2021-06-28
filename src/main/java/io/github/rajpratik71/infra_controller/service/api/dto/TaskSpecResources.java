package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.Limit;
import io.github.rajpratik71.infra_controller.service.api.dto.ResourceObject;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Resource requirements which apply to each individual container created as part of the service. 
 */
@ApiModel(description = "Resource requirements which apply to each individual container created as part of the service. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecResources   {
  @JsonProperty("Limits")
  private Limit limits;

  @JsonProperty("Reservation")
  private ResourceObject reservation;

  public TaskSpecResources limits(Limit limits) {
    this.limits = limits;
    return this;
  }

  /**
   * Get limits
   * @return limits
  */
  @ApiModelProperty(value = "")

  @Valid

  public Limit getLimits() {
    return limits;
  }

  public void setLimits(Limit limits) {
    this.limits = limits;
  }

  public TaskSpecResources reservation(ResourceObject reservation) {
    this.reservation = reservation;
    return this;
  }

  /**
   * Get reservation
   * @return reservation
  */
  @ApiModelProperty(value = "")

  @Valid

  public ResourceObject getReservation() {
    return reservation;
  }

  public void setReservation(ResourceObject reservation) {
    this.reservation = reservation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecResources taskSpecResources = (TaskSpecResources) o;
    return Objects.equals(this.limits, taskSpecResources.limits) &&
        Objects.equals(this.reservation, taskSpecResources.reservation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits, reservation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecResources {\n");
    
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    reservation: ").append(toIndentedString(reservation)).append("\n");
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

