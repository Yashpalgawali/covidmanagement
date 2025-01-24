package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.CovCenPatient;
import com.example.demo.repository.CovCenPatientRepository;

@RestController
@RequestMapping("covcenpatient")
public class CovCenPatientController {

	private final CovCenPatientRepository covcenpatrepo;

	public CovCenPatientController(CovCenPatientRepository covcenpatrepo) {
		super();
		this.covcenpatrepo = covcenpatrepo;
	}
	
	@PostMapping("/")
	public CovCenPatient saveCovCenPatient(@RequestBody CovCenPatient patient)
	{
		return covcenpatrepo.save(patient);
	}
	
	@GetMapping("/")
	public List<CovCenPatient> getALlCovCenPatients(){
		return covcenpatrepo.findAll();
	}
	
	@GetMapping("/{pat_id}")
	public CovCenPatient getCovCenPatientById(@PathVariable Integer pat_id){
		return covcenpatrepo.findById(pat_id).get();
	}
	
}
