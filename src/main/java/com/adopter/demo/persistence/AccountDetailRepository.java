package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDetailRepository extends JpaRepository<AccountDetail,Long> {
}
