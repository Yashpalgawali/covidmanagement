package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CovCenWardType;
import com.example.demo.entity.CovCenWards;

@Repository("covcenwardrepo")
public interface CovCenWardRepository extends JpaRepository<CovCenWards, Integer> {

	public List<CovCenWards> findByCovcenwardtype(CovCenWardType covcenwardtype);
}
