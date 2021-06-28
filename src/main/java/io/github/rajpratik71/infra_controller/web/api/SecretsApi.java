
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.IdResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Secret;
import io.github.rajpratik71.infra_controller.service.api.dto.SecretSpec;
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
@Api(value = "secrets", description = "the secrets API")
public interface SecretsApi {

        default SecretsApiDelegate getDelegate() {
                return new SecretsApiDelegate() {
                };
        }

        /**
         * POST /secrets/create : Create a secret
         *
         * @param body (optional)
         * @return no error (status code 201) or name conflicts with an existing object
         *         (status code 409) or server error (status code 500) or node is not
         *         part of a swarm (status code 503)
         */
        @ApiOperation(value = "Create a secret", nickname = "secretCreate", notes = "", response = IdResponse.class, tags = {
                        "Secret", })
        @ApiResponses(value = { @ApiResponse(code = 201, message = "no error", response = IdResponse.class),
                        @ApiResponse(code = 409, message = "name conflicts with an existing object", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @PostMapping(value = "/secrets/create", produces = { "application/json" }, consumes = { "application/json" })
        default ResponseEntity<IdResponse> secretCreate(
                        @ApiParam(value = "") @Valid @RequestBody(required = false) Secret body) {
                return getDelegate().secretCreate(body);
        }

        /**
         * DELETE /secrets/{id} : Delete a secret
         *
         * @param id ID of the secret (required)
         * @return no error (status code 204) or secret not found (status code 404) or
         *         server error (status code 500) or node is not part of a swarm (status
         *         code 503)
         */
        @ApiOperation(value = "Delete a secret", nickname = "secretDelete", notes = "", tags = { "Secret", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 404, message = "secret not found", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @DeleteMapping(value = "/secrets/{id}", produces = { "application/json" })
        default ResponseEntity<Void> secretDelete(
                        @ApiParam(value = "ID of the secret", required = true) @PathVariable("id") String id) {
                return getDelegate().secretDelete(id);
        }

        /**
         * GET /secrets/{id} : Inspect a secret
         *
         * @param id ID of the secret (required)
         * @return no error (status code 200) or secret not found (status code 404) or
         *         server error (status code 500) or node is not part of a swarm (status
         *         code 503)
         */
        @ApiOperation(value = "Inspect a secret", nickname = "secretInspect", notes = "", response = Secret.class, tags = {
                        "Secret", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Secret.class),
                        @ApiResponse(code = 404, message = "secret not found", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @GetMapping(value = "/secrets/{id}", produces = { "application/json" })
        default ResponseEntity<Secret> secretInspect(
                        @ApiParam(value = "ID of the secret", required = true) @PathVariable("id") String id) {
                return getDelegate().secretInspect(id);
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
         */
        @ApiOperation(value = "List secrets", nickname = "secretList", notes = "", response = Secret.class, responseContainer = "List", tags = {
                        "Secret", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "no error", response = Secret.class, responseContainer = "List"),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @GetMapping(value = "/secrets", produces = { "application/json" })
        default ResponseEntity<List<Secret>> secretList(
                        @ApiParam(value = "A JSON encoded value of the filters (a `map[string][]string`) to process on the secrets list.  Available filters:  - `id=<secret id>` - `label=<key> or label=<key>=value` - `name=<secret name>` - `names=<secret name>` ") @Valid @RequestParam(value = "filters", required = false) String filters) {
                return getDelegate().secretList(filters);
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
         */
        @ApiOperation(value = "Update a Secret", nickname = "secretUpdate", notes = "", tags = { "Secret", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "no such secret", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
                        @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
        @PostMapping(value = "/secrets/{id}/update", produces = { "application/json", "text/plain" }, consumes = {
                        "application/json", "text/plain" })
        default ResponseEntity<Void> secretUpdate(
                        @ApiParam(value = "The ID or name of the secret", required = true) @PathVariable("id") String id,
                        @NotNull @ApiParam(value = "The version number of the secret object being updated. This is required to avoid conflicting writes. ", required = true) @Valid @RequestParam(value = "version", required = true) Long version,
                        @ApiParam(value = "The spec of the secret to update. Currently, only the Labels field can be updated. All other fields must remain unchanged from the [SecretInspect endpoint](#operation/SecretInspect) response values. ") @Valid @RequestBody(required = false) SecretSpec body) {
                return getDelegate().secretUpdate(id, version, body);
        }

}
