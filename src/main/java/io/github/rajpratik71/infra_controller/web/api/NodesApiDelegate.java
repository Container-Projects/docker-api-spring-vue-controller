package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Node;
import io.github.rajpratik71.infra_controller.service.api.dto.NodeSpec;
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
 * A delegate to be called by the {@link NodesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface NodesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /nodes/{id} : Delete a node
     *
     * @param id The ID or name of the node (required)
     * @param force Force remove a node from the swarm (optional, default to false)
     * @return no error (status code 200)
     *         or no such node (status code 404)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see NodesApi#nodeDelete
     */
    default ResponseEntity<Void> nodeDelete(String id,
        Boolean force) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /nodes/{id} : Inspect a node
     *
     * @param id The ID or name of the node (required)
     * @return no error (status code 200)
     *         or no such node (status code 404)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see NodesApi#nodeInspect
     */
    default ResponseEntity<Node> nodeInspect(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Status\" : { \"Message\" : \"\", \"State\" : \"ready\", \"Addr\" : \"172.17.0.2\" }, \"Description\" : { \"Platform\" : { \"Architecture\" : \"x86_64\", \"OS\" : \"linux\" }, \"Hostname\" : \"bf3067039e47\", \"TLSInfo\" : { \"TrustRoot\" : \"-----BEGIN CERTIFICATE-----\nMIIBajCCARCgAwIBAgIUbYqrLSOSQHoxD8CwG6Bi2PJi9c8wCgYIKoZIzj0EAwIw\nEzERMA8GA1UEAxMIc3dhcm0tY2EwHhcNMTcwNDI0MjE0MzAwWhcNMzcwNDE5MjE0\nMzAwWjATMREwDwYDVQQDEwhzd2FybS1jYTBZMBMGByqGSM49AgEGCCqGSM49AwEH\nA0IABJk/VyMPYdaqDXJb/VXh5n/1Yuv7iNrxV3Qb3l06XD46seovcDWs3IZNV1lf\n3Skyr0ofcchipoiHkXBODojJydSjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMB\nAf8EBTADAQH/MB0GA1UdDgQWBBRUXxuRcnFjDfR/RIAUQab8ZV/n4jAKBggqhkjO\nPQQDAgNIADBFAiAy+JTe6Uc3KyLCMiqGl2GyWGQqQDEcO3/YG36x7om65AIhAJvz\npxv6zFeVEkAEEkqIYi0omA9+CjanB/6Bz4n1uw8H\n-----END CERTIFICATE-----\n\", \"CertIssuerSubject\" : \"MBMxETAPBgNVBAMTCHN3YXJtLWNh\", \"CertIssuerPublicKey\" : \"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEmT9XIw9h1qoNclv9VeHmf/Vi6/uI2vFXdBveXTpcPjqx6i9wNazchk1XWV/dKTKvSh9xyGKmiIeRcE4OiMnJ1A==\" }, \"Resources\" : { \"NanoCPUs\" : 4000000000, \"GenericResources\" : [ { \"DiscreteResourceSpec\" : { \"Kind\" : \"SSD\", \"Value\" : 3 } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID1\" } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID2\" } } ], \"MemoryBytes\" : 8272408576 }, \"Engine\" : { \"EngineVersion\" : \"17.06.0\", \"Labels\" : { \"foo\" : \"bar\" }, \"Plugins\" : [ { \"Type\" : \"Log\", \"Name\" : \"awslogs\" }, { \"Type\" : \"Log\", \"Name\" : \"fluentd\" }, { \"Type\" : \"Log\", \"Name\" : \"gcplogs\" }, { \"Type\" : \"Log\", \"Name\" : \"gelf\" }, { \"Type\" : \"Log\", \"Name\" : \"journald\" }, { \"Type\" : \"Log\", \"Name\" : \"json-file\" }, { \"Type\" : \"Log\", \"Name\" : \"logentries\" }, { \"Type\" : \"Log\", \"Name\" : \"splunk\" }, { \"Type\" : \"Log\", \"Name\" : \"syslog\" }, { \"Type\" : \"Network\", \"Name\" : \"bridge\" }, { \"Type\" : \"Network\", \"Name\" : \"host\" }, { \"Type\" : \"Network\", \"Name\" : \"ipvlan\" }, { \"Type\" : \"Network\", \"Name\" : \"macvlan\" }, { \"Type\" : \"Network\", \"Name\" : \"null\" }, { \"Type\" : \"Network\", \"Name\" : \"overlay\" }, { \"Type\" : \"Volume\", \"Name\" : \"local\" }, { \"Type\" : \"Volume\", \"Name\" : \"localhost:5000/vieux/sshfs:latest\" }, { \"Type\" : \"Volume\", \"Name\" : \"vieux/sshfs:latest\" } ] } }, \"Version\" : { \"Index\" : 373531 }, \"ManagerStatus\" : { \"Leader\" : true, \"Addr\" : \"10.0.0.46:2377\", \"Reachability\" : \"reachable\" }, \"CreatedAt\" : \"2016-08-18T10:44:24.496525531Z\", \"ID\" : \"24ifsmvkjbyhk\", \"Spec\" : { \"Availability\" : \"active\", \"Name\" : \"node-name\", \"Role\" : \"manager\", \"Labels\" : { \"foo\" : \"bar\" } }, \"UpdatedAt\" : \"2017-08-09T07:09:37.632105588Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /nodes : List nodes
     *
     * @param filters Filters to process on the nodes list, encoded as JSON (a &#x60;map[string][]string&#x60;).  Available filters: - &#x60;id&#x3D;&lt;node id&gt;&#x60; - &#x60;label&#x3D;&lt;engine label&gt;&#x60; - &#x60;membership&#x3D;&#x60;(&#x60;accepted&#x60;|&#x60;pending&#x60;)&#x60; - &#x60;name&#x3D;&lt;node name&gt;&#x60; - &#x60;node.label&#x3D;&lt;node label&gt;&#x60; - &#x60;role&#x3D;&#x60;(&#x60;manager&#x60;|&#x60;worker&#x60;)&#x60;  (optional)
     * @return no error (status code 200)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see NodesApi#nodeList
     */
    default ResponseEntity<List<Node>> nodeList(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Status\" : { \"Message\" : \"\", \"State\" : \"ready\", \"Addr\" : \"172.17.0.2\" }, \"Description\" : { \"Platform\" : { \"Architecture\" : \"x86_64\", \"OS\" : \"linux\" }, \"Hostname\" : \"bf3067039e47\", \"TLSInfo\" : { \"TrustRoot\" : \"-----BEGIN CERTIFICATE-----\nMIIBajCCARCgAwIBAgIUbYqrLSOSQHoxD8CwG6Bi2PJi9c8wCgYIKoZIzj0EAwIw\nEzERMA8GA1UEAxMIc3dhcm0tY2EwHhcNMTcwNDI0MjE0MzAwWhcNMzcwNDE5MjE0\nMzAwWjATMREwDwYDVQQDEwhzd2FybS1jYTBZMBMGByqGSM49AgEGCCqGSM49AwEH\nA0IABJk/VyMPYdaqDXJb/VXh5n/1Yuv7iNrxV3Qb3l06XD46seovcDWs3IZNV1lf\n3Skyr0ofcchipoiHkXBODojJydSjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMB\nAf8EBTADAQH/MB0GA1UdDgQWBBRUXxuRcnFjDfR/RIAUQab8ZV/n4jAKBggqhkjO\nPQQDAgNIADBFAiAy+JTe6Uc3KyLCMiqGl2GyWGQqQDEcO3/YG36x7om65AIhAJvz\npxv6zFeVEkAEEkqIYi0omA9+CjanB/6Bz4n1uw8H\n-----END CERTIFICATE-----\n\", \"CertIssuerSubject\" : \"MBMxETAPBgNVBAMTCHN3YXJtLWNh\", \"CertIssuerPublicKey\" : \"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEmT9XIw9h1qoNclv9VeHmf/Vi6/uI2vFXdBveXTpcPjqx6i9wNazchk1XWV/dKTKvSh9xyGKmiIeRcE4OiMnJ1A==\" }, \"Resources\" : { \"NanoCPUs\" : 4000000000, \"GenericResources\" : [ { \"DiscreteResourceSpec\" : { \"Kind\" : \"SSD\", \"Value\" : 3 } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID1\" } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID2\" } } ], \"MemoryBytes\" : 8272408576 }, \"Engine\" : { \"EngineVersion\" : \"17.06.0\", \"Labels\" : { \"foo\" : \"bar\" }, \"Plugins\" : [ { \"Type\" : \"Log\", \"Name\" : \"awslogs\" }, { \"Type\" : \"Log\", \"Name\" : \"fluentd\" }, { \"Type\" : \"Log\", \"Name\" : \"gcplogs\" }, { \"Type\" : \"Log\", \"Name\" : \"gelf\" }, { \"Type\" : \"Log\", \"Name\" : \"journald\" }, { \"Type\" : \"Log\", \"Name\" : \"json-file\" }, { \"Type\" : \"Log\", \"Name\" : \"logentries\" }, { \"Type\" : \"Log\", \"Name\" : \"splunk\" }, { \"Type\" : \"Log\", \"Name\" : \"syslog\" }, { \"Type\" : \"Network\", \"Name\" : \"bridge\" }, { \"Type\" : \"Network\", \"Name\" : \"host\" }, { \"Type\" : \"Network\", \"Name\" : \"ipvlan\" }, { \"Type\" : \"Network\", \"Name\" : \"macvlan\" }, { \"Type\" : \"Network\", \"Name\" : \"null\" }, { \"Type\" : \"Network\", \"Name\" : \"overlay\" }, { \"Type\" : \"Volume\", \"Name\" : \"local\" }, { \"Type\" : \"Volume\", \"Name\" : \"localhost:5000/vieux/sshfs:latest\" }, { \"Type\" : \"Volume\", \"Name\" : \"vieux/sshfs:latest\" } ] } }, \"Version\" : { \"Index\" : 373531 }, \"ManagerStatus\" : { \"Leader\" : true, \"Addr\" : \"10.0.0.46:2377\", \"Reachability\" : \"reachable\" }, \"CreatedAt\" : \"2016-08-18T10:44:24.496525531Z\", \"ID\" : \"24ifsmvkjbyhk\", \"Spec\" : { \"Availability\" : \"active\", \"Name\" : \"node-name\", \"Role\" : \"manager\", \"Labels\" : { \"foo\" : \"bar\" } }, \"UpdatedAt\" : \"2017-08-09T07:09:37.632105588Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /nodes/{id}/update : Update a node
     *
     * @param id The ID of the node (required)
     * @param version The version number of the node object being updated. This is required to avoid conflicting writes.  (required)
     * @param body  (optional)
     * @return no error (status code 200)
     *         or bad parameter (status code 400)
     *         or no such node (status code 404)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see NodesApi#nodeUpdate
     */
    default ResponseEntity<Void> nodeUpdate(String id,
        Long version,
        NodeSpec body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
