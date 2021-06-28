package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ImageSummary
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ImageSummary   {
  @JsonProperty("Id")
  private String id;

  @JsonProperty("ParentId")
  private String parentId;

  @JsonProperty("RepoTags")
  @Valid
  private List<String> repoTags = new ArrayList<>();

  @JsonProperty("RepoDigests")
  @Valid
  private List<String> repoDigests = new ArrayList<>();

  @JsonProperty("Created")
  private Integer created;

  @JsonProperty("Size")
  private Integer size;

  @JsonProperty("SharedSize")
  private Integer sharedSize;

  @JsonProperty("VirtualSize")
  private Integer virtualSize;

  @JsonProperty("Labels")
  @Valid
  private Map<String, String> labels = new HashMap<>();

  @JsonProperty("Containers")
  private Integer containers;

  public ImageSummary id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ImageSummary parentId(String parentId) {
    this.parentId = parentId;
    return this;
  }

  /**
   * Get parentId
   * @return parentId
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getParentId() {
    return parentId;
  }

  public void setParentId(String parentId) {
    this.parentId = parentId;
  }

  public ImageSummary repoTags(List<String> repoTags) {
    this.repoTags = repoTags;
    return this;
  }

  public ImageSummary addRepoTagsItem(String repoTagsItem) {
    this.repoTags.add(repoTagsItem);
    return this;
  }

  /**
   * Get repoTags
   * @return repoTags
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getRepoTags() {
    return repoTags;
  }

  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }

  public ImageSummary repoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
    return this;
  }

  public ImageSummary addRepoDigestsItem(String repoDigestsItem) {
    this.repoDigests.add(repoDigestsItem);
    return this;
  }

  /**
   * Get repoDigests
   * @return repoDigests
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public List<String> getRepoDigests() {
    return repoDigests;
  }

  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }

  public ImageSummary created(Integer created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }

  public ImageSummary size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public ImageSummary sharedSize(Integer sharedSize) {
    this.sharedSize = sharedSize;
    return this;
  }

  /**
   * Get sharedSize
   * @return sharedSize
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getSharedSize() {
    return sharedSize;
  }

  public void setSharedSize(Integer sharedSize) {
    this.sharedSize = sharedSize;
  }

  public ImageSummary virtualSize(Integer virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * Get virtualSize
   * @return virtualSize
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getVirtualSize() {
    return virtualSize;
  }

  public void setVirtualSize(Integer virtualSize) {
    this.virtualSize = virtualSize;
  }

  public ImageSummary labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ImageSummary putLabelsItem(String key, String labelsItem) {
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ImageSummary containers(Integer containers) {
    this.containers = containers;
    return this;
  }

  /**
   * Get containers
   * @return containers
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getContainers() {
    return containers;
  }

  public void setContainers(Integer containers) {
    this.containers = containers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSummary imageSummary = (ImageSummary) o;
    return Objects.equals(this.id, imageSummary.id) &&
        Objects.equals(this.parentId, imageSummary.parentId) &&
        Objects.equals(this.repoTags, imageSummary.repoTags) &&
        Objects.equals(this.repoDigests, imageSummary.repoDigests) &&
        Objects.equals(this.created, imageSummary.created) &&
        Objects.equals(this.size, imageSummary.size) &&
        Objects.equals(this.sharedSize, imageSummary.sharedSize) &&
        Objects.equals(this.virtualSize, imageSummary.virtualSize) &&
        Objects.equals(this.labels, imageSummary.labels) &&
        Objects.equals(this.containers, imageSummary.containers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parentId, repoTags, repoDigests, created, size, sharedSize, virtualSize, labels, containers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sharedSize: ").append(toIndentedString(sharedSize)).append("\n");
    sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
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

