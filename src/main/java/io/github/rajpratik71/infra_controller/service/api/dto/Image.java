package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.GraphDriverData;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageMetadata;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageRootFS;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Image
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Image   {
  @JsonProperty("Id")
  private String id;

  @JsonProperty("RepoTags")
  @Valid
  private List<String> repoTags = null;

  @JsonProperty("RepoDigests")
  @Valid
  private List<String> repoDigests = null;

  @JsonProperty("Parent")
  private String parent;

  @JsonProperty("Comment")
  private String comment;

  @JsonProperty("Created")
  private String created;

  @JsonProperty("Container")
  private String container;

  @JsonProperty("ContainerConfig")
  private ContainerConfig containerConfig;

  @JsonProperty("DockerVersion")
  private String dockerVersion;

  @JsonProperty("Author")
  private String author;

  @JsonProperty("Config")
  private ContainerConfig config;

  @JsonProperty("Architecture")
  private String architecture;

  @JsonProperty("Os")
  private String os;

  @JsonProperty("OsVersion")
  private String osVersion;

  @JsonProperty("Size")
  private Long size;

  @JsonProperty("VirtualSize")
  private Long virtualSize;

  @JsonProperty("GraphDriver")
  private GraphDriverData graphDriver;

  @JsonProperty("RootFS")
  private ImageRootFS rootFS;

  @JsonProperty("Metadata")
  private ImageMetadata metadata;

  public Image id(String id) {
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

  public Image repoTags(List<String> repoTags) {
    this.repoTags = repoTags;
    return this;
  }

  public Image addRepoTagsItem(String repoTagsItem) {
    if (this.repoTags == null) {
      this.repoTags = new ArrayList<>();
    }
    this.repoTags.add(repoTagsItem);
    return this;
  }

  /**
   * Get repoTags
   * @return repoTags
  */
  @ApiModelProperty(value = "")


  public List<String> getRepoTags() {
    return repoTags;
  }

  public void setRepoTags(List<String> repoTags) {
    this.repoTags = repoTags;
  }

  public Image repoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
    return this;
  }

  public Image addRepoDigestsItem(String repoDigestsItem) {
    if (this.repoDigests == null) {
      this.repoDigests = new ArrayList<>();
    }
    this.repoDigests.add(repoDigestsItem);
    return this;
  }

  /**
   * Get repoDigests
   * @return repoDigests
  */
  @ApiModelProperty(value = "")


  public List<String> getRepoDigests() {
    return repoDigests;
  }

  public void setRepoDigests(List<String> repoDigests) {
    this.repoDigests = repoDigests;
  }

  public Image parent(String parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   * @return parent
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getParent() {
    return parent;
  }

  public void setParent(String parent) {
    this.parent = parent;
  }

  public Image comment(String comment) {
    this.comment = comment;
    return this;
  }

  /**
   * Get comment
   * @return comment
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public Image created(String created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public Image container(String container) {
    this.container = container;
    return this;
  }

  /**
   * Get container
   * @return container
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public Image containerConfig(ContainerConfig containerConfig) {
    this.containerConfig = containerConfig;
    return this;
  }

  /**
   * Get containerConfig
   * @return containerConfig
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContainerConfig getContainerConfig() {
    return containerConfig;
  }

  public void setContainerConfig(ContainerConfig containerConfig) {
    this.containerConfig = containerConfig;
  }

  public Image dockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
    return this;
  }

  /**
   * Get dockerVersion
   * @return dockerVersion
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDockerVersion() {
    return dockerVersion;
  }

  public void setDockerVersion(String dockerVersion) {
    this.dockerVersion = dockerVersion;
  }

  public Image author(String author) {
    this.author = author;
    return this;
  }

  /**
   * Get author
   * @return author
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Image config(ContainerConfig config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
  */
  @ApiModelProperty(value = "")

  @Valid

  public ContainerConfig getConfig() {
    return config;
  }

  public void setConfig(ContainerConfig config) {
    this.config = config;
  }

  public Image architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public Image os(String os) {
    this.os = os;
    return this;
  }

  /**
   * Get os
   * @return os
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOs() {
    return os;
  }

  public void setOs(String os) {
    this.os = os;
  }

  public Image osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * Get osVersion
   * @return osVersion
  */
  @ApiModelProperty(value = "")


  public String getOsVersion() {
    return osVersion;
  }

  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }

  public Image size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getSize() {
    return size;
  }

  public void setSize(Long size) {
    this.size = size;
  }

  public Image virtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
    return this;
  }

  /**
   * Get virtualSize
   * @return virtualSize
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Long getVirtualSize() {
    return virtualSize;
  }

  public void setVirtualSize(Long virtualSize) {
    this.virtualSize = virtualSize;
  }

  public Image graphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
    return this;
  }

  /**
   * Get graphDriver
   * @return graphDriver
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public GraphDriverData getGraphDriver() {
    return graphDriver;
  }

  public void setGraphDriver(GraphDriverData graphDriver) {
    this.graphDriver = graphDriver;
  }

  public Image rootFS(ImageRootFS rootFS) {
    this.rootFS = rootFS;
    return this;
  }

  /**
   * Get rootFS
   * @return rootFS
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public ImageRootFS getRootFS() {
    return rootFS;
  }

  public void setRootFS(ImageRootFS rootFS) {
    this.rootFS = rootFS;
  }

  public Image metadata(ImageMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Get metadata
   * @return metadata
  */
  @ApiModelProperty(value = "")

  @Valid

  public ImageMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(ImageMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Image image = (Image) o;
    return Objects.equals(this.id, image.id) &&
        Objects.equals(this.repoTags, image.repoTags) &&
        Objects.equals(this.repoDigests, image.repoDigests) &&
        Objects.equals(this.parent, image.parent) &&
        Objects.equals(this.comment, image.comment) &&
        Objects.equals(this.created, image.created) &&
        Objects.equals(this.container, image.container) &&
        Objects.equals(this.containerConfig, image.containerConfig) &&
        Objects.equals(this.dockerVersion, image.dockerVersion) &&
        Objects.equals(this.author, image.author) &&
        Objects.equals(this.config, image.config) &&
        Objects.equals(this.architecture, image.architecture) &&
        Objects.equals(this.os, image.os) &&
        Objects.equals(this.osVersion, image.osVersion) &&
        Objects.equals(this.size, image.size) &&
        Objects.equals(this.virtualSize, image.virtualSize) &&
        Objects.equals(this.graphDriver, image.graphDriver) &&
        Objects.equals(this.rootFS, image.rootFS) &&
        Objects.equals(this.metadata, image.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, repoTags, repoDigests, parent, comment, created, container, containerConfig, dockerVersion, author, config, architecture, os, osVersion, size, virtualSize, graphDriver, rootFS, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Image {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    repoTags: ").append(toIndentedString(repoTags)).append("\n");
    sb.append("    repoDigests: ").append(toIndentedString(repoDigests)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    containerConfig: ").append(toIndentedString(containerConfig)).append("\n");
    sb.append("    dockerVersion: ").append(toIndentedString(dockerVersion)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    os: ").append(toIndentedString(os)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    virtualSize: ").append(toIndentedString(virtualSize)).append("\n");
    sb.append("    graphDriver: ").append(toIndentedString(graphDriver)).append("\n");
    sb.append("    rootFS: ").append(toIndentedString(rootFS)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

