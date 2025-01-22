package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CovCenPatient;
import com.example.demo.service.CovCenPatientService;

@RestController
@RequestMapping("covcenpatient")
public class CovCenPatientController {

	private final CovCenPatientService covcenpatserv;

	public CovCenPatientController(CovCenPatientService covcenpatserv) {
		super();
		this.covcenpatserv = covcenpatserv;
	}
	
	@PostMapping("/")
	public CovCenPatient saveCovCenPatient(@RequestBody CovCenPatient patient) {
	
		System.err.println("patient object "+patient.toString());
		return null;
//		return covcenpatserv.saveCovCenPatient(patient);
	}
	
	@GetMapping("/")
	public List<CovCenPatient> getAllCovCenPatients() {
		return covcenpatserv.getAllCovCenPatients();
	}
	
	@GetMapping("/covcendoctor/{doctor_id}")
	public List<CovCenPatient> getAllCovCenPatientsByDoctor(@PathVariable Integer doctor_id) {
		return covcenpatserv.getAllCovCenPatientsByDoctorId(doctor_id);
	}
	
	@PutMapping("/")
	public CovCenPatient updateCovCenPatient(@RequestBody CovCenPatient patient) {
		
		return covcenpatserv.updateCovCenPatient(patient);
	}
}
