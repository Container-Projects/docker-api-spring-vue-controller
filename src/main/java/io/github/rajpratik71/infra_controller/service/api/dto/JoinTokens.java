package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * JoinTokens contains the tokens workers and managers need to join the swarm. 
 */
@ApiModel(description = "JoinTokens contains the tokens workers and managers need to join the swarm. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class JoinTokens   {
  @JsonProperty("Worker")
  private String worker;

  @JsonProperty("Manager")
  private String manager;

  public JoinTokens worker(String worker) {
    this.worker = worker;
    return this;
  }

  /**
   * The token workers can use to join the swarm. 
   * @return worker
  */
  @ApiModelProperty(example = "SWMTKN-1-3pu6hszjas19xyp7ghgosyx9k8atbfcr8p2is99znpy26u2lkl-1awxwuwd3z9j1z3puu7rcgdbx", value = "The token workers can use to join the swarm. ")


  public String getWorker() {
    return worker;
  }

  public void setWorker(String worker) {
    this.worker = worker;
  }

  public JoinTokens manager(String manager) {
    this.manager = manager;
    return this;
  }

  /**
   * The token managers can use to join the swarm. 
   * @return manager
  */
  @ApiModelProperty(example = "SWMTKN-1-3pu6hszjas19xyp7ghgosyx9k8atbfcr8p2is99znpy26u2lkl-7p73s1dx5in4tatdymyhg9hu2", value = "The token managers can use to join the swarm. ")


  public String getManager() {
    return manager;
  }

  public void setManager(String manager) {
    this.manager = manager;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JoinTokens joinTokens = (JoinTokens) o;
    return Objects.equals(this.worker, joinTokens.worker) &&
        Objects.equals(this.manager, joinTokens.manager);
  }

  @Override
  public int hashCode() {
    return Objects.hash(worker, manager);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JoinTokens {\n");
    
    sb.append("    worker: ").append(toIndentedString(worker)).append("\n");
    sb.append("    manager: ").append(toIndentedString(manager)).append("\n");
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

