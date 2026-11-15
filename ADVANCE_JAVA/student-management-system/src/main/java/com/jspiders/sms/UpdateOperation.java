package com.jspiders.sms;

import com.jspiders.sms.dto.StudentDTO;
import com.jspiders.sms.entity.Student;
import com.jspiders.sms.repository.StudentRepository;

public class UpdateOperation {

	public static void main(String[] args) {
		StudentRepository repository=new StudentRepository();
		Student student=repository.updateStudent(StudentDTO.builder()
				.firstname("FN01")
				.address("Basvanagudi")
				.lastname("LN01")
				.build(), 1);
		System.out.println("Update Student details: "+student);
		
	}

}
