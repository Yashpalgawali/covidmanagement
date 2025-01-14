package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Bed;
import com.example.demo.repository.BedRepository;

@Service("bedserv")
public class BedServImpl implements BedService {

	private final BedRepository bedrepo; 
	
	public BedServImpl(BedRepository bedrepo) {
		super();
		this.bedrepo = bedrepo;
	}

	@Override
	public Bed saveBed(Bed bed) {

		return bedrepo.save(bed);
	}

	@Override
	public List<Bed> getAllBeds() {

		return bedrepo.findAll();
	}

	@Override
	public Bed getBedById(Integer id) {
		
		Optional<Bed> bedobj = bedrepo.findById(id);
		if(!bedobj.isEmpty()) {
			return  bedobj.get();
		}
		else {
			return null;	
		}
	}

	@Override
	public Bed updateBed(Bed bed) {

		return null;
	}

	@Override
	public List<Bed> getBedByWardNumber(Integer ward_no) {
		List<Bed> bedlist = this.getAllBeds()
								.stream()
									.filter(beds -> beds.getWard().getWard_id().equals(ward_no))
									.collect(Collectors.toList());
		return bedlist;
	}

}
