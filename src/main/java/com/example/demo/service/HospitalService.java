package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Hospital;

public interface HospitalService {

	public Hospital saveHospital(Hospital hosp);
	
	public List<Hospital> getAllHospitals();
	
	public Hospital getHospitalById(Integer id);
	
	public int updateHospital(Hospital hospital);
	
}
