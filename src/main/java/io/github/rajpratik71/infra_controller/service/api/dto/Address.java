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
 * Address represents an IPv4 or IPv6 IP address.
 */
@ApiModel(description = "Address represents an IPv4 or IPv6 IP address.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Address   {
  @JsonProperty("Addr")
  private String addr;

  @JsonProperty("PrefixLen")
  private Integer prefixLen;

  public Address addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * IP address.
   * @return addr
  */
  @ApiModelProperty(value = "IP address.")


  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }

  public Address prefixLen(Integer prefixLen) {
    this.prefixLen = prefixLen;
    return this;
  }

  /**
   * Mask length of the IP address.
   * @return prefixLen
  */
  @ApiModelProperty(value = "Mask length of the IP address.")


  public Integer getPrefixLen() {
    return prefixLen;
  }

  public void setPrefixLen(Integer prefixLen) {
    this.prefixLen = prefixLen;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addr, address.addr) &&
        Objects.equals(this.prefixLen, address.prefixLen);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr, prefixLen);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
    sb.append("    prefixLen: ").append(toIndentedString(prefixLen)).append("\n");
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

