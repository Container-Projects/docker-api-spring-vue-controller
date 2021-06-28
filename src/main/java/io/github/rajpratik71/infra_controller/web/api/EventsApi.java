
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemEventsResponse;
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
@Api(value = "events", description = "the events API")
public interface EventsApi {

    default EventsApiDelegate getDelegate() {
        return new EventsApiDelegate() {
        };
    }

    /**
     * GET /events : Monitor events Stream real-time events from the server. Various
     * objects within Docker report events when something happens to them.
     * Containers report these events: &#x60;attach&#x60;, &#x60;commit&#x60;,
     * &#x60;copy&#x60;, &#x60;create&#x60;, &#x60;destroy&#x60;,
     * &#x60;detach&#x60;, &#x60;die&#x60;, &#x60;exec_create&#x60;,
     * &#x60;exec_detach&#x60;, &#x60;exec_start&#x60;, &#x60;exec_die&#x60;,
     * &#x60;export&#x60;, &#x60;health_status&#x60;, &#x60;kill&#x60;,
     * &#x60;oom&#x60;, &#x60;pause&#x60;, &#x60;rename&#x60;, &#x60;resize&#x60;,
     * &#x60;restart&#x60;, &#x60;start&#x60;, &#x60;stop&#x60;, &#x60;top&#x60;,
     * &#x60;unpause&#x60;, &#x60;update&#x60;, and &#x60;prune&#x60; Images report
     * these events: &#x60;delete&#x60;, &#x60;import&#x60;, &#x60;load&#x60;,
     * &#x60;pull&#x60;, &#x60;push&#x60;, &#x60;save&#x60;, &#x60;tag&#x60;,
     * &#x60;untag&#x60;, and &#x60;prune&#x60; Volumes report these events:
     * &#x60;create&#x60;, &#x60;mount&#x60;, &#x60;unmount&#x60;,
     * &#x60;destroy&#x60;, and &#x60;prune&#x60; Networks report these events:
     * &#x60;create&#x60;, &#x60;connect&#x60;, &#x60;disconnect&#x60;,
     * &#x60;destroy&#x60;, &#x60;update&#x60;, &#x60;remove&#x60;, and
     * &#x60;prune&#x60; The Docker daemon reports these events: &#x60;reload&#x60;
     * Services report these events: &#x60;create&#x60;, &#x60;update&#x60;, and
     * &#x60;remove&#x60; Nodes report these events: &#x60;create&#x60;,
     * &#x60;update&#x60;, and &#x60;remove&#x60; Secrets report these events:
     * &#x60;create&#x60;, &#x60;update&#x60;, and &#x60;remove&#x60; Configs report
     * these events: &#x60;create&#x60;, &#x60;update&#x60;, and &#x60;remove&#x60;
     * The Builder reports &#x60;prune&#x60; events
     *
     * @param since   Show events created since this timestamp then stream new
     *                events. (optional)
     * @param until   Show events created until this timestamp then stop streaming.
     *                (optional)
     * @param filters A JSON encoded value of filters (a
     *                &#x60;map[string][]string&#x60;) to process on the event list.
     *                Available filters: - &#x60;config&#x3D;&lt;string&gt;&#x60;
     *                config name or ID - &#x60;container&#x3D;&lt;string&gt;&#x60;
     *                container name or ID - &#x60;daemon&#x3D;&lt;string&gt;&#x60;
     *                daemon name or ID - &#x60;event&#x3D;&lt;string&gt;&#x60;
     *                event type - &#x60;image&#x3D;&lt;string&gt;&#x60; image name
     *                or ID - &#x60;label&#x3D;&lt;string&gt;&#x60; image or
     *                container label - &#x60;network&#x3D;&lt;string&gt;&#x60;
     *                network name or ID - &#x60;node&#x3D;&lt;string&gt;&#x60; node
     *                ID - &#x60;plugin&#x60;&#x3D;&lt;string&gt; plugin name or ID
     *                - &#x60;scope&#x60;&#x3D;&lt;string&gt; local or swarm -
     *                &#x60;secret&#x3D;&lt;string&gt;&#x60; secret name or ID -
     *                &#x60;service&#x3D;&lt;string&gt;&#x60; service name or ID -
     *                &#x60;type&#x3D;&lt;string&gt;&#x60; object to filter by, one
     *                of &#x60;container&#x60;, &#x60;image&#x60;,
     *                &#x60;volume&#x60;, &#x60;network&#x60;, &#x60;daemon&#x60;,
     *                &#x60;plugin&#x60;, &#x60;node&#x60;, &#x60;service&#x60;,
     *                &#x60;secret&#x60; or &#x60;config&#x60; -
     *                &#x60;volume&#x3D;&lt;string&gt;&#x60; volume name (optional)
     * @return no error (status code 200) or bad parameter (status code 400) or
     *         server error (status code 500)
     */
    @ApiOperation(value = "Monitor events", nickname = "systemEvents", notes = "Stream real-time events from the server.  Various objects within Docker report events when something happens to them.  Containers report these events: `attach`, `commit`, `copy`, `create`, `destroy`, `detach`, `die`, `exec_create`, `exec_detach`, `exec_start`, `exec_die`, `export`, `health_status`, `kill`, `oom`, `pause`, `rename`, `resize`, `restart`, `start`, `stop`, `top`, `unpause`, `update`, and `prune`  Images report these events: `delete`, `import`, `load`, `pull`, `push`, `save`, `tag`, `untag`, and `prune`  Volumes report these events: `create`, `mount`, `unmount`, `destroy`, and `prune`  Networks report these events: `create`, `connect`, `disconnect`, `destroy`, `update`, `remove`, and `prune`  The Docker daemon reports these events: `reload`  Services report these events: `create`, `update`, and `remove`  Nodes report these events: `create`, `update`, and `remove`  Secrets report these events: `create`, `update`, and `remove`  Configs report these events: `create`, `update`, and `remove`  The Builder reports `prune` events ", response = SystemEventsResponse.class, tags = {
            "System", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = SystemEventsResponse.class),
            @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/events", produces = { "application/json" })
    default ResponseEntity<SystemEventsResponse> systemEvents(
            @ApiParam(value = "Show events created since this timestamp then stream new events.") @Valid @RequestParam(value = "since", required = false) String since,
            @ApiParam(value = "Show events created until this timestamp then stop streaming.") @Valid @RequestParam(value = "until", required = false) String until,
            @ApiParam(value = "A JSON encoded value of filters (a `map[string][]string`) to process on the event list. Available filters:  - `config=<string>` config name or ID - `container=<string>` container name or ID - `daemon=<string>` daemon name or ID - `event=<string>` event type - `image=<string>` image name or ID - `label=<string>` image or container label - `network=<string>` network name or ID - `node=<string>` node ID - `plugin`=<string> plugin name or ID - `scope`=<string> local or swarm - `secret=<string>` secret name or ID - `service=<string>` service name or ID - `type=<string>` object to filter by, one of `container`, `image`, `volume`, `network`, `daemon`, `plugin`, `node`, `service`, `secret` or `config` - `volume=<string>` volume name ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().systemEvents(since, until, filters);
    }

}
