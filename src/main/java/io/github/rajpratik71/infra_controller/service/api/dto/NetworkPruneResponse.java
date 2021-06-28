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
 * NetworkPruneResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class NetworkPruneResponse   {
  @JsonProperty("NetworksDeleted")
  @Valid
  private List<String> networksDeleted = null;

  public NetworkPruneResponse networksDeleted(List<String> networksDeleted) {
    this.networksDeleted = networksDeleted;
    return this;
  }

  public NetworkPruneResponse addNetworksDeletedItem(String networksDeletedItem) {
    if (this.networksDeleted == null) {
      this.networksDeleted = new ArrayList<>();
    }
    this.networksDeleted.add(networksDeletedItem);
    return this;
  }

  /**
   * Networks that were deleted
   * @return networksDeleted
  */
  @ApiModelProperty(value = "Networks that were deleted")


  public List<String> getNetworksDeleted() {
    return networksDeleted;
  }

  public void setNetworksDeleted(List<String> networksDeleted) {
    this.networksDeleted = networksDeleted;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkPruneResponse networkPruneResponse = (NetworkPruneResponse) o;
    return Objects.equals(this.networksDeleted, networkPruneResponse.networksDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networksDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkPruneResponse {\n");
    
    sb.append("    networksDeleted: ").append(toIndentedString(networksDeleted)).append("\n");
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

