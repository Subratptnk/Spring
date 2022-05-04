package com.practicespring06.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practicespring06.bean.Vehicle;
import com.practicespring06.config.ProjectConfig;

public class Main {

	public static void main(String[]args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		Vehicle vehicle = context.getBean(Vehicle.class);
		System.out.println("Component Vehicle name from spring context is "+vehicle.getName());
		vehicle.printHello();
	}
}
