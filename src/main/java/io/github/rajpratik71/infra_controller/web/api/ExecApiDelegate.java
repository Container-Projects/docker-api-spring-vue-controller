package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ExecInspectResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject1;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ExecApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface ExecApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /exec/{id}/json : Inspect an exec instance
     * Return low-level information about an exec instance.
     *
     * @param id Exec instance ID (required)
     * @return No error (status code 200)
     *         or No such exec instance (status code 404)
     *         or Server error (status code 500)
     * @see ExecApi#execInspect
     */
    default ResponseEntity<ExecInspectResponse> execInspect(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"DetachKeys\" : \"DetachKeys\", \"ProcessConfig\" : { \"privileged\" : true, \"entrypoint\" : \"entrypoint\", \"tty\" : true, \"arguments\" : [ \"arguments\", \"arguments\" ], \"user\" : \"user\" }, \"ContainerID\" : \"ContainerID\", \"ExitCode\" : 0, \"OpenStdout\" : true, \"Running\" : true, \"OpenStdin\" : true, \"Pid\" : 6, \"ID\" : \"ID\", \"CanRemove\" : true, \"OpenStderr\" : true }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /exec/{id}/resize : Resize an exec instance
     * Resize the TTY session used by an exec instance. This endpoint only works if &#x60;tty&#x60; was specified as part of creating and starting the exec instance. 
     *
     * @param id Exec instance ID (required)
     * @param h Height of the TTY session in characters (optional)
     * @param w Width of the TTY session in characters (optional)
     * @return No error (status code 201)
     *         or No such exec instance (status code 404)
     * @see ExecApi#execResize
     */
    default ResponseEntity<Void> execResize(String id,
        Integer h,
        Integer w) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /exec/{id}/start : Start an exec instance
     * Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command. 
     *
     * @param id Exec instance ID (required)
     * @param execStartConfig  (optional)
     * @return No error (status code 200)
     *         or No such exec instance (status code 404)
     *         or Container is stopped or paused (status code 409)
     * @see ExecApi#execStart
     */
    default ResponseEntity<Void> execStart(String id,
        InlineObject1 execStartConfig) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
