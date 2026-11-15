package com.tyss.ems.repository;

import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.tyss.ems.entity.Employee;

@Repository
public class EmsRepositoryImpl implements EmsRepository {
	private EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU01");
	private EntityManager entityManager = entityManagerFactory.createEntityManager();

	@Override
	public Optional<Employee> getEmployee(String id) {
		return Optional.<Employee>ofNullable(entityManager.getReference(Employee.class, id));
	}

	@Override
	public String save(Employee employee) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();

		return employee.getId();
	}

}
