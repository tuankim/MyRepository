package com.tuannh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@SpringBootApplication(scanBasePackages={"com.tuannh.*"})
@EnableCassandraRepositories("com.tuannh.repository")
@EntityScan("com.tuannh.model") 
public class ApplicationConfig{ 
//	(scanBasePackages="com.tuannh.service")
//	@Autowired
//	private ContactService contactService;
	
//	@Autowired
//	ContactRepository contactService;
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationConfig.class, args);
	}

	
}
