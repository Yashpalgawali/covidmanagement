package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CovCenWards;

public interface CovCenWardService {

	public CovCenWards saveCovCenWards(CovCenWards covcenward);
	
	public List<CovCenWards> getAllCovCeWards();
	
	public List<CovCenWards> getAllCovCeWardByWardtype(Integer ward_type_id);
	
	public List<CovCenWards> getAllCovCeWardByDepartment(Integer dept_id);
	
	public CovCenWards getCovCenWardByWardId(Integer ward_id);
	
	public CovCenWards updateCovCenWards(CovCenWards covcenward);
}
