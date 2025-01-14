package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Ward;

public interface HospitalWardService {

	public Ward saveWard(Ward ward);
	public List<Ward> getAllWards();
	public Ward getWardById(Integer id);
	public int updateWard(Ward ward);
	
	public List<Ward> getAllWardsByHospitalDepartment(Integer dept_id);
	
	public List<Ward> getAllWardsByWardtype(Integer ward_type_id);
}
