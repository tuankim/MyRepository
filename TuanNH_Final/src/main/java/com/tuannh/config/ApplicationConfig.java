package com.tuannh.config;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.tuannh.model.CartCenters;
import com.tuannh.repository.CardCenterRepository;

@SpringBootApplication(scanBasePackages={"com.tuannh.*"})
@EnableJpaRepositories("com.tuannh.repository")
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
