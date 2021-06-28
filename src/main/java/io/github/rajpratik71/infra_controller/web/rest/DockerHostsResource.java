package io.github.rajpratik71.infra_controller.web.rest;

import io.github.rajpratik71.infra_controller.domain.DockerHosts;
import io.github.rajpratik71.infra_controller.repository.DockerHostsRepository;
import io.github.rajpratik71.infra_controller.service.DockerHostsService;
import io.github.rajpratik71.infra_controller.web.rest.errors.BadRequestAlertException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tech.jhipster.web.util.HeaderUtil;
import tech.jhipster.web.util.ResponseUtil;

/**
 * REST controller for managing {@link io.github.rajpratik71.infra_controller.domain.DockerHosts}.
 */
@RestController
@RequestMapping("/api")
public class DockerHostsResource {

    private final Logger log = LoggerFactory.getLogger(DockerHostsResource.class);

    private static final String ENTITY_NAME = "dockerHosts";

    @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DockerHostsService dockerHostsService;

    private final DockerHostsRepository dockerHostsRepository;

    public DockerHostsResource(DockerHostsService dockerHostsService, DockerHostsRepository dockerHostsRepository) {
        this.dockerHostsService = dockerHostsService;
        this.dockerHostsRepository = dockerHostsRepository;
    }

    /**
     * {@code POST  /docker-hosts} : Create a new dockerHosts.
     *
     * @param dockerHosts the dockerHosts to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dockerHosts, or with status {@code 400 (Bad Request)} if the dockerHosts has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/docker-hosts")
    public ResponseEntity<DockerHosts> createDockerHosts(@RequestBody DockerHosts dockerHosts) throws URISyntaxException {
        log.debug("REST request to save DockerHosts : {}", dockerHosts);
        if (dockerHosts.getId() != null) {
            throw new BadRequestAlertException("A new dockerHosts cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DockerHosts result = dockerHostsService.save(dockerHosts);
        return ResponseEntity
            .created(new URI("/api/docker-hosts/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * {@code PUT  /docker-hosts/:id} : Updates an existing dockerHosts.
     *
     * @param id the id of the dockerHosts to save.
     * @param dockerHosts the dockerHosts to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dockerHosts,
     * or with status {@code 400 (Bad Request)} if the dockerHosts is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dockerHosts couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/docker-hosts/{id}")
    public ResponseEntity<DockerHosts> updateDockerHosts(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody DockerHosts dockerHosts
    ) throws URISyntaxException {
        log.debug("REST request to update DockerHosts : {}, {}", id, dockerHosts);
        if (dockerHosts.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dockerHosts.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dockerHostsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DockerHosts result = dockerHostsService.save(dockerHosts);
        return ResponseEntity
            .ok()
            .headers(HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dockerHosts.getId().toString()))
            .body(result);
    }

    /**
     * {@code PATCH  /docker-hosts/:id} : Partial updates given fields of an existing dockerHosts, field will ignore if it is null
     *
     * @param id the id of the dockerHosts to save.
     * @param dockerHosts the dockerHosts to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dockerHosts,
     * or with status {@code 400 (Bad Request)} if the dockerHosts is not valid,
     * or with status {@code 404 (Not Found)} if the dockerHosts is not found,
     * or with status {@code 500 (Internal Server Error)} if the dockerHosts couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/docker-hosts/{id}", consumes = "application/merge-patch+json")
    public ResponseEntity<DockerHosts> partialUpdateDockerHosts(
        @PathVariable(value = "id", required = false) final Long id,
        @RequestBody DockerHosts dockerHosts
    ) throws URISyntaxException {
        log.debug("REST request to partial update DockerHosts partially : {}, {}", id, dockerHosts);
        if (dockerHosts.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dockerHosts.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dockerHostsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DockerHosts> result = dockerHostsService.partialUpdate(dockerHosts);

        return ResponseUtil.wrapOrNotFound(
            result,
            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dockerHosts.getId().toString())
        );
    }

    /**
     * {@code GET  /docker-hosts} : get all the dockerHosts.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dockerHosts in body.
     */
    @GetMapping("/docker-hosts")
    public List<DockerHosts> getAllDockerHosts() {
        log.debug("REST request to get all DockerHosts");
        return dockerHostsService.findAll();
    }

    /**
     * {@code GET  /docker-hosts/:id} : get the "id" dockerHosts.
     *
     * @param id the id of the dockerHosts to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dockerHosts, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/docker-hosts/{id}")
    public ResponseEntity<DockerHosts> getDockerHosts(@PathVariable Long id) {
        log.debug("REST request to get DockerHosts : {}", id);
        Optional<DockerHosts> dockerHosts = dockerHostsService.findOne(id);
        return ResponseUtil.wrapOrNotFound(dockerHosts);
    }

    /**
     * {@code DELETE  /docker-hosts/:id} : delete the "id" dockerHosts.
     *
     * @param id the id of the dockerHosts to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/docker-hosts/{id}")
    public ResponseEntity<Void> deleteDockerHosts(@PathVariable Long id) {
        log.debug("REST request to delete DockerHosts : {}", id);
        dockerHostsService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
            .build();
    }
}
