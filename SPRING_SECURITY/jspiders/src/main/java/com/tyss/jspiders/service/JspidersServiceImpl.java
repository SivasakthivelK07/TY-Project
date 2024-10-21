package com.tyss.jspiders.service;

import com.tyss.jspiders.dto.EmployeeDTO;
import com.tyss.jspiders.dto.StudentDTO;
import com.tyss.jspiders.dto.TrainerDTO;
import com.tyss.jspiders.entity.*;
import com.tyss.jspiders.exception.RoleDoesNotExistException;
import com.tyss.jspiders.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class JspidersServiceImpl implements JspidersService {

    private final EmployeeRepository employeeRepository;
    private final AppUserRepository appUserRepository;
    private final RoleRepository roleRepository;
    private final TrainerRepository trainerRepository;
    private final StudentRepository studentRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public String registerEmployee(EmployeeDTO dto) {
        Employee employee = Employee.builder()
                .employeeId(dto.getEmployeeId())
                .employeeName(passwordEncoder.encode(dto.getName()))
                .build();
        employeeRepository.save(employee);


        Role role = roleRepository.findByName("ROLE_EMPLOYEE")
                .orElseThrow(() -> new RoleDoesNotExistException("Role is not exist"));
        List<Role> roles = new ArrayList<>();
        roles.add(role);

        AppUser appUser = AppUser.builder()
                .username(dto.getName())
                .password(dto.getPassword())
                .roles(roles)
                .build();

        role.getAppUsers().add(appUser);

        appUserRepository.save(appUser);

        return employee.getEmployeeId();
    }

    @Override
    public String registerTrainer(TrainerDTO dto) {
        Trainer trainer = Trainer.builder()
                .trainerId(dto.getTrainerId())
                .trainerName(passwordEncoder.encode(dto.getTrainerName()))
                .build();
        trainerRepository.save(trainer);

        Role role = roleRepository.findByName("ROLE_TRAINER")
                .orElseThrow(() -> new RoleDoesNotExistException("Role is not exist"));
        List<Role> roles = new ArrayList<>();
        roles.add(role);

        AppUser appUser = AppUser.builder()
                .username(dto.getTrainerName())
                .password(dto.getPassword())
                .roles(roles)
                .build();

        role.getAppUsers().add(appUser);

        appUserRepository.save(appUser);
        return trainer.getTrainerId();
    }

    @Override
    public String registerStudent(StudentDTO dto) {
        Student student = Student.builder()
                .studentId(dto.getStudentId())
                .name(passwordEncoder.encode(dto.getName()))
                .build();
        studentRepository.save(student);

        Role role = roleRepository.findByName("ROLE_STUDENT").orElseThrow(() -> new RoleDoesNotExistException("Role is not exist"));
        List<Role> roles = new ArrayList<>();
        roles.add(role);

        AppUser appUser = AppUser.builder()
                .username(dto.getName())
                .password(dto.getPassword())
                .roles(roles)
                .build();

        role.getAppUsers().add(appUser);

        appUserRepository.save(appUser);

        return student.getStudentId();
    }

}
