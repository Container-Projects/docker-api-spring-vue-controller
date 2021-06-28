package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.DistributionInspectResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
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
 * A delegate to be called by the {@link DistributionApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface DistributionApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /distribution/{name}/json : Get image information from the registry
     * Return image digest and platform information by contacting the registry. 
     *
     * @param name Image name or id (required)
     * @return descriptor and platform information (status code 200)
     *         or Failed authentication or no image found (status code 401)
     *         or Server error (status code 500)
     * @see DistributionApi#distributionInspect
     */
    default ResponseEntity<DistributionInspectResponse> distributionInspect(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Platforms\" : [ { \"OSFeatures\" : [ \"OSFeatures\", \"OSFeatures\" ], \"Variant\" : \"Variant\", \"Architecture\" : \"Architecture\", \"OS\" : \"OS\", \"OSVersion\" : \"OSVersion\", \"Features\" : [ \"Features\", \"Features\" ] }, { \"OSFeatures\" : [ \"OSFeatures\", \"OSFeatures\" ], \"Variant\" : \"Variant\", \"Architecture\" : \"Architecture\", \"OS\" : \"OS\", \"OSVersion\" : \"OSVersion\", \"Features\" : [ \"Features\", \"Features\" ] } ], \"Descriptor\" : { \"URLs\" : [ \"URLs\", \"URLs\" ], \"Digest\" : \"Digest\", \"Size\" : 0, \"MediaType\" : \"MediaType\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
