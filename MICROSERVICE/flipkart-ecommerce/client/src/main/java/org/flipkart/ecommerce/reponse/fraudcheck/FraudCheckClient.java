package org.flipkart.ecommerce.reponse.fraudcheck;

import org.flipkart.ecommerce.reponse.SuccessResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        value = "fraud-check-application",
        path = "api/v2/fraud"
)
public interface FraudCheckClient {
    @GetMapping(path = "")
    public SuccessResponse checkFraudlaunt(
            @RequestParam(name = "customer_id") String customerId,
            @RequestParam(name = "email") String email);
}
