package com.vehicleapp.Service.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleapp.Vehicle.vehicles;

@Repository
public interface VehicleRepo extends JpaRepository<vehicles, Integer>{

}
