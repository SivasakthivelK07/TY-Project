package org.flipkart.ecommerce.customer.repository;

import org.flipkart.ecommerce.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
