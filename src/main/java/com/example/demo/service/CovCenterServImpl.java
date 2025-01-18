package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CovCenter;
import com.example.demo.repository.CoveCenterRepository;

@Service("covcenserv")
public class CovCenterServImpl implements CovCenService {

	private final CoveCenterRepository covcenrepo;
	
	public CovCenterServImpl(CoveCenterRepository covcenrepo) {
		super();
		this.covcenrepo = covcenrepo;
	}

	@Override
	public CovCenter saveCovCenter(CovCenter covcen) {
		// TODO Auto-generated method stub
		return covcenrepo.save(covcen);
	}

	@Override
	public List<CovCenter> getAllCovCenters() {
		// TODO Auto-generated method stub
		return covcenrepo.findAll();
	}

	@Override
	public CovCenter getCovCenterById(Integer id) {
		
		Optional<CovCenter> covcenobj = covcenrepo.findById(id);
		if(!covcenobj.isEmpty()) {
			return covcenobj.get();
		}
		else {
			return null;
		}
	}

	@Override
	
	public CovCenter updateCovCenter(CovCenter covcen) {
		int res = covcenrepo.updateCovidCenter(covcen.getCovcen_id(), covcen.getCovcennum());
		if(res > 0) {
			return this.getCovCenterById(covcen.getCovcen_id());
		}
		else {
			return null;
		}
	}

}
