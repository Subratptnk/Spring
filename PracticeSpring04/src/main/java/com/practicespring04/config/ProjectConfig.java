package com.practicespring04.config;

import org.springframework.context.annotation.Bean;

import com.practicespring04.bean.Student;

public class ProjectConfig {

	@Bean(name= "one")
	Student student() {
	Student Std1 = new Student();
	Std1.setName("Subrat Pattanaik");
	Std1.setRegistrationNumber(000001);
	return Std1;
	}
	
	@Bean(name= "two")
	Student student1() {
	Student Std1 = new Student();
	Std1.setName("Sarthak Das");
	Std1.setRegistrationNumber(000002);
	return Std1;
	}
	
	@Bean(name= "three")
	Student student2() {
	Student Std1 = new Student();
	Std1.setName("Vaani Saha");
	Std1.setRegistrationNumber(000003);
	return Std1;
	}
}
