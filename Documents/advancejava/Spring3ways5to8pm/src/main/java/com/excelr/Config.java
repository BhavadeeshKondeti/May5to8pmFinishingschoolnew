package com.excelr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

	
	@Bean
	public Employee myOwnMethod()
	{
		Employee e1=new Employee();
		e1.setEmployeeId(456);
		e1.setEmployeeName("Kumod");
		return e1;
	}
}
