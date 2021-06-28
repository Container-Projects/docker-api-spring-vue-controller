package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.rajpratik71.infra_controller.service.api.dto.MountBindOptions;
import io.github.rajpratik71.infra_controller.service.api.dto.MountTmpfsOptions;
import io.github.rajpratik71.infra_controller.service.api.dto.MountVolumeOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Mount
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Mount   {
  @JsonProperty("Target")
  private String target;

  @JsonProperty("Source")
  private String source;

  /**
   * The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container. 
   */
  public enum TypeEnum {
    BIND("bind"),
    
    VOLUME("volume"),
    
    TMPFS("tmpfs"),
    
    NPIPE("npipe");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("Type")
  private TypeEnum type;

  @JsonProperty("ReadOnly")
  private Boolean readOnly;

  @JsonProperty("Consistency")
  private String consistency;

  @JsonProperty("BindOptions")
  private MountBindOptions bindOptions;

  @JsonProperty("VolumeOptions")
  private MountVolumeOptions volumeOptions;

  @JsonProperty("TmpfsOptions")
  private MountTmpfsOptions tmpfsOptions;

  public Mount target(String target) {
    this.target = target;
    return this;
  }

  /**
   * Container path.
   * @return target
  */
  @ApiModelProperty(value = "Container path.")


  public String getTarget() {
    return target;
  }

  public void setTarget(String target) {
    this.target = target;
  }

  public Mount source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Mount source (e.g. a volume name, a host path).
   * @return source
  */
  @ApiModelProperty(value = "Mount source (e.g. a volume name, a host path).")


  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public Mount type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container. 
   * @return type
  */
  @ApiModelProperty(value = "The mount type. Available types:  - `bind` Mounts a file or directory from the host into the container. Must exist prior to creating the container. - `volume` Creates a volume with the given name and options (or uses a pre-existing volume with the same name and options). These are **not** removed when the container is removed. - `tmpfs` Create a tmpfs with the given options. The mount source cannot be specified for tmpfs. - `npipe` Mounts a named pipe from the host into the container. Must exist prior to creating the container. ")


  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Mount readOnly(Boolean readOnly) {
    this.readOnly = readOnly;
    return this;
  }

  /**
   * Whether the mount should be read-only.
   * @return readOnly
  */
  @ApiModelProperty(value = "Whether the mount should be read-only.")


  public Boolean getReadOnly() {
    return readOnly;
  }

  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }

  public Mount consistency(String consistency) {
    this.consistency = consistency;
    return this;
  }

  /**
   * The consistency requirement for the mount: `default`, `consistent`, `cached`, or `delegated`.
   * @return consistency
  */
  @ApiModelProperty(value = "The consistency requirement for the mount: `default`, `consistent`, `cached`, or `delegated`.")


  public String getConsistency() {
    return consistency;
  }

  public void setConsistency(String consistency) {
    this.consistency = consistency;
  }

  public Mount bindOptions(MountBindOptions bindOptions) {
    this.bindOptions = bindOptions;
    return this;
  }

  /**
   * Get bindOptions
   * @return bindOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public MountBindOptions getBindOptions() {
    return bindOptions;
  }

  public void setBindOptions(MountBindOptions bindOptions) {
    this.bindOptions = bindOptions;
  }

  public Mount volumeOptions(MountVolumeOptions volumeOptions) {
    this.volumeOptions = volumeOptions;
    return this;
  }

  /**
   * Get volumeOptions
   * @return volumeOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public MountVolumeOptions getVolumeOptions() {
    return volumeOptions;
  }

  public void setVolumeOptions(MountVolumeOptions volumeOptions) {
    this.volumeOptions = volumeOptions;
  }

  public Mount tmpfsOptions(MountTmpfsOptions tmpfsOptions) {
    this.tmpfsOptions = tmpfsOptions;
    return this;
  }

  /**
   * Get tmpfsOptions
   * @return tmpfsOptions
  */
  @ApiModelProperty(value = "")

  @Valid

  public MountTmpfsOptions getTmpfsOptions() {
    return tmpfsOptions;
  }

  public void setTmpfsOptions(MountTmpfsOptions tmpfsOptions) {
    this.tmpfsOptions = tmpfsOptions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mount mount = (Mount) o;
    return Objects.equals(this.target, mount.target) &&
        Objects.equals(this.source, mount.source) &&
        Objects.equals(this.type, mount.type) &&
        Objects.equals(this.readOnly, mount.readOnly) &&
        Objects.equals(this.consistency, mount.consistency) &&
        Objects.equals(this.bindOptions, mount.bindOptions) &&
        Objects.equals(this.volumeOptions, mount.volumeOptions) &&
        Objects.equals(this.tmpfsOptions, mount.tmpfsOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, source, type, readOnly, consistency, bindOptions, volumeOptions, tmpfsOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mount {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    consistency: ").append(toIndentedString(consistency)).append("\n");
    sb.append("    bindOptions: ").append(toIndentedString(bindOptions)).append("\n");
    sb.append("    volumeOptions: ").append(toIndentedString(volumeOptions)).append("\n");
    sb.append("    tmpfsOptions: ").append(toIndentedString(tmpfsOptions)).append("\n");
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

