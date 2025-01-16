package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CovCenDepartment;
import com.example.demo.entity.CovCenter;

@Repository("covcendeptrepo")
public interface CovCenterDepartmentRepository extends JpaRepository<CovCenDepartment, Integer> {

	
	List<CovCenDepartment> findByCovcenter(CovCenter covcenter);
}
