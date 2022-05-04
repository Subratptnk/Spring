package com.practiceexample01.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practiceexample01.bean.Vehicle;
import com.practiceexample01.config.ProjectConfig;

public class main {
	public static void main(String[] args){

        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda city");
        System.out.println("Vehicle name from non spring context is :"+vehicle.getName());

        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
         */

        /*
        AnnotationConfigApplicationContext -> Annotation type of application conext (Ioc Container)
        application context is an interface and AnnotationConfigApplicationContext is implementation of that interface
         */

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Vehicle veh = context.getBean(Vehicle.class);
        System.out.println("Vehicle name from Spring context is :"+veh.getName());

        String hello  = context.getBean(String.class);
        System.out.println("String values from spring contect is :"+hello);
	}
}
