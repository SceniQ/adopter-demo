package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.EventLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EventLogRepository extends JpaRepository<EventLog, Long> {
    /**
     * Retrieves an event log record using the mfs reference id
     *
      * @param mfsReferenceId text used to find the unique log record
     * @return an event log record
     */
    Optional<EventLog> findByMfsReferenceId(String mfsReferenceId);
}
