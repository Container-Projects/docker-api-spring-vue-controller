package io.github.rajpratik71.infra_controller.web.rest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import io.github.rajpratik71.infra_controller.IntegrationTest;
import io.github.rajpratik71.infra_controller.domain.DockerHosts;
import io.github.rajpratik71.infra_controller.repository.DockerHostsRepository;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
import javax.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;

/**
 * Integration tests for the {@link DockerHostsResource} REST controller.
 */
@IntegrationTest
@AutoConfigureMockMvc
@WithMockUser
class DockerHostsResourceIT {

    private static final String DEFAULT_NAME = "AAAAAAAAAA";
    private static final String UPDATED_NAME = "BBBBBBBBBB";

    private static final String DEFAULT_IPADDRESS = "AAAAAAAAAA";
    private static final String UPDATED_IPADDRESS = "BBBBBBBBBB";

    private static final Boolean DEFAULT_TLSENABLED = false;
    private static final Boolean UPDATED_TLSENABLED = true;

    private static final String ENTITY_API_URL = "/api/docker-hosts";
    private static final String ENTITY_API_URL_ID = ENTITY_API_URL + "/{id}";

    private static Random random = new Random();
    private static AtomicLong count = new AtomicLong(random.nextInt() + (2 * Integer.MAX_VALUE));

    @Autowired
    private DockerHostsRepository dockerHostsRepository;

    @Autowired
    private EntityManager em;

    @Autowired
    private MockMvc restDockerHostsMockMvc;

    private DockerHosts dockerHosts;

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static DockerHosts createEntity(EntityManager em) {
        DockerHosts dockerHosts = new DockerHosts().name(DEFAULT_NAME).ipaddress(DEFAULT_IPADDRESS).tlsenabled(DEFAULT_TLSENABLED);
        return dockerHosts;
    }

    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static DockerHosts createUpdatedEntity(EntityManager em) {
        DockerHosts dockerHosts = new DockerHosts().name(UPDATED_NAME).ipaddress(UPDATED_IPADDRESS).tlsenabled(UPDATED_TLSENABLED);
        return dockerHosts;
    }

    @BeforeEach
    public void initTest() {
        dockerHosts = createEntity(em);
    }

