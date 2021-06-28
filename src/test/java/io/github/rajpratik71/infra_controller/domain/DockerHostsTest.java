package io.github.rajpratik71.infra_controller.domain;

import static org.assertj.core.api.Assertions.assertThat;

import io.github.rajpratik71.infra_controller.web.rest.TestUtil;
import org.junit.jupiter.api.Test;

class DockerHostsTest {

    @Test
    void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(DockerHosts.class);
        DockerHosts dockerHosts1 = new DockerHosts();
        dockerHosts1.setId(1L);
        DockerHosts dockerHosts2 = new DockerHosts();
        dockerHosts2.setId(dockerHosts1.getId());
        assertThat(dockerHosts1).isEqualTo(dockerHosts2);
        dockerHosts2.setId(2L);
        assertThat(dockerHosts1).isNotEqualTo(dockerHosts2);
        dockerHosts1.setId(null);
        assertThat(dockerHosts1).isNotEqualTo(dockerHosts2);
    }
}
