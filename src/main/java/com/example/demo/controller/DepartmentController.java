package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("department")
public class DepartmentController {

	private final DepartmentService deptserv;

	public DepartmentController(DepartmentService deptserv) {
		super();
		this.deptserv = deptserv;
	}
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department dept) {
		
		return deptserv.saveDepartment(dept);
	}
	
	@GetMapping("/")
	public List<Department> getAllDepartments(){
		return deptserv.getAllDepartments();
	}
	
	@GetMapping("/hospital/{id}")
	public List<Department> getAllDepartmentsByHospitalId(@PathVariable Integer id){
		return deptserv.getAllDepartmentByHospitalId(id);
	}
	
	
	@GetMapping("/{id}")
	public  Department getDepartmentByDepartmentId(@PathVariable Integer id){
		return deptserv.getDepartmentByDeptId(id);
	}
	
	@PutMapping("/")
	public Department updateDepartment(@RequestBody Department dept) {
		
		return deptserv.updateDepartment(dept);
	}
	
	
}
