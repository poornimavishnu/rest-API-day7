package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Car;

public interface CarRepo extends JpaRepository<Car, Integer>{
     
	@Query(value="select * from Car where owners=:o",nativeQuery=true)
	public List<Car> getOwner(@Param("o") int owners);
	
	@Query(value="select * from Car where address=:a",nativeQuery=true)
	public List<Car> getAddress(@Param("a") String address);

	@Query(value="select * from Car where car_name=:cn",nativeQuery=true)
	public List<Car> getCarname(@Param("cn") String carName);
	
	@Query(value="select * from Car where owners=:o and car_type=:ct",nativeQuery=true)
	public List<Car> getcarAndOwner(@Param("o") int owners,@Param("ct") String carType);
}
