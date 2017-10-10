package com.tuannh.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@SpringBootApplication(scanBasePackages={"com.tuannh.*"})
@EnableElasticsearchRepositories("com.tuannh.repository")
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
