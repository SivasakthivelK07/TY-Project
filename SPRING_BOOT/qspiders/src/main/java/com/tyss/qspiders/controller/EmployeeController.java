package com.tyss.qspiders.controller;

import static com.tyss.qspiders.constant.EmployeeConstant.DATA_DELETE;
import static com.tyss.qspiders.constant.EmployeeConstant.DATA_SAVED;
import static com.tyss.qspiders.constant.EmployeeConstant.DATA_UPDATE;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.qspiders.dto.AddressDTO;
import com.tyss.qspiders.dto.BankAccountDTO;
import com.tyss.qspiders.dto.EmployeeDTO;
import com.tyss.qspiders.dto.TechnologyDTO;
import com.tyss.qspiders.entity.AddressType;
import com.tyss.qspiders.response.SuccessResponse;
import com.tyss.qspiders.service.EmployeeService;

//@RequiredArgsConstructor
@RequestMapping(path = "api/employee")
@RestController
public record EmployeeController(EmployeeService employeeService) {
	//CRUD
	
//	private final EmployeeService employeeService;
	
	@GetMapping(path = "dummy")
	public Object dummy() {
		return EmployeeDTO.builder()
				.dateOfJoin(LocalDate.now())
				.backAccount(BankAccountDTO.builder().build())
				.addresses(List.<AddressDTO>of(AddressDTO.builder()
						.addressType(AddressType.PERMENENT).build()))
				.technologies(List.<TechnologyDTO>of(TechnologyDTO.builder().build()))
				.build();
	}
	
	@PostMapping(path = "")
	public ResponseEntity<SuccessResponse> createEmployee(@RequestBody EmployeeDTO dto){
		
		String saveId=employeeService.createEmployee(dto);
		
		return ResponseEntity.<SuccessResponse>ofNullable(
						SuccessResponse.builder()
				
//						.message(EmployeeConstant.DATA_SAVED)
						.message(DATA_SAVED)
						.status(HttpStatus.CREATED)
						.data(saveId)
						.timestamp(LocalDate.now())
						.build()
						);
		
	}
	
	@PutMapping(path = "")
	public ResponseEntity<SuccessResponse> updateEmployee(
			@RequestParam(name = "id") String employeeId, 
			@RequestBody EmployeeDTO dto){
		EmployeeDTO employeeDTO=employeeService.updateEmployee(employeeId, dto);
		
		return ResponseEntity.<SuccessResponse>ofNullable(
				SuccessResponse.builder()
				.message(DATA_UPDATE)
				.status(HttpStatus.OK)
				.data(employeeDTO)
				.timestamp(LocalDate.now())
				.build()
				);
	}
	
	@DeleteMapping(path = "")
	public ResponseEntity<SuccessResponse> deleteEmployee(
			@RequestParam(name = "id") String employeeId, 
			@RequestParam(name = "table") String tableName){
		boolean isDeleted=employeeService.deleteAddressByAddressType(employeeId, tableName);
		
		return ResponseEntity.<SuccessResponse>ofNullable(
				SuccessResponse.builder()
				.message(DATA_DELETE)
				.status(HttpStatus.OK)
				.data(isDeleted)
				.timestamp(LocalDate.now())
				.build()
				);
	}
}
