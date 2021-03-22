package com.app.model;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) {

		/*Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Employee employee = (Employee) beanFactory.getBean("emp");
		employee.setId(11);
		employee.setName("Vrushali");

		System.out.println(employee.hashCode());

		Employee employee1 = (Employee) beanFactory.getBean("emp1");
		employee1.setId(21);
		employee1.setName("Rutuja");

		System.out.println(employee1.hashCode());
*/
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		Employee employee = (Employee) ac.getBean("emp");
		employee.setId(11);
		employee.setName("ABC");

		System.out.println(employee.hashCode());
		
		Employee employee1 = (Employee) ac.getBean("emp");
		employee1.setId(12);
		employee1.setName("PQR");

		System.out.println(employee1.hashCode());
	}
}
