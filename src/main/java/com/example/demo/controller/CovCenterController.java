package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CovCenter;
import com.example.demo.service.CovCenterService;

@RequestMapping("covcen")
@RestController
public class CovCenterController {

	private final CovCenterService covcenserv;

	public CovCenterController(CovCenterService covcenserv) {
		super();
		this.covcenserv = covcenserv;
	}

	@PostMapping("/")
	public CovCenter saveCovCenter(@RequestBody CovCenter center) {
		return covcenserv.saveCovCenter(center);
	}
	
	
	@GetMapping("/")
	public List<CovCenter> getAllCovCenters() {
		return covcenserv.getAllCovCenters();
	}
	
	
	@GetMapping("/{center_id}")
	public CovCenter getCovCenterById(@PathVariable Integer center_id) {
		return covcenserv.getCovCenterById(center_id);
	}
	
	
}
