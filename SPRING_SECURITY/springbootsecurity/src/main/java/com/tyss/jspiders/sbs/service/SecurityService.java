package com.tyss.jspiders.sbs.service;

import com.tyss.jspiders.sbs.dto.EmployeeDTO;
import com.tyss.jspiders.sbs.dto.StudentDTO;
import com.tyss.jspiders.sbs.dto.TrainerDTO;

public interface SecurityService {

    String registerEmployee(EmployeeDTO employeeDTO);

    String registerStudent(StudentDTO studentDTO);

    String registerTrainer(TrainerDTO trainerDTO);
}
