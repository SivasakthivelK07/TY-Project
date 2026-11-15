package com.tyss.jspiders.sbs.controller;

import com.tyss.jspiders.sbs.dto.EmployeeDTO;
import com.tyss.jspiders.sbs.dto.StudentDTO;
import com.tyss.jspiders.sbs.dto.TrainerDTO;
import com.tyss.jspiders.sbs.response.SuccessResponse;
import com.tyss.jspiders.sbs.service.SecurityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@RequiredArgsConstructor
@RequestMapping(path = "api/security")
@RestController
public class SecurityController {

    private final SecurityService securityService;

    @PostMapping(path = "register/employee")
    public ResponseEntity<SuccessResponse> registerEmployee(@RequestBody EmployeeDTO employeeDTO){

        String id=securityService.registerEmployee(employeeDTO);

        return ResponseEntity.of(Optional.of(SuccessResponse.builder()
                        .message("Register Successfully")
                        .data(id)
                        .status(HttpStatus.CREATED)
                        .time(LocalDateTime.now())
                        .build()));
    }

    @PostMapping(path = "register/student")
    public ResponseEntity<SuccessResponse> registerStudent(@RequestBody StudentDTO studentDTO){

        String id=securityService.registerStudent(studentDTO);

        return ResponseEntity.of(Optional.of(SuccessResponse.builder()
                .message("Register Successfully")
                .data(id)
                .status(HttpStatus.CREATED)
                .time(LocalDateTime.now())
                .build()));
    }

    @PostMapping(path = "register/trainer")
    public ResponseEntity<SuccessResponse> registerTrainer(@RequestBody TrainerDTO trainerDTO){

        String id=securityService.registerTrainer(trainerDTO);

        return ResponseEntity.of(Optional.of(SuccessResponse.builder()
                .message("Register Successfully")
                .data(id)
                .status(HttpStatus.CREATED)
                .time(LocalDateTime.now())
                .build()));
    }


}
