package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.Patient;

@Repository("patientrepo")
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	public List<Patient> findByDoctor(Doctor doctor);
}
