package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Designation;

public interface DesignationService {

	public Designation saveDesignation(Designation designation);
	
	public List<Designation> getAllDesignations();
	
	public List<Designation> getAllDesignationsByDepartmentId(Integer id);
	
	public Designation getDesignationById(Integer id);

	public Designation updateDesignation(Designation designation);
	
}
