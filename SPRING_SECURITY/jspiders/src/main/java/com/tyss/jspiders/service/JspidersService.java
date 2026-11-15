package com.tyss.jspiders.service;

import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.dto.StudentDTO;
import com.tyss.jspiders.dto.TrainerDTO;

public interface JspidersService {

    String registerEmployee(EmployeeDTO dto);

    String registerTrainer(TrainerDTO dto);

    String registerStudent(StudentDTO dto);

    
}
