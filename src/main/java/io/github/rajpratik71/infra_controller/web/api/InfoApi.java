
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemInfo;
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
@Api(value = "info", description = "the info API")
public interface InfoApi {

    default InfoApiDelegate getDelegate() {
        return new InfoApiDelegate() {
        };
    }

    /**
     * GET /info : Get system information
     *
     * @return No error (status code 200) or Server error (status code 500)
     */
    @ApiOperation(value = "Get system information", nickname = "systemInfo", notes = "", response = SystemInfo.class, tags = {
            "System", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = SystemInfo.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/info", produces = { "application/json" })
    default ResponseEntity<SystemInfo> systemInfo() {
        return getDelegate().systemInfo();
    }

}
