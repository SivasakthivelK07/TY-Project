package com.jspiders.sms;

import com.jspiders.sms.entity.Student;
import com.jspiders.sms.repository.StudentRepository;

public class SearchOperation {

	public static void main(String[] args) {
		StudentRepository repository=new StudentRepository();
		Student student=repository.searchStudent(1);
		System.out.println("Student details: "+student);
	}

}
