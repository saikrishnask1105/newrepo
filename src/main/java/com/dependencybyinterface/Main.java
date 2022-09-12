package com.dependencybyinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("service.xml");
		Airtel a = context.getBean("airtel" , Airtel.class) ;
		a.display();
		

	}

}
