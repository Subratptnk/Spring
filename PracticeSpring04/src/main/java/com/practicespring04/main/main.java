package com.practicespring04.main;

import java.lang.invoke.VarHandle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practicespring04.bean.Student;
import com.practicespring04.config.ProjectConfig;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
		
		Student stud1 = context.getBean("one",Student.class);
		System.out.println("The name of the student is "+stud1.getName());
		System.out.println("The registration Number of Student is "+stud1.getRegistrationNumber());
		
		System.out.println("**********************************************");
		
		Student stud2 = context.getBean("two",Student.class);
		System.out.println("The name of the student is "+stud2.getName());
		System.out.println("The registration Number of Student is "+stud2.getRegistrationNumber());
	
System.out.println("**********************************************");
		
		Student stud3 = context.getBean("three",Student.class);
		System.out.println("The name of the student is "+stud3.getName());
		System.out.println("The registration Number of Student is "+stud3.getRegistrationNumber());
	}


}
