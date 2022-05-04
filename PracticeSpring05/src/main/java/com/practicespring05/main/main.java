package com.practicespring05.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practicespring05.config.ProjectConfig;
import com.practicespring05.bean.Vehicle;

public class main {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle ve = context.getBean(Vehicle.class);
        System.out.println("**** Vehicle name with No error is :"+ve.getName());

	}

}