    @Test
    @Transactional
    void createDockerHosts() throws Exception {
        int databaseSizeBeforeCreate = dockerHostsRepository.findAll().size();
        // Create the DockerHosts
        restDockerHostsMockMvc
            .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(dockerHosts)))
            .andExpect(status().isCreated());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeCreate + 1);
        DockerHosts testDockerHosts = dockerHostsList.get(dockerHostsList.size() - 1);
        assertThat(testDockerHosts.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testDockerHosts.getIpaddress()).isEqualTo(DEFAULT_IPADDRESS);
        assertThat(testDockerHosts.getTlsenabled()).isEqualTo(DEFAULT_TLSENABLED);
    }

    @Test
    @Transactional
    void createDockerHostsWithExistingId() throws Exception {
        // Create the DockerHosts with an existing ID
        dockerHosts.setId(1L);

        int databaseSizeBeforeCreate = dockerHostsRepository.findAll().size();

        // An entity with an existing ID cannot be created, so this API call must fail
        restDockerHostsMockMvc
            .perform(post(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(dockerHosts)))
            .andExpect(status().isBadRequest());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeCreate);
    }

    @Test
    @Transactional
    void getAllDockerHosts() throws Exception {
        // Initialize the database
        dockerHostsRepository.saveAndFlush(dockerHosts);

        // Get all the dockerHostsList
        restDockerHostsMockMvc
            .perform(get(ENTITY_API_URL + "?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(dockerHosts.getId().intValue())))
            .andExpect(jsonPath("$.[*].name").value(hasItem(DEFAULT_NAME)))
            .andExpect(jsonPath("$.[*].ipaddress").value(hasItem(DEFAULT_IPADDRESS)))
            .andExpect(jsonPath("$.[*].tlsenabled").value(hasItem(DEFAULT_TLSENABLED.booleanValue())));
    }

    @Test
    @Transactional
    void getDockerHosts() throws Exception {
        // Initialize the database
        dockerHostsRepository.saveAndFlush(dockerHosts);

        // Get the dockerHosts
        restDockerHostsMockMvc
            .perform(get(ENTITY_API_URL_ID, dockerHosts.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(dockerHosts.getId().intValue()))
            .andExpect(jsonPath("$.name").value(DEFAULT_NAME))
            .andExpect(jsonPath("$.ipaddress").value(DEFAULT_IPADDRESS))
            .andExpect(jsonPath("$.tlsenabled").value(DEFAULT_TLSENABLED.booleanValue()));
    }

    @Test
    @Transactional
    void getNonExistingDockerHosts() throws Exception {
        // Get the dockerHosts
        restDockerHostsMockMvc.perform(get(ENTITY_API_URL_ID, Long.MAX_VALUE)).andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    void putNewDockerHosts() throws Exception {
        // Initialize the database
        dockerHostsRepository.saveAndFlush(dockerHosts);

        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();

        // Update the dockerHosts
        DockerHosts updatedDockerHosts = dockerHostsRepository.findById(dockerHosts.getId()).get();
        // Disconnect from session so that the updates on updatedDockerHosts are not directly saved in db
        em.detach(updatedDockerHosts);
        updatedDockerHosts.name(UPDATED_NAME).ipaddress(UPDATED_IPADDRESS).tlsenabled(UPDATED_TLSENABLED);

        restDockerHostsMockMvc
            .perform(
                put(ENTITY_API_URL_ID, updatedDockerHosts.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(updatedDockerHosts))
            )
            .andExpect(status().isOk());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
        DockerHosts testDockerHosts = dockerHostsList.get(dockerHostsList.size() - 1);
        assertThat(testDockerHosts.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testDockerHosts.getIpaddress()).isEqualTo(UPDATED_IPADDRESS);
        assertThat(testDockerHosts.getTlsenabled()).isEqualTo(UPDATED_TLSENABLED);
    }

    @Test
    @Transactional
    void putNonExistingDockerHosts() throws Exception {
        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();
        dockerHosts.setId(count.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restDockerHostsMockMvc
            .perform(
                put(ENTITY_API_URL_ID, dockerHosts.getId())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(dockerHosts))
            )
            .andExpect(status().isBadRequest());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithIdMismatchDockerHosts() throws Exception {
        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();
        dockerHosts.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restDockerHostsMockMvc
            .perform(
                put(ENTITY_API_URL_ID, count.incrementAndGet())
                    .contentType(MediaType.APPLICATION_JSON)
                    .content(TestUtil.convertObjectToJsonBytes(dockerHosts))
            )
            .andExpect(status().isBadRequest());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void putWithMissingIdPathParamDockerHosts() throws Exception {
        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();
        dockerHosts.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restDockerHostsMockMvc
            .perform(put(ENTITY_API_URL).contentType(MediaType.APPLICATION_JSON).content(TestUtil.convertObjectToJsonBytes(dockerHosts)))
            .andExpect(status().isMethodNotAllowed());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void partialUpdateDockerHostsWithPatch() throws Exception {
        // Initialize the database
        dockerHostsRepository.saveAndFlush(dockerHosts);

        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();

        // Update the dockerHosts using partial update
        DockerHosts partialUpdatedDockerHosts = new DockerHosts();
        partialUpdatedDockerHosts.setId(dockerHosts.getId());

        restDockerHostsMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedDockerHosts.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedDockerHosts))
            )
            .andExpect(status().isOk());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
        DockerHosts testDockerHosts = dockerHostsList.get(dockerHostsList.size() - 1);
        assertThat(testDockerHosts.getName()).isEqualTo(DEFAULT_NAME);
        assertThat(testDockerHosts.getIpaddress()).isEqualTo(DEFAULT_IPADDRESS);
        assertThat(testDockerHosts.getTlsenabled()).isEqualTo(DEFAULT_TLSENABLED);
    }

    @Test
    @Transactional
    void fullUpdateDockerHostsWithPatch() throws Exception {
        // Initialize the database
        dockerHostsRepository.saveAndFlush(dockerHosts);

        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();

        // Update the dockerHosts using partial update
        DockerHosts partialUpdatedDockerHosts = new DockerHosts();
        partialUpdatedDockerHosts.setId(dockerHosts.getId());

        partialUpdatedDockerHosts.name(UPDATED_NAME).ipaddress(UPDATED_IPADDRESS).tlsenabled(UPDATED_TLSENABLED);

        restDockerHostsMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, partialUpdatedDockerHosts.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(partialUpdatedDockerHosts))
            )
            .andExpect(status().isOk());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
        DockerHosts testDockerHosts = dockerHostsList.get(dockerHostsList.size() - 1);
        assertThat(testDockerHosts.getName()).isEqualTo(UPDATED_NAME);
        assertThat(testDockerHosts.getIpaddress()).isEqualTo(UPDATED_IPADDRESS);
        assertThat(testDockerHosts.getTlsenabled()).isEqualTo(UPDATED_TLSENABLED);
    }

    @Test
    @Transactional
    void patchNonExistingDockerHosts() throws Exception {
        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();
        dockerHosts.setId(count.incrementAndGet());

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restDockerHostsMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, dockerHosts.getId())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(dockerHosts))
            )
            .andExpect(status().isBadRequest());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithIdMismatchDockerHosts() throws Exception {
        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();
        dockerHosts.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restDockerHostsMockMvc
            .perform(
                patch(ENTITY_API_URL_ID, count.incrementAndGet())
                    .contentType("application/merge-patch+json")
                    .content(TestUtil.convertObjectToJsonBytes(dockerHosts))
            )
            .andExpect(status().isBadRequest());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void patchWithMissingIdPathParamDockerHosts() throws Exception {
        int databaseSizeBeforeUpdate = dockerHostsRepository.findAll().size();
        dockerHosts.setId(count.incrementAndGet());

        // If url ID doesn't match entity ID, it will throw BadRequestAlertException
        restDockerHostsMockMvc
            .perform(
                patch(ENTITY_API_URL).contentType("application/merge-patch+json").content(TestUtil.convertObjectToJsonBytes(dockerHosts))
            )
            .andExpect(status().isMethodNotAllowed());

        // Validate the DockerHosts in the database
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    void deleteDockerHosts() throws Exception {
        // Initialize the database
        dockerHostsRepository.saveAndFlush(dockerHosts);

        int databaseSizeBeforeDelete = dockerHostsRepository.findAll().size();

        // Delete the dockerHosts
        restDockerHostsMockMvc
            .perform(delete(ENTITY_API_URL_ID, dockerHosts.getId()).accept(MediaType.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<DockerHosts> dockerHostsList = dockerHostsRepository.findAll();
        assertThat(dockerHostsList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
