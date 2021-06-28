package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Service;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceCreateResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceSpec;
import io.github.rajpratik71.infra_controller.service.api.dto.ServiceUpdateResponse;
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
 * A delegate to be called by the {@link ServicesApiController}}. Implement this
 * interface with a {@link org.springframework.stereotype.Service} annotated
 * class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface ServicesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /services/create : Create a service
     *
     * @param body          (required)
     * @param xRegistryAuth A base64url-encoded auth configuration for pulling from
     *                      private registries. Refer to the [authentication
     *                      section](#section/Authentication) for details.
     *                      (optional)
     * @return no error (status code 201) or bad parameter (status code 400) or
     *         network is not eligible for services (status code 403) or name
     *         conflicts with an existing service (status code 409) or server error
     *         (status code 500) or node is not part of a swarm (status code 503)
     * @see ServicesApi#serviceCreate
     */
    default ResponseEntity<ServiceCreateResponse> serviceCreate(Service body, String xRegistryAuth) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ID\" : \"ak7w3gjqoa3kuz8xcpnyy0pvl\", \"Warning\" : \"unable to pin image doesnotexist:latest to digest: image library/doesnotexist:latest not found\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /services/{id} : Delete a service
     *
     * @param id ID or name of service. (required)
     * @return no error (status code 200) or no such service (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     * @see ServicesApi#serviceDelete
     */
    default ResponseEntity<Void> serviceDelete(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /services/{id} : Inspect a service
     *
     * @param id             ID or name of service. (required)
     * @param insertDefaults Fill empty fields with default values. (optional,
     *                       default to false)
     * @return no error (status code 200) or no such service (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     * @see ServicesApi#serviceInspect
     */
    default ResponseEntity<Service> serviceInspect(String id, Boolean insertDefaults) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\", \"Version\" : { \"Index\" : 19 }, \"CreatedAt\" : \"2016-06-07T21:05:51.880065305Z\", \"UpdatedAt\" : \"2016-06-07T21:07:29.962229872Z\", \"Spec\" : { \"Name\" : \"hopeful_cori\", \"TaskTemplate\" : { \"ContainerSpec\" : { \"Image\" : \"redis\" }, \"Resources\" : { \"Limits\" : { }, \"Reservations\" : { } }, \"RestartPolicy\" : { \"Condition\" : \"any\", \"MaxAttempts\" : 0 }, \"Placement\" : { }, \"ForceUpdate\" : 0 }, \"Mode\" : { \"Replicated\" : { \"Replicas\" : 1 } }, \"UpdateConfig\" : { \"Parallelism\" : 1, \"Delay\" : 1000000000, \"FailureAction\" : \"pause\", \"Monitor\" : 15000000000, \"MaxFailureRatio\" : 0.15 }, \"RollbackConfig\" : { \"Parallelism\" : 1, \"Delay\" : 1000000000, \"FailureAction\" : \"pause\", \"Monitor\" : 15000000000, \"MaxFailureRatio\" : 0.15 }, \"EndpointSpec\" : { \"Mode\" : \"vip\", \"Ports\" : [ { \"Protocol\" : \"tcp\", \"TargetPort\" : 6379, \"PublishedPort\" : 30001 } ] } }, \"Endpoint\" : { \"Spec\" : { \"Mode\" : \"vip\", \"Ports\" : [ { \"Protocol\" : \"tcp\", \"TargetPort\" : 6379, \"PublishedPort\" : 30001 } ] }, \"Ports\" : [ { \"Protocol\" : \"tcp\", \"TargetPort\" : 6379, \"PublishedPort\" : 30001 } ], \"VirtualIPs\" : [ { \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\", \"Addr\" : \"10.255.0.2/16\" }, { \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\", \"Addr\" : \"10.255.0.3/16\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /services : List services
     *
     * @param filters A JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the services
     *                list. Available filters: - &#x60;id&#x3D;&lt;service
     *                id&gt;&#x60; - &#x60;label&#x3D;&lt;service label&gt;&#x60; -
     *                &#x60;mode&#x3D;[\&quot;replicated\&quot;|\&quot;global\&quot;]&#x60;
     *                - &#x60;name&#x3D;&lt;service name&gt;&#x60; (optional)
     * @param status  Include service status, with count of running and desired
     *                tasks. (optional)
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     * @see ServicesApi#serviceList
     */
    default ResponseEntity<List<Service>> serviceList(String filters, Boolean status) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\", \"Version\" : { \"Index\" : 19 }, \"CreatedAt\" : \"2016-06-07T21:05:51.880065305Z\", \"UpdatedAt\" : \"2016-06-07T21:07:29.962229872Z\", \"Spec\" : { \"Name\" : \"hopeful_cori\", \"TaskTemplate\" : { \"ContainerSpec\" : { \"Image\" : \"redis\" }, \"Resources\" : { \"Limits\" : { }, \"Reservations\" : { } }, \"RestartPolicy\" : { \"Condition\" : \"any\", \"MaxAttempts\" : 0 }, \"Placement\" : { }, \"ForceUpdate\" : 0 }, \"Mode\" : { \"Replicated\" : { \"Replicas\" : 1 } }, \"UpdateConfig\" : { \"Parallelism\" : 1, \"Delay\" : 1000000000, \"FailureAction\" : \"pause\", \"Monitor\" : 15000000000, \"MaxFailureRatio\" : 0.15 }, \"RollbackConfig\" : { \"Parallelism\" : 1, \"Delay\" : 1000000000, \"FailureAction\" : \"pause\", \"Monitor\" : 15000000000, \"MaxFailureRatio\" : 0.15 }, \"EndpointSpec\" : { \"Mode\" : \"vip\", \"Ports\" : [ { \"Protocol\" : \"tcp\", \"TargetPort\" : 6379, \"PublishedPort\" : 30001 } ] } }, \"Endpoint\" : { \"Spec\" : { \"Mode\" : \"vip\", \"Ports\" : [ { \"Protocol\" : \"tcp\", \"TargetPort\" : 6379, \"PublishedPort\" : 30001 } ] }, \"Ports\" : [ { \"Protocol\" : \"tcp\", \"TargetPort\" : 6379, \"PublishedPort\" : 30001 } ], \"VirtualIPs\" : [ { \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\", \"Addr\" : \"10.255.0.2/16\" }, { \"NetworkID\" : \"4qvuz4ko70xaltuqbt8956gd1\", \"Addr\" : \"10.255.0.3/16\" } ] } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /services/{id}/logs : Get service logs Get &#x60;stdout&#x60; and
     * &#x60;stderr&#x60; logs from a service. See also
     * [&#x60;/containers/{id}/logs&#x60;](#operation/ContainerLogs). **Note**: This
     * endpoint works only for services with the &#x60;local&#x60;,
     * &#x60;json-file&#x60; or &#x60;journald&#x60; logging drivers.
     *
     * @param id         ID or name of the service (required)
     * @param details    Show service context and extra details provided to logs.
     *                   (optional, default to false)
     * @param follow     Keep connection after returning logs. (optional, default to
     *                   false)
     * @param stdout     Return logs from &#x60;stdout&#x60; (optional, default to
     *                   false)
     * @param stderr     Return logs from &#x60;stderr&#x60; (optional, default to
     *                   false)
     * @param since      Only return logs since this time, as a UNIX timestamp
     *                   (optional, default to 0)
     * @param timestamps Add timestamps to every log line (optional, default to
     *                   false)
     * @param tail       Only return this number of log lines from the end of the
     *                   logs. Specify as an integer or &#x60;all&#x60; to output
     *                   all log lines. (optional, default to all)
     * @return logs returned as a stream in response body (status code 200) or no
     *         such service (status code 404) or server error (status code 500) or
     *         node is not part of a swarm (status code 503)
     * @see ServicesApi#serviceLogs
     */
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> serviceLogs(String id, Boolean details,
            Boolean follow, Boolean stdout, Boolean stderr, Integer since, Boolean timestamps, String tail) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /services/{id}/update : Update a service
     *
     * @param id               ID or name of service. (required)
     * @param version          The version number of the service object being
     *                         updated. This is required to avoid conflicting
     *                         writes. This version number should be the value as
     *                         currently set on the service *before* the update. You
     *                         can find the current version by calling &#x60;GET
     *                         /services/{id}&#x60; (required)
     * @param body             (required)
     * @param registryAuthFrom If the &#x60;X-Registry-Auth&#x60; header is not
     *                         specified, this parameter indicates where to find
     *                         registry authorization credentials. (optional,
     *                         default to spec)
     * @param rollback         Set to this parameter to &#x60;previous&#x60; to
     *                         cause a server-side rollback to the previous service
     *                         spec. The supplied spec will be ignored in this case.
     *                         (optional)
     * @param xRegistryAuth    A base64url-encoded auth configuration for pulling
     *                         from private registries. Refer to the [authentication
     *                         section](#section/Authentication) for details.
     *                         (optional)
     * @return no error (status code 200) or bad parameter (status code 400) or no
     *         such service (status code 404) or server error (status code 500) or
     *         node is not part of a swarm (status code 503)
     * @see ServicesApi#serviceUpdate
     */
    default ResponseEntity<ServiceUpdateResponse> serviceUpdate(String id, Integer version, Service body,
            String registryAuthFrom, String rollback, String xRegistryAuth) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Warning\" : \"unable to pin image doesnotexist:latest to digest: image library/doesnotexist:latest not found\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
