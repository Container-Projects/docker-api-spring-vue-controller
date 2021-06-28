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
 * SystemInfoDefaultAddressPools
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemInfoDefaultAddressPools   {
  @JsonProperty("Base")
  private String base;

  @JsonProperty("Size")
  private Integer size;

  public SystemInfoDefaultAddressPools base(String base) {
    this.base = base;
    return this;
  }

  /**
   * The network address in CIDR format
   * @return base
  */
  @ApiModelProperty(example = "10.10.0.0/16", value = "The network address in CIDR format")


  public String getBase() {
    return base;
  }

  public void setBase(String base) {
    this.base = base;
  }

  public SystemInfoDefaultAddressPools size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * The network pool size
   * @return size
  */
  @ApiModelProperty(example = "24", value = "The network pool size")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemInfoDefaultAddressPools systemInfoDefaultAddressPools = (SystemInfoDefaultAddressPools) o;
    return Objects.equals(this.base, systemInfoDefaultAddressPools.base) &&
        Objects.equals(this.size, systemInfoDefaultAddressPools.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(base, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemInfoDefaultAddressPools {\n");
    
    sb.append("    base: ").append(toIndentedString(base)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

