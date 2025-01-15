package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Patient;
import com.example.demo.service.PatientService;

@RestController
@RequestMapping("patient")
public class PatientController {

	private final PatientService patientserv;

	public PatientController(PatientService patientserv) {
		super();
		this.patientserv = patientserv;
	}
	
	@PostMapping("/")
	public Patient savePatient(@RequestBody Patient patient) {
		return patientserv.savePatient(patient);
	}
	
	@GetMapping("/")
	public List<Patient> getAllPatients(){
		return patientserv.getAllPatients();
	}
	
	@GetMapping("/doctor/{doc_id}")
	public List<Patient> getAllPatientsByDoctorId(@PathVariable Integer doc_id){
		return patientserv.getAllPatientsByDoctorId(doc_id);
	}
	
	@GetMapping("/department/{dept_id}")
	public List<Patient> getAllPatientsByDepartmentId(@PathVariable Integer dept_id){
		return patientserv.getAllPatientsByDepartmentId(dept_id);
	}
	
	
	@GetMapping("/hospital/{hosp_id}")
	public List<Patient> getAllPatientsByHospitalId(@PathVariable Integer hosp_id){
		return patientserv.getAllPatientsByHospitalId(hosp_id);
	}
	
	@PutMapping("/")
	public Patient updatePatient(@RequestBody Patient patient) {
		return patientserv.updatePatient(patient);
	}
}
