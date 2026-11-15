package org.flipkart.ecommerce.fraudcheck.controller;

import lombok.RequiredArgsConstructor;
import org.flipkart.ecommerce.fraudcheck.service.FraudcheckService;
import org.flipkart.ecommerce.reponse.SuccessResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RequestMapping(path = "api/v2/fraud")
@RestController
public class FraudCheckController {

    private final FraudcheckService fraudcheckService;

    @GetMapping(path = "")
    public SuccessResponse checkFraudlaunt(
            @RequestParam(name = "customer_id") String customerId,
            @RequestParam(name = "email") String email) {

        Boolean isFraud = fraudcheckService.checkFraudlaunt(customerId, email);

        return SuccessResponse.builder()
                .message("Customer is not fraudlent")
                .data(isFraud)
                .status(HttpStatus.OK)
                .time(LocalDateTime.now())
                .build();
    }
}
