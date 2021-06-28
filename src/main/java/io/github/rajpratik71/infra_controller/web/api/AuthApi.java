
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.AuthConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemAuthResponse;
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
@Api(value = "auth", description = "the auth API")
public interface AuthApi {

    default AuthApiDelegate getDelegate() {
        return new AuthApiDelegate() {
        };
    }

    /**
     * POST /auth : Check auth configuration Validate credentials for a registry
     * and, if available, get an identity token for accessing the registry without
     * password.
     *
     * @param authConfig Authentication to check (optional)
     * @return An identity token was generated successfully. (status code 200) or No
     *         error (status code 204) or Server error (status code 500)
     */
    @ApiOperation(value = "Check auth configuration", nickname = "systemAuth", notes = "Validate credentials for a registry and, if available, get an identity token for accessing the registry without password. ", response = SystemAuthResponse.class, tags = {
            "System", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "An identity token was generated successfully.", response = SystemAuthResponse.class),
            @ApiResponse(code = 204, message = "No error"),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/auth", produces = { "application/json" }, consumes = { "application/json" })
    default ResponseEntity<SystemAuthResponse> systemAuth(
            @ApiParam(value = "Authentication to check") @Valid @RequestBody(required = false) AuthConfig authConfig) {
        return getDelegate().systemAuth(authConfig);
    }

}
