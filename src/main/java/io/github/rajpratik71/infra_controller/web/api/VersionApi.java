
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemVersion;
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
@Api(value = "version", description = "the version API")
public interface VersionApi {

    default VersionApiDelegate getDelegate() {
        return new VersionApiDelegate() {
        };
    }

    /**
     * GET /version : Get version Returns the version of Docker that is running and
     * various information about the system that Docker is running on.
     *
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Get version", nickname = "systemVersion", notes = "Returns the version of Docker that is running and various information about the system that Docker is running on.", response = SystemVersion.class, tags = {
            "System", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = SystemVersion.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/version", produces = { "application/json" })
    default ResponseEntity<SystemVersion> systemVersion() {
        return getDelegate().systemVersion();
    }

}
