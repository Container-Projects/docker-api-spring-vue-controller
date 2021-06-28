package io.github.rajpratik71.infra_controller.service.api.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.github.rajpratik71.infra_controller.service.api.dto.ObjectVersion;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceEndpoint;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceJobStatus;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceServiceStatus;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceUpdateStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Service
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class Service   {
  @JsonProperty("ID")
  private String ID;

  @JsonProperty("Version")
  private ObjectVersion version;

  @JsonProperty("CreatedAt")
  private String createdAt;

  @JsonProperty("UpdatedAt")
  private String updatedAt;

  @JsonProperty("Spec")
  private ServiceSpec spec;

  @JsonProperty("Endpoint")
  private ServiceEndpoint endpoint;

  @JsonProperty("UpdateStatus")
  private ServiceUpdateStatus updateStatus;

  @JsonProperty("ServiceStatus")
  private ServiceServiceStatus serviceStatus;

  @JsonProperty("JobStatus")
  private ServiceJobStatus jobStatus;

  public Service ID(String ID) {
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

  public Service version(ObjectVersion version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
  */
  @ApiModelProperty(value = "")

  @Valid

  public ObjectVersion getVersion() {
    return version;
  }

  public void setVersion(ObjectVersion version) {
    this.version = version;
  }

  public Service createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @ApiModelProperty(value = "")


  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Service updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Get updatedAt
   * @return updatedAt
  */
  @ApiModelProperty(value = "")


  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Service spec(ServiceSpec spec) {
    this.spec = spec;
    return this;
  }

  /**
   * Get spec
   * @return spec
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceSpec getSpec() {
    return spec;
  }

  public void setSpec(ServiceSpec spec) {
    this.spec = spec;
  }

  public Service endpoint(ServiceEndpoint endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Get endpoint
   * @return endpoint
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceEndpoint getEndpoint() {
    return endpoint;
  }

  public void setEndpoint(ServiceEndpoint endpoint) {
    this.endpoint = endpoint;
  }

  public Service updateStatus(ServiceUpdateStatus updateStatus) {
    this.updateStatus = updateStatus;
    return this;
  }

  /**
   * Get updateStatus
   * @return updateStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceUpdateStatus getUpdateStatus() {
    return updateStatus;
  }

  public void setUpdateStatus(ServiceUpdateStatus updateStatus) {
    this.updateStatus = updateStatus;
  }

  public Service serviceStatus(ServiceServiceStatus serviceStatus) {
    this.serviceStatus = serviceStatus;
    return this;
  }

  /**
   * Get serviceStatus
   * @return serviceStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceServiceStatus getServiceStatus() {
    return serviceStatus;
  }

  public void setServiceStatus(ServiceServiceStatus serviceStatus) {
    this.serviceStatus = serviceStatus;
  }

  public Service jobStatus(ServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }

  /**
   * Get jobStatus
   * @return jobStatus
  */
  @ApiModelProperty(value = "")

  @Valid

  public ServiceJobStatus getJobStatus() {
    return jobStatus;
  }

  public void setJobStatus(ServiceJobStatus jobStatus) {
    this.jobStatus = jobStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Service service = (Service) o;
    return Objects.equals(this.ID, service.ID) &&
        Objects.equals(this.version, service.version) &&
        Objects.equals(this.createdAt, service.createdAt) &&
        Objects.equals(this.updatedAt, service.updatedAt) &&
        Objects.equals(this.spec, service.spec) &&
        Objects.equals(this.endpoint, service.endpoint) &&
        Objects.equals(this.updateStatus, service.updateStatus) &&
        Objects.equals(this.serviceStatus, service.serviceStatus) &&
        Objects.equals(this.jobStatus, service.jobStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, version, createdAt, updatedAt, spec, endpoint, updateStatus, serviceStatus, jobStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Service {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
    sb.append("    updateStatus: ").append(toIndentedString(updateStatus)).append("\n");
    sb.append("    serviceStatus: ").append(toIndentedString(serviceStatus)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
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

