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
 * BuildCache
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class BuildCache   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Parent")
  private String parent;

  @JsonProperty("Type")
  private String type;

  @JsonProperty("Description")
  private String description;

  @JsonProperty("InUse")
  private Boolean inUse;

  @JsonProperty("Shared")
  private Boolean shared;

  @JsonProperty("Size")
  private Integer size;

  @JsonProperty("CreatedAt")
  private String createdAt;

  @JsonProperty("LastUsedAt")
  private JsonNullable<String> lastUsedAt = JsonNullable.undefined();

  @JsonProperty("UsageCount")
  private Integer usageCount;

  public BuildCache ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
  */
  @ApiModelProperty(value = "")


  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public BuildCache parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @ApiModelProperty(value = "")


  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public BuildCache type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BuildCache description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
  */
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BuildCache inUse(Boolean inUse) {
    this.inUse = inUse;
    return this;
  }

  /**
   * Get inUse
   * @return inUse
  */
  @ApiModelProperty(value = "")


  public Boolean getInUse() {
    return inUse;
  }

  public void setInUse(Boolean inUse) {
    this.inUse = inUse;
  }

  public BuildCache shared(Boolean shared) {
    this.shared = shared;
    return this;
  }

  /**
   * Get shared
   * @return shared
  */
  @ApiModelProperty(value = "")


  public Boolean getShared() {
    return shared;
  }

  public void setShared(Boolean shared) {
    this.shared = shared;
  }

  public BuildCache size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Amount of disk space used by the build cache (in bytes). 
   * @return size
  */
  @ApiModelProperty(value = "Amount of disk space used by the build cache (in bytes). ")


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public BuildCache createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return createdAt
  */
  @ApiModelProperty(example = "2016-08-18T10:44:24.496525531Z", value = "Date and time at which the build cache was created in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public BuildCache lastUsedAt(String lastUsedAt) {
    this.lastUsedAt = JsonNullable.of(lastUsedAt);
    return this;
  }

  /**
   * Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. 
   * @return lastUsedAt
  */
  @ApiModelProperty(example = "2017-08-09T07:09:37.632105588Z", value = "Date and time at which the build cache was last used in [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) format with nano-seconds. ")


  public JsonNullable<String> getLastUsedAt() {
    return lastUsedAt;
  }

  public void setLastUsedAt(JsonNullable<String> lastUsedAt) {
    this.lastUsedAt = lastUsedAt;
  }

  public BuildCache usageCount(Integer usageCount) {
    this.usageCount = usageCount;
    return this;
  }

  /**
   * Get usageCount
   * @return usageCount
  */
  @ApiModelProperty(value = "")


  public Integer getUsageCount() {
    return usageCount;
  }

  public void setUsageCount(Integer usageCount) {
    this.usageCount = usageCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuildCache buildCache = (BuildCache) o;
    return Objects.equals(this.ID, buildCache.ID) &&
        Objects.equals(this.parent, buildCache.parent) &&
        Objects.equals(this.type, buildCache.type) &&
        Objects.equals(this.description, buildCache.description) &&
        Objects.equals(this.inUse, buildCache.inUse) &&
        Objects.equals(this.shared, buildCache.shared) &&
        Objects.equals(this.size, buildCache.size) &&
        Objects.equals(this.createdAt, buildCache.createdAt) &&
        Objects.equals(this.lastUsedAt, buildCache.lastUsedAt) &&
        Objects.equals(this.usageCount, buildCache.usageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, parent, type, description, inUse, shared, size, createdAt, lastUsedAt, usageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuildCache {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    inUse: ").append(toIndentedString(inUse)).append("\n");
    sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    lastUsedAt: ").append(toIndentedString(lastUsedAt)).append("\n");
    sb.append("    usageCount: ").append(toIndentedString(usageCount)).append("\n");
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

