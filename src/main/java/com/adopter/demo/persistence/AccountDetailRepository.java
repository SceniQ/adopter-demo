package com.adopter.demo.persistence;

import com.adopter.demo.persistence.model.AccountDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AccountDetailRepository extends JpaRepository<AccountDetail,Long> {
    /**
     * Retrieves account detail using the phone number
     *
     * @param phoneNumber is the text used to find a unique account detail
     * @return an account detail
     */
    Optional<AccountDetail> findByPhoneNumber(String phoneNumber);

    /**
     * Retrieves account details based on country code
     *
     * @param countryCode text used to find the list of account details
     * @return a list of account details
     */
    List<AccountDetail> findByCountryCodeOrderByCustomerName(String countryCode);
}
