package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.entity.CovCenDoctor;
import com.example.demo.repository.CovCenDoctorRepository;

@Service("covcendocserv")
public class CovCenDocServImpl implements CovCenDocService {

	private final CovCenDoctorRepository covcendocrepo;
	
	public CovCenDocServImpl(CovCenDoctorRepository covcendocrepo) {
		super();
		this.covcendocrepo = covcendocrepo;
	}

	@Override
	public CovCenDoctor saveCovCenDoctor(CovCenDoctor covcendoc) {
		
		return covcendocrepo.save(covcendoc);
	}

	@Override
	public List<CovCenDoctor> getAllCovCenDoctors() {
 
		return covcendocrepo.findAll();
	}

	@Override
	public List<CovCenDoctor> getAllCovCenDoctorsByDepartmentId(Integer covcendeptid) {
		CovCenDepartment covcendept = new CovCenDepartment();
		covcendept.setCovcendeptid(covcendeptid);
		return covcendocrepo.findByCovcendept(covcendept);
	}

	@Override
	public CovCenDoctor updateCovCenDoctor(CovCenDoctor covcendoc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CovCenDoctor getCovCenDoctorByDoctorId(Integer doc_id) {
		Optional<CovCenDoctor> obj = covcendocrepo.findById(doc_id);
		if(!obj.isEmpty()) {
			return obj.get();
		}
		else {
			return null;
		}
	}

}
