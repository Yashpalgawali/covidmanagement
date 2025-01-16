package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CovCenBed;
import com.example.demo.entity.CovCenWards;

@Repository("covcenbedrepo")
public interface CovCenBedRepository extends JpaRepository<CovCenBed, Integer> {

	public List<CovCenBed> findByCovcenward(CovCenWards covcenward);
}
