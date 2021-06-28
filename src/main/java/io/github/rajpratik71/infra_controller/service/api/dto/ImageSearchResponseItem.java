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
 * ImageSearchResponseItem
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ImageSearchResponseItem   {
  @JsonProperty("description")
  private String description;

  @JsonProperty("is_official")
  private Boolean isOfficial;

  @JsonProperty("is_automated")
  private Boolean isAutomated;

  @JsonProperty("name")
  private String name;

  @JsonProperty("star_count")
  private Integer starCount;

  public ImageSearchResponseItem description(String description) {
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

  public ImageSearchResponseItem isOfficial(Boolean isOfficial) {
    this.isOfficial = isOfficial;
    return this;
  }

  /**
   * Get isOfficial
   * @return isOfficial
  */
  @ApiModelProperty(value = "")


  public Boolean getIsOfficial() {
    return isOfficial;
  }

  public void setIsOfficial(Boolean isOfficial) {
    this.isOfficial = isOfficial;
  }

  public ImageSearchResponseItem isAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
    return this;
  }

  /**
   * Get isAutomated
   * @return isAutomated
  */
  @ApiModelProperty(value = "")


  public Boolean getIsAutomated() {
    return isAutomated;
  }

  public void setIsAutomated(Boolean isAutomated) {
    this.isAutomated = isAutomated;
  }

  public ImageSearchResponseItem name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ImageSearchResponseItem starCount(Integer starCount) {
    this.starCount = starCount;
    return this;
  }

  /**
   * Get starCount
   * @return starCount
  */
  @ApiModelProperty(value = "")


  public Integer getStarCount() {
    return starCount;
  }

  public void setStarCount(Integer starCount) {
    this.starCount = starCount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSearchResponseItem imageSearchResponseItem = (ImageSearchResponseItem) o;
    return Objects.equals(this.description, imageSearchResponseItem.description) &&
        Objects.equals(this.isOfficial, imageSearchResponseItem.isOfficial) &&
        Objects.equals(this.isAutomated, imageSearchResponseItem.isAutomated) &&
        Objects.equals(this.name, imageSearchResponseItem.name) &&
        Objects.equals(this.starCount, imageSearchResponseItem.starCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, isOfficial, isAutomated, name, starCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSearchResponseItem {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isOfficial: ").append(toIndentedString(isOfficial)).append("\n");
    sb.append("    isAutomated: ").append(toIndentedString(isAutomated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
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

