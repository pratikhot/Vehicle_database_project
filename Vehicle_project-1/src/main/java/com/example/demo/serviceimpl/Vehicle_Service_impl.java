package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Exception.ResourcenotfoundException;

import com.example.demo.module.Vehicle;
import com.example.demo.repo.Vehicle_repo;
import com.example.demo.service.Vehicle_Service;

@Service
public class Vehicle_Service_impl implements Vehicle_Service
{
	    @Autowired
	    Vehicle_repo repo;

	    @Override
	    public Vehicle addVehicle(Vehicle v) {
	        return repo.save(v);
	    }

	    @Override
	    public Vehicle deleteVehicle(Long vid) {
	    	Vehicle e=repo.findById(vid).orElse(null);
			if(e!=null) {
				repo.deleteById(vid);
				return e;
			}
			else
			{
				throw new ResourcenotfoundException("vehicle","id",vid);
			}
	    }

	    @Override
	    public List<Vehicle> getAllVehicles() {
	        return repo.findAll();
	    }

	    @Override
	    public Vehicle getVehicleById(Long vid) {
	        return repo.findById(vid).orElseThrow(() -> new ResourcenotfoundException("Vehicle" ,"vid" ,vid));
	    }

	    @Override
	    public List<Vehicle> getVehiclesByColor(String vcolor) {
	        return repo.findByVcolor(vcolor);
	    }

	    @Override
	    public List<Vehicle> getVehiclesByPriceSorted() {
	        return repo.findByOrderByVpriceAscVcolorAsc();
	    }

	    @Override
	    public Vehicle updateVehicle(Vehicle e) {
	    	Vehicle e1=repo.findById(e.getVid()).orElse(null);
			if(e1!=null) {
				e1.setVname(e.getVname());
				e1.setVcolor(e.getVcolor());
				e1.setVmodel(e.getVmodel());
				e1.setVprice(e.getVprice());
				return repo.save(e1);
				
			}
	        return repo.save(e1);
	    }

	    @Override
	    public List<Vehicle> getVehiclesByPriceGreaterThan(Double vprice){
	    	
	            return repo.findByVpriceGreaterThanEqual(vprice);
	        }
}



