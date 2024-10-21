package com.tyss.jspiders.controller;

import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.dto.LoginDTO;
import com.tyss.jspiders.dto.StudentDTO;
import com.tyss.jspiders.dto.TrainerDTO;
import com.tyss.jspiders.jwt.JwtUtils;
import com.tyss.jspiders.response.SuccessResponse;
import com.tyss.jspiders.service.JspidersService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/auth")
@RestController
public class JspidersController {

    private final JspidersService jspidersService;
    private final JwtUtils jwtUtils;
    private final AuthenticationManager authenticationManager;

    @PostMapping(path = "register/employee")
    public ResponseEntity<SuccessResponse> registerEmployee(@RequestBody EmployeeDTO dto) {

        String id = jspidersService.registerEmployee(dto);

        return ResponseEntity.of(Optional.ofNullable(SuccessResponse.builder()
                .message("Register successful")
                .data(id)
                .status(HttpStatus.OK)
                .timestamp(LocalDateTime.now())
                .build()));
    }

    @PostMapping(path = "register/trainer")
    public ResponseEntity<SuccessResponse> registerTrainer(@RequestBody TrainerDTO dto) {

        String id = jspidersService.registerTrainer(dto);

        return ResponseEntity.of(Optional.ofNullable(SuccessResponse.builder()
                .message("Register successful")
                .data(id)
                .status(HttpStatus.OK)
                .timestamp(LocalDateTime.now())
                .build()));
    }

    @PostMapping(path = "register/student")
    public ResponseEntity<SuccessResponse> registerStudent(@RequestBody StudentDTO dto) {
        String id = jspidersService.registerStudent(dto);

        return ResponseEntity.of(Optional.ofNullable(SuccessResponse.builder()
                .message("Register successful")
                .data(id)
                .status(HttpStatus.OK)
                .timestamp(LocalDateTime.now())
                .build()));
    }

    @PostMapping(path = "/login")
    public ResponseEntity<SuccessResponse> login(@RequestBody LoginDTO dto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(dto.getUserName(), dto.getPassword())
        );

        String token = jwtUtils.generateToken(dto.getUserName());

        return ResponseEntity.of(Optional.of(SuccessResponse.builder()
                .message("Login successful")
                .data(true)
                .token(token)
                .status(HttpStatus.OK)
                .timestamp(LocalDateTime.now())
                .build()));
    }
}
