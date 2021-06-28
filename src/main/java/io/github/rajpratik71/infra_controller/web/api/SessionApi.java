
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
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
@Api(value = "session", description = "the session API")
public interface SessionApi {

    default SessionApiDelegate getDelegate() {
        return new SessionApiDelegate() {
        };
    }

    /**
     * POST /session : Initialize interactive session Start a new interactive
     * session with a server. Session allows server to call back to the client for
     * advanced capabilities. ### Hijacking This endpoint hijacks the HTTP
     * connection to HTTP2 transport that allows the client to expose gPRC services
     * on that connection. For example, the client sends this request to upgrade the
     * connection: &#x60;&#x60;&#x60; POST /session HTTP/1.1 Upgrade: h2c
     * Connection: Upgrade &#x60;&#x60;&#x60; The Docker daemon responds with a
     * &#x60;101 UPGRADED&#x60; response follow with the raw stream:
     * &#x60;&#x60;&#x60; HTTP/1.1 101 UPGRADED Connection: Upgrade Upgrade: h2c
     * &#x60;&#x60;&#x60;
     *
     * @return no error, hijacking successful (status code 101) or bad parameter
     *         (status code 400) or server error (status code 500)
     */
    @ApiOperation(value = "Initialize interactive session", nickname = "session", notes = "Start a new interactive session with a server. Session allows server to call back to the client for advanced capabilities.  ### Hijacking  This endpoint hijacks the HTTP connection to HTTP2 transport that allows the client to expose gPRC services on that connection.  For example, the client sends this request to upgrade the connection:  ``` POST /session HTTP/1.1 Upgrade: h2c Connection: Upgrade ```  The Docker daemon responds with a `101 UPGRADED` response follow with the raw stream:  ``` HTTP/1.1 101 UPGRADED Connection: Upgrade Upgrade: h2c ``` ", tags = {
            "Session", })
    @ApiResponses(value = { @ApiResponse(code = 101, message = "no error, hijacking successful"),
            @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/session", produces = { "application/vnd.docker.raw-stream" })
    default ResponseEntity<Void> session() {
        return getDelegate().session();
    }

}
