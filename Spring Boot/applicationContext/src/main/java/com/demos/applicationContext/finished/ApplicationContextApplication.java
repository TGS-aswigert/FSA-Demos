package com.demos.applicationContext.finished;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationContextApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationContextApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Student abigail = context.getBean("abigail", Student.class);
		Student mary = context.getBean("mary", Student.class);

		System.out.println(mary);
	}

}
