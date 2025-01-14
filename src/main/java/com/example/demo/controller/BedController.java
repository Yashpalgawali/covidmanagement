package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Bed;
import com.example.demo.service.BedService;

@RestController
@RequestMapping("bed")
public class BedController {

	private final BedService bedserv;

	public BedController(BedService bedserv) {
		super();
		this.bedserv = bedserv;
	}
	
	@PostMapping("/")
	public Bed saveBed(@RequestBody Bed bed) {
		return bedserv.saveBed(bed);
	}
	
	@GetMapping("/")
	public List<Bed> getAllBeds(){
		return bedserv.getAllBeds();
	}
	
	@GetMapping("/{ward_id}")
	public List<Bed> getAllBedsByWardId(@PathVariable Integer ward_id){
		return bedserv.getBedByWardNumber(ward_id);
	}
	
	@PutMapping("/")
	public Bed updateBed(@RequestBody Bed bed) {
		return bedserv.updateBed(bed);
	}
}
