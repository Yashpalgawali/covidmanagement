package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CovCenter;

public interface CovCenService {

	public CovCenter saveCovCenter(CovCenter covcen);
	
	public List<CovCenter> getAllCovCenters();
	
	public CovCenter getCovCenterById(Integer id);
	
	public CovCenter updateCovCenter(CovCenter covcen);
	
	
}
