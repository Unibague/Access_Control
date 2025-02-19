package com.unibague.accesscontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("com.unibague.accesscontrol.model")  // Ensure Hibernate scans entities
@EnableJpaRepositories("com.unibague.accesscontrol.repository")  // Enable JPA repositories
public class AccessControlApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccessControlApplication.class, args);
	}
}
