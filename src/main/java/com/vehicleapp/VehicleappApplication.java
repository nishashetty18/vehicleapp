package com.vehicleapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vehicleapp.Service.VehicleService;
import com.vehicleapp.Service.VehicleServiceImpl;

@SpringBootApplication
public class VehicleappApplication {
	@Autowired
	VehicleService vh;

	public static void main(String[] args) {
		SpringApplication.run(VehicleappApplication.class, args);
		System.out.println("vehicle created");
	
		
	
	}

}
