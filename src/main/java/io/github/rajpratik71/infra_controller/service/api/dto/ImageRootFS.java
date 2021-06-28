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
 * ImageRootFS
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class ImageRootFS   {
  @JsonProperty("Type")
  private String type;

  @JsonProperty("Layers")
  @Valid
  private List<String> layers = null;

  @JsonProperty("BaseLayer")
  private String baseLayer;

  public ImageRootFS type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ImageRootFS layers(List<String> layers) {
    this.layers = layers;
    return this;
  }

  public ImageRootFS addLayersItem(String layersItem) {
    if (this.layers == null) {
      this.layers = new ArrayList<>();
    }
    this.layers.add(layersItem);
    return this;
  }

  /**
   * Get layers
   * @return layers
  */
  @ApiModelProperty(value = "")


  public List<String> getLayers() {
    return layers;
  }

  public void setLayers(List<String> layers) {
    this.layers = layers;
  }

  public ImageRootFS baseLayer(String baseLayer) {
    this.baseLayer = baseLayer;
    return this;
  }

  /**
   * Get baseLayer
   * @return baseLayer
  */
  @ApiModelProperty(value = "")


  public String getBaseLayer() {
    return baseLayer;
  }

  public void setBaseLayer(String baseLayer) {
    this.baseLayer = baseLayer;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageRootFS imageRootFS = (ImageRootFS) o;
    return Objects.equals(this.type, imageRootFS.type) &&
        Objects.equals(this.layers, imageRootFS.layers) &&
        Objects.equals(this.baseLayer, imageRootFS.baseLayer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, layers, baseLayer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageRootFS {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    layers: ").append(toIndentedString(layers)).append("\n");
    sb.append("    baseLayer: ").append(toIndentedString(baseLayer)).append("\n");
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

