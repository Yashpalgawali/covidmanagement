package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CovCenWardType;
import com.example.demo.entity.CovCenWards;
import com.example.demo.entity.WardType;
import com.example.demo.repository.CovCenWardRepository;

@Service("covcenwardserv")
public class CovCenWardServImpl implements CovCenWardService {

	private final CovCenWardRepository covcenwardrepo;
	
	public CovCenWardServImpl(CovCenWardRepository covcenwardrepo) {
		super();
		this.covcenwardrepo = covcenwardrepo;
	}

	@Override
	public CovCenWards saveCovCenWards(CovCenWards covcenward) {
		 
		return covcenwardrepo.save(covcenward);
	}

	@Override
	public List<CovCenWards> getAllCovCeWards() {
		 
		return covcenwardrepo.findAll();
	}

	@Override
	public CovCenWards getCovCenWardByWardId(Integer ward_id) {
		Optional<CovCenWards> obj = covcenwardrepo.findById(ward_id);
		if(!obj.isEmpty()) {
			return obj.get();
		}
		else {
			return null;
		}
	}

	@Override
	public CovCenWards updateCovCenWards(CovCenWards covcenward) {

		return null;
	}

	@Override
	public List<CovCenWards> getAllCovCeWardByWardtype(Integer ward_type_id) {
		CovCenWardType wardtype = new CovCenWardType();
		wardtype.setCov_cen_ward_type_id(ward_type_id);
		return covcenwardrepo.findByCovcenwardtype(wardtype);
	}

}
