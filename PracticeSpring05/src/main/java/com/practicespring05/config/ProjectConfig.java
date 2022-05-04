package com.practicespring05.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.practicespring05.bean.Vehicle;

public class ProjectConfig {
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
	    @Primary
	    @Bean("ferrarivehicle")
	    Vehicle vehicle3() {
	    	var veh = new Vehicle();
	    	veh.setName("Ferrari");
	    	return veh;
	    }
}
