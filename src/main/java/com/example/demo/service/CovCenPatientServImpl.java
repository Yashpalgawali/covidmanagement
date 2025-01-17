package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.CovCenDoctor;
import com.example.demo.entity.CovCenPatient;
import com.example.demo.repository.CovCenPatientRepository;

@Service("covcenpatserv")
public class CovCenPatientServImpl implements CovCenPatientService {

	private final CovCenPatientRepository covcenpatrepo;
	
	public CovCenPatientServImpl(CovCenPatientRepository covcenpatrepo) {
		super();
		this.covcenpatrepo = covcenpatrepo;
	}

	@Override
	public CovCenPatient saveCovCenPatient(CovCenPatient patient) {
		// TODO Auto-generated method stub
		return covcenpatrepo.save(patient);
	}

	@Override
	public List<CovCenPatient> getAllCovCenPatients() {
		List<CovCenPatient> patList = covcenpatrepo.findAll();
		patList.stream().forEach(patients -> System.err.println(patients.toString()));
		return patList;
	}

	@Override
	public List<CovCenPatient> getAllCovCenPatientsByDoctorId(Integer doctor_id) {
		CovCenDoctor covcendoc = new CovCenDoctor();
		covcendoc.setCovcendocid(doctor_id);
		return covcenpatrepo.findByCovcendoctor(covcendoc);
	}

 	@Override
	public CovCenPatient updateCovCenPatient(CovCenPatient patient) {
		// TODO Auto-generated method stub
		return null;
	}

}
