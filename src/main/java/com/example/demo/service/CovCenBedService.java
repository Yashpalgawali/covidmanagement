package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CovCenBed;

public interface CovCenBedService {

	public CovCenBed saveCovCenBed(CovCenBed covcenbed);
	
	public List<CovCenBed> getAllCovCenBeds();
	
	public List<CovCenBed> getAllCovCenBedsByWardId(Integer wardid);
	
	public CovCenBed getCovCenBedByBedId(Integer bedid);
	public CovCenBed updateCovCenBed(CovCenBed covcenbed);
	
}
