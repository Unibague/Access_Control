package com.unibague.accesscontrol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories; // ✅ MongoDB en lugar de JPA

@SpringBootApplication
@EnableMongoRepositories // ✅ Usar MongoDB en vez de JPA
public class AccessControlApplication {
	public static void main(String[] args) {
		SpringApplication.run(AccessControlApplication.class, args);
	}
}
