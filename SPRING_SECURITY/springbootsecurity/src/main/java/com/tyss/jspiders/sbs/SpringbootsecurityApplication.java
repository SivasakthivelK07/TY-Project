package com.tyss.jspiders.sbs;

import com.tyss.jspiders.sbs.entity.Admin;
import com.tyss.jspiders.sbs.entity.AppUser;
import com.tyss.jspiders.sbs.entity.Role;
import com.tyss.jspiders.sbs.repository.AdminRepository;
import com.tyss.jspiders.sbs.repository.AppUserRepository;
import com.tyss.jspiders.sbs.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.Optional;

@RequiredArgsConstructor
@SpringBootApplication
public class SpringbootsecurityApplication {

    private final RoleRepository roleRepository;
    private final AdminRepository adminRepository;
    private final AppUserRepository appUserRepository;
//    private final PasswordEncoder passwordEncoder;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootsecurityApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(){

        return args-> {

            Optional<Role> role = roleRepository.findByRoleName("ROLE_ADMIN");

            if (!role.isPresent()) {
                Role roleAdmin = roleRepository.save(Role.builder().roleName("ROLE_ADMIN")
                        .appUsers(new ArrayList<>()).build());
                roleRepository.save(Role.builder().roleName("ROLE_EMPLOYEE").build());
                roleRepository.save(Role.builder().roleName("ROLE_STUDENT").build());
                roleRepository.save(Role.builder().roleName("ROLE_TRAINER").build());

                Admin admin = Admin.builder().adminId("Admin01").adminName("Admin").build();
                adminRepository.save(admin);

                AppUser appUser = AppUser.builder()
                        .username(admin.getAdminId())
                        .password("qwert")
                        .roles(new ArrayList<>())
                        .build();

                appUser.getRoles().add(roleAdmin);
                roleAdmin.getAppUsers().add(appUser);

                appUserRepository.save(appUser);
            }
        };
    }
}
