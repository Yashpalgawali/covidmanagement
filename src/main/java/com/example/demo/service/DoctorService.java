package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Doctor;

public interface DoctorService {

	public Doctor saveDoctor(Doctor doctor);
	public Doctor getDoctorbyDoctorId(Integer doc_id);
	public List<Doctor> getAllDoctors();
	public Doctor updateDoctor(Doctor doctor);
	
	public List<Doctor> getAllDoctorsByDepartmentId(Integer dept_id);
}
