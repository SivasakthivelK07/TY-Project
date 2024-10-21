package com.tyss.jspiders.sbs.repository;

import com.tyss.jspiders.sbs.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
