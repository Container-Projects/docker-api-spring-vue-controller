
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.DistributionInspectResponse;
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
@Api(value = "distribution", description = "the distribution API")
public interface DistributionApi {

    default DistributionApiDelegate getDelegate() {
        return new DistributionApiDelegate() {
        };
    }

    /**
     * GET /distribution/{name}/json : Get image information from the registry
     * Return image digest and platform information by contacting the registry.
     *
     * @param name Image name or id (required)
     * @return descriptor and platform information (status code 200) or Failed
     *         authentication or no image found (status code 401) or Server error
     *         (status code 500)
     */
    @ApiOperation(value = "Get image information from the registry", nickname = "distributionInspect", notes = "Return image digest and platform information by contacting the registry. ", response = DistributionInspectResponse.class, tags = {
            "Distribution", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "descriptor and platform information", response = DistributionInspectResponse.class),
            @ApiResponse(code = 401, message = "Failed authentication or no image found", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/distribution/{name}/json", produces = { "application/json" })
    default ResponseEntity<DistributionInspectResponse> distributionInspect(
            @ApiParam(value = "Image name or id", required = true) @PathVariable("name") String name) {
        return getDelegate().distributionInspect(name);
    }

}
