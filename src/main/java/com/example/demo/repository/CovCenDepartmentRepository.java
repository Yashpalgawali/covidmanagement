package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CovCenDepartment;
import com.example.demo.models.CovCenter;

@Repository("covcendeptrepo")
public interface CovCenDepartmentRepository extends JpaRepository<CovCenDepartment, Integer> {

	List<CovCenDepartment> findByCovcenter(CovCenter covcenter);
}
