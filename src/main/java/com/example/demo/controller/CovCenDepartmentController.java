package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.service.CovCenDeptService;

@RestController
@RequestMapping("covcendept")
public class CovCenDepartmentController {

	private final CovCenDeptService covcendeptserv;

	public CovCenDepartmentController(CovCenDeptService covcendeptserv) {
		super();
		this.covcendeptserv = covcendeptserv;
	}
	
	@PostMapping("/")
	public CovCenDepartment saveCovCenDepartment(@RequestBody CovCenDepartment covcendept) {
		return  covcendeptserv.saveCovCenDepartment(covcendept);
	}
	
	@GetMapping("/")
	public List<CovCenDepartment> getAllCovCenDepartments() {
		return covcendeptserv.getAllCovCenDepartments();
	}
	
	@GetMapping("/{dept_id}")
	public CovCenDepartment getCovCenDepartmentByDepartmentId(@PathVariable Integer dept_id) {
		return covcendeptserv.getCovCentDepartmentById(dept_id);
	}
	
	@GetMapping("/covcen/{covcenid}")
	public List<CovCenDepartment> getAllCovCenDepartmentsByCovCenter(@PathVariable Integer covcenid) {
		return covcendeptserv.getAllCovCenDepartmentsByCovCenter(covcenid);
	}
}
