package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.WardType;
import com.example.demo.service.WardTypeService;

@RestController
@RequestMapping("wardtype")
public class WardTypeController {

	private final WardTypeService wardtypeserv;

	public WardTypeController(WardTypeService wardtypeserv) {
		super();
		this.wardtypeserv = wardtypeserv;
	}
	
	@PostMapping("/")
	public WardType saveWardType(@RequestBody WardType wardtype) {
	
		return wardtypeserv.saveWardType(wardtype);
	}
	
	@GetMapping("/")
	public List<WardType> getAllWardTypes(){
		return wardtypeserv.getAllWardTypes();
	} 
	
	
	@GetMapping("/{id}")
	public WardType getWardTypeById(@PathVariable Integer id){
		return wardtypeserv.getWardTypeById(id);
	} 
	
	@PutMapping("/")
	public WardType updateWardType(@RequestBody WardType wardtype) {
	
		return wardtypeserv.saveWardType(wardtype);
	}
	
}
