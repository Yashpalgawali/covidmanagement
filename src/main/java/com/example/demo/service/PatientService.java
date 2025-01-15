package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Patient;

public interface PatientService {
 
	public Patient savePatient(Patient patient);
	
	public List<Patient> getAllPatients();
	
	public List<Patient> getAllPatientsByDoctorId(Integer doc_id);
	
	public List<Patient> getAllPatientsByDepartmentId(Integer dept_id);

	public List<Patient> getAllPatientsByHospitalId(Integer hosp_id);

	public Patient updatePatient(Patient patient);
}
