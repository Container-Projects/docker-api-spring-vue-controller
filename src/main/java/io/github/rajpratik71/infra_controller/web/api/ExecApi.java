
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ExecInspectResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject1;
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
@Api(value = "exec", description = "the exec API")
public interface ExecApi {

    default ExecApiDelegate getDelegate() {
        return new ExecApiDelegate() {
        };
    }

    /**
     * GET /exec/{id}/json : Inspect an exec instance Return low-level information
     * about an exec instance.
     *
     * @param id Exec instance ID (required)
     * @return No error (status code 200) or No such exec instance (status code 404)
     *         or Server error (status code 500)
     */
    @ApiOperation(value = "Inspect an exec instance", nickname = "execInspect", notes = "Return low-level information about an exec instance.", response = ExecInspectResponse.class, tags = {
            "Exec", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = ExecInspectResponse.class),
            @ApiResponse(code = 404, message = "No such exec instance", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/exec/{id}/json", produces = { "application/json" })
    default ResponseEntity<ExecInspectResponse> execInspect(
            @ApiParam(value = "Exec instance ID", required = true) @PathVariable("id") String id) {
        return getDelegate().execInspect(id);
    }

    /**
     * POST /exec/{id}/resize : Resize an exec instance Resize the TTY session used
     * by an exec instance. This endpoint only works if &#x60;tty&#x60; was
     * specified as part of creating and starting the exec instance.
     *
     * @param id Exec instance ID (required)
     * @param h  Height of the TTY session in characters (optional)
     * @param w  Width of the TTY session in characters (optional)
     * @return No error (status code 201) or No such exec instance (status code 404)
     */
    @ApiOperation(value = "Resize an exec instance", nickname = "execResize", notes = "Resize the TTY session used by an exec instance. This endpoint only works if `tty` was specified as part of creating and starting the exec instance. ", tags = {
            "Exec", })
    @ApiResponses(value = { @ApiResponse(code = 201, message = "No error"),
            @ApiResponse(code = 404, message = "No such exec instance", response = ErrorResponse.class) })
    @PostMapping(value = "/exec/{id}/resize", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> execResize(
            @ApiParam(value = "Exec instance ID", required = true) @PathVariable("id") String id,
            @ApiParam(value = "Height of the TTY session in characters") @Valid @RequestParam(value = "h", required = false) Integer h,
            @ApiParam(value = "Width of the TTY session in characters") @Valid @RequestParam(value = "w", required = false) Integer w) {
        return getDelegate().execResize(id, h, w);
    }

    /**
     * POST /exec/{id}/start : Start an exec instance Starts a previously set up
     * exec instance. If detach is true, this endpoint returns immediately after
     * starting the command. Otherwise, it sets up an interactive session with the
     * command.
     *
     * @param id              Exec instance ID (required)
     * @param execStartConfig (optional)
     * @return No error (status code 200) or No such exec instance (status code 404)
     *         or Container is stopped or paused (status code 409)
     */
    @ApiOperation(value = "Start an exec instance", nickname = "execStart", notes = "Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command. ", tags = {
            "Exec", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error"),
            @ApiResponse(code = 404, message = "No such exec instance", response = ErrorResponse.class),
            @ApiResponse(code = 409, message = "Container is stopped or paused", response = ErrorResponse.class) })
    @PostMapping(value = "/exec/{id}/start", produces = { "application/vnd.docker.raw-stream" }, consumes = {
            "application/json" })
    default ResponseEntity<Void> execStart(
            @ApiParam(value = "Exec instance ID", required = true) @PathVariable("id") String id,
            @ApiParam(value = "") @Valid @RequestBody(required = false) InlineObject1 execStartConfig) {
        return getDelegate().execStart(id, execStartConfig);
    }

}
