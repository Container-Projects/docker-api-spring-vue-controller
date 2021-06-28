
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.HistoryResponseItem;
import io.github.rajpratik71.infra_controller.service.api.dto.Image;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageDeleteResponseItem;
import io.github.rajpratik71.infra_controller.service.api.dto.ImagePruneResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageSearchResponseItem;
import io.github.rajpratik71.infra_controller.service.api.dto.ImageSummary;
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
@Api(value = "images", description = "the images API")
public interface ImagesApi {

    default ImagesApiDelegate getDelegate() {
        return new ImagesApiDelegate() {
        };
    }

    /**
     * POST /images/create : Create an image Create an image by either pulling it
     * from a registry or importing it.
     *
     * @param fromImage     Name of the image to pull. The name may include a tag or
     *                      digest. This parameter may only be used when pulling an
     *                      image. The pull is cancelled if the HTTP connection is
     *                      closed. (optional)
     * @param fromSrc       Source to import. The value may be a URL from which the
     *                      image can be retrieved or &#x60;-&#x60; to read the
     *                      image from the request body. This parameter may only be
     *                      used when importing an image. (optional)
     * @param repo          Repository name given to an image when it is imported.
     *                      The repo may include a tag. This parameter may only be
     *                      used when importing an image. (optional)
     * @param tag           Tag or digest. If empty when pulling an image, this
     *                      causes all tags for the given image to be pulled.
     *                      (optional)
     * @param message       Set commit message for imported image. (optional)
     * @param xRegistryAuth A base64url-encoded auth configuration. Refer to the
     *                      [authentication section](#section/Authentication) for
     *                      details. (optional)
     * @param platform      Platform in the format os[/arch[/variant]] (optional)
     * @param inputImage    Image content if the value &#x60;-&#x60; has been
     *                      specified in fromSrc query parameter (optional)
     * @return no error (status code 200) or repository does not exist or no read
     *         access (status code 404) or server error (status code 500)
     */
    @ApiOperation(value = "Create an image", nickname = "imageCreate", notes = "Create an image by either pulling it from a registry or importing it.", tags = {
            "Image", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 404, message = "repository does not exist or no read access", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/images/create", produces = { "application/json" }, consumes = { "text/plain",
            "application/octet-stream" })
    default ResponseEntity<Void> imageCreate(
            @ApiParam(value = "Name of the image to pull. The name may include a tag or digest. This parameter may only be used when pulling an image. The pull is cancelled if the HTTP connection is closed.") @Valid @RequestParam(value = "fromImage", required = false) String fromImage,
            @ApiParam(value = "Source to import. The value may be a URL from which the image can be retrieved or `-` to read the image from the request body. This parameter may only be used when importing an image.") @Valid @RequestParam(value = "fromSrc", required = false) String fromSrc,
            @ApiParam(value = "Repository name given to an image when it is imported. The repo may include a tag. This parameter may only be used when importing an image.") @Valid @RequestParam(value = "repo", required = false) String repo,
            @ApiParam(value = "Tag or digest. If empty when pulling an image, this causes all tags for the given image to be pulled.") @Valid @RequestParam(value = "tag", required = false) String tag,
            @ApiParam(value = "Set commit message for imported image.") @Valid @RequestParam(value = "message", required = false) String message,
            @ApiParam(value = "A base64url-encoded auth configuration.  Refer to the [authentication section](#section/Authentication) for details. ") @RequestHeader(value = "X-Registry-Auth", required = false) String xRegistryAuth,
            @ApiParam(value = "Platform in the format os[/arch[/variant]]") @Valid @RequestParam(value = "platform", required = false) String platform,
            @ApiParam(value = "Image content if the value `-` has been specified in fromSrc query parameter") @Valid @RequestBody(required = false) String inputImage) {
        return getDelegate().imageCreate(fromImage, fromSrc, repo, tag, message, xRegistryAuth, platform, inputImage);
    }

