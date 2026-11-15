package com.tyss.jspiders;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.tyss.jspiders.entity.Admin;
import com.tyss.jspiders.repository.AdminRepository;

import lombok.RequiredArgsConstructor;

@EnableCaching
@RequiredArgsConstructor
@SpringBootApplication
public class JspidersApplication {

//	@Autowired
	private final AdminRepository adminRepository;

//	public JspidersApplication(AdminRepository adminRepository) {
//		this.adminRepository = adminRepository;
//	}

	public static void main(String[] args) {
		SpringApplication.run(JspidersApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner name() {
//		return args -> {
//			System.out.println("CommandLineRunner executed");
//		};
//	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Admin admin = Admin.builder().username("fl101").password("s144").build();

			adminRepository.save(admin);

			System.out.println("CommandLineRunner executed");
		};
	}
}
