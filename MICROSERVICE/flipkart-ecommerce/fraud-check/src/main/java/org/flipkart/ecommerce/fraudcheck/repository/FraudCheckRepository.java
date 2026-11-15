package org.flipkart.ecommerce.fraudcheck.repository;

import org.flipkart.ecommerce.fraudcheck.entity.FraudCheck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraudCheckRepository extends JpaRepository<FraudCheck, Integer> {
}
