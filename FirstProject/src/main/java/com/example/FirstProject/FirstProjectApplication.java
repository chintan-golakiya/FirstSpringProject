package com.example.FirstProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class FirstProjectApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =  SpringApplication.run(FirstProjectApplication.class, args);
		System.out.println("Welcome to Spring Boot ...");
		Alien a = context.getBean(Alien.class);
//		a.setLaptop(context.getBean(Laptop.class));
//		Laptop l = a.getLaptop();
//		l.setLid(1);
//		l.setBrand("dell");
		a.showAlien();
		Alien b = context.getBean(Alien.class);
		b.setLaptop(context.getBean(Laptop.class));
		b.showAlien();
		
	}

}
