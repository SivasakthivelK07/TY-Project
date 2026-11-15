package com.tyss.jspiders.controller;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.entity.BankAccount;
import com.tyss.jspiders.entity.Employee;
import com.tyss.jspiders.service.EmployeeService;
import com.tyss.jspiders.util.EmployeeUtils;

// Is used to focus on testing the web layer of an application, particularly controllers, without starting the full application context.
@WebMvcTest(EmployeeController.class)
class EmployeeControllerTest {

	@Autowired
	private MockMvc mockMvc;

	// Is used in test classes to create and inject mock instances of beans into the Spring application context.
	@MockBean
	private EmployeeService employeeService;

	@Test
	void saveEmployee() throws Exception {
		Employee employee = new Employee("1", "abc", "z", LocalDate.now(), 1000.0, new BankAccount());
		EmployeeDTO dto = EmployeeUtils.convert(employee);

		Mockito.when(employeeService.saveEmployee(dto)).thenReturn(employee.getEmployeeId());
		// .perform- Executes the request and sends it to the API.
		mockMvc.perform(MockMvcRequestBuilders.post("api/employee")
				// Sets the request content type to JSON	
				.contentType(MediaType.APPLICATION_JSON)
				// Provides the JSON payload for the request body.
				.content("{\r\n" + "  \"employeeId\": \"1\",\r\n" + "  \"firstname\": \"abc\",\r\n"
						+ "  \"lastname\": \"z\",\r\n"
						+ "  \"dateOfJoin\": \"2024-08-05\",  // Adjust this date to today's date\r\n"
						+ "  \"salary\": 1000.0,\r\n" + "  \"backAccount\": {\r\n"
						+ "    // Assuming BankAccountDTO has similar fields\r\n"
						+ "    \"accountNumber\": \"exampleNumber\", // Replace with actual value if available\r\n"
						+ "    \"accountType\": \"exampleType\"      // Replace with actual value if available\r\n"
						+ "  }\r\n" + "}"))
				// Verifies that the response status is 200 OK 
				.andExpect(MockMvcResultMatchers.status().isOk());

	}

}
