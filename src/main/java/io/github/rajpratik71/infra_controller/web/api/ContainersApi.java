
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ContainerChangeResponseItem;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerCreateResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerInspectResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerPruneResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerTopResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerUpdateResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ContainerWaitResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.IdResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineResponse400;
import io.github.rajpratik71.infra_controller.service.api.dto.Resources;
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
@Api(value = "containers", description = "the containers API")
public interface ContainersApi {

        default ContainersApiDelegate getDelegate() {
                return new ContainersApiDelegate() {
                };
        }

        /**
         * GET /containers/{id}/archive : Get an archive of a filesystem resource in a
         * container Get a tar archive of a resource in the filesystem of container id.
         *
         * @param id   ID or name of the container (required)
         * @param path Resource in the container’s filesystem to archive. (required)
         * @return no error (status code 200) or Bad parameter (status code 400) or
         *         Container or path does not exist (status code 404) or server error
         *         (status code 500)
         */
        @ApiOperation(value = "Get an archive of a filesystem resource in a container", nickname = "containerArchive", notes = "Get a tar archive of a resource in the filesystem of container id.", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
                        @ApiResponse(code = 400, message = "Bad parameter", response = InlineResponse400.class),
                        @ApiResponse(code = 404, message = "Container or path does not exist", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/archive", produces = { "application/x-tar", "application/json" })
        default ResponseEntity<Void> containerArchive(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @NotNull @ApiParam(value = "Resource in the container’s filesystem to archive.", required = true) @Valid @RequestParam(value = "path", required = true) String path) {
                return getDelegate().containerArchive(id, path);
        }

        /**
         * GET /containers/{id}/archive : Get information about files in a container A
         * response header &#x60;X-Docker-Container-Path-Stat&#x60; is returned,
         * containing a base64 - encoded JSON object with some filesystem header
         * information about the path.
         *
         * @param id   ID or name of the container (required)
         * @param path Resource in the container’s filesystem to archive. (required)
         * @return no error (status code 200) or Bad parameter (status code 400) or
         *         Container or path does not exist (status code 404) or Server error
         *         (status code 500)
         */
        @ApiOperation(value = "Get information about files in a container", nickname = "containerArchiveInfo", notes = "A response header `X-Docker-Container-Path-Stat` is returned, containing a base64 - encoded JSON object with some filesystem header information about the path. ", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
                        @ApiResponse(code = 400, message = "Bad parameter", response = InlineResponse400.class),
                        @ApiResponse(code = 404, message = "Container or path does not exist", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/archive", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerArchiveInfo(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @NotNull @ApiParam(value = "Resource in the container’s filesystem to archive.", required = true) @Valid @RequestParam(value = "path", required = true) String path) {
                return getDelegate().containerArchiveInfo(id, path);
        }

        /**
         * POST /containers/{id}/attach : Attach to a container Attach to a container to
         * read its output or send it input. You can attach to the same container
         * multiple times and you can reattach to containers that have been detached.
         * Either the &#x60;stream&#x60; or &#x60;logs&#x60; parameter must be
         * &#x60;true&#x60; for this endpoint to do anything. See the [documentation for
         * the &#x60;docker attach&#x60;
         * command](https://docs.docker.com/engine/reference/commandline/attach/) for
         * more details. ### Hijacking This endpoint hijacks the HTTP connection to
         * transport &#x60;stdin&#x60;, &#x60;stdout&#x60;, and &#x60;stderr&#x60; on
         * the same socket. This is the response from the daemon for an attach request:
         * &#x60;&#x60;&#x60; HTTP/1.1 200 OK Content-Type:
         * application/vnd.docker.raw-stream [STREAM] &#x60;&#x60;&#x60; After the
         * headers and two new lines, the TCP connection can now be used for raw,
         * bidirectional communication between the client and server. To hint potential
         * proxies about connection hijacking, the Docker client can also optionally
         * send connection upgrade headers. For example, the client sends this request
         * to upgrade the connection: &#x60;&#x60;&#x60; POST
         * /containers/16253994b7c4/attach?stream&#x3D;1&amp;stdout&#x3D;1 HTTP/1.1
         * Upgrade: tcp Connection: Upgrade &#x60;&#x60;&#x60; The Docker daemon will
         * respond with a &#x60;101 UPGRADED&#x60; response, and will similarly follow
         * with the raw stream: &#x60;&#x60;&#x60; HTTP/1.1 101 UPGRADED Content-Type:
         * application/vnd.docker.raw-stream Connection: Upgrade Upgrade: tcp [STREAM]
         * &#x60;&#x60;&#x60; ### Stream format When the TTY setting is disabled in
         * [&#x60;POST /containers/create&#x60;](#operation/ContainerCreate), the stream
         * over the hijacked connected is multiplexed to separate out &#x60;stdout&#x60;
         * and &#x60;stderr&#x60;. The stream consists of a series of frames, each
         * containing a header and a payload. The header contains the information which
         * the stream writes (&#x60;stdout&#x60; or &#x60;stderr&#x60;). It also
         * contains the size of the associated frame encoded in the last four bytes
         * (&#x60;uint32&#x60;). It is encoded on the first eight bytes like this:
         * &#x60;&#x60;&#x60;go header :&#x3D; [8]byte{STREAM_TYPE, 0, 0, 0, SIZE1,
         * SIZE2, SIZE3, SIZE4} &#x60;&#x60;&#x60; &#x60;STREAM_TYPE&#x60; can be: - 0:
         * &#x60;stdin&#x60; (is written on &#x60;stdout&#x60;) - 1: &#x60;stdout&#x60;
         * - 2: &#x60;stderr&#x60; &#x60;SIZE1, SIZE2, SIZE3, SIZE4&#x60; are the four
         * bytes of the &#x60;uint32&#x60; size encoded as big endian. Following the
         * header is the payload, which is the specified number of bytes of
         * &#x60;STREAM_TYPE&#x60;. The simplest way to implement this protocol is the
         * following: 1. Read 8 bytes. 2. Choose &#x60;stdout&#x60; or
         * &#x60;stderr&#x60; depending on the first byte. 3. Extract the frame size
         * from the last four bytes. 4. Read the extracted size and output it on the
         * correct output. 5. Goto 1. ### Stream format when using a TTY When the TTY
         * setting is enabled in [&#x60;POST
         * /containers/create&#x60;](#operation/ContainerCreate), the stream is not
         * multiplexed. The data exchanged over the hijacked connection is simply the
         * raw data from the process PTY and client&#39;s &#x60;stdin&#x60;.
         *
         * @param id         ID or name of the container (required)
         * @param detachKeys Override the key sequence for detaching a container.Format
         *                   is a single character &#x60;[a-Z]&#x60; or
         *                   &#x60;ctrl-&lt;value&gt;&#x60; where
         *                   &#x60;&lt;value&gt;&#x60; is one of: &#x60;a-z&#x60;,
         *                   &#x60;@&#x60;, &#x60;^&#x60;, &#x60;[&#x60;, &#x60;,&#x60;
         *                   or &#x60;_&#x60;. (optional)
         * @param logs       Replay previous logs from the container. This is useful for
         *                   attaching to a container that has started and you want to
         *                   output everything since the container started. If
         *                   &#x60;stream&#x60; is also enabled, once all the previous
         *                   output has been returned, it will seamlessly transition
         *                   into streaming current output. (optional, default to false)
         * @param stream     Stream attached streams from the time the request was made
         *                   onwards. (optional, default to false)
         * @param stdin      Attach to &#x60;stdin&#x60; (optional, default to false)
         * @param stdout     Attach to &#x60;stdout&#x60; (optional, default to false)
         * @param stderr     Attach to &#x60;stderr&#x60; (optional, default to false)
         * @return no error, hints proxy about hijacking (status code 101) or no error,
         *         no upgrade header found (status code 200) or bad parameter (status
         *         code 400) or no such container (status code 404) or server error
         *         (status code 500)
         */
        @ApiOperation(value = "Attach to a container", nickname = "containerAttach", notes = "Attach to a container to read its output or send it input. You can attach to the same container multiple times and you can reattach to containers that have been detached.  Either the `stream` or `logs` parameter must be `true` for this endpoint to do anything.  See the [documentation for the `docker attach` command](https://docs.docker.com/engine/reference/commandline/attach/) for more details.  ### Hijacking  This endpoint hijacks the HTTP connection to transport `stdin`, `stdout`, and `stderr` on the same socket.  This is the response from the daemon for an attach request:  ``` HTTP/1.1 200 OK Content-Type: application/vnd.docker.raw-stream  [STREAM] ```  After the headers and two new lines, the TCP connection can now be used for raw, bidirectional communication between the client and server.  To hint potential proxies about connection hijacking, the Docker client can also optionally send connection upgrade headers.  For example, the client sends this request to upgrade the connection:  ``` POST /containers/16253994b7c4/attach?stream=1&stdout=1 HTTP/1.1 Upgrade: tcp Connection: Upgrade ```  The Docker daemon will respond with a `101 UPGRADED` response, and will similarly follow with the raw stream:  ``` HTTP/1.1 101 UPGRADED Content-Type: application/vnd.docker.raw-stream Connection: Upgrade Upgrade: tcp  [STREAM] ```  ### Stream format  When the TTY setting is disabled in [`POST /containers/create`](#operation/ContainerCreate), the stream over the hijacked connected is multiplexed to separate out `stdout` and `stderr`. The stream consists of a series of frames, each containing a header and a payload.  The header contains the information which the stream writes (`stdout` or `stderr`). It also contains the size of the associated frame encoded in the last four bytes (`uint32`).  It is encoded on the first eight bytes like this:  ```go header := [8]byte{STREAM_TYPE, 0, 0, 0, SIZE1, SIZE2, SIZE3, SIZE4} ```  `STREAM_TYPE` can be:  - 0: `stdin` (is written on `stdout`) - 1: `stdout` - 2: `stderr`  `SIZE1, SIZE2, SIZE3, SIZE4` are the four bytes of the `uint32` size encoded as big endian.  Following the header is the payload, which is the specified number of bytes of `STREAM_TYPE`.  The simplest way to implement this protocol is the following:  1. Read 8 bytes. 2. Choose `stdout` or `stderr` depending on the first byte. 3. Extract the frame size from the last four bytes. 4. Read the extracted size and output it on the correct output. 5. Goto 1.  ### Stream format when using a TTY  When the TTY setting is enabled in [`POST /containers/create`](#operation/ContainerCreate), the stream is not multiplexed. The data exchanged over the hijacked connection is simply the raw data from the process PTY and client's `stdin`. ", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 101, message = "no error, hints proxy about hijacking"),
                        @ApiResponse(code = 200, message = "no error, no upgrade header found"),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/attach", produces = { "application/vnd.docker.raw-stream",
                        "application/json" })
        default ResponseEntity<Void> containerAttach(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Override the key sequence for detaching a container.Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`. ") @Valid @RequestParam(value = "detachKeys", required = false) String detachKeys,
                        @ApiParam(value = "Replay previous logs from the container.  This is useful for attaching to a container that has started and you want to output everything since the container started.  If `stream` is also enabled, once all the previous output has been returned, it will seamlessly transition into streaming current output. ", defaultValue = "false") @Valid @RequestParam(value = "logs", required = false, defaultValue = "false") Boolean logs,
                        @ApiParam(value = "Stream attached streams from the time the request was made onwards. ", defaultValue = "false") @Valid @RequestParam(value = "stream", required = false, defaultValue = "false") Boolean stream,
                        @ApiParam(value = "Attach to `stdin`", defaultValue = "false") @Valid @RequestParam(value = "stdin", required = false, defaultValue = "false") Boolean stdin,
                        @ApiParam(value = "Attach to `stdout`", defaultValue = "false") @Valid @RequestParam(value = "stdout", required = false, defaultValue = "false") Boolean stdout,
                        @ApiParam(value = "Attach to `stderr`", defaultValue = "false") @Valid @RequestParam(value = "stderr", required = false, defaultValue = "false") Boolean stderr) {
                return getDelegate().containerAttach(id, detachKeys, logs, stream, stdin, stdout, stderr);
        }

        /**
         * GET /containers/{id}/attach/ws : Attach to a container via a websocket
         *
         * @param id         ID or name of the container (required)
         * @param detachKeys Override the key sequence for detaching a container.Format
         *                   is a single character &#x60;[a-Z]&#x60; or
         *                   &#x60;ctrl-&lt;value&gt;&#x60; where
         *                   &#x60;&lt;value&gt;&#x60; is one of: &#x60;a-z&#x60;,
         *                   &#x60;@&#x60;, &#x60;^&#x60;, &#x60;[&#x60;, &#x60;,&#x60;,
         *                   or &#x60;_&#x60;. (optional)
         * @param logs       Return logs (optional, default to false)
         * @param stream     Return stream (optional, default to false)
         * @param stdin      Attach to &#x60;stdin&#x60; (optional, default to false)
         * @param stdout     Attach to &#x60;stdout&#x60; (optional, default to false)
         * @param stderr     Attach to &#x60;stderr&#x60; (optional, default to false)
         * @return no error, hints proxy about hijacking (status code 101) or no error,
         *         no upgrade header found (status code 200) or bad parameter (status
         *         code 400) or no such container (status code 404) or server error
         *         (status code 500)
         */
        @ApiOperation(value = "Attach to a container via a websocket", nickname = "containerAttachWebsocket", notes = "", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 101, message = "no error, hints proxy about hijacking"),
                        @ApiResponse(code = 200, message = "no error, no upgrade header found"),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/attach/ws", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerAttachWebsocket(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Override the key sequence for detaching a container.Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,`, or `_`. ") @Valid @RequestParam(value = "detachKeys", required = false) String detachKeys,
                        @ApiParam(value = "Return logs", defaultValue = "false") @Valid @RequestParam(value = "logs", required = false, defaultValue = "false") Boolean logs,
                        @ApiParam(value = "Return stream", defaultValue = "false") @Valid @RequestParam(value = "stream", required = false, defaultValue = "false") Boolean stream,
                        @ApiParam(value = "Attach to `stdin`", defaultValue = "false") @Valid @RequestParam(value = "stdin", required = false, defaultValue = "false") Boolean stdin,
                        @ApiParam(value = "Attach to `stdout`", defaultValue = "false") @Valid @RequestParam(value = "stdout", required = false, defaultValue = "false") Boolean stdout,
                        @ApiParam(value = "Attach to `stderr`", defaultValue = "false") @Valid @RequestParam(value = "stderr", required = false, defaultValue = "false") Boolean stderr) {
                return getDelegate().containerAttachWebsocket(id, detachKeys, logs, stream, stdin, stdout, stderr);
        }

        /**
         * GET /containers/{id}/changes : Get changes on a container’s filesystem
         * Returns which files in a container&#39;s filesystem have been added, deleted,
         * or modified. The &#x60;Kind&#x60; of modification can be one of: -
         * &#x60;0&#x60;: Modified - &#x60;1&#x60;: Added - &#x60;2&#x60;: Deleted
         *
         * @param id ID or name of the container (required)
         * @return The list of changes (status code 200) or no such container (status
         *         code 404) or server error (status code 500)
         */
        @ApiOperation(value = "Get changes on a container’s filesystem", nickname = "containerChanges", notes = "Returns which files in a container's filesystem have been added, deleted, or modified. The `Kind` of modification can be one of:  - `0`: Modified - `1`: Added - `2`: Deleted ", response = ContainerChangeResponseItem.class, responseContainer = "List", tags = {
                        "Container", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "The list of changes", response = ContainerChangeResponseItem.class, responseContainer = "List"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/changes", produces = { "application/json" })
        default ResponseEntity<List<ContainerChangeResponseItem>> containerChanges(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id) {
                return getDelegate().containerChanges(id);
        }

        /**
         * POST /containers/create : Create a container
         *
         * @param body Container to create (required)
         * @param name Assign the specified name to the container. Must match
         *             &#x60;/?[a-zA-Z0-9][a-zA-Z0-9_.-]+&#x60;. (optional)
         * @return Container created successfully (status code 201) or bad parameter
         *         (status code 400) or no such container (status code 404) or conflict
         *         (status code 409) or server error (status code 500)
         */
        @ApiOperation(value = "Create a container", nickname = "containerCreate", notes = "", response = ContainerCreateResponse.class, tags = {
                        "Container", })
        @ApiResponses(value = {
                        @ApiResponse(code = 201, message = "Container created successfully", response = ContainerCreateResponse.class),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 409, message = "conflict", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/create", produces = { "application/json" }, consumes = { "application/json",
                        "application/octet-stream" })
        default ResponseEntity<ContainerCreateResponse> containerCreate(
                        @ApiParam(value = "Container to create", required = true) @Valid @RequestBody ContainerConfig body,
                        @Pattern(regexp = "^/?[a-zA-Z0-9][a-zA-Z0-9_.-]+$") @ApiParam(value = "Assign the specified name to the container. Must match `/?[a-zA-Z0-9][a-zA-Z0-9_.-]+`. ") @Valid @RequestParam(value = "name", required = false) String name) {
                return getDelegate().containerCreate(body, name);
        }

        /**
         * DELETE /containers/{id} : Remove a container
         *
         * @param id    ID or name of the container (required)
         * @param v     Remove anonymous volumes associated with the container.
         *              (optional, default to false)
         * @param force If the container is running, kill it before removing it.
         *              (optional, default to false)
         * @param link  Remove the specified link associated with the container.
         *              (optional, default to false)
         * @return no error (status code 204) or bad parameter (status code 400) or no
         *         such container (status code 404) or conflict (status code 409) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "Remove a container", nickname = "containerDelete", notes = "", tags = { "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 409, message = "conflict", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @DeleteMapping(value = "/containers/{id}", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerDelete(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Remove anonymous volumes associated with the container.", defaultValue = "false") @Valid @RequestParam(value = "v", required = false, defaultValue = "false") Boolean v,
                        @ApiParam(value = "If the container is running, kill it before removing it.", defaultValue = "false") @Valid @RequestParam(value = "force", required = false, defaultValue = "false") Boolean force,
                        @ApiParam(value = "Remove the specified link associated with the container.", defaultValue = "false") @Valid @RequestParam(value = "link", required = false, defaultValue = "false") Boolean link) {
                return getDelegate().containerDelete(id, v, force, link);
        }

        /**
         * POST /containers/{id}/exec : Create an exec instance Run a command inside a
         * running container.
         *
         * @param id         ID or name of container (required)
         * @param execConfig (required)
         * @return no error (status code 201) or no such container (status code 404) or
         *         container is paused (status code 409) or Server error (status code
         *         500)
         */
        @ApiOperation(value = "Create an exec instance", nickname = "containerExec", notes = "Run a command inside a running container.", response = IdResponse.class, tags = {
                        "Exec", })
        @ApiResponses(value = { @ApiResponse(code = 201, message = "no error", response = IdResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 409, message = "container is paused", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/exec", produces = { "application/json" }, consumes = {
                        "application/json" })
        default ResponseEntity<IdResponse> containerExec(
                        @ApiParam(value = "ID or name of container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "", required = true) @Valid @RequestBody InlineObject execConfig) {
                return getDelegate().containerExec(id, execConfig);
        }

        /**
         * GET /containers/{id}/export : Export a container Export the contents of a
         * container as a tarball.
         *
         * @param id ID or name of the container (required)
         * @return no error (status code 200) or no such container (status code 404) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "Export a container", nickname = "containerExport", notes = "Export the contents of a container as a tarball.", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/export", produces = { "application/octet-stream", "application/json" })
        default ResponseEntity<Void> containerExport(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id) {
                return getDelegate().containerExport(id);
        }

        /**
         * GET /containers/{id}/json : Inspect a container Return low-level information
         * about a container.
         *
         * @param id   ID or name of the container (required)
         * @param size Return the size of container as fields &#x60;SizeRw&#x60; and
         *             &#x60;SizeRootFs&#x60; (optional, default to false)
         * @return no error (status code 200) or no such container (status code 404) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "Inspect a container", nickname = "containerInspect", notes = "Return low-level information about a container.", response = ContainerInspectResponse.class, tags = {
                        "Container", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "no error", response = ContainerInspectResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/json", produces = { "application/json" })
        default ResponseEntity<ContainerInspectResponse> containerInspect(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Return the size of container as fields `SizeRw` and `SizeRootFs`", defaultValue = "false") @Valid @RequestParam(value = "size", required = false, defaultValue = "false") Boolean size) {
                return getDelegate().containerInspect(id, size);
        }

        /**
         * POST /containers/{id}/kill : Kill a container Send a POSIX signal to a
         * container, defaulting to killing to the container.
         *
         * @param id     ID or name of the container (required)
         * @param signal Signal to send to the container as an integer or string (e.g.
         *               &#x60;SIGINT&#x60;) (optional, default to SIGKILL)
         * @return no error (status code 204) or no such container (status code 404) or
         *         container is not running (status code 409) or server error (status
         *         code 500)
         */
        @ApiOperation(value = "Kill a container", nickname = "containerKill", notes = "Send a POSIX signal to a container, defaulting to killing to the container. ", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 409, message = "container is not running", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/kill", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerKill(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Signal to send to the container as an integer or string (e.g. `SIGINT`)", defaultValue = "SIGKILL") @Valid @RequestParam(value = "signal", required = false, defaultValue = "SIGKILL") String signal) {
                return getDelegate().containerKill(id, signal);
        }

        /**
         * GET /containers/json : List containers Returns a list of containers. For
         * details on the format, see the [inspect
         * endpoint](#operation/ContainerInspect). Note that it uses a different,
         * smaller representation of a container than inspecting a single container. For
         * example, the list of linked containers is not propagated .
         *
         * @param all     Return all containers. By default, only running containers are
         *                shown. (optional, default to false)
         * @param limit   Return this number of most recently created containers,
         *                including non-running ones. (optional)
         * @param size    Return the size of container as fields &#x60;SizeRw&#x60; and
         *                &#x60;SizeRootFs&#x60;. (optional, default to false)
         * @param filters Filters to process on the container list, encoded as JSON (a
         *                &#x60;map[string][]string&#x60;). For example,
         *                &#x60;{\&quot;status\&quot;: [\&quot;paused\&quot;]}&#x60;
         *                will only return paused containers. Available filters: -
         *                &#x60;ancestor&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,
         *                &#x60;&lt;image id&gt;&#x60;, or
         *                &#x60;&lt;image@digest&gt;&#x60;) -
         *                &#x60;before&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or
         *                &#x60;&lt;container name&gt;&#x60;) -
         *                &#x60;expose&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60;|&#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;)
         *                - &#x60;exited&#x3D;&lt;int&gt;&#x60; containers with exit
         *                code of &#x60;&lt;int&gt;&#x60; -
         *                &#x60;health&#x60;&#x3D;(&#x60;starting&#x60;|&#x60;healthy&#x60;|&#x60;unhealthy&#x60;|&#x60;none&#x60;)
         *                - &#x60;id&#x3D;&lt;ID&gt;&#x60; a container&#39;s ID -
         *                &#x60;isolation&#x3D;&#x60;(&#x60;default&#x60;|&#x60;process&#x60;|&#x60;hyperv&#x60;)
         *                (Windows daemon only) -
         *                &#x60;is-task&#x3D;&#x60;(&#x60;true&#x60;|&#x60;false&#x60;)
         *                - &#x60;label&#x3D;key&#x60; or
         *                &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; of a
         *                container label - &#x60;name&#x3D;&lt;name&gt;&#x60; a
         *                container&#39;s name -
         *                &#x60;network&#x60;&#x3D;(&#x60;&lt;network id&gt;&#x60; or
         *                &#x60;&lt;network name&gt;&#x60;) -
         *                &#x60;publish&#x60;&#x3D;(&#x60;&lt;port&gt;[/&lt;proto&gt;]&#x60;|&#x60;&lt;startport-endport&gt;/[&lt;proto&gt;]&#x60;)
         *                - &#x60;since&#x60;&#x3D;(&#x60;&lt;container id&gt;&#x60; or
         *                &#x60;&lt;container name&gt;&#x60;) -
         *                &#x60;status&#x3D;&#x60;(&#x60;created&#x60;|&#x60;restarting&#x60;|&#x60;running&#x60;|&#x60;removing&#x60;|&#x60;paused&#x60;|&#x60;exited&#x60;|&#x60;dead&#x60;)
         *                - &#x60;volume&#x60;&#x3D;(&#x60;&lt;volume name&gt;&#x60; or
         *                &#x60;&lt;mount point destination&gt;&#x60;) (optional)
         * @return no error (status code 200) or bad parameter (status code 400) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "List containers", nickname = "containerList", notes = "Returns a list of containers. For details on the format, see the [inspect endpoint](#operation/ContainerInspect).  Note that it uses a different, smaller representation of a container than inspecting a single container. For example, the list of linked containers is not propagated . ", response = Object.class, responseContainer = "List", tags = {
                        "Container", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "no error", response = Object.class, responseContainer = "List"),
                        @ApiResponse(code = 400, message = "bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/json", produces = { "application/json" })
        default ResponseEntity<List<Object>> containerList(
                        @ApiParam(value = "Return all containers. By default, only running containers are shown. ", defaultValue = "false") @Valid @RequestParam(value = "all", required = false, defaultValue = "false") Boolean all,
                        @ApiParam(value = "Return this number of most recently created containers, including non-running ones. ") @Valid @RequestParam(value = "limit", required = false) Integer limit,
                        @ApiParam(value = "Return the size of container as fields `SizeRw` and `SizeRootFs`. ", defaultValue = "false") @Valid @RequestParam(value = "size", required = false, defaultValue = "false") Boolean size,
                        @ApiParam(value = "Filters to process on the container list, encoded as JSON (a `map[string][]string`). For example, `{\"status\": [\"paused\"]}` will only return paused containers.  Available filters:  - `ancestor`=(`<image-name>[:<tag>]`, `<image id>`, or `<image@digest>`) - `before`=(`<container id>` or `<container name>`) - `expose`=(`<port>[/<proto>]`|`<startport-endport>/[<proto>]`) - `exited=<int>` containers with exit code of `<int>` - `health`=(`starting`|`healthy`|`unhealthy`|`none`) - `id=<ID>` a container's ID - `isolation=`(`default`|`process`|`hyperv`) (Windows daemon only) - `is-task=`(`true`|`false`) - `label=key` or `label=\"key=value\"` of a container label - `name=<name>` a container's name - `network`=(`<network id>` or `<network name>`) - `publish`=(`<port>[/<proto>]`|`<startport-endport>/[<proto>]`) - `since`=(`<container id>` or `<container name>`) - `status=`(`created`|`restarting`|`running`|`removing`|`paused`|`exited`|`dead`) - `volume`=(`<volume name>` or `<mount point destination>`) ") @Valid @RequestParam(value = "filters", required = false) String filters) {
                return getDelegate().containerList(all, limit, size, filters);
        }

        /**
         * GET /containers/{id}/logs : Get container logs Get &#x60;stdout&#x60; and
         * &#x60;stderr&#x60; logs from a container. Note: This endpoint works only for
         * containers with the &#x60;json-file&#x60; or &#x60;journald&#x60; logging
         * driver.
         *
         * @param id         ID or name of the container (required)
         * @param follow     Keep connection after returning logs. (optional, default to
         *                   false)
         * @param stdout     Return logs from &#x60;stdout&#x60; (optional, default to
         *                   false)
         * @param stderr     Return logs from &#x60;stderr&#x60; (optional, default to
         *                   false)
         * @param since      Only return logs since this time, as a UNIX timestamp
         *                   (optional, default to 0)
         * @param until      Only return logs before this time, as a UNIX timestamp
         *                   (optional, default to 0)
         * @param timestamps Add timestamps to every log line (optional, default to
         *                   false)
         * @param tail       Only return this number of log lines from the end of the
         *                   logs. Specify as an integer or &#x60;all&#x60; to output
         *                   all log lines. (optional, default to all)
         * @return logs returned as a stream in response body. For the stream format,
         *         [see the documentation for the attach
         *         endpoint](#operation/ContainerAttach). Note that unlike the attach
         *         endpoint, the logs endpoint does not upgrade the connection and does
         *         not set Content-Type. (status code 200) or no such container (status
         *         code 404) or server error (status code 500)
         */
        @ApiOperation(value = "Get container logs", nickname = "containerLogs", notes = "Get `stdout` and `stderr` logs from a container.  Note: This endpoint works only for containers with the `json-file` or `journald` logging driver. ", response = org.springframework.web.multipart.MultipartFile.class, tags = {
                        "Container", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "logs returned as a stream in response body. For the stream format, [see the documentation for the attach endpoint](#operation/ContainerAttach). Note that unlike the attach endpoint, the logs endpoint does not upgrade the connection and does not set Content-Type. ", response = org.springframework.web.multipart.MultipartFile.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/logs", produces = { "application/json", "text/plain" })
        default ResponseEntity<org.springframework.web.multipart.MultipartFile> containerLogs(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Keep connection after returning logs.", defaultValue = "false") @Valid @RequestParam(value = "follow", required = false, defaultValue = "false") Boolean follow,
                        @ApiParam(value = "Return logs from `stdout`", defaultValue = "false") @Valid @RequestParam(value = "stdout", required = false, defaultValue = "false") Boolean stdout,
                        @ApiParam(value = "Return logs from `stderr`", defaultValue = "false") @Valid @RequestParam(value = "stderr", required = false, defaultValue = "false") Boolean stderr,
                        @ApiParam(value = "Only return logs since this time, as a UNIX timestamp", defaultValue = "0") @Valid @RequestParam(value = "since", required = false, defaultValue = "0") Integer since,
                        @ApiParam(value = "Only return logs before this time, as a UNIX timestamp", defaultValue = "0") @Valid @RequestParam(value = "until", required = false, defaultValue = "0") Integer until,
                        @ApiParam(value = "Add timestamps to every log line", defaultValue = "false") @Valid @RequestParam(value = "timestamps", required = false, defaultValue = "false") Boolean timestamps,
                        @ApiParam(value = "Only return this number of log lines from the end of the logs. Specify as an integer or `all` to output all log lines. ", defaultValue = "all") @Valid @RequestParam(value = "tail", required = false, defaultValue = "all") String tail) {
                return getDelegate().containerLogs(id, follow, stdout, stderr, since, until, timestamps, tail);
        }

        /**
         * POST /containers/{id}/pause : Pause a container Use the freezer cgroup to
         * suspend all processes in a container. Traditionally, when suspending a
         * process the &#x60;SIGSTOP&#x60; signal is used, which is observable by the
         * process being suspended. With the freezer cgroup the process is unaware, and
         * unable to capture, that it is being suspended, and subsequently resumed.
         *
         * @param id ID or name of the container (required)
         * @return no error (status code 204) or no such container (status code 404) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "Pause a container", nickname = "containerPause", notes = "Use the freezer cgroup to suspend all processes in a container.  Traditionally, when suspending a process the `SIGSTOP` signal is used, which is observable by the process being suspended. With the freezer cgroup the process is unaware, and unable to capture, that it is being suspended, and subsequently resumed. ", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/pause", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerPause(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id) {
                return getDelegate().containerPause(id);
        }

        /**
         * POST /containers/prune : Delete stopped containers
         *
         * @param filters Filters to process on the prune list, encoded as JSON (a
         *                &#x60;map[string][]string&#x60;). Available filters: -
         *                &#x60;until&#x3D;&lt;timestamp&gt;&#x60; Prune containers
         *                created before this timestamp. The
         *                &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date
         *                formatted timestamps, or Go duration strings (e.g.
         *                &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the
         *                daemon machine’s time. - &#x60;label&#x60;
         *                (&#x60;label&#x3D;&lt;key&gt;&#x60;,
         *                &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;,
         *                &#x60;label!&#x3D;&lt;key&gt;&#x60;, or
         *                &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune
         *                containers with (or without, in case
         *                &#x60;label!&#x3D;...&#x60; is used) the specified labels.
         *                (optional)
         * @return No error (status code 200) or Server error (status code 500)
         */
        @ApiOperation(value = "Delete stopped containers", nickname = "containerPrune", notes = "", response = ContainerPruneResponse.class, tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = ContainerPruneResponse.class),
                        @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/prune", produces = { "application/json" })
        default ResponseEntity<ContainerPruneResponse> containerPrune(
                        @ApiParam(value = "Filters to process on the prune list, encoded as JSON (a `map[string][]string`).  Available filters: - `until=<timestamp>` Prune containers created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time. - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune containers with (or without, in case `label!=...` is used) the specified labels. ") @Valid @RequestParam(value = "filters", required = false) String filters) {
                return getDelegate().containerPrune(filters);
        }

        /**
         * POST /containers/{id}/rename : Rename a container
         *
         * @param id   ID or name of the container (required)
         * @param name New name for the container (required)
         * @return no error (status code 204) or no such container (status code 404) or
         *         name already in use (status code 409) or server error (status code
         *         500)
         */
        @ApiOperation(value = "Rename a container", nickname = "containerRename", notes = "", tags = { "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 409, message = "name already in use", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/rename", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerRename(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @NotNull @ApiParam(value = "New name for the container", required = true) @Valid @RequestParam(value = "name", required = true) String name) {
                return getDelegate().containerRename(id, name);
        }

        /**
         * POST /containers/{id}/resize : Resize a container TTY Resize the TTY for a
         * container.
         *
         * @param id ID or name of the container (required)
         * @param h  Height of the TTY session in characters (optional)
         * @param w  Width of the TTY session in characters (optional)
         * @return no error (status code 200) or no such container (status code 404) or
         *         cannot resize container (status code 500)
         */
        @ApiOperation(value = "Resize a container TTY", nickname = "containerResize", notes = "Resize the TTY for a container.", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "cannot resize container", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/resize", produces = { "text/plain", "application/json" })
        default ResponseEntity<Void> containerResize(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Height of the TTY session in characters") @Valid @RequestParam(value = "h", required = false) Integer h,
                        @ApiParam(value = "Width of the TTY session in characters") @Valid @RequestParam(value = "w", required = false) Integer w) {
                return getDelegate().containerResize(id, h, w);
        }

        /**
         * POST /containers/{id}/restart : Restart a container
         *
         * @param id ID or name of the container (required)
         * @param t  Number of seconds to wait before killing the container (optional)
         * @return no error (status code 204) or no such container (status code 404) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "Restart a container", nickname = "containerRestart", notes = "", tags = { "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/restart", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerRestart(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Number of seconds to wait before killing the container") @Valid @RequestParam(value = "t", required = false) Integer t) {
                return getDelegate().containerRestart(id, t);
        }

        /**
         * POST /containers/{id}/start : Start a container
         *
         * @param id         ID or name of the container (required)
         * @param detachKeys Override the key sequence for detaching a container. Format
         *                   is a single character &#x60;[a-Z]&#x60; or
         *                   &#x60;ctrl-&lt;value&gt;&#x60; where
         *                   &#x60;&lt;value&gt;&#x60; is one of: &#x60;a-z&#x60;,
         *                   &#x60;@&#x60;, &#x60;^&#x60;, &#x60;[&#x60;, &#x60;,&#x60;
         *                   or &#x60;_&#x60;. (optional)
         * @return no error (status code 204) or container already started (status code
         *         304) or no such container (status code 404) or server error (status
         *         code 500)
         */
        @ApiOperation(value = "Start a container", nickname = "containerStart", notes = "", tags = { "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 304, message = "container already started"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/start", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerStart(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Override the key sequence for detaching a container. Format is a single character `[a-Z]` or `ctrl-<value>` where `<value>` is one of: `a-z`, `@`, `^`, `[`, `,` or `_`. ") @Valid @RequestParam(value = "detachKeys", required = false) String detachKeys) {
                return getDelegate().containerStart(id, detachKeys);
        }

        /**
         * GET /containers/{id}/stats : Get container stats based on resource usage This
         * endpoint returns a live stream of a container’s resource usage statistics.
         * The &#x60;precpu_stats&#x60; is the CPU statistic of the *previous* read, and
         * is used to calculate the CPU usage percentage. It is not an exact copy of the
         * &#x60;cpu_stats&#x60; field. If either &#x60;precpu_stats.online_cpus&#x60;
         * or &#x60;cpu_stats.online_cpus&#x60; is nil then for compatibility with older
         * daemons the length of the corresponding &#x60;cpu_usage.percpu_usage&#x60;
         * array should be used. On a cgroup v2 host, the following fields are not set *
         * &#x60;blkio_stats&#x60;: all fields other than
         * &#x60;io_service_bytes_recursive&#x60; * &#x60;cpu_stats&#x60;:
         * &#x60;cpu_usage.percpu_usage&#x60; * &#x60;memory_stats&#x60;:
         * &#x60;max_usage&#x60; and &#x60;failcnt&#x60; Also,
         * &#x60;memory_stats.stats&#x60; fields are incompatible with cgroup v1. To
         * calculate the values shown by the &#x60;stats&#x60; command of the docker cli
         * tool the following formulas can be used: * used_memory &#x3D;
         * &#x60;memory_stats.usage - memory_stats.stats.cache&#x60; * available_memory
         * &#x3D; &#x60;memory_stats.limit&#x60; * Memory usage % &#x3D;
         * &#x60;(used_memory / available_memory) * 100.0&#x60; * cpu_delta &#x3D;
         * &#x60;cpu_stats.cpu_usage.total_usage -
         * precpu_stats.cpu_usage.total_usage&#x60; * system_cpu_delta &#x3D;
         * &#x60;cpu_stats.system_cpu_usage - precpu_stats.system_cpu_usage&#x60; *
         * number_cpus &#x3D; &#x60;lenght(cpu_stats.cpu_usage.percpu_usage)&#x60; or
         * &#x60;cpu_stats.online_cpus&#x60; * CPU usage % &#x3D; &#x60;(cpu_delta /
         * system_cpu_delta) * number_cpus * 100.0&#x60;
         *
         * @param id      ID or name of the container (required)
         * @param stream  Stream the output. If false, the stats will be output once and
         *                then it will disconnect. (optional, default to true)
         * @param oneShot Only get a single stat instead of waiting for 2 cycles. Must
         *                be used with &#x60;stream&#x3D;false&#x60;. (optional, default
         *                to false)
         * @return no error (status code 200) or no such container (status code 404) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "Get container stats based on resource usage", nickname = "containerStats", notes = "This endpoint returns a live stream of a container’s resource usage statistics.  The `precpu_stats` is the CPU statistic of the *previous* read, and is used to calculate the CPU usage percentage. It is not an exact copy of the `cpu_stats` field.  If either `precpu_stats.online_cpus` or `cpu_stats.online_cpus` is nil then for compatibility with older daemons the length of the corresponding `cpu_usage.percpu_usage` array should be used.  On a cgroup v2 host, the following fields are not set * `blkio_stats`: all fields other than `io_service_bytes_recursive` * `cpu_stats`: `cpu_usage.percpu_usage` * `memory_stats`: `max_usage` and `failcnt` Also, `memory_stats.stats` fields are incompatible with cgroup v1.  To calculate the values shown by the `stats` command of the docker cli tool the following formulas can be used: * used_memory = `memory_stats.usage - memory_stats.stats.cache` * available_memory = `memory_stats.limit` * Memory usage % = `(used_memory / available_memory) * 100.0` * cpu_delta = `cpu_stats.cpu_usage.total_usage - precpu_stats.cpu_usage.total_usage` * system_cpu_delta = `cpu_stats.system_cpu_usage - precpu_stats.system_cpu_usage` * number_cpus = `lenght(cpu_stats.cpu_usage.percpu_usage)` or `cpu_stats.online_cpus` * CPU usage % = `(cpu_delta / system_cpu_delta) * number_cpus * 100.0` ", response = Object.class, tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Object.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/stats", produces = { "application/json" })
        default ResponseEntity<Object> containerStats(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Stream the output. If false, the stats will be output once and then it will disconnect. ", defaultValue = "true") @Valid @RequestParam(value = "stream", required = false, defaultValue = "true") Boolean stream,
                        @ApiParam(value = "Only get a single stat instead of waiting for 2 cycles. Must be used with `stream=false`. ", defaultValue = "false") @Valid @RequestParam(value = "one-shot", required = false, defaultValue = "false") Boolean oneShot) {
                return getDelegate().containerStats(id, stream, oneShot);
        }

        /**
         * POST /containers/{id}/stop : Stop a container
         *
         * @param id ID or name of the container (required)
         * @param t  Number of seconds to wait before killing the container (optional)
         * @return no error (status code 204) or container already stopped (status code
         *         304) or no such container (status code 404) or server error (status
         *         code 500)
         */
        @ApiOperation(value = "Stop a container", nickname = "containerStop", notes = "", tags = { "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 304, message = "container already stopped"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/stop", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerStop(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Number of seconds to wait before killing the container") @Valid @RequestParam(value = "t", required = false) Integer t) {
                return getDelegate().containerStop(id, t);
        }

        /**
         * GET /containers/{id}/top : List processes running inside a container On Unix
         * systems, this is done by running the &#x60;ps&#x60; command. This endpoint is
         * not supported on Windows.
         *
         * @param id     ID or name of the container (required)
         * @param psArgs The arguments to pass to &#x60;ps&#x60;. For example,
         *               &#x60;aux&#x60; (optional, default to -ef)
         * @return no error (status code 200) or no such container (status code 404) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "List processes running inside a container", nickname = "containerTop", notes = "On Unix systems, this is done by running the `ps` command. This endpoint is not supported on Windows. ", response = ContainerTopResponse.class, tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = ContainerTopResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @GetMapping(value = "/containers/{id}/top", produces = { "application/json", "text/plain" })
        default ResponseEntity<ContainerTopResponse> containerTop(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "The arguments to pass to `ps`. For example, `aux`", defaultValue = "-ef") @Valid @RequestParam(value = "ps_args", required = false, defaultValue = "-ef") String psArgs) {
                return getDelegate().containerTop(id, psArgs);
        }

        /**
         * POST /containers/{id}/unpause : Unpause a container Resume a container which
         * has been paused.
         *
         * @param id ID or name of the container (required)
         * @return no error (status code 204) or no such container (status code 404) or
         *         server error (status code 500)
         */
        @ApiOperation(value = "Unpause a container", nickname = "containerUnpause", notes = "Resume a container which has been paused.", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/unpause", produces = { "application/json", "text/plain" })
        default ResponseEntity<Void> containerUnpause(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id) {
                return getDelegate().containerUnpause(id);
        }

        /**
         * POST /containers/{id}/update : Update a container Change various
         * configuration options of a container without having to recreate it.
         *
         * @param id     ID or name of the container (required)
         * @param update (required)
         * @return The container has been updated. (status code 200) or no such
         *         container (status code 404) or server error (status code 500)
         */
        @ApiOperation(value = "Update a container", nickname = "containerUpdate", notes = "Change various configuration options of a container without having to recreate it. ", response = ContainerUpdateResponse.class, tags = {
                        "Container", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "The container has been updated.", response = ContainerUpdateResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/update", produces = { "application/json" }, consumes = {
                        "application/json" })
        default ResponseEntity<ContainerUpdateResponse> containerUpdate(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "", required = true) @Valid @RequestBody ContainerConfig update) {
                return getDelegate().containerUpdate(id, update);
        }

        /**
         * POST /containers/{id}/wait : Wait for a container Block until a container
         * stops, then returns the exit code.
         *
         * @param id        ID or name of the container (required)
         * @param condition Wait until a container state reaches the given condition,
         *                  either &#39;not-running&#39; (default), &#39;next-exit&#39;,
         *                  or &#39;removed&#39;. (optional, default to not-running)
         * @return The container has exit. (status code 200) or no such container
         *         (status code 404) or server error (status code 500)
         */
        @ApiOperation(value = "Wait for a container", nickname = "containerWait", notes = "Block until a container stops, then returns the exit code.", response = ContainerWaitResponse.class, tags = {
                        "Container", })
        @ApiResponses(value = {
                        @ApiResponse(code = 200, message = "The container has exit.", response = ContainerWaitResponse.class),
                        @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
        @PostMapping(value = "/containers/{id}/wait", produces = { "application/json" })
        default ResponseEntity<ContainerWaitResponse> containerWait(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @ApiParam(value = "Wait until a container state reaches the given condition, either 'not-running' (default), 'next-exit', or 'removed'. ", defaultValue = "not-running") @Valid @RequestParam(value = "condition", required = false, defaultValue = "not-running") String condition) {
                return getDelegate().containerWait(id, condition);
        }

        /**
         * PUT /containers/{id}/archive : Extract an archive of files or folders to a
         * directory in a container Upload a tar archive to be extracted to a path in
         * the filesystem of container id.
         *
         * @param id                   ID or name of the container (required)
         * @param path                 Path to a directory in the container to extract
         *                             the archive’s contents into. (required)
         * @param inputStream          The input stream must be a tar archive compressed
         *                             with one of the following algorithms:
         *                             &#x60;identity&#x60; (no compression),
         *                             &#x60;gzip&#x60;, &#x60;bzip2&#x60;, or
         *                             &#x60;xz&#x60;. (required)
         * @param noOverwriteDirNonDir If &#x60;1&#x60;, &#x60;true&#x60;, or
         *                             &#x60;True&#x60; then it will be an error if
         *                             unpacking the given content would cause an
         *                             existing directory to be replaced with a
         *                             non-directory and vice versa. (optional)
         * @param copyUIDGID           If &#x60;1&#x60;, &#x60;true&#x60;, then it will
         *                             copy UID/GID maps to the dest file or dir
         *                             (optional)
         * @return The content was extracted successfully (status code 200) or Bad
         *         parameter (status code 400) or Permission denied, the volume or
         *         container rootfs is marked as read-only. (status code 403) or No such
         *         container or path does not exist inside the container (status code
         *         404) or Server error (status code 500)
         */
        @ApiOperation(value = "Extract an archive of files or folders to a directory in a container", nickname = "putContainerArchive", notes = "Upload a tar archive to be extracted to a path in the filesystem of container id.", tags = {
                        "Container", })
        @ApiResponses(value = { @ApiResponse(code = 200, message = "The content was extracted successfully"),
                        @ApiResponse(code = 400, message = "Bad parameter", response = ErrorResponse.class),
                        @ApiResponse(code = 403, message = "Permission denied, the volume or container rootfs is marked as read-only.", response = ErrorResponse.class),
                        @ApiResponse(code = 404, message = "No such container or path does not exist inside the container", response = ErrorResponse.class),
                        @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
        @PutMapping(value = "/containers/{id}/archive", produces = { "application/json", "text/plain" }, consumes = {
                        "application/x-tar", "application/octet-stream" })
        default ResponseEntity<Void> putContainerArchive(
                        @ApiParam(value = "ID or name of the container", required = true) @PathVariable("id") String id,
                        @NotNull @ApiParam(value = "Path to a directory in the container to extract the archive’s contents into. ", required = true) @Valid @RequestParam(value = "path", required = true) String path,
                        @ApiParam(value = "The input stream must be a tar archive compressed with one of the following algorithms: `identity` (no compression), `gzip`, `bzip2`, or `xz`. ", required = true) @Valid @RequestBody org.springframework.web.multipart.MultipartFile inputStream,
                        @ApiParam(value = "If `1`, `true`, or `True` then it will be an error if unpacking the given content would cause an existing directory to be replaced with a non-directory and vice versa. ") @Valid @RequestParam(value = "noOverwriteDirNonDir", required = false) String noOverwriteDirNonDir,
                        @ApiParam(value = "If `1`, `true`, then it will copy UID/GID maps to the dest file or dir ") @Valid @RequestParam(value = "copyUIDGID", required = false) String copyUIDGID) {
                return getDelegate().putContainerArchive(id, path, inputStream, noOverwriteDirNonDir, copyUIDGID);
        }

}