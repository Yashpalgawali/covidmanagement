package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.CovCenter;

@Repository("covcenrepo")
public interface CovCenterRepository extends JpaRepository<CovCenter, Integer> {

	
}
