package com.springboot.posting.socials;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com/springboot/posting/socials/*")
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

}
