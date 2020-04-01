package com.nfinity.fastcode.petsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class PetsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetsdemoApplication.class, args);
	}

}

