package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.module.Vehicle;
import com.example.demo.service.Vehicle_Service;

@RestController
public class Vehicle_Controller 
{
	@Autowired
	Vehicle_Service ser;
	//localhost:8080/addveh
	@PostMapping("/addveh")
	ResponseEntity<Vehicle> addVehicle(@RequestBody Vehicle e){
		return  new ResponseEntity<Vehicle>(ser.addVehicle(e),HttpStatus.CREATED);
	}
	@DeleteMapping("/deleteveh")
	ResponseEntity<Vehicle> deleteVehicle(@RequestParam Long vid){
		return  new ResponseEntity<Vehicle>(ser.deleteVehicle(vid),HttpStatus.OK);
	}
	@GetMapping("/getAllVehicles1")
	ResponseEntity<List<Vehicle>> getAllVehicles(){
		return  new ResponseEntity<List<Vehicle>>(ser.getAllVehicles(),HttpStatus.FOUND);
	}
	@GetMapping("/vehiclebyid")
	ResponseEntity<Vehicle> getVehicleById(@RequestHeader Long vid){
		return  new ResponseEntity<Vehicle>(ser.getVehicleById(vid),HttpStatus.FOUND);
	}
	@GetMapping("/vehiclebycolor")
	ResponseEntity<List<Vehicle>> getVehiclesByColor(@RequestHeader String vcolor){
		return  new ResponseEntity<List<Vehicle>>(ser.getVehiclesByColor(vcolor),HttpStatus.FOUND);
	}
	
	@GetMapping("/vehiclebypricesort")
	ResponseEntity<List<Vehicle>>  getVehiclesByPriceSorted(){
		return  new ResponseEntity<List<Vehicle>>(ser.getVehiclesByPriceSorted(),HttpStatus.FOUND);
	}
	
	@PutMapping("/updatevehicle")
	ResponseEntity<Vehicle> updateEmployee(@RequestBody  Vehicle v){
		return  new ResponseEntity<Vehicle>(ser.updateVehicle( v),HttpStatus.OK);
	}
	@GetMapping("/vehiclebypricesortgreater")
	ResponseEntity<List<Vehicle>>  getVehiclesByPriceGreaterThan(@RequestHeader Double vprice ){
		return  new ResponseEntity<List<Vehicle>>(ser.getVehiclesByPriceGreaterThan(vprice),HttpStatus.FOUND);
	}
	
	
	

}
