package com.suraj.springboot.basics.springbootin10steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringbootIn10StepsApplication {

	public static void main(String[] args) {
	SpringApplication.run(SpringbootIn10StepsApplication.class, args);
		
//		for(String name: applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
	}

}
