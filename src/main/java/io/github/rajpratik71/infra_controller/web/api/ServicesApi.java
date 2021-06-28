
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Service;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceCreateResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceUpdateResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Service;
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
@Api(value = "services", description = "the services API")
public interface ServicesApi {

        default ServicesApiDelegate getDelegate() {
                return new ServicesApiDelegate() {
                };
        }

        /**
         * POST /services/create : Create a service
         *
         * @param body          (required)
         * @param xRegistryAuth A base64url-encoded auth configuration for pulling from
         *                      private registries. Refer to the [authentication
         *                      section](#section/Authentication) for details.
         *                      (optional)
         * @return no error (status code 201) or bad parameter (status code 400) or
         *         network is not eligible for services (status code 403) or name
         *         conflicts with an existing service (status code 409) or server error
         *         (status code 500) or node is not part of a swarm (status code 503)
         */
        @ApiOperation(value = "Create a service", nickname = "serviceCreate", notes = "", response = ServiceCreateResponse.class, tags = {
                        "Service", })
        @ApiResponses(value = { @ApiResponse(code = 201, message = "no error", response = ServiceCreateResponse.class),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 403, message = "network is not eligible for services", response = ErrorResponse.class),
                        @ApiResponse(code = 409, message = "name conflicts with an existing service", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @PostMapping(value = "/services/create", produces = { "application/json" }, consumes = { "application/json" })
        default ResponseEntity<ServiceCreateResponse> serviceCreate(
                        @ApiParam(value = "", required = true) @Valid @RequestBody Service body,
                        @ApiParam(value = "A base64url-encoded auth configuration for pulling from private registries.  Refer to the [authentication section](#section/Authentication) for details. ") @RequestHeader(value = "X-Registry-Auth", required = false) String xRegistryAuth) {
                return getDelegate().serviceCreate(body, xRegistryAuth);
        }

        /**
         * DELETE /services/{id} : Delete a service
         *
         * @param id ID or name of service. (required)
         * @return no error (status code 200) or no such service (status code 404) or
         *         server error (status code 500) or node is not part of a swarm (status
         *         code 503)
         */
        @ApiOperation(value = "Delete a service", nickname = "serviceDelete", notes = "", tags = { "Service", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
                        @ApiResponse(code = 404, message = "no such service", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @DeleteMapping(value = "/services/{id}", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> serviceDelete(
                        @ApiParam(value = "ID or name of service.", required = true) @PathVariable("id") String id) {
                return getDelegate().serviceDelete(id);
        }

        /**
         * GET /services/{id} : Inspect a service
         *
         * @param id             ID or name of service. (required)
         * @param insertDefaults Fill empty fields with default values. (optional,
         *                       default to false)
         * @return no error (status code 200) or no such service (status code 404) or
         *         server error (status code 500) or node is not part of a swarm (status
         *         code 503)
         */
        @ApiOperation(value = "Inspect a service", nickname = "serviceInspect", notes = "", response = Service.class, tags = {
                        "Service", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Service.class),
                        @ApiResponse(code = 404, message = "no such service", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @GetMapping(value = "/services/{id}", produces = { "application/json", "text/plain" })
        default ResponseEntity<Service> serviceInspect(
                        @ApiParam(value = "ID or name of service.", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Fill empty fields with default values.", defaultValue = "false") @Valid @RequestParam(value = "insertDefaults", required = false, defaultValue = "false") Boolean insertDefaults) {
                return getDelegate().serviceInspect(id, insertDefaults);
        }

        /**
         * GET /services : List services
         *
         * @param filters A JSON encoded value of the filters (a
         *                &#x60;map[string][]string&#x60;) to process on the services
         *                list. Available filters: - &#x60;id&#x3D;&lt;service
         *                id&gt;&#x60; - &#x60;label&#x3D;&lt;service label&gt;&#x60; -
         *                &#x60;mode&#x3D;[\&quot;replicated\&quot;|\&quot;global\&quot;]&#x60;
         *                - &#x60;name&#x3D;&lt;service name&gt;&#x60; (optional)
         * @param status  Include service status, with count of running and desired
         *                tasks. (optional)
         * @return no error (status code 200) or server error (status code 500) or node
         *         is not part of a swarm (status code 503)
         */
        @ApiOperation(value = "List services", nickname = "serviceList", notes = "", response = Service.class, responseContainer = "List", tags = {
                        "Service", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "no error", response = Service.class, responseContainer = "List"),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @GetMapping(value = "/services", produces = { "application/json", "text/plain" })
        default ResponseEntity<List<Service>> serviceList(
                        @ApiParam(value = "A JSON encoded value of the filters (a `map[string][]string`) to process on the services list.  Available filters:  - `id=<service id>` - `label=<service label>` - `mode=[\"replicated\"|\"global\"]` - `name=<service name>` ") @Valid @RequestParam(value = "filters", required = false) String filters,
                        @ApiParam(value = "Include service status, with count of running and desired tasks. ") @Valid @RequestParam(value = "status", required = false) Boolean status) {
                return getDelegate().serviceList(filters, status);
        }

        /**
         * GET /services/{id}/logs : Get service logs Get &#x60;stdout&#x60; and
         * &#x60;stderr&#x60; logs from a service. See also
         * [&#x60;/containers/{id}/logs&#x60;](#operation/ContainerLogs). **Note**: This
         * endpoint works only for services with the &#x60;local&#x60;,
         * &#x60;json-file&#x60; or &#x60;journald&#x60; logging drivers.
         *
         * @param id         ID or name of the service (required)
         * @param details    Show service context and extra details provided to logs.
         *                   (optional, default to false)
         * @param follow     Keep connection after returning logs. (optional, default to
         *                   false)
         * @param stdout     Return logs from &#x60;stdout&#x60; (optional, default to
         *                   false)
         * @param stderr     Return logs from &#x60;stderr&#x60; (optional, default to
         *                   false)
         * @param since      Only return logs since this time, as a UNIX timestamp
         *                   (optional, default to 0)
         * @param timestamps Add timestamps to every log line (optional, default to
         *                   false)
         * @param tail       Only return this number of log lines from the end of the
         *                   logs. Specify as an integer or &#x60;all&#x60; to output
         *                   all log lines. (optional, default to all)
         * @return logs returned as a stream in response body (status code 200) or no
         *         such service (status code 404) or server error (status code 500) or
         *         node is not part of a swarm (status code 503)
         */
        @ApiOperation(value = "Get service logs", nickname = "serviceLogs", notes = "Get `stdout` and `stderr` logs from a service. See also [`/containers/{id}/logs`](#operation/ContainerLogs).  **Note**: This endpoint works only for services with the `local`, `json-file` or `journald` logging drivers. ", response = org.springframework.web.multipart.MultipartFile.class, tags = {
                        "Service", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "logs returned as a stream in response body", response = org.springframework.web.multipart.MultipartFile.class),
                        @ApiResponse(code = 404, message = "no such service", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @GetMapping(value = "/services/{id}/logs", produces = { "application/json", "text/plain" })
        default ResponseEntity<org.springframework.web.multipart.MultipartFile> serviceLogs(
                        @ApiParam(value = "ID or name of the service", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Show service context and extra details provided to logs.", defaultValue = "false") @Valid @RequestParam(value = "details", required = false, defaultValue = "false") Boolean details,
                        @ApiParam(value = "Keep connection after returning logs.", defaultValue = "false") @Valid @RequestParam(value = "follow", required = false, defaultValue = "false") Boolean follow,
                        @ApiParam(value = "Return logs from `stdout`", defaultValue = "false") @Valid @RequestParam(value = "stdout", required = false, defaultValue = "false") Boolean stdout,
                        @ApiParam(value = "Return logs from `stderr`", defaultValue = "false") @Valid @RequestParam(value = "stderr", required = false, defaultValue = "false") Boolean stderr,
                        @ApiParam(value = "Only return logs since this time, as a UNIX timestamp", defaultValue = "0") @Valid @RequestParam(value = "since", required = false, defaultValue = "0") Integer since,
                        @ApiParam(value = "Add timestamps to every log line", defaultValue = "false") @Valid @RequestParam(value = "timestamps", required = false, defaultValue = "false") Boolean timestamps,
                        @ApiParam(value = "Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. ", defaultValue = "all") @Valid @RequestParam(value = "tail", required = false, defaultValue = "all") String tail) {
                return getDelegate().serviceLogs(id, details, follow, stdout, stderr, since, timestamps, tail);
        }

        /**
         * POST /services/{id}/update : Update a service
         *
         * @param id               ID or name of service. (required)
         * @param version          The version number of the service object being
         *                         updated. This is required to avoid conflicting
         *                         writes. This version number should be the value as
         *                         currently set on the service *before* the update. You
         *                         can find the current version by calling &#x60;GET
         *                         /services/{id}&#x60; (required)
         * @param body             (required)
         * @param registryAuthFrom If the &#x60;X-Registry-Auth&#x60; header is not
         *                         specified, this parameter indicates where to find
         *                         registry authorization credentials. (optional,
         *                         default to spec)
         * @param rollback         Set to this parameter to &#x60;previous&#x60; to
         *                         cause a server-side rollback to the previous service
         *                         spec. The supplied spec will be ignored in this case.
         *                         (optional)
         * @param xRegistryAuth    A base64url-encoded auth configuration for pulling
         *                         from private registries. Refer to the [authentication
         *                         section](#section/Authentication) for details.
         *                         (optional)
         * @return no error (status code 200) or bad parameter (status code 400) or no
         *         such service (status code 404) or server error (status code 500) or
         *         node is not part of a swarm (status code 503)
         */
        @ApiOperation(value = "Update a service", nickname = "serviceUpdate", notes = "", response = ServiceUpdateResponse.class, tags = {
                        "Service", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = ServiceUpdateResponse.class),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "no such service", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @PostMapping(value = "/services/{id}/update", produces = { "application/json" }, consumes = {
                        "application/json" })
        default ResponseEntity<ServiceUpdateResponse> serviceUpdate(
                        @ApiParam(value = "ID or name of service.", required = true) @PathVariable("id") String id,
                        @NotNull @ApiParam(value = "The version number of the service object being updated. This is required to avoid conflicting writes. This version number should be the value as currently set on the service *before* the update. You can find the current version by calling `GET /services/{id}` ", required = true) @Valid @RequestParam(value = "version", required = true) Integer version,
                        @ApiParam(value = "", required = true) @Valid @RequestBody Service body,
                        @ApiParam(value = "If the `X-Registry-Auth` header is not specified, this parameter indicates where to find registry authorization credentials. ", allowableValues = "spec, previous-spec", defaultValue = "spec") @Valid @RequestParam(value = "registryAuthFrom", required = false, defaultValue = "spec") String registryAuthFrom,
                        @ApiParam(value = "Set to this parameter to `previous` to cause a server-side rollback to the previous service spec. The supplied spec will be ignored in this case. ") @Valid @RequestParam(value = "rollback", required = false) String rollback,
                        @ApiParam(value = "A base64url-encoded auth configuration for pulling from private registries.  Refer to the [authentication section](#section/Authentication) for details. ") @RequestHeader(value = "X-Registry-Auth", required = false) String xRegistryAuth) {
                return getDelegate().serviceUpdate(id, version, body, registryAuthFrom, rollback, xRegistryAuth);
        }

}
