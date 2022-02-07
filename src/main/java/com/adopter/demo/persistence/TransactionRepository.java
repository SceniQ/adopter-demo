package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.TransactionLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<TransactionLog,Long> {
}
