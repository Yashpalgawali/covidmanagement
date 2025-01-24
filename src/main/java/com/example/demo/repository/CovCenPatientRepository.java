package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CovCenPatient;

@Repository("covcenpatrepo")
public interface CovCenPatientRepository extends JpaRepository<CovCenPatient, Integer> {

}
