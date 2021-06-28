
package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject;
import java.util.List;
import io.github.rajpratik71.infra_controller.service.api.dto.Plugin;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginPrivilegeItem;
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
@Api(value = "plugins", description = "the plugins API")
public interface PluginsApi {

    default PluginsApiDelegate getDelegate() {
        return new PluginsApiDelegate() {
        };
    }

    /**
     * GET /plugins/privileges : Get plugin privileges
     *
     * @param remote The name of the plugin. The &#x60;:latest&#x60; tag is
     *               optional, and is the default if omitted. (required)
     * @return no error (status code 200) or server error (status code 500)
     */
    @ApiOperation(value = "Get plugin privileges", nickname = "getPluginPrivileges", notes = "", response = PluginPrivilegeItem.class, responseContainer = "List", tags = {
            "Plugin", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "no error", response = PluginPrivilegeItem.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/plugins/privileges", produces = { "application/json", "text/plain" })
    default ResponseEntity<List<PluginPrivilegeItem>> getPluginPrivileges(
            @NotNull @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @Valid @RequestParam(value = "remote", required = true) String remote) {
        return getDelegate().getPluginPrivileges(remote);
    }

    /**
     * POST /plugins/create : Create a plugin
     *
     * @param name       The name of the plugin. The &#x60;:latest&#x60; tag is
     *                   optional, and is the default if omitted. (required)
     * @param tarContext Path to tar containing plugin rootfs and manifest
     *                   (optional)
     * @return no error (status code 204) or server error (status code 500)
     */
    @ApiOperation(value = "Create a plugin", nickname = "pluginCreate", notes = "", tags = { "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/plugins/create", produces = { "application/json", "text/plain" }, consumes = {
            "application/x-tar" })
    default ResponseEntity<Void> pluginCreate(
            @NotNull @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @Valid @RequestParam(value = "name", required = true) String name,
            @ApiParam(value = "Path to tar containing plugin rootfs and manifest") @Valid @RequestBody(required = false) org.springframework.web.multipart.MultipartFile tarContext) {
        return getDelegate().pluginCreate(name, tarContext);
    }

    /**
     * DELETE /plugins/{name} : Remove a plugin
     *
     * @param name  The name of the plugin. The &#x60;:latest&#x60; tag is optional,
     *              and is the default if omitted. (required)
     * @param force Disable the plugin before removing. This may result in issues if
     *              the plugin is in use by a container. (optional, default to
     *              false)
     * @return no error (status code 200) or plugin is not installed (status code
     *         404) or server error (status code 500)
     */
    @ApiOperation(value = "Remove a plugin", nickname = "pluginDelete", notes = "", response = Plugin.class, tags = {
            "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Plugin.class),
            @ApiResponse(code = 404, message = "plugin is not installed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @DeleteMapping(value = "/plugins/{name}", produces = { "application/json", "text/plain" })
    default ResponseEntity<Plugin> pluginDelete(
            @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @PathVariable("name") String name,
            @ApiParam(value = "Disable the plugin before removing. This may result in issues if the plugin is in use by a container. ", defaultValue = "false") @Valid @RequestParam(value = "force", required = false, defaultValue = "false") Boolean force) {
        return getDelegate().pluginDelete(name, force);
    }

    /**
     * POST /plugins/{name}/disable : Disable a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional,
     *             and is the default if omitted. (required)
     * @return no error (status code 200) or plugin is not installed (status code
     *         404) or server error (status code 500)
     */
    @ApiOperation(value = "Disable a plugin", nickname = "pluginDisable", notes = "", tags = { "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 404, message = "plugin is not installed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/plugins/{name}/disable", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> pluginDisable(
            @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @PathVariable("name") String name) {
        return getDelegate().pluginDisable(name);
    }

    /**
     * POST /plugins/{name}/enable : Enable a plugin
     *
     * @param name    The name of the plugin. The &#x60;:latest&#x60; tag is
     *                optional, and is the default if omitted. (required)
     * @param timeout Set the HTTP client timeout (in seconds) (optional, default to
     *                0)
     * @return no error (status code 200) or plugin is not installed (status code
     *         404) or server error (status code 500)
     */
    @ApiOperation(value = "Enable a plugin", nickname = "pluginEnable", notes = "", tags = { "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 404, message = "plugin is not installed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/plugins/{name}/enable", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> pluginEnable(
            @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @PathVariable("name") String name,
            @ApiParam(value = "Set the HTTP client timeout (in seconds)", defaultValue = "0") @Valid @RequestParam(value = "timeout", required = false, defaultValue = "0") Integer timeout) {
        return getDelegate().pluginEnable(name, timeout);
    }

    /**
     * GET /plugins/{name}/json : Inspect a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional,
     *             and is the default if omitted. (required)
     * @return no error (status code 200) or plugin is not installed (status code
     *         404) or server error (status code 500)
     */
    @ApiOperation(value = "Inspect a plugin", nickname = "pluginInspect", notes = "", response = Plugin.class, tags = {
            "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error", response = Plugin.class),
            @ApiResponse(code = 404, message = "plugin is not installed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @GetMapping(value = "/plugins/{name}/json", produces = { "application/json", "text/plain" })
    default ResponseEntity<Plugin> pluginInspect(
            @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @PathVariable("name") String name) {
        return getDelegate().pluginInspect(name);
    }

    /**
     * GET /plugins : List plugins Returns information about installed plugins.
     *
     * @param filters A JSON encoded value of the filters (a
     *                &#x60;map[string][]string&#x60;) to process on the plugin
     *                list. Available filters: -
     *                &#x60;capability&#x3D;&lt;capability name&gt;&#x60; -
     *                &#x60;enable&#x3D;&lt;true&gt;|&lt;false&gt;&#x60; (optional)
     * @return No error (status code 200) or Server error (status code 500)
     */
    @ApiOperation(value = "List plugins", nickname = "pluginList", notes = "Returns information about installed plugins.", response = Plugin.class, responseContainer = "List", tags = {
            "Plugin", })
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "No error", response = Plugin.class, responseContainer = "List"),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @GetMapping(value = "/plugins", produces = { "application/json" })
    default ResponseEntity<List<Plugin>> pluginList(
            @ApiParam(value = "A JSON encoded value of the filters (a `map[string][]string`) to process on the plugin list.  Available filters:  - `capability=<capability name>` - `enable=<true>|<false>` ") @Valid @RequestParam(value = "filters", required = false) String filters) {
        return getDelegate().pluginList(filters);
    }

    /**
     * POST /plugins/pull : Install a plugin Pulls and installs a plugin. After the
     * plugin is installed, it can be enabled using the [&#x60;POST
     * /plugins/{name}/enable&#x60; endpoint](#operation/PostPluginsEnable).
     *
     * @param remote        Remote reference for plugin to install. The
     *                      &#x60;:latest&#x60; tag is optional, and is used as the
     *                      default if omitted. (required)
     * @param name          Local name for the pulled plugin. The
     *                      &#x60;:latest&#x60; tag is optional, and is used as the
     *                      default if omitted. (optional)
     * @param xRegistryAuth A base64url-encoded auth configuration to use when
     *                      pulling a plugin from a registry. Refer to the
     *                      [authentication section](#section/Authentication) for
     *                      details. (optional)
     * @param body          (optional)
     * @return no error (status code 204) or server error (status code 500)
     */
    @ApiOperation(value = "Install a plugin", nickname = "pluginPull", notes = "Pulls and installs a plugin. After the plugin is installed, it can be enabled using the [`POST /plugins/{name}/enable` endpoint](#operation/PostPluginsEnable). ", tags = {
            "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/plugins/pull", produces = { "application/json" }, consumes = { "application/json",
            "text/plain" })
    default ResponseEntity<Void> pluginPull(
            @NotNull @ApiParam(value = "Remote reference for plugin to install.  The `:latest` tag is optional, and is used as the default if omitted. ", required = true) @Valid @RequestParam(value = "remote", required = true) String remote,
            @ApiParam(value = "Local name for the pulled plugin.  The `:latest` tag is optional, and is used as the default if omitted. ") @Valid @RequestParam(value = "name", required = false) String name,
            @ApiParam(value = "A base64url-encoded auth configuration to use when pulling a plugin from a registry.  Refer to the [authentication section](#section/Authentication) for details. ") @RequestHeader(value = "X-Registry-Auth", required = false) String xRegistryAuth,
            @ApiParam(value = "") @Valid @RequestBody(required = false) List<InlineObject> body) {
        return getDelegate().pluginPull(remote, name, xRegistryAuth, body);
    }

    /**
     * POST /plugins/{name}/push : Push a plugin Push a plugin to the registry.
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional,
     *             and is the default if omitted. (required)
     * @return no error (status code 200) or plugin not installed (status code 404)
     *         or server error (status code 500)
     */
    @ApiOperation(value = "Push a plugin", nickname = "pluginPush", notes = "Push a plugin to the registry. ", tags = {
            "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 200, message = "no error"),
            @ApiResponse(code = 404, message = "plugin not installed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/plugins/{name}/push", produces = { "application/json", "text/plain" })
    default ResponseEntity<Void> pluginPush(
            @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @PathVariable("name") String name) {
        return getDelegate().pluginPush(name);
    }

    /**
     * POST /plugins/{name}/set : Configure a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional,
     *             and is the default if omitted. (required)
     * @param body (optional)
     * @return No error (status code 204) or Plugin not installed (status code 404)
     *         or Server error (status code 500)
     */
    @ApiOperation(value = "Configure a plugin", nickname = "pluginSet", notes = "", tags = { "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 204, message = "No error"),
            @ApiResponse(code = 404, message = "Plugin not installed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "Server error", response = ErrorResponse.class) })
    @PostMapping(value = "/plugins/{name}/set", produces = { "application/json", "text/plain" }, consumes = {
            "application/json" })
    default ResponseEntity<Void> pluginSet(
            @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @PathVariable("name") String name,
            @ApiParam(value = "") @Valid @RequestBody(required = false) List<String> body) {
        return getDelegate().pluginSet(name, body);
    }

    /**
     * POST /plugins/{name}/upgrade : Upgrade a plugin
     *
     * @param name          The name of the plugin. The &#x60;:latest&#x60; tag is
     *                      optional, and is the default if omitted. (required)
     * @param remote        Remote reference to upgrade to. The &#x60;:latest&#x60;
     *                      tag is optional, and is used as the default if omitted.
     *                      (required)
     * @param xRegistryAuth A base64url-encoded auth configuration to use when
     *                      pulling a plugin from a registry. Refer to the
     *                      [authentication section](#section/Authentication) for
     *                      details. (optional)
     * @param body          (optional)
     * @return no error (status code 204) or plugin not installed (status code 404)
     *         or server error (status code 500)
     */
    @ApiOperation(value = "Upgrade a plugin", nickname = "pluginUpgrade", notes = "", tags = { "Plugin", })
    @ApiResponses(value = { @ApiResponse(code = 204, message = "no error"),
            @ApiResponse(code = 404, message = "plugin not installed", response = ErrorResponse.class),
            @ApiResponse(code = 500, message = "server error", response = ErrorResponse.class) })
    @PostMapping(value = "/plugins/{name}/upgrade", produces = { "application/json", "text/plain" }, consumes = {
            "application/json", "text/plain" })
    default ResponseEntity<Void> pluginUpgrade(
            @ApiParam(value = "The name of the plugin. The `:latest` tag is optional, and is the default if omitted. ", required = true) @PathVariable("name") String name,
            @NotNull @ApiParam(value = "Remote reference to upgrade to.  The `:latest` tag is optional, and is used as the default if omitted. ", required = true) @Valid @RequestParam(value = "remote", required = true) String remote,
            @ApiParam(value = "A base64url-encoded auth configuration to use when pulling a plugin from a registry.  Refer to the [authentication section](#section/Authentication) for details. ") @RequestHeader(value = "X-Registry-Auth", required = false) String xRegistryAuth,
            @ApiParam(value = "") @Valid @RequestBody(required = false) List<InlineObject> body) {
        return getDelegate().pluginUpgrade(name, remote, xRegistryAuth, body);
    }

}
