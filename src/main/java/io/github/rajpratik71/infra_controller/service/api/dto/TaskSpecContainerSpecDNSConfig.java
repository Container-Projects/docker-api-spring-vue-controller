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
 * Specification for DNS related configurations in resolver configuration file (&#x60;resolv.conf&#x60;). 
 */
@ApiModel(description = "Specification for DNS related configurations in resolver configuration file (`resolv.conf`). ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class TaskSpecContainerSpecDNSConfig   {
  @JsonProperty("Nameservers")
  @Valid
  private List<String> nameservers = null;

  @JsonProperty("Search")
  @Valid
  private List<String> search = null;

  @JsonProperty("Options")
  @Valid
  private List<String> options = null;

  public TaskSpecContainerSpecDNSConfig nameservers(List<String> nameservers) {
    this.nameservers = nameservers;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addNameserversItem(String nameserversItem) {
    if (this.nameservers == null) {
      this.nameservers = new ArrayList<>();
    }
    this.nameservers.add(nameserversItem);
    return this;
  }

  /**
   * The IP addresses of the name servers.
   * @return nameservers
  */
  @ApiModelProperty(value = "The IP addresses of the name servers.")


  public List<String> getNameservers() {
    return nameservers;
  }

  public void setNameservers(List<String> nameservers) {
    this.nameservers = nameservers;
  }

  public TaskSpecContainerSpecDNSConfig search(List<String> search) {
    this.search = search;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addSearchItem(String searchItem) {
    if (this.search == null) {
      this.search = new ArrayList<>();
    }
    this.search.add(searchItem);
    return this;
  }

  /**
   * A search list for host-name lookup.
   * @return search
  */
  @ApiModelProperty(value = "A search list for host-name lookup.")


  public List<String> getSearch() {
    return search;
  }

  public void setSearch(List<String> search) {
    this.search = search;
  }

  public TaskSpecContainerSpecDNSConfig options(List<String> options) {
    this.options = options;
    return this;
  }

  public TaskSpecContainerSpecDNSConfig addOptionsItem(String optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<>();
    }
    this.options.add(optionsItem);
    return this;
  }

  /**
   * A list of internal resolver variables to be modified (e.g., `debug`, `ndots:3`, etc.). 
   * @return options
  */
  @ApiModelProperty(value = "A list of internal resolver variables to be modified (e.g., `debug`, `ndots:3`, etc.). ")


  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaskSpecContainerSpecDNSConfig taskSpecContainerSpecDNSConfig = (TaskSpecContainerSpecDNSConfig) o;
    return Objects.equals(this.nameservers, taskSpecContainerSpecDNSConfig.nameservers) &&
        Objects.equals(this.search, taskSpecContainerSpecDNSConfig.search) &&
        Objects.equals(this.options, taskSpecContainerSpecDNSConfig.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nameservers, search, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaskSpecContainerSpecDNSConfig {\n");
    
    sb.append("    nameservers: ").append(toIndentedString(nameservers)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

