package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CovCenBed;
import com.example.demo.repository.CovCenBedRepository;

@RestController
@RequestMapping("covcenbed")
public class CovCenBedController {

	private final CovCenBedRepository covcenbedrepo;

	public CovCenBedController(CovCenBedRepository covcenbedrepo) {
		super();
		this.covcenbedrepo = covcenbedrepo;
	}
	
	@PostMapping("/")
	public CovCenBed saveCovCenBed(@RequestBody CovCenBed bed) {
		return covcenbedrepo.save(bed);
	}
	
	@GetMapping("/")
	public List<CovCenBed> getAllCovCenBeds(){
		return covcenbedrepo.findAll();
	}
	
	@GetMapping("/{id}")
	public CovCenBed getCovCenBed(@PathVariable Integer id) {
		return covcenbedrepo.findById(id).get();
	}
	
}
