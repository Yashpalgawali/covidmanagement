package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.entity.CovCenter;

public interface CovCenDeptService {

	public CovCenDepartment saveCovCenDepartment(CovCenDepartment covcendept);
	public List<CovCenDepartment> getAllCovCenDepartments();
	public CovCenDepartment getCovCentDepartmentById(Integer id);
	public CovCenDepartment updateCovCenDepartment(CovCenDepartment covcendept);
	public List<CovCenDepartment> getAllCovCenDepartmentsByCovCenter(Integer covcenterid);
}
