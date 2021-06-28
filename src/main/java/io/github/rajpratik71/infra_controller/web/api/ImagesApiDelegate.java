package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.HistoryResponseItem;
import io.github.rajpratik71.infra_controller.service.api.dto.Image;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageDeleteResponseItem;
import io.github.rajpratik71.infra_controller.service.api.dto.ImagePruneResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageSearchResponseItem;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageSummary;
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
 * A delegate to be called by the {@link ImagesApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface ImagesApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /images/create : Create an image
     * Create an image by either pulling it from a registry or importing it.
     *
     * @param fromImage Name of the image to pull. The name may include a tag or digest. This parameter may only be used when pulling an image. The pull is cancelled if the HTTP connection is closed. (optional)
     * @param fromSrc Source to import. The value may be a URL from which the image can be retrieved or &#x60;-&#x60; to read the image from the request body. This parameter may only be used when importing an image. (optional)
     * @param repo Repository name given to an image when it is imported. The repo may include a tag. This parameter may only be used when importing an image. (optional)
     * @param tag Tag or digest. If empty when pulling an image, this causes all tags for the given image to be pulled. (optional)
     * @param message Set commit message for imported image. (optional)
     * @param xRegistryAuth A base64url-encoded auth configuration.  Refer to the [authentication section](#section/Authentication) for details.  (optional)
     * @param platform Platform in the format os[/arch[/variant]] (optional)
     * @param inputImage Image content if the value &#x60;-&#x60; has been specified in fromSrc query parameter (optional)
     * @return no error (status code 200)
     *         or repository does not exist or no read access (status code 404)
     *         or server error (status code 500)
     * @see ImagesApi#imageCreate
     */
    default ResponseEntity<Void> imageCreate(String fromImage,
        String fromSrc,
        String repo,
        String tag,
        String message,
        String xRegistryAuth,
        String platform,
        String inputImage) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /images/{name} : Remove an image
     * Remove an image, along with any untagged parent images that were referenced by that image.  Images can&#39;t be removed if they have descendant images, are being used by a running container or are being used by a build. 
     *
     * @param name Image name or ID (required)
     * @param force Remove the image even if it is being used by stopped containers or has other tags (optional, default to false)
     * @param noprune Do not delete untagged parent images (optional, default to false)
     * @return The image was deleted successfully (status code 200)
     *         or No such image (status code 404)
     *         or Conflict (status code 409)
     *         or Server error (status code 500)
     * @see ImagesApi#imageDelete
     */
    default ResponseEntity<List<ImageDeleteResponseItem>> imageDelete(String name,
        Boolean force,
        Boolean noprune) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Deleted\" : \"Deleted\", \"Untagged\" : \"Untagged\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /images/{name}/get : Export an image
     * Get a tarball containing all images and metadata for a repository.  If &#x60;name&#x60; is a specific name and tag (e.g. &#x60;ubuntu:latest&#x60;), then only that image (and its parents) are returned. If &#x60;name&#x60; is an image ID, similarly only that image (and its parents) are returned, but with the exclusion of the &#x60;repositories&#x60; file in the tarball, as there were no image names referenced.  ### Image tarball format  An image tarball contains one directory per image layer (named using its long ID), each containing these files:  - &#x60;VERSION&#x60;: currently &#x60;1.0&#x60; - the file format version - &#x60;json&#x60;: detailed layer information, similar to &#x60;docker inspect layer_id&#x60; - &#x60;layer.tar&#x60;: A tarfile containing the filesystem changes in this layer  The &#x60;layer.tar&#x60; file contains &#x60;aufs&#x60; style &#x60;.wh..wh.aufs&#x60; files and directories for storing attribute changes and deletions.  If the tarball defines a repository, the tarball should also include a &#x60;repositories&#x60; file at the root that contains a list of repository and tag names mapped to layer IDs.  &#x60;&#x60;&#x60;json {   \&quot;hello-world\&quot;: {     \&quot;latest\&quot;: \&quot;565a9d68a73f6706862bfe8409a7f659776d4d60a8d096eb4a3cbce6999cc2a1\&quot;   } } &#x60;&#x60;&#x60; 
     *
     * @param name Image name or ID (required)
     * @return no error (status code 200)
     *         or server error (status code 500)
     * @see ImagesApi#imageGet
     */
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> imageGet(String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /images/get : Export several images
     * Get a tarball containing all images and metadata for several image repositories.  For each value of the &#x60;names&#x60; parameter: if it is a specific name and tag (e.g. &#x60;ubuntu:latest&#x60;), then only that image (and its parents) are returned; if it is an image ID, similarly only that image (and its parents) are returned and there would be no names referenced in the &#39;repositories&#39; file for this image ID.  For details on the format, see the [export image endpoint](#operation/ImageGet). 
     *
     * @param names Image names to filter by (optional)
     * @return no error (status code 200)
     *         or server error (status code 500)
     * @see ImagesApi#imageGetAll
     */
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> imageGetAll(List<String> names) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /images/{name}/history : Get the history of an image
     * Return parent layers of an image.
     *
     * @param name Image name or ID (required)
     * @return List of image layers (status code 200)
     *         or No such image (status code 404)
     *         or Server error (status code 500)
     * @see ImagesApi#imageHistory
     */
    default ResponseEntity<List<HistoryResponseItem>> imageHistory(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Comment\" : \"Comment\", \"CreatedBy\" : \"CreatedBy\", \"Size\" : 6, \"Id\" : \"Id\", \"Tags\" : [ \"Tags\", \"Tags\" ], \"Created\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /images/{name}/json : Inspect an image
     * Return low-level information about an image.
     *
     * @param name Image name or id (required)
     * @return No error (status code 200)
     *         or No such image (status code 404)
     *         or Server error (status code 500)
     * @see ImagesApi#imageInspect
     */
    default ResponseEntity<Image> imageInspect(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"RepoDigests\" : [ \"RepoDigests\", \"RepoDigests\" ], \"Comment\" : \"Comment\", \"VirtualSize\" : 6, \"Architecture\" : \"Architecture\", \"Os\" : \"Os\", \"Parent\" : \"Parent\", \"Config\" : { \"User\" : \"User\", \"OpenStdin\" : false, \"Env\" : [ \"Env\", \"Env\" ], \"Image\" : \"Image\", \"StdinOnce\" : false, \"AttachStdout\" : true, \"Shell\" : [ \"Shell\", \"Shell\" ], \"Volumes\" : { \"key\" : \"{}\" }, \"Domainname\" : \"Domainname\", \"AttachStdin\" : false, \"Tty\" : false, \"Cmd\" : [ \"Cmd\", \"Cmd\" ], \"StopTimeout\" : 9, \"StopSignal\" : \"SIGTERM\", \"Entrypoint\" : [ \"Entrypoint\", \"Entrypoint\" ], \"AttachStderr\" : true, \"ArgsEscaped\" : true, \"Hostname\" : \"Hostname\", \"Labels\" : { \"key\" : \"Labels\" }, \"Healthcheck\" : { \"Test\" : [ \"Test\", \"Test\" ], \"Timeout\" : 5, \"Retries\" : 2, \"Interval\" : 5, \"StartPeriod\" : 7 }, \"NetworkDisabled\" : true, \"MacAddress\" : \"MacAddress\", \"ExposedPorts\" : { \"key\" : \"{}\" }, \"WorkingDir\" : \"WorkingDir\", \"OnBuild\" : [ \"OnBuild\", \"OnBuild\" ] }, \"Size\" : 0, \"OsVersion\" : \"OsVersion\", \"Metadata\" : { \"LastTagTime\" : \"LastTagTime\" }, \"GraphDriver\" : { \"Data\" : { \"key\" : \"Data\" }, \"Name\" : \"Name\" }, \"Created\" : \"Created\", \"ContainerConfig\" : { \"User\" : \"User\", \"OpenStdin\" : false, \"Env\" : [ \"Env\", \"Env\" ], \"Image\" : \"Image\", \"StdinOnce\" : false, \"AttachStdout\" : true, \"Shell\" : [ \"Shell\", \"Shell\" ], \"Volumes\" : { \"key\" : \"{}\" }, \"Domainname\" : \"Domainname\", \"AttachStdin\" : false, \"Tty\" : false, \"Cmd\" : [ \"Cmd\", \"Cmd\" ], \"StopTimeout\" : 9, \"StopSignal\" : \"SIGTERM\", \"Entrypoint\" : [ \"Entrypoint\", \"Entrypoint\" ], \"AttachStderr\" : true, \"ArgsEscaped\" : true, \"Hostname\" : \"Hostname\", \"Labels\" : { \"key\" : \"Labels\" }, \"Healthcheck\" : { \"Test\" : [ \"Test\", \"Test\" ], \"Timeout\" : 5, \"Retries\" : 2, \"Interval\" : 5, \"StartPeriod\" : 7 }, \"NetworkDisabled\" : true, \"MacAddress\" : \"MacAddress\", \"ExposedPorts\" : { \"key\" : \"{}\" }, \"WorkingDir\" : \"WorkingDir\", \"OnBuild\" : [ \"OnBuild\", \"OnBuild\" ] }, \"Container\" : \"Container\", \"RootFS\" : { \"Type\" : \"Type\", \"BaseLayer\" : \"BaseLayer\", \"Layers\" : [ \"Layers\", \"Layers\" ] }, \"RepoTags\" : [ \"RepoTags\", \"RepoTags\" ], \"DockerVersion\" : \"DockerVersion\", \"Author\" : \"Author\", \"Id\" : \"Id\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /images/json : List Images
     * Returns a list of images on the server. Note that it uses a different, smaller representation of an image than inspecting a single image.
     *
     * @param all Show all images. Only images from a final layer (no children) are shown by default. (optional, default to false)
     * @param filters A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the images list.  Available filters:  - &#x60;before&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,  &#x60;&lt;image id&gt;&#x60; or &#x60;&lt;image@digest&gt;&#x60;) - &#x60;dangling&#x3D;true&#x60; - &#x60;label&#x3D;key&#x60; or &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; of an image label - &#x60;reference&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;) - &#x60;since&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,  &#x60;&lt;image id&gt;&#x60; or &#x60;&lt;image@digest&gt;&#x60;)  (optional)
     * @param digests Show digest information as a &#x60;RepoDigests&#x60; field on each image. (optional, default to false)
     * @return Summary image data for the images matching the query (status code 200)
     *         or server error (status code 500)
     * @see ImagesApi#imageList
     */
    default ResponseEntity<List<ImageSummary>> imageList(Boolean all,
        String filters,
        Boolean digests) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"ParentId\" : \"ParentId\", \"RepoDigests\" : [ \"RepoDigests\", \"RepoDigests\" ], \"SharedSize\" : 1, \"VirtualSize\" : 5, \"RepoTags\" : [ \"RepoTags\", \"RepoTags\" ], \"Size\" : 6, \"Containers\" : 5, \"Labels\" : { \"key\" : \"Labels\" }, \"Id\" : \"Id\", \"Created\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /images/load : Import images
     * Load a set of images and tags into a repository.  For details on the format, see the [export image endpoint](#operation/ImageGet). 
     *
     * @param quiet Suppress progress details during load. (optional, default to false)
     * @param imagesTarball Tar archive containing images (optional)
     * @return no error (status code 200)
     *         or server error (status code 500)
     * @see ImagesApi#imageLoad
     */
    default ResponseEntity<Void> imageLoad(Boolean quiet,
        MultipartFile imagesTarball) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /images/prune : Delete unused images
     *
     * @param filters Filters to process on the prune list, encoded as JSON (a &#x60;map[string][]string&#x60;). Available filters:  - &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to &#x60;true&#x60; (or &#x60;1&#x60;), prune only    unused *and* untagged images. When set to &#x60;false&#x60;    (or &#x60;0&#x60;), all unused images are pruned. - &#x60;until&#x3D;&lt;string&gt;&#x60; Prune images created before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed relative to the daemon machine’s time. - &#x60;label&#x60; (&#x60;label&#x3D;&lt;key&gt;&#x60;, &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;, &#x60;label!&#x3D;&lt;key&gt;&#x60;, or &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune images with (or without, in case &#x60;label!&#x3D;...&#x60; is used) the specified labels.  (optional)
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see ImagesApi#imagePrune
     */
    default ResponseEntity<ImagePruneResponse> imagePrune(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"SpaceReclaimed\" : 0, \"ImagesDeleted\" : [ { \"Deleted\" : \"Deleted\", \"Untagged\" : \"Untagged\" }, { \"Deleted\" : \"Deleted\", \"Untagged\" : \"Untagged\" } ] }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /images/{name}/push : Push an image
     * Push an image to a registry.  If you wish to push an image on to a private registry, that image must already have a tag which references the registry. For example, &#x60;registry.example.com/myimage:latest&#x60;.  The push is cancelled if the HTTP connection is closed. 
     *
     * @param name Image name or ID. (required)
     * @param xRegistryAuth A base64url-encoded auth configuration.  Refer to the [authentication section](#section/Authentication) for details.  (required)
     * @param tag The tag to associate with the image on the registry. (optional)
     * @return No error (status code 200)
     *         or No such image (status code 404)
     *         or Server error (status code 500)
     * @see ImagesApi#imagePush
     */
    default ResponseEntity<Void> imagePush(String name,
        String xRegistryAuth,
        String tag) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /images/search : Search images
     * Search for an image on Docker Hub.
     *
     * @param term Term to search (required)
     * @param limit Maximum number of results to return (optional)
     * @param filters A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the images list. Available filters:  - &#x60;is-automated&#x3D;(true|false)&#x60; - &#x60;is-official&#x3D;(true|false)&#x60; - &#x60;stars&#x3D;&lt;number&gt;&#x60; Matches images that has at least &#39;number&#39; stars.  (optional)
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see ImagesApi#imageSearch
     */
    default ResponseEntity<List<ImageSearchResponseItem>> imageSearch(String term,
        Integer limit,
        String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"is_official\" : true, \"is_automated\" : true, \"name\" : \"name\", \"description\" : \"description\", \"star_count\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /images/{name}/tag : Tag an image
     * Tag an image so that it becomes part of a repository.
     *
     * @param name Image name or ID to tag. (required)
     * @param repo The repository to tag in. For example, &#x60;someuser/someimage&#x60;. (optional)
     * @param tag The name of the new tag. (optional)
     * @return No error (status code 201)
     *         or Bad parameter (status code 400)
     *         or No such image (status code 404)
     *         or Conflict (status code 409)
     *         or Server error (status code 500)
     * @see ImagesApi#imageTag
     */
    default ResponseEntity<Void> imageTag(String name,
        String repo,
        String tag) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
