package com.jspiders.sms.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.sms.dto.StudentDTO;
import com.jspiders.sms.entity.Student;

public class StudentRepository {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MySQL_01");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public int insertStudent(Student student) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

		return student.getId();
	}

	public Student searchStudent(int id) {

		return entityManager.find(Student.class, id);
	}

	public Student updateStudent(StudentDTO dto,int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		
		Student studentDB=entityManager.find(Student.class, id);
		studentDB.setFirstname(dto.getFirstname());
		studentDB.setAddress(dto.getAddress());
		studentDB.setLastname(dto.getLastname());
		
		entityManager.persist(studentDB);
		entityTransaction.commit();
		
		return studentDB;
	}

	public boolean deleteStudent(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(entityManager.find(Student.class, id));
		entityTransaction.commit();
		return true;
	}

	
}
