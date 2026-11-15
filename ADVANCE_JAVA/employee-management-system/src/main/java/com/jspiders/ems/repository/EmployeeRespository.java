package com.jspiders.ems.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.ems.dto.EmployeeDTO;
import com.jspiders.ems.entiry.Employee;

public class EmployeeRespository {

	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MySQL_01");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	public Integer insert(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee.getId();
	}

	public Employee getEmployee(int id) {

		return entityManager.find(Employee.class, id);
	}

	public Employee updateEmployee(EmployeeDTO dto, int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		Employee employeeFormDB=entityManager.find(Employee.class, id);
		employeeFormDB.setEmail(dto.getEmail());
		employeeFormDB.setFirstname(dto.getFirstname());
		employeeFormDB.setLastname(dto.getLastname());
		
		entityManager.persist(employeeFormDB);
		entityTransaction.commit();
		
		return employeeFormDB;
	}

	public boolean deleteEmployee(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Employee.class, id));
		entityTransaction.commit();
		
		return true;
	}

}
