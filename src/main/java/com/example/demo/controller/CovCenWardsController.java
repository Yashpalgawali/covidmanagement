package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CovCenWards;
import com.example.demo.service.CovCenWardService;

@RestController
@RequestMapping("covcenward")
public class CovCenWardsController {

	private final CovCenWardService covcenwardserv;

	public CovCenWardsController(CovCenWardService covcenwardserv) {
		super();
		this.covcenwardserv = covcenwardserv;
	}
	
	@PostMapping("/")
	public CovCenWards saveCovCenWards(@RequestBody CovCenWards covcenward) {
		return covcenwardserv.saveCovCenWards(covcenward);
	}
	
	@GetMapping("/")
	public List<CovCenWards> getAllCovCenWards() {
		
		List<CovCenWards> wardlist = covcenwardserv.getAllCovCeWards();
		wardlist.stream().forEach(wards -> System.out.println(wards.toString()));
		return wardlist;
	}
	
	@GetMapping("/{ward_id}")
	public CovCenWards getCovCenWardsByWardId(@PathVariable Integer ward_id ) {
		return covcenwardserv.getCovCenWardByWardId(ward_id);
	}
	
	@GetMapping("/wardtype/{ward_type_id}")
	public List<CovCenWards> getAllCovCenWardsByWardtype(@PathVariable Integer ward_type_id) {
		
		return covcenwardserv.getAllCovCeWardByWardtype(ward_type_id); 
	}
}

