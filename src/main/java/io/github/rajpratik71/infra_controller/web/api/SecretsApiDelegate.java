package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.IdResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Secret;
import io.github.rajpratik71.infra_controller.service.api.dto.SecretSpec;
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
 * A delegate to be called by the {@link SecretsApiController}}. Implement this
 * interface with a {@link org.springframework.stereotype.Service} annotated
 * class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface SecretsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /secrets/create : Create a secret
     *
     * @param body (optional)
     * @return no error (status code 201) or name conflicts with an existing object
     *         (status code 409) or server error (status code 500) or node is not
     *         part of a swarm (status code 503)
     * @see SecretsApi#secretCreate
     */
    default ResponseEntity<IdResponse> secretCreate(Secret body) {
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
     * DELETE /secrets/{id} : Delete a secret
     *
     * @param id ID of the secret (required)
     * @return no error (status code 204) or secret not found (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     * @see SecretsApi#secretDelete
     */
    default ResponseEntity<Void> secretDelete(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /secrets/{id} : Inspect a secret
     *
     * @param id ID of the secret (required)
     * @return no error (status code 200) or secret not found (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     * @see SecretsApi#secretInspect
     */
    default ResponseEntity<Secret> secretInspect(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Version\" : { \"Index\" : 373531 }, \"CreatedAt\" : \"2017-07-20T13:55:28.678958722Z\", \"ID\" : \"blt1owaxmitz71s9v5zh81zun\", \"Spec\" : { \"Driver\" : { \"Options\" : { \"OptionA\" : \"value for driver-specific option A\", \"OptionB\" : \"value for driver-specific option B\" }, \"Name\" : \"some-driver\" }, \"Labels\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" }, \"Data\" : \"\", \"Templating\" : { \"Options\" : { \"OptionA\" : \"value for driver-specific option A\", \"OptionB\" : \"value for driver-specific option B\" }, \"Name\" : \"some-driver\" }, \"Name\" : \"Name\" }, \"UpdatedAt\" : \"2017-07-20T13:55:28.678958722Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /secrets : List secrets
     *
     * @param filters A JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the secrets
     *                list. Available filters: - &#x60;id&#x3D;&lt;secret
     *                id&gt;&#x60; - &#x60;label&#x3D;&lt;key&gt; or
     *                label&#x3D;&lt;key&gt;&#x3D;value&#x60; -
     *                &#x60;name&#x3D;&lt;secret name&gt;&#x60; -
     *                &#x60;names&#x3D;&lt;secret name&gt;&#x60; (optional)
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     * @see SecretsApi#secretList
     */
    default ResponseEntity<List<Secret>> secretList(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"ID\" : \"blt1owaxmitz71s9v5zh81zun\", \"Version\" : { \"Index\" : 85 }, \"CreatedAt\" : \"2017-07-20T13:55:28.678958722Z\", \"UpdatedAt\" : \"2017-07-20T13:55:28.678958722Z\", \"Spec\" : { \"Name\" : \"mysql-passwd\", \"Labels\" : { \"some.label\" : \"some.value\" }, \"Driver\" : { \"Name\" : \"secret-bucket\", \"Options\" : { \"OptionA\" : \"value for driver option A\", \"OptionB\" : \"value for driver option B\" } } } }, { \"ID\" : \"ktnbjxoalbkvbvedmg1urrz8h\", \"Version\" : { \"Index\" : 11 }, \"CreatedAt\" : \"2016-11-05T01:20:17.327670065Z\", \"UpdatedAt\" : \"2016-11-05T01:20:17.327670065Z\", \"Spec\" : { \"Name\" : \"app-dev.crt\", \"Labels\" : { \"foo\" : \"bar\" } } } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /secrets/{id}/update : Update a Secret
     *
     * @param id      The ID or name of the secret (required)
     * @param version The version number of the secret object being updated. This is
     *                required to avoid conflicting writes. (required)
     * @param body    The spec of the secret to update. Currently, only the Labels
     *                field can be updated. All other fields must remain unchanged
     *                from the [SecretInspect endpoint](#operation/SecretInspect)
     *                response values. (optional)
     * @return no error (status code 200) or bad parameter (status code 400) or no
     *         such secret (status code 404) or server error (status code 500) or
     *         node is not part of a swarm (status code 503)
     * @see SecretsApi#secretUpdate
     */
    default ResponseEntity<Void> secretUpdate(String id, Long version, SecretSpec body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
