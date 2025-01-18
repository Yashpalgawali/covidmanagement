package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.CovCenWardType;

@Repository("covcenwardtyperepo")
public interface CovCenWardTypeRepository extends JpaRepository<CovCenWardType, Integer> {

	@Modifying
	@Transactional
	@Query("UPDATE CovCenWardType w SET w.cov_cen_ward_type=:name WHERE w.cov_cen_ward_type_id=:id")
	public int updateWardTypeById(Integer id, String name);

}
