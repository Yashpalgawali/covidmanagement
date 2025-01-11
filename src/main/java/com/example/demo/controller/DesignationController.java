package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Designation;
import com.example.demo.service.DesignationService;

@RestController
@RequestMapping("designation")
public class DesignationController {

	private final DesignationService desigserv;

	public DesignationController(DesignationService desigserv) {
		super();
		this.desigserv = desigserv;
	}
	
	@PostMapping("/")
	public Designation saveDesignation(@RequestBody Designation desig) {
		
		return desigserv.saveDesignation(desig);
	}
	
	@GetMapping("/")
	public List<Designation> getAllDesignations(){
		return desigserv.getAllDesignations();
	}
	
	@GetMapping("/department/{id}")
	public List<Designation> getAllDesignationsByDepartmentId(@PathVariable Integer id){
		return desigserv.getAllDesignationsByDepartmentId(id);
	}
	
	
	@GetMapping("/{id}")
	public  Designation getDesignationById(@PathVariable Integer id){
		return desigserv.getDesignationById(id);
	}
	
	@PutMapping("/")
	public Designation updateDesignation(@RequestBody Designation desig) {
		
		return desigserv.updateDesignation(desig);
	}
	
	
}
