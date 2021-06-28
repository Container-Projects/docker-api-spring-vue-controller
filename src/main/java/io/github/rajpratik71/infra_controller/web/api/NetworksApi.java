
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject2;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject3;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject4;
import io.github.rajpratik71.infra_controller.service.api.dto.Network;
import io.github.rajpratik71.infra_controller.service.api.dto.NetworkCreateResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.NetworkPruneResponse;
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
@Api(value = "networks", description = "the networks API")
public interface NetworksApi {

    default NetworksApiDelegate getDelegate() {
        return new NetworksApiDelegate() {
        };
    }

    /**
     * POST /networks/{id}/connect : Connect a container to a network
     *
     * @param id        Network ID or name (required)
     * @param container (required)
     * @return No error (status code 200) or Operation not supported for swarm
     *         scoped networks (status code 403) or Network or container not found
     *         (status code 404) or Server error (status code 500)
     */
    @ApiOperation(value = "Connect a container to a network", nickname = "networkConnect", notes = "", tags = {
            "Network", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error"),
            @ApiResponse(code = 403, message = "Operation not supported for swarm scoped networks", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "Network or container not found", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/networks/{id}/connect", produces = { "application/json", "text/plain" }, consumes = {
            "application/json" })
    default ResponseEntity<Void> networkConnect(
            @ApiParam(value = "Network ID or name", required = true) @PathVariable("id") String id,
            @ApiParam(value = "", required = true) @Valid @RequestBody InlineObject3 container) {
        return getDelegate().networkConnect(id, container);
    }

    /**
     * POST /networks/create : Create a network
     *
     * @param networkConfig (required)
     * @return No error (status code 201) or operation not supported for pre-defined
     *         networks (status code 403) or plugin not found (status code 404) or
     *         Server error (status code 500)
     */
    @ApiOperation(value = "Create a network", nickname = "networkCreate", notes = "", response = NetworkCreateResponse.class, tags = {
            "Network", })
    @ApiResponses(value = { @ApiResponse(code = 201, message = "No error", response = NetworkCreateResponse.class),
            @ApiResponse(code = 403, message = "operation not supported for pre-defined networks", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "plugin not found", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/networks/create", produces = { "application/json" }, consumes = { "application/json" })
    default ResponseEntity<NetworkCreateResponse> networkCreate(
            @ApiParam(value = "", required = true) @Valid @RequestBody InlineObject2 networkConfig) {
        return getDelegate().networkCreate(networkConfig);
    }

    /**
     * DELETE /networks/{id} : Remove a network
     *
     * @param id Network ID or name (required)
     * @return No error (status code 204) or operation not supported for pre-defined
     *         networks (status code 403) or no such network (status code 404) or
     *         Server error (status code 500)
     */
    @ApiOperation(value = "Remove a network", nickname = "networkDelete", notes = "", tags = { "Network", })
    @ApiResponses(value = { @ApiResponse(code = 204, message = "No error"),
            @ApiResponse(code = 403, message = "operation not supported for pre-defined networks", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "no such network", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @DeleteMapping(value = "/networks/{id}", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> networkDelete(
            @ApiParam(value = "Network ID or name", required = true) @PathVariable("id") String id) {
        return getDelegate().networkDelete(id);
    }

    /**
     * POST /networks/{id}/disconnect : Disconnect a container from a network
     *
     * @param id        Network ID or name (required)
     * @param container (required)
     * @return No error (status code 200) or Operation not supported for swarm
     *         scoped networks (status code 403) or Network or container not found
     *         (status code 404) or Server error (status code 500)
     */
    @ApiOperation(value = "Disconnect a container from a network", nickname = "networkDisconnect", notes = "", tags = {
            "Network", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error"),
            @ApiResponse(code = 403, message = "Operation not supported for swarm scoped networks", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "Network or container not found", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/networks/{id}/disconnect", produces = { "application/json", "text/plain" }, consumes = {
            "application/json" })
    default ResponseEntity<Void> networkDisconnect(
            @ApiParam(value = "Network ID or name", required = true) @PathVariable("id") String id,
            @ApiParam(value = "", required = true) @Valid @RequestBody InlineObject4 container) {
        return getDelegate().networkDisconnect(id, container);
    }

    /**
     * GET /networks/{id} : Inspect a network
     *
     * @param id      Network ID or name (required)
     * @param verbose Detailed inspect output for troubleshooting (optional, default
     *                to false)
     * @param scope   Filter the network by scope (swarm, global, or local)
     *                (optional)
     * @return No error (status code 200) or Network not found (status code 404) or
     *         Server error (status code 500)
     */
    @ApiOperation(value = "Inspect a network", nickname = "networkInspect", notes = "", response = Network.class, tags = {
            "Network", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = Network.class),
            @ApiResponse(code = 404, message = "Network not found", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/networks/{id}", produces = { "application/json" })
    default ResponseEntity<Network> networkInspect(
            @ApiParam(value = "Network ID or name", required = true) @PathVariable("id") String id,
            @ApiParam(value = "Detailed inspect output for troubleshooting", defaultValue = "false") @Valid @RequestParam(value = "verbose", required = false, defaultValue = "false") Boolean verbose,
            @ApiParam(value = "Filter the network by scope (swarm, global, or local)") @Valid @RequestParam(value = "scope", required = false) String scope) {
        return getDelegate().networkInspect(id, verbose, scope);
    }

    /**
     * GET /networks : List networks Returns a list of networks. For details on the
     * format, see the [network inspect endpoint](#operation/NetworkInspect). Note
     * that it uses a different, smaller representation of a network than inspecting
     * a single network. For example, the list of containers attached to the network
     * is not propagated in API versions 1.28 and up.
     *
     * @param filters JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the networks
     *                list. Available filters: -
     *                &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to
     *                &#x60;true&#x60; (or &#x60;1&#x60;), returns all networks that
     *                are not in use by a container. When set to &#x60;false&#x60;
     *                (or &#x60;0&#x60;), only networks that are in use by one or
     *                more containers are returned. -
     *                &#x60;driver&#x3D;&lt;driver-name&gt;&#x60; Matches a
     *                network&#39;s driver. - &#x60;id&#x3D;&lt;network-id&gt;&#x60;
     *                Matches all or part of a network ID. -
     *                &#x60;label&#x3D;&lt;key&gt;&#x60; or
     *                &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60; of a
     *                network label. - &#x60;name&#x3D;&lt;network-name&gt;&#x60;
     *                Matches all or part of a network name. -
     *                &#x60;scope&#x3D;[\&quot;swarm\&quot;|\&quot;global\&quot;|\&quot;local\&quot;]&#x60;
     *                Filters networks by scope (&#x60;swarm&#x60;,
     *                &#x60;global&#x60;, or &#x60;local&#x60;). -
     *                &#x60;type&#x3D;[\&quot;custom\&quot;|\&quot;builtin\&quot;]&#x60;
     *                Filters networks by type. The &#x60;custom&#x60; keyword
     *                returns all user-defined networks. (optional)
     * @return No error (status code 200) or Server error (status code 500)
     */
    @ApiOperation(value = "List networks", nickname = "networkList", notes = "Returns a list of networks. For details on the format, see the [network inspect endpoint](#operation/NetworkInspect).  Note that it uses a different, smaller representation of a network than inspecting a single network. For example, the list of containers attached to the network is not propagated in API versions 1.28 and up. ", response = Network.class, responseContainer = "List", tags = {
            "Network", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "No error", response = Network.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/networks", produces = { "application/json" })
    default ResponseEntity<List<Network>> networkList(
            @ApiParam(value = "JSON encoded value of the filters (a `map[string][]string`) to process on the networks list.  Available filters:  - `dangling=<boolean>` When set to `true` (or `1`), returns all    networks that are not in use by a container. When set to `false`    (or `0`), only networks that are in use by one or more    containers are returned. - `driver=<driver-name>` Matches a network's driver. - `id=<network-id>` Matches all or part of a network ID. - `label=<key>` or `label=<key>=<value>` of a network label. - `name=<network-name>` Matches all or part of a network name. - `scope=[\"swarm\"|\"global\"|\"local\"]` Filters networks by scope (`swarm`, `global`, or `local`). - `type=[\"custom\"|\"builtin\"]` Filters networks by type. The `custom` keyword returns all user-defined networks. ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().networkList(filters);
    }

    /**
     * POST /networks/prune : Delete unused networks
     *
     * @param filters Filters to process on the prune list, encoded as JSON (a
     *                &#x60;map[string][]string&#x60;). Available filters: -
     *                &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune networks
     *                created before this timestamp. The
     *                &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date
     *                formatted timestamps, or Go duration strings (e.g.
     *                &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the
     *                daemon machine’s time. - &#x60;label&#x60;
     *                (&#x60;label&#x3D;&lt;key&gt;&#x60;,
     *                &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;,
     *                &#x60;label!&#x3D;&lt;key&gt;&#x60;, or
     *                &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune
     *                networks with (or without, in case &#x60;label!&#x3D;...&#x60;
     *                is used) the specified labels. (optional)
     * @return No error (status code 200) or Server error (status code 500)
     */
    @ApiOperation(value = "Delete unused networks", nickname = "networkPrune", notes = "", response = NetworkPruneResponse.class, tags = {
            "Network", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = NetworkPruneResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/networks/prune", produces = { "application/json" })
    default ResponseEntity<NetworkPruneResponse> networkPrune(
            @ApiParam(value = "Filters to process on the prune list, encoded as JSON (a `map[string][]string`).  Available filters: - `until=<timestamp>` Prune networks created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time. - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune networks with (or without, in case `label!=...` is used) the specified labels. ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().networkPrune(filters);
    }

}
