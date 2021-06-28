
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Task;
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
@Api(value = "tasks", description = "the tasks API")
public interface TasksApi {

    default TasksApiDelegate getDelegate() {
        return new TasksApiDelegate() {
        };
    }

    /**
     * GET /tasks/{id} : Inspect a task
     *
     * @param id ID of the task (required)
     * @return no error (status code 200) or no such task (status code 404) or
     *         server error (status code 500) or node is not part of a swarm (status
     *         code 503)
     */
    @ApiOperation(value = "Inspect a task", nickname = "taskInspect", notes = "", response = Task.class, tags = {
            "Task", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Task.class),
            @ApiResponse(code = 404, message = "no such task", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @GetMapping(value = "/tasks/{id}", produces = { "application/json" })
    default ResponseEntity<Task> taskInspect(
            @ApiParam(value = "ID of the task", required = true) @PathVariable("id") String id) {
        return getDelegate().taskInspect(id);
    }

    /**
     * GET /tasks : List tasks
     *
     * @param filters A JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the tasks list.
     *                Available filters: - &#x60;desired-state&#x3D;(running |
     *                shutdown | accepted)&#x60; - &#x60;id&#x3D;&lt;task
     *                id&gt;&#x60; - &#x60;label&#x3D;key&#x60; or
     *                &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; -
     *                &#x60;name&#x3D;&lt;task name&gt;&#x60; -
     *                &#x60;node&#x3D;&lt;node id or name&gt;&#x60; -
     *                &#x60;service&#x3D;&lt;service name&gt;&#x60; (optional)
     * @return no error (status code 200) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     */
    @ApiOperation(value = "List tasks", nickname = "taskList", notes = "", response = Task.class, responseContainer = "List", tags = {
            "Task", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "no error", response = Task.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @GetMapping(value = "/tasks", produces = { "application/json" })
    default ResponseEntity<List<Task>> taskList(
            @ApiParam(value = "A JSON encoded value of the filters (a `map[string][]string`) to process on the tasks list.  Available filters:  - `desired-state=(running | shutdown | accepted)` - `id=<task id>` - `label=key` or `label=\"key=value\"` - `name=<task name>` - `node=<node id or name>` - `service=<service name>` ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().taskList(filters);
    }

    /**
     * GET /tasks/{id}/logs : Get task logs Get &#x60;stdout&#x60; and
     * &#x60;stderr&#x60; logs from a task. See also
     * [&#x60;/containers/{id}/logs&#x60;](#operation/ContainerLogs). **Note**: This
     * endpoint works only for services with the &#x60;local&#x60;,
     * &#x60;json-file&#x60; or &#x60;journald&#x60; logging drivers.
     *
     * @param id         ID of the task (required)
     * @param details    Show task context and extra details provided to logs.
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
     *         such task (status code 404) or server error (status code 500) or node
     *         is not part of a swarm (status code 503)
     */
    @ApiOperation(value = "Get task logs", nickname = "taskLogs", notes = "Get `stdout` and `stderr` logs from a task. See also [`/containers/{id}/logs`](#operation/ContainerLogs).  **Note**: This endpoint works only for services with the `local`, `json-file` or `journald` logging drivers. ", response = org.springframework.web.multipart.MultipartFile.class, tags = {
            "Task", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "logs returned as a stream in response body", response = org.springframework.web.multipart.MultipartFile.class),
            @ApiResponse(code = 404, message = "no such task", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class),
            @ApiResponse(code = 503, message = "node is not part of a swarm", response = ErrorResponse.class) })
    @GetMapping(value = "/tasks/{id}/logs", produces = { "application/json", "text/plain" })
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> taskLogs(
            @ApiParam(value = "ID of the task", required = true) @PathVariable("id") String id,
            @ApiParam(value = "Show task context and extra details provided to logs.", defaultValue = "false") @Valid @RequestParam(value = "details", required = false, defaultValue = "false") Boolean details,
            @ApiParam(value = "Keep connection after returning logs.", defaultValue = "false") @Valid @RequestParam(value = "follow", required = false, defaultValue = "false") Boolean follow,
            @ApiParam(value = "Return logs from `stdout`", defaultValue = "false") @Valid @RequestParam(value = "stdout", required = false, defaultValue = "false") Boolean stdout,
            @ApiParam(value = "Return logs from `stderr`", defaultValue = "false") @Valid @RequestParam(value = "stderr", required = false, defaultValue = "false") Boolean stderr,
            @ApiParam(value = "Only return logs since this time, as a UNIX timestamp", defaultValue = "0") @Valid @RequestParam(value = "since", required = false, defaultValue = "0") Integer since,
            @ApiParam(value = "Add timestamps to every log line", defaultValue = "false") @Valid @RequestParam(value = "timestamps", required = false, defaultValue = "false") Boolean timestamps,
            @ApiParam(value = "Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. ", defaultValue = "all") @Valid @RequestParam(value = "tail", required = false, defaultValue = "all") String tail) {
        return getDelegate().taskLogs(id, details, follow, stdout, stderr, since, timestamps, tail);
    }

}
