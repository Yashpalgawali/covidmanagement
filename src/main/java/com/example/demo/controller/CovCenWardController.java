package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CovCenWard;
import com.example.demo.repository.CovCenWardRepository;

@RestController
@RequestMapping("covcenward")
public class CovCenWardController {

	private final CovCenWardRepository covcenwardrepo;

	public CovCenWardController(CovCenWardRepository covcenwardrepo) {
		super();
		this.covcenwardrepo = covcenwardrepo;
	}

	@PostMapping("/")
	public CovCenWard saveCovCenWard(@RequestBody CovCenWard ward) {
		return covcenwardrepo.save(ward);
	}
	
	@GetMapping("/{id}")
	public CovCenWard getCovCenWardById(@PathVariable Integer id) {
		return covcenwardrepo.findById(id).get();
	}
	
	@GetMapping("/")
	public List<CovCenWard> getAllCovCenWards() {
		return covcenwardrepo.findAll();
	}
}
