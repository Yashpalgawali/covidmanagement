package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CovCenWardType;
import com.example.demo.repository.CovCenWardTypeRepository;

@Service("covcenwardtypeserv")
public class CovCenWardTypeServImpl implements CovCenWardTypeService {

	private final CovCenWardTypeRepository wardtyperepo;
	
	public CovCenWardTypeServImpl(CovCenWardTypeRepository wardtyperepo) {
		super();
		this.wardtyperepo = wardtyperepo;
	}

	@Override
	public CovCenWardType saveCovCenWardType(CovCenWardType wardtype) {
		
		return wardtyperepo.save(wardtype);
		
	}

	@Override
	public List<CovCenWardType> getAllCovCenWardTypes() {
		
		return wardtyperepo.findAll();
	}

	@Override
	public CovCenWardType getCovCenWardTypeById(Integer id) {
		Optional<CovCenWardType> wardtypeobj = wardtyperepo.findById(id);
		if(!wardtypeobj.isEmpty())
		{
			return wardtypeobj.get();
		}
		else {
			return null;
		}
	}

	@Override
	public int updateCovCenWardType(CovCenWardType wardtype) {
		
		return wardtyperepo.updateWardTypeById(wardtype.getCov_cen_ward_type_id(), wardtype.getCov_cen_ward_type());
	}

}
