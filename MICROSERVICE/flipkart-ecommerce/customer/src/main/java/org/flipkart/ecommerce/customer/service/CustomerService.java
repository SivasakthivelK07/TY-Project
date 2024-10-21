package org.flipkart.ecommerce.customer.service;

import org.flipkart.ecommerce.customer.entity.Customer;
import org.flipkart.ecommerce.customer.repository.CustomerRepository;
import org.flipkart.ecommerce.customer.request.CustomerRegistrationRequest;
import org.flipkart.ecommerce.reponse.SuccessResponse;
import org.flipkart.ecommerce.reponse.fraudcheck.FraudCheckClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public record CustomerService(
        CustomerRepository customerRepository,
        RestTemplate restTemplate,
        FraudCheckClient fraudCheckClient
) {

    public Integer registerCustomer(CustomerRegistrationRequest request) {

        String email= request.email();
        String id=1+"";
//        SuccessResponse successResponse = restTemplate.getForObject(
////                "http://localhost:8082/api/v2/fraud?customer_id=1&email=fn01@gmail.com",
//                "http://FRAUD-CHECK-APPLICATION/api/v2/fraud?customer_id=1&email={email}",
//                SuccessResponse.class,email);

        SuccessResponse successResponse = fraudCheckClient.checkFraudlaunt(id, email);

        if ((Boolean) successResponse.getData()) {
            throw new RuntimeException("Customer is fraudulent");
        }

        return customerRepository.save(Customer.builder()
                .name(request.name())
                .email(request.email())
                .build()).getCustomerId();
    }
}
