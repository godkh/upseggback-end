package com.upse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class UpseggApplication {

	public static void main(String[] args) {
		SpringApplication.run(UpseggApplication.class, args);
	}

}
