package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.BuildPruneResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
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
 * A delegate to be called by the {@link BuildApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface BuildApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /build/prune : Delete builder cache
     *
     * @param keepStorage Amount of disk space in bytes to keep for cache (optional)
     * @param all Remove all types of build cache (optional)
     * @param filters A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the list of build cache objects.  Available filters:  - &#x60;until&#x3D;&lt;duration&gt;&#x60;: duration relative to daemon&#39;s time, during which build cache was not used, in Go&#39;s duration format (e.g., &#39;24h&#39;) - &#x60;id&#x3D;&lt;id&gt;&#x60; - &#x60;parent&#x3D;&lt;id&gt;&#x60; - &#x60;type&#x3D;&lt;string&gt;&#x60; - &#x60;description&#x3D;&lt;string&gt;&#x60; - &#x60;inuse&#x60; - &#x60;shared&#x60; - &#x60;private&#x60;  (optional)
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see BuildApi#buildPrune
     */
    default ResponseEntity<BuildPruneResponse> buildPrune(Long keepStorage,
        Boolean all,
        String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"CachesDeleted\" : [ \"CachesDeleted\", \"CachesDeleted\" ], \"SpaceReclaimed\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /build : Build an image
     * Build an image from a tar archive with a &#x60;Dockerfile&#x60; in it.  The &#x60;Dockerfile&#x60; specifies how the image is built from the tar archive. It is typically in the archive&#39;s root, but can be at a different path or have a different name by specifying the &#x60;dockerfile&#x60; parameter. [See the &#x60;Dockerfile&#x60; reference for more information](https://docs.docker.com/engine/reference/builder/).  The Docker daemon performs a preliminary validation of the &#x60;Dockerfile&#x60; before starting the build, and returns an error if the syntax is incorrect. After that, each instruction is run one-by-one until the ID of the new image is output.  The build is canceled if the client drops the connection by quitting or being killed. 
     *
     * @param dockerfile Path within the build context to the &#x60;Dockerfile&#x60;. This is ignored if &#x60;remote&#x60; is specified and points to an external &#x60;Dockerfile&#x60;. (optional, default to Dockerfile)
     * @param t A name and optional tag to apply to the image in the &#x60;name:tag&#x60; format. If you omit the tag the default &#x60;latest&#x60; value is assumed. You can provide several &#x60;t&#x60; parameters. (optional)
     * @param extrahosts Extra hosts to add to /etc/hosts (optional)
     * @param remote A Git repository URI or HTTP/HTTPS context URI. If the URI points to a single text file, the file’s contents are placed into a file called &#x60;Dockerfile&#x60; and the image is built from that file. If the URI points to a tarball, the file is downloaded by the daemon and the contents therein used as the context for the build. If the URI points to a tarball and the &#x60;dockerfile&#x60; parameter is also specified, there must be a file with the corresponding path inside the tarball. (optional)
     * @param q Suppress verbose build output. (optional, default to false)
     * @param nocache Do not use the cache when building the image. (optional, default to false)
     * @param cachefrom JSON array of images used for build cache resolution. (optional)
     * @param pull Attempt to pull the image even if an older image exists locally. (optional)
     * @param rm Remove intermediate containers after a successful build. (optional, default to true)
     * @param forcerm Always remove intermediate containers, even upon failure. (optional, default to false)
     * @param memory Set memory limit for build. (optional)
     * @param memswap Total memory (memory + swap). Set as &#x60;-1&#x60; to disable swap. (optional)
     * @param cpushares CPU shares (relative weight). (optional)
     * @param cpusetcpus CPUs in which to allow execution (e.g., &#x60;0-3&#x60;, &#x60;0,1&#x60;). (optional)
     * @param cpuperiod The length of a CPU period in microseconds. (optional)
     * @param cpuquota Microseconds of CPU time that the container can get in a CPU period. (optional)
     * @param buildargs JSON map of string pairs for build-time variables. Users pass these values at build-time. Docker uses the buildargs as the environment context for commands run via the &#x60;Dockerfile&#x60; RUN instruction, or for variable expansion in other &#x60;Dockerfile&#x60; instructions. This is not meant for passing secret values.  For example, the build arg &#x60;FOO&#x3D;bar&#x60; would become &#x60;{\&quot;FOO\&quot;:\&quot;bar\&quot;}&#x60; in JSON. This would result in the query parameter &#x60;buildargs&#x3D;{\&quot;FOO\&quot;:\&quot;bar\&quot;}&#x60;. Note that &#x60;{\&quot;FOO\&quot;:\&quot;bar\&quot;}&#x60; should be URI component encoded.  [Read more about the buildargs instruction.](https://docs.docker.com/engine/reference/builder/#arg)  (optional)
     * @param shmsize Size of &#x60;/dev/shm&#x60; in bytes. The size must be greater than 0. If omitted the system uses 64MB. (optional)
     * @param squash Squash the resulting images layers into a single layer. *(Experimental release only.)* (optional)
     * @param labels Arbitrary key/value labels to set on the image, as a JSON map of string pairs. (optional)
     * @param networkmode Sets the networking mode for the run commands during build. Supported standard values are: &#x60;bridge&#x60;, &#x60;host&#x60;, &#x60;none&#x60;, and &#x60;container:&lt;name|id&gt;&#x60;. Any other value is taken as a custom network&#39;s name or ID to which this container should connect to.  (optional)
     * @param contentType  (optional, default to application/x-tar)
     * @param xRegistryConfig This is a base64-encoded JSON object with auth configurations for multiple registries that a build may refer to.  The key is a registry URL, and the value is an auth configuration object, [as described in the authentication section](#section/Authentication). For example:  &#x60;&#x60;&#x60; {   \&quot;docker.example.com\&quot;: {     \&quot;username\&quot;: \&quot;janedoe\&quot;,     \&quot;password\&quot;: \&quot;hunter2\&quot;   },   \&quot;https://index.docker.io/v1/\&quot;: {     \&quot;username\&quot;: \&quot;mobydock\&quot;,     \&quot;password\&quot;: \&quot;conta1n3rize14\&quot;   } } &#x60;&#x60;&#x60;  Only the registry domain name (and port if not the default 443) are required. However, for legacy reasons, the Docker Hub registry must be specified with both a &#x60;https://&#x60; prefix and a &#x60;/v1/&#x60; suffix even though Docker will prefer to use the v2 registry API.  (optional)
     * @param platform Platform in the format os[/arch[/variant]] (optional)
     * @param target Target build stage (optional)
     * @param outputs BuildKit output configuration (optional)
     * @param inputStream A tar archive compressed with one of the following algorithms: identity (no compression), gzip, bzip2, xz. (optional)
     * @return no error (status code 200)
     *         or Bad parameter (status code 400)
     *         or server error (status code 500)
     * @see BuildApi#imageBuild
     */
    default ResponseEntity<Void> imageBuild(String dockerfile,
        String t,
        String extrahosts,
        String remote,
        Boolean q,
        Boolean nocache,
        String cachefrom,
        String pull,
        Boolean rm,
        Boolean forcerm,
        Integer memory,
        Integer memswap,
        Integer cpushares,
        String cpusetcpus,
        Integer cpuperiod,
        Integer cpuquota,
        String buildargs,
        Integer shmsize,
        Boolean squash,
        String labels,
        String networkmode,
        String contentType,
        String xRegistryConfig,
        String platform,
        String target,
        String outputs,
        MultipartFile inputStream) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
