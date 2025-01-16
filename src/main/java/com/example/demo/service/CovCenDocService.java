package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CovCenDoctor;

public interface CovCenDocService {

	public CovCenDoctor saveCovCenDoctor(CovCenDoctor covcendoc);
	
	public List<CovCenDoctor> getAllCovCenDoctors();
	public List<CovCenDoctor> getAllCovCenDoctorsByDepartmentId(Integer covcendeptid);
	public CovCenDoctor getCovCenDoctorByDoctorId(Integer doc_id);
	public CovCenDoctor updateCovCenDoctor(CovCenDoctor covcendoc);
}
