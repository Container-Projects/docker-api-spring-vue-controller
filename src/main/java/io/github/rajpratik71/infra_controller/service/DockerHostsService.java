package io.github.rajpratik71.infra_controller.service;

import io.github.rajpratik71.infra_controller.domain.DockerHosts;
import io.github.rajpratik71.infra_controller.repository.DockerHostsRepository;
import java.util.List;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link DockerHosts}.
 */
@Service
@Transactional
public class DockerHostsService {

    private final Logger log = LoggerFactory.getLogger(DockerHostsService.class);

    private final DockerHostsRepository dockerHostsRepository;

    public DockerHostsService(DockerHostsRepository dockerHostsRepository) {
        this.dockerHostsRepository = dockerHostsRepository;
    }

    /**
     * Save a dockerHosts.
     *
     * @param dockerHosts the entity to save.
     * @return the persisted entity.
     */
    public DockerHosts save(DockerHosts dockerHosts) {
        log.debug("Request to save DockerHosts : {}", dockerHosts);
        return dockerHostsRepository.save(dockerHosts);
    }

    /**
     * Partially update a dockerHosts.
     *
     * @param dockerHosts the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DockerHosts> partialUpdate(DockerHosts dockerHosts) {
        log.debug("Request to partially update DockerHosts : {}", dockerHosts);

        return dockerHostsRepository
            .findById(dockerHosts.getId())
            .map(
                existingDockerHosts -> {
                    if (dockerHosts.getName() != null) {
                        existingDockerHosts.setName(dockerHosts.getName());
                    }
                    if (dockerHosts.getIpaddress() != null) {
                        existingDockerHosts.setIpaddress(dockerHosts.getIpaddress());
                    }
                    if (dockerHosts.getTlsenabled() != null) {
                        existingDockerHosts.setTlsenabled(dockerHosts.getTlsenabled());
                    }

                    return existingDockerHosts;
                }
            )
            .map(dockerHostsRepository::save);
    }

    /**
     * Get all the dockerHosts.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DockerHosts> findAll() {
        log.debug("Request to get all DockerHosts");
        return dockerHostsRepository.findAll();
    }

    /**
     * Get one dockerHosts by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DockerHosts> findOne(Long id) {
        log.debug("Request to get DockerHosts : {}", id);
        return dockerHostsRepository.findById(id);
    }

    /**
     * Delete the dockerHosts by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DockerHosts : {}", id);
        dockerHostsRepository.deleteById(id);
    }
}
