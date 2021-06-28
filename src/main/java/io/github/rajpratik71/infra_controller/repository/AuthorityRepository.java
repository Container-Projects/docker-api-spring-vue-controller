package io.github.rajpratik71.infra_controller.repository;

import io.github.rajpratik71.infra_controller.domain.Authority;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
