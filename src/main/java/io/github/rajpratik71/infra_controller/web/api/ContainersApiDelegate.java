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
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link ContainersApiController}}. Implement
 * this interface with a {@link org.springframework.stereotype.Service}
 * annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface ContainersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
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
     * @see ContainersApi#containerArchive
     */
    default ResponseEntity<Void> containerArchive(String id, String path) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * HEAD /containers/{id}/archive : Get information about files in a container A
     * response header &#x60;X-Docker-Container-Path-Stat&#x60; is returned,
     * containing a base64 - encoded JSON object with some filesystem header
     * information about the path.
     *
     * @param id   ID or name of the container (required)
     * @param path Resource in the container’s filesystem to archive. (required)
     * @return no error (status code 200) or Bad parameter (status code 400) or
     *         Container or path does not exist (status code 404) or Server error
     *         (status code 500)
     * @see ContainersApi#containerArchiveInfo
     */
    default ResponseEntity<Void> containerArchiveInfo(String id, String path) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerAttach
     */
    default ResponseEntity<Void> containerAttach(String id, String detachKeys, Boolean logs, Boolean stream,
            Boolean stdin, Boolean stdout, Boolean stderr) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerAttachWebsocket
     */
    default ResponseEntity<Void> containerAttachWebsocket(String id, String detachKeys, Boolean logs, Boolean stream,
            Boolean stdin, Boolean stdout, Boolean stderr) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerChanges
     */
    default ResponseEntity<List<ContainerChangeResponseItem>> containerChanges(String id) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Path\" : \"Path\", \"Kind\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerCreate
     */
    default ResponseEntity<ContainerCreateResponse> containerCreate(ContainerConfig body, String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Id\" : \"Id\", \"Warnings\" : [ \"Warnings\", \"Warnings\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerDelete
     */
    default ResponseEntity<Void> containerDelete(String id, Boolean v, Boolean force, Boolean link) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerExec
     */
    default ResponseEntity<IdResponse> containerExec(String id, InlineObject execConfig) {
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
     * GET /containers/{id}/export : Export a container Export the contents of a
     * container as a tarball.
     *
     * @param id ID or name of the container (required)
     * @return no error (status code 200) or no such container (status code 404) or
     *         server error (status code 500)
     * @see ContainersApi#containerExport
     */
    default ResponseEntity<Void> containerExport(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerInspect
     */
    default ResponseEntity<ContainerInspectResponse> containerInspect(String id, Boolean size) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Platform\" : \"Platform\", \"Config\" : { \"User\" : \"User\", \"OpenStdin\" : false, \"Env\" : [ \"Env\", \"Env\" ], \"Image\" : \"Image\", \"StdinOnce\" : false, \"AttachStdout\" : true, \"Shell\" : [ \"Shell\", \"Shell\" ], \"Volumes\" : { \"key\" : \"{}\" }, \"Domainname\" : \"Domainname\", \"AttachStdin\" : false, \"Tty\" : false, \"Cmd\" : [ \"Cmd\", \"Cmd\" ], \"StopTimeout\" : 9, \"StopSignal\" : \"SIGTERM\", \"Entrypoint\" : [ \"Entrypoint\", \"Entrypoint\" ], \"AttachStderr\" : true, \"ArgsEscaped\" : true, \"Hostname\" : \"Hostname\", \"Labels\" : { \"key\" : \"Labels\" }, \"Healthcheck\" : { \"Test\" : [ \"Test\", \"Test\" ], \"Timeout\" : 5, \"Retries\" : 2, \"Interval\" : 5, \"StartPeriod\" : 7 }, \"NetworkDisabled\" : true, \"MacAddress\" : \"MacAddress\", \"ExposedPorts\" : { \"key\" : \"{}\" }, \"WorkingDir\" : \"WorkingDir\", \"OnBuild\" : [ \"OnBuild\", \"OnBuild\" ] }, \"Driver\" : \"Driver\", \"AppArmorProfile\" : \"AppArmorProfile\", \"HostsPath\" : \"HostsPath\", \"HostnamePath\" : \"HostnamePath\", \"Image\" : \"Image\", \"Created\" : \"Created\", \"Name\" : \"Name\", \"MountLabel\" : \"MountLabel\", \"SizeRootFs\" : 1, \"Path\" : \"Path\", \"Args\" : [ \"Args\", \"Args\" ], \"ProcessLabel\" : \"ProcessLabel\", \"Mounts\" : [ { \"Destination\" : \"Destination\", \"Type\" : \"Type\", \"Propagation\" : \"Propagation\", \"RW\" : true, \"Mode\" : \"Mode\", \"Driver\" : \"Driver\", \"Source\" : \"Source\", \"Name\" : \"Name\" }, { \"Destination\" : \"Destination\", \"Type\" : \"Type\", \"Propagation\" : \"Propagation\", \"RW\" : true, \"Mode\" : \"Mode\", \"Driver\" : \"Driver\", \"Source\" : \"Source\", \"Name\" : \"Name\" } ], \"SizeRw\" : 6, \"GraphDriver\" : { \"Data\" : { \"key\" : \"Data\" }, \"Name\" : \"Name\" }, \"RestartCount\" : 0, \"NetworkSettings\" : { \"HairpinMode\" : false, \"Networks\" : { \"key\" : { \"GlobalIPv6Address\" : \"2001:db8::5689\", \"IPPrefixLen\" : 16, \"GlobalIPv6PrefixLen\" : 64, \"Aliases\" : [ \"server_x\", \"server_y\" ], \"NetworkID\" : \"08754567f1f40222263eab4102e1c733ae697e8e354aa9cd6e18d7402835292a\", \"MacAddress\" : \"02:42:ac:11:00:04\", \"IPAMConfig\" : { \"LinkLocalIPs\" : [ \"169.254.34.68\", \"fe80::3468\" ], \"IPv6Address\" : \"2001:db8:abcd::3033\", \"IPv4Address\" : \"172.20.30.33\" }, \"DriverOpts\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" }, \"Gateway\" : \"172.17.0.1\", \"EndpointID\" : \"b88f5b905aabf2893f3cbc4ee42d1ea7980bbc0a92e2c8922b1e1795298afb0b\", \"Links\" : [ \"container_1\", \"container_2\" ], \"IPv6Gateway\" : \"2001:db8:2::100\", \"IPAddress\" : \"172.17.0.4\" } }, \"SandboxKey\" : \"/var/run/docker/netns/8ab54b426c38\", \"GlobalIPv6Address\" : \"2001:db8::5689\", \"Ports\" : { \"443/tcp\" : [ { \"HostIp\" : \"127.0.0.1\", \"HostPort\" : \"4443\" } ], \"80/tcp\" : [ { \"HostIp\" : \"0.0.0.0\", \"HostPort\" : \"80\" }, { \"HostIp\" : \"0.0.0.0\", \"HostPort\" : \"8080\" } ], \"80/udp\" : [ { \"HostIp\" : \"0.0.0.0\", \"HostPort\" : \"80\" } ], \"53/udp\" : [ { \"HostIp\" : \"0.0.0.0\", \"HostPort\" : \"53\" } ] }, \"GlobalIPv6PrefixLen\" : 64, \"IPPrefixLen\" : 16, \"MacAddress\" : \"02:42:ac:11:00:04\", \"SandboxID\" : \"9d12daf2c33f5959c8bf90aa513e4f65b561738661003029ec84830cd503a0c3\", \"LinkLocalIPv6Address\" : \"fe80::42:acff:fe11:1\", \"LinkLocalIPv6PrefixLen\" : 64, \"Gateway\" : \"172.17.0.1\", \"EndpointID\" : \"b88f5b905aabf2893f3cbc4ee42d1ea7980bbc0a92e2c8922b1e1795298afb0b\", \"SecondaryIPv6Addresses\" : [ { \"PrefixLen\" : 3, \"Addr\" : \"Addr\" }, { \"PrefixLen\" : 3, \"Addr\" : \"Addr\" } ], \"IPv6Gateway\" : \"2001:db8:2::100\", \"SecondaryIPAddresses\" : [ { \"PrefixLen\" : 3, \"Addr\" : \"Addr\" }, { \"PrefixLen\" : 3, \"Addr\" : \"Addr\" } ], \"IPAddress\" : \"172.17.0.4\", \"Bridge\" : \"docker0\" }, \"State\" : { \"Status\" : \"running\", \"Restarting\" : false, \"Dead\" : false, \"Health\" : { \"Status\" : \"healthy\", \"Log\" : [ { \"Start\" : \"2020-01-04T10:44:24.496525531Z\", \"ExitCode\" : 0, \"Output\" : \"Output\", \"End\" : \"2020-01-04T10:45:21.364524523Z\" }, { \"Start\" : \"2020-01-04T10:44:24.496525531Z\", \"ExitCode\" : 0, \"Output\" : \"Output\", \"End\" : \"2020-01-04T10:45:21.364524523Z\" } ], \"FailingStreak\" : 0 }, \"ExitCode\" : 0, \"Running\" : true, \"Error\" : \"Error\", \"FinishedAt\" : \"2020-01-06T09:07:59.461876391Z\", \"OOMKilled\" : false, \"Pid\" : 1234, \"StartedAt\" : \"2020-01-06T09:06:59.461876391Z\", \"Paused\" : false }, \"ResolvConfPath\" : \"ResolvConfPath\", \"ExecIDs\" : [ \"ExecIDs\", \"ExecIDs\" ], \"Id\" : \"Id\", \"LogPath\" : \"LogPath\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerKill
     */
    default ResponseEntity<Void> containerKill(String id, String signal) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerList
     */
    default ResponseEntity<List<Object>> containerList(Boolean all, Integer limit, Boolean size, String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "\"{}\"";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerLogs
     */
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> containerLogs(String id, Boolean follow,
            Boolean stdout, Boolean stderr, Integer since, Integer until, Boolean timestamps, String tail) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerPause
     */
    default ResponseEntity<Void> containerPause(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerPrune
     */
    default ResponseEntity<ContainerPruneResponse> containerPrune(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"SpaceReclaimed\" : 0, \"ContainersDeleted\" : [ \"ContainersDeleted\", \"ContainersDeleted\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /containers/{id}/rename : Rename a container
     *
     * @param id   ID or name of the container (required)
     * @param name New name for the container (required)
     * @return no error (status code 204) or no such container (status code 404) or
     *         name already in use (status code 409) or server error (status code
     *         500)
     * @see ContainersApi#containerRename
     */
    default ResponseEntity<Void> containerRename(String id, String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerResize
     */
    default ResponseEntity<Void> containerResize(String id, Integer h, Integer w) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /containers/{id}/restart : Restart a container
     *
     * @param id ID or name of the container (required)
     * @param t  Number of seconds to wait before killing the container (optional)
     * @return no error (status code 204) or no such container (status code 404) or
     *         server error (status code 500)
     * @see ContainersApi#containerRestart
     */
    default ResponseEntity<Void> containerRestart(String id, Integer t) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerStart
     */
    default ResponseEntity<Void> containerStart(String id, String detachKeys) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerStats
     */
    default ResponseEntity<Object> containerStats(String id, Boolean stream, Boolean oneShot) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /containers/{id}/stop : Stop a container
     *
     * @param id ID or name of the container (required)
     * @param t  Number of seconds to wait before killing the container (optional)
     * @return no error (status code 204) or container already stopped (status code
     *         304) or no such container (status code 404) or server error (status
     *         code 500)
     * @see ContainersApi#containerStop
     */
    default ResponseEntity<Void> containerStop(String id, Integer t) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerTop
     */
    default ResponseEntity<ContainerTopResponse> containerTop(String id, String psArgs) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Processes\" : [ [ \"Processes\", \"Processes\" ], [ \"Processes\", \"Processes\" ] ], \"Titles\" : [ \"Titles\", \"Titles\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /containers/{id}/unpause : Unpause a container Resume a container which
     * has been paused.
     *
     * @param id ID or name of the container (required)
     * @return no error (status code 204) or no such container (status code 404) or
     *         server error (status code 500)
     * @see ContainersApi#containerUnpause
     */
    default ResponseEntity<Void> containerUnpause(String id) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /containers/{id}/update : Update a container Change various
     * configuration options of a container without having to recreate it.
     *
     * @param id     ID or name of the container (required)
     * @param update (required)
     * @return The container has been updated. (status code 200) or no such
     *         container (status code 404) or server error (status code 500)
     * @see ContainersApi#containerUpdate
     */
    default ResponseEntity<ContainerUpdateResponse> containerUpdate(String id, ContainerConfig update) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Warnings\" : [ \"Warnings\", \"Warnings\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#containerWait
     */
    default ResponseEntity<ContainerWaitResponse> containerWait(String id, String condition) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Error\" : { \"Message\" : \"Message\" }, \"StatusCode\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see ContainersApi#putContainerArchive
     */
    default ResponseEntity<Void> putContainerArchive(String id, String path, MultipartFile inputStream,
            String noOverwriteDirNonDir, String copyUIDGID) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
