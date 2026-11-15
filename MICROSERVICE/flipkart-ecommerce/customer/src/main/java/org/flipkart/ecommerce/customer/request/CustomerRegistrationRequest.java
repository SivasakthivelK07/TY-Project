package org.flipkart.ecommerce.customer.request;

public record CustomerRegistrationRequest(
        String name,
        String email
) {
}
