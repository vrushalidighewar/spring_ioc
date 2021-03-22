package com.app.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DITest {

	public static void main(String[] args) {

		ApplicationContext ac=new ClassPathXmlApplicationContext("di.xml");
		
		/*Student student=(Student) ac.getBean("std");
		Address address=(Address) ac.getBean("addr");
		
		System.out.println(student);*/
		
		Student student=(Student) ac.getBean("std");
		student.setId(11);
		student.setName("ABC");
		
		
		Address add=(Address) ac.getBean("addr");
		add.setCity("Delhi");
		
		student.setAdd(add);
		
		System.out.println(student);
		
		
		
		

	}

}
