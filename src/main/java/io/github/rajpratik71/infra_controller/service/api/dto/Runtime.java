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
 * Runtime describes an [OCI compliant](https://github.com/opencontainers/runtime-spec) runtime.  The runtime is invoked by the daemon via the &#x60;containerd&#x60; daemon. OCI runtimes act as an interface to the Linux kernel namespaces, cgroups, and SELinux. 
 */
@ApiModel(description = "Runtime describes an [OCI compliant](https://github.com/opencontainers/runtime-spec) runtime.  The runtime is invoked by the daemon via the `containerd` daemon. OCI runtimes act as an interface to the Linux kernel namespaces, cgroups, and SELinux. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Runtime   {
  @JsonProperty("path")
  private String path;

  @JsonProperty("runtimeArgs")
  @Valid
  private JsonNullable<List<String>> runtimeArgs = JsonNullable.undefined();

  public Runtime path(String path) {
    this.path = path;
    return this;
  }

  /**
   * Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. 
   * @return path
  */
  @ApiModelProperty(example = "/usr/local/bin/my-oci-runtime", value = "Name and, optional, path, of the OCI executable binary.  If the path is omitted, the daemon searches the host's `$PATH` for the binary and uses the first result. ")


  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public Runtime runtimeArgs(List<String> runtimeArgs) {
    this.runtimeArgs = JsonNullable.of(runtimeArgs);
    return this;
  }

  public Runtime addRuntimeArgsItem(String runtimeArgsItem) {
    if (this.runtimeArgs == null || !this.runtimeArgs.isPresent()) {
      this.runtimeArgs = JsonNullable.of(new ArrayList<>());
    }
    this.runtimeArgs.get().add(runtimeArgsItem);
    return this;
  }

  /**
   * List of command-line arguments to pass to the runtime when invoked. 
   * @return runtimeArgs
  */
  @ApiModelProperty(example = "[--debug, --systemd-cgroup=false]", value = "List of command-line arguments to pass to the runtime when invoked. ")


  public JsonNullable<List<String>> getRuntimeArgs() {
    return runtimeArgs;
  }

  public void setRuntimeArgs(JsonNullable<List<String>> runtimeArgs) {
    this.runtimeArgs = runtimeArgs;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Runtime runtime = (Runtime) o;
    return Objects.equals(this.path, runtime.path) &&
        Objects.equals(this.runtimeArgs, runtime.runtimeArgs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(path, runtimeArgs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Runtime {\n");
    
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    runtimeArgs: ").append(toIndentedString(runtimeArgs)).append("\n");
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

