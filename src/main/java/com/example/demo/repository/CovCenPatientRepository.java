package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CovCenBed;
import com.example.demo.entity.CovCenDoctor;
import com.example.demo.entity.CovCenPatient;

@Repository("covcenpatrepo")
public interface CovCenPatientRepository extends JpaRepository<CovCenPatient, Integer> {

	List<CovCenPatient> findByCovcenbed(CovCenBed covcenbed);

	List<CovCenPatient> findByCovcendoctor(CovCenDoctor covcendoctor);
}
