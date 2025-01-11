package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hospital;
import com.example.demo.service.HospitalService;

@RestController
@RequestMapping("hospital")
public class HospitalController {

	private final HospitalService hospserv;

	public HospitalController(HospitalService hospserv) {
		super();
		this.hospserv = hospserv;
	}
	
	@PostMapping("/")
	public Hospital saveHospital(@RequestBody Hospital hospital) {
		Hospital hosp = hospserv.saveHospital(hospital);
		return hosp;
	}

	@PutMapping("/")
	public Hospital updateHospital(@RequestBody Hospital hospital) {
		int res = hospserv.updateHospital(hospital);
		Hospital hosp = hospserv.getHospitalById(hospital.getHosp_id());
		return hosp;
	}
	
	@GetMapping("/")
	public List<Hospital> getAllHospitals() {
		return hospserv.getAllHospitals();
	}
	
	@GetMapping("/{id}")
	public Hospital getHospitalById(@PathVariable Integer id) {
		return 		hospserv.getHospitalById(id);
	}
}
