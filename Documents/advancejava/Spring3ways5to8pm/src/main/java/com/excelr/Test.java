package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		
		//IOC STARTS
	ApplicationContext	con=new AnnotationConfigApplicationContext(Config.class);
	
	  //getBean() for Employee
	Employee  e1=con.getBean("myOwnMethod",Employee.class);
	System.out.println(e1);
	
	
	System.out.println("How are github");

	}

}
