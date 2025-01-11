package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Hospital;
import com.example.demo.repository.HospitalRepository;

@Service("hospserv")
@Transactional
public class HospitalServImpl implements HospitalService {

	private final HospitalRepository hosprepo;
	
	public HospitalServImpl(HospitalRepository hosprepo) {
		super();
		this.hosprepo = hosprepo;
	}

	@Override
	public Hospital saveHospital(Hospital hosp) {
	
		return hosprepo.save(hosp);
	}

	@Override
	public List<Hospital> getAllHospitals() {
		
		return hosprepo.findAll();
	}

	@Override
	public Hospital getHospitalById(Integer id) {
		Optional<Hospital> hospObj = hosprepo.findById(id);
		if(!hospObj.isEmpty()) {
			return hospObj.get();
		}
		else {
			return null;
		}
	}

	@Override
	public int updateHospital(Hospital hospital) {
		// TODO Auto-generated method stub
		return 0;
	}

}
