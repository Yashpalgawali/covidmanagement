package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CovCenBed;
import com.example.demo.repository.CovCenBedRepository;

@Service("covcenbedserv")
public class CovCenBedServImpl implements CovCenBedService {

	private final CovCenBedRepository covcenbedrepo;

	public CovCenBedServImpl(CovCenBedRepository covcenbedrepo) {
		super();
		this.covcenbedrepo = covcenbedrepo;
	}

	@Override
	public CovCenBed saveCovCenBed(CovCenBed covcenbed) {

		return covcenbedrepo.save(covcenbed);
	}

	@Override
	public List<CovCenBed> getAllCovCenBeds() {

		return covcenbedrepo.findAll();
	}

	@Override
	public List<CovCenBed> getAllCovCenBedsByWardId(Integer wardid) {
		List<CovCenBed> bedlist = this.getAllCovCenBeds().stream()
				.filter(beds -> beds.getCovcenward().getCovcenward_id().equals(wardid)).collect(Collectors.toList());
		return bedlist;
	}

	@Override
	public CovCenBed getCovCenBedByBedId(Integer bedid) {
		Optional<CovCenBed> obj = covcenbedrepo.findById(bedid);
		if (!obj.isEmpty()) {
			return obj.get();
		} else {
			return null;
		}
	}

	@Override
	public CovCenBed updateCovCenBed(CovCenBed covcenbed) {
		// TODO Auto-generated method stub
		return null;
	}

}
