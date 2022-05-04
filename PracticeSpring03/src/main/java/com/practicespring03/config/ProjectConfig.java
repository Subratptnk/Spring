package com.practicespring03.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.practicespring03.bean.Vehicle;



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

    
    @Bean (name="audivehicle")
    Vehicle vehicle1(){
        var veh=new Vehicle();
        veh.setName ("Audi");
        return veh;
    }
    @Bean(value="hondaVehicle")
    Vehicle vehicle2(){
        var veh=new Vehicle();
        veh.setName("Honda");
        return veh;
    }
    @Bean("ferrarivehicle")
    Vehicle vehicle3() {
    	var veh = new Vehicle();
    	veh.setName("Ferrari");
    	return veh;
    }

}