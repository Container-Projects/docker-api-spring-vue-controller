
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject5;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject6;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject7;
import io.github.rajpratik71.infra_controller.service.api.dto.Swarm;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.UnlockKeyResponse;
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
@Api(value = "swarm", description = "the swarm API")
public interface SwarmApi {

    default SwarmApiDelegate getDelegate() {
        return new SwarmApiDelegate() {
        };
    }

    /**
     * POST /swarm/init : Initialize a new swarm
     *
     * @param body (required)
     * @return no error (status code 200) or bad parameter (status code 400) or
     *         server error (status code 500) or node is already part of a swarm
     *         (status code 503)
     */
    @ApiOperation(value = "Initialize a new swarm", nickname = "swarmInit", notes = "", response = String.class, tags = {
            "Swarm", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = String.class),
            @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is already part of a swarm", response = ErrorResponse.class) })
    @PostMapping(value = "/swarm/init", produces = { "application/json", "text/plain" }, consumes = {
            "application/json", "text/plain" })
    default ResponseEntity<String> swarmInit(
            @ApiParam(value = "", required = true) @Valid @RequestBody InlineObject5 body) {
        return getDelegate().swarmInit(body);
    }

    /**
     * GET /swarm : Inspect swarm
     *
     * @return no error (status code 200) or no such swarm (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     */
    @ApiOperation(value = "Inspect swarm", nickname = "swarmInspect", notes = "", response = Swarm.class, tags = {
            "Swarm", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Swarm.class),
            @ApiResponse(code = 404, message = "no such swarm", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @GetMapping(value = "/swarm", produces = { "application/json", "text/plain" })
    default ResponseEntity<Swarm> swarmInspect() {
        return getDelegate().swarmInspect();
    }

    /**
     * POST /swarm/join : Join an existing swarm
     *
     * @param body (required)
     * @return no error (status code 200) or bad parameter (status code 400) or
     *         server error (status code 500) or node is already part of a swarm
     *         (status code 503)
     */
    @ApiOperation(value = "Join an existing swarm", nickname = "swarmJoin", notes = "", tags = { "Swarm", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is already part of a swarm", response = ErrorResponse.class) })
    @PostMapping(value = "/swarm/join", produces = { "application/json", "text/plain" }, consumes = {
            "application/json", "text/plain" })
    default ResponseEntity<Void> swarmJoin(
            @ApiParam(value = "", required = true) @Valid @RequestBody InlineObject6 body) {
        return getDelegate().swarmJoin(body);
    }

    /**
     * POST /swarm/leave : Leave a swarm
     *
     * @param force Force leave swarm, even if this is the last manager or that it
     *              will break the cluster. (optional, default to false)
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     */
    @ApiOperation(value = "Leave a swarm", nickname = "swarmLeave", notes = "", tags = { "Swarm", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @PostMapping(value = "/swarm/leave", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> swarmLeave(
            @ApiParam(value = "Force leave swarm, even if this is the last manager or that it will break the cluster. ", defaultValue = "false") @Valid @RequestParam(value = "force", required = false, defaultValue = "false") Boolean force) {
        return getDelegate().swarmLeave(force);
    }

    /**
     * POST /swarm/unlock : Unlock a locked manager
     *
     * @param body (required)
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     */
    @ApiOperation(value = "Unlock a locked manager", nickname = "swarmUnlock", notes = "", tags = { "Swarm", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @PostMapping(value = "/swarm/unlock", produces = { "application/json" }, consumes = { "application/json" })
    default ResponseEntity<Void> swarmUnlock(
            @ApiParam(value = "", required = true) @Valid @RequestBody InlineObject7 body) {
        return getDelegate().swarmUnlock(body);
    }

    /**
     * GET /swarm/unlockkey : Get the unlock key
     *
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     */
    @ApiOperation(value = "Get the unlock key", nickname = "swarmUnlockkey", notes = "", response = UnlockKeyResponse.class, tags = {
            "Swarm", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = UnlockKeyResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @GetMapping(value = "/swarm/unlockkey", produces = { "application/json", "text/plain" })
    default ResponseEntity<UnlockKeyResponse> swarmUnlockkey() {
        return getDelegate().swarmUnlockkey();
    }

    /**
     * POST /swarm/update : Update a swarm
     *
     * @param version                The version number of the swarm object being
     *                               updated. This is required to avoid conflicting
     *                               writes. (required)
     * @param body                   (required)
     * @param rotateWorkerToken      Rotate the worker join token. (optional,
     *                               default to false)
     * @param rotateManagerToken     Rotate the manager join token. (optional,
     *                               default to false)
     * @param rotateManagerUnlockKey Rotate the manager unlock key. (optional,
     *                               default to false)
     * @return no error (status code 200) or bad parameter (status code 400) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     */
    @ApiOperation(value = "Update a swarm", nickname = "swarmUpdate", notes = "", tags = { "Swarm", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @PostMapping(value = "/swarm/update", produces = { "application/json", "text/plain" }, consumes = {
            "application/json", "text/plain" })
    default ResponseEntity<Void> swarmUpdate(
            @NotNull @ApiParam(value = "The version number of the swarm object being updated. This is required to avoid conflicting writes. ", required = true) @Valid @RequestParam(value = "version", required = true) Long version,
            @ApiParam(value = "", required = true) @Valid @RequestBody SwarmSpec body,
            @ApiParam(value = "Rotate the worker join token.", defaultValue = "false") @Valid @RequestParam(value = "rotateWorkerToken", required = false, defaultValue = "false") Boolean rotateWorkerToken,
            @ApiParam(value = "Rotate the manager join token.", defaultValue = "false") @Valid @RequestParam(value = "rotateManagerToken", required = false, defaultValue = "false") Boolean rotateManagerToken,
            @ApiParam(value = "Rotate the manager unlock key.", defaultValue = "false") @Valid @RequestParam(value = "rotateManagerUnlockKey", required = false, defaultValue = "false") Boolean rotateManagerUnlockKey) {
        return getDelegate().swarmUpdate(version, body, rotateWorkerToken, rotateManagerToken, rotateManagerUnlockKey);
    }

}
