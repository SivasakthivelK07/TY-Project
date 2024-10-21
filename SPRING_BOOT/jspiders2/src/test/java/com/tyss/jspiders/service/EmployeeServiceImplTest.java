package com.tyss.jspiders.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.entity.BankAccount;
import com.tyss.jspiders.entity.Employee;
import com.tyss.jspiders.repository.EmployeeRepository;
import com.tyss.jspiders.util.EmployeeUtils;

class EmployeeServiceImplTest {
	// Use @InjectMocks to create the service instance and inject mocks.
	@InjectMocks
	private EmployeeServiceImpl employeeService;

	// The @Mock annotation in Mockito is used to create mock(dummy) objects for testing
	// purposes.
	@Mock
	private EmployeeRepository employeeRepository;

	@BeforeEach 
	void setup() {
		// Initialize the mocks before each test to ensure that Mockito annotations are
		// processed.
		MockitoAnnotations.openMocks(this);
		Employee employee = new Employee("1", "abc", "z", LocalDate.now(), 1000.0, new BankAccount());

		/*
		 * .when - It specifies what should happen when a particular method is called on
		 * the mock.
		 */
		/*
		 * .thenReturn - To specify what the mock should return when the method is
		 * called.
		 */
		Mockito.when(employeeRepository.findById("1")).thenReturn(Optional.of(employee));
	}

	@Test
	void getEmployeeId() {
		// Expected DTO based on the mock setup
		Employee employee = new Employee("1", "abc", "z", LocalDate.now(), 1000.0, new BankAccount());
		EmployeeDTO expectedDTO = EmployeeUtils.convert(employee);

		EmployeeDTO actualDTO = employeeService.getEmployeeId("1");

		assertEquals(expectedDTO.getFirstname(), actualDTO.getFirstname());
	}
}
