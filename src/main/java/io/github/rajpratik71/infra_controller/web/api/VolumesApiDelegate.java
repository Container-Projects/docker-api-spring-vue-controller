package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.Volume;
import io.github.rajpratik71.infra_controller.service.api.dto.VolumeConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.VolumeListResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.VolumePruneResponse;
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
 * A delegate to be called by the {@link VolumesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface VolumesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /volumes/create : Create a volume
     *
     * @param volumeConfig  (required)
     * @return The volume was created successfully (status code 201)
     *         or Server error (status code 500)
     * @see VolumesApi#volumeCreate
     */
    default ResponseEntity<Volume> volumeCreate(VolumeConfig volumeConfig) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Name\" : \"tardis\", \"Driver\" : \"custom\", \"Mountpoint\" : \"/var/lib/docker/volumes/tardis\", \"Status\" : { \"hello\" : \"world\" }, \"Labels\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" }, \"Scope\" : \"local\", \"CreatedAt\" : \"2016-06-07T20:31:11.853781916Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /volumes/{name} : Remove a volume
     * Instruct the driver to remove the volume.
     *
     * @param name Volume name or ID (required)
     * @param force Force the removal of the volume (optional, default to false)
     * @return The volume was removed (status code 204)
     *         or No such volume or volume driver (status code 404)
     *         or Volume is in use and cannot be removed (status code 409)
     *         or Server error (status code 500)
     * @see VolumesApi#volumeDelete
     */
    default ResponseEntity<Void> volumeDelete(String name,
        Boolean force) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /volumes/{name} : Inspect a volume
     *
     * @param name Volume name or ID (required)
     * @return No error (status code 200)
     *         or No such volume (status code 404)
     *         or Server error (status code 500)
     * @see VolumesApi#volumeInspect
     */
    default ResponseEntity<Volume> volumeInspect(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Name\" : \"tardis\", \"Driver\" : \"custom\", \"Mountpoint\" : \"/var/lib/docker/volumes/tardis\", \"Status\" : { \"hello\" : \"world\" }, \"Labels\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" }, \"Scope\" : \"local\", \"CreatedAt\" : \"2016-06-07T20:31:11.853781916Z\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /volumes : List volumes
     *
     * @param filters JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the volumes list. Available filters:  - &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to &#x60;true&#x60; (or &#x60;1&#x60;), returns all    volumes that are not in use by a container. When set to &#x60;false&#x60;    (or &#x60;0&#x60;), only volumes that are in use by one or more    containers are returned. - &#x60;driver&#x3D;&lt;volume-driver-name&gt;&#x60; Matches volumes based on their driver. - &#x60;label&#x3D;&lt;key&gt;&#x60; or &#x60;label&#x3D;&lt;key&gt;:&lt;value&gt;&#x60; Matches volumes based on    the presence of a &#x60;label&#x60; alone or a &#x60;label&#x60; and a value. - &#x60;name&#x3D;&lt;volume-name&gt;&#x60; Matches all or part of a volume name.  (optional)
     * @return Summary volume data that matches the query (status code 200)
     *         or Server error (status code 500)
     * @see VolumesApi#volumeList
     */
    default ResponseEntity<VolumeListResponse> volumeList(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Volumes\" : [ { \"Name\" : \"tardis\", \"Driver\" : \"custom\", \"Mountpoint\" : \"/var/lib/docker/volumes/tardis\", \"Status\" : { \"hello\" : \"world\" }, \"Labels\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" }, \"Scope\" : \"local\", \"CreatedAt\" : \"2016-06-07T20:31:11.853781916Z\" }, { \"Name\" : \"tardis\", \"Driver\" : \"custom\", \"Mountpoint\" : \"/var/lib/docker/volumes/tardis\", \"Status\" : { \"hello\" : \"world\" }, \"Labels\" : { \"com.example.some-label\" : \"some-value\", \"com.example.some-other-label\" : \"some-other-value\" }, \"Scope\" : \"local\", \"CreatedAt\" : \"2016-06-07T20:31:11.853781916Z\" } ], \"Warnings\" : [ \"Warnings\", \"Warnings\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /volumes/prune : Delete unused volumes
     *
     * @param filters Filters to process on the prune list, encoded as JSON (a &#x60;map[string][]string&#x60;).  Available filters: - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune volumes with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  (optional)
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see VolumesApi#volumePrune
     */
    default ResponseEntity<VolumePruneResponse> volumePrune(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"SpaceReclaimed\" : 0, \"VolumesDeleted\" : [ \"VolumesDeleted\", \"VolumesDeleted\" ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
