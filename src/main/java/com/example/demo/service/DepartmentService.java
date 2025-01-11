package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Department;

public interface DepartmentService {

	public Department saveDepartment(Department dept);
	
	public List<Department> getAllDepartments();
	
	public List<Department> getAllDepartmentByHospitalId(Integer hosp_id);
	
	public Department getDepartmentByDeptId(Integer id);
	
	public Department updateDepartment(Department dept);
	
}
