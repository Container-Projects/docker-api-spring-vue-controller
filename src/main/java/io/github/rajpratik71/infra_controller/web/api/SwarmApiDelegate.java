package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject5;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject6;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject7;
import io.github.rajpratik71.infra_controller.service.api.dto.Swarm;
import io.github.rajpratik71.infra_controller.service.api.dto.SwarmSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.UnlockKeyResponse;
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
 * A delegate to be called by the {@link SwarmApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface SwarmApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /swarm/init : Initialize a new swarm
     *
     * @param body  (required)
     * @return no error (status code 200)
     *         or bad parameter (status code 400)
     *         or server error (status code 500)
     *         or node is already part of a swarm (status code 503)
     * @see SwarmApi#swarmInit
     */
    default ResponseEntity<String> swarmInit(InlineObject5 body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"7v2t30z9blmxuhnyo6s4cpenp\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /swarm : Inspect swarm
     *
     * @return no error (status code 200)
     *         or no such swarm (status code 404)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see SwarmApi#swarmInspect
     */
    default ResponseEntity<Swarm> swarmInspect() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "null";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /swarm/join : Join an existing swarm
     *
     * @param body  (required)
     * @return no error (status code 200)
     *         or bad parameter (status code 400)
     *         or server error (status code 500)
     *         or node is already part of a swarm (status code 503)
     * @see SwarmApi#swarmJoin
     */
    default ResponseEntity<Void> swarmJoin(InlineObject6 body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /swarm/leave : Leave a swarm
     *
     * @param force Force leave swarm, even if this is the last manager or that it will break the cluster.  (optional, default to false)
     * @return no error (status code 200)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see SwarmApi#swarmLeave
     */
    default ResponseEntity<Void> swarmLeave(Boolean force) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /swarm/unlock : Unlock a locked manager
     *
     * @param body  (required)
     * @return no error (status code 200)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see SwarmApi#swarmUnlock
     */
    default ResponseEntity<Void> swarmUnlock(InlineObject7 body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /swarm/unlockkey : Get the unlock key
     *
     * @return no error (status code 200)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see SwarmApi#swarmUnlockkey
     */
    default ResponseEntity<UnlockKeyResponse> swarmUnlockkey() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"UnlockKey\" : \"SWMKEY-1-7c37Cc8654o6p38HnroywCi19pllOnGtbdZEgtKxZu8\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /swarm/update : Update a swarm
     *
     * @param version The version number of the swarm object being updated. This is required to avoid conflicting writes.  (required)
     * @param body  (required)
     * @param rotateWorkerToken Rotate the worker join token. (optional, default to false)
     * @param rotateManagerToken Rotate the manager join token. (optional, default to false)
     * @param rotateManagerUnlockKey Rotate the manager unlock key. (optional, default to false)
     * @return no error (status code 200)
     *         or bad parameter (status code 400)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see SwarmApi#swarmUpdate
     */
    default ResponseEntity<Void> swarmUpdate(Long version,
        SwarmSpec body,
        Boolean rotateWorkerToken,
        Boolean rotateManagerToken,
        Boolean rotateManagerUnlockKey) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
