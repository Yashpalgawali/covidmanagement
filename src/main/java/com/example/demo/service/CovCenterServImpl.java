package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.models.CovCenter;
import com.example.demo.repository.CovCenterRepository;

@Service("covcenserv")
public class CovCenterServImpl implements CovCenterService {

	private final CovCenterRepository covcenrepo;
	
	public CovCenterServImpl(CovCenterRepository covcenrepo) {
		super();
		this.covcenrepo = covcenrepo;
	}

	@Override
	public CovCenter saveCovCenter(CovCenter center) {
		// TODO Auto-generated method stub
		return covcenrepo.save(center);
	}

	@Override
	public List<CovCenter> getAllCovCenters() {
	
		return covcenrepo.findAll();
	}

	@Override
	public CovCenter getCovCenterById(Integer centerid) {
	
		return covcenrepo.findById(centerid).get();
	}

}
