package com.vehicleapp.Vehicle;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class vehicles {
	@Id
	private int vehicle_id;
	private String owner_name;
	private String owner_phone;
	public int getVehicle_id() {
		return vehicle_id;
	}
	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public String getOwner_phone() {
		return owner_phone;
	}
	public void setOwner_phone(String owner_phone) {
		this.owner_phone = owner_phone;
	}
	
	
	
	
	

}
