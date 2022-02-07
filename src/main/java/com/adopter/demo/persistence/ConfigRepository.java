package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.SystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ConfigRepository extends JpaRepository<SystemConfig, SystemConfig.SystemConfigId> {
    /**
     * Retrieves system config record
     *
     * @param configKey text used to find the unique system config value
     * @return system config record
     */
    Optional<SystemConfig> findByConfigKey(String configKey);
}
