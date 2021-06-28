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
 * DistributionInspectResponsePlatforms
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class DistributionInspectResponsePlatforms   {
  @JsonProperty("Architecture")
  private String architecture;

  @JsonProperty("OS")
  private String OS;

  @JsonProperty("OSVersion")
  private String osVersion;

  @JsonProperty("OSFeatures")
  @Valid
  private List<String> osFeatures = null;

  @JsonProperty("Variant")
  private String variant;

  @JsonProperty("Features")
  @Valid
  private List<String> features = null;

  public DistributionInspectResponsePlatforms architecture(String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Get architecture
   * @return architecture
  */
  @ApiModelProperty(value = "")


  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public DistributionInspectResponsePlatforms OS(String OS) {
    this.OS = OS;
    return this;
  }

  /**
   * Get OS
   * @return OS
  */
  @ApiModelProperty(value = "")


  public String getOS() {
    return OS;
  }

  public void setOS(String OS) {
    this.OS = OS;
  }

  public DistributionInspectResponsePlatforms osVersion(String osVersion) {
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

  public DistributionInspectResponsePlatforms osFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
    return this;
  }

  public DistributionInspectResponsePlatforms addOsFeaturesItem(String osFeaturesItem) {
    if (this.osFeatures == null) {
      this.osFeatures = new ArrayList<>();
    }
    this.osFeatures.add(osFeaturesItem);
    return this;
  }

  /**
   * Get osFeatures
   * @return osFeatures
  */
  @ApiModelProperty(value = "")


  public List<String> getOsFeatures() {
    return osFeatures;
  }

  public void setOsFeatures(List<String> osFeatures) {
    this.osFeatures = osFeatures;
  }

  public DistributionInspectResponsePlatforms variant(String variant) {
    this.variant = variant;
    return this;
  }

  /**
   * Get variant
   * @return variant
  */
  @ApiModelProperty(value = "")


  public String getVariant() {
    return variant;
  }

  public void setVariant(String variant) {
    this.variant = variant;
  }

  public DistributionInspectResponsePlatforms features(List<String> features) {
    this.features = features;
    return this;
  }

  public DistributionInspectResponsePlatforms addFeaturesItem(String featuresItem) {
    if (this.features == null) {
      this.features = new ArrayList<>();
    }
    this.features.add(featuresItem);
    return this;
  }

  /**
   * Get features
   * @return features
  */
  @ApiModelProperty(value = "")


  public List<String> getFeatures() {
    return features;
  }

  public void setFeatures(List<String> features) {
    this.features = features;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DistributionInspectResponsePlatforms distributionInspectResponsePlatforms = (DistributionInspectResponsePlatforms) o;
    return Objects.equals(this.architecture, distributionInspectResponsePlatforms.architecture) &&
        Objects.equals(this.OS, distributionInspectResponsePlatforms.OS) &&
        Objects.equals(this.osVersion, distributionInspectResponsePlatforms.osVersion) &&
        Objects.equals(this.osFeatures, distributionInspectResponsePlatforms.osFeatures) &&
        Objects.equals(this.variant, distributionInspectResponsePlatforms.variant) &&
        Objects.equals(this.features, distributionInspectResponsePlatforms.features);
  }

  @Override
  public int hashCode() {
    return Objects.hash(architecture, OS, osVersion, osFeatures, variant, features);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DistributionInspectResponsePlatforms {\n");
    
    sb.append("    architecture: ").append(toIndentedString(architecture)).append("\n");
    sb.append("    OS: ").append(toIndentedString(OS)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    osFeatures: ").append(toIndentedString(osFeatures)).append("\n");
    sb.append("    variant: ").append(toIndentedString(variant)).append("\n");
    sb.append("    features: ").append(toIndentedString(features)).append("\n");
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

