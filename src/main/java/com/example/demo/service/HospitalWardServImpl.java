package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Ward;
import com.example.demo.repository.HospitalRepository;
import com.example.demo.repository.HospitalWardRepository;

@Service("hospwardserv")
public class HospitalWardServImpl implements HospitalWardService {

	private final HospitalWardRepository hospwardrepo;
	
	public HospitalWardServImpl(HospitalWardRepository hospwardrepo) {
		super();
		this.hospwardrepo = hospwardrepo;
	}

	@Override
	public Ward saveWard(Ward ward) {

		return hospwardrepo.save(ward);
	}

	@Override
	public List<Ward> getAllWards() {
		 
		return hospwardrepo.findAll();
	}

	@Override
	public Ward getWardById(Integer id) {
		Optional<Ward> hospwardobj = hospwardrepo.findById(id);
		if(hospwardobj.isEmpty()) {
			return hospwardobj.get();
		}
		else {
			return null;	
		}		
	}

	@Override
	public int updateWard(Ward ward) {
		 
		return 0;
	}

	@Override
	public List<Ward> getAllWardsByHospitalDepartment(Integer dept_id) {
		List<Ward> wardlist = this.getAllWards()
			.stream()
			.filter(wards -> wards.getDepartment().getDept_id().equals(dept_id))
			.collect(Collectors.toList());
		return wardlist;
	}

	@Override
	public List<Ward> getAllWardsByWardtype(Integer ward_type_id) {
		List<Ward> wardlist = this.getAllWards()
				.stream()
				.filter(wards -> wards.getWardtype().getWard_type_id().equals(ward_type_id) )
				.collect(Collectors.toList());
		return wardlist;
	}

}
