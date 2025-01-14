package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Bed;

public interface BedService {

	public Bed saveBed(Bed bed);
	public List<Bed> getAllBeds();
	public Bed getBedById(Integer id);
	public Bed updateBed(Bed bed);
	
	public List<Bed> getBedByWardNumber(Integer ward_no);
	
	 
}
