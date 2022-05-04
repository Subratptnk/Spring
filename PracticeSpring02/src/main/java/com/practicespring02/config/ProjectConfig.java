package com.practicespring02.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practicespring02.bean.Vehicle;


/*
Spring @configuration annoataion is a part of the Spring core framework.
Spring Configuration annotation indicates that the class has @bean defination menthods.
So spring container can process the class and generate Spring beans to be used in application
 */

@Configuration
public class ProjectConfig {

	/*
    @Bean annotation, which lets spring know that it needs to call
    this method when it initializes its context and adds the returned values to the context
     */

    @Bean
    Vehicle vehicle(){
        Vehicle veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }
    @Bean
    Vehicle vehicle1(){
        Vehicle veh = new Vehicle();
        veh.setName("Mercedes");
        return veh;
    }



    /*
    The method names usually follow verbs notation.But for methods
    which we will use to create beans, can use nouns as names.
    This will be a good practise as the method names will become
    bean names as well in the context.
     */


    @Bean
    Integer number(){
        return 16;
    }

    @Bean
    String hello(){
        return "Hello World";
    }
	
}

