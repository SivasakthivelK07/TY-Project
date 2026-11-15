package com.tyss.jspiders.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tyss.jspiders.dto.BankAccountDTO;
import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.entity.Employee;
import com.tyss.jspiders.exceptionhandler.MyCustomException;
import com.tyss.jspiders.repository.EmployeeRepository;
import com.tyss.jspiders.util.EmployeeUtils;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService{
	private final EmployeeRepository employeeRepository;
	
	@Override
	public String saveEmployee(EmployeeDTO dto) {
		 
		Employee employee=EmployeeUtils.conver(dto);
		employee.setEmployeeId(UUID.randomUUID().toString());
		
		return employeeRepository.save(employee).getEmployeeId();
	}

	@Cacheable
	@Override
	public EmployeeDTO getEmployeeId(String employeeId) {
//		Employee employee = employeeRepository.findById(employeeId)
//		.orElseThrow(()->new RuntimeException("Data is available"));
		
//		EmployeeDTO dto= EmployeeUtils.convert(employee);
		
		System.out.println(employeeId);
		
		return EmployeeUtils.convert(employeeRepository.findById(employeeId)
				.orElseThrow(()->new MyCustomException("Data is available")));
	}

	@Override
	public boolean deleteEmployeeById(String employeeId) {
		
		employeeRepository.deleteById(employeeId);
//		boolean isEmpty = employeeRepository.findById(employeeId).isEmpty();
		return employeeRepository.findById(employeeId).isEmpty();
		
	}

	@Override
	public EmployeeDTO updateEmployee(String employeeId, EmployeeDTO dto) {
		// 1
		Employee employeeDB = employeeRepository.findById(employeeId)
		.orElseThrow(()->new RuntimeException("Data is available"));
		
		// 2
		employeeDB.setFirstname(dto.getFirstname());
		employeeDB.setLastname(dto.getLastname());
		employeeDB.setSalary(dto.getSalary());
		employeeDB.setDateOfJoin(dto.getDateOfJoin());
		BankAccountDTO backAccount = dto.getBackAccount();
		backAccount.setIfsc(dto.getBackAccount().getIfsc());
		
		// 3
//		Employee employee = employeeRepository.save(employeeDB);
		return EmployeeUtils.convert(employeeRepository.save(employeeDB));
	}

	@Override
	public List<EmployeeDTO> getAllEmployee() {
		List<EmployeeDTO> employee=new ArrayList<EmployeeDTO>();
		for (Employee employee2 : employeeRepository.findAll()) {
			employee.add(EmployeeUtils.convert(employee2));
		}
		
		return employee;
	}

	@Override
	public boolean deleteAllEmployee() {
		employeeRepository.deleteAll();
		return employeeRepository.findAll().isEmpty();  
	}

	
	
}
