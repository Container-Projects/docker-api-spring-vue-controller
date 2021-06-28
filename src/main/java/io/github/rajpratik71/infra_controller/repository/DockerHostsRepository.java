package io.github.rajpratik71.infra_controller.repository;

import io.github.rajpratik71.infra_controller.domain.DockerHosts;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the DockerHosts entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DockerHostsRepository extends JpaRepository<DockerHosts, Long> {}
