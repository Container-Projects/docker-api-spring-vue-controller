package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Task;
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
 * A delegate to be called by the {@link TasksApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface TasksApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /tasks/{id} : Inspect a task
     *
     * @param id ID of the task (required)
     * @return no error (status code 200)
     *         or no such task (status code 404)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see TasksApi#taskInspect
     */
    default ResponseEntity<Task> taskInspect(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ID\" : \"0kzzo1i0y4jz6027t0k7aezc7\", \"Version\" : { \"Index\" : 71 }, \"CreatedAt\" : \"2016-06-07T21:07:31.171892745Z\", \"UpdatedAt\" : \"2016-06-07T21:07:31.376370513Z\", \"Spec\" : { \"ContainerSpec\" : { \"Image\" : \"redis\" }, \"Resources\" : { \"Limits\" : { }, \"Reservations\" : { } }, \"RestartPolicy\" : { \"Condition\" : \"any\", \"MaxAttempts\" : 0 }, \"Placement\" : { } }, \"ServiceID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\", \"Slot\" : 1, \"NodeID\" : \"60gvrl6tm78dmak4yl7srz94v\", \"Status\" : { \"Timestamp\" : \"2016-06-07T21:07:31.290032978Z\", \"State\" : \"running\", \"Message\" : \"started\", \"ContainerStatus\" : { \"ContainerID\" : \"e5d62702a1b48d01c3e02ca1e0212a250801fa8d67caca0b6f35919ebc12f035\", \"PID\" : 677 } }, \"DesiredState\" : \"running\", \"NetworksAttachments\" : [ { \"Network\" : { \"ID\" : \"4qvuz4ko70xaltuqbt8956gd1\", \"Version\" : { \"Index\" : 18 }, \"CreatedAt\" : \"2016-06-07T20:31:11.912919752Z\", \"UpdatedAt\" : \"2016-06-07T21:07:29.955277358Z\", \"Spec\" : { \"Name\" : \"ingress\", \"Labels\" : { \"com.docker.swarm.internal\" : \"true\" }, \"DriverConfiguration\" : { }, \"IPAMOptions\" : { \"Driver\" : { }, \"Configs\" : [ { \"Subnet\" : \"10.255.0.0/16\", \"Gateway\" : \"10.255.0.1\" } ] } }, \"DriverState\" : { \"Name\" : \"overlay\", \"Options\" : { \"com.docker.network.driver.overlay.vxlanid_list\" : \"256\" } }, \"IPAMOptions\" : { \"Driver\" : { \"Name\" : \"default\" }, \"Configs\" : [ { \"Subnet\" : \"10.255.0.0/16\", \"Gateway\" : \"10.255.0.1\" } ] } }, \"Addresses\" : [ \"10.255.0.10/16\" ] } ], \"AssignedGenericResources\" : [ { \"DiscreteResourceSpec\" : { \"Kind\" : \"SSD\", \"Value\" : 3 } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID1\" } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID2\" } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /tasks : List tasks
     *
     * @param filters A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the tasks list.  Available filters:  - &#x60;desired-state&#x3D;(running | shutdown | accepted)&#x60; - &#x60;id&#x3D;&lt;task id&gt;&#x60; - &#x60;label&#x3D;key&#x60; or &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; - &#x60;name&#x3D;&lt;task name&gt;&#x60; - &#x60;node&#x3D;&lt;node id or name&gt;&#x60; - &#x60;service&#x3D;&lt;service name&gt;&#x60;  (optional)
     * @return no error (status code 200)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see TasksApi#taskList
     */
    default ResponseEntity<List<Task>> taskList(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"ID\" : \"0kzzo1i0y4jz6027t0k7aezc7\", \"Version\" : { \"Index\" : 71 }, \"CreatedAt\" : \"2016-06-07T21:07:31.171892745Z\", \"UpdatedAt\" : \"2016-06-07T21:07:31.376370513Z\", \"Spec\" : { \"ContainerSpec\" : { \"Image\" : \"redis\" }, \"Resources\" : { \"Limits\" : { }, \"Reservations\" : { } }, \"RestartPolicy\" : { \"Condition\" : \"any\", \"MaxAttempts\" : 0 }, \"Placement\" : { } }, \"ServiceID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\", \"Slot\" : 1, \"NodeID\" : \"60gvrl6tm78dmak4yl7srz94v\", \"Status\" : { \"Timestamp\" : \"2016-06-07T21:07:31.290032978Z\", \"State\" : \"running\", \"Message\" : \"started\", \"ContainerStatus\" : { \"ContainerID\" : \"e5d62702a1b48d01c3e02ca1e0212a250801fa8d67caca0b6f35919ebc12f035\", \"PID\" : 677 } }, \"DesiredState\" : \"running\", \"NetworksAttachments\" : [ { \"Network\" : { \"ID\" : \"4qvuz4ko70xaltuqbt8956gd1\", \"Version\" : { \"Index\" : 18 }, \"CreatedAt\" : \"2016-06-07T20:31:11.912919752Z\", \"UpdatedAt\" : \"2016-06-07T21:07:29.955277358Z\", \"Spec\" : { \"Name\" : \"ingress\", \"Labels\" : { \"com.docker.swarm.internal\" : \"true\" }, \"DriverConfiguration\" : { }, \"IPAMOptions\" : { \"Driver\" : { }, \"Configs\" : [ { \"Subnet\" : \"10.255.0.0/16\", \"Gateway\" : \"10.255.0.1\" } ] } }, \"DriverState\" : { \"Name\" : \"overlay\", \"Options\" : { \"com.docker.network.driver.overlay.vxlanid_list\" : \"256\" } }, \"IPAMOptions\" : { \"Driver\" : { \"Name\" : \"default\" }, \"Configs\" : [ { \"Subnet\" : \"10.255.0.0/16\", \"Gateway\" : \"10.255.0.1\" } ] } }, \"Addresses\" : [ \"10.255.0.10/16\" ] } ] }, { \"ID\" : \"1yljwbmlr8er2waf8orvqpwms\", \"Version\" : { \"Index\" : 30 }, \"CreatedAt\" : \"2016-06-07T21:07:30.019104782Z\", \"UpdatedAt\" : \"2016-06-07T21:07:30.231958098Z\", \"Name\" : \"hopeful_cori\", \"Spec\" : { \"ContainerSpec\" : { \"Image\" : \"redis\" }, \"Resources\" : { \"Limits\" : { }, \"Reservations\" : { } }, \"RestartPolicy\" : { \"Condition\" : \"any\", \"MaxAttempts\" : 0 }, \"Placement\" : { } }, \"ServiceID\" : \"9mnpnzenvg8p8tdbtq4wvbkcz\", \"Slot\" : 1, \"NodeID\" : \"60gvrl6tm78dmak4yl7srz94v\", \"Status\" : { \"Timestamp\" : \"2016-06-07T21:07:30.202183143Z\", \"State\" : \"shutdown\", \"Message\" : \"shutdown\", \"ContainerStatus\" : { \"ContainerID\" : \"1cf8d63d18e79668b0004a4be4c6ee58cddfad2dae29506d8781581d0688a213\" } }, \"DesiredState\" : \"shutdown\", \"NetworksAttachments\" : [ { \"Network\" : { \"ID\" : \"4qvuz4ko70xaltuqbt8956gd1\", \"Version\" : { \"Index\" : 18 }, \"CreatedAt\" : \"2016-06-07T20:31:11.912919752Z\", \"UpdatedAt\" : \"2016-06-07T21:07:29.955277358Z\", \"Spec\" : { \"Name\" : \"ingress\", \"Labels\" : { \"com.docker.swarm.internal\" : \"true\" }, \"DriverConfiguration\" : { }, \"IPAMOptions\" : { \"Driver\" : { }, \"Configs\" : [ { \"Subnet\" : \"10.255.0.0/16\", \"Gateway\" : \"10.255.0.1\" } ] } }, \"DriverState\" : { \"Name\" : \"overlay\", \"Options\" : { \"com.docker.network.driver.overlay.vxlanid_list\" : \"256\" } }, \"IPAMOptions\" : { \"Driver\" : { \"Name\" : \"default\" }, \"Configs\" : [ { \"Subnet\" : \"10.255.0.0/16\", \"Gateway\" : \"10.255.0.1\" } ] } }, \"Addresses\" : [ \"10.255.0.5/16\" ] } ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /tasks/{id}/logs : Get task logs
     * Get &#x60;stdout&#x60; and &#x60;stderr&#x60; logs from a task. See also [&#x60;/containers/{id}/logs&#x60;](#operation/ContainerLogs).  **Note**: This endpoint works only for services with the &#x60;local&#x60;, &#x60;json-file&#x60; or &#x60;journald&#x60; logging drivers. 
     *
     * @param id ID of the task (required)
     * @param details Show task context and extra details provided to logs. (optional, default to false)
     * @param follow Keep connection after returning logs. (optional, default to false)
     * @param stdout Return logs from &#x60;stdout&#x60; (optional, default to false)
     * @param stderr Return logs from &#x60;stderr&#x60; (optional, default to false)
     * @param since Only return logs since this time, as a UNIX timestamp (optional, default to 0)
     * @param timestamps Add timestamps to every log line (optional, default to false)
     * @param tail Only return this number of log lines from the end of the logs. Specify as an integer or &#x60;all&#x60; to output all log lines.  (optional, default to all)
     * @return logs returned as a stream in response body (status code 200)
     *         or no such task (status code 404)
     *         or server error (status code 500)
     *         or node is not part of a swarm (status code 503)
     * @see TasksApi#taskLogs
     */
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> taskLogs(String id,
        Boolean details,
        Boolean follow,
        Boolean stdout,
        Boolean stderr,
        Integer since,
        Boolean timestamps,
        String tail) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
