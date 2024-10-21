package com.jspiders.sms;

import com.jspiders.sms.repository.StudentRepository;

public class DeleteOperation {

	public static void main(String[] args) {
		StudentRepository repository=new StudentRepository();
		boolean isPresent=repository.deleteStudent(1);
		System.out.println("is presenct? " +isPresent);
	}

}
