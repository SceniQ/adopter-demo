package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TransactionRepository extends JpaRepository<TransactionLog,Long> {
    /**
     * Retrieves a transaction log record
     *
     * @param mfsReferenceId text used to find unique transaction log
     * @return transaction log repository
     */
    Optional<TransactionLog> findByMfsReferenceId(String mfsReferenceId);
}
