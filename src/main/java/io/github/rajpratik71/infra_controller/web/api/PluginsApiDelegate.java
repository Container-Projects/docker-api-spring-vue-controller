package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.InlineObject;
import java.util.List;
import io.github.rajpratik71.infra_controller.service.api.dto.Plugin;
import io.github.rajpratik71.infra_controller.service.api.dto.PluginPrivilegeItem;
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
 * A delegate to be called by the {@link PluginsApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface PluginsApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /plugins/privileges : Get plugin privileges
     *
     * @param remote The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @return no error (status code 200)
     *         or server error (status code 500)
     * @see PluginsApi#getPluginPrivileges
     */
    default ResponseEntity<List<PluginPrivilegeItem>> getPluginPrivileges(String remote) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"Name\" : \"network\", \"Description\" : \"\", \"Value\" : [ \"host\" ] }, { \"Name\" : \"mount\", \"Description\" : \"\", \"Value\" : [ \"/data\" ] }, { \"Name\" : \"device\", \"Description\" : \"\", \"Value\" : [ \"/dev/cpu_dma_latency\" ] } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plugins/create : Create a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @param tarContext Path to tar containing plugin rootfs and manifest (optional)
     * @return no error (status code 204)
     *         or server error (status code 500)
     * @see PluginsApi#pluginCreate
     */
    default ResponseEntity<Void> pluginCreate(String name,
        MultipartFile tarContext) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * DELETE /plugins/{name} : Remove a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @param force Disable the plugin before removing. This may result in issues if the plugin is in use by a container.  (optional, default to false)
     * @return no error (status code 200)
     *         or plugin is not installed (status code 404)
     *         or server error (status code 500)
     * @see PluginsApi#pluginDelete
     */
    default ResponseEntity<Plugin> pluginDelete(String name,
        Boolean force) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Config\" : { \"Mounts\" : [ { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" }, { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" } ], \"Args\" : { \"Description\" : \"command line arguments\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Value\" : [ \"Value\", \"Value\" ], \"Name\" : \"args\" }, \"Description\" : \"A sample volume plugin for Docker\", \"User\" : { \"UID\" : 1000, \"GID\" : 1000 }, \"Entrypoint\" : [ \"/usr/bin/sample-volume-plugin\", \"/data\" ], \"Documentation\" : \"https://docs.docker.com/engine/extend/plugins/\", \"Env\" : [ { \"Name\" : \"DEBUG\", \"Description\" : \"If set, prints debug messages\", \"Value\" : \"0\" } ], \"PropagatedMount\" : \"/mnt/volumes\", \"PidHost\" : false, \"DockerVersion\" : \"17.06.0-ce\", \"Linux\" : { \"Capabilities\" : [ \"CAP_SYS_ADMIN\", \"CAP_SYSLOG\" ], \"Devices\" : [ { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" }, { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" } ], \"AllowAllDevices\" : false }, \"Network\" : { \"Type\" : \"host\" }, \"rootfs\" : { \"diff_ids\" : [ \"sha256:675532206fbf3030b8458f88d6e26d4eb1577688a25efec97154c94e8b6b4887\", \"sha256:e216a057b1cb1efc11f8a268f37ef62083e70b1b38323ba252e25ac88904a7e8\" ], \"type\" : \"layers\" }, \"WorkDir\" : \"/bin/\", \"Interface\" : { \"Types\" : [ \"docker.volumedriver/1.0\" ], \"ProtocolScheme\" : \"some.protocol/v1.0\", \"Socket\" : \"plugins.sock\" }, \"IpcHost\" : false }, \"Enabled\" : true, \"Id\" : \"5724e2c8652da337ab2eedd19fc6fc0ec908e4bd907c7421bf6a8dfc70c4c078\", \"Settings\" : { \"Mounts\" : [ { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" }, { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" } ], \"Args\" : [ \"Args\", \"Args\" ], \"Env\" : [ \"DEBUG=0\" ], \"Devices\" : [ { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" }, { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" } ] }, \"Name\" : \"tiborvass/sample-volume-plugin\", \"PluginReference\" : \"localhost:5000/tiborvass/sample-volume-plugin:latest\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plugins/{name}/disable : Disable a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @return no error (status code 200)
     *         or plugin is not installed (status code 404)
     *         or server error (status code 500)
     * @see PluginsApi#pluginDisable
     */
    default ResponseEntity<Void> pluginDisable(String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plugins/{name}/enable : Enable a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @param timeout Set the HTTP client timeout (in seconds) (optional, default to 0)
     * @return no error (status code 200)
     *         or plugin is not installed (status code 404)
     *         or server error (status code 500)
     * @see PluginsApi#pluginEnable
     */
    default ResponseEntity<Void> pluginEnable(String name,
        Integer timeout) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /plugins/{name}/json : Inspect a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @return no error (status code 200)
     *         or plugin is not installed (status code 404)
     *         or server error (status code 500)
     * @see PluginsApi#pluginInspect
     */
    default ResponseEntity<Plugin> pluginInspect(String name) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Config\" : { \"Mounts\" : [ { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" }, { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" } ], \"Args\" : { \"Description\" : \"command line arguments\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Value\" : [ \"Value\", \"Value\" ], \"Name\" : \"args\" }, \"Description\" : \"A sample volume plugin for Docker\", \"User\" : { \"UID\" : 1000, \"GID\" : 1000 }, \"Entrypoint\" : [ \"/usr/bin/sample-volume-plugin\", \"/data\" ], \"Documentation\" : \"https://docs.docker.com/engine/extend/plugins/\", \"Env\" : [ { \"Name\" : \"DEBUG\", \"Description\" : \"If set, prints debug messages\", \"Value\" : \"0\" } ], \"PropagatedMount\" : \"/mnt/volumes\", \"PidHost\" : false, \"DockerVersion\" : \"17.06.0-ce\", \"Linux\" : { \"Capabilities\" : [ \"CAP_SYS_ADMIN\", \"CAP_SYSLOG\" ], \"Devices\" : [ { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" }, { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" } ], \"AllowAllDevices\" : false }, \"Network\" : { \"Type\" : \"host\" }, \"rootfs\" : { \"diff_ids\" : [ \"sha256:675532206fbf3030b8458f88d6e26d4eb1577688a25efec97154c94e8b6b4887\", \"sha256:e216a057b1cb1efc11f8a268f37ef62083e70b1b38323ba252e25ac88904a7e8\" ], \"type\" : \"layers\" }, \"WorkDir\" : \"/bin/\", \"Interface\" : { \"Types\" : [ \"docker.volumedriver/1.0\" ], \"ProtocolScheme\" : \"some.protocol/v1.0\", \"Socket\" : \"plugins.sock\" }, \"IpcHost\" : false }, \"Enabled\" : true, \"Id\" : \"5724e2c8652da337ab2eedd19fc6fc0ec908e4bd907c7421bf6a8dfc70c4c078\", \"Settings\" : { \"Mounts\" : [ { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" }, { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" } ], \"Args\" : [ \"Args\", \"Args\" ], \"Env\" : [ \"DEBUG=0\" ], \"Devices\" : [ { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" }, { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" } ] }, \"Name\" : \"tiborvass/sample-volume-plugin\", \"PluginReference\" : \"localhost:5000/tiborvass/sample-volume-plugin:latest\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /plugins : List plugins
     * Returns information about installed plugins.
     *
     * @param filters A JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the plugin list.  Available filters:  - &#x60;capability&#x3D;&lt;capability name&gt;&#x60; - &#x60;enable&#x3D;&lt;true&gt;|&lt;false&gt;&#x60;  (optional)
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see PluginsApi#pluginList
     */
    default ResponseEntity<List<Plugin>> pluginList(String filters) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"Config\" : { \"Mounts\" : [ { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" }, { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" } ], \"Args\" : { \"Description\" : \"command line arguments\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Value\" : [ \"Value\", \"Value\" ], \"Name\" : \"args\" }, \"Description\" : \"A sample volume plugin for Docker\", \"User\" : { \"UID\" : 1000, \"GID\" : 1000 }, \"Entrypoint\" : [ \"/usr/bin/sample-volume-plugin\", \"/data\" ], \"Documentation\" : \"https://docs.docker.com/engine/extend/plugins/\", \"Env\" : [ { \"Name\" : \"DEBUG\", \"Description\" : \"If set, prints debug messages\", \"Value\" : \"0\" } ], \"PropagatedMount\" : \"/mnt/volumes\", \"PidHost\" : false, \"DockerVersion\" : \"17.06.0-ce\", \"Linux\" : { \"Capabilities\" : [ \"CAP_SYS_ADMIN\", \"CAP_SYSLOG\" ], \"Devices\" : [ { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" }, { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" } ], \"AllowAllDevices\" : false }, \"Network\" : { \"Type\" : \"host\" }, \"rootfs\" : { \"diff_ids\" : [ \"sha256:675532206fbf3030b8458f88d6e26d4eb1577688a25efec97154c94e8b6b4887\", \"sha256:e216a057b1cb1efc11f8a268f37ef62083e70b1b38323ba252e25ac88904a7e8\" ], \"type\" : \"layers\" }, \"WorkDir\" : \"/bin/\", \"Interface\" : { \"Types\" : [ \"docker.volumedriver/1.0\" ], \"ProtocolScheme\" : \"some.protocol/v1.0\", \"Socket\" : \"plugins.sock\" }, \"IpcHost\" : false }, \"Enabled\" : true, \"Id\" : \"5724e2c8652da337ab2eedd19fc6fc0ec908e4bd907c7421bf6a8dfc70c4c078\", \"Settings\" : { \"Mounts\" : [ { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" }, { \"Destination\" : \"/mnt/state\", \"Options\" : [ \"rbind\", \"rw\" ], \"Type\" : \"bind\", \"Description\" : \"This is a mount that's used by the plugin.\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Source\" : \"/var/lib/docker/plugins/\", \"Name\" : \"some-mount\" } ], \"Args\" : [ \"Args\", \"Args\" ], \"Env\" : [ \"DEBUG=0\" ], \"Devices\" : [ { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" }, { \"Path\" : \"/dev/fuse\", \"Description\" : \"Description\", \"Settable\" : [ \"Settable\", \"Settable\" ], \"Name\" : \"Name\" } ] }, \"Name\" : \"tiborvass/sample-volume-plugin\", \"PluginReference\" : \"localhost:5000/tiborvass/sample-volume-plugin:latest\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plugins/pull : Install a plugin
     * Pulls and installs a plugin. After the plugin is installed, it can be enabled using the [&#x60;POST /plugins/{name}/enable&#x60; endpoint](#operation/PostPluginsEnable). 
     *
     * @param remote Remote reference for plugin to install.  The &#x60;:latest&#x60; tag is optional, and is used as the default if omitted.  (required)
     * @param name Local name for the pulled plugin.  The &#x60;:latest&#x60; tag is optional, and is used as the default if omitted.  (optional)
     * @param xRegistryAuth A base64url-encoded auth configuration to use when pulling a plugin from a registry.  Refer to the [authentication section](#section/Authentication) for details.  (optional)
     * @param body  (optional)
     * @return no error (status code 204)
     *         or server error (status code 500)
     * @see PluginsApi#pluginPull
     */
    default ResponseEntity<Void> pluginPull(String remote,
        String name,
        String xRegistryAuth,
        List<InlineObject> body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plugins/{name}/push : Push a plugin
     * Push a plugin to the registry. 
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @return no error (status code 200)
     *         or plugin not installed (status code 404)
     *         or server error (status code 500)
     * @see PluginsApi#pluginPush
     */
    default ResponseEntity<Void> pluginPush(String name) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plugins/{name}/set : Configure a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @param body  (optional)
     * @return No error (status code 204)
     *         or Plugin not installed (status code 404)
     *         or Server error (status code 500)
     * @see PluginsApi#pluginSet
     */
    default ResponseEntity<Void> pluginSet(String name,
        List<String> body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /plugins/{name}/upgrade : Upgrade a plugin
     *
     * @param name The name of the plugin. The &#x60;:latest&#x60; tag is optional, and is the default if omitted.  (required)
     * @param remote Remote reference to upgrade to.  The &#x60;:latest&#x60; tag is optional, and is used as the default if omitted.  (required)
     * @param xRegistryAuth A base64url-encoded auth configuration to use when pulling a plugin from a registry.  Refer to the [authentication section](#section/Authentication) for details.  (optional)
     * @param body  (optional)
     * @return no error (status code 204)
     *         or plugin not installed (status code 404)
     *         or server error (status code 500)
     * @see PluginsApi#pluginUpgrade
     */
    default ResponseEntity<Void> pluginUpgrade(String name,
        String remote,
        String xRegistryAuth,
        List<InlineObject> body) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
