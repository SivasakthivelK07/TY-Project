package com.amazon.ecommerce.customer.controller;

import com.amazon.ecommerce.client.response.SuccessResponse;
import com.amazon.ecommerce.customer.request.CustomerRegistrationRequest;
import com.amazon.ecommerce.customer.service.CustomerService;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RequiredArgsConstructor
@RequestMapping(path = "api/v1/customer")
@RestController
public class CustomerController {

    private final CustomerService customerService;
    int count = 1;
    // @CircuitBreaker(name = "registerCustomerR4j", fallbackMethod = "registerCustomerFallback")
    // @Retry(name = "registerCustomerR4j", fallbackMethod = "registerCustomerFallback")
    @RateLimiter(name = "registerCustomerR4j", fallbackMethod = "registerCustomerFallback")
    @PostMapping(path = "")
    public SuccessResponse registerCustomer(@RequestBody CustomerRegistrationRequest request) {
        System.out.println(count++);
        Integer id = customerService.registerCustomer(request);
        return SuccessResponse.builder()
                .message("Customer registered")
                .status(HttpStatus.CREATED)
                .data(id)
                .timestamp(LocalDateTime.now())
                .build();
    }

    public SuccessResponse registerCustomerFallback(CustomerRegistrationRequest request, Exception exception) {
        return SuccessResponse.builder()
                .message("Customer registration could not complete, because some service(s) are down")
                .status(HttpStatus.OK)
                .data(exception.getMessage())
                .timestamp(LocalDateTime.now())
                .build();
    }
}
