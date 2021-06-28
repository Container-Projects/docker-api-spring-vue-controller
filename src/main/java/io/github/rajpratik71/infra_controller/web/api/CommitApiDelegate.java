package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ContainerConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.IdResponse;
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
 * A delegate to be called by the {@link CommitApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface CommitApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /commit : Create a new image from a container
     *
     * @param container The ID or name of the container to commit (optional)
     * @param repo Repository name for the created image (optional)
     * @param tag Tag name for the create image (optional)
     * @param comment Commit message (optional)
     * @param author Author of the image (e.g., &#x60;John Hannibal Smith &lt;hannibal@a-team.com&gt;&#x60;) (optional)
     * @param pause Whether to pause the container before committing (optional, default to true)
     * @param changes &#x60;Dockerfile&#x60; instructions to apply while committing (optional)
     * @param containerConfig The container configuration (optional)
     * @return no error (status code 201)
     *         or no such container (status code 404)
     *         or server error (status code 500)
     * @see CommitApi#imageCommit
     */
    default ResponseEntity<IdResponse> imageCommit(String container,
        String repo,
        String tag,
        String comment,
        String author,
        Boolean pause,
        String changes,
        ContainerConfig containerConfig) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Id\" : \"Id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
