package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemVersion;
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
 * A delegate to be called by the {@link VersionApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface VersionApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /version : Get version
     * Returns the version of Docker that is running and various information about the system that Docker is running on.
     *
     * @return no error (status code 200)
     *         or server error (status code 500)
     * @see VersionApi#systemVersion
     */
    default ResponseEntity<SystemVersion> systemVersion() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Components\" : [ { \"Details\" : \"{}\", \"Version\" : \"19.03.12\", \"Name\" : \"Engine\" }, { \"Details\" : \"{}\", \"Version\" : \"19.03.12\", \"Name\" : \"Engine\" } ], \"KernelVersion\" : \"4.19.76-linuxkit\", \"ApiVersion\" : \"1.40\", \"Platform\" : { \"Name\" : \"Name\" }, \"GitCommit\" : \"48a66213fe\", \"Os\" : \"linux\", \"Version\" : \"19.03.12\", \"MinAPIVersion\" : \"1.12\", \"Experimental\" : true, \"Arch\" : \"amd64\", \"GoVersion\" : \"go1.13.14\", \"BuildTime\" : \"2020-06-22T15:49:27.000000000+00:00\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
