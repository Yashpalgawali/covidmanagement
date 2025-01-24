package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CovCenWardType;
import com.example.demo.repository.CovCenWardtypeRepository;

@RestController
@RequestMapping("covcenwardtype")
public class CovCenWardTypeController {

	private final CovCenWardtypeRepository covcenwardtyperepo;

	public CovCenWardTypeController(CovCenWardtypeRepository covcenwardtyperepo) {
		super();
		this.covcenwardtyperepo = covcenwardtyperepo;
	}
	
	@PostMapping("/")
	public CovCenWardType saveCovCenWardType(@RequestBody CovCenWardType wardtype) {
		return covcenwardtyperepo.save(wardtype);
	}
	
	@GetMapping("/{id}")
	public CovCenWardType getCovCenWardTypeById(@PathVariable Integer id) {
		return covcenwardtyperepo.findById(id).get();
	}
	
	@GetMapping("/")
	public List<CovCenWardType> getAllCovCenWardTypes() {
		return covcenwardtyperepo.findAll();
	}
}
