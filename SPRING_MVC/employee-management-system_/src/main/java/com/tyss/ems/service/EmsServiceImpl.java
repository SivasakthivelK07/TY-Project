package com.tyss.ems.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.ems.dto.EmployeeRegisterDTO;
import com.tyss.ems.entity.Employee;
import com.tyss.ems.repository.EmsRepository;

@Service
public class EmsServiceImpl implements EmsService {

	@Autowired
	private EmsRepository emsRepository;

	@Override
	public Boolean checkCredentials(String id, String password) {
		Optional<Employee> optional = emsRepository.getEmployee(id);
		if (optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee);
			return employee.getPassword().equals(password);
		}
		return true;
	}

	@Override
	public String register(EmployeeRegisterDTO dto) {
		// 1
		Employee employee1 = Employee.builder().id(dto.getId()).age(dto.getAge()).email(dto.getEmail())
				.password(dto.getPassword()).build();
		// or
		// 2
		Employee employee = new Employee();
		BeanUtils.copyProperties(dto, employee);

		return emsRepository.save(employee);
	}

	@Override
	public Boolean changePassword(String id, String password, String changePassword) {
		Optional<Employee> optional = emsRepository.getEmployee(id);
		if (optional.isPresent()) {
			Employee employee = optional.get();
			System.out.println(employee.getPassword());
			if (employee.getPassword().equals(password)) {
				employee.setPassword(changePassword);
				emsRepository.save(employee);
				return true;
			}

		}

		return null;
	}

}
