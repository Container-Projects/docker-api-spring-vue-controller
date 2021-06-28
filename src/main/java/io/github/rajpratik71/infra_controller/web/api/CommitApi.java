
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ContainerConfig;
import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.IdResponse;
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
@Api(value = "commit", description = "the commit API")
public interface CommitApi {

    default CommitApiDelegate getDelegate() {
        return new CommitApiDelegate() {
        };
    }

    /**
     * POST /commit : Create a new image from a container
     *
     * @param container       The ID or name of the container to commit (optional)
     * @param repo            Repository name for the created image (optional)
     * @param tag             Tag name for the create image (optional)
     * @param comment         Commit message (optional)
     * @param author          Author of the image (e.g., &#x60;John Hannibal Smith
     *                        &lt;hannibal@a-team.com&gt;&#x60;) (optional)
     * @param pause           Whether to pause the container before committing
     *                        (optional, default to true)
     * @param changes         &#x60;Dockerfile&#x60; instructions to apply while
     *                        committing (optional)
     * @param containerConfig The container configuration (optional)
     * @return no error (status code 201) or no such container (status code 404) or
     *         server error (status code 500)
     */
    @ApiOperation(value = "Create a new image from a container", nickname = "imageCommit", notes = "", response = IdResponse.class, tags = {
            "Image", })
    @ApiResponses(value = { @ApiResponse(code = 201, message = "no error", response = IdResponse.class),
            @ApiResponse(code = 404, message = "no such container", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/commit", produces = { "application/json" }, consumes = { "application/json" })
    default ResponseEntity<IdResponse> imageCommit(
            @ApiParam(value = "The ID or name of the container to commit") @Valid @RequestParam(value = "container", required = false) String container,
            @ApiParam(value = "Repository name for the created image") @Valid @RequestParam(value = "repo", required = false) String repo,
            @ApiParam(value = "Tag name for the create image") @Valid @RequestParam(value = "tag", required = false) String tag,
            @ApiParam(value = "Commit message") @Valid @RequestParam(value = "comment", required = false) String comment,
            @ApiParam(value = "Author of the image (e.g., `John Hannibal Smith <hannibal@a-team.com>`)") @Valid @RequestParam(value = "author", required = false) String author,
            @ApiParam(value = "Whether to pause the container before committing", defaultValue = "true") @Valid @RequestParam(value = "pause", required = false, defaultValue = "true") Boolean pause,
            @ApiParam(value = "`Dockerfile` instructions to apply while committing") @Valid @RequestParam(value = "changes", required = false) String changes,
            @ApiParam(value = "The container configuration") @Valid @RequestBody(required = false) ContainerConfig containerConfig) {
        return getDelegate().imageCommit(container, repo, tag, comment, author, pause, changes, containerConfig);
    }

}
