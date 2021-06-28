package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject2;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject3;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject4;
import io.github.rajpratik71.infra_controller.service.api.dto.Network;
import io.github.rajpratik71.infra_controller.service.api.dto.NetworkCreateResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.NetworkPruneResponse;
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
 * A delegate to be called by the {@link NetworksApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface NetworksApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /networks/{id}/connect : Connect a container to a network
     *
     * @param id Network ID or name (required)
     * @param container  (required)
     * @return No error (status code 200)
     *         or Operation not supported for swarm scoped networks (status code 403)
     *         or Network or container not found (status code 404)
     *         or Server error (status code 500)
     * @see NetworksApi#networkConnect
     */
    default ResponseEntity<Void> networkConnect(String id,
        InlineObject3 container) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /networks/create : Create a network
     *
     * @param networkConfig  (required)
     * @return No error (status code 201)
     *         or operation not supported for pre-defined networks (status code 403)
     *         or plugin not found (status code 404)
     *         or Server error (status code 500)
     * @see NetworksApi#networkCreate
     */
    default ResponseEntity<NetworkCreateResponse> networkCreate(InlineObject2 networkConfig) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Id\" : \"22be93d5babb089c5aab8dbc369042fad48ff791584ca2da2100db837a1c7c30\", \"Warning\" : \"\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /networks/{id} : Remove a network
     *
     * @param id Network ID or name (required)
     * @return No error (status code 204)
     *         or operation not supported for pre-defined networks (status code 403)
     *         or no such network (status code 404)
     *         or Server error (status code 500)
     * @see NetworksApi#networkDelete
     */
    default ResponseEntity<Void> networkDelete(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /networks/{id}/disconnect : Disconnect a container from a network
     *
     * @param id Network ID or name (required)
     * @param container  (required)
     * @return No error (status code 200)
     *         or Operation not supported for swarm scoped networks (status code 403)
     *         or Network or container not found (status code 404)
     *         or Server error (status code 500)
     * @see NetworksApi#networkDisconnect
     */
    default ResponseEntity<Void> networkDisconnect(String id,
        InlineObject4 container) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /networks/{id} : Inspect a network
     *
     * @param id Network ID or name (required)
     * @param verbose Detailed inspect output for troubleshooting (optional, default to false)
     * @param scope Filter the network by scope (swarm, global, or local) (optional)
     * @return No error (status code 200)
     *         or Network not found (status code 404)
     *         or Server error (status code 500)
     * @see NetworksApi#networkInspect
     */
    default ResponseEntity<Network> networkInspect(String id,
        Boolean verbose,
        String scope) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Name\" : \"net01\", \"Id\" : \"7d86d31b1478e7cca9ebed7e73aa0fdeec46c5ca29497431d3007d2d9e15ed99\", \"Created\" : \"2016-10-19T04:33:30.360899459Z\", \"Scope\" : \"local\", \"Driver\" : \"bridge\", \"EnableIPv6\" : false, \"IPAM\" : { \"Driver\" : \"default\", \"Config\" : [ { \"Subnet\" : \"172.19.0.0/16\", \"Gateway\" : \"172.19.0.1\" } ], \"Options\" : { \"foo\" : \"bar\" } }, \"Internal\" : false, \"Attachable\" : false, \"Ingress\" : false, \"Containers\" : { \"19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c\" : { \"Name\" : \"test\", \"EndpointID\" : \"628cadb8bcb92de107b2a1e516cbffe463e321f548feb37697cce00ad694f21a\", \"MacAddress\" : \"02:42:ac:13:00:02\", \"IPv4Address\" : \"172.19.0.2/16\", \"IPv6Address\" : \"\" } }, \"Options\" : { \"com.docker.network.bridge.default_bridge\" : \"true\", \"com.docker.network.bridge.enable_icc\" : \"true\", \"com.docker.network.bridge.enable_ip_masquerade\" : \"true\", \"com.docker.network.bridge.host_binding_ipv4\" : \"0.0.0.0\", \"com.docker.network.bridge.name\" : \"docker0\", \"com.docker.network.driver.mtu\" : \"1500\" }, \"Labels\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /networks : List networks
     * Returns a list of networks. For details on the format, see the [network inspect endpoint](#operation/NetworkInspect).  Note that it uses a different, smaller representation of a network than inspecting a single network. For example, the list of containers attached to the network is not propagated in API versions 1.28 and up. 
     *
     * @param filters JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the networks list.  Available filters:  - &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to &#x60;true&#x60; (or &#x60;1&#x60;), returns all    networks that are not in use by a container. When set to &#x60;false&#x60;    (or &#x60;0&#x60;), only networks that are in use by one or more    containers are returned. - &#x60;driver&#x3D;&lt;driver-name&gt;&#x60; Matches a network&#39;s driver. - &#x60;id&#x3D;&lt;network-id&gt;&#x60; Matches all or part of a network ID. - &#x60;label&#x3D;&lt;key&gt;&#x60; or &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60; of a network label. - &#x60;name&#x3D;&lt;network-name&gt;&#x60; Matches all or part of a network name. - &#x60;scope&#x3D;[\&quot;swarm\&quot;|\&quot;global\&quot;|\&quot;local\&quot;]&#x60; Filters networks by scope (&#x60;swarm&#x60;, &#x60;global&#x60;, or &#x60;local&#x60;). - &#x60;type&#x3D;[\&quot;custom\&quot;|\&quot;builtin\&quot;]&#x60; Filters networks by type. The &#x60;custom&#x60; keyword returns all user-defined networks.  (optional)
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see NetworksApi#networkList
     */
    default ResponseEntity<List<Network>> networkList(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Name\" : \"net01\", \"Id\" : \"7d86d31b1478e7cca9ebed7e73aa0fdeec46c5ca29497431d3007d2d9e15ed99\", \"Created\" : \"2016-10-19T04:33:30.360899459Z\", \"Scope\" : \"local\", \"Driver\" : \"bridge\", \"EnableIPv6\" : false, \"IPAM\" : { \"Driver\" : \"default\", \"Config\" : [ { \"Subnet\" : \"172.19.0.0/16\", \"Gateway\" : \"172.19.0.1\" } ], \"Options\" : { \"foo\" : \"bar\" } }, \"Internal\" : false, \"Attachable\" : false, \"Ingress\" : false, \"Containers\" : { \"19a4d5d687db25203351ed79d478946f861258f018fe384f229f2efa4b23513c\" : { \"Name\" : \"test\", \"EndpointID\" : \"628cadb8bcb92de107b2a1e516cbffe463e321f548feb37697cce00ad694f21a\", \"MacAddress\" : \"02:42:ac:13:00:02\", \"IPv4Address\" : \"172.19.0.2/16\", \"IPv6Address\" : \"\" } }, \"Options\" : { \"com.docker.network.bridge.default_bridge\" : \"true\", \"com.docker.network.bridge.enable_icc\" : \"true\", \"com.docker.network.bridge.enable_ip_masquerade\" : \"true\", \"com.docker.network.bridge.host_binding_ipv4\" : \"0.0.0.0\", \"com.docker.network.bridge.name\" : \"docker0\", \"com.docker.network.driver.mtu\" : \"1500\" }, \"Labels\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /networks/prune : Delete unused networks
     *
     * @param filters Filters to process on the prune list, encoded as JSON (a &#x60;map[string][]string&#x60;).  Available filters: - &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune networks created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time. - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune networks with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  (optional)
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see NetworksApi#networkPrune
     */
    default ResponseEntity<NetworkPruneResponse> networkPrune(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"NetworksDeleted\" : [ \"NetworksDeleted\", \"NetworksDeleted\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
