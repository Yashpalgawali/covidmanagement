package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CovCenDepartment;
import com.example.demo.models.CovCenDoctor;
import com.example.demo.repository.CovCenDoctorRepository;

@RestController
@RequestMapping("covcendoc")
public class CovCenDoctorController {

	private final CovCenDoctorRepository covcendocrepo;
	
	public CovCenDoctorController(CovCenDoctorRepository covcendocrepo) {
		super();
		this.covcendocrepo = covcendocrepo;
	}

	@PostMapping("/")
	public CovCenDoctor saveCovCenDoctor(@RequestBody CovCenDoctor doc) {
		return covcendocrepo.save(doc);
	}
	
	@GetMapping("/")
	public List<CovCenDoctor> getAllCovCenDoctors(){
		return covcendocrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public  CovCenDoctor getCovCenDoctorsById(@PathVariable Integer id){
		return covcendocrepo.findById(id).get();
	}
	
//	@GetMapping("/department/{dept_id}")
//	public  List<CovCenDoctor> getAllCovCenDoctorsByDepartmentId(@PathVariable Integer dept_id){
//		CovCenDepartment dept = new CovCenDepartment();
//		dept.setCovcendept_id(dept_id);
//		return covcendocrepo.findByCovcendoctor_dept(dept);
//	}
}
