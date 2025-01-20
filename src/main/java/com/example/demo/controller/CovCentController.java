package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CovCenter;
import com.example.demo.service.CovCenService;

@RestController
@RequestMapping("covcen")
public class CovCentController {

	private final CovCenService covcenserv;

	public CovCentController(CovCenService covcenserv) {
		super();
		this.covcenserv = covcenserv;
	}

	@PostMapping("/")
	public CovCenter saveCovCenter(@RequestBody CovCenter covcen) {
		return covcenserv.saveCovCenter(covcen);
	}

	@GetMapping("/")
	public List<CovCenter> getAllCovCenters() {
		return covcenserv.getAllCovCenters();
	}

	@GetMapping("/{id}")
	public CovCenter getAllCovCenterById(@PathVariable Integer id) {
		return covcenserv.getCovCenterById(id);
	}

	@PutMapping("/")
	public CovCenter updateCovCenter(@RequestBody CovCenter covcen) {
		return covcenserv.updateCovCenter(covcen);
	}
}
