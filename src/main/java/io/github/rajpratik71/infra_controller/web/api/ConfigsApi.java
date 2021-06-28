
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.Config;
import io.github.rajpratik71.infra_controller.service.api.dto.ConfigSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.IdResponse;
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
@Api(value = "configs", description = "the configs API")
public interface ConfigsApi {

        default ConfigsApiDelegate getDelegate() {
                return new ConfigsApiDelegate() {
                };
        }

        /**
         * POST /configs/create : Create a config
         *
         * @param body (optional)
         * @return no error (status code 201) or name conflicts with an existing object
         *         (status code 409) or server error (status code 500) or node is not
         *         part of a swarm (status code 503)
         */
        @ApiOperation(value = "Create a config", nickname = "configCreate", notes = "", response = IdResponse.class, tags = {
                        "Config", })
        @ApiResponses(value = { @ApiResponse(code = 201, message = "no error", response = IdResponse.class),
                        @ApiResponse(code = 409, message = "name conflicts with an existing object", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @PostMapping(value = "/configs/create", produces = { "application/json" }, consumes = { "application/json" })
        default ResponseEntity<IdResponse> configCreate(
                        @ApiParam(value = "") @Valid @RequestBody(required = false) Config body) {
                return getDelegate().configCreate(body);
        }

        /**
         * DELETE /configs/{id} : Delete a config
         *
         * @param id ID of the config (required)
         * @return no error (status code 204) or config not found (status code 404) or
         *         server error (status code 500) or node is not part of a swarm (status
         *         code 503)
         */
        @ApiOperation(value = "Delete a config", nickname = "configDelete", notes = "", tags = { "Config", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 404, message = "config not found", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @DeleteMapping(value = "/configs/{id}", produces = { "application/json" })
        default ResponseEntity<Void> configDelete(
                        @ApiParam(value = "ID of the config", required = true) @PathVariable("id") String id) {
                return getDelegate().configDelete(id);
        }

        /**
         * GET /configs/{id} : Inspect a config
         *
         * @param id ID of the config (required)
         * @return no error (status code 200) or config not found (status code 404) or
         *         server error (status code 500) or node is not part of a swarm (status
         *         code 503)
         */
        @ApiOperation(value = "Inspect a config", nickname = "configInspect", notes = "", response = Config.class, tags = {
                        "Config", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Config.class),
                        @ApiResponse(code = 404, message = "config not found", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @GetMapping(value = "/configs/{id}", produces = { "application/json" })
        default ResponseEntity<Config> configInspect(
                        @ApiParam(value = "ID of the config", required = true) @PathVariable("id") String id) {
                return getDelegate().configInspect(id);
        }

        /**
         * GET /configs : List configs
         *
         * @param filters A JSON encoded value of the filters (a
         *                &#x60;map[string][]string&#x60;) to process on the configs
         *                list. Available filters: - &#x60;id&#x3D;&lt;config
         *                id&gt;&#x60; - &#x60;label&#x3D;&lt;key&gt; or
         *                label&#x3D;&lt;key&gt;&#x3D;value&#x60; -
         *                &#x60;name&#x3D;&lt;config name&gt;&#x60; -
         *                &#x60;names&#x3D;&lt;config name&gt;&#x60; (optional)
         * @return no error (status code 200) or server error (status code 500) or node
         *         is not part of a swarm (status code 503)
         */
        @ApiOperation(value = "List configs", nickname = "configList", notes = "", response = Config.class, responseContainer = "List", tags = {
                        "Config", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "no error", response = Config.class, responseContainer = "List"),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @GetMapping(value = "/configs", produces = { "application/json" })
        default ResponseEntity<List<Config>> configList(
                        @ApiParam(value = "A JSON encoded value of the filters (a `map[string][]string`) to process on the configs list.  Available filters:  - `id=<config id>` - `label=<key> or label=<key>=value` - `name=<config name>` - `names=<config name>` ") @Valid @RequestParam(value = "filters", required = false) String filters) {
                return getDelegate().configList(filters);
        }

        /**
         * POST /configs/{id}/update : Update a Config
         *
         * @param id      The ID or name of the config (required)
         * @param version The version number of the config object being updated. This is
         *                required to avoid conflicting writes. (required)
         * @param body    The spec of the config to update. Currently, only the Labels
         *                field can be updated. All other fields must remain unchanged
         *                from the [ConfigInspect endpoint](#operation/ConfigInspect)
         *                response values. (optional)
         * @return no error (status code 200) or bad parameter (status code 400) or no
         *         such config (status code 404) or server error (status code 500) or
         *         node is not part of a swarm (status code 503)
         */
        @ApiOperation(value = "Update a Config", nickname = "configUpdate", notes = "", tags = { "Config", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "no such config", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @PostMapping(value = "/configs/{id}/update", produces = { "application/json", "text/plain" }, consumes = {
                        "application/json", "text/plain" })
        default ResponseEntity<Void> configUpdate(
                        @ApiParam(value = "The ID or name of the config", required = true) @PathVariable("id") String id,
                        @NotNull @ApiParam(value = "The version number of the config object being updated. This is required to avoid conflicting writes. ", required = true) @Valid @RequestParam(value = "version", required = true) Long version,
                        @ApiParam(value = "The spec of the config to update. Currently, only the Labels field can be updated. All other fields must remain unchanged from the [ConfigInspect endpoint](#operation/ConfigInspect) response values. ") @Valid @RequestBody(required = false) ConfigSpec body) {
                return getDelegate().configUpdate(id, version, body);
        }

}
