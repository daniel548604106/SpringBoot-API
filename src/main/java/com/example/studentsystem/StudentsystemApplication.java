package com.example.studentsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication // 此註解用在Spring Boot專案的應用主類上（此類需要在base package中）。使用了此註解的類首先會讓Spring Boot啟動對base package下以及其sub-pacakages的類進行component scan。
@RestController
public class StudentsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentsystemApplication.class, args);
	}


	@GetMapping
	public String startingServer(){
		return "Server Starting";
	}


}
