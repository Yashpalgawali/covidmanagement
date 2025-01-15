package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;
import com.example.demo.repository.PatientRepository;

@Service("patientserv")
public class PatientServImpl implements PatientService {

	private final PatientRepository patientrepo; 
	
	public PatientServImpl(PatientRepository patientrepo) {
		super();
		this.patientrepo = patientrepo;
	}

	@Override
	public Patient savePatient(Patient patient) {
		 
		return patientrepo.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		 
		return patientrepo.findAll();
	}

	@Override
	public List<Patient> getAllPatientsByDoctorId(Integer doc_id) {
		Doctor doctor = new Doctor();
		doctor.setDoctor_id(doc_id);
		return patientrepo.findByDoctor(doctor);
 		
	}

	@Override
	public List<Patient> getAllPatientsByDepartmentId(Integer dept_id) {
		List<Patient> patientList = patientrepo.findAll()
					.stream()
					  .filter(patient -> patient.getDoctor().getDepartment().getDept_id().equals(dept_id))
					    .collect(Collectors.toList());
		
		return patientList;
	}

	@Override
	public List<Patient> getAllPatientsByHospitalId(Integer hosp_id) {
		List<Patient> patientList = patientrepo.findAll()
				.stream()
				  .filter(patient -> patient.getDoctor().getDepartment().getHospital().getHosp_id().equals(hosp_id))
				    .collect(Collectors.toList());
	
	return patientList;
	}

	@Override
	public Patient updatePatient(Patient patient) {
		// TODO Auto-generated method stub
		return null;
	}

}
