package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemDataUsageResponse;
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
 * A delegate to be called by the {@link SystemApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface SystemApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /system/df : Get data usage information
     *
     * @return no error (status code 200)
     *         or server error (status code 500)
     * @see SystemApi#systemDataUsage
     */
    default ResponseEntity<SystemDataUsageResponse> systemDataUsage() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"LayersSize\" : 1092588, \"Images\" : [ { \"Id\" : \"sha256:2b8fd9751c4c0f5dd266fcae00707e67a2545ef34f9a29354585f93dac906749\", \"ParentId\" : \"\", \"RepoTags\" : [ \"busybox:latest\" ], \"RepoDigests\" : [ \"busybox@sha256:a59906e33509d14c036c8678d687bd4eec81ed7c4b8ce907b888c607f6a1e0e6\" ], \"Created\" : 1466724217, \"Size\" : 1092588, \"SharedSize\" : 0, \"VirtualSize\" : 1092588, \"Labels\" : { }, \"Containers\" : 1 } ], \"Containers\" : [ { \"Id\" : \"e575172ed11dc01bfce087fb27bee502db149e1a0fad7c296ad300bbff178148\", \"Names\" : [ \"/top\" ], \"Image\" : \"busybox\", \"ImageID\" : \"sha256:2b8fd9751c4c0f5dd266fcae00707e67a2545ef34f9a29354585f93dac906749\", \"Command\" : \"top\", \"Created\" : 1472592424, \"Ports\" : [ ], \"SizeRootFs\" : 1092588, \"Labels\" : { }, \"State\" : \"exited\", \"Status\" : \"Exited (0) 56 minutes ago\", \"HostConfig\" : { \"NetworkMode\" : \"default\" }, \"NetworkSettings\" : { \"Networks\" : { \"bridge\" : { \"NetworkID\" : \"d687bc59335f0e5c9ee8193e5612e8aee000c8c62ea170cfb99c098f95899d92\", \"EndpointID\" : \"8ed5115aeaad9abb174f68dcf135b49f11daf597678315231a32ca28441dec6a\", \"Gateway\" : \"172.18.0.1\", \"IPAddress\" : \"172.18.0.2\", \"IPPrefixLen\" : 16, \"IPv6Gateway\" : \"\", \"GlobalIPv6Address\" : \"\", \"GlobalIPv6PrefixLen\" : 0, \"MacAddress\" : \"02:42:ac:12:00:02\" } } }, \"Mounts\" : [ ] } ], \"Volumes\" : [ { \"Name\" : \"my-volume\", \"Driver\" : \"local\", \"Mountpoint\" : \"/var/lib/docker/volumes/my-volume/_data\", \"Scope\" : \"local\", \"UsageData\" : { \"Size\" : 10920104, \"RefCount\" : 2 } } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
