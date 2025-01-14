package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;
import com.example.demo.service.DoctorService;

@RestController
@RequestMapping("doctor")
public class DoctorController {

	private final DoctorService docserv;

	public DoctorController(DoctorService docserv) {
		super();
		this.docserv = docserv;
	}
	
	@PostMapping("/")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return	docserv.saveDoctor(doctor);
	}
	
	@GetMapping("/")
	public List<Doctor> getAllDoctors() {
		return docserv.getAllDoctors();
	}
	
	@GetMapping("/department/{dept_id}")
	public List<Doctor> getAllDoctorsByDeptId(@PathVariable Integer dept_id) {
		return docserv.getAllDoctorsByDepartmentId(dept_id);
	}
	
	@GetMapping("/{doc_id}")
	public Doctor getDoctorByDoctorId(@PathVariable Integer doc_id) {
		return docserv.getDoctorbyDoctorId(doc_id);
	}
	
	
	@PutMapping("/")
	public Doctor updateDoctor(@RequestBody Doctor doctor) {
		return	docserv.updateDoctor(doctor);
	}
}
