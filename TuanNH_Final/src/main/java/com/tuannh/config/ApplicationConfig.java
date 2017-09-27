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

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		saveData();
//		displayData();
//	}
	
	public void saveData() {
//		MyContact contact1=new MyContact(3,"tuan","tuanman@gmail.com","1234");
//		MyContact contact2=new MyContact(4,"khoa","khoadom@gmail.com","5678");
//		contactService.save(contact1);
//		contactService.save(contact2);
//		CaryCenters cart=new CartCenter()
	}
	
//	public void displayData() {
//		Iterable<CartCenters> list=contactService.findAll();
//		Iterator<CartCenters> contact=list.iterator();
//		while(contact.hasNext()) {
//			System.out.println("aaaaaaaaaaa"+contact.next().getCardCenterId());
//		}
//	}
	
}
