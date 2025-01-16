package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CovCenWardType;

public interface CovCenWardTypeService {

	public CovCenWardType saveCovCenWardType(CovCenWardType wardtype);
	
	public List<CovCenWardType> getAllCovCenWardTypes();
	
	public CovCenWardType getCovCenWardTypeById(Integer id);
	
	public int updateCovCenWardType(CovCenWardType wardtype);
}
