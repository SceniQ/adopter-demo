package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventLogRepository extends JpaRepository<EventLog, Long> {
}
