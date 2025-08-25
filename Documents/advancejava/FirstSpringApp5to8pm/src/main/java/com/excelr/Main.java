package com.excelr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//IOC STARTS
	ApplicationContext	con=new ClassPathXmlApplicationContext("config.xml");
	
	  //call getBean() for Car
	Car  c1=con.getBean("car1",Car.class);

	}

}
