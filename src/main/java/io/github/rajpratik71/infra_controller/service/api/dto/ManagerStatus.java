package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.Reachability;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ManagerStatus represents the status of a manager.  It provides the current status of a node&#39;s manager component, if the node is a manager. 
 */
@ApiModel(description = "ManagerStatus represents the status of a manager.  It provides the current status of a node's manager component, if the node is a manager. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ManagerStatus   {
  @JsonProperty("Leader")
  private Boolean leader = false;

  @JsonProperty("Reachability")
  private Reachability reachability;

  @JsonProperty("Addr")
  private String addr;

  public ManagerStatus leader(Boolean leader) {
    this.leader = leader;
    return this;
  }

  /**
   * Get leader
   * @return leader
  */
  @ApiModelProperty(example = "true", value = "")


  public Boolean getLeader() {
    return leader;
  }

  public void setLeader(Boolean leader) {
    this.leader = leader;
  }

  public ManagerStatus reachability(Reachability reachability) {
    this.reachability = reachability;
    return this;
  }

  /**
   * Get reachability
   * @return reachability
  */
  @ApiModelProperty(value = "")

  @Valid

  public Reachability getReachability() {
    return reachability;
  }

  public void setReachability(Reachability reachability) {
    this.reachability = reachability;
  }

  public ManagerStatus addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * The IP address and port at which the manager is reachable. 
   * @return addr
  */
  @ApiModelProperty(example = "10.0.0.46:2377", value = "The IP address and port at which the manager is reachable. ")


  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManagerStatus managerStatus = (ManagerStatus) o;
    return Objects.equals(this.leader, managerStatus.leader) &&
        Objects.equals(this.reachability, managerStatus.reachability) &&
        Objects.equals(this.addr, managerStatus.addr);
  }

  @Override
  public int hashCode() {
    return Objects.hash(leader, reachability, addr);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManagerStatus {\n");
    
    sb.append("    leader: ").append(toIndentedString(leader)).append("\n");
    sb.append("    reachability: ").append(toIndentedString(reachability)).append("\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
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

