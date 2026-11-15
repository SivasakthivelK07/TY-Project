package com.tyss.jspiders.dj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DockerJenkinsApplication {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Third commit");
		SpringApplication.run(DockerJenkinsApplication.class, args);
	}

}
