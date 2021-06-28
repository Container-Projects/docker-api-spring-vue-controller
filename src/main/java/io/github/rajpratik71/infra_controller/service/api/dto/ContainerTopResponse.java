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
 * OK response to ContainerTop operation
 */
@ApiModel(description = "OK response to ContainerTop operation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ContainerTopResponse   {
  @JsonProperty("Titles")
  @Valid
  private List<String> titles = null;

  @JsonProperty("Processes")
  @Valid
  private List<List<String>> processes = null;

  public ContainerTopResponse titles(List<String> titles) {
    this.titles = titles;
    return this;
  }

  public ContainerTopResponse addTitlesItem(String titlesItem) {
    if (this.titles == null) {
      this.titles = new ArrayList<>();
    }
    this.titles.add(titlesItem);
    return this;
  }

  /**
   * The ps column titles
   * @return titles
  */
  @ApiModelProperty(value = "The ps column titles")


  public List<String> getTitles() {
    return titles;
  }

  public void setTitles(List<String> titles) {
    this.titles = titles;
  }

  public ContainerTopResponse processes(List<List<String>> processes) {
    this.processes = processes;
    return this;
  }

  public ContainerTopResponse addProcessesItem(List<String> processesItem) {
    if (this.processes == null) {
      this.processes = new ArrayList<>();
    }
    this.processes.add(processesItem);
    return this;
  }

  /**
   * Each process running in the container, where each is process is an array of values corresponding to the titles. 
   * @return processes
  */
  @ApiModelProperty(value = "Each process running in the container, where each is process is an array of values corresponding to the titles. ")

  @Valid

  public List<List<String>> getProcesses() {
    return processes;
  }

  public void setProcesses(List<List<String>> processes) {
    this.processes = processes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerTopResponse containerTopResponse = (ContainerTopResponse) o;
    return Objects.equals(this.titles, containerTopResponse.titles) &&
        Objects.equals(this.processes, containerTopResponse.processes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(titles, processes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerTopResponse {\n");
    
    sb.append("    titles: ").append(toIndentedString(titles)).append("\n");
    sb.append("    processes: ").append(toIndentedString(processes)).append("\n");
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

