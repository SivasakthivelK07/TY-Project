package com.tyss.qspiders;

import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tyss.qspiders.entity.Admin;
import com.tyss.qspiders.entity.Technology;
import com.tyss.qspiders.repository.AdminRepository;
import com.tyss.qspiders.repository.TechnologyRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@SpringBootApplication
public class JspidersApplication {

//	@Autowired
	private final AdminRepository adminRepository;
	private final TechnologyRepository technologyRepository;

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

			Optional<Technology> optional = technologyRepository.findByName("java");
			if (optional.isEmpty()) {
				Admin admin = Admin.builder().username("fl101").password("s144").build();
				Technology java = Technology.builder().name("Java").build();
				Technology python = Technology.builder().name("Python").build();
				Technology javaScript = Technology.builder().name("JavaScript").build();
				Technology cSharp = Technology.builder().name("C#").build();

				adminRepository.save(admin);
				technologyRepository.save(java);
				technologyRepository.save(python);
				technologyRepository.save(javaScript);
				technologyRepository.save(cSharp);
			}
			System.out.println("CommandLineRunner executed");
		};
	}
}
