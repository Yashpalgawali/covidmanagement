package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CovCenBed;
import com.example.demo.service.CovCenBedService;

@RestController
@RequestMapping("covcenbed")
public class CovCenBedController {

	private final CovCenBedService covcenbedserv;

	public CovCenBedController(CovCenBedService covcenbedserv) {
		super();
		this.covcenbedserv = covcenbedserv;
	}
	
	@PostMapping("/")
	public CovCenBed saveCovCenBed(@RequestBody CovCenBed covcenbed) {
		
		System.err.println(covcenbed.toString());
		
		return covcenbedserv.saveCovCenBed(covcenbed);
	}
	
	@GetMapping("/")
	public List<CovCenBed> getAllCovCenBeds(){
		List<CovCenBed> bedlist = covcenbedserv.getAllCovCenBeds();
		bedlist.stream().forEach(beds -> System.out.println(beds.toString()));
		return bedlist;
	}
	
	@GetMapping("/covcenward/{wardid}")
	public List<CovCenBed> getAllCovCenBedsByWardId(@PathVariable Integer wardid){
		return covcenbedserv.getAllCovCenBedsByWardId(wardid);
	}
	
	
	@GetMapping("/{bedid}")
	public CovCenBed getCovCenBedById(@PathVariable Integer bedid) {
		return covcenbedserv.getCovCenBedByBedId(bedid);
	}
	
	@PutMapping("/")
	public CovCenBed updateCovCenBed(@RequestBody CovCenBed covcenbed) {
		return covcenbedserv.updateCovCenBed(covcenbed);
	}
}
