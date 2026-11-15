package com.jspiders.sms;

import com.jspiders.sms.entity.Student;
import com.jspiders.sms.repository.StudentRepository;

public class InsertOperation {

	public static void main(String[] args) {
		StudentRepository repository=new StudentRepository();
		int id=repository.insertStudent(Student.builder()
				.firstname("fn01")
				.lastname("ln01")
				.address("Bangalore")
				.build());
		System.out.println("Student Id: "+id);
	}

}
