package com.tyss.qspiders.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tyss.qspiders.entity.Address;
import com.tyss.qspiders.entity.AddressType;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	@Modifying
	@Query(value = "UPDATE Address a SET a.city = :city, a.state = :state, a.country = :country WHERE a.employees.employeeId = :employeeId AND a.addressType= :addressType ")
	int updateAddressByEmployeeIdAndAdressType(
			@Param("employeeId") String employeeId, 
			@Param("city") String city,
			@Param("state") String state,
			@Param("country") String country,
			@Param("addressType") AddressType addressType
	);

	@Modifying
	@Query(value = "DELETE FROM Address a WHERE a.employees.employeeId = :employeeId ")
	void deleteAddress(@Param("employeeId") String employeeId);
	
	

}
