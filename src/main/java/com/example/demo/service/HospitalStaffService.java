package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.HospitalStaff;

public interface HospitalStaffService {

	public HospitalStaff saveHospitalStaff(HospitalStaff hospstaff);
	
	public List<HospitalStaff> getAllHospitalStaff();
	
	public HospitalStaff getHospitalStaffById(Integer hosp_staff_id);
	
	public List<HospitalStaff> getHospitalStaffByHospitalId(Integer hosp_id);
	
	public List<HospitalStaff> getHospitalStaffByHospitalDepartmentId(Integer hosp_dept_id);
	
}
