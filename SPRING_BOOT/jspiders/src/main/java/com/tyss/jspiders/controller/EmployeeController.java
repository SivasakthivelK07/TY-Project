package com.tyss.jspiders.controller;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.jspiders.dto.BankAccountDTO;
import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.response.SuccessResponse;
import com.tyss.jspiders.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "api/employee")
@RestController
public class EmployeeController {

	private final EmployeeService employeeService;

	@GetMapping(path = "dummy")
	public ResponseEntity<SuccessResponse> dummy() {
//		SuccessResponse response = SuccessResponse.builder()
//				.message("Dummy message")
//				.status(HttpStatus.OK)
//				.timestamp(LocalDate.now())
//				.build();

		return ResponseEntity.<SuccessResponse>ofNullable(
				SuccessResponse.builder()
				.message("Dummy message")
				.dateOfJoin(LocalDate.of(2022, 4, 10))
				.status(HttpStatus.OK)
				.timestamp(LocalDate.now())
				.data(EmployeeDTO.builder()
						.backAccount(BankAccountDTO.builder().build())
						.build())
				.build());
	}

	@PostMapping(path = "")
	public ResponseEntity<SuccessResponse> saveEmployee(@RequestBody EmployeeDTO dto) {
		System.out.println(dto);

//		String id = employeeService.saveEmployee(dto);

		return ResponseEntity.<SuccessResponse>ofNullable(SuccessResponse.builder()
						.message("Employee is saved in the database")
						.status(HttpStatus.CREATED)
						.data(employeeService.saveEmployee(dto))
						.timestamp(LocalDate.now()).build());
	}
	
	@GetMapping(path = "")
	public ResponseEntity<SuccessResponse> getEmployeeId(@RequestParam(name="id" )String employeeId )  {
		
//		EmployeeDTO dto= employeeService.getEmployeeId(employeeId);
		
		return ResponseEntity.<SuccessResponse>ofNullable(SuccessResponse.builder()
						.message("Employee data is provided")
						.status(HttpStatus.FOUND)
						.data(employeeService.getEmployeeId(employeeId))
						.timestamp(LocalDate.now()).build());
	}
	
	@DeleteMapping(path = "{id}")
	public ResponseEntity<SuccessResponse> deleteEmployeeById(@PathVariable(name="id" )String employeeId )  {
		
//		boolean isDeleted=employeeService.deleteEmployeeById(employeeId);
		
		return ResponseEntity.<SuccessResponse>ofNullable(SuccessResponse.builder()
						.message("Employee details id deteled")
						.status(HttpStatus.OK)
						.data(employeeService.deleteEmployeeById(employeeId))
						.timestamp(LocalDate.now()).build());
	}
	
	@PutMapping(path = "")
	public ResponseEntity<SuccessResponse> updateEmployee(
			@RequestParam(name="id" )String employeeId,
			@RequestBody EmployeeDTO dto
	){
		
//		EmployeeDTO updateDTO= employeeService.updateEmployee(employeeId,dto);
		
		return ResponseEntity.<SuccessResponse>ofNullable(SuccessResponse.builder()
						.message("Employee details Updated")
						.status(HttpStatus.OK)
						.data(employeeService.updateEmployee(employeeId,dto))
						.timestamp(LocalDate.now()).build());
	}
	
	@GetMapping(path = "getallemployee")
	public ResponseEntity<SuccessResponse> getAllEmployee() {
		
//		List<EmployeeDTO>employee=employeeService.getAllEmployee();
		
		return ResponseEntity.<SuccessResponse>ofNullable(SuccessResponse.builder()
					.message("All employee details display")
					.status(HttpStatus.FOUND)
					.data(employeeService.getAllEmployee())
					.timestamp(LocalDate.now())
					.build());
	}
	
	@DeleteMapping(path = "deleteallemployee")
	public ResponseEntity<SuccessResponse> deleteAllEmployee() {
		
		return ResponseEntity.<SuccessResponse>ofNullable(SuccessResponse.builder()
					.message("All employee details deleted")
					.status(HttpStatus.OK)
					.data(employeeService.deleteAllEmployee())
					.timestamp(LocalDate.now())
					.build());
	}
}
