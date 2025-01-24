package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CovCenDepartment;
import com.example.demo.repository.CovCenDepartmentRepository;

@RestController
@RequestMapping("covcendept")
public class CovCenDepartmentController {

	private final CovCenDepartmentRepository covcendeptrepo;

	public CovCenDepartmentController(CovCenDepartmentRepository covcendeptrepo) {
		super();
		this.covcendeptrepo = covcendeptrepo;
	}
	
	@PostMapping("/")
	public CovCenDepartment saveCovCenDepartment(@RequestBody CovCenDepartment dept) {
		return covcendeptrepo.save(dept);
	}
	
	@GetMapping("/")
	public List<CovCenDepartment> getAllCovCenDepartments(){
		return covcendeptrepo.findAll();
	}
	
	@GetMapping("/{dept_id}")
	public CovCenDepartment getCovCenDepartmentbyId(@PathVariable Integer dept_id) {
		return  covcendeptrepo.findById(dept_id).get();
	}
}
