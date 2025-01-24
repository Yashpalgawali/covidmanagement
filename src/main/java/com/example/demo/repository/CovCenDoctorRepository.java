package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CovCenDepartment;
import com.example.demo.models.CovCenDoctor;

@Repository("covcendocrepo")
public interface CovCenDoctorRepository extends JpaRepository<CovCenDoctor, Integer> {

	//List<CovCenDoctor> findByCovcendoctor_dept(CovCenDepartment covcendoctor_dept);
}
 