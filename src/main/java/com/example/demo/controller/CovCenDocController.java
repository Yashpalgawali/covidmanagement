package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CovCenDoctor;
import com.example.demo.service.CovCenDocService;

@RestController
@RequestMapping("covcendoc")
public class CovCenDocController {

	private final CovCenDocService covcendocserv;

	public CovCenDocController(CovCenDocService covcendocserv) {
		super();
		this.covcendocserv = covcendocserv;
	}
	
	@PostMapping("/")
	public CovCenDoctor saveCovCenDoctor(@RequestBody CovCenDoctor covcendoc) {
		return covcendocserv.saveCovCenDoctor(covcendoc);
	}
	
	@GetMapping("/")
	public List<CovCenDoctor> getAllCovCenDoctors(){
		List<CovCenDoctor> doclist = covcendocserv.getAllCovCenDoctors();
		doclist.stream().forEach(doc-> System.err.println(doc.toString()));
		return doclist;
	}
	
	@GetMapping("/department/{dept_id}")
	public List<CovCenDoctor> getAllCovCenDoctorsByCovCenDepartment(@PathVariable Integer dept_id){
		return covcendocserv.getAllCovCenDoctorsByDepartmentId(dept_id);
	}
	
	@GetMapping("/{doc_id}")
	public CovCenDoctor getCovCenDoctorByDoctorId(@PathVariable Integer doc_id) {
		
		return covcendocserv.getCovCenDoctorByDoctorId(doc_id);
		
	}
}
