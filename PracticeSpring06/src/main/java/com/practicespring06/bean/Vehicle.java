package com.practicespring06.bean;

import org.springframework.stereotype.Component;

/*
 * This @Component is an indicator to spring framework that, this Pojo class has to be converted
 * as spring bean 
 */

@Component
public class Vehicle {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Printing Hello from Component Vehicle bean");
	}
}
