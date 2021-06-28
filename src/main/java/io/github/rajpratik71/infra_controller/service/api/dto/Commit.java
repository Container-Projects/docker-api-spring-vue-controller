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
 * Commit holds the Git-commit (SHA1) that a binary was built from, as reported in the version-string of external tools, such as &#x60;containerd&#x60;, or &#x60;runC&#x60;. 
 */
@ApiModel(description = "Commit holds the Git-commit (SHA1) that a binary was built from, as reported in the version-string of external tools, such as `containerd`, or `runC`. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Commit   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Expected")
  private String expected;

  public Commit ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Actual commit ID of external tool.
   * @return ID
  */
  @ApiModelProperty(example = "cfb82a876ecc11b5ca0977d1733adbe58599088a", value = "Actual commit ID of external tool.")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public Commit expected(String expected) {
    this.expected = expected;
    return this;
  }

  /**
   * Commit ID of external tool expected by dockerd as set at build time. 
   * @return expected
  */
  @ApiModelProperty(example = "2d41c047c83e09a6d61d464906feb2a2f3c52aa4", value = "Commit ID of external tool expected by dockerd as set at build time. ")


  public String getExpected() {
    return expected;
  }

  public void setExpected(String expected) {
    this.expected = expected;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Commit commit = (Commit) o;
    return Objects.equals(this.ID, commit.ID) &&
        Objects.equals(this.expected, commit.expected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, expected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commit {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    expected: ").append(toIndentedString(expected)).append("\n");
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

