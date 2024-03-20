package com.vehicleapp.Service;

import java.util.List;
import com.vehicleapp.Vehicle.vehicles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleapp.Service.Repo.VehicleRepo;

@Service
public class VehicleServiceImpl implements VehicleService {
	@Autowired
	VehicleRepo vehiclerepo;

	@Override
	public List<vehicles> get() {
		List<vehicles> vhcl=vehiclerepo.findAll();
		return vhcl;
	}

}
