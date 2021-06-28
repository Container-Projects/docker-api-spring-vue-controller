package io.github.rajpratik71.infra_controller.domain;

import java.io.Serializable;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DockerHosts.
 */
@Entity
@Table(name = "docker_hosts")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DockerHosts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "ipaddress")
    private String ipaddress;

    @Column(name = "tlsenabled")
    private Boolean tlsenabled;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public DockerHosts id(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public DockerHosts name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpaddress() {
        return this.ipaddress;
    }

    public DockerHosts ipaddress(String ipaddress) {
        this.ipaddress = ipaddress;
        return this;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public Boolean getTlsenabled() {
        return this.tlsenabled;
    }

    public DockerHosts tlsenabled(Boolean tlsenabled) {
        this.tlsenabled = tlsenabled;
        return this;
    }

    public void setTlsenabled(Boolean tlsenabled) {
        this.tlsenabled = tlsenabled;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DockerHosts)) {
            return false;
        }
        return id != null && id.equals(((DockerHosts) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DockerHosts{" +
            "id=" + getId() +
            ", name='" + getName() + "'" +
            ", ipaddress='" + getIpaddress() + "'" +
            ", tlsenabled='" + getTlsenabled() + "'" +
            "}";
    }
}
