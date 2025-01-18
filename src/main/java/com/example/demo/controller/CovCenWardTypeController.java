package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CovCenWardType;
import com.example.demo.entity.WardType;
import com.example.demo.service.CovCenWardTypeService;
import com.example.demo.service.WardTypeService;

@RestController
@RequestMapping("covcenwardtype")
public class CovCenWardTypeController {

	private final CovCenWardTypeService wardtypeserv;

	public CovCenWardTypeController(CovCenWardTypeService wardtypeserv) {
		super();
		this.wardtypeserv = wardtypeserv;
	}
	
	@PostMapping("/")
	public CovCenWardType saveWardType(@RequestBody CovCenWardType wardtype) {
	
		return wardtypeserv.saveCovCenWardType(wardtype);
	}
	
	@GetMapping("/")
	public List<CovCenWardType> getAllWardTypes(){
		return wardtypeserv.getAllCovCenWardTypes();
	} 
	
	
	@GetMapping("/{id}")
	public CovCenWardType getWardTypeById(@PathVariable Integer id){
		return wardtypeserv.getCovCenWardTypeById(id);
	} 
	
	@PutMapping("/")
	public CovCenWardType updateWardType(@RequestBody CovCenWardType wardtype) {
		int res = wardtypeserv.updateCovCenWardType(wardtype);
		if(res > 0 ) {
			return this.getWardTypeById(wardtype.getCov_cen_ward_type_id());
		}
		else {
			return null;
		}
	}
	
}
