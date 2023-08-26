package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Car;

import com.example.demo.repository.CarRepo;

@Service
public class ApiService {
	@Autowired
	CarRepo cr;
	public List<Car> savedetails(List<Car> c)
	{
		return (List<Car>)cr.saveAll(c);
	}
	public List<Car> getOwners(int o){
		return cr.getOwner(o);
	}
	public List<Car> getAdd(String a)
	{
		return cr.getAddress(a);
	}
	public List<Car> getCarn(String a)
	{
		return cr.getCarname(a);
	}
	public List<Car> getCtOwn(int o,String a)
	{
		return cr.getcarAndOwner(o, a);
	}
}
