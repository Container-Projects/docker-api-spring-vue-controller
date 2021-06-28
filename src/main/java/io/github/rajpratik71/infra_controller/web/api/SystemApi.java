
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemDataUsageResponse;
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
@Api(value = "system", description = "the system API")
public interface SystemApi {

    default SystemApiDelegate getDelegate() {
        return new SystemApiDelegate() {
        };
    }

    /**
     * GET /system/df : Get data usage information
     *
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Get data usage information", nickname = "systemDataUsage", notes = "", response = SystemDataUsageResponse.class, tags = {
            "System", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = SystemDataUsageResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/system/df", produces = { "application/json", "text/plain" })
    default ResponseEntity<SystemDataUsageResponse> systemDataUsage() {
        return getDelegate().systemDataUsage();
    }

}
