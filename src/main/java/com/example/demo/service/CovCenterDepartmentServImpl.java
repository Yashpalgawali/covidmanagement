package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.entity.CovCenter;
import com.example.demo.repository.CovCenterDepartmentRepository;
 
@Service("covcendeptserv")
public class CovCenterDepartmentServImpl implements CovCenDeptService {

	private final CovCenterDepartmentRepository covcendeptrepo;

	public CovCenterDepartmentServImpl(CovCenterDepartmentRepository covcendeptrepo) {
		super();
		this.covcendeptrepo = covcendeptrepo;
	}

	@Override
	public CovCenDepartment saveCovCenDepartment(CovCenDepartment covcendept) {
		return covcendeptrepo.save(covcendept);
	}

	@Override
	public List<CovCenDepartment> getAllCovCenDepartments() {
		return covcendeptrepo.findAll();
	}

	@Override
	public CovCenDepartment getCovCentDepartmentById(Integer id) {
		Optional<CovCenDepartment> obj = covcendeptrepo.findById(id);
		if(!obj.isEmpty())
			return obj.get();
		else
			return null;
	}

	@Override
	public CovCenDepartment updateCovCenDepartment(CovCenDepartment covcendept) {
		 
		return null;
	}

	@Override
	public List<CovCenDepartment> getAllCovCenDepartmentsByCovCenter(Integer covcenterid) {
		CovCenter covcenter = new CovCenter();
		covcenter.setCovcen_id(covcenterid);
		return covcendeptrepo.findByCovcenter(covcenter);
	}
	
	 
 

}
