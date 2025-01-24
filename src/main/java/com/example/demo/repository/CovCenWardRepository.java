package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CovCenDepartment;
import com.example.demo.models.CovCenWard;

@Repository("covcenwardrepo")
public interface CovCenWardRepository extends JpaRepository<CovCenWard, Integer> {

	List<CovCenWard> findByCovcenwarddept(CovCenDepartment covcenwarddept);
}
