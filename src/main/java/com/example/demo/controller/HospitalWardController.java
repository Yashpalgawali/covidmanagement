package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Ward;
import com.example.demo.service.HospitalWardService;

@RestController
@RequestMapping("hospitalward")
public class HospitalWardController {

	private final HospitalWardService hospwardserv;

	public HospitalWardController(HospitalWardService hospwardserv) {
		super();
		this.hospwardserv = hospwardserv;
	}
	
	@PostMapping("/")
	public Ward saveHospitalWard(@RequestBody Ward ward) {
	
		return hospwardserv.saveWard(ward);
	}
	
	@PutMapping("/")
	public Ward updateHospitalWard(@RequestBody Ward ward) {
		int updateWard = hospwardserv.updateWard(ward);
		
		return this.getWardbyWardId(ward.getWard_id());
	}
	
	@GetMapping("/{id}")
	public Ward getWardbyWardId(@PathVariable Integer id) {
		Ward ward = hospwardserv.getWardById(id);
		return ward;
	}
	
	@GetMapping("/")
	public List<Ward> getAllWards(){
		return hospwardserv.getAllWards();
	}
	
	@GetMapping("/department/{dept_id}")
	public List<Ward> getAllWardsByDepartment(@PathVariable Integer dept_id){
		return hospwardserv.getAllWardsByHospitalDepartment(dept_id);
	}
	
	
	@GetMapping("/wardtype/{wardtype_id}")
	public List<Ward> getAllWardsByWardtype(@PathVariable Integer wardtype_id){
		return hospwardserv.getAllWardsByWardtype(wardtype_id); 
	}
}
