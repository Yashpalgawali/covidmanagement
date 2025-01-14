package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.HospitalStaff;
import com.example.demo.service.HospitalStaffService;

@RestController
@RequestMapping("hospitalstaff")
public class HospitalStaffController {

	private final HospitalStaffService hospstaffserv;
	
	public HospitalStaffController(HospitalStaffService hospstaffserv) {
		super();
		this.hospstaffserv = hospstaffserv;
	}

	@PostMapping("/")
	public HospitalStaff saveHospitalStaff(@RequestBody HospitalStaff hospstaff) {
		
		return hospstaffserv.saveHospitalStaff(hospstaff);
	}
	
	@GetMapping("/")
	public List<HospitalStaff> getAllHospitalStaff(){
		List<HospitalStaff> hospstafflist = hospstaffserv.getAllHospitalStaff();
		return hospstafflist;
	}
	
	
	@GetMapping("/hospital/{hosp_id}")
	public List<HospitalStaff> getAllHospitalStaffByHospitalId(@PathVariable Integer hosp_id){
		List<HospitalStaff> hospstafflist = hospstaffserv.getHospitalStaffByHospitalId(hosp_id);
		return hospstafflist;
	}
	
	@GetMapping("/hospital/department/{hosp_dept_id}")
	public List<HospitalStaff> getAllHospitalStaffByHospitalDepartmentId(@PathVariable Integer hosp_dept_id){
		List<HospitalStaff> hospstafflist = hospstaffserv.getHospitalStaffByHospitalDepartmentId(hosp_dept_id);
		return hospstafflist;
	}
	
	
}

