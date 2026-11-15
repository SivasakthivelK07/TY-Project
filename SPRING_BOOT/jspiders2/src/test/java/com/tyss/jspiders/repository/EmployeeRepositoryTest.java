package com.tyss.jspiders.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.tyss.jspiders.entity.BankAccount;
import com.tyss.jspiders.entity.Employee;

// Is used for testing JPA repositories and other data-related components.
@DataJpaTest

// It provides control over how the test database is configured and managed during testing.
@AutoConfigureTestDatabase(replace = Replace.NONE)
class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository employeeRepository;

	@BeforeEach
	void setup() {
		Employee employee = new Employee("1", "abc", "z", LocalDate.now(), 1000.0, new BankAccount());
		employeeRepository.save(employee);

	}

	@Test
	void findById() {
		Optional<Employee> optionalEmployee = employeeRepository.findById("1");
		assertTrue(optionalEmployee.isPresent());
		Employee employee = optionalEmployee.get();
		assertEquals("abc", employee.getFirstname());
	}

}
