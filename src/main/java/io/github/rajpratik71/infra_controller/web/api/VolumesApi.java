
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Volume;
import io.github.rajpratik71.infra_controller.service.api.dto.VolumeConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.VolumeListResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.VolumePruneResponse;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
@Validated
@Api(value = "volumes", description = "the volumes API")
public interface VolumesApi {

    default VolumesApiDelegate getDelegate() {
        return new VolumesApiDelegate() {
        };
    }

    /**
     * POST /volumes/create : Create a volume
     *
     * @param volumeConfig (required)
     * @return The volume was created successfully (status code 201) or Server error
     *         (status code 500)
     */
    @ApiOperation(value = "Create a volume", nickname = "volumeCreate", notes = "", response = Volume.class, tags = {
            "Volume", })
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "The volume was created successfully", response = Volume.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/volumes/create", produces = { "application/json" }, consumes = { "application/json" })
    default ResponseEntity<Volume> volumeCreate(
            @ApiParam(value = "", required = true) @Valid @RequestBody VolumeConfig volumeConfig) {
        return getDelegate().volumeCreate(volumeConfig);
    }

    /**
     * DELETE /volumes/{name} : Remove a volume Instruct the driver to remove the
     * volume.
     *
     * @param name  Volume name or ID (required)
     * @param force Force the removal of the volume (optional, default to false)
     * @return The volume was removed (status code 204) or No such volume or volume
     *         driver (status code 404) or Volume is in use and cannot be removed
     *         (status code 409) or Server error (status code 500)
     */
    @ApiOperation(value = "Remove a volume", nickname = "volumeDelete", notes = "Instruct the driver to remove the volume.", tags = {
            "Volume", })
    @ApiResponses(value = { @ApiResponse(code = 204, message = "The volume was removed"),
            @ApiResponse(code = 404, message = "No such volume or volume driver", response = ErrorResponse.class),
            @ApiResponse(code = 409, message = "Volume is in use and cannot be removed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @DeleteMapping(value = "/volumes/{name}", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> volumeDelete(
            @ApiParam(value = "Volume name or ID", required = true) @PathVariable("name") String name,
            @ApiParam(value = "Force the removal of the volume", defaultValue = "false") @Valid @RequestParam(value = "force", required = false, defaultValue = "false") Boolean force) {
        return getDelegate().volumeDelete(name, force);
    }

    /**
     * GET /volumes/{name} : Inspect a volume
     *
     * @param name Volume name or ID (required)
     * @return No error (status code 200) or No such volume (status code 404) or
     *         Server error (status code 500)
     */
    @ApiOperation(value = "Inspect a volume", nickname = "volumeInspect", notes = "", response = Volume.class, tags = {
            "Volume", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = Volume.class),
            @ApiResponse(code = 404, message = "No such volume", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/volumes/{name}", produces = { "application/json" })
    default ResponseEntity<Volume> volumeInspect(
            @ApiParam(value = "Volume name or ID", required = true) @PathVariable("name") String name) {
        return getDelegate().volumeInspect(name);
    }

    /**
     * GET /volumes : List volumes
     *
     * @param filters JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the volumes
     *                list. Available filters: -
     *                &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to
     *                &#x60;true&#x60; (or &#x60;1&#x60;), returns all volumes that
     *                are not in use by a container. When set to &#x60;false&#x60;
     *                (or &#x60;0&#x60;), only volumes that are in use by one or
     *                more containers are returned. -
     *                &#x60;driver&#x3D;&lt;volume-driver-name&gt;&#x60; Matches
     *                volumes based on their driver. -
     *                &#x60;label&#x3D;&lt;key&gt;&#x60; or
     *                &#x60;label&#x3D;&lt;key&gt;:&lt;value&gt;&#x60; Matches
     *                volumes based on the presence of a &#x60;label&#x60; alone or
     *                a &#x60;label&#x60; and a value. -
     *                &#x60;name&#x3D;&lt;volume-name&gt;&#x60; Matches all or part
     *                of a volume name. (optional)
     * @return Summary volume data that matches the query (status code 200) or
     *         Server error (status code 500)
     */
    @ApiOperation(value = "List volumes", nickname = "volumeList", notes = "", response = VolumeListResponse.class, tags = {
            "Volume", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Summary volume data that matches the query", response = VolumeListResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/volumes", produces = { "application/json" })
    default ResponseEntity<VolumeListResponse> volumeList(
            @ApiParam(value = "JSON encoded value of the filters (a `map[string][]string`) to process on the volumes list. Available filters:  - `dangling=<boolean>` When set to `true` (or `1`), returns all    volumes that are not in use by a container. When set to `false`    (or `0`), only volumes that are in use by one or more    containers are returned. - `driver=<volume-driver-name>` Matches volumes based on their driver. - `label=<key>` or `label=<key>:<value>` Matches volumes based on    the presence of a `label` alone or a `label` and a value. - `name=<volume-name>` Matches all or part of a volume name. ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().volumeList(filters);
    }

    /**
     * POST /volumes/prune : Delete unused volumes
     *
     * @param filters Filters to process on the prune list, encoded as JSON (a
     *                &#x60;map[string][]string&#x60;). Available filters: -
     *                &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;,
     *                &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;,
     *                &#x60;label!&#x3D;&lt;key&gt;&#x60;, or
     *                &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune
     *                volumes with (or without, in case &#x60;label!&#x3D;...&#x60;
     *                is used) the specified labels. (optional)
     * @return No error (status code 200) or Server error (status code 500)
     */
    @ApiOperation(value = "Delete unused volumes", nickname = "volumePrune", notes = "", response = VolumePruneResponse.class, tags = {
            "Volume", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = VolumePruneResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/volumes/prune", produces = { "application/json" })
    default ResponseEntity<VolumePruneResponse> volumePrune(
            @ApiParam(value = "Filters to process on the prune list, encoded as JSON (a `map[string][]string`).  Available filters: - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune volumes with (or without, in case `label!=...` is used) the specified labels. ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().volumePrune(filters);
    }

}
