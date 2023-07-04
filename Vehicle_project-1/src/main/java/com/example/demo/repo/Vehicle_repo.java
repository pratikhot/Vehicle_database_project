package com.example.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.module.Vehicle;

public interface Vehicle_repo  extends JpaRepository<Vehicle, Long> {
	    
	    List<Vehicle> findByVcolor(String vcolor);

	    List<Vehicle> findByVpriceGreaterThanEqual(Double vprice);

	    List<Vehicle> findByOrderByVpriceAscVcolorAsc();

	}



