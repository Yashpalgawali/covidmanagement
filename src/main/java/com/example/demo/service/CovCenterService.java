package com.example.demo.service;

import java.util.List;

import com.example.demo.models.CovCenter;

public interface CovCenterService {

	public CovCenter saveCovCenter(CovCenter center);
	
	public List<CovCenter> getAllCovCenters();
	
	public CovCenter getCovCenterById(Integer centerid);
	
}
