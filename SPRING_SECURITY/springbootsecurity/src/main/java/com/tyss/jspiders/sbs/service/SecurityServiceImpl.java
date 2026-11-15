package com.tyss.jspiders.sbs.service;

import com.tyss.jspiders.sbs.dto.EmployeeDTO;
import com.tyss.jspiders.sbs.dto.StudentDTO;
import com.tyss.jspiders.sbs.dto.TrainerDTO;
import com.tyss.jspiders.sbs.entity.*;
import com.tyss.jspiders.sbs.exception.RoleDoesNotExistException;
import com.tyss.jspiders.sbs.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class SecurityServiceImpl implements SecurityService{

    private final EmployeeRepository employeeRepository;
    private final StudentRepository studentRepository;
    private final TrainerRepository trainerRepository;
    private final RoleRepository roleRepository;
    private final AppUserRepository appUserRepository;

    @Override
    public String registerEmployee(EmployeeDTO dto) {
        Employee employee = Employee.builder()
                .emplogeeId(dto.getEmployeeId())
                .employeeName(dto.getEmployeeName())
                .build();

        Role role = roleRepository.findByRoleName("ROLE_EMPLOYEE")
                .orElseThrow(() -> new RoleDoesNotExistException("Role Does not exist"));
        List<Role> roles=new ArrayList<>();
        roles.add(role);

        AppUser appUser = AppUser.builder()
                .username(dto.getEmployeeId())
                .password(dto.getPassword())
                .roles(roles)
                .build();

        role.getAppUsers().add(appUser);

        employeeRepository.save(employee);
        appUserRepository.save(appUser);
        return employee.getEmplogeeId();
    }

    @Override
    public String registerStudent(StudentDTO dto) {
        Student student = Student.builder()
                .studentId(dto.getStudentId())
                .studentName(dto.getStudentName())
                .build();

        Role role = roleRepository.findByRoleName("ROLE_STUDENT")
                .orElseThrow(() -> new RoleDoesNotExistException("Role Does not exist"));
        List<Role> roles=new ArrayList<>();
        roles.add(role);

        AppUser appUser = AppUser.builder()
                .username(student.getStudentId())
                .password(dto.getPassword())
                .roles(roles)
                .build();
        role.getAppUsers().add(appUser);

        studentRepository.save(student);
        appUserRepository.save(appUser);
        return student.getStudentId();
    }

    @Override
    public String registerTrainer(TrainerDTO dto) {
        Trainer trainer = Trainer.builder()
                .trainerId(dto.getTrainerId())
                .trainerName(dto.getTrainerName())
                .build();

        Role role = roleRepository.findByRoleName("ROLE_STUDENT")
                .orElseThrow(() -> new RoleDoesNotExistException("Role Does not exist"));
        List<Role> roles=new ArrayList<>();
        roles.add(role);

        AppUser appUser = AppUser.builder()
                .username(trainer.getTrainerId())
                .password(dto.getPassword())
                .roles(roles)
                .build();

        role.getAppUsers().add(appUser);
        trainerRepository.save(trainer);
        appUserRepository.save(appUser);
        return trainer.getTrainerId();
    }


}
