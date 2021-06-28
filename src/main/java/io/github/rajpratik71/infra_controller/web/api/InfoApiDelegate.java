package io.github.rajpratik71.infra_controller.web.api;

import io.github.rajpratik71.infra_controller.service.api.dto.ErrorResponse;
import io.github.rajpratik71.infra_controller.service.api.dto.SystemInfo;
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
 * A delegate to be called by the {@link InfoApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-06-28T19:13:15.966731+05:30[Asia/Kolkata]")
public interface InfoApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /info : Get system information
     *
     * @return No error (status code 200)
     *         or Server error (status code 500)
     * @see InfoApi#systemInfo
     */
    default ResponseEntity<SystemInfo> systemInfo() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"NGoroutines\" : 174, \"Name\" : \"node5.corp.example.com\", \"Swarm\" : { \"NodeAddr\" : \"10.0.0.46\", \"Managers\" : 3, \"NodeID\" : \"k67qz4598weg5unwwffg6z1m1\", \"Error\" : \"Error\", \"Cluster\" : { \"DefaultAddrPool\" : [ \"\", \"\" ], \"RootRotationInProgress\" : false, \"SubnetSize\" : 24, \"Version\" : { \"Index\" : 373531 }, \"CreatedAt\" : \"2016-08-18T10:44:24.496525531Z\", \"TLSInfo\" : { \"TrustRoot\" : \"-----BEGIN CERTIFICATE-----\nMIIBajCCARCgAwIBAgIUbYqrLSOSQHoxD8CwG6Bi2PJi9c8wCgYIKoZIzj0EAwIw\nEzERMA8GA1UEAxMIc3dhcm0tY2EwHhcNMTcwNDI0MjE0MzAwWhcNMzcwNDE5MjE0\nMzAwWjATMREwDwYDVQQDEwhzd2FybS1jYTBZMBMGByqGSM49AgEGCCqGSM49AwEH\nA0IABJk/VyMPYdaqDXJb/VXh5n/1Yuv7iNrxV3Qb3l06XD46seovcDWs3IZNV1lf\n3Skyr0ofcchipoiHkXBODojJydSjQjBAMA4GA1UdDwEB/wQEAwIBBjAPBgNVHRMB\nAf8EBTADAQH/MB0GA1UdDgQWBBRUXxuRcnFjDfR/RIAUQab8ZV/n4jAKBggqhkjO\nPQQDAgNIADBFAiAy+JTe6Uc3KyLCMiqGl2GyWGQqQDEcO3/YG36x7om65AIhAJvz\npxv6zFeVEkAEEkqIYi0omA9+CjanB/6Bz4n1uw8H\n-----END CERTIFICATE-----\n\", \"CertIssuerSubject\" : \"MBMxETAPBgNVBAMTCHN3YXJtLWNh\", \"CertIssuerPublicKey\" : \"MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAEmT9XIw9h1qoNclv9VeHmf/Vi6/uI2vFXdBveXTpcPjqx6i9wNazchk1XWV/dKTKvSh9xyGKmiIeRcE4OiMnJ1A==\" }, \"DataPathPort\" : 4789, \"ID\" : \"abajmipo7b4xz5ip2nrla6b11\", \"Spec\" : { \"Orchestration\" : { \"TaskHistoryRetentionLimit\" : 10 }, \"CAConfig\" : { \"SigningCACert\" : \"SigningCACert\", \"ExternalCAs\" : [ { \"Options\" : { \"key\" : \"Options\" }, \"CACert\" : \"CACert\", \"Protocol\" : \"cfssl\", \"URL\" : \"URL\" }, { \"Options\" : { \"key\" : \"Options\" }, \"CACert\" : \"CACert\", \"Protocol\" : \"cfssl\", \"URL\" : \"URL\" } ], \"ForceRotate\" : 6, \"NodeCertExpiry\" : 7776000000000000, \"SigningCAKey\" : \"SigningCAKey\" }, \"Labels\" : { \"com.example.corp.type\" : \"production\", \"com.example.corp.department\" : \"engineering\" }, \"Raft\" : { \"SnapshotInterval\" : 10000, \"LogEntriesForSlowFollowers\" : 500, \"KeepOldSnapshots\" : 0, \"ElectionTick\" : 3, \"HeartbeatTick\" : 1 }, \"Dispatcher\" : { \"HeartbeatPeriod\" : 5000000000 }, \"TaskDefaults\" : { \"LogDriver\" : { \"Options\" : { \"max-file\" : \"10\", \"max-size\" : \"100m\" }, \"Name\" : \"json-file\" } }, \"EncryptionConfig\" : { \"AutoLockManagers\" : false }, \"Name\" : \"default\" }, \"UpdatedAt\" : \"2017-08-09T07:09:37.632105588Z\" }, \"ControlAvailable\" : true, \"LocalNodeState\" : \"active\", \"Nodes\" : 4, \"RemoteManagers\" : [ { \"NodeID\" : \"71izy0goik036k48jg985xnds\", \"Addr\" : \"10.0.0.158:2377\" }, { \"NodeID\" : \"79y6h1o4gv8n120drcprv5nmc\", \"Addr\" : \"10.0.0.159:2377\" }, { \"NodeID\" : \"k67qz4598weg5unwwffg6z1m1\", \"Addr\" : \"10.0.0.46:2377\" } ] }, \"RuncCommit\" : { \"Expected\" : \"2d41c047c83e09a6d61d464906feb2a2f3c52aa4\", \"ID\" : \"cfb82a876ecc11b5ca0977d1733adbe58599088a\" }, \"OSVersion\" : \"16.04\", \"Runtimes\" : { \"runc\" : { \"path\" : \"runc\" }, \"runc-master\" : { \"path\" : \"/go/bin/runc\" }, \"custom\" : { \"path\" : \"/usr/local/bin/my-oci-runtime\", \"runtimeArgs\" : [ \"--debug\", \"--systemd-cgroup=false\" ] } }, \"ID\" : \"7TRN:IPZB:QYBB:VPBQ:UMPP:KARE:6ZNR:XE6T:7EWV:PKF4:ZOJD:TPYS\", \"DriverStatus\" : [ [ \"Backing Filesystem\", \"extfs\" ], [ \"Supports d_type\", \"true\" ], [ \"Native Overlay Diff\", \"true\" ] ], \"BridgeNfIptables\" : true, \"LiveRestoreEnabled\" : false, \"SystemTime\" : \"2017-08-08T20:28:29.06202363Z\", \"NoProxy\" : \"*.local, 169.254/16\", \"Architecture\" : \"x86_64\", \"NEventsListener\" : 30, \"HttpsProxy\" : \"https://xxxxx:xxxxx@proxy.corp.example.com:4443\", \"Images\" : 508, \"ContainersRunning\" : 3, \"Labels\" : [ \"storage=ssd\", \"production\" ], \"InitCommit\" : { \"Expected\" : \"2d41c047c83e09a6d61d464906feb2a2f3c52aa4\", \"ID\" : \"cfb82a876ecc11b5ca0977d1733adbe58599088a\" }, \"NFd\" : 64, \"KernelVersion\" : \"4.9.38-moby\", \"LoggingDriver\" : \"LoggingDriver\", \"DefaultAddressPools\" : [ { \"Size\" : 24, \"Base\" : \"10.10.0.0/16\" }, { \"Size\" : 24, \"Base\" : \"10.10.0.0/16\" } ], \"OSType\" : \"linux\", \"SecurityOptions\" : [ \"name=apparmor\", \"name=seccomp,profile=default\", \"name=selinux\", \"name=userns\", \"name=rootless\" ], \"ContainerdCommit\" : { \"Expected\" : \"2d41c047c83e09a6d61d464906feb2a2f3c52aa4\", \"ID\" : \"cfb82a876ecc11b5ca0977d1733adbe58599088a\" }, \"GenericResources\" : [ { \"DiscreteResourceSpec\" : { \"Kind\" : \"SSD\", \"Value\" : 3 } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID1\" } }, { \"NamedResourceSpec\" : { \"Kind\" : \"GPU\", \"Value\" : \"UUID2\" } } ], \"KernelMemory\" : true, \"OperatingSystem\" : \"Alpine Linux v3.5\", \"RegistryConfig\" : { \"AllowNondistributableArtifactsCIDRs\" : [ \"::1/128\", \"127.0.0.0/8\" ], \"AllowNondistributableArtifactsHostnames\" : [ \"registry.internal.corp.example.com:3000\", \"[2001:db8:a0b:12f0::1]:443\" ], \"InsecureRegistryCIDRs\" : [ \"::1/128\", \"127.0.0.0/8\" ], \"IndexConfigs\" : { \"127.0.0.1:5000\" : { \"Name\" : \"127.0.0.1:5000\", \"Mirrors\" : [ ], \"Secure\" : false, \"Official\" : false }, \"[2001:db8:a0b:12f0::1]:80\" : { \"Name\" : \"[2001:db8:a0b:12f0::1]:80\", \"Mirrors\" : [ ], \"Secure\" : false, \"Official\" : false }, \"docker.io\" : { \"Name\" : \"docker.io\", \"Mirrors\" : [ \"https://hub-mirror.corp.example.com:5000/\" ], \"Secure\" : true, \"Official\" : true }, \"registry.internal.corp.example.com:3000\" : { \"Name\" : \"registry.internal.corp.example.com:3000\", \"Mirrors\" : [ ], \"Secure\" : false, \"Official\" : false } }, \"Mirrors\" : [ \"https://hub-mirror.corp.example.com:5000/\", \"https://[2001:db8:a0b:12f0::1]/\" ] }, \"ServerVersion\" : \"17.06.0-ce\", \"OomKillDisable\" : true, \"CpuCfsQuota\" : true, \"Containers\" : 14, \"Driver\" : \"overlay2\", \"IPv4Forwarding\" : true, \"ExperimentalBuild\" : true, \"ProductLicense\" : \"Community Engine\", \"ClusterStore\" : \"consul://consul.corp.example.com:8600/some/path\", \"DockerRootDir\" : \"/var/lib/docker\", \"CPUSet\" : true, \"CpuCfsPeriod\" : true, \"DefaultRuntime\" : \"runc\", \"ClusterAdvertise\" : \"node5.corp.example.com:8000\", \"CPUShares\" : true, \"Debug\" : true, \"NCPU\" : 4, \"Plugins\" : { \"Authorization\" : [ \"img-authz-plugin\", \"hbm\" ], \"Volume\" : [ \"local\" ], \"Log\" : [ \"awslogs\", \"fluentd\", \"gcplogs\", \"gelf\", \"journald\", \"json-file\", \"logentries\", \"splunk\", \"syslog\" ], \"Network\" : [ \"bridge\", \"host\", \"ipvlan\", \"macvlan\", \"null\", \"overlay\" ] }, \"SwapLimit\" : true, \"CgroupDriver\" : \"cgroupfs\", \"ContainersPaused\" : 1, \"MemTotal\" : 2095882240, \"IndexServerAddress\" : \"https://index.docker.io/v1/\", \"MemoryLimit\" : true, \"HttpProxy\" : \"http://xxxxx:xxxxx@proxy.corp.example.com:8080\", \"InitBinary\" : \"docker-init\", \"CgroupVersion\" : \"1\", \"PidsLimit\" : true, \"Isolation\" : \"default\", \"BridgeNfIp6tables\" : true, \"Warnings\" : [ \"WARNING: No memory limit support\", \"WARNING: bridge-nf-call-iptables is disabled\", \"WARNING: bridge-nf-call-ip6tables is disabled\" ], \"ContainersStopped\" : 10 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
