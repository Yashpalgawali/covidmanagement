package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.entity.WardType;
import com.example.demo.repository.WardTypeRepository;

@Service("wardtypeserv")
public class WardTypeServImpl implements WardTypeService {

	private final WardTypeRepository wardtyperepo;
	
	public WardTypeServImpl(WardTypeRepository wardtyperepo) {
		super();
		this.wardtyperepo = wardtyperepo;
	}

	@Override
	public WardType saveWardType(WardType wardtype) {
		
		return wardtyperepo.save(wardtype);
		
	}

	@Override
	public List<WardType> getAllWardTypes() {
		
		return wardtyperepo.findAll();
	}

	@Override
	public WardType getWardTypeById(Integer id) {
		Optional<WardType> wardtypeobj = wardtyperepo.findById(id);
		if(!wardtypeobj.isEmpty())
		{
			return wardtypeobj.get();
		}
		else {
			return null;
		}
	}

	@Override
	public int updateWardType(WardType wardtype) {
		 
		return 0;
	}

}
