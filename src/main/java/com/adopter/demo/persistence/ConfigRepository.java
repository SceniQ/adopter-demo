package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.SystemConfig;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConfigRepository extends JpaRepository<SystemConfig, SystemConfig.SystemConfigId> {
}
