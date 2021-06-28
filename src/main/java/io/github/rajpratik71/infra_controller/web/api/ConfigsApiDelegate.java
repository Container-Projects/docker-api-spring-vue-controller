package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.Config;
import io.github.rajpratik71.infra_controller.service.api.dto.ConfigSpec;
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
 * A delegate to be called by the {@link ConfigsApiController}}. Implement this
 * interface with a {@link org.springframework.stereotype.Service} annotated
 * class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface ConfigsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /configs/create : Create a config
     *
     * @param body (optional)
     * @return no error (status code 201) or name conflicts with an existing object
     *         (status code 409) or server error (status code 500) or node is not
     *         part of a swarm (status code 503)
     * @see ConfigsApi#configCreate
     */
    default ResponseEntity<IdResponse> configCreate(Config body) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Id\" : \"Id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /configs/{id} : Delete a config
     *
     * @param id ID of the config (required)
     * @return no error (status code 204) or config not found (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     * @see ConfigsApi#configDelete
     */
    default ResponseEntity<Void> configDelete(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /configs/{id} : Inspect a config
     *
     * @param id ID of the config (required)
     * @return no error (status code 200) or config not found (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     * @see ConfigsApi#configInspect
     */
    default ResponseEntity<Config> configInspect(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Version\" : { \"Index\" : 373531 }, \"CreatedAt\" : \"CreatedAt\", \"ID\" : \"ID\", \"Spec\" : { \"Labels\" : { \"key\" : \"Labels\" }, \"Data\" : \"Data\", \"Templating\" : { \"Options\" : { \"OptionA\" : \"value for driver-specific option A\", \"OptionB\" : \"value for driver-specific option B\" }, \"Name\" : \"some-driver\" }, \"Name\" : \"Name\" }, \"UpdatedAt\" : \"UpdatedAt\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /configs : List configs
     *
     * @param filters A JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the configs
     *                list. Available filters: - &#x60;id&#x3D;&lt;config
     *                id&gt;&#x60; - &#x60;label&#x3D;&lt;key&gt; or
     *                label&#x3D;&lt;key&gt;&#x3D;value&#x60; -
     *                &#x60;name&#x3D;&lt;config name&gt;&#x60; -
     *                &#x60;names&#x3D;&lt;config name&gt;&#x60; (optional)
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     * @see ConfigsApi#configList
     */
    default ResponseEntity<List<Config>> configList(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"ID\" : \"ktnbjxoalbkvbvedmg1urrz8h\", \"Version\" : { \"Index\" : 11 }, \"CreatedAt\" : \"2016-11-05T01:20:17.327670065Z\", \"UpdatedAt\" : \"2016-11-05T01:20:17.327670065Z\", \"Spec\" : { \"Name\" : \"server.conf\" } } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /configs/{id}/update : Update a Config
     *
     * @param id      The ID or name of the config (required)
     * @param version The version number of the config object being updated. This is
     *                required to avoid conflicting writes. (required)
     * @param body    The spec of the config to update. Currently, only the Labels
     *                field can be updated. All other fields must remain unchanged
     *                from the [ConfigInspect endpoint](#operation/ConfigInspect)
     *                response values. (optional)
     * @return no error (status code 200) or bad parameter (status code 400) or no
     *         such config (status code 404) or server error (status code 500) or
     *         node is not part of a swarm (status code 503)
     * @see ConfigsApi#configUpdate
     */
    default ResponseEntity<Void> configUpdate(String id, Long version, ConfigSpec body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
