package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.BuildCache;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageSummary;
import io.github.rajpratik71.infra_controller.service.api.dto.Volume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SystemDataUsageResponse
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SystemDataUsageResponse   {
  @JsonProperty("LayersSize")
  private Long layersSize;

  @JsonProperty("Images")
  @Valid
  private List<ImageSummary> images = null;

  @JsonProperty("Containers")
  @Valid
  private List<List<Object>> containers = null;

  @JsonProperty("Volumes")
  @Valid
  private List<Volume> volumes = null;

  @JsonProperty("BuildCache")
  @Valid
  private List<BuildCache> buildCache = null;

  public SystemDataUsageResponse layersSize(Long layersSize) {
    this.layersSize = layersSize;
    return this;
  }

  /**
   * Get layersSize
   * @return layersSize
  */
  @ApiModelProperty(value = "")


  public Long getLayersSize() {
    return layersSize;
  }

  public void setLayersSize(Long layersSize) {
    this.layersSize = layersSize;
  }

  public SystemDataUsageResponse images(List<ImageSummary> images) {
    this.images = images;
    return this;
  }

  public SystemDataUsageResponse addImagesItem(ImageSummary imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

  /**
   * Get images
   * @return images
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<ImageSummary> getImages() {
    return images;
  }

  public void setImages(List<ImageSummary> images) {
    this.images = images;
  }

  public SystemDataUsageResponse containers(List<List<Object>> containers) {
    this.containers = containers;
    return this;
  }

  public SystemDataUsageResponse addContainersItem(List<Object> containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Get containers
   * @return containers
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<List<Object>> getContainers() {
    return containers;
  }

  public void setContainers(List<List<Object>> containers) {
    this.containers = containers;
  }

  public SystemDataUsageResponse volumes(List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public SystemDataUsageResponse addVolumesItem(Volume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Get volumes
   * @return volumes
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<Volume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<Volume> volumes) {
    this.volumes = volumes;
  }

  public SystemDataUsageResponse buildCache(List<BuildCache> buildCache) {
    this.buildCache = buildCache;
    return this;
  }

  public SystemDataUsageResponse addBuildCacheItem(BuildCache buildCacheItem) {
    if (this.buildCache == null) {
      this.buildCache = new ArrayList<>();
    }
    this.buildCache.add(buildCacheItem);
    return this;
  }

  /**
   * Get buildCache
   * @return buildCache
  */
  @ApiModelProperty(value = "")

  @Valid

  public List<BuildCache> getBuildCache() {
    return buildCache;
  }

  public void setBuildCache(List<BuildCache> buildCache) {
    this.buildCache = buildCache;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDataUsageResponse systemDataUsageResponse = (SystemDataUsageResponse) o;
    return Objects.equals(this.layersSize, systemDataUsageResponse.layersSize) &&
        Objects.equals(this.images, systemDataUsageResponse.images) &&
        Objects.equals(this.containers, systemDataUsageResponse.containers) &&
        Objects.equals(this.volumes, systemDataUsageResponse.volumes) &&
        Objects.equals(this.buildCache, systemDataUsageResponse.buildCache);
  }

  @Override
  public int hashCode() {
    return Objects.hash(layersSize, images, containers, volumes, buildCache);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDataUsageResponse {\n");
    
    sb.append("    layersSize: ").append(toIndentedString(layersSize)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    buildCache: ").append(toIndentedString(buildCache)).append("\n");
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

