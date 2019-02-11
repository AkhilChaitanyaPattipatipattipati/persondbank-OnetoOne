package com.example.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.bank")
public class PersonBankDetailsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonBankDetailsApplication.class, args);
	}

}

