package com.tyss.qspiders.service;

import static com.tyss.qspiders.util.EmployeeUtil.convertEmployee;

import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tyss.qspiders.dto.EmployeeDTO;
import com.tyss.qspiders.dto.TechnologyDTO;
import com.tyss.qspiders.entity.BankAccount;
import com.tyss.qspiders.entity.Employee;
import com.tyss.qspiders.entity.Technology;
import com.tyss.qspiders.repository.AddressRepository;
import com.tyss.qspiders.repository.BankAccountRepository;
import com.tyss.qspiders.repository.EmployeeRepository;
import com.tyss.qspiders.repository.TechnologyRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final BankAccountRepository bankAccountRepository;
	private final AddressRepository addressRepository;
	private final TechnologyRepository technologyRepository;

	@Override
	public String createEmployee(EmployeeDTO dto) {
//		Employee employee = EmployeeUtil.convertEmployee(dto);

		Employee employee = convertEmployee(dto);
		employee.setEmployeeId(UUID.randomUUID().toString());
		// Get technology from the DTO
		for (TechnologyDTO tdto : dto.getTechnologies()) {
			// Search the technology by the name in the database
			Technology tdb = technologyRepository.findByName(tdto.getName())
					.orElseThrow(() -> new RuntimeException("Technology not found"));
			// If technology present in the database set employee with the database
			// technology and via-versa
			tdb.getEmployees().add(employee);
			employee.getTechnologies().add(tdb);

		}
		return employeeRepository.save(employee).getEmployeeId();
	}

	@Transactional
	@Override
	public EmployeeDTO updateEmployee(String employeeId, EmployeeDTO dto) {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new RuntimeException("Employee is not exist"));
		
		employeeRepository.updateEmployee(employeeId, dto.getFirstname(), dto.getLastname(), dto.getDateOfJoin(),
				dto.getSalary());
		
		bankAccountRepository.updateBankAccountByEmployeeId(employee.getBackAccount().getAccountno(),
				dto.getBackAccount().getIfsc());

//		for (AddressDTO addressDTO : dto.getAddresses()) {
//			addressRepository.updateAddressByEmployeeIdAndAdressType(employeeId, addressDTO.getCity(),
//					addressDTO.getState(), addressDTO.getCountry(), addressDTO.getAddressType());
//		}
		
		dto.getAddresses().forEach((addressDTO)->
		addressRepository.updateAddressByEmployeeIdAndAdressType(employeeId, addressDTO.getCity(),
				addressDTO.getState(), addressDTO.getCountry(), addressDTO.getAddressType()));
		
		employee.setTechnologies(new ArrayList<Technology>());

		for (TechnologyDTO technologyDTO : dto.getTechnologies()) {
			Technology technology = technologyRepository.findByName(technologyDTO.getName())
				.orElseThrow(()->new RuntimeException("Technology not available in that database "));
			employee.getTechnologies().add(technology);
		}
//		employeeRepository.save(employee);
		return dto;
	}

	@Transactional
	@Override
	public boolean deleteAddressByAddressType(String employeeId, String tableName) {
		Employee employee = employeeRepository.findById(employeeId)
				.orElseThrow(() -> new RuntimeException("Employee is not exist"));
		
		if (tableName.equalsIgnoreCase("address")) {
			employee.getAddress().clear();
			addressRepository.deleteAddress(employeeId);
			
			employeeRepository.save(employee);
			return true;

		} else if(tableName.equalsIgnoreCase("bankaccount")) {
			
			BankAccount backAccount = employee.getBackAccount();
			if(backAccount !=null) {
				employee.setBackAccount(null);
				employeeRepository.save(employee);
				bankAccountRepository.deleteBankAccount(backAccount);
			}
			return true;
		}
//		else {
//			technologyRepository.deleteTechnology();
//		}
//		
		return true;
	}

}
