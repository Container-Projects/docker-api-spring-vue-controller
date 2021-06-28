
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
@Api(value = "_ping", description = "the _ping API")
public interface PingApi {

    default PingApiDelegate getDelegate() {
        return new PingApiDelegate() {
        };
    }

    /**
     * GET /_ping : Ping This is a dummy endpoint you can use to test if the server
     * is accessible.
     *
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Ping", nickname = "systemPing", notes = "This is a dummy endpoint you can use to test if the server is accessible.", response = String.class, tags = {
            "System", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = String.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/_ping", produces = { "text/plain" })
    default ResponseEntity<String> systemPing() {
        return getDelegate().systemPing();
    }

    /**
     * GET /_ping : Ping This is a dummy endpoint you can use to test if the server
     * is accessible.
     *
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Ping", nickname = "systemPingHead", notes = "This is a dummy endpoint you can use to test if the server is accessible.", response = String.class, tags = {
            "System", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = String.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/_ping", produces = { "text/plain" })
    default ResponseEntity<String> systemPingHead() {
        return getDelegate().systemPingHead();
    }

}
