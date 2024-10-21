package org.flipkart.ecommerce.fraudcheck.service;

import org.flipkart.ecommerce.fraudcheck.entity.FraudCheck;
import org.flipkart.ecommerce.fraudcheck.repository.FraudCheckRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public record FraudcheckService(FraudCheckRepository fraudCheckRepository) {

    public Boolean checkFraudlaunt(String id, String email) {

        fraudCheckRepository.save(FraudCheck.builder()
                .customerId(Integer.parseInt(id))
                .email(email)
                .isFraudlent(false)
                .time(LocalDateTime.now())
                .build());
        return false;
    }
}
