package com.practicespring03.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practicespring03.bean.Vehicle;
import com.practicespring03.config.ProjectConfig;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Vehicle veh1 = context.getBean("audivehicle",Vehicle.class);
		System.out.println("first bean (name): "+veh1.getName());
		Vehicle veh2 = context.getBean("hondaVehicle",Vehicle.class);
		System.out.println("Second bean (value) :"+veh2.getName());
		Vehicle veh3 = context.getBean("ferrarivehicle",Vehicle.class);
		System.out.println("Third bean (no parameter) :"+veh3.getName());

	}

}
