package com.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.app.pojo.Address;
import com.app.pojo.Student;

public class AppConfig {

	@Bean
	@Scope("prototype")
	
	public Student getStudentInstance() {
		return new Student(11,"PQR",getAddressInstance());
	}
	
	@Bean
	public Address getAddressInstance() {
		return new Address("pune");
	}
}
