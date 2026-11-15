package org.flipkart.ecommerce.customer.controller;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import org.flipkart.ecommerce.customer.request.CustomerRegistrationRequest;
import org.flipkart.ecommerce.customer.service.CustomerService;
import org.flipkart.ecommerce.reponse.SuccessResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RequestMapping(path = "api/v2/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    @CircuitBreaker(name = "registerCustomerR4j", fallbackMethod = "registerCustomerFallbackMethod")
    @PostMapping(path = "")
    public SuccessResponse registerCustomer(@RequestBody CustomerRegistrationRequest request){

        Integer id=customerService.registerCustomer(request);

        return SuccessResponse.builder()
                .message("Registration is successfully")
                .status(HttpStatus.CREATED)
                .data(id)
                .time(LocalDateTime.now())
                .build();
    }

    public SuccessResponse registerCustomerFallbackMethod(
            @RequestBody CustomerRegistrationRequest request,
            Exception exception){

        return SuccessResponse.builder()
                .message("Registration is successfully")
                .status(HttpStatus.CREATED)
                .data(exception.getMessage())
                .time(LocalDateTime.now())
                .build();
    }

}