    /**
     * DELETE /images/{name} : Remove an image Remove an image, along with any
     * untagged parent images that were referenced by that image. Images can&#39;t
     * be removed if they have descendant images, are being used by a running
     * container or are being used by a build.
     *
     * @param name    Image name or ID (required)
     * @param force   Remove the image even if it is being used by stopped
     *                containers or has other tags (optional, default to false)
     * @param noprune Do not delete untagged parent images (optional, default to
     *                false)
     * @return The image was deleted successfully (status code 200) or No such image
     *         (status code 404) or Conflict (status code 409) or Server error
     *         (status code 500)
     */
    @ApiOperation(value = "Remove an image", nickname = "imageDelete", notes = "Remove an image, along with any untagged parent images that were referenced by that image.  Images can't be removed if they have descendant images, are being used by a running container or are being used by a build. ", response = ImageDeleteResponseItem.class, responseContainer = "List", tags = {
            "Image", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "The image was deleted successfully", response = ImageDeleteResponseItem.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "No such image", response = ErrorResponse.class),
            @ApiResponse(code = 409, message = "Conflict", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @DeleteMapping(value = "/images/{name}", produces = { "application/json" })
    default ResponseEntity<List<ImageDeleteResponseItem>> imageDelete(
            @ApiParam(value = "Image name or ID", required = true) @PathVariable("name") String name,
            @ApiParam(value = "Remove the image even if it is being used by stopped containers or has other tags", defaultValue = "false") @Valid @RequestParam(value = "force", required = false, defaultValue = "false") Boolean force,
            @ApiParam(value = "Do not delete untagged parent images", defaultValue = "false") @Valid @RequestParam(value = "noprune", required = false, defaultValue = "false") Boolean noprune) {
        return getDelegate().imageDelete(name, force, noprune);
    }

    /**
     * GET /images/{name}/get : Export an image Get a tarball containing all images
     * and metadata for a repository. If &#x60;name&#x60; is a specific name and tag
     * (e.g. &#x60;ubuntu:latest&#x60;), then only that image (and its parents) are
     * returned. If &#x60;name&#x60; is an image ID, similarly only that image (and
     * its parents) are returned, but with the exclusion of the
     * &#x60;repositories&#x60; file in the tarball, as there were no image names
     * referenced. ### Image tarball format An image tarball contains one directory
     * per image layer (named using its long ID), each containing these files: -
     * &#x60;VERSION&#x60;: currently &#x60;1.0&#x60; - the file format version -
     * &#x60;json&#x60;: detailed layer information, similar to &#x60;docker inspect
     * layer_id&#x60; - &#x60;layer.tar&#x60;: A tarfile containing the filesystem
     * changes in this layer The &#x60;layer.tar&#x60; file contains
     * &#x60;aufs&#x60; style &#x60;.wh..wh.aufs&#x60; files and directories for
     * storing attribute changes and deletions. If the tarball defines a repository,
     * the tarball should also include a &#x60;repositories&#x60; file at the root
     * that contains a list of repository and tag names mapped to layer IDs.
     * &#x60;&#x60;&#x60;json { \&quot;hello-world\&quot;: { \&quot;latest\&quot;:
     * \&quot;565a9d68a73f6706862bfe8409a7f659776d4d60a8d096eb4a3cbce6999cc2a1\&quot;
     * } } &#x60;&#x60;&#x60;
     *
     * @param name Image name or ID (required)
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Export an image", nickname = "imageGet", notes = "Get a tarball containing all images and metadata for a repository.  If `name` is a specific name and tag (e.g. `ubuntu:latest`), then only that image (and its parents) are returned. If `name` is an image ID, similarly only that image (and its parents) are returned, but with the exclusion of the `repositories` file in the tarball, as there were no image names referenced.  ### Image tarball format  An image tarball contains one directory per image layer (named using its long ID), each containing these files:  - `VERSION`: currently `1.0` - the file format version - `json`: detailed layer information, similar to `docker inspect layer_id` - `layer.tar`: A tarfile containing the filesystem changes in this layer  The `layer.tar` file contains `aufs` style `.wh..wh.aufs` files and directories for storing attribute changes and deletions.  If the tarball defines a repository, the tarball should also include a `repositories` file at the root that contains a list of repository and tag names mapped to layer IDs.  ```json {   \"hello-world\": {     \"latest\": \"565a9d68a73f6706862bfe8409a7f659776d4d60a8d096eb4a3cbce6999cc2a1\"   } } ``` ", response = org.springframework.web.multipart.MultipartFile.class, tags = {
            "Image", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "no error", response = org.springframework.web.multipart.MultipartFile.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/images/{name}/get", produces = { "application/x-tar" })
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> imageGet(
            @ApiParam(value = "Image name or ID", required = true) @PathVariable("name") String name) {
        return getDelegate().imageGet(name);
    }

    /**
     * GET /images/get : Export several images Get a tarball containing all images
     * and metadata for several image repositories. For each value of the
     * &#x60;names&#x60; parameter: if it is a specific name and tag (e.g.
     * &#x60;ubuntu:latest&#x60;), then only that image (and its parents) are
     * returned; if it is an image ID, similarly only that image (and its parents)
     * are returned and there would be no names referenced in the
     * &#39;repositories&#39; file for this image ID. For details on the format, see
     * the [export image endpoint](#operation/ImageGet).
     *
     * @param names Image names to filter by (optional)
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Export several images", nickname = "imageGetAll", notes = "Get a tarball containing all images and metadata for several image repositories.  For each value of the `names` parameter: if it is a specific name and tag (e.g. `ubuntu:latest`), then only that image (and its parents) are returned; if it is an image ID, similarly only that image (and its parents) are returned and there would be no names referenced in the 'repositories' file for this image ID.  For details on the format, see the [export image endpoint](#operation/ImageGet). ", response = org.springframework.web.multipart.MultipartFile.class, tags = {
            "Image", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "no error", response = org.springframework.web.multipart.MultipartFile.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/images/get", produces = { "application/x-tar" })
    default ResponseEntity<org.springframework.web.multipart.MultipartFile> imageGetAll(
            @ApiParam(value = "Image names to filter by") @Valid @RequestParam(value = "names", required = false) List<String> names) {
        return getDelegate().imageGetAll(names);
    }

    /**
     * GET /images/{name}/history : Get the history of an image Return parent layers
     * of an image.
     *
     * @param name Image name or ID (required)
     * @return List of image layers (status code 200) or No such image (status code
     *         404) or Server error (status code 500)
     */
    @ApiOperation(value = "Get the history of an image", nickname = "imageHistory", notes = "Return parent layers of an image.", response = HistoryResponseItem.class, responseContainer = "List", tags = {
            "Image", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "List of image layers", response = HistoryResponseItem.class, responseContainer = "List"),
            @ApiResponse(code = 404, message = "No such image", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/images/{name}/history", produces = { "application/json" })
    default ResponseEntity<List<HistoryResponseItem>> imageHistory(
            @ApiParam(value = "Image name or ID", required = true) @PathVariable("name") String name) {
        return getDelegate().imageHistory(name);
    }

    /**
     * GET /images/{name}/json : Inspect an image Return low-level information about
     * an image.
     *
     * @param name Image name or id (required)
     * @return No error (status code 200) or No such image (status code 404) or
     *         Server error (status code 500)
     */
    @ApiOperation(value = "Inspect an image", nickname = "imageInspect", notes = "Return low-level information about an image.", response = Image.class, tags = {
            "Image", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = Image.class),
            @ApiResponse(code = 404, message = "No such image", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/images/{name}/json", produces = { "application/json" })
    default ResponseEntity<Image> imageInspect(
            @ApiParam(value = "Image name or id", required = true) @PathVariable("name") String name) {
        return getDelegate().imageInspect(name);
    }

    /**
     * GET /images/json : List Images Returns a list of images on the server. Note
     * that it uses a different, smaller representation of an image than inspecting
     * a single image.
     *
     * @param all     Show all images. Only images from a final layer (no children)
     *                are shown by default. (optional, default to false)
     * @param filters A JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the images
     *                list. Available filters: -
     *                &#x60;before&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,
     *                &#x60;&lt;image id&gt;&#x60; or
     *                &#x60;&lt;image@digest&gt;&#x60;) -
     *                &#x60;dangling&#x3D;true&#x60; - &#x60;label&#x3D;key&#x60; or
     *                &#x60;label&#x3D;\&quot;key&#x3D;value\&quot;&#x60; of an
     *                image label -
     *                &#x60;reference&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;)
     *                -
     *                &#x60;since&#x60;&#x3D;(&#x60;&lt;image-name&gt;[:&lt;tag&gt;]&#x60;,
     *                &#x60;&lt;image id&gt;&#x60; or
     *                &#x60;&lt;image@digest&gt;&#x60;) (optional)
     * @param digests Show digest information as a &#x60;RepoDigests&#x60; field on
     *                each image. (optional, default to false)
     * @return Summary image data for the images matching the query (status code
     *         200) or server error (status code 500)
     */
    @ApiOperation(value = "List Images", nickname = "imageList", notes = "Returns a list of images on the server. Note that it uses a different, smaller representation of an image than inspecting a single image.", response = ImageSummary.class, responseContainer = "List", tags = {
            "Image", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Summary image data for the images matching the query", response = ImageSummary.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/images/json", produces = { "application/json" })
    default ResponseEntity<List<ImageSummary>> imageList(
            @ApiParam(value = "Show all images. Only images from a final layer (no children) are shown by default.", defaultValue = "false") @Valid @RequestParam(value = "all", required = false, defaultValue = "false") Boolean all,
            @ApiParam(value = "A JSON encoded value of the filters (a `map[string][]string`) to process on the images list.  Available filters:  - `before`=(`<image-name>[:<tag>]`,  `<image id>` or `<image@digest>`) - `dangling=true` - `label=key` or `label=\"key=value\"` of an image label - `reference`=(`<image-name>[:<tag>]`) - `since`=(`<image-name>[:<tag>]`,  `<image id>` or `<image@digest>`) ") @Valid @RequestParam(value = "filters", required = false) String filters,
            @ApiParam(value = "Show digest information as a `RepoDigests` field on each image.", defaultValue = "false") @Valid @RequestParam(value = "digests", required = false, defaultValue = "false") Boolean digests) {
        return getDelegate().imageList(all, filters, digests);
    }

    /**
     * POST /images/load : Import images Load a set of images and tags into a
     * repository. For details on the format, see the [export image
     * endpoint](#operation/ImageGet).
     *
     * @param quiet         Suppress progress details during load. (optional,
     *                      default to false)
     * @param imagesTarball Tar archive containing images (optional)
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Import images", nickname = "imageLoad", notes = "Load a set of images and tags into a repository.  For details on the format, see the [export image endpoint](#operation/ImageGet). ", tags = {
            "Image", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/images/load", produces = { "application/json" }, consumes = { "application/x-tar" })
    default ResponseEntity<Void> imageLoad(
            @ApiParam(value = "Suppress progress details during load.", defaultValue = "false") @Valid @RequestParam(value = "quiet", required = false, defaultValue = "false") Boolean quiet,
            @ApiParam(value = "Tar archive containing images") @Valid @RequestBody(required = false) org.springframework.web.multipart.MultipartFile imagesTarball) {
        return getDelegate().imageLoad(quiet, imagesTarball);
    }

    /**
     * POST /images/prune : Delete unused images
     *
     * @param filters Filters to process on the prune list, encoded as JSON (a
     *                &#x60;map[string][]string&#x60;). Available filters: -
     *                &#x60;dangling&#x3D;&lt;boolean&gt;&#x60; When set to
     *                &#x60;true&#x60; (or &#x60;1&#x60;), prune only unused *and*
     *                untagged images. When set to &#x60;false&#x60; (or
     *                &#x60;0&#x60;), all unused images are pruned. -
     *                &#x60;until&#x3D;&lt;string&gt;&#x60; Prune images created
     *                before this timestamp. The &#x60;&lt;timestamp&gt;&#x60; can
     *                be Unix timestamps, date formatted timestamps, or Go duration
     *                strings (e.g. &#x60;10m&#x60;, &#x60;1h30m&#x60;) computed
     *                relative to the daemon machine’s time. - &#x60;label&#x60;
     *                (&#x60;label&#x3D;&lt;key&gt;&#x60;,
     *                &#x60;label&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;,
     *                &#x60;label!&#x3D;&lt;key&gt;&#x60;, or
     *                &#x60;label!&#x3D;&lt;key&gt;&#x3D;&lt;value&gt;&#x60;) Prune
     *                images with (or without, in case &#x60;label!&#x3D;...&#x60;
     *                is used) the specified labels. (optional)
     * @return No error (status code 200) or Server error (status code 500)
     */
    @ApiOperation(value = "Delete unused images", nickname = "imagePrune", notes = "", response = ImagePruneResponse.class, tags = {
            "Image", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error", response = ImagePruneResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/images/prune", produces = { "application/json" })
    default ResponseEntity<ImagePruneResponse> imagePrune(
            @ApiParam(value = "Filters to process on the prune list, encoded as JSON (a `map[string][]string`). Available filters:  - `dangling=<boolean>` When set to `true` (or `1`), prune only    unused *and* untagged images. When set to `false`    (or `0`), all unused images are pruned. - `until=<string>` Prune images created before this timestamp. The `<timestamp>` can be Unix timestamps, date formatted timestamps, or Go duration strings (e.g. `10m`, `1h30m`) computed relative to the daemon machine’s time. - `label` (`label=<key>`, `label=<key>=<value>`, `label!=<key>`, or `label!=<key>=<value>`) Prune images with (or without, in case `label!=...` is used) the specified labels. ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().imagePrune(filters);
    }

    /**
     * POST /images/{name}/push : Push an image Push an image to a registry. If you
     * wish to push an image on to a private registry, that image must already have
     * a tag which references the registry. For example,
     * &#x60;registry.example.com/myimage:latest&#x60;. The push is cancelled if the
     * HTTP connection is closed.
     *
     * @param name          Image name or ID. (required)
     * @param xRegistryAuth A base64url-encoded auth configuration. Refer to the
     *                      [authentication section](#section/Authentication) for
     *                      details. (required)
     * @param tag           The tag to associate with the image on the registry.
     *                      (optional)
     * @return No error (status code 200) or No such image (status code 404) or
     *         Server error (status code 500)
     */
    @ApiOperation(value = "Push an image", nickname = "imagePush", notes = "Push an image to a registry.  If you wish to push an image on to a private registry, that image must already have a tag which references the registry. For example, `registry.example.com/myimage:latest`.  The push is cancelled if the HTTP connection is closed. ", tags = {
            "Image", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "No error"),
            @ApiResponse(code = 404, message = "No such image", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/images/{name}/push", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> imagePush(
            @ApiParam(value = "Image name or ID.", required = true) @PathVariable("name") String name,
            @ApiParam(value = "A base64url-encoded auth configuration.  Refer to the [authentication section](#section/Authentication) for details. ", required = true) @RequestHeader(value = "X-Registry-Auth", required = true) String xRegistryAuth,
            @ApiParam(value = "The tag to associate with the image on the registry.") @Valid @RequestParam(value = "tag", required = false) String tag) {
        return getDelegate().imagePush(name, xRegistryAuth, tag);
    }

    /**
     * GET /images/search : Search images Search for an image on Docker Hub.
     *
     * @param term    Term to search (required)
     * @param limit   Maximum number of results to return (optional)
     * @param filters A JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the images
     *                list. Available filters: -
     *                &#x60;is-automated&#x3D;(true|false)&#x60; -
     *                &#x60;is-official&#x3D;(true|false)&#x60; -
     *                &#x60;stars&#x3D;&lt;number&gt;&#x60; Matches images that has
     *                at least &#39;number&#39; stars. (optional)
     * @return No error (status code 200) or Server error (status code 500)
     */
    @ApiOperation(value = "Search images", nickname = "imageSearch", notes = "Search for an image on Docker Hub.", response = ImageSearchResponseItem.class, responseContainer = "List", tags = {
            "Image", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "No error", response = ImageSearchResponseItem.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/images/search", produces = { "application/json" })
    default ResponseEntity<List<ImageSearchResponseItem>> imageSearch(
            @NotNull @ApiParam(value = "Term to search", required = true) @Valid @RequestParam(value = "term", required = true) String term,
            @ApiParam(value = "Maximum number of results to return") @Valid @RequestParam(value = "limit", required = false) Integer limit,
            @ApiParam(value = "A JSON encoded value of the filters (a `map[string][]string`) to process on the images list. Available filters:  - `is-automated=(true|false)` - `is-official=(true|false)` - `stars=<number>` Matches images that has at least 'number' stars. ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().imageSearch(term, limit, filters);
    }

    /**
     * POST /images/{name}/tag : Tag an image Tag an image so that it becomes part
     * of a repository.
     *
     * @param name Image name or ID to tag. (required)
     * @param repo The repository to tag in. For example,
     *             &#x60;someuser/someimage&#x60;. (optional)
     * @param tag  The name of the new tag. (optional)
     * @return No error (status code 201) or Bad parameter (status code 400) or No
     *         such image (status code 404) or Conflict (status code 409) or Server
     *         error (status code 500)
     */
    @ApiOperation(value = "Tag an image", nickname = "imageTag", notes = "Tag an image so that it becomes part of a repository.", tags = {
            "Image", })
    @ApiResponses(value = { @ApiResponse(code = 201, message = "No error"),
            @ApiResponse(code = 400, message = "Bad parameter", response = ErrorResponse.class),
            @ApiResponse(code = 404, message = "No such image", response = ErrorResponse.class),
            @ApiResponse(code = 409, message = "Conflict", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/images/{name}/tag", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> imageTag(
            @ApiParam(value = "Image name or ID to tag.", required = true) @PathVariable("name") String name,
            @ApiParam(value = "The repository to tag in. For example, `someuser/someimage`.") @Valid @RequestParam(value = "repo", required = false) String repo,
            @ApiParam(value = "The name of the new tag.") @Valid @RequestParam(value = "tag", required = false) String tag) {
        return getDelegate().imageTag(name, repo, tag);
    }

}
