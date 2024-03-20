package com.vehicleapp.Controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleapp.Service.VehicleService;
import com.vehicleapp.Vehicle.vehicles;

@RestController
@RequestMapping("/api")
public class VehicleController {
	@Autowired
	VehicleService vehicleService;
	@GetMapping("/all")
	public ResponseEntity<List<vehicles>> getAllS() {
		List<vehicles> vehicle = vehicleService.get();
		return new ResponseEntity<List<vehicles>>(vehicle, HttpStatus.OK);
	}
	
	
	

}
