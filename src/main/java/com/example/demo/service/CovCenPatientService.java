package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.CovCenPatient;

public interface CovCenPatientService {

	public CovCenPatient saveCovCenPatient(CovCenPatient patient);

	public List<CovCenPatient> getAllCovCenPatients();

	public List<CovCenPatient> getAllCovCenPatientsByDoctorId(Integer doctor_id);

	public CovCenPatient updateCovCenPatient(CovCenPatient patient);
}
