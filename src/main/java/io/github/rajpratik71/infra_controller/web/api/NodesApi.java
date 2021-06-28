
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Node;
import io.github.rajpratik71.infra_controller.service.api.dto.NodeSpec;
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
@Api(value = "nodes", description = "the nodes API")
public interface NodesApi {

    default NodesApiDelegate getDelegate() {
        return new NodesApiDelegate() {
        };
    }

    /**
     * DELETE /nodes/{id} : Delete a node
     *
     * @param id    The ID or name of the node (required)
     * @param force Force remove a node from the swarm (optional, default to false)
     * @return no error (status code 200) or no such node (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     */
    @ApiOperation(value = "Delete a node", nickname = "nodeDelete", notes = "", tags = { "Node", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 404, message = "no such node", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @DeleteMapping(value = "/nodes/{id}", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> nodeDelete(
            @ApiParam(value = "The ID or name of the node", required = true) @PathVariable("id") String id,
            @ApiParam(value = "Force remove a node from the swarm", defaultValue = "false") @Valid @RequestParam(value = "force", required = false, defaultValue = "false") Boolean force) {
        return getDelegate().nodeDelete(id, force);
    }

    /**
     * GET /nodes/{id} : Inspect a node
     *
     * @param id The ID or name of the node (required)
     * @return no error (status code 200) or no such node (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     */
    @ApiOperation(value = "Inspect a node", nickname = "nodeInspect", notes = "", response = Node.class, tags = {
            "Node", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Node.class),
            @ApiResponse(code = 404, message = "no such node", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @GetMapping(value = "/nodes/{id}", produces = { "application/json", "text/plain" })
    default ResponseEntity<Node> nodeInspect(
            @ApiParam(value = "The ID or name of the node", required = true) @PathVariable("id") String id) {
        return getDelegate().nodeInspect(id);
    }

    /**
     * GET /nodes : List nodes
     *
     * @param filters Filters to process on the nodes list, encoded as JSON (a
     *                &#x60;map[string][]string&#x60;). Available filters: -
     *                &#x60;id&#x3D;&lt;node id&gt;&#x60; -
     *                &#x60;label&#x3D;&lt;engine label&gt;&#x60; -
     *                &#x60;membership&#x3D;&#x60;(&#x60;accepted&#x60;|&#x60;pending&#x60;)&#x60;
     *                - &#x60;name&#x3D;&lt;node name&gt;&#x60; -
     *                &#x60;node.label&#x3D;&lt;node label&gt;&#x60; -
     *                &#x60;role&#x3D;&#x60;(&#x60;manager&#x60;|&#x60;worker&#x60;)&#x60;
     *                (optional)
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     */
    @ApiOperation(value = "List nodes", nickname = "nodeList", notes = "", response = Node.class, responseContainer = "List", tags = {
            "Node", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "no error", response = Node.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @GetMapping(value = "/nodes", produces = { "application/json", "text/plain" })
    default ResponseEntity<List<Node>> nodeList(
            @ApiParam(value = "Filters to process on the nodes list, encoded as JSON (a `map[string][]string`).  Available filters: - `id=<node id>` - `label=<engine label>` - `membership=`(`accepted`|`pending`)` - `name=<node name>` - `node.label=<node label>` - `role=`(`manager`|`worker`)` ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().nodeList(filters);
    }

    /**
     * POST /nodes/{id}/update : Update a node
     *
     * @param id      The ID of the node (required)
     * @param version The version number of the node object being updated. This is
     *                required to avoid conflicting writes. (required)
     * @param body    (optional)
     * @return no error (status code 200) or bad parameter (status code 400) or no
     *         such node (status code 404) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     */
    @ApiOperation(value = "Update a node", nickname = "nodeUpdate", notes = "", tags = { "Node", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "no such node", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @PostMapping(value = "/nodes/{id}/update", produces = { "application/json", "text/plain" }, consumes = {
            "application/json", "text/plain" })
    default ResponseEntity<Void> nodeUpdate(
            @ApiParam(value = "The ID of the node", required = true) @PathVariable("id") String id,
            @NotNull @ApiParam(value = "The version number of the node object being updated. This is required to avoid conflicting writes. ", required = true) @Valid @RequestParam(value = "version", required = true) Long version,
            @ApiParam(value = "") @Valid @RequestBody(required = false) NodeSpec body) {
        return getDelegate().nodeUpdate(id, version, body);
    }

}
