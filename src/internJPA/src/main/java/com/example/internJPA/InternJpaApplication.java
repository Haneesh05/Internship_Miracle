package com.example.internJPA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

import com.example.internJPA.Resources.JPAController;
@SpringBootApplication
public class InternJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InternJpaApplication.class, args);
	}

}
