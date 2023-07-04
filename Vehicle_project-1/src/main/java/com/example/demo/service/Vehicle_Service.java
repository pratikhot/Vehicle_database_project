package com.example.demo.service;

import java.util.List;

import com.example.demo.module.Vehicle;

public interface Vehicle_Service {


	Vehicle addVehicle(Vehicle v);

	Vehicle deleteVehicle(Long vid);

	List<Vehicle> getAllVehicles();

	Vehicle getVehicleById(Long vid);

	List<Vehicle> getVehiclesByColor(String vcolor);

	List<Vehicle> getVehiclesByPriceSorted();

	Vehicle updateVehicle(Vehicle v);

	List<Vehicle> getVehiclesByPriceGreaterThan(Double vprice);

}



