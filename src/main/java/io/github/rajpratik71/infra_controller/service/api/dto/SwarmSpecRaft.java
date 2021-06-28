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
 * Raft configuration.
 */
@ApiModel(description = "Raft configuration.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public class SwarmSpecRaft   {
  @JsonProperty("SnapshotInterval")
  private Integer snapshotInterval;

  @JsonProperty("KeepOldSnapshots")
  private Integer keepOldSnapshots;

  @JsonProperty("LogEntriesForSlowFollowers")
  private Integer logEntriesForSlowFollowers;

  @JsonProperty("ElectionTick")
  private Integer electionTick;

  @JsonProperty("HeartbeatTick")
  private Integer heartbeatTick;

  public SwarmSpecRaft snapshotInterval(Integer snapshotInterval) {
    this.snapshotInterval = snapshotInterval;
    return this;
  }

  /**
   * The number of log entries between snapshots.
   * @return snapshotInterval
  */
  @ApiModelProperty(example = "10000", value = "The number of log entries between snapshots.")


  public Integer getSnapshotInterval() {
    return snapshotInterval;
  }

  public void setSnapshotInterval(Integer snapshotInterval) {
    this.snapshotInterval = snapshotInterval;
  }

  public SwarmSpecRaft keepOldSnapshots(Integer keepOldSnapshots) {
    this.keepOldSnapshots = keepOldSnapshots;
    return this;
  }

  /**
   * The number of snapshots to keep beyond the current snapshot. 
   * @return keepOldSnapshots
  */
  @ApiModelProperty(value = "The number of snapshots to keep beyond the current snapshot. ")


  public Integer getKeepOldSnapshots() {
    return keepOldSnapshots;
  }

  public void setKeepOldSnapshots(Integer keepOldSnapshots) {
    this.keepOldSnapshots = keepOldSnapshots;
  }

  public SwarmSpecRaft logEntriesForSlowFollowers(Integer logEntriesForSlowFollowers) {
    this.logEntriesForSlowFollowers = logEntriesForSlowFollowers;
    return this;
  }

  /**
   * The number of log entries to keep around to sync up slow followers after a snapshot is created. 
   * @return logEntriesForSlowFollowers
  */
  @ApiModelProperty(example = "500", value = "The number of log entries to keep around to sync up slow followers after a snapshot is created. ")


  public Integer getLogEntriesForSlowFollowers() {
    return logEntriesForSlowFollowers;
  }

  public void setLogEntriesForSlowFollowers(Integer logEntriesForSlowFollowers) {
    this.logEntriesForSlowFollowers = logEntriesForSlowFollowers;
  }

  public SwarmSpecRaft electionTick(Integer electionTick) {
    this.electionTick = electionTick;
    return this;
  }

  /**
   * The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. 
   * @return electionTick
  */
  @ApiModelProperty(example = "3", value = "The number of ticks that a follower will wait for a message from the leader before becoming a candidate and starting an election. `ElectionTick` must be greater than `HeartbeatTick`.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. ")


  public Integer getElectionTick() {
    return electionTick;
  }

  public void setElectionTick(Integer electionTick) {
    this.electionTick = electionTick;
  }

  public SwarmSpecRaft heartbeatTick(Integer heartbeatTick) {
    this.heartbeatTick = heartbeatTick;
    return this;
  }

  /**
   * The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. 
   * @return heartbeatTick
  */
  @ApiModelProperty(example = "1", value = "The number of ticks between heartbeats. Every HeartbeatTick ticks, the leader will send a heartbeat to the followers.  A tick currently defaults to one second, so these translate directly to seconds currently, but this is NOT guaranteed. ")


  public Integer getHeartbeatTick() {
    return heartbeatTick;
  }

  public void setHeartbeatTick(Integer heartbeatTick) {
    this.heartbeatTick = heartbeatTick;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwarmSpecRaft swarmSpecRaft = (SwarmSpecRaft) o;
    return Objects.equals(this.snapshotInterval, swarmSpecRaft.snapshotInterval) &&
        Objects.equals(this.keepOldSnapshots, swarmSpecRaft.keepOldSnapshots) &&
        Objects.equals(this.logEntriesForSlowFollowers, swarmSpecRaft.logEntriesForSlowFollowers) &&
        Objects.equals(this.electionTick, swarmSpecRaft.electionTick) &&
        Objects.equals(this.heartbeatTick, swarmSpecRaft.heartbeatTick);
  }

  @Override
  public int hashCode() {
    return Objects.hash(snapshotInterval, keepOldSnapshots, logEntriesForSlowFollowers, electionTick, heartbeatTick);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwarmSpecRaft {\n");
    
    sb.append("    snapshotInterval: ").append(toIndentedString(snapshotInterval)).append("\n");
    sb.append("    keepOldSnapshots: ").append(toIndentedString(keepOldSnapshots)).append("\n");
    sb.append("    logEntriesForSlowFollowers: ").append(toIndentedString(logEntriesForSlowFollowers)).append("\n");
    sb.append("    electionTick: ").append(toIndentedString(electionTick)).append("\n");
    sb.append("    heartbeatTick: ").append(toIndentedString(heartbeatTick)).append("\n");
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

