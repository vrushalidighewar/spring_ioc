package com.app.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;

public class DITest {

	public static void main(String[] args) {

		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		Student student=(Student) ac.getBean(Student.class);
		
		Address address=(Address) ac.getBean(Address.class);
		
		System.out.println(student);
	}

}
